<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Liquid Template Examples</title>
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>
</head>

<body>
<!-- Example 1: Render from String -->
<div id="RenderString">
    <h1>Example 1: Render from String</h1>
    <span class="output"></span>
</div>

<!-- Example 2: Render from File -->
<div id="RenderFile">
    <h1>Example 2: Render from File</h1>
    <span class="output"></span>
</div>

<!-- Example 3.1: Render from String (TagLib) -->
<h1>Example 3.1: Render from String (TagLib) with Map variables</h1>
<liquid:renderString input="Hello, {{ name }}!" variables="[name: 'World']"/>

<!-- Example 3.2: Render from String (TagLib) -->
<h1>Example 3.2: Render from String (TagLib) with JSON map string</h1>
<liquid:renderString input="Hello, {{ name }}!" variables='{"name" : "World"}'/>

<!-- Example 4.1: Render from File (TagLib) -->
<h1>Example 4.1: Render from File (TagLib) with Map variables</h1>
<liquid:renderFile uri="/example.liquid" variables="[name: 'World']"/>


<!-- Example 4.2: Render from File (TagLib) -->
<h1>Example 4.2: Render from File (TagLib) with JSON map string</h1>
<liquid:renderFile uri="/example.liquid" variables='{"name" : "World"}'/>
<script>
    $.ajax({
        url: '${createLink(action: "renderString")}',
        method: 'POST',
        data: {
            template: 'Hello, {{ name }}!',
            variables: {name: "World"}
        },
        success: response => $('#RenderString > .output').html(response)
    });

    $.ajax({
        url: '${createLink(action: "renderFile")}',
        method: 'POST',
        data: {
            uri: '/example.liquid',
            variables: {name: "World"}
        },
        success: response => $('#RenderFile > .output').html(response)
    });
</script>
</body>
</html>