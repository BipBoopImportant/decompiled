package com.google.firebase.perf.util;

import java.net.URL;
import java.net.URLConnection;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private final URL f68675a;

    public n(URL url) {
        this.f68675a = url;
    }

    public URLConnection a() {
        return this.f68675a.openConnection();
    }

    public String toString() {
        return this.f68675a.toString();
    }
}
