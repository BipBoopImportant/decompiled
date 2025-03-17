package ig;

import HJ.C15854t;
import IC.C13026h;
import KJ.C15985a;
import Op.B0;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductItem;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import hg.q;
import jB.C14613b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import tf.C10253a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00112\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00120 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lig/f;", "Lig/e;", "LAx/c;", "productRemoteDataSource", "LIl/a;", "appConfig", "Ltf/a;", "killSwitchRepository", "LjB/b;", "shoppingListRepository", "LNd/c;", "abTesting", "<init>", "(LAx/c;LIl/a;Ltf/a;LjB/b;LNd/c;)V", "LXH/N;", "e", "(LdI/e;)Ljava/lang/Object;", "LTJ/g;", "", "", "itemNosAddingToCart", "Lhg/q$g;", "a", "(LTJ/g;)LTJ/g;", "LAx/c;", "b", "LIl/a;", "c", "Ltf/a;", "d", "LjB/b;", "LNd/c;", "LTJ/B;", "Lcom/ingka/ikea/core/model/product/ProductItem;", "f", "LTJ/B;", "upsellItems", "", "g", "Z", "hasUpsellBeenFetched", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ig.f  reason: case insensitive filesystem */
public final class C9850f implements C9849e {

    /* renamed from: a  reason: collision with root package name */
    private final Ax.c f74380a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Il.a f74381b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C10253a f74382c;

    /* renamed from: d  reason: collision with root package name */
    private final C14613b f74383d;

    /* renamed from: e  reason: collision with root package name */
    private final Nd.c f74384e;

    /* renamed from: f  reason: collision with root package name */
    private final C16505B<List<ProductItem>> f74385f = C16521S.a(C16877v.n());

    /* renamed from: g  reason: collision with root package name */
    private boolean f74386g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartUpsellUseCaseImpl", f = "GetCartUpsellUseCase.kt", l = {97, 101}, m = "fetchUpsellItems")
    /* renamed from: ig.f$a */
    static final class a extends d {

        /* renamed from: A  reason: collision with root package name */
        final /* synthetic */ C9850f f74387A;

        /* renamed from: B  reason: collision with root package name */
        int f74388B;

        /* renamed from: c  reason: collision with root package name */
        Object f74389c;

        /* renamed from: d  reason: collision with root package name */
        Object f74390d;

        /* renamed from: e  reason: collision with root package name */
        Object f74391e;

        /* renamed from: f  reason: collision with root package name */
        Object f74392f;

        /* renamed from: g  reason: collision with root package name */
        Object f74393g;

        /* renamed from: h  reason: collision with root package name */
        Object f74394h;

        /* renamed from: i  reason: collision with root package name */
        Object f74395i;

        /* renamed from: j  reason: collision with root package name */
        Object f74396j;

        /* renamed from: k  reason: collision with root package name */
        Object f74397k;

        /* renamed from: l  reason: collision with root package name */
        Object f74398l;

        /* renamed from: m  reason: collision with root package name */
        Object f74399m;

        /* renamed from: n  reason: collision with root package name */
        Object f74400n;

        /* renamed from: o  reason: collision with root package name */
        Object f74401o;

        /* renamed from: p  reason: collision with root package name */
        Object f74402p;

        /* renamed from: q  reason: collision with root package name */
        Object f74403q;

        /* renamed from: r  reason: collision with root package name */
        int f74404r;

        /* renamed from: s  reason: collision with root package name */
        int f74405s;

        /* renamed from: t  reason: collision with root package name */
        int f74406t;

        /* renamed from: u  reason: collision with root package name */
        int f74407u;

        /* renamed from: v  reason: collision with root package name */
        int f74408v;

        /* renamed from: w  reason: collision with root package name */
        int f74409w;

        /* renamed from: x  reason: collision with root package name */
        int f74410x;

        /* renamed from: y  reason: collision with root package name */
        int f74411y;

