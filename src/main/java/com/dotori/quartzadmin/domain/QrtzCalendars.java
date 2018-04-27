package com.dotori.quartzadmin.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Table(name = "QRTZ_CALENDARS")
public class QrtzCalendars {
    private String schedName;
    private String calendarName;
    private String calendar;
}
