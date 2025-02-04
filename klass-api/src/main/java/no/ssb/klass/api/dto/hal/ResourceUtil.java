package no.ssb.klass.api.dto.hal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.TemplateVariable;
import org.springframework.hateoas.TemplateVariables;
import org.springframework.hateoas.UriTemplate;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

public final class ResourceUtil {
    private ResourceUtil() {
        // Utility class
    }

    public static UriTemplate createUriTemplate(ControllerLinkBuilder linkBuilder, String... parameters) {
        String baseUri = linkBuilder.toUriComponentsBuilder().replaceQuery(null).build().toUriString();

        return new UriTemplate(baseUri, createParameters(parameters));
    }

    private static TemplateVariables createParameters(String... parameters) {
        List<TemplateVariable> templateVariables = new ArrayList<>();
        for (String parameter : parameters) {
            templateVariables.add(new TemplateVariable(parameter, TemplateVariable.VariableType.REQUEST_PARAM));
        }
        return new TemplateVariables(templateVariables);
    }
}
