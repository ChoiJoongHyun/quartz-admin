/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-04-27
 */
package com.dotori.quartzadmin.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FiredTriggerId implements Serializable {

    @Column(name = "SCHED_NAME")
    private String schedName;

    @Column(name = "ENTRY_ID")
    private String entryId;
}