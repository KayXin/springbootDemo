package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class DemoExceptionHandler {

        /**
  * 捕获全局异常
  * @return
  */
        @ExceptionHandler(RuntimeException.class)
@ResponseBody
public HashMap<String,Object> exceptionHandler(){
HashMap<String,Object> result=new HashMap<String, Object>();
result.put("errorCode", "500");
result.put("errorMsg","系统错误");
return result;
}
}