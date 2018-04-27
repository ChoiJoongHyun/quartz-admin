import Vue from "vue"
import VueRouter from "vue-router";
//import Home from "../pages/Home.vue"
import HelloWorld from "../components/HelloWorld.vue"

Vue.use(VueRouter);

export default new VueRouter({
    mode: 'history',
    routes: [
        {
            path: '/',
            component: HelloWorld
        }
    ]
});