<template>
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
                <td>{{item.nextFireTime}}</td>
                <td>{{item.triggerState}}</td>
                <td>{{item.triggerType}}</td>
            </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
    import axios from 'axios'

    export default {
        name: "Trigger",
        data() {
            return {
                list: []
            }
        },
        created: function () {
            axios.get('/api/triggers').then(res => {
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