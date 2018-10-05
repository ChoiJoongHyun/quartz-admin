/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-19
 */
package com.dotori.quartzadmin.controller.api;

import com.dotori.quartzadmin.controller.api.request.TriggerFilterRequest;
import com.dotori.quartzadmin.domain.QrtzTriggers;
import com.dotori.quartzadmin.service.TriggerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api/triggers")
public class TriggerController {

    private final TriggerService triggerService;

    @GetMapping
    public List<QrtzTriggers> all(@Valid TriggerFilterRequest request) {
        return this.triggerService.findByFilter(request);
    }

    @GetMapping("/group")
    public List<String> jobGroup() {
        return this.triggerService.findJobGroups();
    }
}