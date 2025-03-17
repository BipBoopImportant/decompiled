package C7;

import Y7.b;
import j0.C5445a;
import java.security.MessageDigest;

public final class i implements f {

    /* renamed from: b  reason: collision with root package name */
    private final C5445a<h<?>, Object> f33756b = new b();

    private static <T> void g(h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.g(obj, messageDigest);
    }

    public void b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f33756b.size(); i10++) {
            g(this.f33756b.h(i10), this.f33756b.m(i10), messageDigest);
        }
    }

    public <T> T c(h<T> hVar) {
        return this.f33756b.containsKey(hVar) ? this.f33756b.get(hVar) : hVar.c();
    }

    public void d(i iVar) {
        this.f33756b.i(iVar.f33756b);
    }

    public i e(h<?> hVar) {
        this.f33756b.remove(hVar);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f33756b.equals(((i) obj).f33756b);
        }
        return false;
    }

    public <T> i f(h<T> hVar, T t10) {
        this.f33756b.put(hVar, t10);
        return this;
    }

    public int hashCode() {
        return this.f33756b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f33756b + '}';
    }
}
