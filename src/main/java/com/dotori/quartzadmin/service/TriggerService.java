/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-17
 */
package com.dotori.quartzadmin.service;

import com.dotori.quartzadmin.controller.api.request.TriggerFilterRequest;
import com.dotori.quartzadmin.domain.QrtzCronTriggers;
import com.dotori.quartzadmin.domain.QrtzSimpleTriggers;
import com.dotori.quartzadmin.domain.QrtzTriggers;
import com.dotori.quartzadmin.repository.QrtzTriggersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Transactional
public class TriggerService {

    public final QrtzTriggersRepository qrtzTriggersRepository;

    public List<QrtzTriggers> findAll(final TriggerFilterRequest filter) {

        //TODO query dsl filter
        List<QrtzTriggers> result = this.qrtzTriggersRepository.findAll();

        if(filter.getTriggerType() != null) {
            result = result.stream()
                    .filter(t -> t.getTriggerType().equals(filter.getTriggerType()))
                    .collect(Collectors.toList());
        }

        if(!StringUtils.isEmpty(filter.getJobGroup())) {
            result = result.stream()
                    .filter(t -> t.getJobGroup().equals(filter.getJobGroup()))
                    .collect(Collectors.toList());
        }

        return result;
    }

    public List<String> findJobGroups() {
        List<QrtzTriggers> triggers = this.qrtzTriggersRepository.findAll();

        return triggers.stream()
                .map(trigger -> trigger.getJobGroup())
                .distinct()
                .collect(Collectors.toList());
    }
}