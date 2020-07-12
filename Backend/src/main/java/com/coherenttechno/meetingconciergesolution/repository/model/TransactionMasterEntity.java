package com.coherenttechno.meetingconciergesolution.repository.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TransactionMaster", schema = "meeting-concierge-solution")
public class TransactionMasterEntity {
    private String transactionId;
    private Timestamp startTime;
    private Timestamp endTime;
    private String bookingStatus;
    private Timestamp createdAt;
    private Timestamp lastUpdatedAt;
    private UserMasterEntity userMasterByUserId;
    private FacilityMasterEntity facilityMasterByRoomId;

    @Id
    @Column(name = "transactionId", nullable = false, length = 15)
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Basic
    @Column(name = "startTime", nullable = false)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "endTime", nullable = false)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "bookingStatus", nullable = false, length = 20)
    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Basic
    @Column(name = "createdAt", nullable = false)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "lastUpdatedAt", nullable = true)
    public Timestamp getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Timestamp lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionMasterEntity that = (TransactionMasterEntity) o;
        return Objects.equals(transactionId, that.transactionId) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(bookingStatus, that.bookingStatus) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(lastUpdatedAt, that.lastUpdatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, startTime, endTime, bookingStatus, createdAt, lastUpdatedAt);
    }

    @ManyToOne
    @JoinColumn(name = "roomId", referencedColumnName = "roomId", nullable = false)
    public FacilityMasterEntity getFacilityMasterByRoomId() {
        return facilityMasterByRoomId;
    }

    public void setFacilityMasterByRoomId(FacilityMasterEntity facilityMasterByRoomId) {
        this.facilityMasterByRoomId = facilityMasterByRoomId;
    }

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId", nullable = false)
    public UserMasterEntity getUserMasterByUserId() {
        return userMasterByUserId;
    }

    public void setUserMasterByUserId(UserMasterEntity userMasterByUserId) {
        this.userMasterByUserId = userMasterByUserId;
    }
}
