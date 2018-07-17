/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-17
 */
package com.dotori.quartzadmin.facade;

import com.dotori.quartzadmin.controller.response.CronTriggerListResponse;
import com.dotori.quartzadmin.domain.QrtzTriggers;
import com.dotori.quartzadmin.service.TriggerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class CronTriggerFacade {

    public final TriggerService triggerService;

    public List<CronTriggerListResponse> get() {

        List<QrtzTriggers> triggers = this.triggerService.findCronTrigger();

        return triggers.stream()
                .map(trigger -> CronTriggerListResponse.builder()
                        .schedulerName(trigger.getId().getSchedName())
                        .triggerName(trigger.getId().getTriggerName())
                        .triggerGroup(trigger.getId().getTriggerGroup())
                        .build())
                .collect(Collectors.toList());
    }

}