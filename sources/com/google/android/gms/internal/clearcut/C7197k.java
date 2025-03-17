package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.k  reason: case insensitive filesystem */
final class C7197k extends C7182f<Boolean> {
    C7197k(C7212p pVar, String str, Boolean bool) {
        super(pVar, str, bool, (C7194j) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final Boolean f(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f48362b, false));
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(this.f48362b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid boolean value in SharedPreferences for ".concat(valueOf) : new String("Invalid boolean value in SharedPreferences for "), e10);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object m(String str) {
        if (A2.f48144c.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (A2.f48145d.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.f48362b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(str);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
