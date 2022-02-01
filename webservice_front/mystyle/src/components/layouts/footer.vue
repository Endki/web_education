<template>
  <div class="alert-secondary">
    <b-container class="bv-example-row fluid">
      <b-row>
        <b-col>
          <b-nav small align="left">
            <b-nav-item link-classes="text-dark">사이트 소개</b-nav-item>
          </b-nav>
        </b-col>

        <b-col>
          <b-nav small align="right">
            <b-nav-item link-classes="text-dark">이용안내</b-nav-item>

            <b-nav-item link-classes="text-dark">문의하기</b-nav-item>
          </b-nav></b-col
        >
      </b-row>
      <div class="mx-auto" style="width: 300px">
        <i class="fa fa-leaf"></i>
        <strong>Endki_portfolio <i class="fa fa-copyright"></i></strong>
        All rights reserved.
      </div>
    </b-container>
  </div>
</template>

<script>
export default {
  data() {
    return {
      year: new Date().getFullYear(),
    };
  },
};
</script>

<style></style>
