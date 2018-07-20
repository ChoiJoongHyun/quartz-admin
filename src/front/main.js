import 'bootstrap/dist/js/bootstrap.min.js'
import 'jquery/dist/jquery.min'

import Vue from "vue"
import Router from "./router/router"

import App from "./App.vue"

new Vue({
    el: '#main',
    render: h => h(App),
    router: Router
});
/*
const app = new Vue({
    el: '#app',
    data: {
        currentRoute: window.location.pathname
    },
    computed: {
        ViewComponent () {
            return Main;
            /!*const matchingView = routes[this.currentRoute]
            return matchingView
                ? require('./pages/' + matchingView + '.vue')
                : require('./pages/404.vue')*!/
        }
    },
    render (h) {
        return h(this.ViewComponent)
    }
});
window.addEventListener('popstate', () => {
    app.currentRoute = window.location.pathname
})*/
