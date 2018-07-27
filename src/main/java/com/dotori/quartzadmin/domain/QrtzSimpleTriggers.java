/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-04-27
 */
package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "QRTZ_SIMPLE_TRIGGERS")
@NamedEntityGraph(
        name = "QRTZ_SIMPLE_TRIGGERS.FETCH.QRTZ_TRIGGERS",
        attributeNodes = @NamedAttributeNode(value = "trigger")
)
public class QrtzSimpleTriggers implements Serializable {

    @EmbeddedId
    private TriggerId id;

    @Column(name = "REPEAT_COUNT")
    private Long repeatCount;

    @Column(name = "REPEAT_INTERVAL")
    private Long repeatInterval;

    @Column(name = "TIMES_TRIGGERED")
    private Long timesTriggered;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "SCHED_NAME", referencedColumnName = "SCHED_NAME", insertable = false, updatable = false),
            @JoinColumn(name = "TRIGGER_NAME", referencedColumnName = "TRIGGER_NAME", insertable = false, updatable = false),
            @JoinColumn(name = "TRIGGER_GROUP", referencedColumnName = "TRIGGER_GROUP", insertable = false, updatable = false),
    })
    private QrtzTriggers trigger;
}
