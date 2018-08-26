/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-04-27
 */
package com.dotori.quartzadmin.repository;


import com.dotori.quartzadmin.domain.QrtzTriggers;
import com.dotori.quartzadmin.domain.TriggerId;
import com.dotori.quartzadmin.domain.TriggerType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QrtzTriggersRepository extends JpaRepository<QrtzTriggers, TriggerId> {


    List<QrtzTriggers> findByTriggerType(TriggerType triggerType);




}