package Vk;

import QL.x;
import VL.C16704f;
import VL.s;
import YH.C16877v;
import com.ingka.ikea.app.stockinfo.network.StockModelRemote;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tw.h;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00072\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000f\u001a\u00020\u0007H@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"LVk/f;", "LVk/e;", "Ltw/h;", "networkService", "<init>", "(Ltw/h;)V", "", "", "itemNos", "c", "(Ljava/util/List;)Ljava/lang/String;", "storeId", "Lcom/ingka/ikea/app/stockinfo/local/StockModel;", "a", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "itemNo", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ltw/h;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f88668b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h f88669a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LVk/f$a;", "", "<init>", "()V", "", "MULTIPLE_PRODUCTS_DELIMITER", "Ljava/lang/String;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVk/f$b;", "", "", "itemNo", "LQL/x;", "", "Lcom/ingka/ikea/app/stockinfo/network/StockModelRemote;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "storeId", "itemNos", "b", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        @C16704f("range/v6/{cc}/{lc}/browse/availability/product/{itemNo}")
        Object a(@s("itemNo") String str, C17164e<? super x<List<StockModelRemote>>> eVar);

        @C16704f("range/v6/{cc}/{lc}/browse/availability/store/{storeId}/{itemNos}")
        Object b(@s("storeId") String str, @s("itemNos") String str2, C17164e<? super List<StockModelRemote>> eVar);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.network.StockInfoRemoteDataSourceImpl", f = "StockInfoRemoteDataSourceImpl.kt", l = {61}, m = "getProductStockInfo")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f88670c;

        /* renamed from: d  reason: collision with root package name */
        Object f88671d;

        /* renamed from: e  reason: collision with root package name */
        Object f88672e;

        /* renamed from: f  reason: collision with root package name */
        Object f88673f;

        /* renamed from: g  reason: collision with root package name */
        Object f88674g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f88675h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ f f88676i;

        /* renamed from: j  reason: collision with root package name */
        int f88677j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f88676i = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f88675h = obj;
            this.f88677j |= Integer.MIN_VALUE;
            return this.f88676i.a((String) null, (List<String>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.network.StockInfoRemoteDataSourceImpl", f = "StockInfoRemoteDataSourceImpl.kt", l = {72}, m = "getProductStockInfoForAllStores")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f88678c;

        /* renamed from: d  reason: collision with root package name */
        Object f88679d;

        /* renamed from: e  reason: collision with root package name */
        Object f88680e;

        /* renamed from: f  reason: collision with root package name */
        Object f88681f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f88682g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f88683h;

        /* renamed from: i  reason: collision with root package name */
        int f88684i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f88683h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f88682g = obj;
            this.f88684i |= Integer.MIN_VALUE;
            return this.f88683h.b((String) null, this);
        }
    }

    public f(h hVar) {
        C17542s.j(hVar, "networkService");
        this.f88669a = hVar;
    }

    private final String c(List<String> list) {
        int i10 = 0;
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object next : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            String str = (String) next;
            if (i10 == list.size()) {
                sb2.append(str);
            } else {
                sb2.append(str);
                sb2.append(",");
            }
            i10 = i11;
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return sb3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r12, java.util.List<java.lang.String> r13, dI.C17164e<? super java.util.List<com.ingka.ikea.app.stockinfo.local.StockModel>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof Vk.f.c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            Vk.f$c r0 = (Vk.f.c) r0
            int r1 = r0.f88677j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f88677j = r1
            goto L_0x0018
        L_0x0013:
            Vk.f$c r0 = new Vk.f$c
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f88675h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f88677j
            r4 = 1
            if (r3 == 0) goto L_0x0046
            if (r3 != r4) goto L_0x003e
            java.lang.Object r12 = r0.f88674g
            Vk.f$b r12 = (Vk.f.b) r12
            java.lang.Object r12 = r0.f88673f
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f88672e
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r0.f88671d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f88670c
            Vk.f r12 = (Vk.f) r12
            XH.y.b(r1)
            goto L_0x0121
        L_0x003e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0046:
            XH.y.b(r1)
            int r1 = r12.length()
            if (r1 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L_0x0100
        L_0x0056:
            qv.e r12 = qv.e.WARN
            qv.d r13 = qv.d.f102012a
            java.util.List r13 = r13.a()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0069:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r13.next()
            r1 = r0
            qv.b r1 = (qv.C11819b) r1
            r2 = 0
            boolean r1 = r1.b(r12, r2)
            if (r1 == 0) goto L_0x0069
            r14.add(r0)
            goto L_0x0069
        L_0x0081:
            java.util.Iterator r13 = r14.iterator()
            r14 = 0
            r0 = r14
            r1 = r0
        L_0x0088:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = r13.next()
            r5 = r2
            qv.b r5 = (qv.C11819b) r5
            r9 = 0
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "Unable request stock store or products are not there."
            java.lang.String r0 = qv.C11818a.a(r0, r9)
            if (r0 != 0) goto L_0x00a1
            goto L_0x00fb
        L_0x00a1:
            java.lang.String r0 = qv.C11820c.a(r0)
        L_0x00a5:
            if (r1 != 0) goto L_0x00f3
            java.lang.Class<Vk.f> r1 = Vk.f.class
            java.lang.String r1 = r1.getName()
            kotlin.jvm.internal.C17542s.g(r1)
            r2 = 36
            r3 = 2
            java.lang.String r2 = HJ.C15854t.s1(r1, r2, r14, r3, r14)
            r6 = 46
            java.lang.String r2 = HJ.C15854t.o1(r2, r6, r14, r3, r14)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x00c4
            goto L_0x00ca
        L_0x00c4:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r2, r1)
        L_0x00ca:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "main"
            boolean r2 = HJ.C15854t.b0(r2, r3, r4)
            if (r2 == 0) goto L_0x00dd
            java.lang.String r2 = "m"
            goto L_0x00df
        L_0x00dd:
            java.lang.String r2 = "b"
        L_0x00df:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "|"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x00f3:
            r8 = 0
            r6 = r12
            r7 = r1
            r10 = r0
            r5.a(r6, r7, r8, r9, r10)
            goto L_0x0088
        L_0x00fb:
            java.util.List r12 = YH.C16877v.n()
            return r12
        L_0x0100:
            tw.h r1 = r11.f88669a
            java.lang.Class<Vk.f$b> r3 = Vk.f.b.class
            java.lang.Object r1 = r1.b(r3)
            Vk.f$b r1 = (Vk.f.b) r1
            java.lang.String r3 = r11.c(r13)
            r0.f88670c = r11
            r0.f88671d = r12
            r0.f88672e = r13
            r0.f88673f = r14
            r0.f88674g = r1
            r0.f88677j = r4
            java.lang.Object r1 = r1.b(r12, r3, r0)
            if (r1 != r2) goto L_0x0121
            return r2
        L_0x0121:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r1.iterator()
        L_0x012c:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0142
            java.lang.Object r14 = r13.next()
            com.ingka.ikea.app.stockinfo.network.StockModelRemote r14 = (com.ingka.ikea.app.stockinfo.network.StockModelRemote) r14
            com.ingka.ikea.app.stockinfo.local.StockModel r14 = r14.b()
            if (r14 == 0) goto L_0x012c
            r12.add(r14)
            goto L_0x012c
        L_0x0142:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Vk.f.a(java.lang.String, java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r13, dI.C17164e<? super java.util.List<com.ingka.ikea.app.stockinfo.local.StockModel>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof Vk.f.d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            Vk.f$d r0 = (Vk.f.d) r0
            int r1 = r0.f88684i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f88684i = r1
            goto L_0x0018
        L_0x0013:
            Vk.f$d r0 = new Vk.f$d
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f88682g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f88684i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r13 = r0.f88681f
            Vk.f$b r13 = (Vk.f.b) r13
            java.lang.Object r13 = r0.f88680e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f88679d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f88678c
            Vk.f r13 = (Vk.f) r13
            XH.y.b(r1)
            goto L_0x0060
        L_0x0039:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0041:
            XH.y.b(r1)
            tw.h r1 = r12.f88669a
            java.lang.Class<Vk.f$b> r3 = Vk.f.b.class
            java.lang.Object r1 = r1.b(r3)
            Vk.f$b r1 = (Vk.f.b) r1
            r0.f88678c = r12
            r0.f88679d = r13
            r0.f88680e = r14
            r0.f88681f = r1
            r0.f88684i = r4
            java.lang.Object r1 = r1.a(r13, r0)
            if (r1 != r2) goto L_0x005f
            return r2
        L_0x005f:
            r13 = r12
        L_0x0060:
            QL.x r1 = (QL.x) r1
            boolean r14 = r1.e()
            if (r14 == 0) goto L_0x00aa
            int r13 = r1.b()
            r14 = 204(0xcc, float:2.86E-43)
            if (r13 == r14) goto L_0x00a4
            java.lang.Object r13 = r1.a()
            if (r13 != 0) goto L_0x0077
            goto L_0x00a4
        L_0x0077:
            java.lang.Object r13 = r1.a()
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x0083
            java.util.List r13 = YH.C16877v.n()
        L_0x0083:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x008e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r13.next()
            com.ingka.ikea.app.stockinfo.network.StockModelRemote r0 = (com.ingka.ikea.app.stockinfo.network.StockModelRemote) r0
            com.ingka.ikea.app.stockinfo.local.StockModel r0 = r0.b()
            if (r0 == 0) goto L_0x008e
            r14.add(r0)
            goto L_0x008e
        L_0x00a4:
            java.util.List r14 = YH.C16877v.n()
            goto L_0x016b
        L_0x00aa:
            qv.e r14 = qv.e.DEBUG
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00bd:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00d5
            java.lang.Object r3 = r0.next()
            r5 = r3
            qv.b r5 = (qv.C11819b) r5
            r6 = 0
            boolean r5 = r5.b(r14, r6)
            if (r5 == 0) goto L_0x00bd
            r2.add(r3)
            goto L_0x00bd
        L_0x00d5:
            java.util.Iterator r0 = r2.iterator()
            r2 = 0
            r3 = r2
            r5 = r3
        L_0x00dc:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0167
            java.lang.Object r6 = r0.next()
            qv.b r6 = (qv.C11819b) r6
            r9 = 0
            if (r3 != 0) goto L_0x010b
            int r3 = r1.b()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Stock availability failed with "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.String r3 = qv.C11818a.a(r3, r9)
            if (r3 != 0) goto L_0x0107
            goto L_0x0167
        L_0x0107:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x010b:
            if (r5 != 0) goto L_0x015b
            java.lang.Class r5 = r13.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r7 = 36
            r8 = 2
            java.lang.String r7 = HJ.C15854t.s1(r5, r7, r2, r8, r2)
            r10 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r10, r2, r8, r2)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x012c
            goto L_0x0132
        L_0x012c:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r7, r5)
        L_0x0132:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r8, r4)
            if (r7 == 0) goto L_0x0145
            java.lang.String r7 = "m"
            goto L_0x0147
        L_0x0145:
            java.lang.String r7 = "b"
        L_0x0147:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "|"
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
        L_0x015b:
            r11 = r5
            r8 = 0
            r5 = r6
            r6 = r14
            r7 = r11
            r10 = r3
            r5.a(r6, r7, r8, r9, r10)
            r5 = r11
            goto L_0x00dc
        L_0x0167:
            java.util.List r14 = YH.C16877v.n()
        L_0x016b:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Vk.f.b(java.lang.String, dI.e):java.lang.Object");
    }
}
