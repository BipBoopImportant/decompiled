package ha;

import D2.f;
import D2.j;
import K9.C6617o;
import Zc.C9394c;
import Zc.C9398g;
import Zc.n;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import ed.C9641i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import xa.C8971l;

/* renamed from: ha.s8  reason: case insensitive filesystem */
public final class C8136s8 {

    /* renamed from: k  reason: collision with root package name */
    private static C8059l0 f52777k;

    /* renamed from: l  reason: collision with root package name */
    private static final C8079n0 f52778l = C8079n0.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a  reason: collision with root package name */
    private final String f52779a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52780b;

    /* renamed from: c  reason: collision with root package name */
    private final C8037i8 f52781c;

    /* renamed from: d  reason: collision with root package name */
    private final n f52782d;

    /* renamed from: e  reason: collision with root package name */
    private final C8971l f52783e;

    /* renamed from: f  reason: collision with root package name */
    private final C8971l f52784f;

    /* renamed from: g  reason: collision with root package name */
    private final String f52785g;

    /* renamed from: h  reason: collision with root package name */
    private final int f52786h;

    /* renamed from: i  reason: collision with root package name */
    private final Map f52787i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private final Map f52788j = new HashMap();

    public C8136s8(Context context, n nVar, C8037i8 i8Var, String str) {
        this.f52779a = context.getPackageName();
        this.f52780b = C9394c.a(context);
        this.f52782d = nVar;
        this.f52781c = i8Var;
        F8.a();
        this.f52785g = str;
        this.f52783e = C9398g.a().b(new C8077m8(this));
        C9398g a10 = C9398g.a();
        nVar.getClass();
        this.f52784f = a10.b(new C8087n8(nVar));
        C8079n0 n0Var = f52778l;
        this.f52786h = n0Var.containsKey(str) ? DynamiteModule.c(context, (String) n0Var.get(str)) : -1;
    }

    static long a(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized C8059l0 i() {
        synchronized (C8136s8.class) {
            try {
                C8059l0 l0Var = f52777k;
                if (l0Var != null) {
                    return l0Var;
                }
                j a10 = f.a(Resources.getSystem().getConfiguration());
                C8029i0 i0Var = new C8029i0();
                for (int i10 = 0; i10 < a10.f(); i10++) {
                    i0Var.e(C9394c.b(a10.c(i10)));
                }
                C8059l0 g10 = i0Var.g();
                f52777k = g10;
                return g10;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    private final String j() {
        return this.f52783e.q() ? (String) this.f52783e.m() : C6617o.a().b(this.f52785g);
    }

    private final boolean k(C8005f6 f6Var, long j10, long j11) {
        return this.f52787i.get(f6Var) == null || j10 - ((Long) this.f52787i.get(f6Var)).longValue() > TimeUnit.SECONDS.toMillis(30);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String b() {
        return C6617o.a().b(this.f52785g);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(C8027h8 h8Var, C8005f6 f6Var, String str) {
        h8Var.c(f6Var);
        String zzd = h8Var.zzd();
        D7 d72 = new D7();
        d72.b(this.f52779a);
        d72.c(this.f52780b);
        d72.h(i());
        d72.g(Boolean.TRUE);
        d72.l(zzd);
        d72.j(str);
        d72.i(this.f52784f.q() ? (String) this.f52784f.m() : this.f52782d.a());
        d72.d(10);
        d72.k(Integer.valueOf(this.f52786h));
        h8Var.a(d72);
        this.f52781c.a(h8Var);
    }

    public final void d(C8027h8 h8Var, C8005f6 f6Var) {
        e(h8Var, f6Var, j());
    }

    public final void e(C8027h8 h8Var, C8005f6 f6Var, String str) {
        C9398g.d().execute(new C8097o8(this, h8Var, f6Var, str));
    }

    public final void f(C8126r8 r8Var, C8005f6 f6Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (k(f6Var, elapsedRealtime, 30)) {
            this.f52787i.put(f6Var, Long.valueOf(elapsedRealtime));
            e(r8Var.zza(), f6Var, j());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(C8005f6 f6Var, C9641i iVar) {
        C8109q0 q0Var = (C8109q0) this.f52788j.get(f6Var);
        if (q0Var != null) {
            for (Object next : q0Var.o()) {
                ArrayList<Long> arrayList = new ArrayList<>(q0Var.a(next));
                Collections.sort(arrayList);
                D5 d52 = new D5();
                long j10 = 0;
                for (Long longValue : arrayList) {
                    j10 += longValue.longValue();
                }
                d52.a(Long.valueOf(j10 / ((long) arrayList.size())));
                d52.c(Long.valueOf(a(arrayList, 100.0d)));
                d52.f(Long.valueOf(a(arrayList, 75.0d)));
                d52.d(Long.valueOf(a(arrayList, 50.0d)));
                d52.b(Long.valueOf(a(arrayList, 25.0d)));
                d52.e(Long.valueOf(a(arrayList, 0.0d)));
                e(iVar.a(next, arrayList.size(), d52.g()), f6Var, j());
            }
            this.f52788j.remove(f6Var);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(C8005f6 f6Var, Object obj, long j10, C9641i iVar) {
        if (!this.f52788j.containsKey(f6Var)) {
            this.f52788j.put(f6Var, N.n());
        }
        ((C8109q0) this.f52788j.get(f6Var)).b(obj, Long.valueOf(j10));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (k(f6Var, elapsedRealtime, 30)) {
            this.f52787i.put(f6Var, Long.valueOf(elapsedRealtime));
            C9398g.d().execute(new C8117q8(this, f6Var, iVar));
        }
    }
}
