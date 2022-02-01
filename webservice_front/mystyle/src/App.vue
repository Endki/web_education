<template>
  <div id="app">
    <div id="header">
      <Header />
    </div>
    <b-container>
      <b-row>
        <b-col cals="9">
          <router-view></router-view>
        </b-col>

        <b-col cols="3"><Side /></b-col>
      </b-row>
    </b-container>

    <div id="footer">
      <Footer />
    </div>
  </div>
</template>

<script>
import Header from './components/layouts/header.vue';
import Footer from './components/layouts/footer.vue';
import Side from './components/layouts/side.vue';
export default {
  name: 'App',
  components: {
    Footer,
    Header,
    Side,
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
