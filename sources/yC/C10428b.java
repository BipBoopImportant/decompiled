package yc;

import com.google.firebase.perf.config.a;
import nH.C17624c;
import nH.C17627f;

/* renamed from: yc.b  reason: case insensitive filesystem */
public final class C10428b implements C17624c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final C10427a f77890a;

    public C10428b(C10427a aVar) {
        this.f77890a = aVar;
    }

    public static C10428b a(C10427a aVar) {
        return new C10428b(aVar);
    }

    public static a c(C10427a aVar) {
        return (a) C17627f.d(aVar.a());
    }

    /* renamed from: b */
    public a get() {
        return c(this.f77890a);
    }
}