        /* renamed from: z  reason: collision with root package name */
        /* synthetic */ Object f74412z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C9850f fVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f74387A = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f74412z = obj;
            this.f74388B |= Integer.MIN_VALUE;
            return this.f74387A.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/ingka/ikea/core/model/product/ProductItem;", "items", "", "", "itemNosInShoppingList", "productIdsAddingToCart", "Lhg/q$g;", "<anonymous>", "(Ljava/util/List;Ljava/util/Set;Ljava/util/List;)Lhg/q$g;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartUpsellUseCaseImpl$invoke$1", f = "GetCartUpsellUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ig.f$b */
    static final class b extends l implements r<List<? extends ProductItem>, Set<? extends String>, List<? extends String>, C17164e<? super q.g>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74413c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74414d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74415e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f74416f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C9850f f74417g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C9850f fVar, C17164e<? super b> eVar) {
            super(4, eVar);
            this.f74417g = fVar;
        }

        /* renamed from: i */
        public final Object l(List<ProductItem> list, Set<String> set, List<String> list2, C17164e<? super q.g> eVar) {
            b bVar = new b(this.f74417g, eVar);
            bVar.f74414d = list;
            bVar.f74415e = set;
            bVar.f74416f = list2;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74413c == 0) {
                y.b(obj);
                List list = (List) this.f74414d;
                Set set = (Set) this.f74415e;
                List list2 = (List) this.f74416f;
                C9850f fVar = this.f74417g;
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("itemNosAddingToCart: " + list2, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = fVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                if (list.isEmpty()) {
                    return null;
                }
                Iterable<ProductItem> iterable = list;
                C9850f fVar2 = this.f74417g;
                ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
                for (ProductItem o10 : iterable) {
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(B0.o(o10, list2, set, fVar2.f74381b.s(), fVar2.f74381b.w(), fVar2.f74382c.b(), true, false, false, false, 448, (Object) null));
                    arrayList2 = arrayList3;
                    fVar2 = fVar2;
                }
                return new q.g(C15985a.h(arrayList2), C13026h.a(Oo.b.f84634f1));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lhg/q$g;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartUpsellUseCaseImpl$invoke$2", f = "GetCartUpsellUseCase.kt", l = {74, 76}, m = "invokeSuspend")
    /* renamed from: ig.f$c */
    static final class c extends l implements p<C16533h<? super q.g>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74418c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74419d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C9850f f74420e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C9850f fVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f74420e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f74420e, eVar);
            cVar.f74419d = obj;
            return cVar;
        }

