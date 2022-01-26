import Vue from 'vue';
import VueRouter from 'vue-router';
import Home from './views/home.vue'
import Board from './views/board/board.vue'
import Speed from './views/game/pages/speedCheck.vue'
Vue.use(VueRouter);

//라우트 정보
//라우팅을 해주면서 #을 제거, path에 입력한 경로에 매핑된 컴포넌트를 보여준다.
const routes = [
    {
        path: "/",
        name: "Home",
        component: Home
    },
    {
        path: "/board",
        name:"Board",
        component: Board
    }
    ,
    {
        path: "/game/speedCheck",
        name:"speedCheck",
        component: Speed
    }

];


// Vue 라우터 인스턴스 생성 
const router = new VueRouter({
    mode: 'history',
    routes: routes
});

export default router;