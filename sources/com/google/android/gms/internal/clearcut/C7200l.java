package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.l  reason: case insensitive filesystem */
final class C7200l extends C7182f<String> {
    C7200l(C7212p pVar, String str, String str2) {
        super(pVar, str, str2, (C7194j) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final String f(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.f48362b, (String) null);
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(this.f48362b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(valueOf) : new String("Invalid string value in SharedPreferences for "), e10);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object m(String str) {
        return str;
    }
}
