package com.oppwa.mobile.connect.provider.model.response.transaction;

import androidx.annotation.Keep;
import java.util.List;

@Keep
public class Redirect {
    private List<Parameter> parameters;
    private String shortUrl;
    private String url;

    @Keep
    public static class Parameter {
        private String name;
        private String value;

        public String getName() {
            return this.name;
        }

        public String getValue() {
            return this.value;
        }
    }

    public List<Parameter> getParameters() {
        return this.parameters;
    }

    public String getShortUrl() {
        return this.shortUrl;
    }

    public String getUrl() {
        return this.url;
    }
}
