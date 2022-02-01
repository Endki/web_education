<template>
  <b-container>
    <b-row>
      <b-col cals="9">
        <b-col fluid="sm" cols="6"> 게시판! </b-col>
        <b-col fluid="sm" cols="4"> 게시판! </b-col>
      </b-col>

      <b-col cols="3"><Side /></b-col>
    </b-row>
  </b-container>
</template>

<script>
import Side from '../components/layouts/side.vue';
export default {
  components: { Side },
  props: {
    msg: String,
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.at-container {
  max-width: 1200px;
}
.no-responsive .wrapper,
.no-responsive .at-container-wide {
  min-width: 1200px;
}
.no-responsive .boxed.wrapper,
.no-responsive .at-container {
  width: 1200px;
}
.at-menu .nav-height {
  height: 44px;
  line-height: 44px !important;
}
.pc-menu,
.pc-menu .nav-full-back,
.pc-menu .nav-full-height {
  height: 44px;
}
.pc-menu .nav-top.nav-float .menu-a {
  padding: 0px 25px;
}
.pc-menu .nav-top.nav-float .sub-1div::before {
  left: 25px;
}
.pc-menu .subm-w {
  width: 170px;
}
@media all and (min-width: 1200px) {
  .responsive .boxed.wrapper {
    max-width: 1200px;
  }
}
</style>
