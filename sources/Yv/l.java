package Yv;

import Iq.d;
import Iq.g;
import Jq.c;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import Yv.k;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.q;
import yv.C8996a;
import yv.C8998c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LYv/l;", "LYv/k;", "Lyv/a;", "membershipFeatures", "LJq/c;", "familyRewardsRepository", "LIq/d;", "familyRewardCarouselDataMapper", "<init>", "(Lyv/a;LJq/c;LIq/d;)V", "LTJ/g;", "LYv/k$a;", "invoke", "()LTJ/g;", "a", "Lyv/a;", "b", "LJq/c;", "c", "LIq/d;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final C8996a f41190a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Jq.c f41191b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final d f41192c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetFamilyRewardsCarouselStateUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetFamilyRewardsCarouselStateUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super k.a>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f41193c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f41194d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f41195e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l f41196f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, l lVar) {
            super(3, eVar);
            this.f41196f = lVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super k.a> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f41196f);
            aVar.f41194d = hVar;
            aVar.f41195e = bool;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f41193c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f41194d;
                C16532g cVar = ((Boolean) this.f41195e).booleanValue() ? new c(new b(this.f41196f.f41191b.f((c.a) null), this.f41196f.f41192c)) : C16534i.J(k.a.C0706a.f41188a);
                this.f41193c = 1;
                if (C16534i.x(hVar, cVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f41197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f41198b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f41199a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f41200b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.usecase.GetFamilyRewardsCarouselStateUseCaseImpl$invoke$lambda$1$$inlined$map$1$2", f = "GetFamilyRewardsCarouselStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Yv.l$b$a$a  reason: collision with other inner class name */
            public static final class C0707a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f41201c;

                /* renamed from: d  reason: collision with root package name */
                int f41202d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f41203e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0707a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f41203e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f41201c = obj;
                    this.f41202d |= Integer.MIN_VALUE;
                    return this.f41203e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, d dVar) {
                this.f41199a = hVar;
                this.f41200b = dVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yv.l.b.a.C0707a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yv.l$b$a$a r0 = (Yv.l.b.a.C0707a) r0
                    int r1 = r0.f41202d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f41202d = r1
                    goto L_0x0018
                L_0x0013:
                    Yv.l$b$a$a r0 = new Yv.l$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f41201c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f41202d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f41199a
                    Jq.d r5 = (Jq.d) r5
                    Iq.d r2 = r4.f41200b
                    Iq.g r5 = r2.a(r5)
                    r0.f41202d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yv.l.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, d dVar) {
            this.f41197a = gVar;
            this.f41198b = dVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f41197a.collect(new a(hVar, this.f41198b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<k.a.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f41204a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f41205a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.usecase.GetFamilyRewardsCarouselStateUseCaseImpl$invoke$lambda$1$$inlined$map$2$2", f = "GetFamilyRewardsCarouselStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Yv.l$c$a$a  reason: collision with other inner class name */
            public static final class C0708a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f41206c;

                /* renamed from: d  reason: collision with root package name */
                int f41207d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f41208e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0708a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f41208e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f41206c = obj;
                    this.f41207d |= Integer.MIN_VALUE;
                    return this.f41208e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f41205a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yv.l.c.a.C0708a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yv.l$c$a$a r0 = (Yv.l.c.a.C0708a) r0
                    int r1 = r0.f41207d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f41207d = r1
                    goto L_0x0018
                L_0x0013:
                    Yv.l$c$a$a r0 = new Yv.l$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f41206c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f41207d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0046
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f41205a
                    Iq.g r5 = (Iq.g) r5
                    Yv.k$a$b r2 = new Yv.k$a$b
                    r2.<init>(r5)
                    r0.f41207d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x0046
                    return r1
                L_0x0046:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yv.l.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f41204a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f41204a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public l(C8996a aVar, Jq.c cVar, d dVar) {
        C17542s.j(aVar, "membershipFeatures");
        C17542s.j(cVar, "familyRewardsRepository");
        C17542s.j(dVar, "familyRewardCarouselDataMapper");
        this.f41190a = aVar;
        this.f41191b = cVar;
        this.f41192c = dVar;
    }

    public C16532g<k.a> invoke() {
        return C16534i.g0(C8998c.c(this.f41190a), new a((C17164e) null, this));
    }
}
