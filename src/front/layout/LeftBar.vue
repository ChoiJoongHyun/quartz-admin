<template>
    <!--왼쪽 사이드바 영역-->
    <div class="col-sm-3 col-md-2 sidebar">
        <ul class="nav nav-sidebar">
            <!--<li> <router-link to="/triggers">파이팅팅</router-link> </li>-->
            <li> <router-link to="/cron/triggers">Cron Trigger</router-link> </li>
            <li> <router-link to="/simple/triggers">Simple Trigger</router-link> </li>
        </ul>

        <ul class="nav nav-sidebar">
            <li> <router-link to="/about">about</router-link> </li>
        </ul>
        <!--<ul class="nav nav-sidebar">
            <li><a href="">Nav item</a></li>
            <li><a href="">Nav item again</a></li>
            <li><a href="">One more nav</a></li>
            <li><a href="">Another nav item</a></li>
            <li><a href="">More navigation</a></li>
        </ul>
        <ul class="nav nav-sidebar">
            <li><a href="">Nav item again</a></li>
            <li><a href="">One more nav</a></li>
            <li><a href="">Another nav item</a></li>
        </ul>-->
    </div>
</template>

<script>
    export default {
        name: "LeftBar"
    }
</script>

<style scoped>

</style>