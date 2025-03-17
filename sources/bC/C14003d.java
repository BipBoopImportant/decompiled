package bC;

import GB.C12918c;
import HB.C12962b;
import HJ.C15854t;
import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import KJ.C15985a;
import KJ.C15987c;
import QJ.M;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.v;
import XH.y;
import androidx.lifecycle.U;
import androidx.lifecycle.g0;
import ax.C13990b;
import bC.C14001b;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"LbC/d;", "LbC/c;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lax/b;", "popularTimesIntegration", "LHB/b;", "storeDetailsRepo", "LbC/a;", "openingHoursMapper", "LQJ/M;", "defaultDispatcher", "<init>", "(Landroidx/lifecycle/U;Lax/b;LHB/b;LbC/a;LQJ/M;)V", "LXH/N;", "C", "()V", "m", "LHB/b;", "n", "LbC/a;", "o", "LQJ/M;", "LTJ/B;", "LbC/b;", "p", "LTJ/B;", "_state", "LTJ/P;", "q", "LTJ/P;", "getState", "()LTJ/P;", "state", "", "r", "Ljava/lang/String;", "storeId", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bC.d  reason: case insensitive filesystem */
public final class C14003d extends C14002c {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C12962b f118944m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C14000a f118945n;

    /* renamed from: o  reason: collision with root package name */
    private final M f118946o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C16505B<C14001b> f118947p;

