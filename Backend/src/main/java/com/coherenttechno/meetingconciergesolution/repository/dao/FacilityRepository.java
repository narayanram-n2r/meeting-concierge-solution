package com.coherenttechno.meetingconciergesolution.repository.dao;

import com.coherenttechno.meetingconciergesolution.repository.model.FacilityMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @created 29/06/2020 - 11:30 AM
 * @project meeting-concierge-solution
 * @author n2r(Narayan Ram Narayanan)
 */

@Repository
public interface FacilityRepository extends JpaRepository<FacilityMasterEntity, Integer> {
}
