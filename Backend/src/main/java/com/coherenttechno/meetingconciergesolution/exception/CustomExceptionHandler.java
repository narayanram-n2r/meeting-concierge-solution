package com.coherenttechno.meetingconciergesolution.exception;


import java.sql.Timestamp;
import java.util.Calendar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/*
 * @created 10/07/2020 - 10:06 PM
 * @project meeting-concierge-solution
 * @author n2r(Narayan Ram Narayanan)
 */

/**
 * The type Custom exception handler.
 */
@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
    /**
     * General exceptions response entity.
     *
     * @param exp     the exp
     * @param request the request
     * @return the response entity
     */
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> generalExceptions(Exception exp, WebRequest request) {
        ErrorResponse error = new ErrorResponse(500, "Internal Server Error caused at " +request.getDescription(false), new Timestamp(Calendar.getInstance().getTimeInMillis()));
        return new ResponseEntity<Object>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Handle entity not found exception response entity.
     *
     * @param exp     the exp
     * @param request the request
     * @return the response entity
     */
    @ExceptionHandler(EntityNotFoundException.class)
    public final ResponseEntity<Object> handleEntityNotFoundException (EntityNotFoundException exp, WebRequest request) {
        ErrorResponse error = new ErrorResponse(404, exp.getMessage()+request.getDescription(false), new Timestamp(Calendar.getInstance().getTimeInMillis()));
        return new ResponseEntity<Object>(error, HttpStatus.NOT_FOUND);
    }

    /**
     * Handle method invalid argument response entity.
     *
     * @param exp     the exp
     * @param request the request
     * @return the response entity
     */
    public ResponseEntity<Object> handleMethodInvalidArgument(MethodArgumentNotValidException exp, WebRequest request) {
        ErrorResponse error = new ErrorResponse(400, exp.getBindingResult().toString(), new Timestamp(Calendar.getInstance().getTimeInMillis()));
        return new ResponseEntity<Object>(error, HttpStatus.BAD_REQUEST);
    }
}
