package Ut;

import EB.C12832d;
import FB.C12860a;
import GB.h;
import HB.C12962b;
import HJ.C15854t;
import KJ.C15985a;
import KJ.C15987c;
import Pt.a;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import YH.X;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsRoutes$AllEvents;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gt.C11357e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import x4.O;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u00112\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0014¢\u0006\u0004\b%\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010<\u001a\b\u0012\u0004\u0012\u000205048\u0016X\u0004¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"LUt/c;", "Landroidx/lifecycle/f0;", "LUt/b;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lgt/e;", "storeEventsRepository", "LPt/a;", "storeEventsAnalytics", "LFB/a;", "localStoreSelectionRepository", "LHB/b;", "storeDetailsRepository", "LWt/a;", "storeEventMapper", "<init>", "(Landroidx/lifecycle/U;Lgt/e;LPt/a;LFB/a;LHB/b;LWt/a;)V", "LXH/N;", "E", "()V", "", "Ljt/b;", "events", "J", "(Ljava/util/List;)V", "LTJ/h;", "collector", "L", "(LTJ/h;)V", "", "throwable", "K", "(LTJ/h;Ljava/lang/Throwable;)V", "", "eventId", "M", "(Ljava/lang/String;)V", "onCleared", "m", "Lgt/e;", "n", "LPt/a;", "o", "LFB/a;", "p", "LHB/b;", "q", "LWt/a;", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$AllEvents;", "r", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$AllEvents;", "route", "LTJ/B;", "LUt/a;", "s", "LTJ/B;", "_state", "t", "I", "()LTJ/B;", "state", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends f0 implements b {

    /* renamed from: m  reason: collision with root package name */
    private final C11357e f88446m;

    /* renamed from: n  reason: collision with root package name */
    private final Pt.a f88447n;

    /* renamed from: o  reason: collision with root package name */
    private final C12860a f88448o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C12962b f88449p;

    /* renamed from: q  reason: collision with root package name */
    private final Wt.a f88450q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final StoreEventsRoutes$AllEvents f88451r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<a> f88452s;

    /* renamed from: t  reason: collision with root package name */
    private final C16505B<a> f88453t;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ut/c$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f88454a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, c cVar) {
            super(aVar);
            this.f88454a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            c cVar = this.f88454a;
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.list.presentation.StoreEventsListViewModelImpl$collectStates$2", f = "StoreEventsListViewModelImpl.kt", l = {69}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88455c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f88456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f88456d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f88456d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f88455c;
            if (i10 == 0) {
                y.b(obj);
                C12962b C10 = this.f88456d.f88449p;
                String a10 = this.f88456d.f88451r.a();
                this.f88455c = 1;
                obj = C10.a(a10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h hVar = (h) obj;
            C16505B D10 = this.f88456d.f88452s;
            do {
                value = D10.getValue();
            } while (!D10.e(value, a.b((a) value, hVar.e(), (C15987c) null, false, 6, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ut.c$c  reason: collision with other inner class name */
    /* synthetic */ class C1865c extends C17525a implements p<C16533h<? super List<? extends jt.b>>, C17164e<? super C16807N>, Object> {
        C1865c(Object obj) {
            super(2, obj, c.class, "handleStoreEventsStart", "handleStoreEventsStart(Lkotlinx/coroutines/flow/FlowCollector;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(C16533h<? super List<jt.b>> hVar, C17164e<? super C16807N> eVar) {
            return ((c) this.f144363a).L(hVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends C17525a implements p<List<? extends jt.b>, C17164e<? super C16807N>, Object> {
        d(Object obj) {
            super(2, obj, c.class, "handleStoreEvents", "handleStoreEvents(Ljava/util/List;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(List<jt.b> list, C17164e<? super C16807N> eVar) {
            return ((c) this.f144363a).J(list);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends C17525a implements q<C16533h<? super List<? extends jt.b>>, Throwable, C17164e<? super C16807N>, Object> {
        e(Object obj) {
            super(3, obj, c.class, "handleStoreEventsFailure", "handleStoreEventsFailure(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(C16533h<? super List<jt.b>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            return ((c) this.f144363a).K(hVar, th2);
        }
    }

    public c(U u10, C11357e eVar, Pt.a aVar, C12860a aVar2, C12962b bVar, Wt.a aVar3) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(eVar, "storeEventsRepository");
        C17542s.j(aVar, "storeEventsAnalytics");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        C17542s.j(bVar, "storeDetailsRepository");
        C17542s.j(aVar3, "storeEventMapper");
        this.f88446m = eVar;
        this.f88447n = aVar;
        this.f88448o = aVar2;
        this.f88449p = bVar;
        this.f88450q = aVar3;
        this.f88451r = (StoreEventsRoutes$AllEvents) O.a(u10, P.b(StoreEventsRoutes$AllEvents.class), X.j());
        C16505B<a> a10 = C16521S.a(new a((String) null, (C15987c) null, false, 7, (DefaultConstructorMarker) null));
        this.f88452s = a10;
        this.f88453t = a10;
        E();
    }

    private final void E() {
        if (this.f88448o.c() == null) {
            F0 unused = C16314k.d(g0.a(this), new a(N.f137593c0, this), (T) null, new b(this, (C17164e<? super b>) null), 2, (Object) null);
        }
        C16534i.M(C16534i.g(C16534i.R(C16534i.s(C16534i.S(this.f88446m.c(this.f88451r.a()), new C1865c(this))), new d(this)), new e(this)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public final void J(List<jt.b> list) {
        a value;
        a aVar;
        String g10;
        ArrayList arrayList;
        C16505B<a> b10 = this.f88452s;
        do {
            value = b10.getValue();
            aVar = value;
            jt.b bVar = (jt.b) C16877v.y0(list);
            g10 = bVar != null ? bVar.g() : null;
            Iterable<jt.b> iterable = list;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (jt.b b11 : iterable) {
                arrayList.add(this.f88450q.b(b11));
            }
        } while (!b10.e(value, aVar.a(g10, C15985a.l(arrayList), false)));
    }

    /* access modifiers changed from: private */
    public final void K(C16533h<? super List<jt.b>> hVar, Throwable th2) {
        a value;
        C16505B<a> b10 = this.f88452s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, a.b(value, (String) null, (C15987c) null, false, 3, (Object) null)));
        qv.e eVar = qv.e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, th2);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, th2, str3);
            str = str3;
            str2 = str4;
        }
    }

    /* access modifiers changed from: private */
    public final void L(C16533h<? super List<jt.b>> hVar) {
        a value;
        String name;
        C12832d c10 = this.f88448o.c();
        String str = null;
        if (!(c10 == null || (name = c10.getName()) == null || name.length() <= 0)) {
            str = name;
        }
        C16505B<a> b10 = this.f88452s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, a.b(value, str, (C15987c) null, true, 2, (Object) null)));
    }

    /* renamed from: I */
    public C16505B<a> getState() {
        return this.f88453t;
    }

    public void M(String str) {
        C17542s.j(str, "eventId");
        this.f88447n.d(this.f88451r.a(), str, a.C1743a.STORE_EVENT_LIST_PAGE);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f88446m.a(true);
        super.onCleared();
    }
}
