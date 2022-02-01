<template>
  <div>
    <b-container class="bv-example-row fluid">
      <b-row>
        <b-col>
          <b-nav small align="left">
            <b-nav-item link-classes="text-dark">즐겨찾기</b-nav-item>
            <b-nav-item disabled>/</b-nav-item>
            <b-nav-item disabled> 날짜</b-nav-item>
          </b-nav>
        </b-col>

        <b-col>
          <b-nav small align="right">
            <b-nav-item link-classes="text-dark">공지사항</b-nav-item>

            <b-nav-item link-classes="text-dark">FAQ</b-nav-item>

            <b-nav-item link-classes="text-dark">출석부</b-nav-item>

            <b-nav-item link-classes="text-dark">닉네임</b-nav-item>

            <b-nav-item link-classes="text-dark">로그아웃</b-nav-item>
          </b-nav></b-col
        >
      </b-row>
    </b-container>

    <!-- 사이에 사진 하나 들어가야댐 -->
    <b-container>
      <b-row>
        <b-col></b-col>
        <b-col class="header-logo" align-v="center">
          <a href="/">
            <!--<img
          src="../assets/pinterest_profile_image.png"
          alt="Endki_portfolio"
          title=""
          style="display: block; margin: 0 auto; width: 100px; height: 100px"
        />  아래 b-img로 변경 -->
            <b-img
              v-bind="titleImage"
              center
              :src="require('../../assets/pinterest_profile_image.png')"
              alt="Center image"
            ></b-img>
          </a>
          <span
            class="header-desc"
            style="
              display: inline-block;
              width: 100%;
              text-align: center;
              color: gray;
            "
          >
            Endki-Portfolio
          </span>
        </b-col>
        <b-col></b-col>
      </b-row>
    </b-container>

    <!-- -->

    <b-navbar toggleable="lg" type="dark" variant="dark" class="nav">
      <b-container>
        <b-navbar-brand href="#"
          ><b-icon icon="house-door"></b-icon
        ></b-navbar-brand>
        <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>
        <b-collapse id="nav-collapse" is-nav>
          <b-navbar-nav>
            <b-nav-item href="#">포트폴리오</b-nav-item>
            <b-nav-item-dropdown text="JavaScript 게임" right>
              <b-dropdown-item to="/game/99dan">구구단</b-dropdown-item>
              <b-dropdown-item to="/game/speedCheck"
                >반응속도 체크</b-dropdown-item
              >
            </b-nav-item-dropdown>
            <b-nav-item to="/board">게시판</b-nav-item>
          </b-navbar-nav>

          <!-- Right aligned nav items -->
          <b-navbar-nav class="ms-auto">
            <b-nav-item href="#"><b-icon icon="bell"></b-icon></b-nav-item>
            <b-nav-item href="#">검색</b-nav-item>
            <b-nav-item href="#">전체메뉴</b-nav-item>
          </b-navbar-nav>
        </b-collapse>
      </b-container>
    </b-navbar>
  </div>
</template>
<script>
export default {
  data() {
    return {
      titleImage: {
        width: 100,
        height: 100,
      },
      items: [
        {
          heading1: 'table cell',
          heading2: 'table cell',
          heading3: 'table cell',
          heading4: 'table cell',
          heading5: 'table cell',
          heading6: 'table cell',
          heading7: 'table cell',
          heading8: 'table cell',
          heading9: 'table cell',
          heading10: 'table cell',
          heading11: 'table cell',
          heading12: 'table cell',
        },
      ],
    };
  },
};
</script>
<style scoped></style>
