package com.ilarchenko.registry.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RegistryCatalog {

    private List<String> repositories;

    public RegistryCatalog(Collection<String> repos) {
        this.repositories = new ArrayList<>(repos);

    }

    public List<String> getRepositories() {
        return Collections.unmodifiableList(repositories);
    }

    public boolean exists(String repoName) {
        return repositories.contains(repoName);
    }

}
