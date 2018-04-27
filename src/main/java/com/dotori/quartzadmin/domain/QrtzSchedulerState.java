package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Table(name = "QRTZ_SCHEDULER_STATE")
public class QrtzSchedulerState {
    private String schedName;
    private String instanceName;
    private Long lastCheckinTime;
    private Long checkinInterval;
}
