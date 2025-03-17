package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t0;

public class K<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f21256a;

    /* renamed from: b  reason: collision with root package name */
    private final K f21257b;

    /* renamed from: c  reason: collision with root package name */
    private final V f21258c;

    static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final t0.b f21259a;

        /* renamed from: b  reason: collision with root package name */
        public final K f21260b;

        /* renamed from: c  reason: collision with root package name */
        public final t0.b f21261c;

        /* renamed from: d  reason: collision with root package name */
        public final V f21262d;

        public a(t0.b bVar, K k10, t0.b bVar2, V v10) {
            this.f21259a = bVar;
            this.f21260b = k10;
            this.f21261c = bVar2;
            this.f21262d = v10;
        }
    }

    private K(t0.b bVar, K k10, t0.b bVar2, V v10) {
        this.f21256a = new a<>(bVar, k10, bVar2, v10);
        this.f21257b = k10;
        this.f21258c = v10;
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return C5166t.d(aVar.f21259a, 1, k10) + C5166t.d(aVar.f21261c, 2, v10);
    }

    public static <K, V> K<K, V> d(t0.b bVar, K k10, t0.b bVar2, V v10) {
        return new K<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(C5157j jVar, a<K, V> aVar, K k10, V v10) {
        C5166t.A(jVar, aVar.f21259a, 1, k10);
        C5166t.A(jVar, aVar.f21261c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return C5157j.U(i10) + C5157j.C(b(this.f21256a, k10, v10));
    }

    /* access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f21256a;
    }
}
