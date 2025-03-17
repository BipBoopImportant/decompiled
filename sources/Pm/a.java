package Pm;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import aA.C13909a;
import am.C11070a;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tf.C10253a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LPm/a;", "LOm/a;", "LaA/a;", "sessionManager", "Lam/a;", "appApi", "Ltf/a;", "killSwitchRepository", "<init>", "(LaA/a;Lam/a;Ltf/a;)V", "LTJ/g;", "", "a", "()LTJ/g;", "LaA/a;", "b", "Lam/a;", "c", "Ltf/a;", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Om.a {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f85618a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C11070a f85619b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C10253a f85620c;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pm.a$a  reason: collision with other inner class name */
    public static final class C1729a implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f85621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f85622b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pm.a$a$a  reason: collision with other inner class name */
        public static final class C1730a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f85623a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f85624b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.boka.impl.BokaIntegrationImpl$isEnabledFlow$$inlined$map$1$2", f = "BokaIntegrationImpl.kt", l = {50}, m = "emit")
            /* renamed from: Pm.a$a$a$a  reason: collision with other inner class name */
            public static final class C1731a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f85625c;

                /* renamed from: d  reason: collision with root package name */
                int f85626d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1730a f85627e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1731a(C1730a aVar, C17164e eVar) {
                    super(eVar);
                    this.f85627e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f85625c = obj;
                    this.f85626d |= Integer.MIN_VALUE;
                    return this.f85627e.emit((Object) null, this);
                }
            }

            public C1730a(C16533h hVar, a aVar) {
                this.f85623a = hVar;
                this.f85624b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Pm.a.C1729a.C1730a.C1731a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Pm.a$a$a$a r0 = (Pm.a.C1729a.C1730a.C1731a) r0
                    int r1 = r0.f85626d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f85626d = r1
                    goto L_0x0018
                L_0x0013:
                    Pm.a$a$a$a r0 = new Pm.a$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f85625c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f85626d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0066
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f85623a
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L_0x0058
                    Pm.a r5 = r4.f85624b
                    tf.a r5 = r5.f85620c
                    boolean r5 = r5.C()
                    if (r5 != 0) goto L_0x0056
                    Pm.a r5 = r4.f85624b
                    am.a r5 = r5.f85619b
                    boolean r5 = r5.b()
                    if (r5 == 0) goto L_0x0058
                L_0x0056:
                    r5 = r3
                    goto L_0x0059
                L_0x0058:
                    r5 = 0
                L_0x0059:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f85626d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0066
                    return r1
                L_0x0066:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Pm.a.C1729a.C1730a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1729a(C16532g gVar, a aVar) {
            this.f85621a = gVar;
            this.f85622b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f85621a.collect(new C1730a(hVar, this.f85622b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public a(C13909a aVar, C11070a aVar2, C10253a aVar3) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(aVar2, "appApi");
        C17542s.j(aVar3, "killSwitchRepository");
        this.f85618a = aVar;
        this.f85619b = aVar2;
        this.f85620c = aVar3;
    }

    public C16532g<Boolean> a() {
        return new C1729a(this.f85618a.n(), this);
    }
}
