package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d  reason: case insensitive filesystem */
public final class C7271d {

    /* renamed from: a  reason: collision with root package name */
    private C7280e f48884a;

    /* renamed from: b  reason: collision with root package name */
    private C7280e f48885b;

    /* renamed from: c  reason: collision with root package name */
    private List<C7280e> f48886c;

    public C7271d() {
        this.f48884a = new C7280e("", 0, (Map<String, Object>) null);
        this.f48885b = new C7280e("", 0, (Map<String, Object>) null);
        this.f48886c = new ArrayList();
    }

    public final C7280e a() {
        return this.f48884a;
    }

    public final void b(C7280e eVar) {
        this.f48884a = eVar;
        this.f48885b = (C7280e) eVar.clone();
        this.f48886c.clear();
    }

    public final void c(String str, long j10, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String next : map.keySet()) {
            hashMap.put(next, C7280e.c(next, this.f48884a.b(next), map.get(next)));
        }
        this.f48886c.add(new C7280e(str, j10, hashMap));
    }

    public final /* synthetic */ Object clone() {
        C7271d dVar = new C7271d((C7280e) this.f48884a.clone());
        for (C7280e clone : this.f48886c) {
            dVar.f48886c.add((C7280e) clone.clone());
        }
        return dVar;
    }

    public final C7280e d() {
        return this.f48885b;
    }

    public final void e(C7280e eVar) {
        this.f48885b = eVar;
    }

    public final List<C7280e> f() {
        return this.f48886c;
    }

    private C7271d(C7280e eVar) {
        this.f48884a = eVar;
        this.f48885b = (C7280e) eVar.clone();
        this.f48886c = new ArrayList();
    }
}
