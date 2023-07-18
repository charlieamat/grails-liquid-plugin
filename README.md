# Grails Liquid Plugin
A Grails plugin for the Liquid markup language and template engine.

# Installation
To use the Grails Liquid Plugin, add the following dependency to your `build.gradle` file:

```groovy
implementation 'io.github.charlesamat:grails-liquid-plugin:1.0.1'
```

# Features
The Grails Liquid plugin provides a seamless integration of the [Liquid markup language](https://github.com/Shopify/liquid) and template engine by Shopify into your Grails applications. It acts as a wrapper, exposing Liquid functionality through service calls and taglibs, making it easy to leverage Liquid's powerful templating features within your Grails projects.

### Liquid Service
The Liquid service allows you to render Liquid templates using various input sources and provides flexibility in passing variables to the templates.

**Template from String**
```groovy
String templateString = "<h1>Hello, World!</h1>"
String result = liquidService.render(templateString)
```

**Template from File**
```groovy
File templateFile = new File("/path/to/template.liquid")
Map<String, Object> variables = ["name": "John"]
String result = liquidService.render(templateFile, variables)
```

### Liquid TagLib
The Liquid taglib provides custom tag library support for rendering Liquid templates directly within your GSP views.

**Template from String**
```html
<liquid:renderString input="&lt;h1&gt;Hello, {{ name }}!&lt;/h1&gt;" variables="${['name': 'John']}"/>
```

**Template from File**
```html
<liquid:renderFile uri="/WEB-INF/templates/template.liquid" variables="${['name': 'John']}"/>
```

# Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request on GitHub.

# License
This plugin is released under the MIT License. See the [LICENSE](LICENSE) file for more information.

# Additional Links
- [Liquid markup language](https://github.com/Shopify/liquid)
- [Liqp (Java port of Liquid)](https://github.com/bkiers/Liqp)
