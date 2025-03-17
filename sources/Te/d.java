package te;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import qe.C10189b;
import tf.C10253a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lte/d;", "Lte/c;", "Ltf/a;", "killSwitchRepository", "Lcw/d;", "messageCenterRepository", "<init>", "(Ltf/a;Lcw/d;)V", "LTJ/g;", "Lqe/b;", "invoke", "()LTJ/g;", "a", "Ltf/a;", "b", "Lcw/d;", "alertmessaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final C10253a f76785a;

    /* renamed from: b  reason: collision with root package name */
    private final cw.d f76786b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<C10189b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f76787a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: te.d$a$a  reason: collision with other inner class name */
        public static final class C1412a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f76788a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.alertmessaging.impl.domain.GetAlertMessageUseCaseImpl$invoke$$inlined$map$1$2", f = "GetAlertMessageUseCase.kt", l = {50}, m = "emit")
            /* renamed from: te.d$a$a$a  reason: collision with other inner class name */
            public static final class C1413a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f76789c;

                /* renamed from: d  reason: collision with root package name */
                int f76790d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1412a f76791e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1413a(C1412a aVar, C17164e eVar) {
                    super(eVar);
                    this.f76791e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f76789c = obj;
                    this.f76790d |= Integer.MIN_VALUE;
                    return this.f76791e.emit((Object) null, this);
                }
            }

            public C1412a(C16533h hVar) {
                this.f76788a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof te.d.a.C1412a.C1413a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    te.d$a$a$a r0 = (te.d.a.C1412a.C1413a) r0
                    int r1 = r0.f76790d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f76790d = r1
                    goto L_0x0018
                L_0x0013:
                    te.d$a$a$a r0 = new te.d$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f76789c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f76790d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0059
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f76788a
                    java.util.List r5 = (java.util.List) r5
                    if (r5 != 0) goto L_0x003d
                    qe.b$b r5 = qe.C10189b.C1398b.f76049a
                    goto L_0x0050
                L_0x003d:
                    boolean r2 = r5.isEmpty()
                    if (r2 == 0) goto L_0x0046
                    qe.b$c r5 = qe.C10189b.c.f76050a
                    goto L_0x0050
                L_0x0046:
                    java.lang.Object r5 = YH.C16877v.w0(r5)
                    cw.a r5 = (cw.a) r5
                    qe.b$a r5 = te.C10252b.a(r5)
                L_0x0050:
                    r0.f76790d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0059
                    return r1
                L_0x0059:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: te.d.a.C1412a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f76787a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f76787a.collect(new C1412a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public d(C10253a aVar, cw.d dVar) {
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(dVar, "messageCenterRepository");
        this.f76785a = aVar;
        this.f76786b = dVar;
    }

    public C16532g<C10189b> invoke() {
        return this.f76785a.j() ? new a(this.f76786b.b()) : C16534i.J(C10189b.c.f76050a);
    }
}
