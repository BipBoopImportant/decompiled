package ig;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import hg.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import tf.C10253a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lig/h;", "Lig/g;", "LLn/h;", "cartRepository", "Ltf/a;", "killSwitch", "<init>", "(LLn/h;Ltf/a;)V", "LTJ/g;", "Lhg/q$d;", "invoke", "()LTJ/g;", "a", "LLn/h;", "b", "Ltf/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements C9851g {

    /* renamed from: a  reason: collision with root package name */
    private final Ln.h f74421a;

    /* renamed from: b  reason: collision with root package name */
    private final C10253a f74422b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74423a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ig.h$a$a  reason: collision with other inner class name */
        public static final class C1332a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74424a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCheckoutButtonUiStateUseCaseImpl$invoke$$inlined$map$1$2", f = "GetCheckoutButtonUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.h$a$a$a  reason: collision with other inner class name */
            public static final class C1333a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74425c;

                /* renamed from: d  reason: collision with root package name */
                int f74426d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1332a f74427e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1333a(C1332a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74427e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74425c = obj;
                    this.f74426d |= Integer.MIN_VALUE;
                    return this.f74427e.emit((Object) null, this);
                }
            }

            public C1332a(C16533h hVar) {
                this.f74424a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ig.h.a.C1332a.C1333a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    ig.h$a$a$a r0 = (ig.h.a.C1332a.C1333a) r0
                    int r1 = r0.f74426d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74426d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.h$a$a$a r0 = new ig.h$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f74425c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74426d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x005b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f74424a
                    Ln.g r5 = (Ln.g) r5
                    if (r5 == 0) goto L_0x003f
                    java.util.List r5 = r5.d()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    java.util.Collection r5 = (java.util.Collection) r5
                    if (r5 == 0) goto L_0x004d
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L_0x004b
                    goto L_0x004d
                L_0x004b:
                    r5 = 0
                    goto L_0x004e
                L_0x004d:
                    r5 = r3
                L_0x004e:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f74426d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x005b
                    return r1
                L_0x005b:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.h.a.C1332a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f74423a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74423a.collect(new C1332a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isCartEmpty", "enabled", "Lhg/q$d;", "<anonymous>", "(ZZ)Lhg/q$d;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCheckoutButtonUiStateUseCaseImpl$invoke$2", f = "GetCheckoutButtonUiStateUseCase.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements q<Boolean, Boolean, C17164e<? super q.d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74428c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f74429d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f74430e;

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        public final Object i(boolean z10, boolean z11, C17164e<? super q.d> eVar) {
            b bVar = new b(eVar);
            bVar.f74429d = z10;
            bVar.f74430e = z11;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74428c == 0) {
                y.b(obj);
                boolean z10 = this.f74429d;
                boolean z11 = this.f74430e;
                if (!z10) {
                    return new q.d(z11, (q.d.a) null, 2, (DefaultConstructorMarker) null);
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public h(Ln.h hVar, C10253a aVar) {
        C17542s.j(hVar, "cartRepository");
        C17542s.j(aVar, "killSwitch");
        this.f74421a = hVar;
        this.f74422b = aVar;
    }

    public C16532g<q.d> invoke() {
        return C16534i.n(new a(this.f74421a.m()), this.f74422b.L(), new b((C17164e<? super b>) null));
    }
}
