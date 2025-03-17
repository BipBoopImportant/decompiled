package qb;

import Cb.A;
import Cb.C;
import Cb.I;
import Cb.y;
import Cb.z;
import com.google.crypto.tink.internal.t;
import java.security.GeneralSecurityException;

/* renamed from: qb.o  reason: case insensitive filesystem */
public final class C10170o {

    /* renamed from: a  reason: collision with root package name */
    private final C.b f75988a;

    private C10170o(C.b bVar) {
        this.f75988a = bVar;
    }

    private synchronized C.c c(y yVar, I i10) {
        int g10;
        g10 = g();
        if (i10 != I.UNKNOWN_PREFIX) {
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (C.c) C.c.a0().w(yVar).y(g10).A(z.ENABLED).z(i10).g();
    }

    private synchronized boolean e(int i10) {
        for (C.c W10 : this.f75988a.A()) {
            if (W10.W() == i10) {
                return true;
            }
        }
        return false;
    }

    private synchronized C.c f(A a10) {
        return c(C10179x.k(a10), a10.V());
    }

    private synchronized int g() {
        int c10;
        c10 = t.c();
        while (e(c10)) {
            c10 = t.c();
        }
        return c10;
    }

    public static C10170o i() {
        return new C10170o(C.Z());
    }

    public static C10170o j(C10169n nVar) {
        return new C10170o((C.b) nVar.h().toBuilder());
    }

    public synchronized C10170o a(C10167l lVar) {
        b(lVar.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(A a10, boolean z10) {
        C.c f10;
        try {
            f10 = f(a10);
            this.f75988a.w(f10);
            if (z10) {
                this.f75988a.C(f10.W());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return f10.W();
    }

    public synchronized C10169n d() {
        return C10169n.e((C) this.f75988a.g());
    }

    public synchronized C10170o h(int i10) {
        int i11 = 0;
        while (i11 < this.f75988a.z()) {
            C.c y10 = this.f75988a.y(i11);
            if (y10.W() != i10) {
                i11++;
            } else if (y10.Y().equals(z.ENABLED)) {
                this.f75988a.C(i10);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}
