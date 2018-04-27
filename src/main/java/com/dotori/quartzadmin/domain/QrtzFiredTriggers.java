package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Table(name = "QRTZ_FIRED_TRIGGERS")
public class QrtzFiredTriggers {
    private String schedName;
    private String entryId;
    private String triggerName;
    private String triggerGroup;
    private String instanceName;
    private Long firedTime;
    private Long schedTime;
    private Long priority;
    private String state;
    private String jobName;
    private String jobGroup;
    private String isNonconcurrent;
    private String requestsRecovery;
}
