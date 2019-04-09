<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html>
<head>
<base href="<%=basepath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>关于_杨青个人博客 - 一个站在web前端设计之路的女技术员个人博客网站</title>
<meta name="keywords" content="个人博客,杨青个人博客,个人博客模板,杨青" />
<meta name="description" content="杨青个人博客，是一个站在web前端设计之路的女程序员个人网站，提供个人博客模板免费资源下载的个人原创网站。" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="static/css/base.css" rel="stylesheet">
<link href="static/css/index.css" rel="stylesheet">
<link href="static/css/m.css" rel="stylesheet">

<%--静态包含 --%>
<%@ include file="/WEB-INF/jsp/common_menu.jsp"%>

<article>
  <h1 class="t_nav"><span>像“草根”一样，紧贴着地面，低调的存在，冬去春来，枯荣无恙。</span><a href="/" class="n1">网站首页</a><a href="/" class="n2">留言</a></h1>
  <div class="ab_box">
    <div class="leftbox">
      <div class="newsview">
        <div class="news_infos"> 此处安装插件 </div>
      </div>
    </div>
    <div class="rightbox">
      <div class="aboutme">
        <h2 class="hometitle">关于我</h2>
        <div class="avatar"> <img src="images/avatar.jpg"> </div>
        <div class="ab_con">
          <p>网名：dancesmile | 杨青</p>
          <p>职业：Web前端设计师、网页设计 </p>
          <p>个人微信：yangqq_1987</p>
          <p>邮箱：dancesmiling@qq.com</p>
        </div>
      </div>
      <div class="weixin">
        <h2 class="hometitle">微信关注</h2>
        <ul>
          <img src="images/wx.jpg">
        </ul>
      </div>
    </div>
  </div>
</article>
<footer>
  <p>Design by <a href="/">杨青个人博客</a> <a href="/">蜀ICP备11002373号-1</a></p>
</footer>
<script src="static/js/nav.js"></script>
</body>
</html>
