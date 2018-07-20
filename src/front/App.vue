<template>
    <div>
        <main-nav-bar/>
        <div class="container-fluid">
            <div class="row">
                <main-left-bar/>
                <!--컨텐츠영역-->
                <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                    <router-view/>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import NavBar from "./layout/NavBar.vue"
    import LeftBar from "./layout/LeftBar.vue"

    export default {
        name: 'App',
        components: {
            'main-nav-bar' : NavBar,
            'main-left-bar' : LeftBar
        }
    }
</script>

<style scoped>
</style>
