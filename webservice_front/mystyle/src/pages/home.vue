<template>
  <b-container>
    <b-row>
      <b-col cols="12" md="3"></b-col>
      <b-col cols="12" md="2" align="center">
        <b-btn
          color="light-green"
          @click="mobetoboard1"
          :style="{
            height: '50px',
            width: '170px',
            fontWeight: 'bold',
            fontSize: 'large',
          }"
          >게시판1</b-btn
        >
      </b-col>
      <b-col cols="12" md="2" align="center">
        <b-btn
          color="yellow"
          @click="mobetoboard2"
          :style="{
            height: '50px',
            width: '170px',
            fontWeight: 'bold',
            fontSize: 'large',
          }"
          >게시판2</b-btn
        >
      </b-col>
      <b-col cols="12" md="2" align="center">
        <b-btn
          color="orange"
          type="submit"
          @click="mobetoboard3"
          :style="{
            height: '50px',
            width: '170px',
            fontWeight: 'bold',
            fontSize: 'large',
          }"
          >게시판3</b-btn
        >
      </b-col>
      <b-col cols="12" md="3"></b-col>
    </b-row>
  </b-container>
</template>

<script>
export default {
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
