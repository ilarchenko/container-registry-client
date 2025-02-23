package com.ilarchenko.registry;

import com.ilarchenko.registry.model.RegistryCatalog;
import com.ilarchenko.registry.model.RegistryTagsList;

public interface DiscoveryRegistryClient {

    RegistryCatalog catalog();

    default RegistryCatalog catalog(int n) {
        return catalog();
    }

    default RegistryCatalog catalog(int n, String last) {
        return catalog();
    }

    RegistryTagsList tags(String repository);

    default RegistryTagsList tags(String repository, int n) {
        return tags(repository);
    }

    default RegistryTagsList tags(String repository, int n, String last) {
        return tags(repository);
    }
}
