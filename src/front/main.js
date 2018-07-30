import 'jquery/dist/jquery.min'
import 'bootstrap/dist/js/bootstrap.min.js'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-select/dist/js/bootstrap-select.js'
import 'bootstrap-select/dist/css/bootstrap-select.css'
import 'moment/moment.js'


import Vue from "vue"
import Router from "./router/router"
import VueMoment from "vue-moment"
import App from "./App.vue"


Vue.use(VueMoment);

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
