package Yv;

import IC.C13019a;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import aA.C13909a;
import am.h;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LYv/n;", "LYv/m;", "LaA/a;", "sessionManager", "Lam/h;", "timeProvider", "<init>", "(LaA/a;Lam/h;)V", "LTJ/g;", "", "c", "()LTJ/g;", "LIJ/b;", "refreshInterval", "LIC/a;", "a", "(J)LTJ/g;", "LaA/a;", "b", "Lam/h;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f41209a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final h f41210b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f41211a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yv.n$a$a  reason: collision with other inner class name */
        public static final class C0709a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f41212a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.usecase.GetGreetingFlowUseCaseImpl$areGreetingsEnabledFlow$$inlined$map$1$2", f = "GetGreetingFlowUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Yv.n$a$a$a  reason: collision with other inner class name */
            public static final class C0710a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f41213c;

                /* renamed from: d  reason: collision with root package name */
                int f41214d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0709a f41215e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0710a(C0709a aVar, C17164e eVar) {
                    super(eVar);
                    this.f41215e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f41213c = obj;
                    this.f41214d |= Integer.MIN_VALUE;
                    return this.f41215e.emit((Object) null, this);
                }
            }

            public C0709a(C16533h hVar) {
                this.f41212a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yv.n.a.C0709a.C0710a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yv.n$a$a$a r0 = (Yv.n.a.C0709a.C0710a) r0
                    int r1 = r0.f41214d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f41214d = r1
                    goto L_0x0018
                L_0x0013:
                    Yv.n$a$a$a r0 = new Yv.n$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f41213c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f41214d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f41212a
                    aA.b r5 = (aA.C13910b) r5
                    boolean r5 = r5.j()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f41214d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yv.n.a.C0709a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f41211a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f41211a.collect(new C0709a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "LIC/a;", "", "isEnabled", "LXH/N;", "<anonymous>", "(LTJ/h;Z)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetGreetingFlowUseCaseImpl$invoke$1", f = "GetGreetingFlowUseCase.kt", l = {35, 36, 39}, m = "invokeSuspend")
    static final class b extends l implements q<C16533h<? super C13019a>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f41216c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f41217d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f41218e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n f41219f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f41220g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar, long j10, C17164e<? super b> eVar) {
            super(3, eVar);
            this.f41219f = nVar;
            this.f41220g = j10;
        }

        public final Object i(C16533h<? super C13019a> hVar, boolean z10, C17164e<? super C16807N> eVar) {
            b bVar = new b(this.f41219f, this.f41220g, eVar);
            bVar.f41217d = hVar;
            bVar.f41218e = z10;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((C16533h) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f41216c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0036
                if (r1 == r4) goto L_0x002c
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r0 = r7.f41217d
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r8)
                goto L_0x0081
            L_0x0019:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0021:
                boolean r1 = r7.f41218e
                java.lang.Object r2 = r7.f41217d
                TJ.h r2 = (TJ.C16533h) r2
                XH.y.b(r8)
            L_0x002a:
                r8 = r2
                goto L_0x0041
            L_0x002c:
                boolean r1 = r7.f41218e
                java.lang.Object r2 = r7.f41217d
                TJ.h r2 = (TJ.C16533h) r2
                XH.y.b(r8)
                goto L_0x0063
            L_0x0036:
                XH.y.b(r8)
                java.lang.Object r8 = r7.f41217d
                TJ.h r8 = (TJ.C16533h) r8
                boolean r1 = r7.f41218e
                if (r1 == 0) goto L_0x0072
            L_0x0041:
                IC.d r2 = IC.C13022d.f110926a
                Yv.n r5 = r7.f41219f
                am.h r5 = r5.f41210b
                java.time.ZonedDateTime r5 = r5.a()
                int r5 = r5.getHour()
                IC.a r2 = r2.a(r5)
                r7.f41217d = r8
                r7.f41218e = r1
                r7.f41216c = r4
                java.lang.Object r2 = r8.emit(r2, r7)
                if (r2 != r0) goto L_0x0062
                return r0
            L_0x0062:
                r2 = r8
            L_0x0063:
                long r5 = r7.f41220g
                r7.f41217d = r2
                r7.f41218e = r1
                r7.f41216c = r3
                java.lang.Object r8 = QJ.C16297b0.c(r5, r7)
                if (r8 != r0) goto L_0x002a
                return r0
            L_0x0072:
                IC.a r3 = IC.C13019a.NotAvailable
                r7.f41217d = r8
                r7.f41218e = r1
                r7.f41216c = r2
                java.lang.Object r8 = r8.emit(r3, r7)
                if (r8 != r0) goto L_0x0081
                return r0
            L_0x0081:
                XH.N r8 = XH.C16807N.f139792a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Yv.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public n(C13909a aVar, h hVar) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(hVar, "timeProvider");
        this.f41209a = aVar;
        this.f41210b = hVar;
    }

    private final C16532g<Boolean> c() {
        return new a(this.f41209a.p());
    }

    public C16532g<C13019a> a(long j10) {
        return C16534i.s(C16534i.g0(c(), new b(this, j10, (C17164e<? super b>) null)));
    }
}
