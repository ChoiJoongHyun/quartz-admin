/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-17
 */
package com.dotori.quartzadmin.controller.api;

import com.dotori.quartzadmin.controller.MappingConstant;
import com.dotori.quartzadmin.domain.QrtzTriggers;
import com.dotori.quartzadmin.service.TriggerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(MappingConstant.CronTrigger.ROOT)
public class CronTriggerController {

    public final TriggerService triggerService;

    /**
     * url mapping : {@link MappingConstant.CronTrigger#ROOT}
     * 스케쥴러 트리거 모두 제공
     * */
    @GetMapping
    public List<QrtzTriggers> get() {
        return this.triggerService.findCronTrigger();
    }

}