/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-10-27
 */
package com.dotori.quartzadmin.repository;

import com.dotori.quartzadmin.controller.api.request.TriggerFilterRequest;
import com.dotori.quartzadmin.domain.QrtzTriggers;

import java.util.List;


public interface QrtzTriggersRepositoryCustom {

    List<QrtzTriggers> findByFilter(TriggerFilterRequest filter);
}