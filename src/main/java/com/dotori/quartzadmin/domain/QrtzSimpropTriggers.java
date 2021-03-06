/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-04-27
 */
package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "QRTZ_SIMPROP_TRIGGERS")
public class QrtzSimpropTriggers implements Serializable {

    @EmbeddedId
    private TriggerId id;

    @Column(name = "STR_PROP_1")
    private String strProp1;

    @Column(name = "STR_PROP_2")
    private String strProp2;

    @Column(name = "STR_PROP_3")
    private String strProp3;

    @Column(name = "INT_PROP_1")
    private Long intProp1;

    @Column(name = "INT_PROP_2")
    private Long intProp2;

    @Column(name = "LONG_PROP_1")
    private Long longProp1;

    @Column(name = "LONG_PROP_2")
    private Long longProp2;

    @Column(name = "DEC_PROP_1")
    private Double decProp1;

    @Column(name = "DEC_PROP_2")
    private Double decProp2;

    @Column(name = "BOOL_PROP_1")
    private String boolProp1;

    @Column(name = "BOOL_PROP_2")
    private String boolProp2;
}
