package ia;

import fc.C9703d;
import gc.C9722b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ia.n  reason: case insensitive filesystem */
public final class C8311n implements C9722b {

    /* renamed from: d  reason: collision with root package name */
    private static final C9703d f53709d = C8304m.f53697a;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f53710e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Map f53711a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f53712b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final C9703d f53713c = f53709d;

    public final /* bridge */ /* synthetic */ C9722b a(Class cls, C9703d dVar) {
        this.f53711a.put(cls, dVar);
        this.f53712b.remove(cls);
        return this;
    }

    public final C8318o b() {
        return new C8318o(new HashMap(this.f53711a), new HashMap(this.f53712b), this.f53713c);
    }
}
