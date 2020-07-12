package com.coherenttechno.meetingconciergesolution.repository.dao;

/*
 * @created 29/06/2020 - 11:30 AM
 * @project meeting-concierge-solution
 * @author n2r(Narayan Ram Narayanan)
 */

import com.coherenttechno.meetingconciergesolution.repository.model.TransactionMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionMasterEntity, String> {
}
