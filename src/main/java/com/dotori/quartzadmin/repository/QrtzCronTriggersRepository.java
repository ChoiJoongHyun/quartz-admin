/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-27
 */
package com.dotori.quartzadmin.repository;

import com.dotori.quartzadmin.domain.QrtzCronTriggers;
import com.dotori.quartzadmin.domain.TriggerId;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QrtzCronTriggersRepository extends JpaRepository<QrtzCronTriggers, TriggerId> {

    @EntityGraph(value = "QRTZ_CRON_TRIGGERS.FETCH.QRTZ_TRIGGERS" , type=EntityGraph.EntityGraphType.FETCH)
    List<QrtzCronTriggers> findAll();

    @EntityGraph(value = "QRTZ_CRON_TRIGGERS.FETCH.QRTZ_TRIGGERS" , type=EntityGraph.EntityGraphType.FETCH)
    List<QrtzCronTriggers> findByTrigger_JobGroup(String jobGroup);
}
