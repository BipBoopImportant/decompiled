package Qb;

import Tb.F;
import Yb.j;
import Zb.d;
import Zb.e;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class B {

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, Integer> f62899g;

    /* renamed from: h  reason: collision with root package name */
    static final String f62900h = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"19.4.0"});

    /* renamed from: a  reason: collision with root package name */
    private final Context f62901a;

    /* renamed from: b  reason: collision with root package name */
    private final K f62902b;

    /* renamed from: c  reason: collision with root package name */
    private final C9243a f62903c;

    /* renamed from: d  reason: collision with root package name */
    private final d f62904d;

    /* renamed from: e  reason: collision with root package name */
    private final j f62905e;

    /* renamed from: f  reason: collision with root package name */
    private final Nb.j f62906f = Nb.j.f61983a;

    static {
        HashMap hashMap = new HashMap();
        f62899g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public B(Context context, K k10, C9243a aVar, d dVar, j jVar) {
        this.f62901a = context;
        this.f62902b = k10;
        this.f62903c = aVar;
        this.f62904d = dVar;
        this.f62905e = jVar;
    }

    private F.e.d.a.c A(F.a aVar) {
        return this.f62906f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private F.a a(F.a aVar) {
        List list;
        if (!this.f62905e.b().f64900b.f64909c || this.f62903c.f62952c.size() <= 0) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C9248f next : this.f62903c.f62952c) {
                arrayList.add(F.a.C1093a.a().d(next.c()).b(next.a()).c(next.b()).a());
            }
            list = Collections.unmodifiableList(arrayList);
        }
        return F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(list).a();
    }

    private F.b b() {
        return F.b().l("19.4.0").h(this.f62903c.f62950a).i(this.f62902b.a().c()).g(this.f62902b.a().e()).f(this.f62902b.a().d()).d(this.f62903c.f62955f).e(this.f62903c.f62956g).k(4);
    }

    private static long f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f62899g.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    private F.e.d.a.b.C1097a h() {
        return F.e.d.a.b.C1097a.a().b(0).d(0).c(this.f62903c.f62954e).e(this.f62903c.f62951b).a();
    }

    private List<F.e.d.a.b.C1097a> i() {
        return Collections.singletonList(h());
    }

    private F.e.d.a j(int i10, F.a aVar) {
        return F.e.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i10).f(o(aVar)).a();
    }

    private F.e.d.a k(int i10, e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean bool;
        F.e.d.a.c e10 = this.f62906f.e(this.f62901a);
        if (e10.b() > 0) {
            bool = Boolean.valueOf(e10.b() != 100);
        } else {
            bool = null;
        }
        return F.e.d.a.a().c(bool).d(e10).b(this.f62906f.d(this.f62901a)).h(i10).f(p(eVar, thread, i11, i12, z10)).a();
    }

    private F.e.d.c l(int i10) {
        C9247e a10 = C9247e.a(this.f62901a);
        Float b10 = a10.b();
        Double valueOf = b10 != null ? Double.valueOf(b10.doubleValue()) : null;
        int c10 = a10.c();
        boolean n10 = C9251i.n(this.f62901a);
        return F.e.d.c.a().b(valueOf).c(c10).f(n10).e(i10).g(f(C9251i.b(this.f62901a) - C9251i.a(this.f62901a))).d(C9251i.c(Environment.getDataDirectory().getPath())).a();
    }

    private F.e.d.a.b.c m(e eVar, int i10, int i11) {
        return n(eVar, i10, i11, 0);
    }

    private F.e.d.a.b.c n(e eVar, int i10, int i11, int i12) {
        String str = eVar.f65067b;
        String str2 = eVar.f65066a;
        StackTraceElement[] stackTraceElementArr = eVar.f65068c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        e eVar2 = eVar.f65069d;
        if (i12 >= i11) {
            e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f65069d;
                i13++;
            }
        }
        F.e.d.a.b.c.C1100a d10 = F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i10)).d(i13);
        if (eVar2 != null && i13 == 0) {
            d10.b(n(eVar2, i10, i11, i12 + 1));
        }
        return d10.a();
    }

    private F.e.d.a.b o(F.a aVar) {
        return F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private F.e.d.a.b p(e eVar, Thread thread, int i10, int i11, boolean z10) {
        return F.e.d.a.b.a().f(z(eVar, thread, i10, z10)).d(m(eVar, i10, i11)).e(w()).c(i()).a();
    }

    private F.e.d.a.b.C1103e.C1105b q(StackTraceElement stackTraceElement, F.e.d.a.b.C1103e.C1105b.C1106a aVar) {
        long j10 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j10 = (long) stackTraceElement.getLineNumber();
        }
        return aVar.e(max).f(str).b(fileName).d(j10).a();
    }

    private List<F.e.d.a.b.C1103e.C1105b> r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement q10 : stackTraceElementArr) {
            arrayList.add(q(q10, F.e.d.a.b.C1103e.C1105b.a().c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private F.e.a s() {
        return F.e.a.a().e(this.f62902b.f()).g(this.f62903c.f62955f).d(this.f62903c.f62956g).f(this.f62902b.a().c()).b(this.f62903c.f62957h.d()).c(this.f62903c.f62957h.e()).a();
    }

    private F.e t(String str, long j10) {
        return F.e.a().m(j10).j(str).h(f62900h).b(s()).l(v()).e(u()).i(3).a();
    }

    private F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g10 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = C9251i.b(this.f62901a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean w10 = C9251i.w();
        int l10 = C9251i.l();
        String str = Build.MANUFACTURER;
        return F.e.c.a().b(g10).f(Build.MODEL).c(availableProcessors).h(b10).d(blockCount).i(w10).j(l10).e(str).g(Build.PRODUCT).a();
    }

    private F.e.C1110e v() {
        return F.e.C1110e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(C9251i.x()).a();
    }

    private F.e.d.a.b.C1101d w() {
        return F.e.d.a.b.C1101d.a().d("0").c("0").b(0).a();
    }

    private F.e.d.a.b.C1103e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private F.e.d.a.b.C1103e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return F.e.d.a.b.C1103e.a().d(thread.getName()).c(i10).b(r(stackTraceElementArr, i10)).a();
    }

    private List<F.e.d.a.b.C1103e> z(e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f65068c, i10));
        if (z10) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(x(thread2, this.f62904d.a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public F.e.d c(F.a aVar) {
        int i10 = this.f62901a.getResources().getConfiguration().orientation;
        return F.e.d.a().g("anr").f(aVar.i()).b(j(i10, a(aVar))).c(l(i10)).a();
    }

    public F.e.d d(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f62901a.getResources().getConfiguration().orientation;
        Throwable th3 = th2;
        String str2 = str;
        long j11 = j10;
        return F.e.d.a().g(str).f(j10).b(k(i12, e.a(th2, this.f62904d), thread, i10, i11, z10)).c(l(i12)).a();
    }

    public F e(String str, long j10) {
        return b().m(t(str, j10)).a();
    }
}