        public final Object invoke(C16533h<? super q.g> hVar, C17164e<? super C16807N> eVar) {
            return ((c) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16533h hVar;
            Object f10 = C17187b.f();
            int i10 = this.f74418c;
            if (i10 == 0) {
                y.b(obj);
                hVar = (C16533h) this.f74419d;
                this.f74419d = hVar;
                this.f74418c = 1;
                if (hVar.emit(null, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                hVar = (C16533h) this.f74419d;
                y.b(obj);
            } else if (i10 == 2) {
                C16533h hVar2 = (C16533h) this.f74419d;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C9850f fVar = this.f74420e;
            this.f74419d = hVar;
            this.f74418c = 2;
            if (fVar.e(this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    public C9850f(Ax.c cVar, Il.a aVar, C10253a aVar2, C14613b bVar, Nd.c cVar2) {
        C17542s.j(cVar, "productRemoteDataSource");
        C17542s.j(aVar, "appConfig");
        C17542s.j(aVar2, "killSwitchRepository");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(cVar2, "abTesting");
        this.f74380a = cVar;
        this.f74381b = aVar;
        this.f74382c = aVar2;
        this.f74383d = bVar;
        this.f74384e = cVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: ig.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: ig.f} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02e2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c9, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x020c, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x027c, code lost:
        r19 = r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0070, B:52:0x018e] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0070, B:56:0x01b5] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0070, B:70:0x01e5] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080 A[ExcHandler: CancellationException (r0v17 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:11:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:115:0x0326=Splitter:B:115:0x0326, B:105:0x02df=Splitter:B:105:0x02df} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(dI.C17164e<? super XH.C16807N> r32) {
        /*
            r31 = this;
            r1 = r31
            r0 = r32
            boolean r2 = r0 instanceof ig.C9850f.a
            if (r2 == 0) goto L_0x0017
            r2 = r0
            ig.f$a r2 = (ig.C9850f.a) r2
            int r3 = r2.f74388B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f74388B = r3
            goto L_0x001c
        L_0x0017:
            ig.f$a r2 = new ig.f$a
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f74412z
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f74388B
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            r13 = 1
            r14 = 2
            r15 = 0
            if (r5 == 0) goto L_0x00cd
            if (r5 == r13) goto L_0x008b
            if (r5 != r14) goto L_0x0083
            java.lang.Object r0 = r2.f74403q
            Nd.e$a r0 = (Nd.e.a) r0
            java.lang.Object r0 = r2.f74401o
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f74400n
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f74399m
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f74398l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f74397k
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f74396j
            ig.f r0 = (ig.C9850f) r0
            java.lang.Object r0 = r2.f74395i
            ig.f r0 = (ig.C9850f) r0
            java.lang.Object r0 = r2.f74394h
            Nd.e$a r0 = (Nd.e.a) r0
            java.lang.Object r0 = r2.f74393g
            Nd.a$a r0 = (Nd.a.C1042a) r0
            java.lang.Object r0 = r2.f74392f
            ig.f r0 = (ig.C9850f) r0
            java.lang.Object r0 = r2.f74391e
            ig.f r0 = (ig.C9850f) r0
            java.lang.Object r0 = r2.f74390d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f74389c
            r2 = r0
            ig.f r2 = (ig.C9850f) r2
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x0080, all -> 0x0079 }
            r24 = r7
            r19 = r8
            goto L_0x02df
        L_0x0079:
            r0 = move-exception
            r24 = r7
        L_0x007c:
            r19 = r8
            goto L_0x0335
        L_0x0080:
            r0 = move-exception
            goto L_0x03fb
        L_0x0083:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x008b:
            java.lang.Object r0 = r2.f74403q
            Nd.e$a r0 = (Nd.e.a) r0
            java.lang.Object r0 = r2.f74401o
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f74400n
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f74399m
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f74398l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f74397k
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f74396j
            ig.f r0 = (ig.C9850f) r0
            java.lang.Object r0 = r2.f74395i
            ig.f r0 = (ig.C9850f) r0
            java.lang.Object r0 = r2.f74394h
            Nd.e$a r0 = (Nd.e.a) r0
            java.lang.Object r0 = r2.f74393g
            Nd.a$a r0 = (Nd.a.C1042a) r0
            java.lang.Object r0 = r2.f74392f
            ig.f r0 = (ig.C9850f) r0
            java.lang.Object r0 = r2.f74391e
            ig.f r0 = (ig.C9850f) r0
            java.lang.Object r0 = r2.f74390d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f74389c
            r2 = r0
            ig.f r2 = (ig.C9850f) r2
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x0080, all -> 0x0079 }
            r24 = r7
            r19 = r8
            goto L_0x0326
        L_0x00cd:
            XH.y.b(r3)
            boolean r3 = r1.f74386g
            if (r3 != 0) goto L_0x03fc
            r1.f74386g = r13
            qv.e r3 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00e9:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto L_0x0100
            java.lang.Object r11 = r5.next()
            r12 = r11
            qv.b r12 = (qv.C11819b) r12
            boolean r12 = r12.b(r3, r15)
            if (r12 == 0) goto L_0x00e9
            r13.add(r11)
            goto L_0x00e9
        L_0x0100:
            java.util.Iterator r5 = r13.iterator()
            r11 = 0
            r12 = 0
        L_0x0106:
            boolean r13 = r5.hasNext()
            java.lang.Class<ig.f> r17 = ig.C9850f.class
            if (r13 == 0) goto L_0x011f
            java.lang.Object r13 = r5.next()
            qv.b r13 = (qv.C11819b) r13
            r15 = 0
            if (r11 != 0) goto L_0x0127
            java.lang.String r11 = "Fetch upsell items"
            java.lang.String r11 = qv.C11818a.a(r11, r15)
            if (r11 != 0) goto L_0x0123
        L_0x011f:
            r24 = r7
            goto L_0x018e
        L_0x0123:
            java.lang.String r11 = qv.C11820c.a(r11)
        L_0x0127:
            if (r12 != 0) goto L_0x0173
            java.lang.String r12 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r23 = r5
            r24 = r7
            r5 = 0
            r15 = 36
            java.lang.String r7 = HJ.C15854t.s1(r12, r15, r5, r14, r5)
            r15 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r15, r5, r14, r5)
            int r5 = r7.length()
            if (r5 != 0) goto L_0x0148
            goto L_0x014c
        L_0x0148:
            java.lang.String r12 = HJ.C15854t.P0(r7, r10)
        L_0x014c:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            r7 = 1
            boolean r5 = HJ.C15854t.b0(r5, r9, r7)
            if (r5 == 0) goto L_0x015d
            r5 = r8
            goto L_0x015f
        L_0x015d:
            r5 = r24
        L_0x015f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r6)
            r7.append(r12)
            java.lang.String r5 = r7.toString()
            r12 = r5
            goto L_0x0177
        L_0x0173:
            r23 = r5
            r24 = r7
        L_0x0177:
            r20 = 0
            r17 = r13
            r18 = r3
            r19 = r12
            r5 = 0
            r21 = r5
            r22 = r11
            r17.a(r18, r19, r20, r21, r22)
            r5 = r23
            r7 = r24
            r15 = 0
            goto L_0x0106
        L_0x018e:
            XH.x$a r3 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            Nd.c r3 = r1.f74384e     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            Nd.e r5 = Nd.e.f62005a     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            r7 = 1
            Nd.a$a r3 = r3.c(r5, r7)     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            r5 = r3
            Nd.e$a r5 = (Nd.e.a) r5     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            qv.e r7 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            qv.d r11 = qv.d.f102012a     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            java.util.List r11 = r11.a()     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            r12.<init>()     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
        L_0x01af:
            boolean r13 = r11.hasNext()     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            if (r13 == 0) goto L_0x01cc
            java.lang.Object r13 = r11.next()     // Catch:{ CancellationException -> 0x0080, all -> 0x01c8 }
            r15 = r13
            qv.b r15 = (qv.C11819b) r15     // Catch:{ CancellationException -> 0x0080, all -> 0x01c8 }
            r14 = 0
            boolean r15 = r15.b(r7, r14)     // Catch:{ CancellationException -> 0x0080, all -> 0x01c8 }
            if (r15 == 0) goto L_0x01c6
            r12.add(r13)     // Catch:{ CancellationException -> 0x0080, all -> 0x01c8 }
        L_0x01c6:
            r14 = 2
            goto L_0x01af
        L_0x01c8:
            r0 = move-exception
            r2 = r1
            goto L_0x007c
        L_0x01cc:
            java.util.Iterator r11 = r12.iterator()     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            r15 = r12
            r13 = 0
            r14 = 0
        L_0x01d3:
            boolean r19 = r11.hasNext()     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            if (r19 == 0) goto L_0x027f
            java.lang.Object r15 = r11.next()     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            r25 = r15
            qv.b r25 = (qv.C11819b) r25     // Catch:{ CancellationException -> 0x0080, all -> 0x027b }
            r19 = r8
            if (r13 != 0) goto L_0x020f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r8.<init>()     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r21 = r15
            java.lang.String r15 = "Upsell AB test variant: "
            r8.append(r15)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r8.append(r5)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            java.lang.String r8 = r8.toString()     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r15 = 0
            java.lang.String r8 = qv.C11818a.a(r8, r15)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            if (r8 != 0) goto L_0x0205
            r23 = r4
            r15 = r21
            goto L_0x0283
        L_0x0205:
            java.lang.String r8 = qv.C11820c.a(r8)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r13 = r8
            goto L_0x0211
        L_0x020b:
            r0 = move-exception
        L_0x020c:
            r2 = r1
            goto L_0x0335
        L_0x020f:
            r21 = r15
        L_0x0211:
            if (r14 != 0) goto L_0x025f
            java.lang.String r8 = r17.getName()     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            kotlin.jvm.internal.C17542s.g(r8)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r23 = r4
            r22 = r5
            r5 = 0
            r14 = 36
            r15 = 2
            java.lang.String r4 = HJ.C15854t.s1(r8, r14, r5, r15, r5)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r14 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r14, r5, r15, r5)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            int r5 = r4.length()     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            if (r5 != 0) goto L_0x0233
            goto L_0x0237
        L_0x0233:
            java.lang.String r8 = HJ.C15854t.P0(r4, r10)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
        L_0x0237:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            java.lang.String r4 = r4.getName()     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r5 = 1
            boolean r4 = HJ.C15854t.b0(r4, r9, r5)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            if (r4 == 0) goto L_0x0249
            r4 = r19
            goto L_0x024b
        L_0x0249:
            r4 = r24
        L_0x024b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r5.<init>()     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r5.append(r4)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r5.append(r6)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r5.append(r8)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            java.lang.String r4 = r5.toString()     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r14 = r4
            goto L_0x0263
        L_0x025f:
            r23 = r4
            r22 = r5
        L_0x0263:
            r28 = 0
            r26 = r7
            r27 = r14
            r4 = 0
            r29 = r4
            r30 = r13
            r25.a(r26, r27, r28, r29, r30)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r8 = r19
            r15 = r21
            r5 = r22
            r4 = r23
            goto L_0x01d3
        L_0x027b:
            r0 = move-exception
            r19 = r8
            goto L_0x020c
        L_0x027f:
            r23 = r4
            r19 = r8
        L_0x0283:
            r4 = r3
            Nd.e$a r4 = (Nd.e.a) r4     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            Nd.e$a$b r5 = Nd.e.a.b.f62008a     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            boolean r5 = kotlin.jvm.internal.C17542s.e(r4, r5)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            if (r5 != 0) goto L_0x0296
            Nd.e$a$a r5 = Nd.e.a.C1044a.f62007a     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            boolean r5 = kotlin.jvm.internal.C17542s.e(r4, r5)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            if (r5 == 0) goto L_0x0299
        L_0x0296:
            r5 = r23
            goto L_0x02ea
        L_0x0299:
            Nd.e$a$c r5 = Nd.e.a.c.f62009a     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            boolean r5 = kotlin.jvm.internal.C17542s.e(r4, r5)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            if (r5 == 0) goto L_0x02e4
            Ax.c r5 = r1.f74380a     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74389c = r1     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74390d = r0     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74391e = r1     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74392f = r1     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74393g = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74394h = r4     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74395i = r1     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74396j = r1     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74397k = r7     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74398l = r13     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74399m = r14     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74400n = r12     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74401o = r11     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74402p = r15     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74403q = r4     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r3 = 0
            r2.f74404r = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74405s = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74406t = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74407u = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74408v = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74409w = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74410x = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74411y = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r3 = 2
            r2.f74388B = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            java.lang.Object r3 = r5.c(r2)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r5 = r23
            if (r3 != r5) goto L_0x02de
            return r5
        L_0x02de:
            r2 = r1
        L_0x02df:
            java.util.List r3 = (java.util.List) r3     // Catch:{ CancellationException -> 0x0080, all -> 0x02e2 }
            goto L_0x0328
        L_0x02e2:
            r0 = move-exception
            goto L_0x0335
        L_0x02e4:
            XH.t r0 = new XH.t     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r0.<init>()     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            throw r0     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
        L_0x02ea:
            Ax.c r8 = r1.f74380a     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74389c = r1     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74390d = r0     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74391e = r1     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74392f = r1     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74393g = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74394h = r4     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74395i = r1     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74396j = r1     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74397k = r7     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74398l = r13     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74399m = r14     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74400n = r12     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74401o = r11     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74402p = r15     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74403q = r4     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r3 = 0
            r2.f74404r = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74405s = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74406t = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74407u = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74408v = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74409w = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74410x = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r2.f74411y = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            r3 = 1
            r2.f74388B = r3     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            java.lang.Object r3 = r8.b(r2)     // Catch:{ CancellationException -> 0x0080, all -> 0x020b }
            if (r3 != r5) goto L_0x0325
            return r5
        L_0x0325:
            r2 = r1
        L_0x0326:
            java.util.List r3 = (java.util.List) r3     // Catch:{ CancellationException -> 0x0080, all -> 0x02e2 }
        L_0x0328:
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ CancellationException -> 0x0080, all -> 0x02e2 }
            r0 = 50
            java.util.List r0 = YH.C16877v.k1(r3, r0)     // Catch:{ CancellationException -> 0x0080, all -> 0x02e2 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0080, all -> 0x02e2 }
            goto L_0x033f
        L_0x0335:
            XH.x$a r3 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x033f:
            java.lang.Throwable r3 = XH.x.e(r0)
            if (r3 != 0) goto L_0x034e
            java.util.List r0 = (java.util.List) r0
            TJ.B<java.util.List<com.ingka.ikea.core.model.product.ProductItem>> r2 = r2.f74385f
            r2.setValue(r0)
            goto L_0x03fc
        L_0x034e:
            qv.e r0 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0361:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0379
            java.lang.Object r5 = r3.next()
            r7 = r5
            qv.b r7 = (qv.C11819b) r7
            r8 = 0
            boolean r7 = r7.b(r0, r8)
            if (r7 == 0) goto L_0x0361
            r4.add(r5)
            goto L_0x0361
        L_0x0379:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r5 = 0
        L_0x037f:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x03fc
            java.lang.Object r7 = r3.next()
            r11 = r7
            qv.b r11 = (qv.C11819b) r11
            r15 = 0
            if (r5 != 0) goto L_0x039c
            java.lang.String r5 = "Failed to fetch upsell items"
            java.lang.String r5 = qv.C11818a.a(r5, r15)
            if (r5 != 0) goto L_0x0398
            goto L_0x03fc
        L_0x0398:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x039c:
            if (r4 != 0) goto L_0x03e9
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r7 = 36
            r8 = 2
            r14 = 0
            java.lang.String r12 = HJ.C15854t.s1(r4, r7, r14, r8, r14)
            r13 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r13, r14, r8, r14)
            int r16 = r12.length()
            if (r16 != 0) goto L_0x03be
            goto L_0x03c2
        L_0x03be:
            java.lang.String r4 = HJ.C15854t.P0(r12, r10)
        L_0x03c2:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r7 = 1
            boolean r12 = HJ.C15854t.b0(r12, r9, r7)
            if (r12 == 0) goto L_0x03d4
            r12 = r19
            goto L_0x03d6
        L_0x03d4:
            r12 = r24
        L_0x03d6:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r12)
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto L_0x03ed
        L_0x03e9:
            r8 = 2
            r13 = 46
            r14 = 0
        L_0x03ed:
            r7 = 0
            r12 = r0
            r17 = r13
            r13 = r4
            r18 = r14
            r14 = r7
            r16 = r5
            r11.a(r12, r13, r14, r15, r16)
            goto L_0x037f
        L_0x03fb:
            throw r0
        L_0x03fc:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.C9850f.e(dI.e):java.lang.Object");
    }

    public C16532g<q.g> a(C16532g<? extends List<String>> gVar) {
        C17542s.j(gVar, "itemNosAddingToCart");
        return C16534i.s(C16534i.S(C16534i.m(this.f74385f, this.f74383d.f(), gVar, new b(this, (C17164e<? super b>) null)), new c(this, (C17164e<? super c>) null)));
    }
}
