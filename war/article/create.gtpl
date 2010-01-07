<% include '/WEB-INF/includes/header.gtpl' %>
    <% if(request.flash) { %>
        <span class="flash">${request.flash}</span>
    <% } %>

    <% if(params) { %>
        Process new article
        <% params.each { out << "<li> ${it} </li>" } %>
    <% } else { %>
        <% include '/WEB-INF/includes/create_form.gtpl' %>
    <% } %>

<% include '/WEB-INF/includes/footer.gtpl' %>
