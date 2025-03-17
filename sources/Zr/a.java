package Zr;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import aA.C13909a;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import ug.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LZr/a;", "LYr/a;", "LaA/a;", "sessionManager", "Lug/k;", "labsFeatures", "<init>", "(LaA/a;Lug/k;)V", "LTJ/g;", "", "a", "()LTJ/g;", "LaA/a;", "b", "Lug/k;", "homeprojects-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Yr.a {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f90190a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k f90191b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zr.a$a  reason: collision with other inner class name */
    public static final class C1943a implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f90192a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f90193b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zr.a$a$a  reason: collision with other inner class name */
        public static final class C1944a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f90194a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f90195b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.homeprojects.impl.HomeProjectsIntegrationImpl$isEnabledFlow$$inlined$map$1$2", f = "HomeProjectsIntegrationImpl.kt", l = {50}, m = "emit")
            /* renamed from: Zr.a$a$a$a  reason: collision with other inner class name */
            public static final class C1945a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f90196c;

                /* renamed from: d  reason: collision with root package name */
                int f90197d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1944a f90198e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1945a(C1944a aVar, C17164e eVar) {
                    super(eVar);
                    this.f90198e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f90196c = obj;
                    this.f90197d |= Integer.MIN_VALUE;
                    return this.f90198e.emit((Object) null, this);
                }
            }

            public C1944a(C16533h hVar, a aVar) {
                this.f90194a = hVar;
                this.f90195b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Zr.a.C1943a.C1944a.C1945a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Zr.a$a$a$a r0 = (Zr.a.C1943a.C1944a.C1945a) r0
                    int r1 = r0.f90197d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f90197d = r1
                    goto L_0x0018
                L_0x0013:
                    Zr.a$a$a$a r0 = new Zr.a$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f90196c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f90197d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x005a
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f90194a
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L_0x004c
                    Zr.a r5 = r4.f90195b
                    ug.k r5 = r5.f90191b
                    boolean r5 = r5.a()
                    if (r5 == 0) goto L_0x004c
                    r5 = r3
                    goto L_0x004d
                L_0x004c:
                    r5 = 0
                L_0x004d:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f90197d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x005a
                    return r1
                L_0x005a:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Zr.a.C1943a.C1944a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1943a(C16532g gVar, a aVar) {
            this.f90192a = gVar;
            this.f90193b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f90192a.collect(new C1944a(hVar, this.f90193b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public a(C13909a aVar, k kVar) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(kVar, "labsFeatures");
        this.f90190a = aVar;
        this.f90191b = kVar;
    }

    public C16532g<Boolean> a() {
        return new C1943a(this.f90190a.n(), this);
    }
}
