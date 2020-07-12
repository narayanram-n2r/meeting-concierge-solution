package com.coherenttechno.meetingconciergesolution.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
 * @created 10/07/2020 - 10:09 PM
 * @project meeting-concierge-solution
 * @author n2r(Narayan Ram Narayanan)
 */

/**
 * The type Entity not found exception.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Entity not found exception.
     *
     * @param errorMessage the error message
     */
    public EntityNotFoundException(String errorMessage) {
        super (errorMessage + " at ");
    }
}
