package nts;

import java.io.Serializable;
import qE.C14941a;

/* renamed from: nts.ગ  reason: contains not printable characters */
public class C3705 implements C14941a, Serializable {

    /* renamed from: ϴ  reason: contains not printable characters */
    public final String f926;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public final String f927;

    /* renamed from: ગ  reason: contains not printable characters */
    public final String f928;

    /* renamed from: ഇ  reason: contains not printable characters */
    public final String f929;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public final String f930;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public final String f931;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public final String f932;

    public C3705(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f928 = str2;
        this.f930 = str;
        this.f926 = str4;
        this.f931 = str5;
        this.f929 = str3;
        this.f932 = str6;
        this.f927 = str7;
    }

    public String getAuthRequest() {
        return this.f927;
    }

    public String getDeviceData() {
        return this.f928;
    }

    public String getMessageVersion() {
        return this.f932;
    }

    public String getSDKAppID() {
        return this.f926;
    }

    public String getSDKEphemeralPublicKey() {
        return this.f929;
    }

    public String getSDKReferenceNumber() {
        return this.f931;
    }

    public String getSDKTransactionID() {
        return this.f930;
    }
}
