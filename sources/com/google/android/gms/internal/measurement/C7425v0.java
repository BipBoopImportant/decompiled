package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.v0  reason: case insensitive filesystem */
public final class C7425v0 implements SharedPreferences {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f49094a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Set<SharedPreferences.OnSharedPreferenceChangeListener> f49095b = new HashSet();

    private final <T> T a(String str, T t10) {
        T t11 = this.f49094a.get(str);
        return t11 != null ? t11 : t10;
    }

    public final boolean contains(String str) {
        return this.f49094a.containsKey(str);
    }

    public final SharedPreferences.Editor edit() {
        return new C7449y0(this);
    }

    public final Map<String, ?> getAll() {
        return this.f49094a;
    }

    public final boolean getBoolean(String str, boolean z10) {
        return ((Boolean) a(str, Boolean.valueOf(z10))).booleanValue();
    }

    public final float getFloat(String str, float f10) {
        return ((Float) a(str, Float.valueOf(f10))).floatValue();
    }

    public final int getInt(String str, int i10) {
        return ((Integer) a(str, Integer.valueOf(i10))).intValue();
    }

    public final long getLong(String str, long j10) {
        return ((Long) a(str, Long.valueOf(j10))).longValue();
    }

    public final String getString(String str, String str2) {
        return (String) a(str, str2);
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        return (Set) a(str, set);
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f49095b.add(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f49095b.remove(onSharedPreferenceChangeListener);
    }
}
