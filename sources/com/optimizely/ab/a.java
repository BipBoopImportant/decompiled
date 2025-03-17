package com.optimizely.ab;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f122260a;

    /* renamed from: b  reason: collision with root package name */
    private String f122261b;

    public a(String str, String str2) {
        if (str != null) {
            this.f122260a = str;
            this.f122261b = str2;
            return;
        }
        throw new NullPointerException("FlagKey must not be null, please provide a valid input.");
    }

    public String a() {
        return this.f122260a;
    }

    public String b() {
        return this.f122260a + "-$opt$-" + c();
    }

    public String c() {
        String str = this.f122261b;
        return str != null ? str : "$opt-null-rule-key";
    }
}
