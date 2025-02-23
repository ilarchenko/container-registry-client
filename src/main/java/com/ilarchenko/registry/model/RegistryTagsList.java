package com.ilarchenko.registry.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RegistryTagsList {

    private String name;
    private List<String> tags;

    public RegistryTagsList(String name) {
        this.name = name;
        this.tags = Collections.emptyList();
    }

    public RegistryTagsList(String name, Collection<String> tags) {
        this.name = name;
        this.tags = new ArrayList<>(tags);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getTags() {
        return Collections.unmodifiableList(this.tags);
    }

    public boolean tagExists(String tag) {
        return this.tags.contains(tag);
    }

}
