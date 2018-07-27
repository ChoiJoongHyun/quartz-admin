<template>
    <div class="table-responsive">

        <table class="table table-striped">
            <thead>
            <tr>
                <th>스케쥴 명</th>
                <th>JOB 이름</th>
                <th>JOB 그룹</th>
                <th>시작시간</th>

                <th>상태</th>

                <th>반복 횟수</th>
                <th>반복 간격</th>

            </tr>
            </thead>
            <tbody>

            <tr v-for="item in list"  >
                <td>{{item.id.schedName}}</td>
                <td>{{item.trigger.jobName}}</td>
                <td>{{item.trigger.jobGroup}}</td>

                <td>{{item.trigger.startTime}}</td>

                <td>{{item.trigger.triggerState}}</td>

                <td>{{item.repeatInterval}}</td>
                <td>{{item.timesTriggered}}</td>
            </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
    import axios from 'axios'

    export default {
        name: "SimpleTrigger",
        data() {
            return {
                list: []
            }
        },
        created: function () {
            axios.get('http://localhost:3001/api/simple/triggers').then(res => {
                this.list = res.data;
            }).catch(error => {
                //TODO error
                console.log(error);
            })
        }
    }
</script>

<style scoped>

</style>