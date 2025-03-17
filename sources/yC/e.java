package yc;

import com.google.firebase.remoteconfig.c;
import mc.C10036b;
import nH.C17624c;
import nH.C17627f;

public final class e implements C17624c<C10036b<c>> {

    /* renamed from: a  reason: collision with root package name */
    private final C10427a f77893a;

    public e(C10427a aVar) {
        this.f77893a = aVar;
    }

    public static e a(C10427a aVar) {
        return new e(aVar);
    }

    public static C10036b<c> c(C10427a aVar) {
        return (C10036b) C17627f.d(aVar.d());
    }

    /* renamed from: b */
    public C10036b<c> get() {
        return c(this.f77893a);
    }
}
