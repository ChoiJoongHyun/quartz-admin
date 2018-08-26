<template>
    <div>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">입력 필터</h3>
            </div>
            <div class="panel-body">
                <div class = "row">
                    <div class="col-md-2">
                        트리거 타입 :
                        <select v-model="filterSelected.triggerType" v-on:change="selectedFilter">
                            <option value = ""> 전체 </option>
                            <option v-for="item in filter.triggerType" v-bind:value="item"> {{item}} </option>
                        </select>
                    </div>
                    <div class="col-md-2">
                        JOB 그룹 :
                        <select v-model="filterSelected.group" v-on:change="selectedFilter">
                            <option value = ""> 모든그룹 </option>
                            <option v-for="item in filter.group" v-bind:value="item"> {{item}} </option>
                        </select>
                    </div>
                </div>

            </div>
        </div>

        <div class="table-responsive">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>jobName</th>
                    <th>jobGroup</th>
                    <th>nextFireTime</th>
                    <th>triggerState</th>
                    <th>triggerType</th>
                </tr>
                </thead>
                <tbody>

                <tr v-for="item in list"  >
                    <td>{{item.jobName}}</td>
                    <td>{{item.jobGroup}}</td>
                    <td>{{item.nextFireTime | moment("YYYY-MM-DD HH:mm:ss")}}</td>
                    <td>{{item.triggerState}}</td>
                    <td>{{item.triggerType}}</td>
                </tr>
                </tbody>
            </table>
        </div>

    </div>

</template>

<script>
    import axios from 'axios'

    export default {
        name: "Trigger",
        methods: {
            selectedFilter: function() {
                axios.get('/api/triggers',
                    {
                        params: {
                            jobGroup : this.filterSelected.group,
                            triggerType : this.filterSelected.triggerType
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
                list: [],
                filter: {
                    group: [],
                    triggerType: ["SIMPLE", "CRON"]
                } ,
                filterSelected: {
                    group: "",
                    triggerType: ""
                }
            }
        },
        created: function () {
            axios.get('/api/triggers').then(res => {
                this.list = res.data;
            }).catch(error => {
                //TODO error
                console.log(error);
            })

            axios.get('/api/triggers/group').then(res => {
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