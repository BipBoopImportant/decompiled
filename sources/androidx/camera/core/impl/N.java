package androidx.camera.core.impl;

import C.C4387c0;
import C.C4391e0;
import C.C4410s;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    private final Object f16749a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, J> f16750b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Set<J> f16751c = new HashSet();

    public LinkedHashSet<J> a() {
        LinkedHashSet<J> linkedHashSet;
        synchronized (this.f16749a) {
            linkedHashSet = new LinkedHashSet<>(this.f16750b.values());
        }
        return linkedHashSet;
    }

    public void b(H h10) {
        synchronized (this.f16749a) {
            try {
                for (String next : h10.b()) {
                    C4391e0.a("CameraRepository", "Added camera: " + next);
                    this.f16750b.put(next, h10.a(next));
                }
            } catch (C4410s e10) {
                throw new C4387c0(e10);
            }
        }
    }
}
