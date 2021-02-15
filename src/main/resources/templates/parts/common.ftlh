<#macro common>
    <html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>
        <script src="static/js/common.js"></script>
        <link rel="stylesheet" href="/static/css/style.css">
    </head>
    <body>
        <div>
            <button class="activeButton buttons" onclick="antiHype(this)">Banners</button>
            <button class="unActiveButton buttons" onclick="antiHype(this)">Banners</button>
            <button class="unActiveButton buttons" onclick="antiHype(this)">Categories</button>
        </div>
        <#nested>
    </body>
    </html>
</#macro>