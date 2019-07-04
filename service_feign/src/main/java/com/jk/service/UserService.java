package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

//消费者使用feign与ribbon调取服务的区别
@FeignClient(value = "service-hi2",fallback = UserServiceImpl.class)
public interface UserService extends UserService2{
}
