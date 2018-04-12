package ru.del.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.del.component.IssueFilterUriBuilder;
import ru.del.domain.IssueFilter;
import ru.del.domain.IssueResponse;
import ru.del.domain.Issues;

import java.net.URI;

@CrossOrigin(origins={"${cors.url}"})
@RestController
public class IssuesController {

    @Value("${redmine.url}issues.json")
    private String defaultUrl;

    @Value("${redmine.url}issues/%s.json")
    private String url;

    private final IssueFilterUriBuilder uriBuilder;

    @Autowired
    public IssuesController(IssueFilterUriBuilder uriBuilder) {
        this.uriBuilder = uriBuilder;
    }

    @RequestMapping("/issues/{id}")
    public IssueResponse getSomeIssue(@PathVariable("id") String id) {
        return new RestTemplate().getForObject(String.format(url, id), IssueResponse.class);
    }

    @RequestMapping("/issues")
    public Issues getSomeIssues() {
        return new RestTemplate().getForObject(defaultUrl, Issues.class);
    }

    @RequestMapping(path = "/filter", method = RequestMethod.POST)
    public Issues search(@RequestBody IssueFilter filter) {
        URI uri = uriBuilder.filterUri(filter);
        return new RestTemplate().getForObject(uri, Issues.class);
    }
}
