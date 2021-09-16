package com.lzy.springdemo.common.handler;

import com.lzy.springdemo.common.exception.BusinessException;
import com.lzy.springdemo.common.model.Result;

public class BaseExceptionHandler {
    public Result handlerBusinessException(BusinessException businessException) {
        return Result.Failure(-1,businessException.getMessage());
    }

    public Result handlerOtherException(Throwable throwable) {
        return Result.Failure(-1, throwable.getMessage());
    }
}
