import com.google.appengine.api.datastore.Entity


System.out.println(" * Processing new article   ### >>> ${params} ")

if (params && user) {
    def article = new Entity("article")
    article.title = params.title ?: "na"
    article.url = params.url ?: "na"
    article.description = params.description ?: ""
    article.submiter = user
    article.dateCreated = new Date()
    article.point = 1
    article.complains = 0
    article.save()

    request.flash = "Thank you, the news \"${article.title}\" is submited successfully"
    System.out.println( request.flash )
    redirect "/latest"
    return
}

if (!user) {
    String l = " <a href=\"${users.createLoginURL('/')}\">login</a>"
    request.flash = "Please ${l} first before proceed."
}

forward "/article/create.gtpl"
