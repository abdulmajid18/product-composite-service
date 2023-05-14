package com.rozz.api.composite.util;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    private static final Logger  LOG =LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);

//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(NotFoundException.class)
//    public @ResponseBody HttpErrorInfo
}
