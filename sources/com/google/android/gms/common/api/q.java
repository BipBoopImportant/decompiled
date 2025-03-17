package com.google.android.gms.common.api;

import G9.C6521b;

public final class q extends UnsupportedOperationException {

    /* renamed from: a  reason: collision with root package name */
    private final C6521b f48045a;

    public q(C6521b bVar) {
        this.f48045a = bVar;
    }

    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f48045a));
    }
}
