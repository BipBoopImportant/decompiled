package Bs;

import Gs.b;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LBs/f;", "LBs/e;", "LGs/b;", "inboxRepository", "<init>", "(LGs/b;)V", "LTJ/g;", "LEs/a;", "invoke", "()LTJ/g;", "a", "LGs/b;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final b f79386a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<Es.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f79387a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bs.f$a$a  reason: collision with other inner class name */
        public static final class C1474a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f79388a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.usecase.GetInboxStateUseCaseImpl$invoke$$inlined$map$1$2", f = "GetInboxStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Bs.f$a$a$a  reason: collision with other inner class name */
            public static final class C1475a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f79389c;

                /* renamed from: d  reason: collision with root package name */
                int f79390d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1474a f79391e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1475a(C1474a aVar, C17164e eVar) {
                    super(eVar);
                    this.f79391e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f79389c = obj;
                    this.f79390d |= Integer.MIN_VALUE;
                    return this.f79391e.emit((Object) null, this);
                }
            }

            public C1474a(C16533h hVar) {
                this.f79388a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Bs.f.a.C1474a.C1475a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Bs.f$a$a$a r0 = (Bs.f.a.C1474a.C1475a) r0
                    int r1 = r0.f79390d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f79390d = r1
                    goto L_0x0018
                L_0x0013:
                    Bs.f$a$a$a r0 = new Bs.f$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f79389c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f79390d
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
                    TJ.h r6 = r4.f79388a
                    Gs.b$a r5 = (Gs.b.a) r5
                    boolean r2 = r5 instanceof Gs.b.a.C1582a
                    if (r2 == 0) goto L_0x0048
                    Es.a$a r2 = new Es.a$a
                    Gs.b$a$a r5 = (Gs.b.a.C1582a) r5
                    int r5 = r5.a()
                    r2.<init>(r5)
                    goto L_0x004e
                L_0x0048:
                    boolean r5 = r5 instanceof Gs.b.a.C1583b
                    if (r5 == 0) goto L_0x005a
                    Es.a$b r2 = Es.a.b.f80780a
                L_0x004e:
                    r0.f79390d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                L_0x005a:
                    XH.t r5 = new XH.t
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Bs.f.a.C1474a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f79387a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f79387a.collect(new C1474a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public f(b bVar) {
        C17542s.j(bVar, "inboxRepository");
        this.f79386a = bVar;
    }

    public C16532g<Es.a> invoke() {
        return new a(this.f79386a.f());
    }
}
