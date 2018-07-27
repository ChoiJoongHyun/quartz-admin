/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-04-27
 */
package com.dotori.quartzadmin.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "QRTZ_TRIGGERS")
public class QrtzTriggers implements Serializable {

    @EmbeddedId
    private TriggerId id;

    @Column(name = "JOB_NAME")
    private String jobName;

    @Column(name = "JOB_GROUP")
    private String jobGroup;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "NEXT_FIRE_TIME")
    private Long nextFireTime;

    @Column(name = "PREV_FIRE_TIME")
    private Long prevFireTime;

    @Column(name = "PRIORITY")
    private Long priority;

    @Column(name = "TRIGGER_STATE")
    private String triggerState;

    @Column(name = "TRIGGER_TYPE")
    private String triggerType;

    @Column(name = "START_TIME")
    private Long startTime;

    @Column(name = "END_TIME")
    private Long endTime;

    @Column(name = "CALENDAR_NAME")
    private String calendarName;

    @Column(name = "MISFIRE_INSTR")
    private Long misfireInstr;

    @Column(name = "JOB_DATA")
    private String jobData;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "trigger")
    private List<QrtzCronTriggers> cronTriggersList;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "trigger")
    private List<QrtzSimpleTriggers> simpleTriggersList;
}
