<template>
  <div id="app">
    <div id="header">
      <Header />
    </div>

    <Index />

    <div id="footer"></div>
  </div>
</template>

<script>
import Header from './components/header.vue';
import Index from './pages/home.vue';

export default {
  name: 'App',
  components: {
    Header,
    Index,
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
