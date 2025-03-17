package Fi;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LFi/d;", "LFi/c;", "LGx/a;", "purchaseHistoryRepository", "<init>", "(LGx/a;)V", "", "orderId", "LTJ/g;", "a", "(Ljava/lang/String;)LTJ/g;", "LGx/a;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Gx.a f80849a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f80850a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fi.d$a$a  reason: collision with other inner class name */
        public static final class C1549a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f80851a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.usecase.GetAssemblyUrlUseCaseImpl$invoke$$inlined$map$1$2", f = "GetAssemblyUrlUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Fi.d$a$a$a  reason: collision with other inner class name */
            public static final class C1550a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f80852c;

                /* renamed from: d  reason: collision with root package name */
                int f80853d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1549a f80854e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1550a(C1549a aVar, C17164e eVar) {
                    super(eVar);
                    this.f80854e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f80852c = obj;
                    this.f80853d |= Integer.MIN_VALUE;
                    return this.f80854e.emit((Object) null, this);
                }
            }

            public C1549a(C16533h hVar) {
                this.f80851a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x0073 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Fi.d.a.C1549a.C1550a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    Fi.d$a$a$a r0 = (Fi.d.a.C1549a.C1550a) r0
                    int r1 = r0.f80853d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f80853d = r1
                    goto L_0x0018
                L_0x0013:
                    Fi.d$a$a$a r0 = new Fi.d$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f80852c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f80853d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x0074
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f80851a
                    Hx.c r7 = (Hx.c) r7
                    if (r7 == 0) goto L_0x006a
                    java.util.List r7 = r7.c()
                    if (r7 == 0) goto L_0x006a
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L_0x004b:
                    boolean r4 = r7.hasNext()
                    if (r4 == 0) goto L_0x005d
                    java.lang.Object r4 = r7.next()
                    boolean r5 = r4 instanceof Hx.c.d.a
                    if (r5 == 0) goto L_0x004b
                    r2.add(r4)
                    goto L_0x004b
                L_0x005d:
                    java.lang.Object r7 = YH.C16877v.y0(r2)
                    Hx.c$d$a r7 = (Hx.c.d.a) r7
                    if (r7 == 0) goto L_0x006a
                    java.lang.String r7 = r7.b()
                    goto L_0x006b
                L_0x006a:
                    r7 = 0
                L_0x006b:
                    r0.f80853d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x0074
                    return r1
                L_0x0074:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Fi.d.a.C1549a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f80850a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f80850a.collect(new C1549a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public d(Gx.a aVar) {
        C17542s.j(aVar, "purchaseHistoryRepository");
        this.f80849a = aVar;
    }

    public C16532g<String> a(String str) {
        C17542s.j(str, "orderId");
        return new a(this.f80849a.j(str));
    }
}
