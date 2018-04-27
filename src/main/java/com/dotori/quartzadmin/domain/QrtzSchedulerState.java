/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-04-27
 */
package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "QRTZ_SCHEDULER_STATE")
public class QrtzSchedulerState implements Serializable {

    @EmbeddedId
    private SchedulerStateId id;

    @Column(name = "LAST_CHECKIN_TIME")
    private Long lastCheckinTime;

    @Column(name = "CHECKIN_INTERVAL")
    private Long checkinInterval;
}
