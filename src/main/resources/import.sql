INSERT INTO QRTZ_JOB_DETAILS
(SCHED_NAME, JOB_NAME, JOB_GROUP, DESCRIPTION, JOB_CLASS_NAME, IS_DURABLE, IS_NONCONCURRENT, IS_UPDATE_DATA, REQUESTS_RECOVERY, JOB_DATA)
VALUES ('scheduler-name-01', 'job-name-01', 'job-group-01', 'detail-description', 'com.zum.autoconfigure.scheduler.DefaultQuartzJob', 1, 1, 1, 0, null );

INSERT INTO QRTZ_JOB_DETAILS
(SCHED_NAME, JOB_NAME, JOB_GROUP, DESCRIPTION, JOB_CLASS_NAME, IS_DURABLE, IS_NONCONCURRENT, IS_UPDATE_DATA, REQUESTS_RECOVERY, JOB_DATA)
VALUES ('scheduler-name-02', 'job-name-02', 'job-group-02', 'detail-description', 'com.zum.autoconfigure.scheduler.DefaultQuartzJob', 1, 1, 1, 0, null );

INSERT INTO QRTZ_TRIGGERS
(SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, JOB_NAME, JOB_GROUP, DESCRIPTION, NEXT_FIRE_TIME, PREV_FIRE_TIME, PRIORITY, TRIGGER_STATE, TRIGGER_TYPE, START_TIME, END_TIME, CALENDAR_NAME, MISFIRE_INSTR, JOB_DATA)
VALUES ('scheduler-name-01', 'trigger-name-01', 'trigger-group-01', 'job-name-01', 'job-group-01', 'description', 1530543600000, -1, 0, 'WAITING', 'CRON', 1530543600000, 0, null, 0, null);

INSERT INTO QRTZ_TRIGGERS
(SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, JOB_NAME, JOB_GROUP, DESCRIPTION, NEXT_FIRE_TIME, PREV_FIRE_TIME, PRIORITY, TRIGGER_STATE, TRIGGER_TYPE, START_TIME, END_TIME, CALENDAR_NAME, MISFIRE_INSTR, JOB_DATA)
VALUES ('scheduler-name-02', 'trigger-name-02', 'trigger-group-02', 'job-name-02', 'job-group-02', 'description', 1530543600000, -1, 0, 'WAITING', 'SIMPLE', 1530543600000, 0, null, 0, null);

INSERT INTO QRTZ_CRON_TRIGGERS
(SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, CRON_EXPRESSION, TIME_ZONE_ID)
VALUES ('scheduler-name-01', 'trigger-name-01', 'trigger-group-01', '0 0 0 1/1 * ? *', 'Asia/Seoul');

INSERT INTO QRTZ_SIMPLE_TRIGGERS
(SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, REPEAT_COUNT, REPEAT_INTERVAL, TIMES_TRIGGERED)
VALUES ('scheduler-name-02', 'trigger-name-02', 'trigger-group-02', 0, 0, 1);


