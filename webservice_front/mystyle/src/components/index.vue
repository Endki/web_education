<template>
  <div id="thema_wrapper" class="wrapper ko">
    <aside class="at-lnb">
      <div class="at-container">
        <!-- LNB Left -->
        <div class="pull-left">
          <ul>
            <li><a href="javascript:;" id="favorite">즐겨찾기</a></li>
            <li class="hidden">
              <a href="https://gezip.net/rss/rss.php" target="_blank"
                >RSS 구독</a
              >
            </li>
            <!--홈짱-->
            <li><a>01월 02일(일)</a></li>
          </ul>
        </div>
        <!-- LNB Right -->
        <div class="pull-right">
          <ul>
            <li>
              <a href="https://gezip.net/bbs/board.php?bo_table=notice"
                >공지사항</a
              >
            </li>
            <!-- <li><a href="https://gezip.net/prison/prison.php">개펠다운</a></li> -->
            <!-- <li>
              <a href="https://gezip.net/bbs/board.php?bo_table=suggestion"
                >일름보게시판</a
              >
            </li> -->
            <li>
              <a href="https://gezip.net/bbs/board.php?bo_table=attendance"
                >출석부</a
              >
            </li>
            <!--홈짱-->

            <li>
              <a
                href="javascript:;"
                onclick="sidebar_open(&#39;sidebar-user&#39;);"
                ><b>user-ID</b></a
              >
            </li>
            <li class="sidebarLabel" style="display: none">
              <a
                href="javascript:;"
                onclick="sidebar_open(&#39;sidebar-response&#39;);"
              >
                알림 <b class="orangered sidebarCount">0</b>
              </a>
            </li>
            <li>
              <a href="https://gezip.net/bbs/logout.php?url=%2F">로그아웃 </a>
            </li>
          </ul>
        </div>
        <div class="clearfix"></div>
      </div>
    </aside>
    <header class="pc-header">
      <div class="at-container">
        <div class="header-logo">
          <a href="https://gezip.net/">
            <img src="" alt="Endki" title="" />
          </a>
          <span class="header-desc"> Endki </span>
        </div>
      </div>
      <div class="header-search">
        <form
          name="tsearch"
          method="get"
          onsubmit="return tsearch_submit(this);"
          role="form"
          class="form"
        >
          <input
            type="hidden"
            name="url"
            value="https://gezip.net/bbs/search.php"
          />
          <div class="input-group input-group-sm">
            <input
              type="text"
              name="stx"
              class="form-control input-sm"
              value=""
            />
            <span class="input-group-btn">
              <button type="submit" class="btn btn-sm">
                <i class="fa fa-search fa-lg"></i>
              </button>
            </span>
          </div>
        </form>

        <div class="header-keyword">
          <div class="basic-keyword">
            <span class="stx">
              <a href="https://gezip.net/bbs/search.php?stx="></a>
            </span>
          </div>
        </div>
      </div>
      <div class="clearfix"></div>
    </header>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
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
