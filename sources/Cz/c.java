package Cz;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import yz.C15324a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0015"}, d2 = {"LCz/c;", "LCz/b;", "LAz/a;", "dataStore", "LCz/a;", "giveFeedbackForMapper", "<init>", "(LAz/a;LCz/a;)V", "Lyz/a$b;", "giveFeedbackFor", "LXH/N;", "c", "(Lyz/a$b;)V", "b", "()V", "LTJ/g;", "Lyz/a;", "a", "()LTJ/g;", "LAz/a;", "LCz/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Az.a f108477a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a f108478b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<C15324a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f108479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f108480b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cz.c$a$a  reason: collision with other inner class name */
        public static final class C2600a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f108481a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f108482b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.scanandgo.feedback.repo.ShouldUserGiveFeedbackRepositoryImpl$shouldUserGiveFeedback$$inlined$map$1$2", f = "ShouldUserGiveFeedbackRepository.kt", l = {50}, m = "emit")
            /* renamed from: Cz.c$a$a$a  reason: collision with other inner class name */
            public static final class C2601a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f108483c;

                /* renamed from: d  reason: collision with root package name */
                int f108484d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2600a f108485e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2601a(C2600a aVar, C17164e eVar) {
                    super(eVar);
                    this.f108485e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f108483c = obj;
                    this.f108484d |= Integer.MIN_VALUE;
                    return this.f108485e.emit((Object) null, this);
                }
            }

            public C2600a(C16533h hVar, c cVar) {
                this.f108481a = hVar;
                this.f108482b = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Cz.c.a.C2600a.C2601a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Cz.c$a$a$a r0 = (Cz.c.a.C2600a.C2601a) r0
                    int r1 = r0.f108484d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f108484d = r1
                    goto L_0x0018
                L_0x0013:
                    Cz.c$a$a$a r0 = new Cz.c$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f108483c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f108484d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f108481a
                    java.lang.String r5 = (java.lang.String) r5
                    Cz.c r2 = r4.f108482b
                    Cz.a r2 = r2.f108478b
                    yz.a r5 = r2.a(r5)
                    r0.f108484d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Cz.c.a.C2600a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, c cVar) {
            this.f108479a = gVar;
            this.f108480b = cVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f108479a.collect(new C2600a(hVar, this.f108480b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public c(Az.a aVar, a aVar2) {
        C17542s.j(aVar, "dataStore");
        C17542s.j(aVar2, "giveFeedbackForMapper");
        this.f108477a = aVar;
        this.f108478b = aVar2;
    }

    public C16532g<C15324a> a() {
        return new a(this.f108477a.a(), this);
    }

    public void b() {
        this.f108477a.clear();
    }

    public void c(C15324a.b bVar) {
        C17542s.j(bVar, "giveFeedbackFor");
        this.f108477a.b(bVar.a());
    }
}
