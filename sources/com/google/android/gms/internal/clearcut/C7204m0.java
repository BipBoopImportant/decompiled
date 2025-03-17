package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.m0  reason: case insensitive filesystem */
public class C7204m0 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private M0 f48433a = null;

    public C7204m0(String str) {
        super(str);
    }

    static C7204m0 a() {
        return new C7204m0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static C7204m0 b() {
        return new C7204m0("Protocol message contained an invalid tag (zero).");
    }

    static C7207n0 c() {
        return new C7207n0("Protocol message tag had invalid wire type.");
    }

    static C7204m0 d() {
        return new C7204m0("Failed to parse the message.");
    }

    static C7204m0 e() {
        return new C7204m0("Protocol message had invalid UTF-8.");
    }

    public final C7204m0 f(M0 m02) {
        this.f48433a = m02;
        return this;
    }
}
