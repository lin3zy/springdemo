package com.lzy.springdemo.common.handler;

import com.lzy.springdemo.common.exception.BusinessException;
import com.lzy.springdemo.common.model.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends BaseExceptionHandler {
    @Override
    @ExceptionHandler(BusinessException.class)
    public Result handlerBusinessException(BusinessException businessException) {
        return super.handlerBusinessException(businessException);
    }

    @Override
    @ExceptionHandler(Throwable.class)
    public Result handlerOtherException(Throwable throwable) {
        return super.handlerOtherException(throwable);
    }
}
