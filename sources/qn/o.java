package qn;

import HJ.C15854t;
import XH.v;
import YH.C16877v;
import YH.X;
import com.google.android.libraries.places.api.model.PlaceTypes;
import dI.C17164e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import pn.C11763c;
import rn.C11834a;
import un.C12068a;
import un.c;
import un.e;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJd\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0013H@¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001e\u001a\u00020\u001d*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\u001d*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b \u0010!J)\u0010\"\u001a\u00020\u001d*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0&0%2\u0006\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010(J`\u0010+\u001a\u00020*2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H@¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lqn/o;", "Lpn/c;", "Lrn/a;", "plpDetailsEndpoint", "LGo/a;", "clientIdentityProvider", "LMg/b;", "localHistoryRepository", "<init>", "(Lrn/a;LGo/a;LMg/b;)V", "", "id", "type", "Lun/e;", "paginationParams", "Lun/c;", "filterParams", "Lun/a;", "availabilityParams", "", "isSerpEnabled", "includeLocalHistory", "includedItemNos", "useIdAsGroupParameter", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/PlpDetailResponseV6;", "h", "(Ljava/lang/String;Ljava/lang/String;Lun/e;Lun/c;Lun/a;ZZLjava/lang/String;ZLdI/e;)Ljava/lang/Object;", "", "", "LXH/N;", "f", "(Ljava/util/Map;Lun/e;)V", "e", "(Ljava/util/Map;Lun/c;)V", "d", "(Ljava/util/Map;Lun/a;)V", "filterString", "", "LXH/v;", "g", "(Ljava/lang/String;)Ljava/util/List;", "isSerpShelvesSubcategory", "Lun/b;", "a", "(Ljava/lang/String;Ljava/lang/String;ZLun/e;Lun/c;Lun/a;Ljava/lang/String;ZZLdI/e;)Ljava/lang/Object;", "Lrn/a;", "b", "LGo/a;", "c", "LMg/b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements C11763c {

    /* renamed from: a  reason: collision with root package name */
    private final C11834a f101840a;

    /* renamed from: b  reason: collision with root package name */
    private final Go.a f101841b;

    /* renamed from: c  reason: collision with root package name */
    private final Mg.b f101842c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.PlpRepositoryImpl", f = "PlpRepositoryImpl.kt", l = {54}, m = "getPlpDetails")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f101843c;

        /* renamed from: d  reason: collision with root package name */
        Object f101844d;

        /* renamed from: e  reason: collision with root package name */
        Object f101845e;

        /* renamed from: f  reason: collision with root package name */
        Object f101846f;

        /* renamed from: g  reason: collision with root package name */
        Object f101847g;

        /* renamed from: h  reason: collision with root package name */
        Object f101848h;

        /* renamed from: i  reason: collision with root package name */
        Object f101849i;

        /* renamed from: j  reason: collision with root package name */
        Object f101850j;

        /* renamed from: k  reason: collision with root package name */
        boolean f101851k;

        /* renamed from: l  reason: collision with root package name */
        boolean f101852l;

        /* renamed from: m  reason: collision with root package name */
        boolean f101853m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f101854n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ o f101855o;

        /* renamed from: p  reason: collision with root package name */
        int f101856p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f101855o = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f101854n = obj;
            this.f101856p |= Integer.MIN_VALUE;
            return this.f101855o.a((String) null, (String) null, false, (e) null, (c) null, (C12068a) null, (String) null, false, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.PlpRepositoryImpl", f = "PlpRepositoryImpl.kt", l = {91, 100, 107}, m = "getPlpDetailsResponse")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f101857c;

        /* renamed from: d  reason: collision with root package name */
        Object f101858d;

        /* renamed from: e  reason: collision with root package name */
        Object f101859e;

        /* renamed from: f  reason: collision with root package name */
        Object f101860f;

        /* renamed from: g  reason: collision with root package name */
        Object f101861g;

        /* renamed from: h  reason: collision with root package name */
        Object f101862h;

        /* renamed from: i  reason: collision with root package name */
        Object f101863i;

        /* renamed from: j  reason: collision with root package name */
        Object f101864j;

        /* renamed from: k  reason: collision with root package name */
        Object f101865k;

        /* renamed from: l  reason: collision with root package name */
        Object f101866l;

        /* renamed from: m  reason: collision with root package name */
        Object f101867m;

        /* renamed from: n  reason: collision with root package name */
        boolean f101868n;

        /* renamed from: o  reason: collision with root package name */
        boolean f101869o;

        /* renamed from: p  reason: collision with root package name */
        boolean f101870p;

        /* renamed from: q  reason: collision with root package name */
        int f101871q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f101872r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ o f101873s;

        /* renamed from: t  reason: collision with root package name */
        int f101874t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(o oVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f101873s = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f101872r = obj;
            this.f101874t |= Integer.MIN_VALUE;
            return this.f101873s.h((String) null, (String) null, (e) null, (c) null, (C12068a) null, false, false, (String) null, false, this);
        }
    }

    public o(C11834a aVar, Go.a aVar2, Mg.b bVar) {
        C17542s.j(aVar, "plpDetailsEndpoint");
        C17542s.j(aVar2, "clientIdentityProvider");
        C17542s.j(bVar, "localHistoryRepository");
        this.f101840a = aVar;
        this.f101841b = aVar2;
        this.f101842c = bVar;
    }

    private final void d(Map<String, Object> map, C12068a aVar) {
        String a10;
        String b10;
        if (aVar != null) {
            String b11 = aVar.b();
            if (b11 != null) {
                map.put(PlaceTypes.STORE, b11);
            }
            C12068a.C2469a a11 = aVar.a();
            if (!(a11 == null || (b10 = a11.b()) == null)) {
                map.put("zip", b10);
            }
            C12068a.C2469a a12 = aVar.a();
            if (a12 != null && (a10 = a12.a()) != null) {
                map.put("areaCode", a10);
            }
        }
    }

    private final void e(Map<String, Object> map, c cVar) {
        if (cVar != null) {
            String b10 = cVar.b();
            if (b10 != null) {
                map.put("sort", b10);
            }
            String a10 = cVar.a();
            if (a10 != null) {
                X.t(map, g(a10));
            }
        }
    }

    private final void f(Map<String, Object> map, e eVar) {
        if (eVar != null) {
            Integer d10 = eVar.d();
            if (d10 != null) {
                map.put("start", String.valueOf(d10.intValue()));
            }
            Integer a10 = eVar.a();
            if (a10 != null) {
                map.put("end", String.valueOf(a10.intValue()));
            }
            String b10 = eVar.b();
            if (b10 != null) {
                map.put("token", b10);
            }
            Integer c10 = eVar.c();
            if (c10 != null) {
                map.put("size", String.valueOf(c10.intValue()));
            }
        }
    }

    private final List<v<String, String>> g(String str) {
        if (str.length() == 0) {
            return C16877v.n();
        }
        Iterable<String> Y02 = C15854t.Y0(str, new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(C16877v.y(Y02, 10));
        for (String X02 : Y02) {
            List X03 = C15854t.X0(X02, new char[]{'='}, false, 0, 6, (Object) null);
            arrayList.add(new v(X03.get(0), X03.get(1)));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r30, java.lang.String r31, un.e r32, un.c r33, un.C12068a r34, boolean r35, boolean r36, java.lang.String r37, boolean r38, dI.C17164e<? super com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.PlpDetailResponseV6> r39) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            boolean r10 = r9 instanceof qn.o.b
            if (r10 == 0) goto L_0x0027
            r10 = r9
            qn.o$b r10 = (qn.o.b) r10
            int r11 = r10.f101874t
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r11 & r12
            if (r13 == 0) goto L_0x0027
            int r11 = r11 - r12
            r10.f101874t = r11
            goto L_0x002c
        L_0x0027:
            qn.o$b r10 = new qn.o$b
            r10.<init>(r0, r9)
        L_0x002c:
            java.lang.Object r11 = r10.f101872r
            java.lang.Object r12 = eI.C17187b.f()
            int r13 = r10.f101874t
            r15 = 2
            r14 = 1
            if (r13 == 0) goto L_0x00f4
            if (r13 == r14) goto L_0x00a9
            if (r13 == r15) goto L_0x0078
            r1 = 3
            if (r13 != r1) goto L_0x0070
            java.lang.Object r1 = r10.f101867m
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r10.f101866l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f101865k
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r10.f101864j
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r10.f101863i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f101862h
            un.a r1 = (un.C12068a) r1
            java.lang.Object r1 = r10.f101861g
            un.c r1 = (un.c) r1
            java.lang.Object r1 = r10.f101860f
            un.e r1 = (un.e) r1
            java.lang.Object r1 = r10.f101859e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f101858d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f101857c
            qn.o r1 = (qn.o) r1
            XH.y.b(r11)
            goto L_0x0248
        L_0x0070:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0078:
            java.lang.Object r1 = r10.f101867m
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r10.f101866l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f101865k
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r10.f101864j
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r10.f101863i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f101862h
            un.a r1 = (un.C12068a) r1
            java.lang.Object r1 = r10.f101861g
            un.c r1 = (un.c) r1
            java.lang.Object r1 = r10.f101860f
            un.e r1 = (un.e) r1
            java.lang.Object r1 = r10.f101859e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f101858d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.f101857c
            qn.o r1 = (qn.o) r1
            XH.y.b(r11)
            goto L_0x0205
        L_0x00a9:
            int r1 = r10.f101871q
            boolean r2 = r10.f101870p
            boolean r3 = r10.f101869o
            boolean r4 = r10.f101868n
            java.lang.Object r5 = r10.f101866l
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r10.f101865k
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r10.f101864j
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r8 = r10.f101863i
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r10.f101862h
            un.a r9 = (un.C12068a) r9
            java.lang.Object r13 = r10.f101861g
            un.c r13 = (un.c) r13
            java.lang.Object r14 = r10.f101860f
            un.e r14 = (un.e) r14
            java.lang.Object r15 = r10.f101859e
            java.lang.String r15 = (java.lang.String) r15
            r30 = r1
            java.lang.Object r1 = r10.f101858d
            java.lang.String r1 = (java.lang.String) r1
            r31 = r1
            java.lang.Object r1 = r10.f101857c
            qn.o r1 = (qn.o) r1
            XH.y.b(r11)
            r19 = r30
            r18 = r11
            r11 = r5
            r5 = r4
            r4 = r1
            r1 = r31
            r28 = r8
            r8 = r2
            r2 = r14
            r14 = r15
            r15 = r6
            r6 = r3
            r3 = r7
            r7 = r28
            goto L_0x0155
        L_0x00f4:
            XH.y.b(r11)
            java.util.Map r11 = YH.X.c()
            if (r8 == 0) goto L_0x0102
            java.lang.String r13 = "group"
            r11.put(r13, r1)
        L_0x0102:
            r0.f(r11, r2)
            r0.e(r11, r3)
            r0.d(r11, r4)
            if (r7 == 0) goto L_0x0112
            java.lang.String r13 = "includingProducts"
            r11.put(r13, r7)
        L_0x0112:
            if (r5 == 0) goto L_0x011d
            java.lang.String r13 = "serp"
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.b.a(r14)
            r11.put(r13, r15)
        L_0x011d:
            r13 = 0
            if (r6 == 0) goto L_0x01a6
            Mg.b r15 = r0.f101842c
            r10.f101857c = r0
            r10.f101858d = r1
            r14 = r31
            r10.f101859e = r14
            r10.f101860f = r2
            r10.f101861g = r3
            r10.f101862h = r4
            r10.f101863i = r7
            r10.f101864j = r9
            r10.f101865k = r11
            r10.f101866l = r11
            r10.f101868n = r5
            r10.f101869o = r6
            r10.f101870p = r8
            r10.f101871q = r13
            r13 = 1
            r10.f101874t = r13
            r13 = 200(0xc8, float:2.8E-43)
            java.lang.Object r13 = r15.g(r13, r10)
            if (r13 != r12) goto L_0x014c
            return r12
        L_0x014c:
            r15 = r11
            r18 = r13
            r19 = 0
            r13 = r3
            r3 = r9
            r9 = r4
            r4 = r0
        L_0x0155:
            r20 = r18
            java.util.List r20 = (java.util.List) r20
            java.util.Collection r20 = (java.util.Collection) r20
            boolean r20 = r20.isEmpty()
            if (r20 != 0) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            r18 = 0
        L_0x0164:
            java.util.List r18 = (java.util.List) r18
            if (r18 == 0) goto L_0x019d
            java.lang.Iterable r18 = (java.lang.Iterable) r18
            qn.n r20 = new qn.n
            r20.<init>()
            r21 = 30
            r22 = 0
            java.lang.String r23 = ","
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = r18
            r31 = r23
            r32 = r24
            r33 = r25
            r34 = r26
            r35 = r27
            r36 = r20
            r37 = r21
            r38 = r22
            java.lang.String r0 = YH.C16877v.G0(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            if (r0 == 0) goto L_0x019d
            r30 = r1
            java.lang.String r1 = "recentlyViewedProducts"
            r11.put(r1, r0)
            goto L_0x019f
        L_0x019d:
            r30 = r1
        L_0x019f:
            r1 = r30
            r0 = r11
            r11 = r15
            r15 = r19
            goto L_0x01af
        L_0x01a6:
            r14 = r31
            r13 = r3
            r3 = r9
            r0 = r11
            r15 = 0
            r9 = r4
            r4 = r29
        L_0x01af:
            java.util.Map r11 = YH.X.b(r11)
            if (r8 == 0) goto L_0x01c0
            java.lang.String r18 = ""
            r19 = r15
            r28 = r18
            r18 = r12
            r12 = r28
            goto L_0x01c5
        L_0x01c0:
            r18 = r12
            r19 = r15
            r12 = r1
        L_0x01c5:
            java.lang.String r15 = "user-recommendations"
            boolean r15 = kotlin.jvm.internal.C17542s.e(r14, r15)
            if (r15 == 0) goto L_0x0206
            rn.a r15 = r4.f101840a
            r16 = r15
            Go.a r15 = r4.f101841b
            java.lang.String r15 = r15.c()
            r10.f101857c = r4
            r10.f101858d = r1
            r10.f101859e = r14
            r10.f101860f = r2
            r10.f101861g = r13
            r10.f101862h = r9
            r10.f101863i = r7
            r10.f101864j = r3
            r10.f101865k = r11
            r10.f101866l = r12
            r10.f101867m = r0
            r10.f101868n = r5
            r10.f101869o = r6
            r10.f101870p = r8
            r0 = r19
            r10.f101871q = r0
            r0 = 2
            r10.f101874t = r0
            r0 = r16
            java.lang.Object r11 = r0.b(r12, r11, r15, r10)
            r15 = r18
            if (r11 != r15) goto L_0x0205
            return r15
        L_0x0205:
            return r11
        L_0x0206:
            rn.a r15 = r4.f101840a
            r17 = r15
            Go.a r15 = r4.f101841b
            java.lang.String r15 = r15.c()
            r10.f101857c = r4
            r10.f101858d = r1
            r10.f101859e = r14
            r10.f101860f = r2
            r10.f101861g = r13
            r10.f101862h = r9
            r10.f101863i = r7
            r10.f101864j = r3
            r10.f101865k = r11
            r10.f101866l = r12
            r10.f101867m = r0
            r10.f101868n = r5
            r10.f101869o = r6
            r10.f101870p = r8
            r0 = r19
            r10.f101871q = r0
            r0 = 3
            r10.f101874t = r0
            r30 = r17
            r31 = r14
            r32 = r12
            r33 = r11
            r34 = r15
            r35 = r10
            java.lang.Object r11 = r30.a(r31, r32, r33, r34, r35)
            r0 = r18
            if (r11 != r0) goto L_0x0248
            return r0
        L_0x0248:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.o.h(java.lang.String, java.lang.String, un.e, un.c, un.a, boolean, boolean, java.lang.String, boolean, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final CharSequence i(Pg.a aVar) {
        C17542s.j(aVar, "it");
        return aVar.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r15, java.lang.String r16, boolean r17, un.e r18, un.c r19, un.C12068a r20, java.lang.String r21, boolean r22, boolean r23, dI.C17164e<? super un.b> r24) {
        /*
            r14 = this;
            r11 = r14
            r0 = r24
            boolean r1 = r0 instanceof qn.o.a
            if (r1 == 0) goto L_0x0017
            r1 = r0
            qn.o$a r1 = (qn.o.a) r1
            int r2 = r1.f101856p
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f101856p = r2
        L_0x0015:
            r10 = r1
            goto L_0x001d
        L_0x0017:
            qn.o$a r1 = new qn.o$a
            r1.<init>(r14, r0)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r1 = r10.f101854n
            java.lang.Object r12 = eI.C17187b.f()
            int r2 = r10.f101856p
            r3 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 != r3) goto L_0x004e
            java.lang.Object r0 = r10.f101850j
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r10.f101849i
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r10.f101848h
            un.a r0 = (un.C12068a) r0
            java.lang.Object r0 = r10.f101847g
            un.c r0 = (un.c) r0
            java.lang.Object r0 = r10.f101846f
            un.e r0 = (un.e) r0
            java.lang.Object r0 = r10.f101845e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r10.f101844d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r10.f101843c
            qn.o r0 = (qn.o) r0
            XH.y.b(r1)
            goto L_0x0092
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0056:
            XH.y.b(r1)
            r10.f101843c = r11
            r1 = r15
            r10.f101844d = r1
            r2 = r16
            r10.f101845e = r2
            r4 = r18
            r10.f101846f = r4
            r5 = r19
            r10.f101847g = r5
            r6 = r20
            r10.f101848h = r6
            r8 = r21
            r10.f101849i = r8
            r10.f101850j = r0
            r0 = r17
            r10.f101851k = r0
            r9 = r22
            r10.f101852l = r9
            r7 = r23
            r10.f101853m = r7
            r10.f101856p = r3
            r13 = 0
            r0 = r14
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r13
            java.lang.Object r1 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r12) goto L_0x0092
            return r12
        L_0x0092:
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.PlpDetailResponseV6 r1 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.PlpDetailResponseV6) r1
            un.b r0 = r1.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.o.a(java.lang.String, java.lang.String, boolean, un.e, un.c, un.a, java.lang.String, boolean, boolean, dI.e):java.lang.Object");
    }
}
