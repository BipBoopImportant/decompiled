package com.oppwa.mobile.connect.provider.model.response;

import androidx.annotation.Keep;

@Keep
public class Image {
    private ImageType type;
    private String url;
    private String width;

    public ImageType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getWidth() {
        return this.width;
    }
}
