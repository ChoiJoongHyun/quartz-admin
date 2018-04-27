package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Table(name = "QRTZ_SIMPLE_TRIGGERS")
public class QrtzSimpleTriggers {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private Long repeatCount;
    private Long repeatInterval;
    private Long timesTriggered;
}
