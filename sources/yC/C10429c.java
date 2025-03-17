package yc;

import Fb.f;
import nH.C17624c;
import nH.C17627f;

/* renamed from: yc.c  reason: case insensitive filesystem */
public final class C10429c implements C17624c<f> {

    /* renamed from: a  reason: collision with root package name */
    private final C10427a f77891a;

    public C10429c(C10427a aVar) {
        this.f77891a = aVar;
    }

    public static C10429c a(C10427a aVar) {
        return new C10429c(aVar);
    }

    public static f c(C10427a aVar) {
        return (f) C17627f.d(aVar.b());
    }

    /* renamed from: b */
    public f get() {
        return c(this.f77891a);
    }
}
