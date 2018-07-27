/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-27
 */

package com.dotori.quartzadmin.repository;

import com.dotori.quartzadmin.domain.QrtzSimpleTriggers;
import com.dotori.quartzadmin.domain.TriggerId;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QrtzSimpleTriggersRepository extends JpaRepository<QrtzSimpleTriggers, TriggerId> {

    @EntityGraph(value = "QRTZ_SIMPLE_TRIGGERS.FETCH.QRTZ_TRIGGERS" , type=EntityGraph.EntityGraphType.FETCH)
    List<QrtzSimpleTriggers> findAll();
}
