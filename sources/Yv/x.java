package Yv;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import Yv.w;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import vB.C15130c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LYv/x;", "LYv/w;", "LvB/c;", "getShoppingListUseCase", "<init>", "(LvB/c;)V", "LTJ/g;", "LYv/w$a;", "invoke", "()LTJ/g;", "a", "LvB/c;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x implements w {

    /* renamed from: a  reason: collision with root package name */
    private final C15130c f41289a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<w.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f41290a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yv.x$a$a  reason: collision with other inner class name */
        public static final class C0719a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f41291a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.usecase.GetLatestShoppingListUseCaseImpl$invoke$$inlined$map$1$2", f = "GetLatestShoppingListUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Yv.x$a$a$a  reason: collision with other inner class name */
            public static final class C0720a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f41292c;

                /* renamed from: d  reason: collision with root package name */
                int f41293d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0719a f41294e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0720a(C0719a aVar, C17164e eVar) {
                    super(eVar);
                    this.f41294e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f41292c = obj;
                    this.f41293d |= Integer.MIN_VALUE;
                    return this.f41294e.emit((Object) null, this);
                }
            }

            public C0719a(C16533h hVar) {
                this.f41291a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Yv.x.a.C0719a.C0720a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    Yv.x$a$a$a r0 = (Yv.x.a.C0719a.C0720a) r0
                    int r1 = r0.f41293d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f41293d = r1
                    goto L_0x0018
                L_0x0013:
                    Yv.x$a$a$a r0 = new Yv.x$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f41292c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f41293d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x006a
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f41291a
                    vB.b r7 = (vB.C15129b) r7
                    KJ.c r7 = r7.a()
                    java.lang.Object r7 = YH.C16877v.y0(r7)
                    vB.a r7 = (vB.C15128a) r7
                    if (r7 == 0) goto L_0x0056
                    Sv.c r2 = new Sv.c
                    java.lang.String r4 = r7.a()
                    java.lang.String r5 = r7.c()
                    java.lang.String r7 = r7.b()
                    r2.<init>(r4, r5, r7)
                    goto L_0x0057
                L_0x0056:
                    r2 = 0
                L_0x0057:
                    if (r2 != 0) goto L_0x005c
                    Yv.w$a$c r7 = Yv.w.a.c.f41288a
                    goto L_0x0061
                L_0x005c:
                    Yv.w$a$a r7 = new Yv.w$a$a
                    r7.<init>(r2)
                L_0x0061:
                    r0.f41293d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x006a
                    return r1
                L_0x006a:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Yv.x.a.C0719a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f41290a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f41290a.collect(new C0719a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LYv/w$a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetLatestShoppingListUseCaseImpl$invoke$2", f = "GetLatestShoppingListUseCase.kt", l = {40}, m = "invokeSuspend")
    static final class b extends l implements p<C16533h<? super w.a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f41295c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f41296d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f41296d = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super w.a> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f41295c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f41296d;
                w.a.b bVar = w.a.b.f41287a;
                this.f41296d = hVar;
                this.f41295c = 1;
                if (hVar.emit(bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f41296d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public x(C15130c cVar) {
        C17542s.j(cVar, "getShoppingListUseCase");
        this.f41289a = cVar;
    }

    public C16532g<w.a> invoke() {
        return C16534i.S(new a(this.f41289a.a(false)), new b((C17164e<? super b>) null));
    }
}
