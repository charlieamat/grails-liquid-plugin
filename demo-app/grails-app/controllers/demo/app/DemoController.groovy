package demo.app

import grails.validation.Validateable

class DemoController {

    def liquidService

    def index() {}

    def renderString(RenderStringCommand cmd) {
        render liquidService.render(cmd.template, cmd.variables)
    }

    def renderFile(RenderFileCommand cmd) {
        render liquidService.render(cmd.file, cmd.variables)
    }
}


