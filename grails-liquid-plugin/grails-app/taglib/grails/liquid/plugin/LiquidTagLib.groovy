package grails.liquid.plugin

import javax.servlet.ServletContext

class LiquidTagLib {
    static namespace = "liquid"

    def liquidService
    ServletContext servletContext

    /**
     * @attr input REQUIRED
     * @attr variables
     */
    def renderString = { attrs, body ->
        out << liquidService.render(attrs.input, attrs.variables)
    }

    /**
     * @attr uri REQUIRED
     * @attr variables
     */
    def renderFile = { attrs, body ->
        def uri = attrs.uri as String
        def resource = servletContext.getResource(uri)
        def file = new File(resource.file)
        out << liquidService.render(file, attrs.variables)
    }
}
