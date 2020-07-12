package com.coherenttechno.meetingconciergesolution.repository.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "FacilityMaster", schema = "meeting-concierge-solution")
public class FacilityMasterEntity {
    private int roomId;
    private String roomName;
    private String roomType;
    private Integer roomCapacity;
    private byte isProjectorAvailable;
    private String towerName;
    private String floorNumber;
    private Timestamp createdAt;
    private Timestamp lastUpdatedAt;

    @Id
    @Column(name = "roomId", nullable = false)
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Basic
    @Column(name = "roomName", nullable = false, length = 45)
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Basic
    @Column(name = "roomType", nullable = false, length = 30)
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Basic
    @Column(name = "roomCapacity", nullable = true)
    public Integer getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    @Basic
    @Column(name = "isProjectorAvailable", nullable = false)
    public byte getIsProjectorAvailable() {
        return isProjectorAvailable;
    }

    public void setIsProjectorAvailable(byte isProjectorAvailable) {
        this.isProjectorAvailable = isProjectorAvailable;
    }

    @Basic
    @Column(name = "towerName", nullable = false, length = 45)
    public String getTowerName() {
        return towerName;
    }

    public void setTowerName(String towerName) {
        this.towerName = towerName;
    }

    @Basic
    @Column(name = "floorNumber", nullable = false, length = 20)
    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
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
        FacilityMasterEntity that = (FacilityMasterEntity) o;
        return roomId == that.roomId &&
                isProjectorAvailable == that.isProjectorAvailable &&
                Objects.equals(roomName, that.roomName) &&
                Objects.equals(roomType, that.roomType) &&
                Objects.equals(roomCapacity, that.roomCapacity) &&
                Objects.equals(towerName, that.towerName) &&
                Objects.equals(floorNumber, that.floorNumber) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(lastUpdatedAt, that.lastUpdatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, roomName, roomType, roomCapacity, isProjectorAvailable, towerName, floorNumber, createdAt, lastUpdatedAt);
    }
}
