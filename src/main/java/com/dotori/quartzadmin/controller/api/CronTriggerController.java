/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-27
 */
package com.dotori.quartzadmin.controller.api;

import com.dotori.quartzadmin.domain.QrtzCronTriggers;
import com.dotori.quartzadmin.service.CronTriggerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api/cron/triggers")
public class CronTriggerController {

    private final CronTriggerService cronTriggerService;

    @GetMapping
    public List<QrtzCronTriggers> all() {
        return this.cronTriggerService.findAll();
    }

    @GetMapping("/group")
    public List<String> jobGroup() {
        return this.cronTriggerService.findJobGroups();
    }
}