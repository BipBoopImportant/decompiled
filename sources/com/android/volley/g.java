package com.android.volley;

import android.text.TextUtils;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f46218a;

    /* renamed from: b  reason: collision with root package name */
    private final String f46219b;

    public g(String str, String str2) {
        this.f46218a = str;
        this.f46219b = str2;
    }

    public final String a() {
        return this.f46218a;
    }

    public final String b() {
        return this.f46219b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.f46218a, gVar.f46218a) && TextUtils.equals(this.f46219b, gVar.f46219b);
    }

    public int hashCode() {
        return (this.f46218a.hashCode() * 31) + this.f46219b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f46218a + ",value=" + this.f46219b + "]";
    }
}
