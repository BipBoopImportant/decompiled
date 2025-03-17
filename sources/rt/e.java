package Rt;

import HJ.C15854t;
import IC.C13023e;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Rt.b;
import Rt.c;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.x;
import XH.y;
import YH.X;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsRoutes$EventDetails;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gt.C11357e;
import gu.C11360a;
import java.util.ArrayList;
import java.util.Iterator;
import jt.C11453a;
import jt.b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import x4.O;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00107\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0004¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u00106R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120/8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00102R\u0011\u0010;\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b:\u0010\u001e¨\u0006<"}, d2 = {"LRt/e;", "Landroidx/lifecycle/f0;", "LRt/d;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lgu/a;", "getStoreEventUseCase", "Lgt/e;", "storeEventsRepository", "LPt/a;", "analytics", "LWt/a;", "storeEventMapper", "<init>", "(Landroidx/lifecycle/U;Lgu/a;Lgt/e;LPt/a;LWt/a;)V", "LXH/N;", "D", "()V", "", "slotId", "K", "(Ljava/lang/String;)V", "E", "Ljt/b;", "storeEvent", "selectedTimeSlotId", "LSt/a;", "I", "(Ljt/b;Ljava/lang/String;)LSt/a;", "H", "()Ljava/lang/String;", "LRt/b;", "action", "J", "(LRt/b;)V", "m", "Lgu/a;", "n", "Lgt/e;", "o", "LPt/a;", "p", "LWt/a;", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$EventDetails;", "q", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$EventDetails;", "route", "LTJ/B;", "LRt/c;", "r", "LTJ/B;", "_state", "s", "G", "()LTJ/B;", "state", "t", "selectedTimeSlotFlow", "F", "eventId", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends f0 implements d {

    /* renamed from: m  reason: collision with root package name */
    private final C11360a f87023m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C11357e f87024n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Pt.a f87025o;

    /* renamed from: p  reason: collision with root package name */
    private final Wt.a f87026p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final StoreEventsRoutes$EventDetails f87027q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<c> f87028r;

    /* renamed from: s  reason: collision with root package name */
    private final C16505B<c> f87029s;

    /* renamed from: t  reason: collision with root package name */
    private final C16505B<String> f87030t = C16521S.a(null);

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Rt/e$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f87031a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, e eVar) {
            super(aVar);
            this.f87031a = eVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            this.f87031a.f87025o.a(this.f87031a.f87027q.c(), false);
            C16505B k10 = this.f87031a.f87028r;
            do {
                value = k10.getValue();
            } while (!k10.e(value, c.b((c) value, (St.a) null, (C13023e) null, c.a.b.f87020a, false, 11, (Object) null)));
            e eVar = this.f87031a;
            qv.e eVar2 = qv.e.INFO;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar2, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("cancel registration failed", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = eVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar2, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.details.presentation.StoreEventDetailsViewModelImpl$cancelRegistration$1", f = "StoreEventDetailsViewModelImpl.kt", l = {106}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f87032c;

        /* renamed from: d  reason: collision with root package name */
        Object f87033d;

        /* renamed from: e  reason: collision with root package name */
        Object f87034e;

        /* renamed from: f  reason: collision with root package name */
        int f87035f;

        /* renamed from: g  reason: collision with root package name */
        int f87036g;

        /* renamed from: h  reason: collision with root package name */
        int f87037h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f87038i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f87038i = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f87038i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            c b10;
            Object f10 = C17187b.f();
            int i10 = this.f87037h;
            if (i10 == 0) {
                y.b(obj);
                C16505B k10 = this.f87038i.f87028r;
                do {
                    value2 = k10.getValue();
                    b10 = c.b((c) value2, (St.a) null, (C13023e) null, c.a.C1803c.f87021a, false, 11, (Object) null);
                } while (!k10.e(value2, b10));
                C11357e j10 = this.f87038i.f87024n;
                String b11 = this.f87038i.f87027q.b();
                String H10 = this.f87038i.H();
                C11453a.C2232a aVar = C11453a.C2232a.f98716a;
                this.f87032c = k10;
                this.f87033d = value2;
                this.f87034e = b10;
                this.f87035f = 0;
                this.f87036g = 0;
                this.f87037h = 1;
                if (j10.b(b11, H10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                c cVar = (c) this.f87034e;
                C16505B b12 = (C16505B) this.f87032c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f87038i.f87025o.a(this.f87038i.f87027q.c(), true);
            C16505B k11 = this.f87038i.f87028r;
            do {
                value = k11.getValue();
            } while (!k11.e(value, c.b((c) value, (St.a) null, (C13023e) null, (c.a) null, false, 11, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"LXH/x;", "Ljt/b;", "eventResult", "", "timeSlotId", "LXH/v;", "LSt/a;", "LIC/e;", "<anonymous>", "(LXH/x;Ljava/lang/String;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.details.presentation.StoreEventDetailsViewModelImpl$collectStates$1", f = "StoreEventDetailsViewModelImpl.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements q<x<? extends jt.b>, String, C17164e<? super v<? extends St.a, ? extends C13023e>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87039c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f87040d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f87041e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f87042f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, C17164e<? super c> eVar2) {
            super(3, eVar2);
            this.f87042f = eVar;
        }

        public final Object i(Object obj, String str, C17164e<? super v<St.a, ? extends C13023e>> eVar) {
            c cVar = new c(this.f87042f, eVar);
            cVar.f87040d = x.a(obj);
            cVar.f87041e = str;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((x) obj).j(), (String) obj2, (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C17187b.f();
            if (this.f87039c == 0) {
                y.b(obj);
                Object j10 = ((x) this.f87040d).j();
                String str = (String) this.f87041e;
                e eVar = this.f87042f;
                if (x.h(j10)) {
                    jt.b bVar = (jt.b) j10;
                    St.a C10 = eVar.I(bVar, str);
                    Iterator it = bVar.h().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (C17542s.e(((b.f) obj2).d(), str)) {
                            break;
                        }
                    }
                    b.f fVar = (b.f) obj2;
                    j10 = C16796C.a(C10, fVar != null ? Wt.c.c(fVar) : null);
                }
                Object b10 = x.b(j10);
                return x.g(b10) ? C16796C.a(null, null) : b10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "LXH/v;", "LSt/a;", "LIC/e;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.details.presentation.StoreEventDetailsViewModelImpl$collectStates$2", f = "StoreEventDetailsViewModelImpl.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<C16533h<? super v<? extends St.a, ? extends C13023e>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f87044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, C17164e<? super d> eVar2) {
            super(2, eVar2);
            this.f87044d = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f87044d, eVar);
        }

        public final Object invoke(C16533h<? super v<St.a, ? extends C13023e>> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f87043c == 0) {
                y.b(obj);
                C16505B k10 = this.f87044d.f87028r;
                do {
                    value = k10.getValue();
                } while (!k10.e(value, c.b((c) value, (St.a) null, (C13023e) null, (c.a) null, true, 7, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LXH/v;", "LSt/a;", "LIC/e;", "<destruct>", "LXH/N;", "<anonymous>", "(LXH/v;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.details.presentation.StoreEventDetailsViewModelImpl$collectStates$3", f = "StoreEventDetailsViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Rt.e$e  reason: collision with other inner class name */
    static final class C1804e extends l implements p<v<? extends St.a, ? extends C13023e>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87045c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f87046d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f87047e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1804e(e eVar, C17164e<? super C1804e> eVar2) {
            super(2, eVar2);
            this.f87047e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C1804e eVar2 = new C1804e(this.f87047e, eVar);
            eVar2.f87046d = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(v<St.a, ? extends C13023e> vVar, C17164e<? super C16807N> eVar) {
            return ((C1804e) create(vVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f87045c == 0) {
                y.b(obj);
                v vVar = (v) this.f87046d;
                St.a aVar = (St.a) vVar.a();
                C13023e eVar = (C13023e) vVar.b();
                C16505B k10 = this.f87047e.f87028r;
                do {
                    value = k10.getValue();
                } while (!k10.e(value, c.b((c) value, aVar, eVar, (c.a) null, false, 4, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e(U u10, C11360a aVar, C11357e eVar, Pt.a aVar2, Wt.a aVar3) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "getStoreEventUseCase");
        C17542s.j(eVar, "storeEventsRepository");
        C17542s.j(aVar2, "analytics");
        C17542s.j(aVar3, "storeEventMapper");
        this.f87023m = aVar;
        this.f87024n = eVar;
        this.f87025o = aVar2;
        this.f87026p = aVar3;
        this.f87027q = (StoreEventsRoutes$EventDetails) O.a(u10, P.b(StoreEventsRoutes$EventDetails.class), X.j());
        C16505B<c> a10 = C16521S.a(new c((St.a) null, (C13023e) null, (c.a) null, false, 15, (DefaultConstructorMarker) null));
        this.f87028r = a10;
        this.f87029s = a10;
        E();
    }

    private final void D() {
        this.f87025o.c(this.f87027q.c(), true);
        F0 unused = C16314k.d(g0.a(this), new a(N.f137593c0, this), (T) null, new b(this, (C17164e<? super b>) null), 2, (Object) null);
    }

    private final void E() {
        C16534i.M(C16534i.R(C16534i.S(C16534i.s(C16534i.n(this.f87023m.a(this.f87027q.c(), this.f87027q.b()), this.f87030t, new c(this, (C17164e<? super c>) null))), new d(this, (C17164e<? super d>) null)), new C1804e(this, (C17164e<? super C1804e>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public final St.a I(jt.b bVar, String str) {
        String d10 = this.f87026p.c(bVar, str).d();
        K(d10);
        return this.f87026p.a(bVar, d10);
    }

    private final void K(String str) {
        this.f87030t.setValue(str);
    }

    public final String F() {
        return this.f87027q.b();
    }

    /* renamed from: G */
    public C16505B<c> getState() {
        return this.f87029s;
    }

    public String H() {
        String value = this.f87030t.getValue();
        if (value != null) {
            return value;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* renamed from: J */
    public void b(b bVar) {
        c.a dVar;
        c value;
        b.f.a l10;
        c value2;
        C17542s.j(bVar, "action");
        if (bVar instanceof b.d) {
            K(((b.d) bVar).a());
        } else if (C17542s.e(bVar, b.a.f87011a)) {
            C16505B<c> b10 = this.f87028r;
            do {
                value2 = b10.getValue();
            } while (!b10.e(value2, c.b(value2, (St.a) null, (C13023e) null, (c.a) null, false, 11, (Object) null)));
        } else if (C17542s.e(bVar, b.c.f87013a)) {
            St.a f10 = getState().getValue().f();
            if (f10 == null || (l10 = f10.l()) == null || !l10.b()) {
                this.f87025o.h(this.f87027q.c());
                dVar = new c.a.d(H());
            } else {
                this.f87025o.c(this.f87027q.c(), false);
                dVar = c.a.C1802a.f87019a;
            }
            c.a aVar = dVar;
            C16505B<c> b11 = this.f87028r;
            do {
                value = b11.getValue();
            } while (!b11.e(value, c.b(value, (St.a) null, (C13023e) null, aVar, false, 11, (Object) null)));
        } else if (C17542s.e(bVar, b.C1801b.f87012a)) {
            D();
        } else if (C17542s.e(bVar, a.f87010a)) {
            this.f87025o.f();
        } else {
            throw new t();
        }
    }
}
