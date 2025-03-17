package Yv;

import Qr.c;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import Yv.E;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import yv.C8996a;
import yv.C8998c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LYv/r;", "LYv/q;", "Lyv/a;", "membershipFeatures", "LQr/c;", "kreativCardUseCase", "<init>", "(Lyv/a;LQr/c;)V", "LTJ/g;", "LYv/E;", "invoke", "()LTJ/g;", "a", "Lyv/a;", "b", "LQr/c;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    private final C8996a f41241a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c f41242b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetKreativListsStateUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetKreativListsStateUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends l implements q<C16533h<? super E>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f41243c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f41244d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f41245e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r f41246f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, r rVar) {
            super(3, eVar);
            this.f41246f = rVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super E> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f41246f);
            aVar.f41244d = hVar;
            aVar.f41245e = bool;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f41243c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f41244d;
                C16532g H10 = ((Boolean) this.f41245e).booleanValue() ? C16534i.H(new b(this.f41246f, (C17164e<? super b>) null)) : C16534i.J(E.a.f41088a);
                this.f41243c = 1;
                if (C16534i.x(hVar, H10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LYv/E;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetKreativListsStateUseCaseImpl$invoke$1$1", f = "GetKreativListsStateUseCase.kt", l = {43, 44}, m = "invokeSuspend")
    static final class b extends l implements p<C16533h<? super E>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f41247c;

        /* renamed from: d  reason: collision with root package name */
        Object f41248d;

        /* renamed from: e  reason: collision with root package name */
        int f41249e;

        /* renamed from: f  reason: collision with root package name */
        int f41250f;

        /* renamed from: g  reason: collision with root package name */
        int f41251g;

        /* renamed from: h  reason: collision with root package name */
        int f41252h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f41253i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ r f41254j;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements C16532g<E.b> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f41255a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Yv.r$b$a$a  reason: collision with other inner class name */
            public static final class C0714a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f41256a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "com.ingka.ikea.membership.impl.usecase.GetKreativListsStateUseCaseImpl$invoke$1$1$invokeSuspend$$inlined$map$1$2", f = "GetKreativListsStateUseCase.kt", l = {50}, m = "emit")
                /* renamed from: Yv.r$b$a$a$a  reason: collision with other inner class name */
                public static final class C0715a extends d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f41257c;

                    /* renamed from: d  reason: collision with root package name */
                    int f41258d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C0714a f41259e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0715a(C0714a aVar, C17164e eVar) {
                        super(eVar);
                        this.f41259e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f41257c = obj;
                        this.f41258d |= Integer.MIN_VALUE;
                        return this.f41259e.emit((Object) null, this);
                    }
                }

                public C0714a(C16533h hVar) {
                    this.f41256a = hVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof Yv.r.b.a.C0714a.C0715a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        Yv.r$b$a$a$a r0 = (Yv.r.b.a.C0714a.C0715a) r0
                        int r1 = r0.f41258d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f41258d = r1
                        goto L_0x0018
                    L_0x0013:
                        Yv.r$b$a$a$a r0 = new Yv.r$b$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f41257c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f41258d
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
                        TJ.h r6 = r4.f41256a
                        Dr.d$b r5 = (Dr.d.b) r5
                        Yv.E$b r2 = new Yv.E$b
                        r2.<init>(r5)
                        r0.f41258d = r3
                        java.lang.Object r5 = r6.emit(r2, r0)
                        if (r5 != r1) goto L_0x0046
                        return r1
                    L_0x0046:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Yv.r.b.a.C0714a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public a(C16532g gVar) {
                this.f41255a = gVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f41255a.collect(new C0714a(hVar), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f41254j = rVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f41254j, eVar);
            bVar.f41253i = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super E> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f41252h
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002e
                if (r1 == r3) goto L_0x0026
                if (r1 != r2) goto L_0x001e
                java.lang.Object r0 = r4.f41248d
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r4.f41247c
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r4.f41253i
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r5)
                goto L_0x0068
            L_0x001e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0026:
                java.lang.Object r1 = r4.f41253i
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r5)
                goto L_0x0043
            L_0x002e:
                XH.y.b(r5)
                java.lang.Object r5 = r4.f41253i
                r1 = r5
                TJ.h r1 = (TJ.C16533h) r1
                Yv.E$c r5 = Yv.E.c.f41090a
                r4.f41253i = r1
                r4.f41252h = r3
                java.lang.Object r5 = r1.emit(r5, r4)
                if (r5 != r0) goto L_0x0043
                return r0
            L_0x0043:
                Yv.r r5 = r4.f41254j
                Qr.c r5 = r5.f41242b
                TJ.g r5 = r5.a()
                Yv.r$b$a r3 = new Yv.r$b$a
                r3.<init>(r5)
                r4.f41253i = r1
                r4.f41247c = r5
                r4.f41248d = r5
                r5 = 0
                r4.f41249e = r5
                r4.f41250f = r5
                r4.f41251g = r5
                r4.f41252h = r2
                java.lang.Object r5 = TJ.C16534i.x(r1, r3, r4)
                if (r5 != r0) goto L_0x0068
                return r0
            L_0x0068:
                XH.N r5 = XH.C16807N.f139792a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Yv.r.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public r(C8996a aVar, c cVar) {
        C17542s.j(aVar, "membershipFeatures");
        C17542s.j(cVar, "kreativCardUseCase");
        this.f41241a = aVar;
        this.f41242b = cVar;
    }

    public C16532g<E> invoke() {
        return C16534i.s(C16534i.g0(C8998c.d(this.f41241a), new a((C17164e) null, this)));
    }
}
