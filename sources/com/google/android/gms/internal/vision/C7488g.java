package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.vision.g  reason: case insensitive filesystem */
final class C7488g extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f49321a;

    public C7488g(Throwable th2, ReferenceQueue<Throwable> referenceQueue) {
        super(th2, referenceQueue);
        if (th2 != null) {
            this.f49321a = System.identityHashCode(th2);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C7488g.class) {
            if (this == obj) {
                return true;
            }
            C7488g gVar = (C7488g) obj;
            return this.f49321a == gVar.f49321a && get() == gVar.get();
        }
    }

    public final int hashCode() {
        return this.f49321a;
    }
}
