package VA;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import UJ.C16619l;
import WA.C13763a;
import WA.C13764b;
import WA.C13765c;
import WA.C13767e;
import WA.h;
import WA.i;
import WA.j;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.q;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H@¢\u0006\u0004\b\u0011\u0010\u0007J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH§@¢\u0006\u0004\b\u001f\u0010\u001eJ \u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH§@¢\u0006\u0004\b!\u0010\u001eJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\"\u001a\u00020\nH§@¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH§@¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0'2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020'H'¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020'2\u0006\u0010\f\u001a\u00020\bH\u0017¢\u0006\u0004\b,\u0010)J#\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00020'2\u0006\u0010\f\u001a\u00020\bH'¢\u0006\u0004\b.\u0010)J+\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00020'2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u00101J+\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00020'2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b2\u00101J \u00104\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u00103\u001a\u00020\bH§@¢\u0006\u0004\b4\u0010\u001eJ#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00020'2\u0006\u0010\f\u001a\u00020\bH'¢\u0006\u0004\b5\u0010)J'\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0'2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b6\u00101J&\u00108\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\b2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b8\u00109J\u0018\u0010<\u001a\u00020\u00052\u0006\u0010;\u001a\u00020:H§@¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"LVA/e;", "", "", "LWA/i;", "products", "LXH/N;", "e", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "", "itemNo", "", "quantity", "listId", "n", "(Ljava/lang/String;ILjava/lang/String;LdI/e;)Ljava/lang/Object;", "LWA/h;", "entities", "w", "shoppingListEntity", "k", "(LWA/h;LdI/e;)Ljava/lang/Object;", "LWA/a;", "articleDetails", "q", "(LWA/a;LdI/e;)Ljava/lang/Object;", "LWA/b;", "articleItem", "g", "(LWA/b;LdI/e;)Ljava/lang/Object;", "v", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "l", "parentItemNo", "o", "limit", "s", "(ILdI/e;)Ljava/lang/Object;", "j", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LTJ/g;", "u", "(Ljava/lang/String;)LTJ/g;", "t", "()LTJ/g;", "f", "LWA/j;", "d", "LWA/c;", "p", "(Ljava/lang/String;Ljava/lang/String;)LTJ/g;", "c", "articleItemNo", "r", "h", "b", "serverItems", "m", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LWA/e;", "prices", "i", "(LWA/e;LdI/e;)Ljava/lang/Object;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: VA.e  reason: case insensitive filesystem */
public interface C13741e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: VA.e$a */
    public static final class a {

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: VA.e$a$a  reason: collision with other inner class name */
        public static final class C2889a implements C16532g<List<? extends C13765c>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f117201a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C13741e f117202b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f117203c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: VA.e$a$a$a  reason: collision with other inner class name */
            public static final class C2890a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f117204a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C13741e f117205b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f117206c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.db.dao.ShoppingListItemDao$DefaultImpls$getItemArticlesWithDetails$$inlined$map$1$2", f = "ShoppingListItemDao.kt", l = {57, 50}, m = "emit")
                /* renamed from: VA.e$a$a$a$a  reason: collision with other inner class name */
                public static final class C2891a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f117207c;

                    /* renamed from: d  reason: collision with root package name */
                    int f117208d;

                    /* renamed from: e  reason: collision with root package name */
                    Object f117209e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ C2890a f117210f;

                    /* renamed from: g  reason: collision with root package name */
                    Object f117211g;

                    /* renamed from: h  reason: collision with root package name */
                    Object f117212h;

                    /* renamed from: i  reason: collision with root package name */
                    Object f117213i;

                    /* renamed from: j  reason: collision with root package name */
                    Object f117214j;

                    /* renamed from: k  reason: collision with root package name */
                    Object f117215k;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2891a(C2890a aVar, C17164e eVar) {
                        super(eVar);
                        this.f117210f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f117207c = obj;
                        this.f117208d |= Integer.MIN_VALUE;
                        return this.f117210f.emit((Object) null, this);
                    }
                }

                public C2890a(C16533h hVar, C13741e eVar, String str) {
                    this.f117204a = hVar;
                    this.f117205b = eVar;
                    this.f117206c = str;
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
                /* JADX WARNING: Removed duplicated region for block: B:24:0x00b9 A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r11, dI.C17164e r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof VA.C13741e.a.C2889a.C2890a.C2891a
                        if (r0 == 0) goto L_0x0013
                        r0 = r12
                        VA.e$a$a$a$a r0 = (VA.C13741e.a.C2889a.C2890a.C2891a) r0
                        int r1 = r0.f117208d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f117208d = r1
                        goto L_0x0018
                    L_0x0013:
                        VA.e$a$a$a$a r0 = new VA.e$a$a$a$a
                        r0.<init>(r10, r12)
                    L_0x0018:
                        java.lang.Object r12 = r0.f117207c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f117208d
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L_0x0051
                        if (r2 == r4) goto L_0x0035
                        if (r2 != r3) goto L_0x002d
                        XH.y.b(r12)
                        goto L_0x00ba
                    L_0x002d:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L_0x0035:
                        java.lang.Object r11 = r0.f117215k
                        WA.b r11 = (WA.C13764b) r11
                        java.lang.Object r2 = r0.f117214j
                        java.util.Collection r2 = (java.util.Collection) r2
                        java.lang.Object r5 = r0.f117213i
                        java.util.Iterator r5 = (java.util.Iterator) r5
                        java.lang.Object r6 = r0.f117212h
                        java.util.Collection r6 = (java.util.Collection) r6
                        java.lang.Object r7 = r0.f117211g
                        TJ.h r7 = (TJ.C16533h) r7
                        java.lang.Object r8 = r0.f117209e
                        VA.e$a$a$a r8 = (VA.C13741e.a.C2889a.C2890a) r8
                        XH.y.b(r12)
                        goto L_0x0096
                    L_0x0051:
                        XH.y.b(r12)
                        TJ.h r12 = r10.f117204a
                        java.util.List r11 = (java.util.List) r11
                        java.lang.Iterable r11 = (java.lang.Iterable) r11
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r5 = 10
                        int r5 = YH.C16877v.y(r11, r5)
                        r2.<init>(r5)
                        java.util.Iterator r11 = r11.iterator()
                        r8 = r10
                        r5 = r11
                        r7 = r12
                    L_0x006c:
                        boolean r11 = r5.hasNext()
                        if (r11 == 0) goto L_0x00a2
                        java.lang.Object r11 = r5.next()
                        WA.b r11 = (WA.C13764b) r11
                        VA.e r12 = r8.f117205b
                        java.lang.String r6 = r8.f117206c
                        java.lang.String r9 = r11.a()
                        r0.f117209e = r8
                        r0.f117211g = r7
                        r0.f117212h = r2
                        r0.f117213i = r5
                        r0.f117214j = r2
                        r0.f117215k = r11
                        r0.f117208d = r4
                        java.lang.Object r12 = r12.r(r6, r9, r0)
                        if (r12 != r1) goto L_0x0095
                        return r1
                    L_0x0095:
                        r6 = r2
                    L_0x0096:
                        WA.a r12 = (WA.C13763a) r12
                        WA.c r9 = new WA.c
                        r9.<init>(r11, r12)
                        r2.add(r9)
                        r2 = r6
                        goto L_0x006c
                    L_0x00a2:
                        java.util.List r2 = (java.util.List) r2
                        r11 = 0
                        r0.f117209e = r11
                        r0.f117211g = r11
                        r0.f117212h = r11
                        r0.f117213i = r11
                        r0.f117214j = r11
                        r0.f117215k = r11
                        r0.f117208d = r3
                        java.lang.Object r11 = r7.emit(r2, r0)
                        if (r11 != r1) goto L_0x00ba
                        return r1
                    L_0x00ba:
                        XH.N r11 = XH.C16807N.f139792a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: VA.C13741e.a.C2889a.C2890a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public C2889a(C16532g gVar, C13741e eVar, String str) {
                this.f117201a = gVar;
                this.f117202b = eVar;
                this.f117203c = str;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f117201a.collect(new C2890a(hVar, this.f117202b, this.f117203c), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.db.dao.ShoppingListItemDao$DefaultImpls$getShoppingListItemsWithArticlesAndPrices$$inlined$flatMapLatest$1", f = "ShoppingListItemDao.kt", l = {189}, m = "invokeSuspend")
        /* renamed from: VA.e$a$b */
        public static final class b extends l implements q<C16533h<? super List<? extends i>>, List<? extends j>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f117216c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f117217d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f117218e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C13741e f117219f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ String f117220g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C17164e eVar, C13741e eVar2, String str) {
                super(3, eVar);
                this.f117219f = eVar2;
                this.f117220g = str;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super List<? extends i>> hVar, List<? extends j> list, C17164e<? super C16807N> eVar) {
                b bVar = new b(eVar, this.f117219f, this.f117220g);
                bVar.f117217d = hVar;
                bVar.f117218e = list;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C16532g gVar;
                Object f10 = C17187b.f();
                int i10 = this.f117216c;
                if (i10 == 0) {
                    y.b(obj);
                    C16533h hVar = (C16533h) this.f117217d;
                    List list = (List) this.f117218e;
                    if (list.isEmpty()) {
                        gVar = C16534i.J(C16877v.n());
                    } else {
                        Iterable<j> iterable = list;
                        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                        for (j a10 : iterable) {
                            arrayList.add(this.f117219f.p(this.f117220g, a10.a().b()));
                        }
                        gVar = new c((C16532g[]) C16877v.t1(arrayList).toArray(new C16532g[0]), list);
                    }
                    this.f117216c = 1;
                    if (C16534i.x(hVar, gVar, this) == f10) {
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
        /* renamed from: VA.e$a$c */
        public static final class c implements C16532g<List<? extends i>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g[] f117221a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f117222b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: VA.e$a$c$a  reason: collision with other inner class name */
            public static final class C2892a implements C17631a<List<? extends C13765c>[]> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16532g[] f117223a;

                public C2892a(C16532g[] gVarArr) {
                    this.f117223a = gVarArr;
                }

                /* renamed from: a */
                public final List<? extends C13765c>[] invoke() {
                    return new List[this.f117223a.length];
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.db.dao.ShoppingListItemDao$DefaultImpls$getShoppingListItemsWithArticlesAndPrices$lambda$14$$inlined$combine$1$3", f = "ShoppingListItemDao.kt", l = {288}, m = "invokeSuspend")
            /* renamed from: VA.e$a$c$b */
            public static final class b extends l implements q<C16533h<? super List<? extends i>>, List<? extends C13765c>[], C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f117224c;

                /* renamed from: d  reason: collision with root package name */
                private /* synthetic */ Object f117225d;

                /* renamed from: e  reason: collision with root package name */
                /* synthetic */ Object f117226e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ List f117227f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public b(C17164e eVar, List list) {
                    super(3, eVar);
                    this.f117227f = list;
                }

                /* renamed from: i */
                public final Object invoke(C16533h<? super List<? extends i>> hVar, List<? extends C13765c>[] listArr, C17164e<? super C16807N> eVar) {
                    b bVar = new b(eVar, this.f117227f);
                    bVar.f117225d = hVar;
                    bVar.f117226e = listArr;
                    return bVar.invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    List list;
                    Object f10 = C17187b.f();
                    int i10 = this.f117224c;
                    if (i10 == 0) {
                        y.b(obj);
                        C16533h hVar = (C16533h) this.f117225d;
                        List[] listArr = (List[]) ((Object[]) this.f117226e);
                        Iterable<j> iterable = this.f117227f;
                        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                        for (j jVar : iterable) {
                            h a10 = jVar.a();
                            List<C13767e> b10 = jVar.b();
                            int length = listArr.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length) {
                                    list = null;
                                    break;
                                }
                                list = listArr[i11];
                                Iterable<C13765c> iterable2 = list;
                                if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                                    break;
                                }
                                for (C13765c b11 : iterable2) {
                                    if (!C17542s.e(b11.b().c(), jVar.a().b())) {
                                        i11++;
                                    }
                                }
                                break;
                            }
                            if (list == null) {
                                list = C16877v.n();
                            }
                            arrayList.add(new i(a10, list, b10));
                        }
                        this.f117224c = 1;
                        if (hVar.emit(arrayList, this) == f10) {
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

            public c(C16532g[] gVarArr, List list) {
                this.f117221a = gVarArr;
                this.f117222b = list;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                C16532g[] gVarArr = this.f117221a;
                Object a10 = C16619l.a(hVar, gVarArr, new C2892a(gVarArr), new b((C17164e) null, this.f117222b), eVar);
                return a10 == C17187b.f() ? a10 : C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.db.dao.ShoppingListItemDao$DefaultImpls", f = "ShoppingListItemDao.kt", l = {55}, m = "insertItems")
        /* renamed from: VA.e$a$d */
        static final class d extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f117228c;

            /* renamed from: d  reason: collision with root package name */
            Object f117229d;

            /* renamed from: e  reason: collision with root package name */
            Object f117230e;

            /* renamed from: f  reason: collision with root package name */
            Object f117231f;

            /* renamed from: g  reason: collision with root package name */
            Object f117232g;

            /* renamed from: h  reason: collision with root package name */
            Object f117233h;

            /* renamed from: i  reason: collision with root package name */
            Object f117234i;

            /* renamed from: j  reason: collision with root package name */
            int f117235j;

            /* renamed from: k  reason: collision with root package name */
            int f117236k;

            /* renamed from: l  reason: collision with root package name */
            /* synthetic */ Object f117237l;

            /* renamed from: m  reason: collision with root package name */
            int f117238m;

            d(C17164e<? super d> eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.f117237l = obj;
                this.f117238m |= Integer.MIN_VALUE;
                return a.c((C13741e) null, (List<h>) null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.db.dao.ShoppingListItemDao$DefaultImpls", f = "ShoppingListItemDao.kt", l = {36, 39, 42, 45}, m = "insertProducts")
        /* renamed from: VA.e$a$e  reason: collision with other inner class name */
        static final class C2893e extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f117239c;

            /* renamed from: d  reason: collision with root package name */
            Object f117240d;

            /* renamed from: e  reason: collision with root package name */
            Object f117241e;

            /* renamed from: f  reason: collision with root package name */
            Object f117242f;

            /* renamed from: g  reason: collision with root package name */
            Object f117243g;

            /* renamed from: h  reason: collision with root package name */
            Object f117244h;

            /* renamed from: i  reason: collision with root package name */
            Object f117245i;

            /* renamed from: j  reason: collision with root package name */
            Object f117246j;

            /* renamed from: k  reason: collision with root package name */
            Object f117247k;

            /* renamed from: l  reason: collision with root package name */
            int f117248l;

            /* renamed from: m  reason: collision with root package name */
            int f117249m;

            /* renamed from: n  reason: collision with root package name */
            /* synthetic */ Object f117250n;

            /* renamed from: o  reason: collision with root package name */
            int f117251o;

            C2893e(C17164e<? super C2893e> eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.f117250n = obj;
                this.f117251o |= Integer.MIN_VALUE;
                return a.d((C13741e) null, (List<i>) null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.db.dao.ShoppingListItemDao$DefaultImpls", f = "ShoppingListItemDao.kt", l = {72, 73}, m = "removeItemFromList")
        /* renamed from: VA.e$a$f */
        static final class f extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f117252c;

            /* renamed from: d  reason: collision with root package name */
            Object f117253d;

            /* renamed from: e  reason: collision with root package name */
            Object f117254e;

            /* renamed from: f  reason: collision with root package name */
            Object f117255f;

            /* renamed from: g  reason: collision with root package name */
            /* synthetic */ Object f117256g;

            /* renamed from: h  reason: collision with root package name */
            int f117257h;

            f(C17164e<? super f> eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.f117256g = obj;
                this.f117257h |= Integer.MIN_VALUE;
                return a.e((C13741e) null, (String) null, (String) null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.db.dao.ShoppingListItemDao$DefaultImpls", f = "ShoppingListItemDao.kt", l = {201, 205, 208}, m = "replaceShoppingListItems")
        /* renamed from: VA.e$a$g */
        static final class g extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f117258c;

            /* renamed from: d  reason: collision with root package name */
            Object f117259d;

            /* renamed from: e  reason: collision with root package name */
            Object f117260e;

            /* renamed from: f  reason: collision with root package name */
            Object f117261f;

            /* renamed from: g  reason: collision with root package name */
            Object f117262g;

            /* renamed from: h  reason: collision with root package name */
            Object f117263h;

            /* renamed from: i  reason: collision with root package name */
            Object f117264i;

            /* renamed from: j  reason: collision with root package name */
            Object f117265j;

            /* renamed from: k  reason: collision with root package name */
            Object f117266k;

            /* renamed from: l  reason: collision with root package name */
            Object f117267l;

            /* renamed from: m  reason: collision with root package name */
            Object f117268m;

            /* renamed from: n  reason: collision with root package name */
            Object f117269n;

            /* renamed from: o  reason: collision with root package name */
            Object f117270o;

            /* renamed from: p  reason: collision with root package name */
            Object f117271p;

            /* renamed from: q  reason: collision with root package name */
            Object f117272q;

            /* renamed from: r  reason: collision with root package name */
            Object f117273r;

            /* renamed from: s  reason: collision with root package name */
            int f117274s;

            /* renamed from: t  reason: collision with root package name */
            int f117275t;

            /* renamed from: u  reason: collision with root package name */
            int f117276u;

            /* renamed from: v  reason: collision with root package name */
            int f117277v;

            /* renamed from: w  reason: collision with root package name */
            int f117278w;

            /* renamed from: x  reason: collision with root package name */
            /* synthetic */ Object f117279x;

            /* renamed from: y  reason: collision with root package name */
            int f117280y;

            g(C17164e<? super g> eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.f117279x = obj;
                this.f117280y |= Integer.MIN_VALUE;
                return a.f((C13741e) null, (String) null, (List<i>) null, this);
            }
        }

        public static C16532g<List<C13765c>> a(C13741e eVar, String str, String str2) {
            C17542s.j(str, "listId");
            C17542s.j(str2, "itemNo");
            return new C2889a(eVar.c(str, str2), eVar, str2);
        }

        public static C16532g<List<i>> b(C13741e eVar, String str) {
            C17542s.j(str, "listId");
            return C16534i.g0(eVar.d(str), new b((C17164e) null, eVar, str));
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Object c(VA.C13741e r9, java.util.List<WA.h> r10, dI.C17164e<? super XH.C16807N> r11) {
            /*
                boolean r0 = r11 instanceof VA.C13741e.a.d
                if (r0 == 0) goto L_0x0013
                r0 = r11
                VA.e$a$d r0 = (VA.C13741e.a.d) r0
                int r1 = r0.f117238m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f117238m = r1
                goto L_0x0018
            L_0x0013:
                VA.e$a$d r0 = new VA.e$a$d
                r0.<init>(r11)
            L_0x0018:
                java.lang.Object r1 = r0.f117237l
                java.lang.Object r2 = eI.C17187b.f()
                int r3 = r0.f117238m
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x0053
                if (r3 != r5) goto L_0x004b
                int r9 = r0.f117235j
                java.lang.Object r10 = r0.f117234i
                WA.h r10 = (WA.h) r10
                java.lang.Object r10 = r0.f117232g
                java.util.Iterator r10 = (java.util.Iterator) r10
                java.lang.Object r11 = r0.f117231f
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.lang.Object r3 = r0.f117230e
                dI.e r3 = (dI.C17164e) r3
                java.lang.Object r6 = r0.f117229d
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r7 = r0.f117228c
                VA.e r7 = (VA.C13741e) r7
                XH.y.b(r1)
                r1 = r11
                r11 = r6
                r6 = r0
                r0 = r3
                r3 = r10
                r10 = r9
                r9 = r7
                goto L_0x0061
            L_0x004b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L_0x0053:
                XH.y.b(r1)
                r1 = r10
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r3 = r1.iterator()
                r6 = r0
                r0 = r11
                r11 = r10
                r10 = r4
            L_0x0061:
                boolean r7 = r3.hasNext()
                if (r7 == 0) goto L_0x0089
                java.lang.Object r7 = r3.next()
                r8 = r7
                WA.h r8 = (WA.h) r8
                r6.f117228c = r9
                r6.f117229d = r11
                r6.f117230e = r0
                r6.f117231f = r1
                r6.f117232g = r3
                r6.f117233h = r7
                r6.f117234i = r8
                r6.f117235j = r10
                r6.f117236k = r4
                r6.f117238m = r5
                java.lang.Object r7 = r9.k(r8, r6)
                if (r7 != r2) goto L_0x0061
                return r2
            L_0x0089:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: VA.C13741e.a.c(VA.e, java.util.List, dI.e):java.lang.Object");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.util.ArrayList} */
        /* JADX WARNING: type inference failed for: r13v4, types: [java.util.Collection, java.lang.Iterable, java.util.ArrayList] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0138  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0244 A[LOOP:6: B:56:0x023e->B:58:0x0244, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0269  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Object d(VA.C13741e r16, java.util.List<WA.i> r17, dI.C17164e<? super XH.C16807N> r18) {
            /*
                r0 = r16
                r1 = r17
                r2 = r18
                boolean r3 = r2 instanceof VA.C13741e.a.C2893e
                if (r3 == 0) goto L_0x0019
                r3 = r2
                VA.e$a$e r3 = (VA.C13741e.a.C2893e) r3
                int r4 = r3.f117251o
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = r4 & r5
                if (r6 == 0) goto L_0x0019
                int r4 = r4 - r5
                r3.f117251o = r4
                goto L_0x001e
            L_0x0019:
                VA.e$a$e r3 = new VA.e$a$e
                r3.<init>(r2)
            L_0x001e:
                java.lang.Object r4 = r3.f117250n
                java.lang.Object r5 = eI.C17187b.f()
                int r6 = r3.f117251o
                r7 = 4
                r8 = 3
                r9 = 2
                r10 = 1
                r11 = 10
                r12 = 0
                if (r6 == 0) goto L_0x00d9
                if (r6 == r10) goto L_0x00af
                if (r6 == r9) goto L_0x008a
                if (r6 == r8) goto L_0x0065
                if (r6 != r7) goto L_0x005d
                int r0 = r3.f117248l
                java.lang.Object r1 = r3.f117247k
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r2 = r3.f117246j
                java.lang.Object r6 = r3.f117245i
                WA.e r6 = (WA.C13767e) r6
                java.lang.Object r6 = r3.f117243g
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r8 = r3.f117242f
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.lang.Object r9 = r3.f117241e
                dI.e r9 = (dI.C17164e) r9
                java.lang.Object r10 = r3.f117240d
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r11 = r3.f117239c
                VA.e r11 = (VA.C13741e) r11
                XH.y.b(r4)
                r4 = r7
                goto L_0x0263
            L_0x005d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0065:
                int r0 = r3.f117248l
                java.lang.Object r1 = r3.f117247k
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r2 = r3.f117246j
                java.lang.Object r6 = r3.f117245i
                WA.a r6 = (WA.C13763a) r6
                java.lang.Object r6 = r3.f117243g
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r9 = r3.f117242f
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.lang.Object r10 = r3.f117241e
                dI.e r10 = (dI.C17164e) r10
                java.lang.Object r13 = r3.f117240d
                java.util.List r13 = (java.util.List) r13
                java.lang.Object r14 = r3.f117239c
                VA.e r14 = (VA.C13741e) r14
                XH.y.b(r4)
                goto L_0x0202
            L_0x008a:
                int r0 = r3.f117248l
                java.lang.Object r1 = r3.f117247k
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r2 = r3.f117246j
                java.lang.Object r6 = r3.f117245i
                WA.b r6 = (WA.C13764b) r6
                java.lang.Object r6 = r3.f117243g
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r10 = r3.f117242f
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.lang.Object r13 = r3.f117241e
                dI.e r13 = (dI.C17164e) r13
                java.lang.Object r14 = r3.f117240d
                java.util.List r14 = (java.util.List) r14
                java.lang.Object r15 = r3.f117239c
                VA.e r15 = (VA.C13741e) r15
                XH.y.b(r4)
                goto L_0x01a7
            L_0x00af:
                java.lang.Object r0 = r3.f117247k
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r1 = r3.f117246j
                VA.e r1 = (VA.C13741e) r1
                java.lang.Object r2 = r3.f117245i
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r2 = r3.f117244h
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r2 = r3.f117243g
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.lang.Object r2 = r3.f117242f
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.lang.Object r2 = r3.f117241e
                dI.e r2 = (dI.C17164e) r2
                java.lang.Object r6 = r3.f117240d
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r10 = r3.f117239c
                VA.e r10 = (VA.C13741e) r10
                XH.y.b(r4)
                r4 = r0
                r0 = r10
                goto L_0x0122
            L_0x00d9:
                XH.y.b(r4)
                r4 = r1
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r6 = new java.util.ArrayList
                int r13 = YH.C16877v.y(r4, r11)
                r6.<init>(r13)
                java.util.Iterator r13 = r4.iterator()
            L_0x00ec:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x0100
                java.lang.Object r14 = r13.next()
                WA.i r14 = (WA.i) r14
                WA.h r14 = r14.b()
                r6.add(r14)
                goto L_0x00ec
            L_0x0100:
                r3.f117239c = r0
                r3.f117240d = r1
                r3.f117241e = r2
                r3.f117242f = r4
                r3.f117243g = r4
                r3.f117244h = r6
                r3.f117245i = r13
                r3.f117246j = r0
                r3.f117247k = r6
                r3.f117248l = r12
                r3.f117249m = r12
                r3.f117251o = r10
                java.lang.Object r4 = r0.w(r6, r3)
                if (r4 != r5) goto L_0x011f
                return r5
            L_0x011f:
                r4 = r6
                r6 = r1
                r1 = r0
            L_0x0122:
                r10 = r6
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r13 = new java.util.ArrayList
                int r14 = YH.C16877v.y(r10, r11)
                r13.<init>(r14)
                java.util.Iterator r10 = r10.iterator()
            L_0x0132:
                boolean r14 = r10.hasNext()
                if (r14 == 0) goto L_0x016a
                java.lang.Object r1 = r10.next()
                WA.i r1 = (WA.i) r1
                java.util.List r1 = r1.a()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r4 = new java.util.ArrayList
                int r14 = YH.C16877v.y(r1, r11)
                r4.<init>(r14)
                java.util.Iterator r1 = r1.iterator()
            L_0x0151:
                boolean r14 = r1.hasNext()
                if (r14 == 0) goto L_0x0165
                java.lang.Object r14 = r1.next()
                WA.c r14 = (WA.C13765c) r14
                WA.b r14 = r14.b()
                r4.add(r14)
                goto L_0x0151
            L_0x0165:
                r13.add(r4)
                r1 = r13
                goto L_0x0132
            L_0x016a:
                java.util.List r10 = YH.C16877v.A(r13)
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.Iterator r13 = r10.iterator()
                r15 = r0
                r14 = r6
                r0 = r12
                r6 = r13
                r13 = r2
                r2 = r1
                r1 = r4
            L_0x017b:
                boolean r4 = r6.hasNext()
                if (r4 == 0) goto L_0x01a9
                java.lang.Object r4 = r6.next()
                r7 = r4
                WA.b r7 = (WA.C13764b) r7
                r3.f117239c = r15
                r3.f117240d = r14
                r3.f117241e = r13
                r3.f117242f = r10
                r3.f117243g = r6
                r3.f117244h = r4
                r3.f117245i = r7
                r3.f117246j = r2
                r3.f117247k = r1
                r3.f117248l = r0
                r3.f117249m = r12
                r3.f117251o = r9
                java.lang.Object r4 = r15.g(r7, r3)
                if (r4 != r5) goto L_0x01a7
                return r5
            L_0x01a7:
                r7 = 4
                goto L_0x017b
            L_0x01a9:
                r0 = r14
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r4 = new java.util.ArrayList
                int r6 = YH.C16877v.y(r0, r11)
                r4.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L_0x01b9:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x01f2
                java.lang.Object r1 = r0.next()
                WA.i r1 = (WA.i) r1
                java.util.List r1 = r1.a()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r2 = new java.util.ArrayList
                int r6 = YH.C16877v.y(r1, r11)
                r2.<init>(r6)
                java.util.Iterator r1 = r1.iterator()
            L_0x01d8:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x01ec
                java.lang.Object r6 = r1.next()
                WA.c r6 = (WA.C13765c) r6
                WA.a r6 = r6.a()
                r2.add(r6)
                goto L_0x01d8
            L_0x01ec:
                r4.add(r2)
                r1 = r2
                r2 = r4
                goto L_0x01b9
            L_0x01f2:
                java.util.List r0 = YH.C16877v.A(r4)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r4 = r0.iterator()
                r9 = r0
                r6 = r4
                r0 = r12
                r10 = r13
                r13 = r14
                r14 = r15
            L_0x0202:
                boolean r4 = r6.hasNext()
                if (r4 == 0) goto L_0x022e
                java.lang.Object r4 = r6.next()
                r7 = r4
                WA.a r7 = (WA.C13763a) r7
                r3.f117239c = r14
                r3.f117240d = r13
                r3.f117241e = r10
                r3.f117242f = r9
                r3.f117243g = r6
                r3.f117244h = r4
                r3.f117245i = r7
                r3.f117246j = r2
                r3.f117247k = r1
                r3.f117248l = r0
                r3.f117249m = r12
                r3.f117251o = r8
                java.lang.Object r4 = r14.q(r7, r3)
                if (r4 != r5) goto L_0x0202
                return r5
            L_0x022e:
                r0 = r13
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r4 = new java.util.ArrayList
                int r6 = YH.C16877v.y(r0, r11)
                r4.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L_0x023e:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x0253
                java.lang.Object r1 = r0.next()
                WA.i r1 = (WA.i) r1
                java.util.List r1 = r1.c()
                r4.add(r1)
                r2 = r4
                goto L_0x023e
            L_0x0253:
                java.util.List r0 = YH.C16877v.A(r4)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r4 = r0.iterator()
                r8 = r0
                r6 = r4
                r9 = r10
                r0 = r12
                r10 = r13
                r11 = r14
            L_0x0263:
                boolean r4 = r6.hasNext()
                if (r4 == 0) goto L_0x0290
                java.lang.Object r4 = r6.next()
                r7 = r4
                WA.e r7 = (WA.C13767e) r7
                r3.f117239c = r11
                r3.f117240d = r10
                r3.f117241e = r9
                r3.f117242f = r8
                r3.f117243g = r6
                r3.f117244h = r4
                r3.f117245i = r7
                r3.f117246j = r2
                r3.f117247k = r1
                r3.f117248l = r0
                r3.f117249m = r12
                r4 = 4
                r3.f117251o = r4
                java.lang.Object r7 = r11.i(r7, r3)
                if (r7 != r5) goto L_0x0263
                return r5
            L_0x0290:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: VA.C13741e.a.d(VA.e, java.util.List, dI.e):java.lang.Object");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: dI.e<? super XH.N>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x007f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Object e(VA.C13741e r6, java.lang.String r7, java.lang.String r8, dI.C17164e<? super XH.C16807N> r9) {
            /*
                boolean r0 = r9 instanceof VA.C13741e.a.f
                if (r0 == 0) goto L_0x0013
                r0 = r9
                VA.e$a$f r0 = (VA.C13741e.a.f) r0
                int r1 = r0.f117257h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f117257h = r1
                goto L_0x0018
            L_0x0013:
                VA.e$a$f r0 = new VA.e$a$f
                r0.<init>(r9)
            L_0x0018:
                java.lang.Object r1 = r0.f117256g
                java.lang.Object r2 = eI.C17187b.f()
                int r3 = r0.f117257h
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L_0x005b
                if (r3 == r5) goto L_0x0044
                if (r3 != r4) goto L_0x003c
                java.lang.Object r6 = r0.f117255f
                dI.e r6 = (dI.C17164e) r6
                java.lang.Object r6 = r0.f117254e
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r6 = r0.f117253d
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r6 = r0.f117252c
                VA.e r6 = (VA.C13741e) r6
                XH.y.b(r1)
                goto L_0x0080
            L_0x003c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0044:
                java.lang.Object r6 = r0.f117255f
                r9 = r6
                dI.e r9 = (dI.C17164e) r9
                java.lang.Object r6 = r0.f117254e
                r8 = r6
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r6 = r0.f117253d
                r7 = r6
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r6 = r0.f117252c
                VA.e r6 = (VA.C13741e) r6
                XH.y.b(r1)
                goto L_0x006f
            L_0x005b:
                XH.y.b(r1)
                r0.f117252c = r6
                r0.f117253d = r7
                r0.f117254e = r8
                r0.f117255f = r9
                r0.f117257h = r5
                java.lang.Object r1 = r6.l(r7, r8, r0)
                if (r1 != r2) goto L_0x006f
                return r2
            L_0x006f:
                r0.f117252c = r6
                r0.f117253d = r7
                r0.f117254e = r8
                r0.f117255f = r9
                r0.f117257h = r4
                java.lang.Object r6 = r6.o(r7, r8, r0)
                if (r6 != r2) goto L_0x0080
                return r2
            L_0x0080:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: VA.C13741e.a.e(VA.e, java.lang.String, java.lang.String, dI.e):java.lang.Object");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x03ff  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x0467  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x03d6 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0127  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x025f  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x02e1 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x02e2  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0301  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0320  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Object f(VA.C13741e r36, java.lang.String r37, java.util.List<WA.i> r38, dI.C17164e<? super XH.C16807N> r39) {
            /*
                r0 = r36
                r1 = r39
                boolean r2 = r1 instanceof VA.C13741e.a.g
                if (r2 == 0) goto L_0x0017
                r2 = r1
                VA.e$a$g r2 = (VA.C13741e.a.g) r2
                int r3 = r2.f117280y
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0017
                int r3 = r3 - r4
                r2.f117280y = r3
                goto L_0x001c
            L_0x0017:
                VA.e$a$g r2 = new VA.e$a$g
                r2.<init>(r1)
            L_0x001c:
                java.lang.Object r3 = r2.f117279x
                java.lang.Object r4 = eI.C17187b.f()
                int r5 = r2.f117280y
                java.lang.String r6 = "|"
                java.lang.String r7 = "b"
                java.lang.String r8 = "m"
                java.lang.String r9 = "main"
                java.lang.String r10 = "Kt"
                r13 = 3
                r14 = 2
                r15 = 1
                if (r5 == 0) goto L_0x0127
                if (r5 == r15) goto L_0x00ea
                if (r5 == r14) goto L_0x00ab
                if (r5 != r13) goto L_0x00a3
                int r0 = r2.f117278w
                int r1 = r2.f117277v
                int r5 = r2.f117276u
                int r6 = r2.f117274s
                java.lang.Object r7 = r2.f117273r
                java.lang.Object r8 = r2.f117272q
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r9 = r2.f117271p
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.lang.Object r10 = r2.f117270o
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r12 = r2.f117269n
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r14 = r2.f117268m
                qv.e r14 = (qv.e) r14
                java.lang.Object r15 = r2.f117267l
                WA.h r15 = (WA.h) r15
                java.lang.Object r15 = r2.f117265j
                java.util.Iterator r15 = (java.util.Iterator) r15
                java.lang.Object r13 = r2.f117264i
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                java.lang.Object r11 = r2.f117263h
                java.util.List r11 = (java.util.List) r11
                r16 = r0
                java.lang.Object r0 = r2.f117262g
                java.util.List r0 = (java.util.List) r0
                r36 = r0
                java.lang.Object r0 = r2.f117261f
                dI.e r0 = (dI.C17164e) r0
                r37 = r0
                java.lang.Object r0 = r2.f117260e
                java.util.List r0 = (java.util.List) r0
                r38 = r0
                java.lang.Object r0 = r2.f117259d
                java.lang.String r0 = (java.lang.String) r0
                r39 = r0
                java.lang.Object r0 = r2.f117258c
                VA.e r0 = (VA.C13741e) r0
                XH.y.b(r3)
                r22 = r36
                r18 = r1
                r1 = r4
                r4 = r12
                r3 = r14
                r17 = r16
                r12 = r9
                r14 = r10
                r16 = r11
                r11 = r38
                r10 = r7
                r9 = r8
                r7 = r5
                r8 = r6
                r5 = r37
                r6 = r2
                r2 = r13
                r13 = r39
                goto L_0x045e
            L_0x00a3:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x00ab:
                java.lang.Object r0 = r2.f117270o
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r2.f117269n
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r2.f117267l
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r2.f117266k
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Object r0 = r2.f117265j
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r2.f117264i
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r2.f117263h
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r1 = r2.f117262g
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r5 = r2.f117261f
                dI.e r5 = (dI.C17164e) r5
                java.lang.Object r11 = r2.f117260e
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r13 = r2.f117259d
                java.lang.String r13 = (java.lang.String) r13
                java.lang.Object r15 = r2.f117258c
                VA.e r15 = (VA.C13741e) r15
                XH.y.b(r3)
                r21 = r6
                r27 = r7
                r28 = r8
                r22 = r9
                r23 = r10
                goto L_0x02e8
            L_0x00ea:
                int r0 = r2.f117278w
                java.lang.Object r1 = r2.f117269n
                java.lang.Object r5 = r2.f117268m
                java.util.Iterator r5 = (java.util.Iterator) r5
                java.lang.Object r11 = r2.f117267l
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.lang.Object r13 = r2.f117266k
                java.lang.String r13 = (java.lang.String) r13
                java.lang.Object r13 = r2.f117265j
                java.lang.String r13 = (java.lang.String) r13
                java.lang.Object r15 = r2.f117264i
                qv.e r15 = (qv.e) r15
                java.lang.Object r15 = r2.f117263h
                VA.e r15 = (VA.C13741e) r15
                java.lang.Object r15 = r2.f117262g
                VA.e r15 = (VA.C13741e) r15
                java.lang.Object r15 = r2.f117261f
                dI.e r15 = (dI.C17164e) r15
                java.lang.Object r12 = r2.f117260e
                java.util.List r12 = (java.util.List) r12
                java.lang.Object r14 = r2.f117259d
                java.lang.String r14 = (java.lang.String) r14
                r36 = r0
                java.lang.Object r0 = r2.f117258c
                VA.e r0 = (VA.C13741e) r0
                XH.y.b(r3)
                r27 = r7
                r28 = r8
                r7 = r36
                goto L_0x023c
            L_0x0127:
                XH.y.b(r3)
                qv.e r3 = qv.e.DEBUG
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x013d:
                boolean r12 = r5.hasNext()
                if (r12 == 0) goto L_0x0155
                java.lang.Object r12 = r5.next()
                r13 = r12
                qv.b r13 = (qv.C11819b) r13
                r14 = 0
                boolean r13 = r13.b(r3, r14)
                if (r13 == 0) goto L_0x013d
                r11.add(r12)
                goto L_0x013d
            L_0x0155:
                java.util.Iterator r5 = r11.iterator()
                r14 = r11
                r12 = 0
                r13 = 0
            L_0x015c:
                boolean r15 = r5.hasNext()
                if (r15 == 0) goto L_0x01fe
                java.lang.Object r14 = r5.next()
                r21 = r14
                qv.b r21 = (qv.C11819b) r21
                if (r13 != 0) goto L_0x0193
                int r15 = r38.size()
                r27 = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r28 = r8
                java.lang.String r8 = "replaceShoppingListItems, nbr of items: "
                r7.append(r8)
                r7.append(r15)
                java.lang.String r7 = r7.toString()
                r8 = 0
                java.lang.String r7 = qv.C11818a.a(r7, r8)
                if (r7 != 0) goto L_0x018e
                goto L_0x0202
            L_0x018e:
                java.lang.String r13 = qv.C11820c.a(r7)
                goto L_0x0197
            L_0x0193:
                r27 = r7
                r28 = r8
            L_0x0197:
                if (r12 != 0) goto L_0x01e6
                java.lang.Class r7 = r36.getClass()
                java.lang.String r7 = r7.getName()
                kotlin.jvm.internal.C17542s.g(r7)
                r29 = r14
                r8 = 36
                r12 = 2
                r15 = 0
                java.lang.String r14 = HJ.C15854t.s1(r7, r8, r15, r12, r15)
                r8 = 46
                java.lang.String r14 = HJ.C15854t.o1(r14, r8, r15, r12, r15)
                int r8 = r14.length()
                if (r8 != 0) goto L_0x01bb
                goto L_0x01bf
            L_0x01bb:
                java.lang.String r7 = HJ.C15854t.P0(r14, r10)
            L_0x01bf:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                java.lang.String r8 = r8.getName()
                r12 = 1
                boolean r8 = HJ.C15854t.b0(r8, r9, r12)
                if (r8 == 0) goto L_0x01d1
                r8 = r28
                goto L_0x01d3
            L_0x01d1:
                r8 = r27
            L_0x01d3:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r8)
                r12.append(r6)
                r12.append(r7)
                java.lang.String r12 = r12.toString()
                goto L_0x01e8
            L_0x01e6:
                r29 = r14
            L_0x01e8:
                r24 = 0
                r22 = r3
                r23 = r12
                r7 = 0
                r25 = r7
                r26 = r13
                r21.a(r22, r23, r24, r25, r26)
                r7 = r27
                r8 = r28
                r14 = r29
                goto L_0x015c
            L_0x01fe:
                r27 = r7
                r28 = r8
            L_0x0202:
                TJ.g r7 = r36.h(r37)
                r2.f117258c = r0
                r8 = r37
                r2.f117259d = r8
                r15 = r38
                r2.f117260e = r15
                r2.f117261f = r1
                r2.f117262g = r0
                r2.f117263h = r0
                r2.f117264i = r3
                r2.f117265j = r13
                r2.f117266k = r12
                r2.f117267l = r11
                r2.f117268m = r5
                r2.f117269n = r14
                r3 = 0
                r2.f117274s = r3
                r2.f117275t = r3
                r2.f117276u = r3
                r2.f117277v = r3
                r2.f117278w = r3
                r3 = 1
                r2.f117280y = r3
                java.lang.Object r3 = TJ.C16534i.B(r7, r2)
                if (r3 != r4) goto L_0x0237
                return r4
            L_0x0237:
                r12 = r15
                r7 = 0
                r15 = r1
                r1 = r14
                r14 = r8
            L_0x023c:
                java.util.List r3 = (java.util.List) r3
                r8 = r3
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                r36 = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r37 = r5
                java.util.Iterator r5 = r8.iterator()
                r21 = r6
                r22 = r9
                r6 = r13
                r9 = r7
                r13 = r11
                r7 = r36
                r11 = r37
            L_0x0259:
                boolean r23 = r5.hasNext()
                if (r23 == 0) goto L_0x02b3
                java.lang.Object r6 = r5.next()
                r9 = r6
                WA.h r9 = (WA.h) r9
                r13 = r12
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                r23 = r10
                boolean r10 = r13 instanceof java.util.Collection
                if (r10 == 0) goto L_0x027a
                r10 = r13
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r10 = r10.isEmpty()
                if (r10 == 0) goto L_0x027a
            L_0x0278:
                r10 = 1
                goto L_0x02a9
            L_0x027a:
                java.util.Iterator r10 = r13.iterator()
            L_0x027e:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x02a7
                java.lang.Object r7 = r10.next()
                r11 = r7
                WA.i r11 = (WA.i) r11
                WA.h r11 = r11.b()
                java.lang.String r11 = r11.b()
                r36 = r7
                java.lang.String r7 = r9.b()
                boolean r7 = kotlin.jvm.internal.C17542s.e(r11, r7)
                if (r7 == 0) goto L_0x02a4
                r7 = r36
                r11 = r10
                r10 = 0
                goto L_0x02a9
            L_0x02a4:
                r7 = r36
                goto L_0x027e
            L_0x02a7:
                r11 = r10
                goto L_0x0278
            L_0x02a9:
                if (r10 == 0) goto L_0x02ae
                r1.add(r6)
            L_0x02ae:
                r6 = r9
                r10 = r23
                r9 = 0
                goto L_0x0259
            L_0x02b3:
                r23 = r10
                r2.f117258c = r0
                r2.f117259d = r14
                r2.f117260e = r12
                r2.f117261f = r15
                r2.f117262g = r3
                r2.f117263h = r1
                r2.f117264i = r8
                r2.f117265j = r8
                r2.f117266k = r1
                r2.f117267l = r5
                r2.f117268m = r6
                r2.f117269n = r13
                r2.f117270o = r11
                r2.f117271p = r7
                r5 = 0
                r2.f117274s = r5
                r2.f117275t = r5
                r2.f117276u = r9
                r5 = 2
                r2.f117280y = r5
                java.lang.Object r5 = r0.e(r12, r2)
                if (r5 != r4) goto L_0x02e2
                return r4
            L_0x02e2:
                r11 = r12
                r13 = r14
                r5 = r15
                r15 = r0
                r0 = r1
                r1 = r3
            L_0x02e8:
                qv.e r3 = qv.e.DEBUG
                qv.d r6 = qv.d.f102012a
                java.util.List r6 = r6.a()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x02fb:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x0313
                java.lang.Object r8 = r6.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                r10 = 0
                boolean r9 = r9.b(r3, r10)
                if (r9 == 0) goto L_0x02fb
                r7.add(r8)
                goto L_0x02fb
            L_0x0313:
                java.util.Iterator r6 = r7.iterator()
                r10 = r7
                r8 = 0
                r9 = 0
            L_0x031a:
                boolean r12 = r6.hasNext()
                if (r12 == 0) goto L_0x03d6
                java.lang.Object r10 = r6.next()
                r29 = r10
                qv.b r29 = (qv.C11819b) r29
                if (r8 != 0) goto L_0x0352
                int r14 = r0.size()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r37 = r1
                java.lang.String r1 = "replaceShoppingListItems, local items to remove: "
                r12.append(r1)
                r12.append(r14)
                java.lang.String r1 = r12.toString()
                r12 = 0
                java.lang.String r1 = qv.C11818a.a(r1, r12)
                if (r1 != 0) goto L_0x034c
            L_0x0348:
                r17 = r2
                goto L_0x03da
            L_0x034c:
                java.lang.String r1 = qv.C11820c.a(r1)
                r8 = r1
                goto L_0x0354
            L_0x0352:
                r37 = r1
            L_0x0354:
                if (r9 != 0) goto L_0x03b2
                java.lang.Class r1 = r15.getClass()
                java.lang.String r1 = r1.getName()
                kotlin.jvm.internal.C17542s.g(r1)
                r17 = r2
                r9 = 0
                r12 = 36
                r14 = 2
                java.lang.String r2 = HJ.C15854t.s1(r1, r12, r9, r14, r9)
                r12 = 46
                java.lang.String r2 = HJ.C15854t.o1(r2, r12, r9, r14, r9)
                int r16 = r2.length()
                if (r16 != 0) goto L_0x037b
                r2 = r1
                r1 = r23
                goto L_0x0381
            L_0x037b:
                r1 = r23
                java.lang.String r2 = HJ.C15854t.P0(r2, r1)
            L_0x0381:
                java.lang.Thread r16 = java.lang.Thread.currentThread()
                java.lang.String r9 = r16.getName()
                r12 = r22
                r14 = 1
                boolean r9 = HJ.C15854t.b0(r9, r12, r14)
                if (r9 == 0) goto L_0x0395
                r9 = r28
                goto L_0x0397
            L_0x0395:
                r9 = r27
            L_0x0397:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r9)
                r9 = r21
                r14.append(r9)
                r14.append(r2)
                java.lang.String r2 = r14.toString()
                r14 = 0
                r35 = r9
                r9 = r2
                r2 = r35
                goto L_0x03bb
            L_0x03b2:
                r17 = r2
                r2 = r21
                r12 = r22
                r1 = r23
                r14 = 0
            L_0x03bb:
                r32 = 0
                r30 = r3
                r31 = r9
                r20 = 0
                r33 = r20
                r34 = r8
                r29.a(r30, r31, r32, r33, r34)
                r23 = r1
                r21 = r2
                r22 = r12
                r2 = r17
                r1 = r37
                goto L_0x031a
            L_0x03d6:
                r37 = r1
                goto L_0x0348
            L_0x03da:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r2 = r1.iterator()
                r36 = r2
                r16 = r4
                r12 = r7
                r4 = r8
                r14 = r9
                r7 = 0
                r8 = 0
                r18 = 0
                r2 = r1
                r9 = r6
                r6 = r17
                r17 = 0
                r1 = r37
                r35 = r15
                r15 = r0
                r0 = r35
            L_0x03f9:
                boolean r19 = r36.hasNext()
                if (r19 == 0) goto L_0x0467
                r19 = r7
                java.lang.Object r7 = r36.next()
                r20 = r8
                r8 = r7
                WA.h r8 = (WA.h) r8
                r21 = r10
                java.lang.String r10 = r8.b()
                r6.f117258c = r0
                r6.f117259d = r13
                r6.f117260e = r11
                r6.f117261f = r5
                r6.f117262g = r1
                r6.f117263h = r15
                r6.f117264i = r2
                r22 = r1
                r1 = r36
                r6.f117265j = r1
                r6.f117266k = r7
                r6.f117267l = r8
                r6.f117268m = r3
                r6.f117269n = r4
                r6.f117270o = r14
                r6.f117271p = r12
                r6.f117272q = r9
                r7 = r21
                r6.f117273r = r7
                r8 = r20
                r6.f117274s = r8
                r20 = r1
                r1 = 0
                r6.f117275t = r1
                r1 = r19
                r6.f117276u = r1
                r1 = r18
                r6.f117277v = r1
                r1 = r17
                r6.f117278w = r1
                r1 = 3
                r6.f117280y = r1
                java.lang.Object r10 = r0.l(r10, r13, r6)
                r1 = r16
                if (r10 != r1) goto L_0x0457
                return r1
            L_0x0457:
                r10 = r7
                r16 = r15
                r7 = r19
                r15 = r20
            L_0x045e:
                r36 = r15
                r15 = r16
                r16 = r1
                r1 = r22
                goto L_0x03f9
            L_0x0467:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: VA.C13741e.a.f(VA.e, java.lang.String, java.util.List, dI.e):java.lang.Object");
        }
    }

    C16532g<h> b(String str, String str2);

    C16532g<List<C13764b>> c(String str, String str2);

    C16532g<List<j>> d(String str);

    Object e(List<i> list, C17164e<? super C16807N> eVar);

    C16532g<List<i>> f(String str);

    Object g(C13764b bVar, C17164e<? super C16807N> eVar);

    C16532g<List<h>> h(String str);

    Object i(C13767e eVar, C17164e<? super C16807N> eVar2);

    Object j(String str, C17164e<? super C16807N> eVar);

    Object k(h hVar, C17164e<? super C16807N> eVar);

    Object l(String str, String str2, C17164e<? super C16807N> eVar);

    Object m(String str, List<i> list, C17164e<? super C16807N> eVar);

    Object n(String str, int i10, String str2, C17164e<? super C16807N> eVar);

    Object o(String str, String str2, C17164e<? super C16807N> eVar);

    C16532g<List<C13765c>> p(String str, String str2);

    Object q(C13763a aVar, C17164e<? super C16807N> eVar);

    Object r(String str, String str2, C17164e<? super C13763a> eVar);

    Object s(int i10, C17164e<? super List<h>> eVar);

    C16532g<List<String>> t();

    C16532g<Integer> u(String str);

    Object v(String str, String str2, C17164e<? super C16807N> eVar);

    Object w(List<h> list, C17164e<? super C16807N> eVar);
}
