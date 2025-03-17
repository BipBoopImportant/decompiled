package Tf;

import Ln.h;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LTf/z;", "LTf/y;", "LLn/h;", "cartRepository", "<init>", "(LLn/h;)V", "LTJ/g;", "", "invoke", "()LTJ/g;", "a", "LLn/h;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z implements y {

    /* renamed from: a  reason: collision with root package name */
    private final h f63985a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f63986a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tf.z$a$a  reason: collision with other inner class name */
        public static final class C1116a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f63987a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.cart.discount.GetCartDiscountUseCaseImpl$invoke$$inlined$map$1$2", f = "GetCartDiscountUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Tf.z$a$a$a  reason: collision with other inner class name */
            public static final class C1117a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f63988c;

                /* renamed from: d  reason: collision with root package name */
                int f63989d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1116a f63990e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1117a(C1116a aVar, C17164e eVar) {
                    super(eVar);
                    this.f63990e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f63988c = obj;
                    this.f63989d |= Integer.MIN_VALUE;
                    return this.f63990e.emit((Object) null, this);
                }
            }

            public C1116a(C16533h hVar) {
                this.f63987a = hVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
                r5 = r5.a();
             */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Tf.z.a.C1116a.C1117a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Tf.z$a$a$a r0 = (Tf.z.a.C1116a.C1117a) r0
                    int r1 = r0.f63989d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f63989d = r1
                    goto L_0x0018
                L_0x0013:
                    Tf.z$a$a$a r0 = new Tf.z$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f63988c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f63989d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004f
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f63987a
                    Ln.g r5 = (Ln.g) r5
                    if (r5 == 0) goto L_0x0045
                    Ln.c r5 = r5.a()
                    if (r5 == 0) goto L_0x0045
                    java.lang.String r5 = r5.a()
                    goto L_0x0046
                L_0x0045:
                    r5 = 0
                L_0x0046:
                    r0.f63989d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Tf.z.a.C1116a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f63986a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f63986a.collect(new C1116a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public z(h hVar) {
        C17542s.j(hVar, "cartRepository");
        this.f63985a = hVar;
    }

    public C16532g<String> invoke() {
        return new a(this.f63985a.m());
    }
}
