package L0;

import J0.a;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5728l0;
import p1.C5747v0;
import p1.j1;
import p1.k1;
import p1.l1;
import u1.C6006d;
import u1.C6008f;
import u1.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Lu1/d;", "a", "Lu1/d;", "_close", "LJ0/a$b;", "(LJ0/a$b;)Lu1/d;", "Close", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static C6006d f8912a;

    public static final C6006d a(a.b bVar) {
        C6006d dVar = f8912a;
        if (dVar != null) {
            C17542s.g(dVar);
            return dVar;
        }
        C6006d.a aVar = r1;
        C6006d.a aVar2 = new C6006d.a("Filled.Close", h.B(24.0f), h.B(24.0f), 24.0f, 24.0f, 0, 0, false, 96, (DefaultConstructorMarker) null);
        int a10 = q.a();
        j1 j1Var = r0;
        j1 j1Var2 = new j1(C5747v0.f27350b.a(), (DefaultConstructorMarker) null);
        int a11 = k1.f27320b.a();
        int a12 = l1.f27327b.a();
        C6008f fVar = new C6008f();
        fVar.j(19.0f, 6.41f);
        fVar.h(17.59f, 5.0f);
        fVar.h(12.0f, 10.59f);
        fVar.h(6.41f, 5.0f);
        fVar.h(5.0f, 6.41f);
        fVar.h(10.59f, 12.0f);
        fVar.h(5.0f, 17.59f);
        fVar.h(6.41f, 19.0f);
        fVar.h(12.0f, 13.41f);
        fVar.h(17.59f, 19.0f);
        fVar.h(19.0f, 17.59f);
        fVar.h(13.41f, 12.0f);
        fVar.b();
        C6006d f10 = C6006d.a.d(aVar, fVar.e(), a10, "", j1Var, 1.0f, (C5728l0) null, 1.0f, 1.0f, a11, a12, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
        f8912a = f10;
        C17542s.g(f10);
        return f10;
    }
}
