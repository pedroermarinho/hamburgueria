import Vue from 'vue';
import Router from 'vue-router';
import beforeEach from './beforeEach';

Vue.use(Router);



const routes = new Router({
    mode: 'history',
    routes: [
        {
            path: '/',
            redirect: '/home'

        },
        {
            path: '/home',
            name: 'Home',
            component: () => import('@/view/pages/Home.vue'),
        },
        {
            path: '/login',
            name: 'Login',
            component: () => import('@/view/pages/Login.vue'),
        },
        {
            path: '/cadastro',
            name: 'Cadastro',
            component: () => import('@/view/pages/Cadastro.vue'),
        },
        {
            path: '/add_produto',
            name: 'AddProduto',
            component: () => import('@/view/pages/AddProduto.vue'),
        },

    ],
});

routes.beforeEach(beforeEach);

export default routes;