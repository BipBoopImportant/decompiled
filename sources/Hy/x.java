package Hy;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"LHy/x;", "", "LRy/a;", "iScanAndGoSettingsRepo", "<init>", "(LRy/a;)V", "LTJ/g;", "LHy/w;", "a", "()LTJ/g;", "LRy/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final Ry.a f110894a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f110895a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hy.x$a$a  reason: collision with other inner class name */
        public static final class C2674a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f110896a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.FullServeModeUseCase$invoke$$inlined$map$1$2", f = "FullServeModeUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Hy.x$a$a$a  reason: collision with other inner class name */
            public static final class C2675a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f110897c;

                /* renamed from: d  reason: collision with root package name */
                int f110898d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2674a f110899e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2675a(C2674a aVar, C17164e eVar) {
                    super(eVar);
                    this.f110899e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f110897c = obj;
                    this.f110898d |= Integer.MIN_VALUE;
                    return this.f110899e.emit((Object) null, this);
                }
            }

            public C2674a(C16533h hVar) {
                this.f110896a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Hy.x.a.C2674a.C2675a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Hy.x$a$a$a r0 = (Hy.x.a.C2674a.C2675a) r0
                    int r1 = r0.f110898d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f110898d = r1
                    goto L_0x0018
                L_0x0013:
                    Hy.x$a$a$a r0 = new Hy.x$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f110897c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f110898d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f110896a
                    com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r5 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r5
                    if (r5 != 0) goto L_0x003d
                    Hy.w$b r5 = Hy.w.b.f110892a
                    goto L_0x004e
                L_0x003d:
                    boolean r2 = r5.i()
                    if (r2 == 0) goto L_0x004c
                    boolean r5 = r5.j()
                    if (r5 == 0) goto L_0x004c
                    Hy.w$c r5 = Hy.w.c.f110893a
                    goto L_0x004e
                L_0x004c:
                    Hy.w$a r5 = Hy.w.a.f110891a
                L_0x004e:
                    r0.f110898d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Hy.x.a.C2674a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f110895a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f110895a.collect(new C2674a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public x(Ry.a aVar) {
        C17542s.j(aVar, "iScanAndGoSettingsRepo");
        this.f110894a = aVar;
    }

    public final C16532g<w> a() {
        return new a(this.f110894a.b());
    }
}
