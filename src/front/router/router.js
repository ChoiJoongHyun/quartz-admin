import Vue from "vue"
import VueRouter from "vue-router";

import About from "../pages/About.vue"
import Trigger from "../pages/Trigger.vue"

Vue.use(VueRouter);

export default new VueRouter({
    mode: 'history',
    routes: [
        {
            path: '/',
            component: Trigger
        },
        {
            path: '/about',
            component: About
        },
        {
            path: '/triggers',
            component: Trigger
        }
    ]
});