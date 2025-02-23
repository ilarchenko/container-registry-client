package com.ilarchenko.registry.model;

import java.util.List;
import java.util.Map;

public class RegistryImagedDescriptor {

    private String mediaType;
    private String digest;
    private long size;
    private List<String> urls;
    private Map<String, String> annotations;

}
