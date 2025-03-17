package jH;

import mH.C17599b;

/* renamed from: jH.d  reason: case insensitive filesystem */
public final class C17407d implements C17599b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f143956a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f143957b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final C17409f f143958c;

    public C17407d(C17409f fVar) {
        this.f143958c = fVar;
    }

    public Object g0() {
        if (this.f143956a == null) {
            synchronized (this.f143957b) {
                try {
                    if (this.f143956a == null) {
                        this.f143956a = this.f143958c.get();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f143956a;
    }
}
