package Qb;

import Nb.g;
import Sb.c;
import Sb.f;
import Sb.p;
import Tb.F;
import Wb.e;
import Xb.b;
import Yb.j;
import Zb.d;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import t5.C8815j;
import xa.C8971l;
import xa.C8974o;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final B f62961a;

    /* renamed from: b  reason: collision with root package name */
    private final e f62962b;

    /* renamed from: c  reason: collision with root package name */
    private final b f62963c;

    /* renamed from: d  reason: collision with root package name */
    private final f f62964d;

    /* renamed from: e  reason: collision with root package name */
    private final p f62965e;

    /* renamed from: f  reason: collision with root package name */
    private final K f62966f;

    /* renamed from: g  reason: collision with root package name */
    private final Rb.f f62967g;

    b0(B b10, e eVar, b bVar, f fVar, p pVar, K k10, Rb.f fVar2) {
        this.f62961a = b10;
        this.f62962b = eVar;
        this.f62963c = bVar;
        this.f62964d = fVar;
        this.f62965e = pVar;
        this.f62966f = k10;
        this.f62967g = fVar2;
    }

    private F.e.d d(F.e.d dVar, f fVar, p pVar) {
        return e(dVar, fVar, pVar, Collections.emptyMap());
    }

    private F.e.d e(F.e.d dVar, f fVar, p pVar, Map<String, String> map) {
        F.e.d.b h10 = dVar.h();
        String c10 = fVar.c();
        if (c10 != null) {
            h10.d(F.e.d.C1108d.a().b(c10).a());
        } else {
            g.f().i("No log data to include with this event.");
        }
        List<F.c> o10 = o(pVar.g(map));
        List<F.c> o11 = o(pVar.h());
        if (!o10.isEmpty() || !o11.isEmpty()) {
            h10.b(dVar.b().i().e(o10).g(o11).a());
        }
        return h10.a();
    }

    private F.e.d f(F.e.d dVar, Map<String, String> map) {
        return g(e(dVar, this.f62964d, this.f62965e, map), this.f62965e);
    }

    private F.e.d g(F.e.d dVar, p pVar) {
        List<F.e.d.C1109e> i10 = pVar.i();
        if (i10.isEmpty()) {
            return dVar;
        }
        F.e.d.b h10 = dVar.h();
        h10.e(F.e.d.f.a().b(i10).a());
        return h10.a();
    }

    private static F.a h(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream a10 = applicationExitInfo.getTraceInputStream();
            if (a10 != null) {
                str = i(a10);
            }
        } catch (IOException e10) {
            g f10 = g.f();
            f10.k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(str).a();
    }

    public static String i(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static b0 j(Context context, K k10, Wb.g gVar, C9243a aVar, f fVar, p pVar, d dVar, j jVar, P p10, C9255m mVar, Rb.f fVar2) {
        j jVar2 = jVar;
        Wb.g gVar2 = gVar;
        Context context2 = context;
        return new b0(new B(context, k10, aVar, dVar, jVar), new e(gVar, jVar2, mVar), b.b(context, jVar2, p10), fVar, pVar, k10, fVar2);
    }

    private C k(C c10) {
        if (c10.b().h() != null && c10.b().g() != null) {
            return c10;
        }
        J d10 = this.f62966f.d(true);
        return C.a(c10.b().t(d10.b()).s(d10.a()), c10.d(), c10.c());
    }

    private ApplicationExitInfo n(String str, List<ApplicationExitInfo> list) {
        long q10 = this.f62962b.q(str);
        for (ApplicationExitInfo a10 : list) {
            ApplicationExitInfo a11 = C8815j.a(a10);
            if (a11.getTimestamp() < q10) {
                return null;
            }
            if (a11.getReason() == 6) {
                return a11;
            }
        }
        return null;
    }

    private static List<F.c> o(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(F.c.a().b((String) next.getKey()).c((String) next.getValue()).a());
        }
        Collections.sort(arrayList, new a0());
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(F.e.d dVar, c cVar, boolean z10) {
        g.f().b("disk worker: log non-fatal event to persistence");
        this.f62962b.y(dVar, cVar.b(), z10);
    }

    /* access modifiers changed from: private */
    public boolean u(C8971l<C> lVar) {
        if (lVar.q()) {
            C m10 = lVar.m();
            g f10 = g.f();
            f10.b("Crashlytics report successfully enqueued to DataTransport: " + m10.d());
            File c10 = m10.c();
            if (c10.delete()) {
                g f11 = g.f();
                f11.b("Deleted report file: " + c10.getPath());
                return true;
            }
            g f12 = g.f();
            f12.k("Crashlytics could not delete report file: " + c10.getPath());
            return true;
        }
        g.f().l("Crashlytics report could not be enqueued to DataTransport", lVar.l());
        return false;
    }

    private void v(Throwable th2, Thread thread, String str, c cVar, boolean z10) {
        boolean equals = str.equals("crash");
        F.e.d f10 = f(this.f62961a.d(th2, thread, str, cVar.c(), 4, 8, z10), cVar.a());
        if (!z10) {
            this.f62967g.f63182b.f(new Y(this, f10, cVar, equals));
        } else {
            this.f62962b.y(f10, cVar.b(), equals);
        }
    }

    public C8971l<Void> A(Executor executor) {
        return B(executor, (String) null);
    }

    public C8971l<Void> B(Executor executor, String str) {
        List<C> w10 = this.f62962b.w();
        ArrayList arrayList = new ArrayList();
        for (C next : w10) {
            if (str == null || str.equals(next.d())) {
                arrayList.add(this.f62963c.c(k(next), str != null).h(executor, new Z(this)));
            }
        }
        return C8974o.g(arrayList);
    }

    public void l(String str, List<N> list, F.a aVar) {
        g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (N k10 : list) {
            F.d.b k11 = k10.k();
            if (k11 != null) {
                arrayList.add(k11);
            }
        }
        this.f62962b.l(str, F.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void m(long j10, String str) {
        this.f62962b.k(str, j10);
    }

    public boolean p() {
        return this.f62962b.r();
    }

    public SortedSet<String> s() {
        return this.f62962b.p();
    }

    public void t(String str, long j10) {
        this.f62962b.z(this.f62961a.e(str, j10));
    }

    public void w(Throwable th2, Thread thread, String str, long j10) {
        g f10 = g.f();
        f10.i("Persisting fatal event for session " + str);
        v(th2, thread, "crash", new c(str, j10), true);
    }

    public void x(Throwable th2, Thread thread, c cVar) {
        g f10 = g.f();
        f10.i("Persisting non-fatal event for session " + cVar.b());
        v(th2, thread, UiComponentContainer.RESULT_ERROR, cVar, false);
    }

    public void y(String str, List<ApplicationExitInfo> list, f fVar, p pVar) {
        ApplicationExitInfo n10 = n(str, list);
        if (n10 == null) {
            g f10 = g.f();
            f10.i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        F.e.d c10 = this.f62961a.c(h(n10));
        g f11 = g.f();
        f11.b("Persisting anr for session " + str);
        this.f62962b.y(g(d(c10, fVar, pVar), pVar), str, true);
    }

    public void z() {
        this.f62962b.i();
    }
}
