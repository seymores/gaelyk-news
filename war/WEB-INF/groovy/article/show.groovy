import com.google.appengine.api.datastore.*
import static com.google.appengine.api.datastore.FetchOptions.Builder.*
import com.google.appengine.api.datastore.KeyFactory


try {
    def keyId = Long.parseLong(params.id)
    def key = KeyFactory.createKey("article", keyId)

    def article = datastore.get(key)
    request.article = article

} catch (e) {
    e.printStackTrace()
}

forward '/article/show.gtpl'
