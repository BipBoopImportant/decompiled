package com.google.firebase.installations;

import Fb.l;

public class d extends l {

    /* renamed from: a  reason: collision with root package name */
    private final a f68289a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f68289a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f68289a = aVar;
    }
}
