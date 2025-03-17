package ed;

import K9.C6620s;
import Vc.a;
import Zc.C9397f;
import Zc.C9398g;
import Zc.C9400i;
import android.os.SystemClock;
import bd.C9428b;
import cd.C9452a;
import fd.C9707a;
import gd.C9723a;
import gd.C9726d;
import ha.C7985d6;
import ha.C7990e1;
import ha.C7995e6;
import ha.C8000f1;
import ha.C8005f6;
import ha.C8015g6;
import ha.C8020h1;
import ha.C8027h8;
import ha.C8029i0;
import ha.C8107p8;
import ha.C8134s6;
import ha.C8136s8;
import ha.C8156u8;
import ha.C8176w8;
import ha.F5;
import ha.J5;
import ha.K5;
import ha.Q5;
import java.util.Iterator;
import java.util.List;

/* renamed from: ed.j  reason: case insensitive filesystem */
public final class C9642j extends C9397f {

    /* renamed from: j  reason: collision with root package name */
    private static final C9726d f72607j = C9726d.b();

    /* renamed from: k  reason: collision with root package name */
    static boolean f72608k = true;

    /* renamed from: d  reason: collision with root package name */
    private final C9428b f72609d;

    /* renamed from: e  reason: collision with root package name */
    private final C9643k f72610e;

    /* renamed from: f  reason: collision with root package name */
    private final C8136s8 f72611f;

    /* renamed from: g  reason: collision with root package name */
    private final C8156u8 f72612g;

    /* renamed from: h  reason: collision with root package name */
    private final C9723a f72613h = new C9723a();

    /* renamed from: i  reason: collision with root package name */
    private boolean f72614i;

    public C9642j(C9400i iVar, C9428b bVar, C9643k kVar, C8136s8 s8Var) {
        C6620s.m(iVar, "MlKitContext can not be null");
        C6620s.m(bVar, "BarcodeScannerOptions can not be null");
        this.f72609d = bVar;
        this.f72610e = kVar;
        this.f72611f = s8Var;
        this.f72612g = C8156u8.a(iVar.b());
    }

    private final void m(C7995e6 e6Var, long j10, C9707a aVar, List list) {
        C8029i0 i0Var = new C8029i0();
        C8029i0 i0Var2 = new C8029i0();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9452a aVar2 = (C9452a) it.next();
                i0Var.e(C9635c.a(aVar2.a()));
                i0Var2.e(C9635c.b(aVar2.c()));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f72611f.f(new C9640h(this, elapsedRealtime, e6Var, i0Var, i0Var2, aVar), C8005f6.ON_DEVICE_BARCODE_DETECT);
        C8000f1 f1Var = new C8000f1();
        f1Var.e(e6Var);
        f1Var.f(Boolean.valueOf(f72608k));
        f1Var.g(C9635c.c(this.f72609d));
        f1Var.c(i0Var.g());
        f1Var.d(i0Var2.g());
        C9398g.d().execute(new C8107p8(this.f72611f, C8005f6.AGGREGATED_ON_DEVICE_BARCODE_DETECTION, f1Var.h(), elapsedRealtime, new C9641i(this)));
        long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = this.f72614i;
        long j11 = currentTimeMillis - elapsedRealtime;
        this.f72612g.c(true != z10 ? 24301 : 24302, e6Var.zza(), j11, currentTimeMillis);
    }

    public final synchronized void b() {
        this.f72614i = this.f72610e.zzc();
    }

    public final synchronized void d() {
        try {
            this.f72610e.zzb();
            f72608k = true;
            C8136s8 s8Var = this.f72611f;
            C8015g6 g6Var = new C8015g6();
            g6Var.e(this.f72614i ? C7985d6.TYPE_THICK : C7985d6.TYPE_THIN);
            C8134s6 s6Var = new C8134s6();
            s6Var.i(C9635c.c(this.f72609d));
            g6Var.g(s6Var.j());
            s8Var.d(C8176w8.d(g6Var), C8005f6.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C8027h8 j(long j10, C7995e6 e6Var, C8029i0 i0Var, C8029i0 i0Var2, C9707a aVar) {
        C8134s6 s6Var = new C8134s6();
        Q5 q52 = new Q5();
        q52.c(Long.valueOf(j10));
        q52.d(e6Var);
        q52.e(Boolean.valueOf(f72608k));
        Boolean bool = Boolean.TRUE;
        q52.a(bool);
        q52.b(bool);
        s6Var.h(q52.f());
        s6Var.i(C9635c.c(this.f72609d));
        s6Var.e(i0Var.g());
        s6Var.f(i0Var2.g());
        int e10 = aVar.e();
        int c10 = f72607j.c(aVar);
        J5 j52 = new J5();
        j52.a(e10 != -1 ? e10 != 35 ? e10 != 842094169 ? e10 != 16 ? e10 != 17 ? K5.UNKNOWN_FORMAT : K5.NV21 : K5.NV16 : K5.YV12 : K5.YUV_420_888 : K5.BITMAP);
        j52.b(Integer.valueOf(c10));
        s6Var.g(j52.d());
        C8015g6 g6Var = new C8015g6();
        g6Var.e(this.f72614i ? C7985d6.TYPE_THICK : C7985d6.TYPE_THIN);
        g6Var.g(s6Var.j());
        return C8176w8.d(g6Var);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C8027h8 k(C8020h1 h1Var, int i10, F5 f52) {
        C8015g6 g6Var = new C8015g6();
        g6Var.e(this.f72614i ? C7985d6.TYPE_THICK : C7985d6.TYPE_THIN);
        C7990e1 e1Var = new C7990e1();
        e1Var.a(Integer.valueOf(i10));
        e1Var.c(h1Var);
        e1Var.b(f52);
        g6Var.d(e1Var.e());
        return C8176w8.d(g6Var);
    }

    /* renamed from: l */
    public final synchronized List i(C9707a aVar) {
        List a10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f72613h.a(aVar);
        try {
            a10 = this.f72610e.a(aVar);
            m(C7995e6.NO_ERROR, elapsedRealtime, aVar, a10);
            f72608k = false;
        } catch (a e10) {
            a aVar2 = e10;
            m(aVar2.a() == 14 ? C7995e6.MODEL_NOT_DOWNLOADED : C7995e6.UNKNOWN_ERROR, elapsedRealtime, aVar, (List) null);
            throw aVar2;
        }
        return a10;
    }
}
