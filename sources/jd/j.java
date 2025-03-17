package JD;

import GD.C12929b;
import GD.C12933f;
import GD.k;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import aA.C13910b;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kD.h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import lD.C14761c;
import nI.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LJD/j;", "LJD/i;", "LaA/a;", "sessionManager", "LlD/c;", "getProfileFlowUseCase", "<init>", "(LaA/a;LlD/c;)V", "LTJ/g;", "LGD/f;", "e", "()LTJ/g;", "d", "LkD/h;", "LKJ/c;", "LGD/k;", "f", "(LkD/h;)LKJ/c;", "invoke", "a", "LaA/a;", "b", "LlD/c;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements C13077i {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f111262a;

    /* renamed from: b  reason: collision with root package name */
    private final C14761c f111263b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f111264a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                aA.b[] r0 = aA.C13910b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                aA.b r1 = aA.C13910b.GUEST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                aA.b r1 = aA.C13910b.REGULAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                aA.b r1 = aA.C13910b.FAMILY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f111264a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: JD.j.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<C12933f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f111265a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f111266b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f111267a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j f111268b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.wallet.impl.usecase.GetProfileCardsUseCaseImpl$createFamilyCardFlow$$inlined$map$1$2", f = "GetProfileCardsUseCase.kt", l = {50}, m = "emit")
            /* renamed from: JD.j$b$a$a  reason: collision with other inner class name */
            public static final class C2699a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f111269c;

                /* renamed from: d  reason: collision with root package name */
                int f111270d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f111271e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2699a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f111271e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f111269c = obj;
                    this.f111270d |= Integer.MIN_VALUE;
                    return this.f111271e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, j jVar) {
                this.f111267a = hVar;
                this.f111268b = jVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof JD.j.b.a.C2699a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    JD.j$b$a$a r0 = (JD.j.b.a.C2699a) r0
                    int r1 = r0.f111270d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f111270d = r1
                    goto L_0x0018
                L_0x0013:
                    JD.j$b$a$a r0 = new JD.j$b$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f111269c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f111270d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x007e
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f111267a
                    kD.j r6 = (kD.j) r6
                    boolean r2 = r6 instanceof kD.j.b
                    if (r2 == 0) goto L_0x0048
                    GD.f$d r6 = new GD.f$d
                    GD.k$a$b r2 = GD.k.a.b.f110405b
                    java.util.List r2 = YH.C16877v.e(r2)
                    r6.<init>(r2)
                    goto L_0x0075
                L_0x0048:
                    boolean r2 = r6 instanceof kD.j.a
                    if (r2 != 0) goto L_0x006e
                    boolean r2 = r6 instanceof kD.j.c
                    if (r2 == 0) goto L_0x0051
                    goto L_0x006e
                L_0x0051:
                    boolean r2 = r6 instanceof kD.j.d
                    if (r2 == 0) goto L_0x0068
                    GD.f$c r2 = new GD.f$c
                    JD.j r4 = r5.f111268b
                    kD.j$d r6 = (kD.j.d) r6
                    kD.h r6 = r6.a()
                    KJ.c r6 = r4.f(r6)
                    r2.<init>(r6)
                    r6 = r2
                    goto L_0x0075
                L_0x0068:
                    XH.t r6 = new XH.t
                    r6.<init>()
                    throw r6
                L_0x006e:
                    GD.f$b r6 = new GD.f$b
                    r2 = 3
                    r4 = 0
                    r6.<init>(r4, r4, r2, r4)
                L_0x0075:
                    r0.f111270d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x007e
                    return r1
                L_0x007e:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: JD.j.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, j jVar) {
            this.f111265a = gVar;
            this.f111266b = jVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f111265a.collect(new a(hVar, this.f111266b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.wallet.impl.usecase.GetProfileCardsUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetProfileCardsUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class c extends l implements q<C16533h<? super C12933f>, C13910b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111272c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f111273d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f111274e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f111275f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17164e eVar, j jVar) {
            super(3, eVar);
            this.f111275f = jVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C12933f> hVar, C13910b bVar, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar, this.f111275f);
            cVar.f111273d = hVar;
            cVar.f111274e = bVar;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16532g gVar;
            Object f10 = C17187b.f();
            int i10 = this.f111272c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f111273d;
                int i11 = a.f111264a[((C13910b) this.f111274e).ordinal()];
                if (i11 == 1) {
                    gVar = C16534i.y();
                } else if (i11 == 2) {
                    gVar = this.f111275f.e();
                } else if (i11 == 3) {
                    gVar = this.f111275f.d();
                } else {
                    throw new t();
                }
                this.f111272c = 1;
                if (C16534i.x(hVar, gVar, this) == f10) {
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

    public j(C13909a aVar, C14761c cVar) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(cVar, "getProfileFlowUseCase");
        this.f111262a = aVar;
        this.f111263b = cVar;
    }

    /* access modifiers changed from: private */
    public final C16532g<C12933f> d() {
        return new b(this.f111263b.invoke(), this);
    }

    /* access modifiers changed from: private */
    public final C16532g<C12933f> e() {
        return C16534i.J(new C12933f.c(C16877v.e(k.d.f110442a)));
    }

    /* access modifiers changed from: private */
    public final C15987c<k> f(h hVar) {
        Iterable<kD.f> k12 = C16877v.k1(hVar.g(), 1);
        ArrayList arrayList = new ArrayList(C16877v.y(k12, 10));
        for (kD.f fVar : k12) {
            C13023e a10 = C13026h.a(Oo.b.f84461O3);
            String d10 = hVar.d();
            String f10 = hVar.f();
            arrayList.add(new k.a.C2649a(new C12929b(a10, C13026h.c(d10 + " " + f10), C13026h.c(fVar.a())), fVar.a()));
        }
        return C15985a.l(arrayList);
    }

    public C16532g<C12933f> invoke() {
        return C16534i.g0(this.f111262a.p(), new c((C17164e) null, this));
    }
}
