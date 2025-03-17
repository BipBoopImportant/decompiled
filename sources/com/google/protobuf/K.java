package com.google.protobuf;

import com.google.protobuf.u0;

public class K<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f69225a;

    /* renamed from: b  reason: collision with root package name */
    private final K f69226b;

    /* renamed from: c  reason: collision with root package name */
    private final V f69227c;

    static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final u0.b f69228a;

        /* renamed from: b  reason: collision with root package name */
        public final K f69229b;

        /* renamed from: c  reason: collision with root package name */
        public final u0.b f69230c;

        /* renamed from: d  reason: collision with root package name */
        public final V f69231d;

        public a(u0.b bVar, K k10, u0.b bVar2, V v10) {
            this.f69228a = bVar;
            this.f69229b = k10;
            this.f69230c = bVar2;
            this.f69231d = v10;
        }
    }

    private K(u0.b bVar, K k10, u0.b bVar2, V v10) {
        this.f69225a = new a<>(bVar, k10, bVar2, v10);
        this.f69226b = k10;
        this.f69227c = v10;
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return C9587u.d(aVar.f69228a, 1, k10) + C9587u.d(aVar.f69230c, 2, v10);
    }

    public static <K, V> K<K, V> d(u0.b bVar, K k10, u0.b bVar2, V v10) {
        return new K<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(C9578k kVar, a<K, V> aVar, K k10, V v10) {
        C9587u.A(kVar, aVar.f69228a, 1, k10);
        C9587u.A(kVar, aVar.f69230c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return C9578k.T(i10) + C9578k.C(b(this.f69225a, k10, v10));
    }

    /* access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f69225a;
    }
}
