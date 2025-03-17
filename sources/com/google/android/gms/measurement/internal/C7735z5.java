package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.E2;
import java.util.Collections;
import java.util.Map;
import sa.X;

/* renamed from: com.google.android.gms.measurement.internal.z5  reason: case insensitive filesystem */
public final class C7735z5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f50546a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f50547b;

    /* renamed from: c  reason: collision with root package name */
    private final X f50548c;

    /* renamed from: d  reason: collision with root package name */
    private final E2 f50549d;

    C7735z5(String str, X x10) {
        this(str, Collections.emptyMap(), x10, (E2) null);
    }

    public final X a() {
        return this.f50548c;
    }

    public final E2 b() {
        return this.f50549d;
    }

    public final String c() {
        return this.f50546a;
    }

    public final Map<String, String> d() {
        Map<String, String> map = this.f50547b;
        return map == null ? Collections.emptyMap() : map;
    }

    C7735z5(String str, Map<String, String> map, X x10) {
        this(str, map, x10, (E2) null);
    }

    C7735z5(String str, Map<String, String> map, X x10, E2 e22) {
        this.f50546a = str;
        this.f50547b = map;
        this.f50548c = x10;
        this.f50549d = e22;
    }
}
