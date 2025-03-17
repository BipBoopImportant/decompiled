package Qb;

import Wb.g;
import java.io.File;
import java.io.IOException;

class A {

    /* renamed from: a  reason: collision with root package name */
    private final String f62897a;

    /* renamed from: b  reason: collision with root package name */
    private final g f62898b;

    public A(String str, g gVar) {
        this.f62897a = str;
        this.f62898b = gVar;
    }

    private File b() {
        return this.f62898b.g(this.f62897a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            Nb.g f10 = Nb.g.f();
            f10.e("Error creating marker: " + this.f62897a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
