package com.google.protobuf;

import java.io.IOException;

public class B extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private S f69192a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f69193b;

    public static class a extends B {
        public a(String str) {
            super(str);
        }
    }

    public B(String str) {
        super(str);
    }

    static B b() {
        return new B("Protocol message end-group tag did not match expected tag.");
    }

    static B c() {
        return new B("Protocol message contained an invalid tag (zero).");
    }

    static B d() {
        return new B("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static B f() {
        return new B("CodedInputStream encountered a malformed varint.");
    }

    static B g() {
        return new B("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static B h() {
        return new B("Failed to parse the message.");
    }

    static B i() {
        return new B("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static B k() {
        return new B("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f69193b;
    }

    public B j(S s10) {
        this.f69192a = s10;
        return this;
    }

    public B(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }
}
