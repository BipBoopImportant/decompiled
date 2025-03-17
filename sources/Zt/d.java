package Zt;

import IC.C13023e;
import IC.C13026h;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import YH.X;
import Zt.a;
import Zt.b;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import au.C11096a;
import com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsRoutes$EventRegistration;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gt.C11357e;
import java.util.Iterator;
import jt.C11453a;
import jt.b;
import kD.h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import lD.C14761c;
import nI.C17642l;
import nI.p;
import nI.s;
import x4.O;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u0010;\u001a\b\u0012\u0004\u0012\u000202068\u0016X\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u00104R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u00104¨\u0006@"}, d2 = {"LZt/d;", "Landroidx/lifecycle/f0;", "LZt/c;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lgt/e;", "storeEventsRepository", "LlD/c;", "getProfileFlowUseCase", "Lau/a;", "contentMapper", "LPt/a;", "analytics", "LIl/a;", "appConfigApi", "<init>", "(Landroidx/lifecycle/U;Lgt/e;LlD/c;Lau/a;LPt/a;LIl/a;)V", "LXH/N;", "G", "()V", "", "quantity", "L", "(I)V", "M", "K", "", "enabled", "I", "(Z)V", "H", "LZt/a;", "action", "J", "(LZt/a;)V", "m", "Lgt/e;", "n", "LlD/c;", "o", "Lau/a;", "p", "LPt/a;", "q", "LIl/a;", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$EventRegistration;", "r", "Lcom/ingka/ikea/instore/impl/storeevents/navigation/StoreEventsRoutes$EventRegistration;", "route", "LTJ/B;", "LZt/b;", "s", "LTJ/B;", "_state", "LTJ/P;", "t", "LTJ/P;", "getState", "()LTJ/P;", "state", "u", "adultCount", "v", "childrenCount", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends f0 implements c {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C11357e f90226m;

    /* renamed from: n  reason: collision with root package name */
    private final C14761c f90227n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C11096a f90228o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Pt.a f90229p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Il.a f90230q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final StoreEventsRoutes$EventRegistration f90231r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<b> f90232s;

    /* renamed from: t  reason: collision with root package name */
    private final C16519P<b> f90233t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<Integer> f90234u = C16521S.a(0);
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<Integer> f90235v = C16521S.a(0);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f90236a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zt.d$a$a  reason: collision with other inner class name */
        public static final class C1950a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f90237a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.instore.impl.storeevents.registration.presentation.StoreEventRegistrationViewModelImpl$collectState$$inlined$filterIsInstance$1$2", f = "StoreEventRegistrationViewModelImpl.kt", l = {50}, m = "emit")
            /* renamed from: Zt.d$a$a$a  reason: collision with other inner class name */
            public static final class C1951a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f90238c;

                /* renamed from: d  reason: collision with root package name */
                int f90239d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1950a f90240e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1951a(C1950a aVar, C17164e eVar) {
                    super(eVar);
                    this.f90240e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f90238c = obj;
                    this.f90239d |= Integer.MIN_VALUE;
                    return this.f90240e.emit((Object) null, this);
                }
            }

            public C1950a(C16533h hVar) {
                this.f90237a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Zt.d.a.C1950a.C1951a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Zt.d$a$a$a r0 = (Zt.d.a.C1950a.C1951a) r0
                    int r1 = r0.f90239d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f90239d = r1
                    goto L_0x0018
                L_0x0013:
                    Zt.d$a$a$a r0 = new Zt.d$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f90238c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f90239d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0043
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f90237a
                    boolean r2 = r5 instanceof kD.j.d
                    if (r2 == 0) goto L_0x0043
                    r0.f90239d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0043
                    return r1
                L_0x0043:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Zt.d.a.C1950a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f90236a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f90236a.collect(new C1950a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f90241a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f90242a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.instore.impl.storeevents.registration.presentation.StoreEventRegistrationViewModelImpl$collectState$$inlined$map$1$2", f = "StoreEventRegistrationViewModelImpl.kt", l = {50}, m = "emit")
            /* renamed from: Zt.d$b$a$a  reason: collision with other inner class name */
            public static final class C1952a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f90243c;

                /* renamed from: d  reason: collision with root package name */
                int f90244d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f90245e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1952a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f90245e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f90243c = obj;
                    this.f90244d |= Integer.MIN_VALUE;
                    return this.f90245e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f90242a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Zt.d.b.a.C1952a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Zt.d$b$a$a r0 = (Zt.d.b.a.C1952a) r0
                    int r1 = r0.f90244d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f90244d = r1
                    goto L_0x0018
                L_0x0013:
                    Zt.d$b$a$a r0 = new Zt.d$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f90243c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f90244d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f90242a
                    kD.j$d r5 = (kD.j.d) r5
                    kD.h r5 = r5.a()
                    r0.f90244d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Zt.d.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f90241a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f90241a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"LkD/h;", "profile", "Ljt/b;", "event", "", "adultCount", "childrenCount", "LXH/N;", "<anonymous>", "(LkD/h;Ljt/b;II)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.registration.presentation.StoreEventRegistrationViewModelImpl$collectState$2", f = "StoreEventRegistrationViewModelImpl.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements s<h, jt.b, Integer, Integer, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90246c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90247d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f90248e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ int f90249f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ int f90250g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f90251h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, C17164e<? super c> eVar) {
            super(5, eVar);
            this.f90251h = dVar;
        }

        public final Object i(h hVar, jt.b bVar, int i10, int i11, C17164e<? super C16807N> eVar) {
            c cVar = new c(this.f90251h, eVar);
            cVar.f90247d = hVar;
            cVar.f90248e = bVar;
            cVar.f90249f = i10;
            cVar.f90250g = i11;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Boolean a10;
            Object value;
            Boolean k10;
            C17187b.f();
            if (this.f90246c == 0) {
                y.b(obj);
                h hVar = (h) this.f90247d;
                jt.b bVar = (jt.b) this.f90248e;
                int i10 = this.f90249f;
                int i11 = this.f90250g;
                d dVar = this.f90251h;
                Iterator it = bVar.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (C17542s.e(((b.f) obj2).d(), dVar.f90231r.c())) {
                        break;
                    }
                }
                b.f fVar = (b.f) obj2;
                if (fVar == null) {
                    return C16807N.f139792a;
                }
                String c10 = bVar.a().c();
                C13023e c11 = C13026h.c(this.f90251h.f90228o.d(fVar.f(), fVar.c(), this.f90251h.f90230q.A()));
                String d10 = hVar.d();
                String str = hVar.d() + " " + hVar.f();
                String h10 = hVar.h();
                if (h10 == null || h10.length() == 0) {
                    h10 = null;
                }
                String G02 = C16877v.G0(C16877v.s(str, h10, hVar.b()), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
                b.a c12 = this.f90251h.getState().getValue().c();
                Boolean e10 = (c12 == null || (k10 = c12.k()) == null) ? this.f90251h.f90228o.e(bVar, hVar.h()) : k10;
                b.a c13 = this.f90251h.getState().getValue().c();
                if (c13 == null || (a10 = c13.j()) == null) {
                    a10 = this.f90251h.f90228o.a(bVar);
                }
                b.a aVar = new b.a(c10, c11, d10, G02, e10, a10, i10, i11, this.f90251h.f90228o.b(bVar, fVar, i10 + 1, i11), fVar.g() instanceof b.f.a.g);
                C16505B F10 = this.f90251h.f90232s;
                do {
                    value = F10.getValue();
                } while (!F10.e(value, b.b((b) value, aVar, (b.c) null, 2, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i((h) obj, (jt.b) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue(), (C17164e) obj5);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Zt/d$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zt.d$d  reason: collision with other inner class name */
    public static final class C1953d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f90252a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1953d(N.a aVar, d dVar) {
            super(aVar);
            this.f90252a = dVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            this.f90252a.f90229p.g(this.f90252a.f90231r.b(), false);
            C16505B F10 = this.f90252a.f90232s;
            do {
                value = F10.getValue();
            } while (!F10.e(value, b.b((b) value, (b.a) null, b.c.a.f90223a, 1, (Object) null)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.registration.presentation.StoreEventRegistrationViewModelImpl$register$2", f = "StoreEventRegistrationViewModelImpl.kt", l = {145}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f90253c;

        /* renamed from: d  reason: collision with root package name */
        int f90254d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b.a f90255e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f90256f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b.a aVar, d dVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f90255e = aVar;
            this.f90256f = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f90255e, this.f90256f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C11453a aVar;
            Object f10 = C17187b.f();
            int i10 = this.f90254d;
            if (i10 == 0) {
                y.b(obj);
                if (this.f90255e.l()) {
                    aVar = C11453a.b.f98717a;
                } else {
                    int intValue = ((Number) this.f90256f.f90234u.getValue()).intValue() + 1;
                    int intValue2 = ((Number) this.f90256f.f90235v.getValue()).intValue();
                    Boolean j10 = this.f90255e.j();
                    boolean z10 = false;
                    boolean booleanValue = j10 != null ? j10.booleanValue() : false;
                    Boolean k10 = this.f90255e.k();
                    if (k10 != null) {
                        z10 = k10.booleanValue();
                    }
                    aVar = new C11453a.c(intValue, intValue2, booleanValue, z10);
                }
                C11357e E10 = this.f90256f.f90226m;
                String a10 = this.f90256f.f90231r.a();
                String c10 = this.f90256f.f90231r.c();
                this.f90253c = aVar;
                this.f90254d = 1;
                if (E10.b(a10, c10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C11453a aVar2 = (C11453a) this.f90253c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f90256f.f90229p.g(this.f90256f.f90231r.b(), true);
            C16505B F10 = this.f90256f.f90232s;
            do {
                value = F10.getValue();
            } while (!F10.e(value, b.b((b) value, (b.a) null, b.c.C1949c.f90225a, 1, (Object) null)));
            return C16807N.f139792a;
        }
    }

    public d(U u10, C11357e eVar, C14761c cVar, C11096a aVar, Pt.a aVar2, Il.a aVar3) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(eVar, "storeEventsRepository");
        C17542s.j(cVar, "getProfileFlowUseCase");
        C17542s.j(aVar, "contentMapper");
        C17542s.j(aVar2, "analytics");
        C17542s.j(aVar3, "appConfigApi");
        this.f90226m = eVar;
        this.f90227n = cVar;
        this.f90228o = aVar;
        this.f90229p = aVar2;
        this.f90230q = aVar3;
        this.f90231r = (StoreEventsRoutes$EventRegistration) O.a(u10, P.b(StoreEventsRoutes$EventRegistration.class), X.j());
        C16505B<b> a10 = C16521S.a(new b((b.a) null, (b.c) null, 3, (DefaultConstructorMarker) null));
        this.f90232s = a10;
        this.f90233t = a10;
        G();
    }

    private final void G() {
        C16534i.M(C16534i.l(new b(new a(this.f90227n.invoke())), C16534i.A(this.f90226m.d(this.f90231r.b(), this.f90231r.a())), this.f90234u, this.f90235v, new c(this, (C17164e<? super c>) null)), g0.a(this));
    }

    private final void H(boolean z10) {
        b.a c10 = this.f90232s.getValue().c();
        if (c10 != null) {
            C16505B<b> b10 = this.f90232s;
            while (true) {
                b value = b10.getValue();
                if (b10.e(value, b.b(value, b.a.b(c10, (String) null, (C13023e) null, (String) null, (String) null, (Boolean) null, Boolean.valueOf(z10), 0, 0, (b.C1947b) null, false, 991, (Object) null), (b.c) null, 2, (Object) null))) {
                    return;
                }
            }
        }
    }

    private final void I(boolean z10) {
        b.a c10 = this.f90232s.getValue().c();
        if (c10 != null) {
            C16505B<b> b10 = this.f90232s;
            while (true) {
                b value = b10.getValue();
                if (b10.e(value, b.b(value, b.a.b(c10, (String) null, (C13023e) null, (String) null, (String) null, Boolean.valueOf(z10), (Boolean) null, 0, 0, (b.C1947b) null, false, 1007, (Object) null), (b.c) null, 2, (Object) null))) {
                    return;
                }
            }
        }
    }

    private final void K() {
        b value;
        this.f90229p.e(this.f90231r.b());
        b.a c10 = this.f90232s.getValue().c();
        if (c10 != null) {
            C16505B<b> b10 = this.f90232s;
            do {
                value = b10.getValue();
            } while (!b10.e(value, b.b(value, (b.a) null, b.c.C1948b.f90224a, 1, (Object) null)));
            F0 unused = C16314k.d(g0.a(this), new C1953d(N.f137593c0, this), (T) null, new e(c10, this, (C17164e<? super e>) null), 2, (Object) null);
        }
    }

    private final void L(int i10) {
        this.f90234u.setValue(Integer.valueOf(i10));
    }

    private final void M(int i10) {
        this.f90235v.setValue(Integer.valueOf(i10));
    }

    /* renamed from: J */
    public void b(a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof a.C1946a) {
            H(((a.C1946a) aVar).a());
        } else if (aVar instanceof a.b) {
            I(((a.b) aVar).a());
        } else if (C17542s.e(aVar, a.c.f90201a)) {
            K();
        } else if (aVar instanceof a.d) {
            L(((a.d) aVar).a());
        } else if (aVar instanceof a.e) {
            M(((a.e) aVar).a());
        } else {
            throw new t();
        }
    }

    public C16519P<b> getState() {
        return this.f90233t;
    }
}
