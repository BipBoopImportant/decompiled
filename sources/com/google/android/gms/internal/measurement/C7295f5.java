package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.f5  reason: case insensitive filesystem */
public final class C7295f5 {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Callable<? extends C7361n>> f48921a = new HashMap();

    public final C7400s a(String str) {
        if (!this.f48921a.containsKey(str)) {
            return C7400s.f49052k0;
        }
        try {
            return (C7400s) this.f48921a.get(str).call();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(String str, Callable<? extends C7361n> callable) {
        this.f48921a.put(str, callable);
    }
}
