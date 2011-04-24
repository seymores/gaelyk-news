<html>
    <head>
        <title>Gaelyk News App</title>
        
        <link rel="shortcut icon" href="/images/favicon.png" type="image/png">
        <link rel="icon" href="/images/favicon.png" type="image/png">
        
        <link rel="stylesheet" type="text/css" href="/css/reset.css"/>
        <link rel="stylesheet" type="text/css" href="/css/text.css"/>
        <link rel="stylesheet" type="text/css" href="/css/960.css"/>
        <link rel="stylesheet" type="text/css" href="/css/main.css"/>

        <script type="text/javascript" src="/js/application.js"></script>
        <script type="text/javascript" src="http://www.google.com/jsapi"></script>
        <script type="text/javascript">
          google.load("jquery", "1.3.2");
         
          google.setOnLoadCallback(function() {
            // Place init code here instead of \$(document).ready()
          });
        </script>
        
    </head>
    <body>

        <div class="container_16 header">
            <div class="grid_10 main_menu">
                <span id="title"> <a href="/">Gaelyk News</a></span> 
                <a href="/latest">latest</a> 
                | 
                <a href="/top">top</a>
                | 
                <a href="/stats">stats</a>
                | 
                <a href="/submit">submit</a>
            </div>
            <div class="grid_6 account_menu">
                <%
                    if (user) {
                        out << "${user} | <a href=\"${users.createLogoutURL('/')}\">logout</a> "
                    } else {
                        out << "<a href=\"${users.createLoginURL('/')}\">login</a>"
                        out << " | <a href=\"/register\">register</a>"
                    }
                %>
            </div>
        </div>

        <div class="container_16 body">

