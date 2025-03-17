package L3;

import E3.s;
import E3.t;
import android.view.Surface;

/* renamed from: L3.c  reason: case insensitive filesystem */
public class C6638c extends s {

    /* renamed from: d  reason: collision with root package name */
    public final int f38078d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f38079e;

    public C6638c(Throwable th2, t tVar, Surface surface) {
        super(th2, tVar);
        this.f38078d = System.identityHashCode(surface);
        this.f38079e = surface == null || surface.isValid();
    }
}
