package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kb.C9944Y;
import kb.e0;

/* renamed from: com.google.android.gms.internal.measurement.y0  reason: case insensitive filesystem */
final class C7449y0 implements SharedPreferences.Editor {

    /* renamed from: a  reason: collision with root package name */
    private boolean f49146a;

    /* renamed from: b  reason: collision with root package name */
    private Set<String> f49147b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Object> f49148c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C7425v0 f49149d;

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f49148c.put(str, obj);
        } else {
            remove(str);
        }
    }

    public final void apply() {
        commit();
    }

    public final SharedPreferences.Editor clear() {
        this.f49146a = true;
        return this;
    }

    public final boolean commit() {
        if (this.f49146a) {
            this.f49149d.f49094a.clear();
        }
        this.f49149d.f49094a.keySet().removeAll(this.f49147b);
        for (Map.Entry next : this.f49148c.entrySet()) {
            this.f49149d.f49094a.put((String) next.getKey(), next.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f49149d.f49095b) {
            e0<String> b10 = C9944Y.k(this.f49147b, this.f49148c.keySet()).b();
            while (b10.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f49149d, b10.next());
            }
        }
        return this.f49146a || !this.f49147b.isEmpty() || !this.f49148c.isEmpty();
    }

    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        a(str, set);
        return this;
    }

    public final SharedPreferences.Editor remove(String str) {
        this.f49147b.add(str);
        return this;
    }

    private C7449y0(C7425v0 v0Var) {
        this.f49149d = v0Var;
        this.f49146a = false;
        this.f49147b = new HashSet();
        this.f49148c = new HashMap();
    }
}
