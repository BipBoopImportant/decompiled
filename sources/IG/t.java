package ig;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import ig.s;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import sv.C11892a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lig/t;", "Lig/s;", "Lsv/a;", "mCommerceConfigRepository", "<init>", "(Lsv/a;)V", "LTJ/g;", "Lig/s$a;", "invoke", "()LTJ/g;", "a", "Lsv/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements s {

    /* renamed from: a  reason: collision with root package name */
    private final C11892a f74613a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<s.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74614a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ig.t$a$a  reason: collision with other inner class name */
        public static final class C1344a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74615a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetMComConfigUseCaseImpl$invoke$$inlined$map$1$2", f = "GetMComConfigUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.t$a$a$a  reason: collision with other inner class name */
            public static final class C1345a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74616c;

                /* renamed from: d  reason: collision with root package name */
                int f74617d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1344a f74618e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1345a(C1344a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74618e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74616c = obj;
                    this.f74617d |= Integer.MIN_VALUE;
                    return this.f74618e.emit((Object) null, this);
                }
            }

            public C1344a(C16533h hVar) {
                this.f74615a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r12, dI.C17164e r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof ig.t.a.C1344a.C1345a
                    if (r0 == 0) goto L_0x0013
                    r0 = r13
                    ig.t$a$a$a r0 = (ig.t.a.C1344a.C1345a) r0
                    int r1 = r0.f74617d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74617d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.t$a$a$a r0 = new ig.t$a$a$a
                    r0.<init>(r11, r13)
                L_0x0018:
                    java.lang.Object r13 = r0.f74616c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74617d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r13)
                    goto L_0x0063
                L_0x0029:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L_0x0031:
                    XH.y.b(r13)
                    TJ.h r13 = r11.f74615a
                    com.ingka.ikea.mcomsettings.MComConfig r12 = (com.ingka.ikea.mcomsettings.MComConfig) r12
                    if (r12 == 0) goto L_0x0059
                    ig.s$a r2 = new ig.s$a
                    boolean r5 = r12.h()
                    boolean r6 = r12.n()
                    com.ingka.ikea.mcomsettings.MComConfig$f r7 = r12.a()
                    boolean r8 = r12.r()
                    com.ingka.ikea.mcomsettings.MComConfig$e r9 = r12.i()
                    java.util.List r10 = r12.b()
                    r4 = r2
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    goto L_0x005a
                L_0x0059:
                    r2 = 0
                L_0x005a:
                    r0.f74617d = r3
                    java.lang.Object r12 = r13.emit(r2, r0)
                    if (r12 != r1) goto L_0x0063
                    return r1
                L_0x0063:
                    XH.N r12 = XH.C16807N.f139792a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.t.a.C1344a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f74614a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74614a.collect(new C1344a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public t(C11892a aVar) {
        C17542s.j(aVar, "mCommerceConfigRepository");
        this.f74613a = aVar;
    }

    public C16532g<s.a> invoke() {
        return new a(this.f74613a.a(true));
    }
}
