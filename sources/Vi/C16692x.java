package VI;

import DI.i0;
import WI.C16730a;
import cJ.C17065b;
import cJ.C17069f;
import iJ.C17372f;

/* renamed from: VI.x  reason: case insensitive filesystem */
public interface C16692x {

    /* renamed from: VI.x$a */
    public interface a {
        void a();

        void b(C17069f fVar, Object obj);

        void c(C17069f fVar, C17065b bVar, C17069f fVar2);

        void d(C17069f fVar, C17372f fVar2);

        b e(C17069f fVar);

        a f(C17069f fVar, C17065b bVar);
    }

    /* renamed from: VI.x$b */
    public interface b {
        void a();

        a b(C17065b bVar);

        void c(C17372f fVar);

        void d(C17065b bVar, C17069f fVar);

        void e(Object obj);
    }

    /* renamed from: VI.x$c */
    public interface c {
        void a();

        a c(C17065b bVar, i0 i0Var);
    }

    /* renamed from: VI.x$d */
    public interface d {
        e a(C17069f fVar, String str);

        c b(C17069f fVar, String str, Object obj);
    }

    /* renamed from: VI.x$e */
    public interface e extends c {
        a b(int i10, C17065b bVar, i0 i0Var);
    }

    String a();

    C16730a b();

    void c(c cVar, byte[] bArr);

    void d(d dVar, byte[] bArr);

    C17065b k();
}
