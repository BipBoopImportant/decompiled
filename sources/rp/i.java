package Rp;

import Ae.e;
import Ae.j;
import Ae.r;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.v;
import XH.y;
import YH.C16877v;
import YH.X;
import androidx.lifecycle.U;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.q;
import tI.C17978n;
import x4.C8951o;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\rH@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR3\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u001d0\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LRp/i;", "LQp/b;", "LQp/a;", "detectScreenshotRepository", "", "LAe/r;", "routeToScreenMappers", "LAe/e;", "analytics", "LEe/a;", "analyticsEnabledUseCase", "<init>", "(LQp/a;Ljava/util/Set;LAe/e;LEe/a;)V", "Lx4/o;", "", "h", "(Lx4/o;)Ljava/lang/String;", "navController", "LXH/N;", "a", "(Lx4/o;LdI/e;)Ljava/lang/Object;", "LQp/a;", "b", "Ljava/util/Set;", "c", "LAe/e;", "d", "LEe/a;", "", "Lkotlin/Function1;", "Landroidx/lifecycle/U;", "e", "LXH/o;", "g", "()Ljava/util/Map;", "allRouteMappers", "detectscreenshotrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements Qp.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Qp.a f86961a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<r> f86962b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final e f86963c;

    /* renamed from: d  reason: collision with root package name */
    private final Ee.a f86964d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f86965e = C16825p.b(new h(this));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.detectscreenshotrepository.impl.DetectScreenshotTrackerImpl$track$$inlined$flatMapLatest$1", f = "DetectScreenshotTrackerImpl.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends l implements q<C16533h<? super C16807N>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f86966c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f86967d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f86968e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f86969f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, i iVar) {
            super(3, eVar);
            this.f86969f = iVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C16807N> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f86969f);
            aVar.f86967d = hVar;
            aVar.f86968e = bool;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f86966c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f86967d;
                C16532g<C16807N> a10 = ((Boolean) this.f86968e).booleanValue() ? this.f86969f.f86961a.a() : C16534i.y();
                this.f86966c = 1;
                if (C16534i.x(hVar, a10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f86970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C8951o f86971b;

        b(i iVar, C8951o oVar) {
            this.f86970a = iVar;
            this.f86971b = oVar;
        }

        /* renamed from: c */
        public final Object emit(C16807N n10, C17164e<? super C16807N> eVar) {
            String e10 = this.f86970a.h(this.f86971b);
            if (e10 != null) {
                this.f86970a.f86963c.track(j.ACTION_SCREENSHOT.b(), X.f(C16796C.a("screen_name", e10)));
            }
            return C16807N.f139792a;
        }
    }

    public i(Qp.a aVar, Set<? extends r> set, e eVar, Ee.a aVar2) {
        C17542s.j(aVar, "detectScreenshotRepository");
        C17542s.j(set, "routeToScreenMappers");
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar2, "analyticsEnabledUseCase");
        this.f86961a = aVar;
        this.f86962b = set;
        this.f86963c = eVar;
        this.f86964d = aVar2;
    }

    /* access modifiers changed from: private */
    public static final Map f(i iVar) {
        ArrayList<Map.Entry> arrayList = new ArrayList<>();
        for (r a10 : iVar.f86962b) {
            C16877v.E(arrayList, a10.a().entrySet());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(arrayList, 10)), 16));
        for (Map.Entry entry : arrayList) {
            v a11 = C16796C.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a11.c(), a11.d());
        }
        return linkedHashMap;
    }

    private final Map<String, C17642l<U, String>> g() {
        return (Map) this.f86965e.getValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r5 = (java.lang.String) r0.invoke(Xo.b.a(r5.c()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String h(x4.C8951o r5) {
        /*
            r4 = this;
            x4.l r5 = r5.H()
            r0 = 0
            if (r5 == 0) goto L_0x0063
            x4.v r1 = r5.e()
            if (r1 != 0) goto L_0x000e
            goto L_0x0063
        L_0x000e:
            java.util.Map r2 = r4.g()
            int r3 = r1.x()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            nI.l r2 = (nI.C17642l) r2
            if (r2 == 0) goto L_0x003d
            android.os.Bundle r3 = r5.c()
            androidx.lifecycle.U r3 = Xo.b.a(r3)
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x003d
            int r2 = r1.x()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            if (r2 == 0) goto L_0x003d
            goto L_0x0044
        L_0x003d:
            java.lang.String r2 = r1.C()
            if (r2 != 0) goto L_0x0044
            return r0
        L_0x0044:
            java.util.Map r0 = r4.g()
            java.lang.Object r0 = r0.get(r2)
            nI.l r0 = (nI.C17642l) r0
            if (r0 == 0) goto L_0x0062
            android.os.Bundle r5 = r5.c()
            androidx.lifecycle.U r5 = Xo.b.a(r5)
            java.lang.Object r5 = r0.invoke(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r2 = r5
        L_0x0062:
            return r2
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Rp.i.h(x4.o):java.lang.String");
    }

    public Object a(C8951o oVar, C17164e<? super C16807N> eVar) {
        Object collect = C16534i.g0(this.f86964d.invoke(), new a((C17164e) null, this)).collect(new b(this, oVar), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }
}
