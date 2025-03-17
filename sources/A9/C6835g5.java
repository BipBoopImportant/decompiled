package a9;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.g5  reason: case insensitive filesystem */
public final class C6835g5 implements I1<C6970x5> {

    /* renamed from: a  reason: collision with root package name */
    public final a f42580a;

    /* renamed from: a9.g5$a */
    public static final class a implements C16532g<C6970x5> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C16532g f42581a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ C6835g5 f42582b;

        /* renamed from: a9.g5$a$a  reason: collision with other inner class name */
        public static final class C0745a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ C16533h f42583a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C6835g5 f42584b;

            @f(c = "com.contentsquare.android.internal.core.telemetry.performance.NetworkCollector$special$$inlined$map$1$2", f = "NetworkCollector.kt", l = {223}, m = "emit")
            /* renamed from: a9.g5$a$a$a  reason: collision with other inner class name */
            public static final class C0746a extends d {

                /* renamed from: c  reason: collision with root package name */
                public /* synthetic */ Object f42585c;

                /* renamed from: d  reason: collision with root package name */
                public int f42586d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ C0745a f42587e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0746a(C0745a aVar, C17164e eVar) {
                    super(eVar);
                    this.f42587e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f42585c = obj;
                    this.f42586d |= Integer.MIN_VALUE;
                    return this.f42587e.emit((Object) null, this);
                }
            }

            public C0745a(C16533h hVar, C6835g5 g5Var) {
                this.f42583a = hVar;
                this.f42584b = g5Var;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r12, dI.C17164e r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof a9.C6835g5.a.C0745a.C0746a
                    if (r0 == 0) goto L_0x0013
                    r0 = r13
                    a9.g5$a$a$a r0 = (a9.C6835g5.a.C0745a.C0746a) r0
                    int r1 = r0.f42586d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f42586d = r1
                    goto L_0x0018
                L_0x0013:
                    a9.g5$a$a$a r0 = new a9.g5$a$a$a
                    r0.<init>(r11, r13)
                L_0x0018:
                    java.lang.Object r13 = r0.f42585c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f42586d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r13)
                    goto L_0x0062
                L_0x0029:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L_0x0031:
                    XH.y.b(r13)
                    TJ.h r13 = r11.f42583a
                    C8.d r12 = (C8.d) r12
                    a9.g5 r2 = r11.f42584b
                    r2.getClass()
                    a9.x5 r2 = new a9.x5
                    java.lang.String r5 = r12.c()
                    long r6 = r12.b()
                    long r8 = r12.a()
                    java.lang.Throwable r12 = r12.d()
                    if (r12 == 0) goto L_0x0053
                    r10 = r3
                    goto L_0x0055
                L_0x0053:
                    r12 = 0
                    r10 = r12
                L_0x0055:
                    r4 = r2
                    r4.<init>(r5, r6, r8, r10)
                    r0.f42586d = r3
                    java.lang.Object r12 = r13.emit(r2, r0)
                    if (r12 != r1) goto L_0x0062
                    return r1
                L_0x0062:
                    XH.N r12 = XH.C16807N.f139792a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: a9.C6835g5.a.C0745a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, C6835g5 g5Var) {
            this.f42581a = gVar;
            this.f42582b = g5Var;
        }

        public final Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f42581a.collect(new C0745a(hVar, this.f42582b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C6835g5(C16532g<C8.d> gVar) {
        C17542s.j(gVar, "networkFlow");
        this.f42580a = new a(gVar, this);
    }

    public final C16532g<C6970x5> a() {
        return this.f42580a;
    }

    public final String getName() {
        return "network";
    }
}
