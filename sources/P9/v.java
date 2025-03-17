package P9;

import H9.C6536j;
import H9.C6537k;
import H9.C6541o;
import H9.C6545t;
import K9.C6620s;
import O9.b;
import O9.d;
import O9.g;
import aa.k;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import xa.C8971l;
import xa.C8974o;

public final class v extends f implements d {

    /* renamed from: k  reason: collision with root package name */
    private static final a.g f39468k;

    /* renamed from: l  reason: collision with root package name */
    private static final a.C0821a f39469l;

    /* renamed from: m  reason: collision with root package name */
    private static final a f39470m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f39471n = 0;

    static {
        a.g gVar = new a.g();
        f39468k = gVar;
        q qVar = new q();
        f39469l = qVar;
        f39470m = new a("ModuleInstall.API", qVar, gVar);
    }

    public v(Context context) {
        super(context, f39470m, a.d.f47997j0, f.a.f48010c);
    }

    static final a D(boolean z10, h... hVarArr) {
        C6620s.m(hVarArr, "Requested APIs must not be null.");
        C6620s.b(r0 > 0, "Please provide at least one OptionalModuleApi.");
        for (h m10 : hVarArr) {
            C6620s.m(m10, "Requested API must not be null.");
        }
        return a.F(Arrays.asList(hVarArr), z10);
    }

    public final C8971l<g> e(O9.f fVar) {
        a x10 = a.x(fVar);
        O9.a b10 = fVar.b();
        Executor c10 = fVar.c();
        if (x10.B().isEmpty()) {
            return C8974o.f(new g(0));
        }
        if (b10 == null) {
            C6545t.a a10 = C6545t.a();
            a10.d(k.f42999a);
            a10.c(true);
            a10.e(27304);
            a10.b(new p(this, x10));
            return n(a10.a());
        }
        C6620s.l(b10);
        Class<O9.a> cls = O9.a.class;
        C6536j x11 = c10 == null ? x(b10, cls.getSimpleName()) : C6537k.b(b10, c10, cls.getSimpleName());
        d dVar = new d(x11);
        AtomicReference atomicReference = new AtomicReference();
        l lVar = new l(this, atomicReference, b10, x10, dVar);
        m mVar = new m(this, dVar);
        C6541o.a a11 = C6541o.a();
        a11.g(x11);
        a11.d(k.f42999a);
        a11.c(true);
        a11.b(lVar);
        a11.f(mVar);
        a11.e(27305);
        return o(a11.a()).s(new n(atomicReference));
    }

    public final C8971l<b> i(h... hVarArr) {
        a D10 = D(false, hVarArr);
        if (D10.B().isEmpty()) {
            return C8974o.f(new b(true, 0));
        }
        C6545t.a a10 = C6545t.a();
        a10.d(k.f42999a);
        a10.e(27301);
        a10.c(false);
        a10.b(new o(this, D10));
        return n(a10.a());
    }
}
