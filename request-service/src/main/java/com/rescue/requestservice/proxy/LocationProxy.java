package com.rescue.requestservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="location-service", url="localhost:6060")
public interface LocationProxy {
    @GetMapping("/")
    public Boolean retrieveisLocationWorking();

}
