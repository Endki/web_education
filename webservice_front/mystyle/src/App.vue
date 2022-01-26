<template>
  <div id="app">
    <div id="header">
      <Header>
    </div>
    <router-view></router-view>

    <div id="footer">
      <Footer />
    </div>
  </div>
</template>

<script>
import Footer from './components/layouts/footer.vue';
import Header from './components/layouts/header.vue';

export default {
  name: 'App',
  components: {
    Footer,
    Header,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /* text-align: center; */
  color: #2c3e50;
  /* margin-top: 60px; */
}
</style>
