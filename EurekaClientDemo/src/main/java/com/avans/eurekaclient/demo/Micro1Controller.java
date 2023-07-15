package com.avans.eurekaclient.demo;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("micro1")
public class Micro1Controller {
   @Autowired
   DiscoveryClient discoveryClient;
   
   @Autowired
   RestTemplate restTemplate;
   
   
   @RequestMapping("name")  //step 1 : connect to micro2
   public String getMicroserviceName()
   {
      List<ServiceInstance> list =
                             discoveryClient.getInstances("Micro2");
      ServiceInstance service2 = list.get(0);
      URI micro2URI = service2.getUri();
      String micro2Response = new
                       RestTemplate().postForObject(micro2URI +
                       "/micro2/name", null, String.class);
      return "micro1 : " + micro2Response;
   }
   
   @GetMapping("/getmicro2")
   public String getMicro2Instance() //step 2 : Loadbalancing when more than one instance of micro2 present
   {
       String url = "http://Micro2/micro2/name";
       String micro2Response = "Currently hitting instance running on port: "
                   + restTemplate.getForObject(url, String.class);
       return "micro1" + ":" + micro2Response;
   }
}