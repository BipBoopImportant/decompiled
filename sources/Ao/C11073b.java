package ao;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import ao.C11072a;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import sv.C11892a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lao/b;", "Lao/a;", "Lsv/a;", "mCommerceConfigRepository", "<init>", "(Lsv/a;)V", "LTJ/g;", "Lao/a$a;", "invoke", "()LTJ/g;", "a", "Lsv/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ao.b  reason: case insensitive filesystem */
public final class C11073b implements C11072a {

    /* renamed from: a  reason: collision with root package name */
    private final C11892a f90345a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ao.b$a */
    public static final class a implements C16532g<C11072a.C1955a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f90346a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ao.b$a$a  reason: collision with other inner class name */
        public static final class C1956a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f90347a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.checkout.impl.confirmation.usecase.GetConfirmationConfigUseCaseImpl$invoke$$inlined$map$1$2", f = "GetConfirmationConfigUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ao.b$a$a$a  reason: collision with other inner class name */
            public static final class C1957a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f90348c;

                /* renamed from: d  reason: collision with root package name */
                int f90349d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1956a f90350e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1957a(C1956a aVar, C17164e eVar) {
                    super(eVar);
                    this.f90350e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f90348c = obj;
                    this.f90349d |= Integer.MIN_VALUE;
                    return this.f90350e.emit((Object) null, this);
                }
            }

            public C1956a(C16533h hVar) {
                this.f90347a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r11, dI.C17164e r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof ao.C11073b.a.C1956a.C1957a
                    if (r0 == 0) goto L_0x0013
                    r0 = r12
                    ao.b$a$a$a r0 = (ao.C11073b.a.C1956a.C1957a) r0
                    int r1 = r0.f90349d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f90349d = r1
                    goto L_0x0018
                L_0x0013:
                    ao.b$a$a$a r0 = new ao.b$a$a$a
                    r0.<init>(r10, r12)
                L_0x0018:
                    java.lang.Object r12 = r0.f90348c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f90349d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r12)
                    goto L_0x005f
                L_0x0029:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L_0x0031:
                    XH.y.b(r12)
                    TJ.h r12 = r10.f90347a
                    com.ingka.ikea.mcomsettings.MComConfig r11 = (com.ingka.ikea.mcomsettings.MComConfig) r11
                    if (r11 == 0) goto L_0x0055
                    ao.a$a r2 = new ao.a$a
                    boolean r5 = r11.r()
                    java.lang.String r6 = r11.f()
                    java.lang.String r7 = r11.e()
                    boolean r8 = r11.l()
                    com.ingka.ikea.mcomsettings.MComConfig$f r9 = r11.d()
                    r4 = r2
                    r4.<init>(r5, r6, r7, r8, r9)
                    goto L_0x0056
                L_0x0055:
                    r2 = 0
                L_0x0056:
                    r0.f90349d = r3
                    java.lang.Object r11 = r12.emit(r2, r0)
                    if (r11 != r1) goto L_0x005f
                    return r1
                L_0x005f:
                    XH.N r11 = XH.C16807N.f139792a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: ao.C11073b.a.C1956a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f90346a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f90346a.collect(new C1956a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C11073b(C11892a aVar) {
        C17542s.j(aVar, "mCommerceConfigRepository");
        this.f90345a = aVar;
    }

    public C16532g<C11072a.C1955a> invoke() {
        return new a(C11892a.C2450a.a(this.f90345a, false, 1, (Object) null));
    }
}
