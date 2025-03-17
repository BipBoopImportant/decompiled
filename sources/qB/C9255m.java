package Qb;

import Nc.b;
import Wb.g;

/* renamed from: Qb.m  reason: case insensitive filesystem */
public class C9255m implements b {

    /* renamed from: a  reason: collision with root package name */
    private final F f62990a;

    /* renamed from: b  reason: collision with root package name */
    private final C9254l f62991b;

    public C9255m(F f10, g gVar) {
        this.f62990a = f10;
        this.f62991b = new C9254l(gVar);
    }

    public boolean a() {
        return this.f62990a.d();
    }

    public b.a b() {
        return b.a.CRASHLYTICS;
    }

    public void c(b.C1041b bVar) {
        Nb.g f10 = Nb.g.f();
        f10.b("App Quality Sessions session changed: " + bVar);
        this.f62991b.h(bVar.a());
    }

    public String d(String str) {
        return this.f62991b.c(str);
    }

    public void e(String str) {
        this.f62991b.i(str);
    }
}
