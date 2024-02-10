package com.nfyc.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
@EnableEurekaServer
public class NfycEurekaServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(NfycEurekaServiceApplication.class, args);
  }
}
