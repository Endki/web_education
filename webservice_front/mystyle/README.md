# mystyle

## Project setup

```
npm install
```

### Compiles and hot-reloads for development

```
npm run serve
```

### Compiles and minifies for production

```
npm run build
```

### Lints and fixes files

```
npm run lint
```

### Customize configuration

See [Configuration Reference](https://cli.vuejs.org/config/).

## Assets

자산파일(assets files)을 저장한다.
font, icons, images, styles etc.

## Common

공통 파일을 저장하는데 사용한다.
여러 곳에서 파일을 사용하는 경우 이 디렉토리에 저장한다.

여러 내부 폴더: component, mixins, directives etc.
단일 파일: fuctions.ts, helpers.ts, constants.ts, config.ts and other.
예시:

Button.vue는 전체 어플리케이션에 사용할 수 있으므로 src/common/components에 저장할 수 있다.
helpers.ts는 여러 장소에서 사용하는 공통 기능을 쓸 수 있다.

## Layouts

앱 레이아웃은 이 디렉토리에 저장한다.
레이아웃에 대해 이미 작성한 글이 있다. 이 글에서 확인 할수 있다.
아래는 링크된 글을 보고 만든 구조이다.

## Middlewares

미들웨어 디렉토리는 뷰라우터와 밀접하게 작동한다.
이 디렉토리안에 네비게이션 가드를 저장할 수 있다.
예시:

// middlewares/checkAuth.js

export default function checkAuth(next, isAuthenticated) {
if (isAuthenticated) {
next('/')
} else {
next('/login');
}
}
vue-router 내부에서 사용해야 한다.

// vue-router

import Router from 'vue-router'
import checkAuth from '../middlewares/checkAuth.js'
const isAuthenticated = true

const router = new Router({
routes: [],
mode: 'history'
});

router.beforeEach((to, from, next) => {
checkAuth(next, isAuthenticated)
});
라우터와 미들웨어에 관하여 좀 더 심화된 주제를 다룬 글은 (여기)서 확인할 수 있다.

## Modules

어플리케이션의 코어인 모듈 폴더이다.
모듈, 논리적으로 분리된 부분을 저장한다.
각 모듈 내부에 생성하길 권장하는 요소:

Vue 컴포넌트를 저장할 수 있는 내부 컴포넌트 폴더
테스트 폴더(모든 테스트를 모듈에 보관하는걸 선호함)
store.ts 혹은 store모듈을 보관하는 store디렉토리
모듈과 관련된 다른파일. 모듈에만 관련된 helper functions
예시:
앱에 있는 order에 관련된 컴포넌트를 저장하는 ordes모듈에 관한예시(list of orders, order details, etc.).
Orders vuex store 모듈. 추가관련 파일.

## Plugins

이 폴더에서 플러그인을 생성 또는 연결할 수 있다.
Vue 2 플러그인 연결 예시:

import MyPlugin from './myPlugin.ts'

Vue.use(MyPlugin, { someOption: true })
Vue3 에서는 main.ts에서 플러그인을 연결하지만, 플러그인 폴더에서 계속 플러그인을 생성하는 것도 가능하다.
플러그인에 대한 자세한내용은 여기 그리고 여기에서 확인할 수 있다.

## Services

서비스를 저장하는데 필요하다.
예시로는 API 연결 서비스, localStorage 매니저 서비스 등을 만들고 저장할 수 있다.

더 자세한 Vue API 모듈을 읽고 싶다면 여기에서 확인할 수 있다.

## Static

보통, 이 폴더는 필요없다.
주로 dummy data를 저장하는데 쓰인다.

## Router

vue-router와 관련된 모든 파일을 저장할 수 있다.
라우터와 경로가 한 곳에 있는 index.ts가 있을 수 있다.(이 경우 index.ts를 src루트에 저장하는 것이 좋다)
저자는 혼란을 피하기 위해 라우터와 경로를 다른 파일로 분리하는걸 선호한다.

이 article에서 어플리케이션을 위한 자동 라우터를 만드는 방법을 읽을 수 있다.

## Store

vuex와 관련된 파일을 저장하는 vuex 스토어 디렉토리다.
vuex modules와 분리하고 싶을때부터, 이 폴더에는 state, actions, mutations, getters를 저장하고, 자동적으로 모든 vuex modules와 modules 디렉토리와 연결해야한다.

## Views

어플리케이션에서 두번째로 중요한 폴더인 views는 어플리케이션 경로에 대한 모든 진입점을 저장한다.
예시로, 어플리케이션에 /home, /about, /orders 라우트가 있으면, 각각 views 폴더에 Home.vue, About.vue, Order.vue가 있어야 한다.

왜 우리가 views와 modules를 한곳에 저장하지 않고 나눠 저장하는지에 대해 의구심을 갖을 수 있다.
두가지를 분리하면 생기는 장점:

파일 구조가 조금 더 깔끔해진다.
어플리케이션의 라우트를 빨리 이해할 수 있다.
페이지에서 어떤파일이 루트인지, 어디에서 작업을 시작하는지 쉽게 이해할 수 있다.
