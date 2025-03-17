package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.vision.h  reason: case insensitive filesystem */
final class C7492h {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<C7488g, List<Throwable>> f49326a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f49327b = new ReferenceQueue<>();

    C7492h() {
    }

    public final List<Throwable> a(Throwable th2, boolean z10) {
        Reference<? extends Throwable> poll = this.f49327b.poll();
        while (poll != null) {
            this.f49326a.remove(poll);
            poll = this.f49327b.poll();
        }
        List<Throwable> list = this.f49326a.get(new C7488g(th2, (ReferenceQueue<Throwable>) null));
        if (!z10 || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f49326a.putIfAbsent(new C7488g(th2, this.f49327b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
