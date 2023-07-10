package demo.app

import grails.validation.Validateable

class RenderFileCommand implements Validateable {

    def servletContext

    String uri
    Map<String, Object> variables

    static constraints = {
        uri nullable: false
    }

    File getFile() {
        def resource = servletContext.getResource(uri)
        return new File(resource.file)
    }
}
