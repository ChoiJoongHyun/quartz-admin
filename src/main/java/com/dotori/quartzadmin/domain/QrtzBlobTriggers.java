package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Table(name = "QRTZ_BLOB_TRIGGERS")
public class QrtzBlobTriggers {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private String blobData;
}
