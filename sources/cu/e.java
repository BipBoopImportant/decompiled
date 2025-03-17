package cu;

import HJ.C15854t;
import IC.C13023e;
import KJ.C15987c;
import KJ.C15990f;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import YH.X;
import aA.C13909a;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsRoutes$EventSchedule;
import com.sugarcube.core.logger.DslKt;
import cu.C11190b;
import cu.C11191c;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import du.C11241a;
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
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import x4.O;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J)\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020 0<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160<8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010>R \u0010F\u001a\b\u0012\u0004\u0012\u00020 0A8\u0016X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0011\u0010I\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcu/e;", "Landroidx/lifecycle/f0;", "Lcu/d;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lgu/a;", "getStoreEventUseCase", "Lgt/e;", "storeEventsRepository", "Ldu/a;", "timeSlotUiModelMapper", "LaA/a;", "sessionManager", "LPt/a;", "analytics", "LQJ/M;", "ioDispatcher", "<init>", "(Landroidx/lifecycle/U;Lgu/a;Lgt/e;Ldu/a;LaA/a;LPt/a;LQJ/M;)V", "LXH/N;", "D", "()V", "", "timeSlotId", "J", "(Ljava/lang/String;)V", "E", "Ljt/b;", "event", "", "isLoggedIn", "selectedTimeSlotId", "Lcu/c;", "G", "(Ljt/b;ZLjava/lang/String;)Lcu/c;", "Lcu/b;", "action", "H", "(Lcu/b;)V", "registrationRequired", "Ldu/a$b;", "mappedSlots", "I", "(ZLdu/a$b;)Z", "m", "Lgu/a;", "n", "Lgt/e;", "o", "Ldu/a;", "p", "LaA/a;", "q", "LPt/a;", "r", "LQJ/M;", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$EventSchedule;", "s", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$EventSchedule;", "route", "LTJ/B;", "t", "LTJ/B;", "_state", "u", "LTJ/P;", "v", "LTJ/P;", "getState", "()LTJ/P;", "state", "F", "()Ljava/lang/String;", "eventId", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends f0 implements d {

    /* renamed from: m  reason: collision with root package name */
    private final C11360a f96802m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C11357e f96803n;

    /* renamed from: o  reason: collision with root package name */
    private final C11241a f96804o;

    /* renamed from: p  reason: collision with root package name */
    private final C13909a f96805p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Pt.a f96806q;

    /* renamed from: r  reason: collision with root package name */
    private final M f96807r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final StoreEventsRoutes$EventSchedule f96808s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C16505B<C11191c> f96809t;

    /* renamed from: u  reason: collision with root package name */
    private final C16505B<String> f96810u;

    /* renamed from: v  reason: collision with root package name */
    private final C16519P<C11191c> f96811v;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"cu/e$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f96812a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, e eVar) {
            super(aVar);
            this.f96812a = eVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f96812a.f96806q.a(this.f96812a.f96808s.b(), false);
            C16505B k10 = this.f96812a.f96809t;
            while (true) {
                Object value = k10.getValue();
                if (k10.e(value, C11191c.b((C11191c) value, (C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, false, false, false, false, (String) null, false, (C13023e) null, C11191c.a.b.f96799a, 4095, (Object) null))) {
                    break;
                }
                Throwable th3 = th2;
            }
            e eVar = this.f96812a;
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
                } else {
                    Throwable th4 = th2;
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
    @f(c = "com.ingka.ikea.instore.impl.storeevents.schedule.presentation.StoreEventScheduleViewModelImpl$cancelRegistration$1", f = "StoreEventScheduleViewModelImpl.kt", l = {107}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f96813c;

        /* renamed from: d  reason: collision with root package name */
        Object f96814d;

        /* renamed from: e  reason: collision with root package name */
        Object f96815e;

        /* renamed from: f  reason: collision with root package name */
        int f96816f;

        /* renamed from: g  reason: collision with root package name */
        int f96817g;

        /* renamed from: h  reason: collision with root package name */
        int f96818h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f96819i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f96819i = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f96819i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            C11191c b10;
            Object f10 = C17187b.f();
            int i10 = this.f96818h;
            if (i10 == 0) {
                y.b(obj);
                C16505B k10 = this.f96819i.f96809t;
                do {
                    value2 = k10.getValue();
                    b10 = C11191c.b((C11191c) value2, (C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, false, false, false, false, (String) null, false, (C13023e) null, C11191c.a.C2144c.f96800a, 4095, (Object) null);
                } while (!k10.e(value2, b10));
                C11357e j10 = this.f96819i.f96803n;
                String a10 = this.f96819i.f96808s.a();
                String i11 = this.f96819i.getState().getValue().i();
                if (i11 != null) {
                    C11453a.C2232a aVar = C11453a.C2232a.f98716a;
                    this.f96813c = k10;
                    this.f96814d = value2;
                    this.f96815e = b10;
                    this.f96816f = 0;
                    this.f96817g = 0;
                    this.f96818h = 1;
                    if (j10.b(a10, i11, aVar, this) == f10) {
                        return f10;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (i10 == 1) {
                C11191c cVar = (C11191c) this.f96815e;
                C16505B b11 = (C16505B) this.f96813c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f96819i.f96806q.a(this.f96819i.f96808s.b(), true);
            C16505B k11 = this.f96819i.f96809t;
            do {
                value = k11.getValue();
            } while (!k11.e(value, C11191c.b((C11191c) value, (C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, false, false, false, false, (String) null, false, (C13023e) null, (C11191c.a) null, 4095, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "selectedTimeSlotId", "LXH/x;", "Ljt/b;", "event", "", "isLoggedIn", "Lcu/c;", "<anonymous>", "(Ljava/lang/String;LXH/x;Z)Lcu/c;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.schedule.presentation.StoreEventScheduleViewModelImpl$collectStates$1", f = "StoreEventScheduleViewModelImpl.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements r<String, x<? extends jt.b>, Boolean, C17164e<? super C11191c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f96820c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f96821d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f96822e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f96823f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f96824g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, C17164e<? super c> eVar2) {
            super(4, eVar2);
            this.f96824g = eVar;
        }

        public final Object i(String str, Object obj, boolean z10, C17164e<? super C11191c> eVar) {
            c cVar = new c(this.f96824g, eVar);
            cVar.f96821d = str;
            cVar.f96822e = x.a(obj);
            cVar.f96823f = z10;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f96820c == 0) {
                y.b(obj);
                String str = (String) this.f96821d;
                Object j10 = ((x) this.f96822e).j();
                boolean z10 = this.f96823f;
                if (x.g(j10)) {
                    j10 = null;
                }
                jt.b bVar = (jt.b) j10;
                if (bVar != null) {
                    return this.f96824g.G(bVar, z10, str);
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((String) obj, ((x) obj2).j(), ((Boolean) obj3).booleanValue(), (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcu/c;", "state", "LXH/N;", "<anonymous>", "(Lcu/c;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.schedule.presentation.StoreEventScheduleViewModelImpl$collectStates$2", f = "StoreEventScheduleViewModelImpl.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<C11191c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f96825c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f96826d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f96827e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, C17164e<? super d> eVar2) {
            super(2, eVar2);
            this.f96827e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f96827e, eVar);
            dVar.f96826d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(C11191c cVar, C17164e<? super C16807N> eVar) {
            return ((d) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f96825c == 0) {
                y.b(obj);
                C11191c cVar = (C11191c) this.f96826d;
                if (cVar != null) {
                    C16505B k10 = this.f96827e.f96809t;
                    do {
                        value = k10.getValue();
                        C11191c cVar2 = (C11191c) value;
                    } while (!k10.e(value, cVar));
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e(U u10, C11360a aVar, C11357e eVar, C11241a aVar2, C13909a aVar3, Pt.a aVar4, M m10) {
        U u11 = u10;
        C11360a aVar5 = aVar;
        C11357e eVar2 = eVar;
        C11241a aVar6 = aVar2;
        C13909a aVar7 = aVar3;
        Pt.a aVar8 = aVar4;
        M m11 = m10;
        C17542s.j(u11, "savedStateHandle");
        C17542s.j(aVar5, "getStoreEventUseCase");
        C17542s.j(eVar2, "storeEventsRepository");
        C17542s.j(aVar6, "timeSlotUiModelMapper");
        C17542s.j(aVar7, "sessionManager");
        C17542s.j(aVar8, "analytics");
        C17542s.j(m11, "ioDispatcher");
        this.f96802m = aVar5;
        this.f96803n = eVar2;
        this.f96804o = aVar6;
        this.f96805p = aVar7;
        this.f96806q = aVar8;
        this.f96807r = m11;
        StoreEventsRoutes$EventSchedule storeEventsRoutes$EventSchedule = (StoreEventsRoutes$EventSchedule) O.a(u11, P.b(StoreEventsRoutes$EventSchedule.class), X.j());
        this.f96808s = storeEventsRoutes$EventSchedule;
        C16505B<C11191c> a10 = C16521S.a(new C11191c((C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, false, false, false, false, (String) null, false, (C13023e) null, (C11191c.a) null, 8191, (DefaultConstructorMarker) null));
        this.f96809t = a10;
        this.f96810u = C16521S.a(storeEventsRoutes$EventSchedule.c());
        this.f96811v = a10;
        E();
    }

    private final void D() {
        this.f96806q.c(this.f96808s.b(), true);
        F0 unused = C16314k.d(g0.a(this), new a(N.f137593c0, this), (T) null, new b(this, (C17164e<? super b>) null), 2, (Object) null);
    }

    private final void E() {
        C16534i.M(C16534i.R(C16534i.L(C16534i.m(this.f96810u, C16534i.s(this.f96802m.a(this.f96808s.b(), this.f96808s.a())), this.f96805p.n(), new c(this, (C17164e<? super c>) null)), this.f96807r), new d(this, (C17164e<? super d>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public final C11191c G(jt.b bVar, boolean z10, String str) {
        b.f.a aVar;
        Object obj;
        C11241a.b b10 = this.f96804o.b(bVar);
        Iterator it = bVar.h().iterator();
        while (true) {
            aVar = null;
            if (!it.hasNext()) {
                String str2 = str;
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((b.f) obj).d(), str)) {
                break;
            }
        }
        b.f fVar = (b.f) obj;
        boolean z11 = bVar.d() == b.C2233b.IKEA_FAMILY_ONLY && !this.f96805p.i();
        C15990f<i> c10 = b10.c();
        C15990f<i> a10 = b10.a();
        C15990f<i> e10 = b10.e();
        C15990f<i> d10 = b10.d();
        C15990f<i> b11 = b10.b();
        boolean I10 = I(bVar.f().d(), b10);
        boolean f10 = b10.f();
        C13023e c11 = fVar != null ? Wt.c.c(fVar) : null;
        if (fVar != null) {
            aVar = fVar.g();
        }
        return new C11191c(c10, a10, e10, d10, b11, I10, z10, z11, f10, str, aVar instanceof b.f.a.d, c11, (C11191c.a) null, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, (DefaultConstructorMarker) null);
    }

    private final void J(String str) {
        String value;
        C16505B<String> b10 = this.f96810u;
        do {
            value = b10.getValue();
            String str2 = value;
        } while (!b10.e(value, str));
    }

    public final String F() {
        return this.f96808s.a();
    }

    /* renamed from: H */
    public void b(C11190b bVar) {
        C11191c value;
        C11191c.a aVar;
        C11191c value2;
        C11190b bVar2 = bVar;
        C17542s.j(bVar2, "action");
        if (bVar2 instanceof C11190b.d) {
            J(((C11190b.d) bVar2).a());
        } else if (C17542s.e(bVar2, C11190b.c.f96783a)) {
            if (getState().getValue().o()) {
                this.f96806q.c(this.f96808s.b(), false);
                aVar = C11191c.a.C2143a.f96798a;
            } else {
                this.f96806q.h(this.f96808s.b());
                String i10 = getState().getValue().i();
                if (i10 != null) {
                    aVar = new C11191c.a.d(i10);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C16505B<C11191c> b10 = this.f96809t;
            do {
                value2 = b10.getValue();
            } while (!b10.e(value2, C11191c.b(value2, (C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, false, false, false, false, (String) null, false, (C13023e) null, aVar, 4095, (Object) null)));
        } else if (C17542s.e(bVar2, C11190b.a.f96781a)) {
            C16505B<C11191c> b11 = this.f96809t;
            do {
                value = b11.getValue();
            } while (!b11.e(value, C11191c.b(value, (C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, (C15987c) null, false, false, false, false, (String) null, false, (C13023e) null, (C11191c.a) null, 4095, (Object) null)));
        } else if (C17542s.e(bVar2, C11190b.C2142b.f96782a)) {
            D();
        } else if (C17542s.e(bVar2, C11189a.f96780a)) {
            this.f96806q.f();
        } else {
            throw new t();
        }
    }

    public final boolean I(boolean z10, C11241a.b bVar) {
        C17542s.j(bVar, "mappedSlots");
        return z10 && (!bVar.a().isEmpty() || !bVar.e().isEmpty());
    }

    public C16519P<C11191c> getState() {
        return this.f96811v;
    }
}
