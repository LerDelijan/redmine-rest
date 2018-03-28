package ru.del.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.del.component.IssueFilterUriBuilder;
import ru.del.domain.IssueFilter;
import ru.del.domain.IssueResponse;
import ru.del.domain.Issues;

import java.net.URI;

@CrossOrigin(origins={"http://localhost:3000"})
@RestController
public class IssuesController {

    private static final String DEFAULT_URL = "http://192.168.1.106:3000/issues.json";
    private static final String URL = "http://192.168.1.106:3000/issues/%s.json";

    private final IssueFilterUriBuilder uriBuilder;

    @Autowired
    public IssuesController(IssueFilterUriBuilder uriBuilder) {
        this.uriBuilder = uriBuilder;
    }

    @RequestMapping("/issues/{id}")
    public IssueResponse getSomeIssue(@PathVariable("id") String id) {
        return new RestTemplate().getForObject(String.format(URL, id), IssueResponse.class);
    }

    @RequestMapping("/issues")
    public Issues getSomeIssues() {
        return new RestTemplate().getForObject(DEFAULT_URL, Issues.class);
    }

    @RequestMapping(path = "/filter", method = RequestMethod.POST)
    public Issues search(@RequestBody IssueFilter filter) {
        URI uri = uriBuilder.filterUri(filter);
        return new RestTemplate().getForObject(uri, Issues.class);
    }
}
