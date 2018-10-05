/*
 * Revision History
 * Author                    Date                     Description
 * ------------------       --------------            ------------------
 *   joonghyun                2018-10-27
 */
package com.dotori.quartzadmin.repository;

import com.dotori.quartzadmin.controller.api.request.TriggerFilterRequest;
import com.dotori.quartzadmin.domain.QrtzTriggers;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import java.util.List;

import static com.dotori.quartzadmin.domain.QQrtzTriggers.qrtzTriggers;

public class QrtzTriggersRepositoryImpl implements QrtzTriggersRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public QrtzTriggersRepositoryImpl(final EntityManager entityManager) {
        this.jpaQueryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    public List<QrtzTriggers> findByFilter(TriggerFilterRequest filter) {

        BooleanBuilder builder = new BooleanBuilder();
        if (filter.getTriggerType() != null) {
            builder.and(qrtzTriggers.triggerType.eq(filter.getTriggerType()));
        }

        if (!StringUtils.isEmpty(filter.getJobGroup())) {
            builder.and(qrtzTriggers.jobGroup.eq(filter.getJobGroup()));
        }

        return this.jpaQueryFactory.selectFrom(qrtzTriggers)
                .where(builder)
                .fetch();
    }
}