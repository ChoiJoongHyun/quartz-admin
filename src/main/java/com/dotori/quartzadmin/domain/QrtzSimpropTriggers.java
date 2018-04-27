package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Table(name = "QRTZ_SIMPROP_TRIGGERS")
public class QrtzSimpropTriggers {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private String strProp1;
    private String strProp2;
    private String strProp3;
    private Long intProp1;
    private Long intProp2;
    private Long longProp1;
    private Long longProp2;
    private Double decProp1;
    private Double decProp2;
    private String boolProp1;
    private String boolProp2;
}
