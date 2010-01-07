<% include '/WEB-INF/includes/header.gtpl' %>

    <div id="news_list">

        <% if (request.flash) { %>
            <span class="flash">${request.flash}</span>
        <% } %>

        <ul id="news_list">
            <% request.result?.each { %>
                <li> 
                    <strong>${it.title} </strong>
                    <br/>
                    <span class="details">Point: ${it.point} by ${it.submiter}, date: ${it.dateCreated} | 0 comment </span>
                </li>
            <% } %>

        </ul>

    </div>

<% include '/WEB-INF/includes/footer.gtpl' %>

