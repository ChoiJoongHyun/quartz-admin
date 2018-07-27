/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-17
 */
package com.dotori.quartzadmin.service;

import com.dotori.quartzadmin.domain.QrtzCronTriggers;
import com.dotori.quartzadmin.domain.QrtzSimpleTriggers;
import com.dotori.quartzadmin.domain.QrtzTriggers;
import com.dotori.quartzadmin.repository.QrtzTriggersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class TriggerService {

    public final QrtzTriggersRepository qrtzTriggersRepository;

    public List<QrtzTriggers> findAll() {

        //TODO cron trigger 만.
        return this.qrtzTriggersRepository.findAll();
    }

    public List<QrtzCronTriggers> findCronTrigger() {

        //return this.qrtzTriggersRepository.findAll();
        return null;
    }

    public List<QrtzSimpleTriggers> findSimpleTrigger() {

        return null;
    }
}