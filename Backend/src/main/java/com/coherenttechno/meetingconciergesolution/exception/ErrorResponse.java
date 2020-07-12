package com.coherenttechno.meetingconciergesolution.exception;

import java.sql.Timestamp;

/*
 * @created 10/07/2020 - 10:08 PM
 * @project meeting-concierge-solution
 * @author n2r(Narayan Ram Narayanan)
 */

/**
 * The type Error response.
 */
public class ErrorResponse {
    private String errorDetails;
    private Timestamp timeStamp;
    private int status;

    /**
     * Instantiates a new Error response.
     *
     * @param status       the status
     * @param errorDetails the error details
     * @param timeStamp    the time stamp
     */
    public ErrorResponse(int status, String errorDetails, Timestamp timeStamp) {
        super();
        this.status = status;
        this.errorDetails = errorDetails;
        this.timeStamp = timeStamp;
    }

    /**
     * Instantiates a new Error response.
     */
    public ErrorResponse() {
    }

    /**
     * Gets error details.
     *
     * @return the error details
     */
    public String getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets error details.
     *
     * @param errorDetails the error details
     */
    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * Gets time stamp.
     *
     * @return the time stamp
     */
    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets time stamp.
     *
     * @param timeStamp the time stamp
     */
    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * Gets error code.
     *
     * @return the error code
     */
    public int getErrorCode() {
        return status;
    }

    /**
     * Sets error code.
     *
     * @param status the status
     */
    public void setErrorCode(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ErrorResponse [errorDetails=" + errorDetails + ", timeStamp=" + timeStamp + ", status=" + status + "]";
    }
}
