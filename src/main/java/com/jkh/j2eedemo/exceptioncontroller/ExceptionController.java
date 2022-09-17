package com.jkh.j2eedemo.exceptioncontroller;

import com.jkh.j2eedemo.entity.KesunReturn;
import com.jkh.j2eedemo.exception.NoTokenException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
@ExceptionHandler(value={com.jkh.j2eedemo.exception.NoTokenException.class})
    public KesunReturn notokenexceptionhandler(){
    System.out.println("554545435345435435435435435");
    KesunReturn kesunReturn = new KesunReturn();
    kesunReturn.setCode("501");
    kesunReturn.setMessage("Token失效,请重新登录");
    return kesunReturn;
}
}
