package com.dotori.quartzadmin.controller.api.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CronTriggerFilterRequest {

    private String jobGroup;
}
