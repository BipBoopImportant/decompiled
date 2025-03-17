package com.google.protobuf;

import java.util.List;

public class n0 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f69361a = null;

    public n0(S s10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public B a() {
        return new B(getMessage());
    }
}
