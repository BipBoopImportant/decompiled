package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public class A extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private S f21238a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f21239b;

    public static class a extends A {
        public a(String str) {
            super(str);
        }
    }

    public A(String str) {
        super(str);
    }

    static A b() {
        return new A("Protocol message end-group tag did not match expected tag.");
    }

    static A c() {
        return new A("Protocol message contained an invalid tag (zero).");
    }

    static A d() {
        return new A("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static A f() {
        return new A("CodedInputStream encountered a malformed varint.");
    }

    static A g() {
        return new A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static A h() {
        return new A("Failed to parse the message.");
    }

    static A i() {
        return new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static A l() {
        return new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static A m() {
        return new A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f21239b;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f21239b = true;
    }

    public A k(S s10) {
        this.f21238a = s10;
        return this;
    }

    public A(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }
}
