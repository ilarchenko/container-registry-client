package com.ilarchenko.registry.model;

import java.util.List;
import java.util.Map;

public interface RegistryImageManifest {

    int getSchemaVersion();

    String getMediaType();

    RegistryImagedDescriptor getConfig();

    List<RegistryImagedDescriptor> getLayers();

    default Map<String, String> getAnnotations() {
        return null;
    }
}
