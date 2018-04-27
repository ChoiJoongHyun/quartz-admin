package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Table(name = "QRTZ_CRON_TRIGGERS")
public class QrtzCronTriggers {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private String cronExpression;
    private String timeZoneId;
}
