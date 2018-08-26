package com.dotori.quartzadmin.controller.api.request;

import com.dotori.quartzadmin.domain.TriggerType;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by joonghyun on 2018. 08. 26.
 */
@Setter
@Getter
public class TriggerFilterRequest {

    private String jobGroup;
    private TriggerType triggerType;
}
