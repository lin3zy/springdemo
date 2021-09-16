package com.lzy.springdemo.common.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Around("@within(org.springframework.web.bind.annotation.RestController)")
    public Object apiLog(ProceedingJoinPoint joinPoint) throws Throwable {
        String method = joinPoint.getSignature().toShortString();
        long startTTime = System.currentTimeMillis();
        Object[] args = joinPoint.getArgs();
        logger.info("start method:[{}], params {}", method, args);
        Object object = joinPoint.proceed();
        logger.info("end method:[{}], params {}, response {}, cost {} millions", method, args, this.toJsonString(object), System.currentTimeMillis() - startTTime);
        return object;
    }

    public String toJsonString(Object object) {
        return JSON.toJSONString(object);
    }
}
