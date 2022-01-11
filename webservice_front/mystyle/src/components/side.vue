<template>
  <div class="hidden-sm hidden-xs">
    <!-- 로그인 시작 -->
    <div class="div-title-underbar">
      <span class="div-title-underbar-bold border-navy font-16 en">
        <b>Profile</b>
      </span>
    </div>

    <div class="widget-box">
      <div class="basic-outlogin">
        <div class="pull-right">
          <a
            href="https://gezip.net/bbs/member_confirm.php?url=member_leave.php"
            class="leave-me at-tip"
            data-original-title="<nobr>회원탈퇴</nobr>"
            data-toggle="tooltip"
            data-placement="top"
            data-html="true"
          >
            <span class="text-muted"><i class="fa fa-sign-out fa-lg"></i></span>
          </a>
        </div>
        <div class="profile">
          <a
            href="https://gezip.net/bbs/myphoto.php"
            target="_blank"
            class="win_memo"
            title="사진등록"
          >
            <div class="photo pull-left">
              <img
                src="../../public/pig.png"
                title=""
                style="width: 32px; height: 32px"
              />
            </div>
          </a>
          <h3>뚱키</h3>
          <div class="font-12 text-muted" style="letter-spacing: -1px">
            말티즈
          </div>
          <div class="clearfix"></div>
        </div>

        <div
          class="at-tip"
          data-original-title="1,378점 추가획득시 레벨업합니다."
          data-toggle="tooltip"
          data-placement="top"
          data-html="true"
          style="margin: 10px 0px"
        >
          <div
            class="div-progress progress progress-striped"
            style="margin: 0px"
          >
            <div
              class="progress-bar progress-bar-info active progress-bar-exp"
              role="progressbar"
              aria-valuenow="37"
              aria-valuemin="0"
              aria-valuemax="100"
              style="width: 37%"
            >
              <span class="sr-only"> Lv.13 </span>
            </div>
          </div>
          <div
            class="sr-score pull-right"
            style="color: #fff; margin-top: -28px"
          >
            19,422 (37.3%)
          </div>
        </div>

        <div class="text-muted">
          <div class="pull-left">
            <!--
				<a href="https://gezip.net/bbs/response.php" target="_blank" class="win_memo">
					알림				</a>
				-->

            <a href="javascript:;" onclick="sidebar_open('sidebar-response');">
              알림
              <span class="sidebarLabel" style="display: none">
                <b class="orangered sidebarCount">0</b>
              </span>
            </a>

            <span class="lightgray">&nbsp;|&nbsp;</span>
            <a
              href="https://gezip.net/bbs/memo.php"
              target="_blank"
              class="win_memo"
            >
              쪽지
            </a>
          </div>
          <div class="pull-right">
            <a
              href="https://gezip.net/bbs/scrap.php"
              target="_blank"
              class="win_scrap"
            >
              스크랩
            </a>
          </div>
          <div class="clearfix"></div>
        </div>

        <div class="login-line">
          <div class="pull-left">
            <a
              href="https://gezip.net/bbs/point.php"
              target="_blank"
              class="win_point"
            >
              <i class="fa fa-gift"></i> MP <b class="red">21,233,069,766</b>
            </a>
          </div>

          <div class="pull-right" style="letter-spacing: -1px">
            <!--
				<a href="#" class="asideButton">
				-->
            <a href="javascript:;" onclick="sidebar_open('sidebar-user');">
              <span class="text-muted">마이메뉴</span>
            </a>
            <span class="lightgray">&nbsp;|&nbsp;</span>
            <a
              href="https://gezip.net/bbs/member_confirm.php?url=register_form.php"
            >
              <span class="text-muted">정보수정</span>
            </a>
          </div>

          <div class="clearfix"></div>
        </div>

        <a
          href="https://gezip.net/bbs/logout.php?url=%2F"
          class="btn btn-navy btn-block en"
        >
          <i class="fa fa-power-off"></i> Logout
        </a>
      </div>
    </div>
    <!-- 로그인 끝 -->
  </div>
</template>

<script>
export default {};
</script>

<style>
.widget-index .div-title-underbar {
  margin-bottom: 15px;
}
.div-title-underbar {
  padding: 0;
  margin: 0;
  border-bottom: 1px solid #cccccc;
}
body.is-pc .ko {
  font-size: 12px;
}
.ko,
.ko small {
  font-family: dotum, sans-serif;
}
body {
  font-family: dotum;
  line-height: 22px;
  font-size: 14px;
  color: rgb(51, 51, 51);
  background-color: #fff;
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
body {
  font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
  font-size: 14px;
  line-height: 1.42857143;
  color: #333;
  background-color: #fff;
}
</style>
