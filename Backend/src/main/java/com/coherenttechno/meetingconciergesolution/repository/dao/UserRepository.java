package com.coherenttechno.meetingconciergesolution.repository.dao;

import com.coherenttechno.meetingconciergesolution.repository.model.UserMasterEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/*
 * @created 29/06/2020 - 11:28 AM
 * @project meeting-concierge-solution
 * @author n2r(Narayan Ram Narayanan)
 */

@Repository
public interface UserRepository extends JpaRepository<UserMasterEntity, Integer>{

    public UserMasterEntity findByUserId(int userId);

    public UserMasterEntity findByEmail(String email);

    public UserMasterEntity findByRole(String userRole);

    public UserMasterEntity findByFirstName(String firstName);

    @Transactional
    @Modifying
    @Query("UPDATE UserMasterEntity u SET u.userId = ?1, u.firstName = ?2, u.lastName = ?3, u.middleName = ?4, u.email = ?5, u.passwordHash = ?6, u.userRole = ?7 WHERE u.userId = ?1")
    public int updateUser(int userId, String firstName, String lastName, String middleName, String email, String passwordHash, String userRole);
}
