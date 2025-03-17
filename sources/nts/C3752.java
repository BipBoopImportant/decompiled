package nts;

import sE.C15044d;

/* renamed from: nts.ภ  reason: contains not printable characters */
public class C3752 implements C15044d {

    /* renamed from: ગ  reason: contains not printable characters */
    public final String f1146;

    /* renamed from: ഇ  reason: contains not printable characters */
    public final String f1147;

    public C3752(C3675 r32) {
        this.f1147 = "" + r32.m797();
        this.f1146 = r32.getMessage();
    }

    public String getErrorCode() {
        return this.f1147;
    }

    public String getErrorMessage() {
        return this.f1146;
    }

    public C3752(String str, String str2) {
        this.f1147 = str;
        this.f1146 = str2;
    }
}
