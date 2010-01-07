
    <div id="create_form_container">

        <div id="create_form_info">
            <h4>Submit news or question for the group.</h4>
        </div>

        <form action="/article/create.groovy" method="POST" id="create_form">
            
            <label name="title" for="title">Title</label>
            <input id="title" name="title" class="field"/>
        
            <br/>

            <label name="url" for="url">URL</label>
            <input id="url" name="url" class="field"/>

            <br/>
            or
            <label name="description" for="desc">Description</label>
            <br/>
            <textarea id="desc" name="description" class="field"></textarea>

            <br/> <br/>
            <input type="submit" value="Continue"/>
        </form>
    </div>


