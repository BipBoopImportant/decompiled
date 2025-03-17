package eJ;

import java.io.IOException;

/* renamed from: eJ.k  reason: case insensitive filesystem */
public class C17200k extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private C17206q f143071a = null;

    public C17200k(String str) {
        super(str);
    }

    static C17200k b() {
        return new C17200k("Protocol message end-group tag did not match expected tag.");
    }

    static C17200k c() {
        return new C17200k("Protocol message contained an invalid tag (zero).");
    }

    static C17200k d() {
        return new C17200k("Protocol message had invalid UTF-8.");
    }

    static C17200k e() {
        return new C17200k("Protocol message tag had invalid wire type.");
    }

    static C17200k f() {
        return new C17200k("CodedInputStream encountered a malformed varint.");
    }

    static C17200k g() {
        return new C17200k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C17200k h() {
        return new C17200k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static C17200k j() {
        return new C17200k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C17200k k() {
        return new C17200k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public C17206q a() {
        return this.f143071a;
    }

    public C17200k i(C17206q qVar) {
        this.f143071a = qVar;
        return this;
    }
}
