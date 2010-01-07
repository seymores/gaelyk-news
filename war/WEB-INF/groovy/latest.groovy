import com.google.appengine.api.datastore.*
import static com.google.appengine.api.datastore.FetchOptions.Builder.*


def query = new Query("article")
query.addSort("dateCreated", Query.SortDirection.DESCENDING)
PreparedQuery preparedQuery = datastore.prepare(query)
 
def result = preparedQuery.asList( withLimit(20) )
request.result = result

forward  '/latest.gtpl'
