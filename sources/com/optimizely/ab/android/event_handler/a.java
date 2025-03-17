package com.optimizely.ab.android.event_handler;

import java.net.URL;

class a {

    /* renamed from: a  reason: collision with root package name */
    private final URL f122280a;

    /* renamed from: b  reason: collision with root package name */
    private final String f122281b;

    a(URL url, String str) {
        this.f122280a = url;
        this.f122281b = str;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f122281b;
    }

    /* access modifiers changed from: package-private */
    public URL b() {
        return this.f122280a;
    }

    public String toString() {
        return String.format("Sending %s to %s", new Object[]{this.f122281b, this.f122280a});
    }
}
