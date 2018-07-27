import Vue from "vue"
import VueRouter from "vue-router";

import About from "../pages/About.vue"
import Trigger from "../pages/Trigger.vue"
import CronTrigger from "../pages/CronTrigger.vue";
import SimpleTrigger from "../pages/SimpleTrigger.vue"

Vue.use(VueRouter);

export default new VueRouter({
    mode: 'history',
    routes: [
        {
            path: '/',
            component: CronTrigger
        },
        {
            path: '/cron/triggers',
            component: CronTrigger
        },
        {
            path: '/simple/triggers',
            component: SimpleTrigger
        },
        {
            path: '/about',
            component: About
        }
    ]
});