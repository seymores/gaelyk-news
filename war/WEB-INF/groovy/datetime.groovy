import com.ocpsoft.pretty.time.PrettyTime

java.util.Date.metaClass.prettyTime = {->
    def p = new PrettyTime()
    return p.format( delegate )
}

request.setAttribute 'datetime', new Date().prettyTime()

forward '/datetime.gtpl'
