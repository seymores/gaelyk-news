<% include '/WEB-INF/includes/header.gtpl' %>

    <div id="news_list">

        <% if (request.flash) { %>
            <span class="flash">${request.flash}</span>
        <% } %>

        <ul id="news_list">
            <%  int n = 1
                request.result?.each { %>
                <li> 
                    <strong>${n++}. <a id="vote" href="#${it.key.id}" onclick="return vote(this)"><img src="/images/arrow.gif"></a> <a href="${it.url}" class="news_link">${it.title} </a></strong>
                    <br/>
                    <span class="details">${it.point} ${it.point > 1 ? 'points' : 'point' }, by ${it.submiter}, ${it.dateCreated?.prettyTime()} | <a href="/show/${it.key.id}">0 comment</a></span>
                </li>
            <% } %>

        </ul>

    </div>
    <script type="text/javascript">
    function vote(n) { console.log(n, n.href.split('#')[1] ); return false; }
    </script>

<% include '/WEB-INF/includes/footer.gtpl' %>

