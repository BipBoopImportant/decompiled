package Hy;

import Ry.f;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import com.ingka.ikea.core.model.Image;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"LHy/B;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "<init>", "(LRy/f;)V", "LTJ/g;", "LHy/C;", "a", "()LTJ/g;", "LRy/f;", "b", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class B {

    /* renamed from: b  reason: collision with root package name */
    public static final a f110826b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f110827c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final f f110828a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LHy/B$a;", "", "<init>", "()V", "", "MAX_NUMBER_IMAGE", "I", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<List<? extends Image>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f110829a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f110830a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.LoadFullServeProductImagesUseCase$invoke$$inlined$map$1$2", f = "LoadFullServeProductImagesUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Hy.B$b$a$a  reason: collision with other inner class name */
            public static final class C2668a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f110831c;

                /* renamed from: d  reason: collision with root package name */
                int f110832d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f110833e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2668a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f110833e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f110831c = obj;
                    this.f110832d |= Integer.MIN_VALUE;
                    return this.f110833e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f110830a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Hy.B.b.a.C2668a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    Hy.B$b$a$a r0 = (Hy.B.b.a.C2668a) r0
                    int r1 = r0.f110832d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f110832d = r1
                    goto L_0x0018
                L_0x0013:
                    Hy.B$b$a$a r0 = new Hy.B$b$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f110831c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f110832d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x008a
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f110830a
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L_0x0043:
                    boolean r4 = r7.hasNext()
                    if (r4 == 0) goto L_0x005a
                    java.lang.Object r4 = r7.next()
                    r5 = r4
                    rz.g r5 = (rz.C15014g) r5
                    boolean r5 = rz.J.b(r5)
                    if (r5 == 0) goto L_0x0043
                    r2.add(r4)
                    goto L_0x0043
                L_0x005a:
                    java.util.ArrayList r7 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r2, r4)
                    r7.<init>(r4)
                    java.util.Iterator r2 = r2.iterator()
                L_0x0069:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x0081
                    java.lang.Object r4 = r2.next()
                    rz.g r4 = (rz.C15014g) r4
                    com.ingka.ikea.core.model.product.ProductItem r4 = r4.g()
                    com.ingka.ikea.core.model.Image r4 = r4.d()
                    r7.add(r4)
                    goto L_0x0069
                L_0x0081:
                    r0.f110832d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x008a
                    return r1
                L_0x008a:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Hy.B.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f110829a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f110829a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<C> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f110834a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f110835a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.LoadFullServeProductImagesUseCase$invoke$$inlined$map$2$2", f = "LoadFullServeProductImagesUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Hy.B$c$a$a  reason: collision with other inner class name */
            public static final class C2669a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f110836c;

                /* renamed from: d  reason: collision with root package name */
                int f110837d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f110838e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2669a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f110838e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f110836c = obj;
                    this.f110837d |= Integer.MIN_VALUE;
                    return this.f110838e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f110835a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof Hy.B.c.a.C2669a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    Hy.B$c$a$a r0 = (Hy.B.c.a.C2669a) r0
                    int r1 = r0.f110837d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f110837d = r1
                    goto L_0x0018
                L_0x0013:
                    Hy.B$c$a$a r0 = new Hy.B$c$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f110836c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f110837d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0063
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f110835a
                    java.util.List r6 = (java.util.List) r6
                    r2 = r6
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    r4 = 3
                    java.util.List r2 = YH.C16877v.k1(r2, r4)
                    int r6 = r6.size()
                    int r4 = r2.size()
                    int r6 = r6 - r4
                    java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r6)
                    int r4 = r6.intValue()
                    if (r4 <= 0) goto L_0x0054
                    goto L_0x0055
                L_0x0054:
                    r6 = 0
                L_0x0055:
                    Hy.C r4 = new Hy.C
                    r4.<init>(r2, r6)
                    r0.f110837d = r3
                    java.lang.Object r6 = r7.emit(r4, r0)
                    if (r6 != r1) goto L_0x0063
                    return r1
                L_0x0063:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Hy.B.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f110834a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f110834a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public B(f fVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        this.f110828a = fVar;
    }

    public final C16532g<C> a() {
        return new c(new b(this.f110828a.invoke().i()));
    }
}
