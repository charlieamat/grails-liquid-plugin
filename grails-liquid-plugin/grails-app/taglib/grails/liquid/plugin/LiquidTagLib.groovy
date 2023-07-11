package grails.liquid.plugin

import liqp.parser.Inspectable

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
        checkType(attrs.variables)
        out << liquidService.render(attrs.input, attrs.variables)
    }

    /**
     * @attr uri REQUIRED
     * @attr variables
     */
    def renderFile = { attrs, body ->
        checkType(attrs.variables)
        def uri = attrs.uri as String
        def resource = servletContext.getResource(uri)
        def file = new File(resource.file)
        out << liquidService.render(file, attrs.variables)
    }

    private static def checkType(def variables) {
        if (!(variables instanceof String || variables instanceof Map) || variables instanceof Inspectable) {
            throw new IllegalArgumentException("attr.variables is not of type String or Map")
        }
    }
}
