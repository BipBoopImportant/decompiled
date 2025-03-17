package nu;

import Op.B0;
import Op.d1;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductItem;
import dI.C17164e;
import eI.C17187b;
import jB.C14613b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import ot.C11716a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lnu/j;", "Lnu/i;", "Lot/a;", "storeOffersRepository", "LjB/b;", "shoppingListRepository", "LIl/a;", "appConfigApi", "<init>", "(Lot/a;LjB/b;LIl/a;)V", "", "storeId", "LTJ/g;", "", "LOp/d1;", "a", "(Ljava/lang/String;)LTJ/g;", "Lot/a;", "b", "LjB/b;", "c", "LIl/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C11716a f100336a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14613b f100337b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Il.a f100338c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.usecase.GetStoreOffersUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetStoreOffersUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends l implements q<C16533h<? super List<? extends d1>>, List<? extends ProductItem>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100339c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100340d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f100341e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f100342f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, j jVar) {
            super(3, eVar);
            this.f100342f = jVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super List<? extends d1>> hVar, List<? extends ProductItem> list, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f100342f);
            aVar.f100340d = hVar;
            aVar.f100341e = list;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f100339c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f100340d;
                List list = (List) this.f100341e;
                C16532g<R> J10 = list.isEmpty() ? C16534i.J(C16877v.n()) : C16534i.N(this.f100342f.f100337b.f(), new c(list, this.f100342f, (C17164e<? super c>) null));
                this.f100339c = 1;
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.usecase.GetStoreOffersUseCaseImpl$invoke$1", f = "GetStoreOffersUseCase.kt", l = {35, 40}, m = "invokeSuspend")
    static final class b extends l implements p<C16533h<? super List<? extends ProductItem>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f100343c;

        /* renamed from: d  reason: collision with root package name */
        Object f100344d;

        /* renamed from: e  reason: collision with root package name */
        Object f100345e;

        /* renamed from: f  reason: collision with root package name */
        Object f100346f;

        /* renamed from: g  reason: collision with root package name */
        Object f100347g;

        /* renamed from: h  reason: collision with root package name */
        Object f100348h;

        /* renamed from: i  reason: collision with root package name */
        int f100349i;

        /* renamed from: j  reason: collision with root package name */
        int f100350j;

        /* renamed from: k  reason: collision with root package name */
        int f100351k;

        /* renamed from: l  reason: collision with root package name */
        private /* synthetic */ Object f100352l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j f100353m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f100354n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f100353m = jVar;
            this.f100354n = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f100353m, this.f100354n, eVar);
            bVar.f100352l = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super List<ProductItem>> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: TJ.h} */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
            r11 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
            r9 = r3;
            r3 = r11;
            r11 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d5, code lost:
            throw r11;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0045, B:13:0x005b] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x004b A[ExcHandler: CancellationException (r11v14 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:8:0x0045] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d1 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f100351k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x004e
                if (r1 == r3) goto L_0x002f
                if (r1 != r2) goto L_0x0027
                java.lang.Object r0 = r10.f100347g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r10.f100346f
                nu.j r0 = (nu.j) r0
                java.lang.Object r0 = r10.f100344d
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r10.f100343c
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r10.f100352l
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r11)
                goto L_0x00d2
            L_0x0027:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x002f:
                int r1 = r10.f100349i
                java.lang.Object r3 = r10.f100346f
                TJ.h r3 = (TJ.C16533h) r3
                java.lang.Object r3 = r10.f100345e
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.f100344d
                nu.j r4 = (nu.j) r4
                java.lang.Object r5 = r10.f100343c
                TJ.h r5 = (TJ.C16533h) r5
                java.lang.Object r5 = r10.f100352l
                TJ.h r5 = (TJ.C16533h) r5
                XH.y.b(r11)     // Catch:{ CancellationException -> 0x004b, all -> 0x0049 }
                goto L_0x007d
            L_0x0049:
                r11 = move-exception
                goto L_0x0088
            L_0x004b:
                r11 = move-exception
                goto L_0x00d5
            L_0x004e:
                XH.y.b(r11)
                java.lang.Object r11 = r10.f100352l
                r5 = r11
                TJ.h r5 = (TJ.C16533h) r5
                nu.j r4 = r10.f100353m
                java.lang.String r11 = r10.f100354n
                r1 = 0
                XH.x$a r6 = XH.x.f139812b     // Catch:{ CancellationException -> 0x004b, all -> 0x0084 }
                ot.a r6 = r4.f100336a     // Catch:{ CancellationException -> 0x004b, all -> 0x0084 }
                r10.f100352l = r5     // Catch:{ CancellationException -> 0x004b, all -> 0x0084 }
                r10.f100343c = r5     // Catch:{ CancellationException -> 0x004b, all -> 0x0084 }
                r10.f100344d = r4     // Catch:{ CancellationException -> 0x004b, all -> 0x0084 }
                r10.f100345e = r11     // Catch:{ CancellationException -> 0x004b, all -> 0x0084 }
                r10.f100346f = r5     // Catch:{ CancellationException -> 0x004b, all -> 0x0084 }
                r10.f100349i = r1     // Catch:{ CancellationException -> 0x004b, all -> 0x0084 }
                r10.f100350j = r1     // Catch:{ CancellationException -> 0x004b, all -> 0x0084 }
                r10.f100351k = r3     // Catch:{ CancellationException -> 0x004b, all -> 0x0084 }
                r3 = 20
                java.lang.Object r3 = r6.a(r11, r3, r10)     // Catch:{ CancellationException -> 0x004b, all -> 0x0084 }
                if (r3 != r0) goto L_0x007a
                return r0
            L_0x007a:
                r9 = r3
                r3 = r11
                r11 = r9
            L_0x007d:
                qt.a r11 = (qt.C11816a) r11     // Catch:{ CancellationException -> 0x004b, all -> 0x0049 }
                java.lang.Object r11 = XH.x.b(r11)     // Catch:{ CancellationException -> 0x004b, all -> 0x0049 }
                goto L_0x0092
            L_0x0084:
                r3 = move-exception
                r9 = r3
                r3 = r11
                r11 = r9
            L_0x0088:
                XH.x$a r6 = XH.x.f139812b
                java.lang.Object r11 = XH.y.a(r11)
                java.lang.Object r11 = XH.x.b(r11)
            L_0x0092:
                boolean r6 = XH.x.g(r11)
                r7 = 0
                if (r6 == 0) goto L_0x009b
                r6 = r7
                goto L_0x009c
            L_0x009b:
                r6 = r11
            L_0x009c:
                qt.a r6 = (qt.C11816a) r6
                if (r6 == 0) goto L_0x00a4
                java.util.List r7 = r6.a()
            L_0x00a4:
                if (r7 != 0) goto L_0x00ab
                java.util.List r6 = YH.C16877v.n()
                goto L_0x00ac
            L_0x00ab:
                r6 = r7
            L_0x00ac:
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.List r6 = YH.C16877v.f(r6)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                r8 = 6
                java.util.List r6 = YH.C16877v.k1(r6, r8)
                r10.f100352l = r5
                r10.f100343c = r6
                r10.f100344d = r7
                r10.f100345e = r11
                r10.f100346f = r4
                r10.f100347g = r3
                r10.f100348h = r11
                r10.f100349i = r1
                r10.f100351k = r2
                java.lang.Object r11 = r5.emit(r6, r10)
                if (r11 != r0) goto L_0x00d2
                return r0
            L_0x00d2:
                XH.N r11 = XH.C16807N.f139792a
                return r11
            L_0x00d5:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "it", "", "LOp/d1;", "<anonymous>", "(Ljava/util/Set;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.usecase.GetStoreOffersUseCaseImpl$invoke$2$1", f = "GetStoreOffersUseCase.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<Set<? extends String>, C17164e<? super List<? extends d1>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100355c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f100356d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<ProductItem> f100357e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f100358f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List<ProductItem> list, j jVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f100357e = list;
            this.f100358f = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f100357e, this.f100358f, eVar);
            cVar.f100356d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(Set<String> set, C17164e<? super List<d1>> eVar) {
            return ((c) create(set, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f100355c == 0) {
                y.b(obj);
                Set set = (Set) this.f100356d;
                Iterable<ProductItem> iterable = this.f100357e;
                j jVar = this.f100358f;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (ProductItem o10 : iterable) {
                    arrayList.add(B0.o(o10, C16877v.n(), set, jVar.f100338c.s(), jVar.f100338c.w(), false, true, false, false, false, 448, (Object) null));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public j(C11716a aVar, C14613b bVar, Il.a aVar2) {
        C17542s.j(aVar, "storeOffersRepository");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(aVar2, "appConfigApi");
        this.f100336a = aVar;
        this.f100337b = bVar;
        this.f100338c = aVar2;
    }

    public C16532g<List<d1>> a(String str) {
        C17542s.j(str, "storeId");
        return C16534i.g0(C16534i.H(new b(this, str, (C17164e<? super b>) null)), new a((C17164e) null, this));
    }
}
