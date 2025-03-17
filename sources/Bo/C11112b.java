package bo;

import IC.C13023e;
import KJ.C15987c;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import ao.C11072a;
import ao.C11074c;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\f\u0010\u0018¨\u0006\u001a"}, d2 = {"Lbo/b;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lao/c;", "getConfirmationDataUseCase", "Lao/a;", "getConfirmationConfigUseCase", "LIl/a;", "appConfigApi", "<init>", "(Landroidx/lifecycle/U;Lao/c;Lao/a;LIl/a;)V", "m", "Lao/c;", "n", "LIl/a;", "", "o", "Ljava/lang/String;", "checkoutId", "LTJ/P;", "Lbo/a;", "p", "LTJ/P;", "()LTJ/P;", "uiState", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bo.b  reason: case insensitive filesystem */
public final class C11112b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C11074c f90503m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Il.a f90504n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final String f90505o;

    /* renamed from: p  reason: collision with root package name */
    private final C16519P<C11111a> f90506p;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bo.b$a */
    public static final class a implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f90507a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bo.b$a$a  reason: collision with other inner class name */
        public static final class C1963a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f90508a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.checkout.impl.confirmation.viewmodel.ConfirmationOrderSummaryViewModel$special$$inlined$map$1$2", f = "ConfirmationOrderSummaryViewModel.kt", l = {50}, m = "emit")
            /* renamed from: bo.b$a$a$a  reason: collision with other inner class name */
            public static final class C1964a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f90509c;

                /* renamed from: d  reason: collision with root package name */
                int f90510d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1963a f90511e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1964a(C1963a aVar, C17164e eVar) {
                    super(eVar);
                    this.f90511e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f90509c = obj;
                    this.f90510d |= Integer.MIN_VALUE;
                    return this.f90511e.emit((Object) null, this);
                }
            }

            public C1963a(C16533h hVar) {
                this.f90508a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof bo.C11112b.a.C1963a.C1964a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    bo.b$a$a$a r0 = (bo.C11112b.a.C1963a.C1964a) r0
                    int r1 = r0.f90510d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f90510d = r1
                    goto L_0x0018
                L_0x0013:
                    bo.b$a$a$a r0 = new bo.b$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f90509c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f90510d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004d
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f90508a
                    ao.a$a r5 = (ao.C11072a.C1955a) r5
                    if (r5 == 0) goto L_0x003f
                    boolean r5 = r5.c()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f90510d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: bo.C11112b.a.C1963a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f90507a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f90507a.collect(new C1963a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bo.b$b  reason: collision with other inner class name */
    public static final class C1965b implements C16532g<C11111a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f90512a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11112b f90513b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bo.b$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f90514a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C11112b f90515b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.checkout.impl.confirmation.viewmodel.ConfirmationOrderSummaryViewModel$special$$inlined$map$2$2", f = "ConfirmationOrderSummaryViewModel.kt", l = {50}, m = "emit")
            /* renamed from: bo.b$b$a$a  reason: collision with other inner class name */
            public static final class C1966a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f90516c;

                /* renamed from: d  reason: collision with root package name */
                int f90517d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f90518e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1966a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f90518e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f90516c = obj;
                    this.f90517d |= Integer.MIN_VALUE;
                    return this.f90518e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C11112b bVar) {
                this.f90514a = hVar;
                this.f90515b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r20, dI.C17164e r21) {
                /*
                    r19 = this;
                    r0 = r19
                    r1 = r21
                    boolean r2 = r1 instanceof bo.C11112b.C1965b.a.C1966a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    bo.b$b$a$a r2 = (bo.C11112b.C1965b.a.C1966a) r2
                    int r3 = r2.f90517d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f90517d = r3
                    goto L_0x001c
                L_0x0017:
                    bo.b$b$a$a r2 = new bo.b$b$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f90516c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f90517d
                    r5 = 1
                    if (r4 == 0) goto L_0x0036
                    if (r4 != r5) goto L_0x002e
                    XH.y.b(r1)
                    goto L_0x0170
                L_0x002e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0036:
                    XH.y.b(r1)
                    TJ.h r1 = r0.f90514a
                    r4 = r20
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    bo.b r6 = r0.f90515b
                    ao.c r6 = r6.f90503m
                    bo.b r7 = r0.f90515b
                    java.lang.String r7 = r7.f90505o
                    bo.f$a r6 = r6.a(r7)
                    r7 = 0
                    if (r6 == 0) goto L_0x008b
                    java.util.List r6 = r6.a()
                    if (r6 == 0) goto L_0x008b
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r9 = 10
                    int r9 = YH.C16877v.y(r6, r9)
                    r8.<init>(r9)
                    java.util.Iterator r6 = r6.iterator()
                L_0x006d:
                    boolean r9 = r6.hasNext()
                    if (r9 == 0) goto L_0x008c
                    java.lang.Object r9 = r6.next()
                    no.a r9 = (no.C11663a) r9
                    bo.b r10 = r0.f90515b
                    Il.a r10 = r10.f90504n
                    kp.d r10 = r10.s()
                    Op.a1 r9 = r9.a(r4, r10)
                    r8.add(r9)
                    goto L_0x006d
                L_0x008b:
                    r8 = r7
                L_0x008c:
                    if (r8 != 0) goto L_0x0092
                    java.util.List r8 = YH.C16877v.n()
                L_0x0092:
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    KJ.c r4 = KJ.C15985a.h(r8)
                    boolean r6 = r4.isEmpty()
                    r8 = 2
                    if (r6 == 0) goto L_0x0161
                    bo.b r4 = r0.f90515b
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r9 = "No items to show in order confirmation"
                    r6.<init>(r9)
                    qv.e r15 = qv.e.ERROR
                    qv.d r9 = qv.d.f102012a
                    java.util.List r9 = r9.a()
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.ArrayList r10 = new java.util.ArrayList
                    r10.<init>()
                    java.util.Iterator r9 = r9.iterator()
                L_0x00bb:
                    boolean r11 = r9.hasNext()
                    if (r11 == 0) goto L_0x00d3
                    java.lang.Object r11 = r9.next()
                    r12 = r11
                    qv.b r12 = (qv.C11819b) r12
                    r13 = 0
                    boolean r12 = r12.b(r15, r13)
                    if (r12 == 0) goto L_0x00bb
                    r10.add(r11)
                    goto L_0x00bb
                L_0x00d3:
                    java.util.Iterator r16 = r10.iterator()
                    r9 = r7
                    r10 = r9
                L_0x00d9:
                    boolean r11 = r16.hasNext()
                    if (r11 == 0) goto L_0x0155
                    java.lang.Object r11 = r16.next()
                    qv.b r11 = (qv.C11819b) r11
                    if (r9 != 0) goto L_0x00f2
                    java.lang.String r9 = qv.C11818a.a(r7, r6)
                    if (r9 != 0) goto L_0x00ee
                    goto L_0x0155
                L_0x00ee:
                    java.lang.String r9 = qv.C11820c.a(r9)
                L_0x00f2:
                    r17 = r9
                    if (r10 != 0) goto L_0x0143
                    java.lang.Class r9 = r4.getClass()
                    java.lang.String r9 = r9.getName()
                    kotlin.jvm.internal.C17542s.g(r9)
                    r10 = 36
                    java.lang.String r10 = HJ.C15854t.s1(r9, r10, r7, r8, r7)
                    r12 = 46
                    java.lang.String r10 = HJ.C15854t.o1(r10, r12, r7, r8, r7)
                    int r12 = r10.length()
                    if (r12 != 0) goto L_0x0114
                    goto L_0x011a
                L_0x0114:
                    java.lang.String r9 = "Kt"
                    java.lang.String r9 = HJ.C15854t.P0(r10, r9)
                L_0x011a:
                    java.lang.Thread r10 = java.lang.Thread.currentThread()
                    java.lang.String r10 = r10.getName()
                    java.lang.String r12 = "main"
                    boolean r10 = HJ.C15854t.b0(r10, r12, r5)
                    if (r10 == 0) goto L_0x012d
                    java.lang.String r10 = "m"
                    goto L_0x012f
                L_0x012d:
                    java.lang.String r10 = "b"
                L_0x012f:
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    r12.append(r10)
                    java.lang.String r10 = "|"
                    r12.append(r10)
                    r12.append(r9)
                    java.lang.String r10 = r12.toString()
                L_0x0143:
                    r18 = r10
                    r12 = 0
                    r9 = r11
                    r10 = r15
                    r11 = r18
                    r13 = r6
                    r14 = r17
                    r9.a(r10, r11, r12, r13, r14)
                    r9 = r17
                    r10 = r18
                    goto L_0x00d9
                L_0x0155:
                    bo.a r4 = new bo.a
                    int r6 = Oo.b.f84812v3
                    IC.e r6 = IC.C13026h.a(r6)
                    r4.<init>(r7, r6, r5, r7)
                    goto L_0x0167
                L_0x0161:
                    bo.a r6 = new bo.a
                    r6.<init>(r4, r7, r8, r7)
                    r4 = r6
                L_0x0167:
                    r2.f90517d = r5
                    java.lang.Object r1 = r1.emit(r4, r2)
                    if (r1 != r3) goto L_0x0170
                    return r3
                L_0x0170:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: bo.C11112b.C1965b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1965b(C16532g gVar, C11112b bVar) {
            this.f90512a = gVar;
            this.f90513b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f90512a.collect(new a(hVar, this.f90513b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C11112b(U u10, C11074c cVar, C11072a aVar, Il.a aVar2) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(cVar, "getConfirmationDataUseCase");
        C17542s.j(aVar, "getConfirmationConfigUseCase");
        C17542s.j(aVar2, "appConfigApi");
        this.f90503m = cVar;
        this.f90504n = aVar2;
        Object f10 = u10.f("CHECKOUT_ID");
        if (f10 != null) {
            this.f90505o = (String) f10;
            this.f90506p = C16534i.c0(new C1965b(new a(aVar.invoke()), this), g0.a(this), ip.f.a(), new C11111a((C15987c) null, (C13023e) null, 3, (DefaultConstructorMarker) null));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final C16519P<C11111a> m() {
        return this.f90506p;
    }
}
