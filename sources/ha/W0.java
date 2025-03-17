package ha;

import fc.C9703d;
import gc.C9722b;
import java.util.HashMap;
import java.util.Map;

public final class W0 implements C9722b {

    /* renamed from: d  reason: collision with root package name */
    private static final C9703d f52315d = V0.f52285a;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f52316e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Map f52317a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f52318b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final C9703d f52319c = f52315d;

    public final /* bridge */ /* synthetic */ C9722b a(Class cls, C9703d dVar) {
        this.f52317a.put(cls, dVar);
        this.f52318b.remove(cls);
        return this;
    }

    public final X0 b() {
        return new X0(new HashMap(this.f52317a), new HashMap(this.f52318b), this.f52319c);
    }
}
