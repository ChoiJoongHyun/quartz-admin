/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-04-27
 */
package com.dotori.quartzadmin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@Getter
@Embeddable
public class SchedulerStateId implements Serializable {

    @Column(name = "SCHED_NAME")
    private String schedName;

    @Column(name = "INSTANCE_NAME")
    private String instanceName;
}