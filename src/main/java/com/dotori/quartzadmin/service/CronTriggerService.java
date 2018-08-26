/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-27
 */
package com.dotori.quartzadmin.service;

import com.dotori.quartzadmin.controller.api.request.CronTriggerFilterRequest;
import com.dotori.quartzadmin.domain.QrtzCronTriggers;
import com.dotori.quartzadmin.repository.QrtzCronTriggersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor

@Service
@Transactional
public class CronTriggerService {

    private final QrtzCronTriggersRepository qrtzCronTriggersRepository;

    //TODO queryDsl filter 처리
    public List<QrtzCronTriggers> findByFilter(final CronTriggerFilterRequest filter) {

        if(StringUtils.isEmpty(filter.getJobGroup())) {
            return this.qrtzCronTriggersRepository.findAll();
        }

        return this.qrtzCronTriggersRepository.findByTrigger_JobGroup(filter.getJobGroup());
    }

    public List<String> findJobGroups() {

        List<QrtzCronTriggers> triggers = this.qrtzCronTriggersRepository.findAll();

        return triggers.stream()
                .map(trigger -> trigger.getTrigger().getJobGroup())
                .distinct()
                .collect(Collectors.toList());
    }
}