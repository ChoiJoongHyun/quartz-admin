/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-07-27
 */
package com.dotori.quartzadmin.service;

import com.dotori.quartzadmin.domain.QrtzSimpleTriggers;
import com.dotori.quartzadmin.repository.QrtzSimpleTriggersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor

@Service
@Transactional
public class SimpleTriggerService {

    private final QrtzSimpleTriggersRepository qrtzSimpleTriggersRepository;

    public List<QrtzSimpleTriggers> findAll() {
        return this.qrtzSimpleTriggersRepository.findAll();
    }
}