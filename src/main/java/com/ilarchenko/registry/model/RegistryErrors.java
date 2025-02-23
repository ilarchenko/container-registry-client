package com.ilarchenko.registry.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class RegistryErrors {

    private List<RegistryError> errors;

    public RegistryErrors(Collection<RegistryError> errors) {
        this.errors = new ArrayList<>(errors);
    }

    public List<RegistryError> getErrors() {
        return Collections.unmodifiableList(this.errors);
    }

    public final class RegistryError {

        private String code;
        private String message;
        private String detail;

        public RegistryError(String code, String message, String detail) {
            this.code = code;
            this.message = message;
            this.detail = detail;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

        public String getDetail() {
            return detail;
        }
    }

}
