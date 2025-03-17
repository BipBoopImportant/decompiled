package nts;

import sE.C15042b;

/* renamed from: nts.ᜇ  reason: contains not printable characters */
public class C3959 implements C15042b {

    /* renamed from: ϴ  reason: contains not printable characters */
    public final String f2348;

    /* renamed from: ગ  reason: contains not printable characters */
    public final String f2349;

    /* renamed from: ഇ  reason: contains not printable characters */
    public final String f2350;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public final String f2351;

    public C3959(String str, String str2, String str3, String str4) {
        this.f2350 = str;
        this.f2349 = str2;
        this.f2351 = str3;
        this.f2348 = str4;
    }

    public String getErrorCode() {
        return this.f2349;
    }

    public String getErrorDescription() {
        return this.f2351;
    }

    public String getErrorDetails() {
        return this.f2348;
    }

    public String getTransactionID() {
        return this.f2350;
    }

    public String toString() {
        return String.format(C3727.m1052("x_OA[HI_MJHnd\u001b\u0002\u0006O\u0011\u001ezJKUIwZRR\n\u0011\u0017@ -Jj{jxbtqohn;\"&o1>[}m{rxf,75b", 0, 62, 18), new Object[]{this.f2350, this.f2349, this.f2351, this.f2348});
    }
}
