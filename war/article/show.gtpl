<% include '/WEB-INF/includes/header.gtpl' %>

    <% if (request.article) {
        def article = request.article

    %>
        
        ${article.title}

    <% } else { %>
        Record not found.
    <% } %>

<% include '/WEB-INF/includes/footer.gtpl' %>

