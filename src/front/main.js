import Vue from "vue";
import Router from "./router/router";
import Main from "./components/home/Main.vue";

/*import 'bootstrap/dist/css/bootstrap.min.css'*/
/*import 'vue-material/dist/vue-material.min.css'
import 'vue-material/dist/theme/black-green-light.css'
Vue.use(VueMaterial);*/
/*import 'bootstrap/dist/css/bootstrap.min.css';
*/
import 'bootstrap/dist/js/bootstrap.min.js';
import 'jquery/dist/jquery.min';

new Vue({
    el: '#content',
    render: h => h(Main),
    router: Router
});