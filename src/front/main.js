import Vue from "vue";
import Router from "./router/router"
import App from "./App.vue"

/*import 'vue-material/dist/vue-material.min.css'
import 'vue-material/dist/theme/black-green-light.css'
import VueMaterial from 'vue-material'

Vue.use(VueMaterial);*/

new Vue({
    el: '#app',
    render: h => h(App),
    router: Router
});