package grails.liquid.plugin

import grails.gorm.transactions.Transactional
import liqp.Template

@Transactional
class LiquidService {

    String render(String input) {
        def template = Template.parse(input)
        return template.render()
    }

    String render(String input, Map<String, Object> variables) {
        if (variables == null) {
            return render(input)
        }
        def template = Template.parse(input)
        return template.render(variables)
    }

    String render(File file) {
        def template = Template.parse(file)
        return template.render()
    }

    String render(File file, Map<String, Object> variables) {
        if (variables == null) {
            return render(file)
        }
        def template = Template.parse(file)
        return template.render(variables)
    }
}
