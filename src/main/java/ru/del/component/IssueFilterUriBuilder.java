package ru.del.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;
import ru.del.domain.IssueFilter;

import java.net.URI;

@Component
public class IssueFilterUriBuilder {

    @Value("${redmine.url}")
    private String baseUrl;

    public URI filterUri(IssueFilter filter) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl).path("issues.json");
        for (String name : filter.getParameters().keySet()) {
            builder = builder.queryParam(name, filter.getParameters().get(name));
        }
        return builder.build().toUri();
    }
}