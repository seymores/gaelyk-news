// example routes, please remove them or update them as appropriate
//get "/blog/@year/@month/@day/@title", forward: "/WEB-INF/groovy/blog.groovy?year=@year&month=@month&day=@day&title=@title"
//get "/something", redirect: "/blog/2008/10/20/something"
//get "/book/isbn/@isbn", forward: "/WEB-INF/groovy/book.groovy?isbn=@isbn", validate: { isbn ==~ /\d{9}(\d|X)/ }

get "/latest", forward: "/WEB-INF/groovy/latest.groovy"
get "/top", forward: "/WEB-INF/groovy/top.groovy"
get "/stats", forward: "/WEB-INF/groovy/stats.groovy"

get "/info", forward: "/WEB-INF/groovy/article/info.groovy"
get "/list", forward: "/WEB-INF/groovy/article/list.groovy"
get "/create", forward: "/WEB-INF/groovy/article/create.groovy"
get "/submit", forward: "/WEB-INF/groovy/article/create.groovy"
get "/show/@id", forward: "/WEB-INF/groovy/article/show.groovy?id=@id"

