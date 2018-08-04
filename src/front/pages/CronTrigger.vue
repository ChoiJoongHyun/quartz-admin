<template>
    <div>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">입력 필터</h3>
            </div>
            <div class="panel-body">

                <div>
                    JOB 그룹 :
                    <select v-model="selected" v-on:change="selectedJobGroup">
                        <option value = null> 모든그룹 </option>
                        <option v-for="item in filter.group" v-bind:value="item"> {{item}} </option>
                    </select>
                    <!--<span>선택함: {{ selected }}</span>-->
                </div>
            </div>
        </div>


        <div class="table-responsive">

            <table class="table table-striped">
                <thead>
                <tr>
                    <th>스케쥴 명</th>
                    <th>JOB 이름</th>
                    <th>JOB 그룹</th>
                    <th>실행시간</th>
                    <th>다음 실행시간</th>
                    <th>상태</th>
                    <th>주기</th>
                    <th>타임 존</th>
                </tr>
                </thead>
                <tbody>

                <tr v-for="item in list"  >
                    <td>{{item.id.schedName}}</td>
                    <td>{{item.trigger.jobName}}</td>
                    <td>{{item.trigger.jobGroup}}</td>

                    <td>{{item.trigger.startTime | moment("YYYY-MM-DD HH:mm:ss")}}</td>
                    <td>{{item.trigger.nextFireTime | moment("YYYY-MM-DD HH:mm:ss")}}</td>
                    <td>{{item.trigger.triggerState}}</td>

                    <td>{{item.cronExpression}}</td>
                    <td>{{item.timeZoneId}}</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
    import axios from 'axios'

    export default {
        name: "CronTrigger",
        components: {

        },
        methods: {
            selectedJobGroup: function() {
                axios.get('/api/cron/triggers',
                    {
                        params: {
                            jobGroup : this.selected
                        }
                    })
                    .then(res => {
                        this.list = res.data;
                    })
                    .catch(error => {
                        //TODO error
                        console.log(error);
                    })
            }
        },
        data() {
            return {
                selected: null,
                list: [],
                filter: {
                    group: []
                }
            }
        },
        created: function () {
            axios.get('/api/cron/triggers').then(res => {
                this.list = res.data;
            }).catch(error => {
                //TODO error
                console.log(error);
            })

            axios.get('/api/cron/triggers/group').then(res => {
                this.filter.group = res.data;
            }).catch(error => {
                //TODO error
                console.log(error);
            })
        }
    }
</script>

<style scoped>

</style>