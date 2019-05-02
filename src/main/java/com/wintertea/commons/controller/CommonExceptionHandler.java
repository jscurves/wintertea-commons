package com.wintertea.commons.controller;

import com.wintertea.commons.bean.ResultEntity;
import com.wintertea.commons.exception.WinterTeaException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResultEntity exceptionHandler(Exception exception) {
        ResultEntity result = new ResultEntity();
        result.setCode(500);
        result.setMessage(exception.getMessage());
        return result;
    }


    @ExceptionHandler(WinterTeaException.class)
    public ResultEntity exceptionHandler(WinterTeaException winterTeaException){
        ResultEntity result = new ResultEntity();
        result.setCode(winterTeaException.getCode());
        result.setMessage(winterTeaException.getMessage());
        return result;
    }

}
