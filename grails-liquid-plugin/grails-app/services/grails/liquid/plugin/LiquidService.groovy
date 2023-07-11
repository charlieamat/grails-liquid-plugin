package grails.liquid.plugin

import grails.gorm.transactions.Transactional
import liqp.Template
import liqp.parser.Inspectable

@Transactional
class LiquidService {

    String render(String input) {
        def template = Template.parse(input)
        return template.render()
    }

    String render(String input, Map<String, Object> variables) {
        def template = Template.parse(input)
        return template.render(variables)
    }

    String render(String input, String jsonMap) {
        def template = Template.parse(input)
        return template.render(jsonMap)
    }

    String render(String input, Inspectable object) {
        def template = Template.parse(input)
        return template.render(object)
    }

    String render(File file) {
        def template = Template.parse(file)
        return template.render()
    }

    String render(File file, Map<String, Object> variables) {
        def template = Template.parse(file)
        return template.render(variables)
    }

    String render(File file, String jsonMap) {
        def template = Template.parse(file)
        return template.render(jsonMap)
    }

    String render(File file, Inspectable object) {
        def template = Template.parse(file)
        return template.render(object)
    }

    String render(InputStream inputStream) {
        def template = Template.parse(inputStream)
        return template.render()
    }

    String render(InputStream inputStream, Map<String, Object> variables) {
        def template = Template.parse(inputStream)
        return template.render(variables)
    }

    String render(InputStream inputStream, String jsonMap) {
        def template = Template.parse(inputStream)
        return template.render(jsonMap)
    }


    String render(InputStream inputStream, Inspectable object) {
        def template = Template.parse(inputStream)
        return template.render(object)
    }
}
