package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Table(name = "QRTZ_PAUSED_TRIGGER_GRPS")
public class QrtzPausedTriggerGrps {
    private String schedName;
    private String triggerGroup;
}
