/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-04-27
 */
package com.dotori.quartzadmin.domain;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@Embeddable
public class TriggerId implements Serializable {

    @Column(name="SCHED_NAME")
    private String schedName;

    @Column(name="TRIGGER_NAME")
    private String triggerName;

    @Column(name="TRIGGER_GROUP")
    private String triggerGroup;
}