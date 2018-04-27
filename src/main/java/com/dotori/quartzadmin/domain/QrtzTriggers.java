package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Table(name = "QRTZ_TRIGGERS")
public class QrtzTriggers {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private String jobName;
    private String jobGroup;
    private String description;
    private Long nextFireTime;
    private Long prevFireTime;
    private Long priority;
    private String triggerState;
    private String triggerType;
    private Long startTime;
    private Long endTime;
    private String calendarName;
    private Long misfireInstr;
    private String jobData;
}
