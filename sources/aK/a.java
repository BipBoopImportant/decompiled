package Ak;

import EB.C12832d;
import FB.C12860a;
import KJ.C15985a;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import gB.C14500b;
import gB.C14503e;
import gB.C14505g;
import gB.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import vB.C15128a;
import vB.C15129b;
import vB.C15130c;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\fH@¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J&\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\fH@¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b*\u0010+J \u0010.\u001a\u0004\u0018\u00010\u001a2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\fH@¢\u0006\u0004\b.\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"LAk/a;", "LvB/c;", "LvB/d;", "getShoppingListsWithItemsSortedUseCase", "LFB/a;", "localStoreSelectionRepository", "LWk/d;", "stockRepository", "LSl/e;", "getStaticImageUseCase", "<init>", "(LvB/d;LFB/a;LWk/d;LSl/e;)V", "", "LgB/k;", "listsWithItems", "LTJ/g;", "LvB/b;", "m", "(Ljava/util/List;)LTJ/g;", "n", "LvB/a;", "carouselShoppingList", "h", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "", "LvB/b$a;", "", "k", "(LdI/e;)Ljava/lang/Object;", "key", "o", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "getStockAvailability", "a", "(Z)LTJ/g;", "listWithItems", "LWk/f;", "stock", "i", "(LgB/k;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "listImageUrl", "j", "(LgB/k;Ljava/lang/String;)LvB/a;", "LgB/g;", "sortedItems", "l", "LvB/d;", "b", "LFB/a;", "c", "LWk/d;", "d", "LSl/e;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C15130c {

    /* renamed from: a  reason: collision with root package name */
    private final vB.d f78876a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f78877b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Wk.d f78878c;

    /* renamed from: d  reason: collision with root package name */
    private final Sl.e f78879d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.usecase.GetShoppingListsCarouselUseCaseImpl", f = "GetShoppingListsCarouselUseCaseImpl.kt", l = {157}, m = "createCarouselShoppingListState")
    /* renamed from: Ak.a$a  reason: collision with other inner class name */
    static final class C1452a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f78880c;

        /* renamed from: d  reason: collision with root package name */
        Object f78881d;

        /* renamed from: e  reason: collision with root package name */
        Object f78882e;

        /* renamed from: f  reason: collision with root package name */
        Object f78883f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f78884g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f78885h;

        /* renamed from: i  reason: collision with root package name */
        int f78886i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1452a(a aVar, C17164e<? super C1452a> eVar) {
            super(eVar);
            this.f78885h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f78884g = obj;
            this.f78886i |= Integer.MIN_VALUE;
            return this.f78885h.h((List<C15128a>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.usecase.GetShoppingListsCarouselUseCaseImpl", f = "GetShoppingListsCarouselUseCaseImpl.kt", l = {102}, m = "createShoppingListWithProducts$shoppinglist_implementation_release")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f78887c;

        /* renamed from: d  reason: collision with root package name */
        Object f78888d;

        /* renamed from: e  reason: collision with root package name */
        Object f78889e;

        /* renamed from: f  reason: collision with root package name */
        Object f78890f;

        /* renamed from: g  reason: collision with root package name */
        Object f78891g;

        /* renamed from: h  reason: collision with root package name */
        Object f78892h;

        /* renamed from: i  reason: collision with root package name */
        Object f78893i;

        /* renamed from: j  reason: collision with root package name */
        Object f78894j;

        /* renamed from: k  reason: collision with root package name */
        Object f78895k;

        /* renamed from: l  reason: collision with root package name */
        Object f78896l;

        /* renamed from: m  reason: collision with root package name */
        int f78897m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f78898n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ a f78899o;

        /* renamed from: p  reason: collision with root package name */
        int f78900p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f78899o = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f78898n = obj;
            this.f78900p |= Integer.MIN_VALUE;
            return this.f78899o.i((k) null, (List<Wk.f>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.usecase.GetShoppingListsCarouselUseCaseImpl", f = "GetShoppingListsCarouselUseCaseImpl.kt", l = {162, 163}, m = "getEmptyStateImages")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f78901c;

        /* renamed from: d  reason: collision with root package name */
        Object f78902d;

        /* renamed from: e  reason: collision with root package name */
        Object f78903e;

        /* renamed from: f  reason: collision with root package name */
        Object f78904f;

        /* renamed from: g  reason: collision with root package name */
        Object f78905g;

        /* renamed from: h  reason: collision with root package name */
        Object f78906h;

        /* renamed from: i  reason: collision with root package name */
        Object f78907i;

        /* renamed from: j  reason: collision with root package name */
        int f78908j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f78909k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f78910l;

        /* renamed from: m  reason: collision with root package name */
        int f78911m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f78910l = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f78909k = obj;
            this.f78911m |= Integer.MIN_VALUE;
            return this.f78910l.k(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.usecase.GetShoppingListsCarouselUseCaseImpl$getListsWithProductAvailabilityFlow$$inlined$flatMapLatest$1", f = "GetShoppingListsCarouselUseCaseImpl.kt", l = {189}, m = "invokeSuspend")
    public static final class d extends l implements q<C16533h<? super C15129b>, C12832d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78912c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f78913d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f78914e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f78915f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f78916g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17164e eVar, List list, a aVar) {
            super(3, eVar);
            this.f78915f = list;
            this.f78916g = aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C15129b> hVar, C12832d dVar, C17164e<? super C16807N> eVar) {
            d dVar2 = new d(eVar, this.f78915f, this.f78916g);
            dVar2.f78913d = hVar;
            dVar2.f78914e = dVar;
            return dVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f78912c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f78913d;
                C12832d dVar = (C12832d) this.f78914e;
                Iterable<k> iterable = this.f78915f;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (k c10 : iterable) {
                    Iterable<C14505g> c11 = c10.c();
                    ArrayList arrayList2 = new ArrayList(C16877v.y(c11, 10));
                    for (C14505g b10 : c11) {
                        arrayList2.add(b10.b());
                    }
                    arrayList.add(arrayList2);
                }
                e eVar = new e(this.f78916g.f78878c.c(dVar.e(), C16877v.A(arrayList)), this.f78915f, this.f78916g);
                this.f78912c = 1;
                if (C16534i.x(hVar, eVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C16532g<C15129b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f78917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f78918b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f78919c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ak.a$e$a  reason: collision with other inner class name */
        public static final class C1453a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f78920a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f78921b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f78922c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.usecase.GetShoppingListsCarouselUseCaseImpl$getListsWithProductAvailabilityFlow$lambda$5$$inlined$map$1$2", f = "GetShoppingListsCarouselUseCaseImpl.kt", l = {55, 57, 50}, m = "emit")
            /* renamed from: Ak.a$e$a$a  reason: collision with other inner class name */
            public static final class C1454a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f78923c;

                /* renamed from: d  reason: collision with root package name */
                int f78924d;

                /* renamed from: e  reason: collision with root package name */
                Object f78925e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C1453a f78926f;

                /* renamed from: g  reason: collision with root package name */
                Object f78927g;

                /* renamed from: h  reason: collision with root package name */
                Object f78928h;

                /* renamed from: i  reason: collision with root package name */
                Object f78929i;

                /* renamed from: j  reason: collision with root package name */
                Object f78930j;

                /* renamed from: k  reason: collision with root package name */
                Object f78931k;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1454a(C1453a aVar, C17164e eVar) {
                    super(eVar);
                    this.f78926f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f78923c = obj;
                    this.f78924d |= Integer.MIN_VALUE;
                    return this.f78926f.emit((Object) null, this);
                }
            }

            public C1453a(C16533h hVar, List list, a aVar) {
                this.f78920a = hVar;
                this.f78921b = list;
                this.f78922c = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00c1 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x00c2  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x00cf A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r13, dI.C17164e r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof Ak.a.e.C1453a.C1454a
                    if (r0 == 0) goto L_0x0013
                    r0 = r14
                    Ak.a$e$a$a r0 = (Ak.a.e.C1453a.C1454a) r0
                    int r1 = r0.f78924d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f78924d = r1
                    goto L_0x0018
                L_0x0013:
                    Ak.a$e$a$a r0 = new Ak.a$e$a$a
                    r0.<init>(r12, r14)
                L_0x0018:
                    java.lang.Object r14 = r0.f78923c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f78924d
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L_0x005e
                    if (r2 == r5) goto L_0x0042
                    if (r2 == r4) goto L_0x0039
                    if (r2 != r3) goto L_0x0031
                    XH.y.b(r14)
                    goto L_0x00d0
                L_0x0031:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L_0x0039:
                    java.lang.Object r13 = r0.f78925e
                    TJ.h r13 = (TJ.C16533h) r13
                    XH.y.b(r14)
                    goto L_0x00c5
                L_0x0042:
                    java.lang.Object r13 = r0.f78931k
                    java.util.Collection r13 = (java.util.Collection) r13
                    java.lang.Object r2 = r0.f78930j
                    java.util.Iterator r2 = (java.util.Iterator) r2
                    java.lang.Object r7 = r0.f78929i
                    java.util.Collection r7 = (java.util.Collection) r7
                    java.lang.Object r8 = r0.f78928h
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Object r9 = r0.f78927g
                    TJ.h r9 = (TJ.C16533h) r9
                    java.lang.Object r10 = r0.f78925e
                    Ak.a$e$a r10 = (Ak.a.e.C1453a) r10
                    XH.y.b(r14)
                    goto L_0x00a1
                L_0x005e:
                    XH.y.b(r14)
                    TJ.h r14 = r12.f78920a
                    java.util.List r13 = (java.util.List) r13
                    java.util.List r2 = r12.f78921b
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.ArrayList r7 = new java.util.ArrayList
                    r8 = 10
                    int r8 = YH.C16877v.y(r2, r8)
                    r7.<init>(r8)
                    java.util.Iterator r2 = r2.iterator()
                    r10 = r12
                    r8 = r13
                    r13 = r7
                L_0x007b:
                    boolean r7 = r2.hasNext()
                    if (r7 == 0) goto L_0x00a9
                    java.lang.Object r7 = r2.next()
                    gB.k r7 = (gB.k) r7
                    Ak.a r9 = r10.f78922c
                    r0.f78925e = r10
                    r0.f78927g = r14
                    r0.f78928h = r8
                    r0.f78929i = r13
                    r0.f78930j = r2
                    r0.f78931k = r13
                    r0.f78924d = r5
                    java.lang.Object r7 = r9.i(r7, r8, r0)
                    if (r7 != r1) goto L_0x009e
                    return r1
                L_0x009e:
                    r9 = r14
                    r14 = r7
                    r7 = r13
                L_0x00a1:
                    vB.a r14 = (vB.C15128a) r14
                    r13.add(r14)
                    r13 = r7
                    r14 = r9
                    goto L_0x007b
                L_0x00a9:
                    java.util.List r13 = (java.util.List) r13
                    Ak.a r2 = r10.f78922c
                    r0.f78925e = r14
                    r0.f78927g = r6
                    r0.f78928h = r6
                    r0.f78929i = r6
                    r0.f78930j = r6
                    r0.f78931k = r6
                    r0.f78924d = r4
                    java.lang.Object r13 = r2.h(r13, r0)
                    if (r13 != r1) goto L_0x00c2
                    return r1
                L_0x00c2:
                    r11 = r14
                    r14 = r13
                    r13 = r11
                L_0x00c5:
                    r0.f78925e = r6
                    r0.f78924d = r3
                    java.lang.Object r13 = r13.emit(r14, r0)
                    if (r13 != r1) goto L_0x00d0
                    return r1
                L_0x00d0:
                    XH.N r13 = XH.C16807N.f139792a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: Ak.a.e.C1453a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar, List list, a aVar) {
            this.f78917a = gVar;
            this.f78918b = list;
            this.f78919c = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f78917a.collect(new C1453a(hVar, this.f78918b, this.f78919c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LvB/b;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.usecase.GetShoppingListsCarouselUseCaseImpl$getListsWithoutAvailabilityFlow$1", f = "GetShoppingListsCarouselUseCaseImpl.kt", l = {112, 116, 116}, m = "invokeSuspend")
    static final class f extends l implements p<C16533h<? super C15129b>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f78932c;

        /* renamed from: d  reason: collision with root package name */
        Object f78933d;

        /* renamed from: e  reason: collision with root package name */
        Object f78934e;

        /* renamed from: f  reason: collision with root package name */
        Object f78935f;

        /* renamed from: g  reason: collision with root package name */
        Object f78936g;

        /* renamed from: h  reason: collision with root package name */
        Object f78937h;

        /* renamed from: i  reason: collision with root package name */
        Object f78938i;

        /* renamed from: j  reason: collision with root package name */
        Object f78939j;

        /* renamed from: k  reason: collision with root package name */
        int f78940k;

        /* renamed from: l  reason: collision with root package name */
        int f78941l;

        /* renamed from: m  reason: collision with root package name */
        int f78942m;

        /* renamed from: n  reason: collision with root package name */
        int f78943n;

        /* renamed from: o  reason: collision with root package name */
        private /* synthetic */ Object f78944o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ List<k> f78945p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ a f78946q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(List<k> list, a aVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f78945p = list;
            this.f78946q = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f78945p, this.f78946q, eVar);
            fVar.f78944o = obj;
            return fVar;
        }

        public final Object invoke(C16533h<? super C15129b> hVar, C17164e<? super C16807N> eVar) {
            return ((f) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: gB.k} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x014c A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f78943n
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x009a
                if (r2 == r5) goto L_0x0070
                if (r2 == r4) goto L_0x0041
                if (r2 != r3) goto L_0x0039
                java.lang.Object r1 = r0.f78938i
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f78937h
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f78936g
                java.util.Collection r1 = (java.util.Collection) r1
                java.lang.Object r1 = r0.f78935f
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f78934e
                Ak.a r1 = (Ak.a) r1
                java.lang.Object r1 = r0.f78933d
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f78932c
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f78944o
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r17)
                goto L_0x014d
            L_0x0039:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0041:
                int r2 = r0.f78941l
                int r4 = r0.f78940k
                java.lang.Object r5 = r0.f78938i
                TJ.h r5 = (TJ.C16533h) r5
                java.lang.Object r6 = r0.f78937h
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r0.f78936g
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Object r8 = r0.f78935f
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.lang.Object r9 = r0.f78934e
                Ak.a r9 = (Ak.a) r9
                java.lang.Object r10 = r0.f78933d
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.lang.Object r11 = r0.f78932c
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r12 = r0.f78944o
                TJ.h r12 = (TJ.C16533h) r12
                XH.y.b(r17)
                r3 = r12
                r12 = r9
                r9 = r7
                r7 = r4
                r4 = r17
                goto L_0x012d
            L_0x0070:
                int r2 = r0.f78941l
                int r7 = r0.f78940k
                java.lang.Object r8 = r0.f78939j
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.Object r9 = r0.f78938i
                gB.k r9 = (gB.k) r9
                java.lang.Object r10 = r0.f78936g
                java.util.Iterator r10 = (java.util.Iterator) r10
                java.lang.Object r11 = r0.f78935f
                java.util.Collection r11 = (java.util.Collection) r11
                java.lang.Object r12 = r0.f78934e
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.lang.Object r13 = r0.f78933d
                Ak.a r13 = (Ak.a) r13
                java.lang.Object r14 = r0.f78932c
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.lang.Object r15 = r0.f78944o
                TJ.h r15 = (TJ.C16533h) r15
                XH.y.b(r17)
                r3 = r17
                goto L_0x00f5
            L_0x009a:
                XH.y.b(r17)
                java.lang.Object r2 = r0.f78944o
                TJ.h r2 = (TJ.C16533h) r2
                java.util.List<gB.k> r7 = r0.f78945p
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                Ak.a r8 = r0.f78946q
                java.util.ArrayList r9 = new java.util.ArrayList
                r10 = 10
                int r10 = YH.C16877v.y(r7, r10)
                r9.<init>(r10)
                java.util.Iterator r10 = r7.iterator()
                r11 = r7
                r13 = r11
                r12 = r8
                r8 = r2
                r2 = r6
                r7 = r2
            L_0x00bc:
                boolean r14 = r10.hasNext()
                if (r14 == 0) goto L_0x0105
                java.lang.Object r14 = r10.next()
                r15 = r14
                gB.k r15 = (gB.k) r15
                java.util.List r3 = r15.c()
                r0.f78944o = r8
                r0.f78932c = r13
                r0.f78933d = r12
                r0.f78934e = r11
                r0.f78935f = r9
                r0.f78936g = r10
                r0.f78937h = r14
                r0.f78938i = r15
                r0.f78939j = r9
                r0.f78940k = r7
                r0.f78941l = r2
                r0.f78942m = r6
                r0.f78943n = r5
                java.lang.Object r3 = r12.l(r3, r0)
                if (r3 != r1) goto L_0x00ee
                return r1
            L_0x00ee:
                r14 = r13
                r13 = r12
                r12 = r11
                r11 = r9
                r9 = r15
                r15 = r8
                r8 = r11
            L_0x00f5:
                java.lang.String r3 = (java.lang.String) r3
                vB.a r3 = r13.j(r9, r3)
                r8.add(r3)
                r9 = r11
                r11 = r12
                r12 = r13
                r13 = r14
                r8 = r15
                r3 = 3
                goto L_0x00bc
            L_0x0105:
                r3 = r9
                java.util.List r3 = (java.util.List) r3
                Ak.a r5 = r0.f78946q
                r0.f78944o = r8
                r0.f78932c = r3
                r0.f78933d = r13
                r0.f78934e = r12
                r0.f78935f = r11
                r0.f78936g = r9
                r0.f78937h = r10
                r0.f78938i = r8
                r0.f78940k = r7
                r0.f78941l = r2
                r0.f78943n = r4
                java.lang.Object r4 = r5.h(r3, r0)
                if (r4 != r1) goto L_0x0127
                return r1
            L_0x0127:
                r5 = r8
                r6 = r10
                r10 = r13
                r8 = r11
                r11 = r3
                r3 = r5
            L_0x012d:
                r0.f78944o = r3
                r0.f78932c = r11
                r0.f78933d = r10
                r0.f78934e = r12
                r0.f78935f = r8
                r0.f78936g = r9
                r0.f78937h = r6
                r0.f78938i = r5
                r0.f78939j = r4
                r0.f78940k = r7
                r0.f78941l = r2
                r2 = 3
                r0.f78943n = r2
                java.lang.Object r2 = r5.emit(r4, r0)
                if (r2 != r1) goto L_0x014d
                return r1
            L_0x014d:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Ak.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.usecase.GetShoppingListsCarouselUseCaseImpl", f = "GetShoppingListsCarouselUseCaseImpl.kt", l = {166}, m = "getStaticImage")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f78947c;

        /* renamed from: d  reason: collision with root package name */
        Object f78948d;

        /* renamed from: e  reason: collision with root package name */
        Object f78949e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f78950f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f78951g;

        /* renamed from: h  reason: collision with root package name */
        int f78952h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f78951g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f78950f = obj;
            this.f78952h |= Integer.MIN_VALUE;
            return this.f78951g.o((String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.usecase.GetShoppingListsCarouselUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetShoppingListsCarouselUseCaseImpl.kt", l = {192, 189}, m = "invokeSuspend")
    public static final class h extends l implements q<C16533h<? super C15129b>, List<? extends k>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78953c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f78954d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f78955e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f78956f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f78957g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17164e eVar, a aVar, boolean z10) {
            super(3, eVar);
            this.f78956f = aVar;
            this.f78957g = z10;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C15129b> hVar, List<? extends k> list, C17164e<? super C16807N> eVar) {
            h hVar2 = new h(eVar, this.f78956f, this.f78957g);
            hVar2.f78954d = hVar;
            hVar2.f78955e = list;
            return hVar2.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f78953c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r6)
                goto L_0x0067
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.f78954d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r6)
                goto L_0x0045
            L_0x0022:
                XH.y.b(r6)
                java.lang.Object r6 = r5.f78954d
                r1 = r6
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r6 = r5.f78955e
                java.util.List r6 = (java.util.List) r6
                boolean r4 = r6.isEmpty()
                if (r4 == 0) goto L_0x004a
                Ak.a r6 = r5.f78956f
                java.util.List r4 = YH.C16877v.n()
                r5.f78954d = r1
                r5.f78953c = r3
                java.lang.Object r6 = r6.h(r4, r5)
                if (r6 != r0) goto L_0x0045
                return r0
            L_0x0045:
                TJ.g r6 = TJ.C16534i.J(r6)
                goto L_0x005b
            L_0x004a:
                boolean r3 = r5.f78957g
                if (r3 == 0) goto L_0x0055
                Ak.a r3 = r5.f78956f
                TJ.g r6 = r3.m(r6)
                goto L_0x005b
            L_0x0055:
                Ak.a r3 = r5.f78956f
                TJ.g r6 = r3.n(r6)
            L_0x005b:
                r3 = 0
                r5.f78954d = r3
                r5.f78953c = r2
                java.lang.Object r6 = TJ.C16534i.x(r1, r6, r5)
                if (r6 != r0) goto L_0x0067
                return r0
            L_0x0067:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Ak.a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(vB.d dVar, C12860a aVar, Wk.d dVar2, Sl.e eVar) {
        C17542s.j(dVar, "getShoppingListsWithItemsSortedUseCase");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(dVar2, "stockRepository");
        C17542s.j(eVar, "getStaticImageUseCase");
        this.f78876a = dVar;
        this.f78877b = aVar;
        this.f78878c = dVar2;
        this.f78879d = eVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.util.List<vB.C15128a> r7, dI.C17164e<? super vB.C15129b> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Ak.a.C1452a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Ak.a$a r0 = (Ak.a.C1452a) r0
            int r1 = r0.f78886i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f78886i = r1
            goto L_0x0018
        L_0x0013:
            Ak.a$a r0 = new Ak.a$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f78884g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f78886i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r7 = r0.f78883f
            KJ.c r7 = (KJ.C15987c) r7
            java.lang.Object r8 = r0.f78882e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f78881d
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r0.f78880c
            Ak.a r8 = (Ak.a) r8
            XH.y.b(r1)
            goto L_0x005f
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            XH.y.b(r1)
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            KJ.c r1 = KJ.C15985a.h(r1)
            r0.f78880c = r6
            r0.f78881d = r7
            r0.f78882e = r8
            r0.f78883f = r1
            r0.f78886i = r4
            java.lang.Object r7 = r6.k(r0)
            if (r7 != r2) goto L_0x005c
            return r2
        L_0x005c:
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x005f:
            java.util.Map r1 = (java.util.Map) r1
            vB.b r8 = new vB.b
            r8.<init>(r7, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ak.a.h(java.util.List, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(dI.C17164e<? super java.util.Map<vB.C15129b.a, java.lang.String>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof Ak.a.c
            if (r0 == 0) goto L_0x0013
            r0 = r12
            Ak.a$c r0 = (Ak.a.c) r0
            int r1 = r0.f78911m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f78911m = r1
            goto L_0x0018
        L_0x0013:
            Ak.a$c r0 = new Ak.a$c
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f78909k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f78911m
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x006e
            if (r3 == r5) goto L_0x004d
            if (r3 != r4) goto L_0x0045
            java.lang.Object r12 = r0.f78906h
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r2 = r0.f78905g
            vB.b$a r2 = (vB.C15129b.a) r2
            java.lang.Object r3 = r0.f78904f
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r0.f78903e
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r0.f78902d
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r0 = r0.f78901c
            Ak.a r0 = (Ak.a) r0
            XH.y.b(r1)
            goto L_0x00ba
        L_0x0045:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x004d:
            int r12 = r0.f78908j
            java.lang.Object r3 = r0.f78906h
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r5 = r0.f78905g
            vB.b$a r5 = (vB.C15129b.a) r5
            java.lang.Object r6 = r0.f78904f
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r0.f78903e
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r0.f78902d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r9 = r0.f78901c
            Ak.a r9 = (Ak.a) r9
            XH.y.b(r1)
            r10 = r6
            r6 = r12
            r12 = r10
            goto L_0x0098
        L_0x006e:
            XH.y.b(r1)
            java.util.Map r3 = YH.X.c()
            vB.b$a r1 = vB.C15129b.a.PORTRAIT
            r0.f78901c = r11
            r0.f78902d = r12
            r0.f78903e = r3
            r0.f78904f = r3
            r0.f78905g = r1
            r0.f78906h = r3
            r6 = 0
            r0.f78908j = r6
            r0.f78911m = r5
            java.lang.String r5 = "wayfindingShoppingListEmptyStateImagePortrait"
            java.lang.Object r5 = r11.o(r5, r0)
            if (r5 != r2) goto L_0x0091
            return r2
        L_0x0091:
            r9 = r11
            r8 = r12
            r12 = r3
            r7 = r12
            r10 = r5
            r5 = r1
            r1 = r10
        L_0x0098:
            r3.put(r5, r1)
            vB.b$a r3 = vB.C15129b.a.LANDSCAPE
            r0.f78901c = r9
            r0.f78902d = r8
            r0.f78903e = r7
            r0.f78904f = r12
            r0.f78905g = r3
            r0.f78906h = r12
            r0.f78907i = r1
            r0.f78908j = r6
            r0.f78911m = r4
            java.lang.String r1 = "wayfindingShoppingListEmptyStateImageLandscape"
            java.lang.Object r1 = r9.o(r1, r0)
            if (r1 != r2) goto L_0x00b8
            return r2
        L_0x00b8:
            r2 = r3
            r3 = r7
        L_0x00ba:
            r12.put(r2, r1)
            java.util.Map r12 = YH.X.b(r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Ak.a.k(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final C16532g<C15129b> m(List<k> list) {
        return C16534i.g0(C16534i.A(this.f78877b.b()), new d((C17164e) null, list, this));
    }

    /* access modifiers changed from: private */
    public final C16532g<C15129b> n(List<k> list) {
        return C16534i.H(new f(list, this, (C17164e<? super f>) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r6 = r1.getUrl();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.String r6, dI.C17164e<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Ak.a.g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Ak.a$g r0 = (Ak.a.g) r0
            int r1 = r0.f78952h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f78952h = r1
            goto L_0x0018
        L_0x0013:
            Ak.a$g r0 = new Ak.a$g
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f78950f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f78952h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f78949e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f78948d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f78947c
            Ak.a r6 = (Ak.a) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            Sl.e r1 = r5.f78879d
            r0.f78947c = r5
            r0.f78948d = r6
            r0.f78949e = r7
            r0.f78952h = r4
            java.lang.Object r1 = r1.a(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            com.ingka.ikea.core.model.Media$Image r1 = (com.ingka.ikea.core.model.Media.Image) r1
            if (r1 == 0) goto L_0x005b
            java.lang.String r6 = r1.getUrl()
            if (r6 != 0) goto L_0x005d
        L_0x005b:
            java.lang.String r6 = ""
        L_0x005d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ak.a.o(java.lang.String, dI.e):java.lang.Object");
    }

    public C16532g<C15129b> a(boolean z10) {
        return C16534i.s(C16534i.g0(this.f78876a.invoke(), new h((C17164e) null, this, z10)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(gB.k r19, java.util.List<Wk.f> r20, dI.C17164e<? super vB.C15128a> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof Ak.a.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Ak.a$b r3 = (Ak.a.b) r3
            int r4 = r3.f78900p
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f78900p = r4
            goto L_0x001e
        L_0x0019:
            Ak.a$b r3 = new Ak.a$b
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f78898n
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f78900p
            r7 = 1
            if (r6 == 0) goto L_0x0062
            if (r6 != r7) goto L_0x005a
            java.lang.Object r1 = r3.f78896l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f78895k
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r3.f78894j
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r3.f78893i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.f78892h
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r3.f78891g
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r3.f78890f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r3.f78889e
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r3.f78888d
            gB.k r6 = (gB.k) r6
            java.lang.Object r3 = r3.f78887c
            Ak.a r3 = (Ak.a) r3
            XH.y.b(r4)
            r14 = r1
            r13 = r2
            goto L_0x011a
        L_0x005a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0062:
            XH.y.b(r4)
            java.util.List r4 = r19.c()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r8 = 10
            int r8 = YH.C16877v.y(r4, r8)
            r6.<init>(r8)
            java.util.Iterator r8 = r4.iterator()
        L_0x007a:
            boolean r9 = r8.hasNext()
            r10 = 0
            if (r9 == 0) goto L_0x00e2
            java.lang.Object r9 = r8.next()
            gB.g r9 = (gB.C14505g) r9
            r11 = r1
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x008e:
            boolean r12 = r11.hasNext()
            r13 = 0
            if (r12 == 0) goto L_0x00ab
            java.lang.Object r12 = r11.next()
            r14 = r12
            Wk.f r14 = (Wk.f) r14
            java.lang.String r14 = r14.f()
            java.lang.String r15 = r9.b()
            boolean r14 = kotlin.jvm.internal.C17542s.e(r14, r15)
            if (r14 == 0) goto L_0x008e
            goto L_0x00ac
        L_0x00ab:
            r12 = r13
        L_0x00ac:
            Wk.f r12 = (Wk.f) r12
            if (r12 == 0) goto L_0x00b5
            com.ingka.ikea.app.stockinfo.network.d r11 = r12.k()
            goto L_0x00b6
        L_0x00b5:
            r11 = r13
        L_0x00b6:
            java.lang.String r12 = r9.b()
            gB.b r9 = r9.f()
            if (r9 == 0) goto L_0x00c5
            java.lang.String r9 = r9.d()
            goto L_0x00c6
        L_0x00c5:
            r9 = r13
        L_0x00c6:
            if (r11 == 0) goto L_0x00d9
            com.ingka.ikea.app.stockinfo.network.d r13 = com.ingka.ikea.app.stockinfo.network.d.OUT_OF_STOCK
            if (r11 == r13) goto L_0x00d5
            com.ingka.ikea.app.stockinfo.network.d r13 = com.ingka.ikea.app.stockinfo.network.d.EMPTY
            if (r11 == r13) goto L_0x00d5
            com.ingka.ikea.app.stockinfo.network.d r13 = com.ingka.ikea.app.stockinfo.network.d.OTHER
            if (r11 == r13) goto L_0x00d5
            r10 = r7
        L_0x00d5:
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r10)
        L_0x00d9:
            vB.a$b r10 = new vB.a$b
            r10.<init>(r12, r9, r13)
            r6.add(r10)
            goto L_0x007a
        L_0x00e2:
            gB.e r9 = r19.d()
            java.lang.String r9 = r9.a()
            gB.e r11 = r19.d()
            java.lang.String r11 = r11.b()
            java.util.List r12 = r19.c()
            r3.f78887c = r0
            r13 = r19
            r3.f78888d = r13
            r3.f78889e = r1
            r3.f78890f = r2
            r3.f78891g = r6
            r3.f78892h = r9
            r3.f78893i = r11
            r3.f78894j = r4
            r3.f78895k = r6
            r3.f78896l = r8
            r3.f78897m = r10
            r3.f78900p = r7
            java.lang.Object r4 = r0.l(r12, r3)
            if (r4 != r5) goto L_0x0117
            return r5
        L_0x0117:
            r5 = r6
            r13 = r9
            r14 = r11
        L_0x011a:
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            KJ.f r16 = KJ.C15985a.l(r5)
            vB.a r1 = new vB.a
            r17 = 1
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ak.a.i(gB.k, java.util.List, dI.e):java.lang.Object");
    }

    public final C15128a j(k kVar, String str) {
        C17542s.j(kVar, "listWithItems");
        C14503e d10 = kVar.d();
        String a10 = d10.a();
        String b10 = d10.b();
        Iterable<C14505g> c10 = kVar.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (C14505g gVar : c10) {
            String b11 = gVar.b();
            C14500b f10 = gVar.f();
            arrayList.add(new C15128a.b(b11, f10 != null ? f10.d() : null, Boolean.FALSE));
        }
        return new C15128a(a10, b10, str, C15985a.l(arrayList), false);
    }

    public final Object l(List<C14505g> list, C17164e<? super String> eVar) {
        Object obj;
        C14500b bVar;
        String a10;
        Object obj2;
        String str;
        String str2;
        if (list.isEmpty()) {
            return o("wayfindingShoppingListEmptyImage", eVar);
        }
        Iterable iterable = list;
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C14500b f10 = ((C14505g) obj).f();
            if (f10 != null) {
                str2 = f10.a();
                continue;
            } else {
                str2 = null;
                continue;
            }
            if (str2 != null) {
                break;
            }
        }
        C14505g gVar = (C14505g) obj;
        if (gVar == null || (bVar = gVar.f()) == null) {
            Iterator it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                C14500b f11 = ((C14505g) obj2).f();
                if (f11 != null) {
                    str = f11.d();
                    continue;
                } else {
                    str = null;
                    continue;
                }
                if (str != null) {
                    break;
                }
            }
            C14505g gVar2 = (C14505g) obj2;
            bVar = gVar2 != null ? gVar2.f() : null;
        }
        if (bVar != null && (a10 = bVar.a()) != null) {
            return a10;
        }
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }
}
