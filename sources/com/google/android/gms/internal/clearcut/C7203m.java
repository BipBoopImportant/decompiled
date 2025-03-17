package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.m  reason: case insensitive filesystem */
final class C7203m extends C7182f {

    /* renamed from: m  reason: collision with root package name */
    private final Object f48429m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private String f48430n;

    /* renamed from: o  reason: collision with root package name */
    private Object f48431o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ C7209o f48432p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7203m(C7212p pVar, String str, Object obj, C7209o oVar) {
        super(pVar, str, obj, (C7194j) null);
        this.f48432p = oVar;
    }

    /* access modifiers changed from: protected */
    public final Object f(SharedPreferences sharedPreferences) {
        try {
            return m(sharedPreferences.getString(this.f48362b, ""));
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(this.f48362b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid byte[] value in SharedPreferences for ".concat(valueOf) : new String("Invalid byte[] value in SharedPreferences for "), e10);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Object m(String str) {
        Object obj;
        try {
            synchronized (this.f48429m) {
                if (!str.equals(this.f48430n)) {
                    Object a10 = this.f48432p.a(Base64.decode(str, 3));
                    this.f48430n = str;
                    this.f48431o = a10;
                }
                obj = this.f48431o;
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f48362b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb2.append("Invalid byte[] value for ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
