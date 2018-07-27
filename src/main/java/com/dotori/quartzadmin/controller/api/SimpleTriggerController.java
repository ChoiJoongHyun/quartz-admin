/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-27
 */
package com.dotori.quartzadmin.controller.api;

import com.dotori.quartzadmin.domain.QrtzSimpleTriggers;
import com.dotori.quartzadmin.service.SimpleTriggerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api/simple/triggers")
public class SimpleTriggerController {

    private final SimpleTriggerService simpleTriggerService;

    @GetMapping
    public List<QrtzSimpleTriggers> all() {
        return this.simpleTriggerService.findAll();
    }
}