package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

public final /* synthetic */ class O3 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ L3 f48768a;

    public /* synthetic */ O3(L3 l32) {
        this.f48768a = l32;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        L3.d(this.f48768a, sharedPreferences, str);
    }
}
