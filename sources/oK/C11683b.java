package ok;

import KJ.C15985a;
import Op.B0;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductCarousel;
import com.ingka.ikea.core.model.product.ProductItem;
import dI.C17164e;
import eI.C17187b;
import hB.C14526a;
import jB.C14613b;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import pk.s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lok/b;", "", "LhB/a;", "shoppingListRecommendationsRepository", "LjB/b;", "shoppingListRepository", "LIl/a;", "appConfigApi", "<init>", "(LhB/a;LjB/b;LIl/a;)V", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "carousel", "", "", "allShoppingListItems", "Lpk/s$h;", "e", "(Lcom/ingka/ikea/core/model/product/ProductCarousel;Ljava/util/Set;)Lpk/s$h;", "LTJ/g;", "d", "()LTJ/g;", "a", "LhB/a;", "b", "LjB/b;", "c", "LIl/a;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ok.b  reason: case insensitive filesystem */
public final class C11683b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14526a f100480a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14613b f100481b;

    /* renamed from: c  reason: collision with root package name */
    private final Il.a f100482c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.usecase.GetRecommendedForYouCarouselUseCase$invoke$$inlined$flatMapLatest$1", f = "GetRecommendedForYouCarouselUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: ok.b$a */
    public static final class a extends l implements q<C16533h<? super s.h>, ProductCarousel, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100483c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100484d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f100485e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11683b f100486f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, C11683b bVar) {
            super(3, eVar);
            this.f100486f = bVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super s.h> hVar, ProductCarousel productCarousel, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f100486f);
            aVar.f100484d = hVar;
            aVar.f100485e = productCarousel;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f100483c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f100484d;
                ProductCarousel productCarousel = (ProductCarousel) this.f100485e;
                C16532g J10 = productCarousel == null ? C16534i.J(null) : new d(this.f100486f.f100481b.f(), this.f100486f, productCarousel);
                this.f100483c = 1;
                if (C16534i.x(hVar, J10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.usecase.GetRecommendedForYouCarouselUseCase$invoke$1", f = "GetRecommendedForYouCarouselUseCase.kt", l = {34, 36}, m = "invokeSuspend")
    /* renamed from: ok.b$b  reason: collision with other inner class name */
    static final class C2343b extends l implements p<C16533h<? super ProductCarousel>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f100487c;

        /* renamed from: d  reason: collision with root package name */
        Object f100488d;

        /* renamed from: e  reason: collision with root package name */
        int f100489e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f100490f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C11683b f100491g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2343b(C11683b bVar, C17164e<? super C2343b> eVar) {
            super(2, eVar);
            this.f100491g = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2343b bVar = new C2343b(this.f100491g, eVar);
            bVar.f100490f = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super ProductCarousel> hVar, C17164e<? super C16807N> eVar) {
            return ((C2343b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f100489e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0030
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r0 = r4.f100487c
                com.ingka.ikea.core.model.product.ProductCarousel r0 = (com.ingka.ikea.core.model.product.ProductCarousel) r0
                java.lang.Object r0 = r4.f100490f
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r5)
                goto L_0x005e
            L_0x001a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0022:
                java.lang.Object r1 = r4.f100490f
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r5)
                XH.x r5 = (XH.x) r5
                java.lang.Object r5 = r5.j()
                goto L_0x0049
            L_0x0030:
                XH.y.b(r5)
                java.lang.Object r5 = r4.f100490f
                r1 = r5
                TJ.h r1 = (TJ.C16533h) r1
                ok.b r5 = r4.f100491g
                hB.a r5 = r5.f100480a
                r4.f100490f = r1
                r4.f100489e = r3
                java.lang.Object r5 = r5.b(r4)
                if (r5 != r0) goto L_0x0049
                return r0
            L_0x0049:
                XH.y.b(r5)
                r3 = r5
                com.ingka.ikea.core.model.product.ProductCarousel r3 = (com.ingka.ikea.core.model.product.ProductCarousel) r3
                r4.f100490f = r1
                r4.f100487c = r3
                r4.f100488d = r5
                r4.f100489e = r2
                java.lang.Object r5 = r1.emit(r3, r4)
                if (r5 != r0) goto L_0x005e
                return r0
            L_0x005e:
                XH.N r5 = XH.C16807N.f139792a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ok.C11683b.C2343b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lpk/s$h;", "", "e", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.usecase.GetRecommendedForYouCarouselUseCase$invoke$3", f = "GetRecommendedForYouCarouselUseCase.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: ok.b$c */
    static final class c extends l implements q<C16533h<? super s.h>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f100492c;

        /* renamed from: d  reason: collision with root package name */
        Object f100493d;

        /* renamed from: e  reason: collision with root package name */
        Object f100494e;

        /* renamed from: f  reason: collision with root package name */
        Object f100495f;

        /* renamed from: g  reason: collision with root package name */
        Object f100496g;

        /* renamed from: h  reason: collision with root package name */
        Object f100497h;

        /* renamed from: i  reason: collision with root package name */
        Object f100498i;

        /* renamed from: j  reason: collision with root package name */
        Object f100499j;

        /* renamed from: k  reason: collision with root package name */
        int f100500k;

        /* renamed from: l  reason: collision with root package name */
        int f100501l;

        /* renamed from: m  reason: collision with root package name */
        int f100502m;

        /* renamed from: n  reason: collision with root package name */
        int f100503n;

        /* renamed from: o  reason: collision with root package name */
        int f100504o;

        /* renamed from: p  reason: collision with root package name */
        int f100505p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f100506q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f100507r;

        c(C17164e<? super c> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super s.h> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar);
            cVar.f100506q = hVar;
            cVar.f100507r = th2;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f100505p
                r3 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r1 = r0.f100498i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f100497h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f100496g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f100495f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f100494e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f100493d
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f100492c
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f100507r
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r1 = r0.f100506q
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r20)
                goto L_0x012c
            L_0x0036:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003e:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f100506q
                TJ.h r2 = (TJ.C16533h) r2
                java.lang.Object r4 = r0.f100507r
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                qv.e r11 = qv.e.WARN
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x005c:
                boolean r6 = r5.hasNext()
                r13 = 0
                if (r6 == 0) goto L_0x0074
                java.lang.Object r6 = r5.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r11, r13)
                if (r7 == 0) goto L_0x005c
                r12.add(r6)
                goto L_0x005c
            L_0x0074:
                java.util.Iterator r14 = r12.iterator()
                r15 = 0
                r7 = r12
                r5 = r15
                r6 = r5
            L_0x007c:
                boolean r8 = r14.hasNext()
                if (r8 == 0) goto L_0x0103
                java.lang.Object r16 = r14.next()
                r7 = r16
                qv.b r7 = (qv.C11819b) r7
                if (r5 != 0) goto L_0x009c
                java.lang.String r8 = "Error loading recommended for you carousel"
                java.lang.String r8 = qv.C11818a.a(r8, r4)
                if (r8 != 0) goto L_0x0098
                r7 = r16
                goto L_0x0103
            L_0x0098:
                java.lang.String r5 = qv.C11820c.a(r8)
            L_0x009c:
                r17 = r5
                if (r6 != 0) goto L_0x00ee
                java.lang.Class r5 = r2.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r6 = 36
                r8 = 2
                java.lang.String r6 = HJ.C15854t.s1(r5, r6, r15, r8, r15)
                r9 = 46
                java.lang.String r6 = HJ.C15854t.o1(r6, r9, r15, r8, r15)
                int r8 = r6.length()
                if (r8 != 0) goto L_0x00bf
                goto L_0x00c5
            L_0x00bf:
                java.lang.String r5 = "Kt"
                java.lang.String r5 = HJ.C15854t.P0(r6, r5)
            L_0x00c5:
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                java.lang.String r8 = "main"
                boolean r6 = HJ.C15854t.b0(r6, r8, r3)
                if (r6 == 0) goto L_0x00d8
                java.lang.String r6 = "m"
                goto L_0x00da
            L_0x00d8:
                java.lang.String r6 = "b"
            L_0x00da:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                java.lang.String r6 = "|"
                r8.append(r6)
                r8.append(r5)
                java.lang.String r6 = r8.toString()
            L_0x00ee:
                r18 = r6
                r8 = 0
                r5 = r7
                r6 = r11
                r7 = r18
                r9 = r4
                r10 = r17
                r5.a(r6, r7, r8, r9, r10)
                r7 = r16
                r5 = r17
                r6 = r18
                goto L_0x007c
            L_0x0103:
                pk.s$h$b r8 = pk.s.h.b.f101100a
                r0.f100506q = r2
                r0.f100507r = r4
                r0.f100492c = r2
                r0.f100493d = r2
                r0.f100494e = r11
                r0.f100495f = r5
                r0.f100496g = r6
                r0.f100497h = r12
                r0.f100498i = r14
                r0.f100499j = r7
                r0.f100500k = r13
                r0.f100501l = r13
                r0.f100502m = r13
                r0.f100503n = r13
                r0.f100504o = r13
                r0.f100505p = r3
                java.lang.Object r2 = r2.emit(r8, r0)
                if (r2 != r1) goto L_0x012c
                return r1
            L_0x012c:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ok.C11683b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ok.b$d */
    public static final class d implements C16532g<s.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100508a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11683b f100509b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ProductCarousel f100510c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ok.b$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100511a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C11683b f100512b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ProductCarousel f100513c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.usecase.GetRecommendedForYouCarouselUseCase$invoke$lambda$1$$inlined$map$1$2", f = "GetRecommendedForYouCarouselUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ok.b$d$a$a  reason: collision with other inner class name */
            public static final class C2344a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100514c;

                /* renamed from: d  reason: collision with root package name */
                int f100515d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f100516e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2344a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100516e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100514c = obj;
                    this.f100515d |= Integer.MIN_VALUE;
                    return this.f100516e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C11683b bVar, ProductCarousel productCarousel) {
                this.f100511a = hVar;
                this.f100512b = bVar;
                this.f100513c = productCarousel;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ok.C11683b.d.a.C2344a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    ok.b$d$a$a r0 = (ok.C11683b.d.a.C2344a) r0
                    int r1 = r0.f100515d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100515d = r1
                    goto L_0x0018
                L_0x0013:
                    ok.b$d$a$a r0 = new ok.b$d$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f100514c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100515d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f100511a
                    java.util.Set r6 = (java.util.Set) r6
                    ok.b r2 = r5.f100512b
                    com.ingka.ikea.core.model.product.ProductCarousel r4 = r5.f100513c
                    pk.s$h r6 = r2.e(r4, r6)
                    r0.f100515d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ok.C11683b.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar, C11683b bVar, ProductCarousel productCarousel) {
            this.f100508a = gVar;
            this.f100509b = bVar;
            this.f100510c = productCarousel;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100508a.collect(new a(hVar, this.f100509b, this.f100510c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C11683b(C14526a aVar, C14613b bVar, Il.a aVar2) {
        C17542s.j(aVar, "shoppingListRecommendationsRepository");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(aVar2, "appConfigApi");
        this.f100480a = aVar;
        this.f100481b = bVar;
        this.f100482c = aVar2;
    }

    /* access modifiers changed from: private */
    public final s.h e(ProductCarousel productCarousel, Set<String> set) {
        Iterable<ProductItem> c10 = productCarousel.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (ProductItem o10 : c10) {
            arrayList.add(B0.o(o10, C16877v.n(), set, this.f100482c.s(), this.f100482c.w(), false, true, false, false, false, 448, (Object) null));
        }
        return new s.h.a(productCarousel.b(), productCarousel.e(), C15985a.h(arrayList));
    }

    public final C16532g<s.h> d() {
        return C16534i.g(C16534i.g0(C16534i.H(new C2343b(this, (C17164e<? super C2343b>) null)), new a((C17164e) null, this)), new c((C17164e<? super c>) null));
    }
}
