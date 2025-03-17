package Rw;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import sv.C11892a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LRw/f;", "LRw/e;", "Lsv/a;", "mCommerceConfigRepository", "<init>", "(Lsv/a;)V", "LTJ/g;", "LRw/k;", "invoke", "()LTJ/g;", "a", "Lsv/a;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Rw.f  reason: case insensitive filesystem */
public final class C13558f implements C13557e {

    /* renamed from: a  reason: collision with root package name */
    private final C11892a f115605a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rw.f$a */
    public static final class a implements C16532g<k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f115606a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rw.f$a$a  reason: collision with other inner class name */
        public static final class C2840a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f115607a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.usecase.GetPaymentConfigUseCaseImpl$invoke$$inlined$map$1$2", f = "GetPaymentConfigUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Rw.f$a$a$a  reason: collision with other inner class name */
            public static final class C2841a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f115608c;

                /* renamed from: d  reason: collision with root package name */
                int f115609d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2840a f115610e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2841a(C2840a aVar, C17164e eVar) {
                    super(eVar);
                    this.f115610e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f115608c = obj;
                    this.f115609d |= Integer.MIN_VALUE;
                    return this.f115610e.emit((Object) null, this);
                }
            }

            public C2840a(C16533h hVar) {
                this.f115607a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Rw.C13558f.a.C2840a.C2841a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    Rw.f$a$a$a r0 = (Rw.C13558f.a.C2840a.C2841a) r0
                    int r1 = r0.f115609d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f115609d = r1
                    goto L_0x0018
                L_0x0013:
                    Rw.f$a$a$a r0 = new Rw.f$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f115608c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f115609d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x005b
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f115607a
                    com.ingka.ikea.mcomsettings.MComConfig r7 = (com.ingka.ikea.mcomsettings.MComConfig) r7
                    if (r7 == 0) goto L_0x004c
                    Rw.k r2 = new Rw.k
                    boolean r4 = r7.q()
                    com.ingka.ikea.mcomsettings.MComConfig$b r5 = r7.c()
                    java.util.List r7 = r7.k()
                    r2.<init>(r4, r5, r7)
                    goto L_0x0052
                L_0x004c:
                    Rw.k$a r7 = Rw.k.f115628d
                    Rw.k r2 = r7.a()
                L_0x0052:
                    r0.f115609d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x005b
                    return r1
                L_0x005b:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Rw.C13558f.a.C2840a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f115606a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f115606a.collect(new C2840a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C13558f(C11892a aVar) {
        C17542s.j(aVar, "mCommerceConfigRepository");
        this.f115605a = aVar;
    }

    public C16532g<k> invoke() {
        return new a(C11892a.C2450a.a(this.f115605a, false, 1, (Object) null));
    }
}
