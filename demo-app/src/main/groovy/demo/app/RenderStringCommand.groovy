package demo.app

import grails.validation.Validateable

class RenderStringCommand implements Validateable {

    String template
    Map<String, Object> variables

    static constraints = {
        template nullable: false
    }
}
