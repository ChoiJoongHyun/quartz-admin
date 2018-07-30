/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-27
 */
package com.dotori.quartzadmin.service;

import com.dotori.quartzadmin.domain.QrtzCronTriggers;
import com.dotori.quartzadmin.repository.QrtzCronTriggersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor

@Service
@Transactional
public class CronTriggerService {

    private final QrtzCronTriggersRepository qrtzCronTriggersRepository;

    public List<QrtzCronTriggers> findAll() {
        return this.qrtzCronTriggersRepository.findAll();
    }

    public List<String> findJobGroups() {

        List<QrtzCronTriggers> triggers = this.findAll();

        return triggers.stream()
                .map(trigger -> trigger.getTrigger().getJobGroup())
                .distinct()
                .collect(Collectors.toList());
    }
}