    /* renamed from: q  reason: collision with root package name */
    private final C16519P<C14001b> f118948q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final String f118949r;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "enabled", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.storedetails.impl.openinghours.presentation.StoreDetailsAllOpeningHoursViewModelImpl$1", f = "StoreDetailsAllOpeningHoursViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: bC.d$a */
    static final class a extends l implements p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118950c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f118951d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14003d f118952e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14003d dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f118952e = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f118952e, eVar);
            aVar.f118951d = ((Boolean) obj).booleanValue();
            return aVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((a) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f118950c == 0) {
                y.b(obj);
                boolean z10 = this.f118951d;
                C16505B k10 = this.f118952e.f118947p;
                do {
                    value = k10.getValue();
                } while (!k10.e(value, C14001b.b((C14001b) value, z10, (C14001b.d) null, (C15987c) null, 6, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bC.d$b */
    public static final class b implements C16532g<v<? extends C14001b.d, ? extends List<? extends C14001b.a>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118953a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C14003d f118954b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bC.d$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118955a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C14003d f118956b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.storedetails.impl.openinghours.presentation.StoreDetailsAllOpeningHoursViewModelImpl$getOpeningHours$$inlined$map$1$2", f = "StoreDetailsAllOpeningHoursViewModel.kt", l = {50}, m = "emit")
            /* renamed from: bC.d$b$a$a  reason: collision with other inner class name */
            public static final class C2973a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118957c;

                /* renamed from: d  reason: collision with root package name */
                int f118958d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f118959e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2973a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118959e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118957c = obj;
                    this.f118958d |= Integer.MIN_VALUE;
                    return this.f118959e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C14003d dVar) {
                this.f118955a = hVar;
                this.f118956b = dVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r9, dI.C17164e r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof bC.C14003d.b.a.C2973a
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    bC.d$b$a$a r0 = (bC.C14003d.b.a.C2973a) r0
                    int r1 = r0.f118958d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118958d = r1
                    goto L_0x0018
                L_0x0013:
                    bC.d$b$a$a r0 = new bC.d$b$a$a
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.f118957c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118958d
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    XH.y.b(r10)
                    goto L_0x00a8
                L_0x002a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x0032:
                    XH.y.b(r10)
                    TJ.h r10 = r8.f118955a
                    XH.v r9 = (XH.v) r9
                    java.lang.Object r9 = r9.a()
                    java.util.List r9 = (java.util.List) r9
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                    java.util.Iterator r9 = r9.iterator()
                L_0x004f:
                    boolean r5 = r9.hasNext()
                    if (r5 == 0) goto L_0x006c
                    java.lang.Object r5 = r9.next()
                    r6 = r5
                    GB.c r6 = (GB.C12918c) r6
                    GB.c$c r6 = r6.e()
                    GB.c$c r7 = GB.C12918c.C2642c.STORE
                    if (r6 == r7) goto L_0x0068
                    r2.add(r5)
                    goto L_0x004f
                L_0x0068:
                    r4.add(r5)
                    goto L_0x004f
                L_0x006c:
                    XH.v r9 = new XH.v
                    r9.<init>(r2, r4)
                    java.lang.Object r2 = r9.a()
                    java.util.List r2 = (java.util.List) r2
                    java.lang.Object r9 = r9.b()
                    java.util.List r9 = (java.util.List) r9
                    java.lang.Object r9 = YH.C16877v.y0(r9)
                    GB.c r9 = (GB.C12918c) r9
                    if (r9 == 0) goto L_0x0090
                    bC.d r4 = r8.f118956b
                    bC.a r4 = r4.f118945n
                    bC.b$d r9 = r4.j(r9)
                    goto L_0x0091
                L_0x0090:
                    r9 = 0
                L_0x0091:
                    bC.d r4 = r8.f118956b
                    bC.a r4 = r4.f118945n
                    java.util.List r2 = r4.d(r2)
                    XH.v r9 = XH.C16796C.a(r9, r2)
                    r0.f118958d = r3
                    java.lang.Object r9 = r10.emit(r9, r0)
                    if (r9 != r1) goto L_0x00a8
                    return r1
                L_0x00a8:
                    XH.N r9 = XH.C16807N.f139792a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: bC.C14003d.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, C14003d dVar) {
            this.f118953a = gVar;
            this.f118954b = dVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118953a.collect(new a(hVar, this.f118954b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "", "LGB/c;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.storedetails.impl.openinghours.presentation.StoreDetailsAllOpeningHoursViewModelImpl$getOpeningHours$1", f = "StoreDetailsAllOpeningHoursViewModel.kt", l = {68, 68}, m = "invokeSuspend")
    /* renamed from: bC.d$c */
    static final class c extends l implements p<C16533h<? super List<? extends C12918c>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f118960c;

        /* renamed from: d  reason: collision with root package name */
        Object f118961d;

        /* renamed from: e  reason: collision with root package name */
        int f118962e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f118963f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C14003d f118964g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14003d dVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f118964g = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f118964g, eVar);
            cVar.f118963f = obj;
            return cVar;
        }

        public final Object invoke(C16533h<? super List<C12918c>> hVar, C17164e<? super C16807N> eVar) {
            return ((c) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f118962e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002e
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r0 = r5.f118960c
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r5.f118963f
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r6)
                goto L_0x0066
            L_0x001a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0022:
                java.lang.Object r1 = r5.f118960c
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r3 = r5.f118963f
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r6)
                goto L_0x0050
            L_0x002e:
                XH.y.b(r6)
                java.lang.Object r6 = r5.f118963f
                r1 = r6
                TJ.h r1 = (TJ.C16533h) r1
                bC.d r6 = r5.f118964g
                HB.b r6 = r6.f118944m
                bC.d r4 = r5.f118964g
                java.lang.String r4 = r4.f118949r
                r5.f118963f = r1
                r5.f118960c = r1
                r5.f118962e = r3
                java.lang.Object r6 = r6.a(r4, r5)
                if (r6 != r0) goto L_0x004f
                return r0
            L_0x004f:
                r3 = r1
            L_0x0050:
                r4 = r6
                GB.h r4 = (GB.h) r4
                java.util.List r4 = r4.a()
                r5.f118963f = r3
                r5.f118960c = r1
                r5.f118961d = r6
                r5.f118962e = r2
                java.lang.Object r6 = r1.emit(r4, r5)
                if (r6 != r0) goto L_0x0066
                return r0
            L_0x0066:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: bC.C14003d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LTJ/h;", "", "LGB/c;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.storedetails.impl.openinghours.presentation.StoreDetailsAllOpeningHoursViewModelImpl$getOpeningHours$2", f = "StoreDetailsAllOpeningHoursViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: bC.d$d  reason: collision with other inner class name */
    static final class C2974d extends l implements q<C16533h<? super List<? extends C12918c>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118965c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f118966d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f118967e;

        C2974d(C17164e<? super C2974d> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super List<C12918c>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            C2974d dVar = new C2974d(eVar);
            dVar.f118966d = hVar;
            dVar.f118967e = th2;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118965c == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f118966d;
                Throwable th2 = (Throwable) this.f118967e;
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
                        String a10 = C11818a.a("failed to get store opening hours which should be okhttp-cached", th2);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = hVar.getClass().getName();
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
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LXH/v;", "LbC/b$d;", "", "LbC/b$a;", "<destruct>", "LXH/N;", "<anonymous>", "(LXH/v;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.storedetails.impl.openinghours.presentation.StoreDetailsAllOpeningHoursViewModelImpl$getOpeningHours$4", f = "StoreDetailsAllOpeningHoursViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: bC.d$e */
    static final class e extends l implements p<v<? extends C14001b.d, ? extends List<? extends C14001b.a>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118968c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f118969d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14003d f118970e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C14003d dVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f118970e = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f118970e, eVar);
            eVar2.f118969d = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(v<C14001b.d, ? extends List<C14001b.a>> vVar, C17164e<? super C16807N> eVar) {
            return ((e) create(vVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f118968c == 0) {
                y.b(obj);
                v vVar = (v) this.f118969d;
                C14001b.d dVar = (C14001b.d) vVar.a();
                List list = (List) vVar.b();
                C16505B k10 = this.f118970e.f118947p;
                do {
                    value = k10.getValue();
                } while (!k10.e(value, C14001b.b((C14001b) value, false, dVar, C15985a.l(list), 1, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C14003d(U u10, C13990b bVar, C12962b bVar2, C14000a aVar, M m10) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(bVar, "popularTimesIntegration");
        C17542s.j(bVar2, "storeDetailsRepo");
        C17542s.j(aVar, "openingHoursMapper");
        C17542s.j(m10, "defaultDispatcher");
        this.f118944m = bVar2;
        this.f118945n = aVar;
        this.f118946o = m10;
        C16505B<C14001b> a10 = C16521S.a(new C14001b(false, (C14001b.d) null, (C15987c) null, 7, (DefaultConstructorMarker) null));
        this.f118947p = a10;
        this.f118948q = C16534i.c(a10);
        Object f10 = u10.f("storeId");
        if (f10 != null) {
            String str = (String) f10;
            this.f118949r = str;
            C();
            C16534i.M(C16534i.R(bVar.a(str), new a(this, (C17164e<? super a>) null)), g0.a(this));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void C() {
        C16532g g10 = C16534i.g(C16534i.H(new c(this, (C17164e<? super c>) null)), new C2974d((C17164e<? super C2974d>) null));
        C15906b.a aVar = C15906b.f135496b;
        C16534i.M(C16534i.R(C16534i.L(new b(i.b(g10, C15906b.K(C15908d.s(1, C15909e.MINUTES))), this), this.f118946o), new e(this, (C17164e<? super e>) null)), g0.a(this));
    }

    public C16519P<C14001b> getState() {
        return this.f118948q;
    }
}
