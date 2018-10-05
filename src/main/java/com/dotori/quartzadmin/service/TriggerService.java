/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-17
 */
package com.dotori.quartzadmin.service;

import com.dotori.quartzadmin.controller.api.request.TriggerFilterRequest;
import com.dotori.quartzadmin.domain.QrtzTriggers;
import com.dotori.quartzadmin.repository.QrtzTriggersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Transactional
public class TriggerService {

    public final QrtzTriggersRepository qrtzTriggersRepository;

    /**
     * @param filter 트리거 필터
     * @return QRTZ_TRIGGERS entity list
     * */
    public List<QrtzTriggers> findByFilter(final TriggerFilterRequest filter) {
        return this.qrtzTriggersRepository.findByFilter(filter);
    }

    /**
     * @return QRTZ_TRIGGERS job_group set
     * */
    public List<String> findJobGroups() {
        List<QrtzTriggers> triggers = this.qrtzTriggersRepository.findAll();

        return triggers.stream()
                .map(trigger -> trigger.getJobGroup())
                .distinct()
                .collect(Collectors.toList());
    }
}