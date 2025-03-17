package lz;

import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.BarcodeAndQuantityDataModel;
import cz.C14328b;
import dI.C17164e;
import iz.C14587a;
import iz.C14596j;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kz.C14739b;
import rz.S;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJb\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u0017H@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Llz/b;", "Lkz/b;", "Lcz/b;", "scanAndGoService", "Liz/a;", "errorMapper", "Liz/j;", "orderMapper", "<init>", "(Lcz/b;Liz/a;Liz/j;)V", "Lrz/S;", "item", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/BarcodeAndQuantityDataModel;", "d", "(Lrz/S;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/BarcodeAndQuantityDataModel;", "", "storeId", "familyCardId", "", "barcodeAndQuantity", "salesOrderAndQuantity", "pickingList", "coupons", "", "isCoWorkerDiscountApplied", "Lrz/G;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLdI/e;)Ljava/lang/Object;", "Lcz/b;", "b", "Liz/a;", "c", "Liz/j;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lz.b  reason: case insensitive filesystem */
public final class C14778b implements C14739b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14328b f129121a;

    /* renamed from: b  reason: collision with root package name */
    private final C14587a f129122b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C14596j f129123c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CartSourceRemoteImpl", f = "CartSourceRemoteImpl.kt", l = {43}, m = "syncCart")
    /* renamed from: lz.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f129124c;

        /* renamed from: d  reason: collision with root package name */
        Object f129125d;

        /* renamed from: e  reason: collision with root package name */
        Object f129126e;

        /* renamed from: f  reason: collision with root package name */
        Object f129127f;

        /* renamed from: g  reason: collision with root package name */
        Object f129128g;

        /* renamed from: h  reason: collision with root package name */
        Object f129129h;

        /* renamed from: i  reason: collision with root package name */
        Object f129130i;

        /* renamed from: j  reason: collision with root package name */
        Object f129131j;

        /* renamed from: k  reason: collision with root package name */
        Object f129132k;

        /* renamed from: l  reason: collision with root package name */
        Object f129133l;

        /* renamed from: m  reason: collision with root package name */
        Object f129134m;

        /* renamed from: n  reason: collision with root package name */
        Object f129135n;

        /* renamed from: o  reason: collision with root package name */
        Object f129136o;

        /* renamed from: p  reason: collision with root package name */
        Object f129137p;

        /* renamed from: q  reason: collision with root package name */
        Object f129138q;

        /* renamed from: r  reason: collision with root package name */
        Object f129139r;

        /* renamed from: s  reason: collision with root package name */
        boolean f129140s;

        /* renamed from: t  reason: collision with root package name */
        int f129141t;

        /* renamed from: u  reason: collision with root package name */
        int f129142u;

        /* renamed from: v  reason: collision with root package name */
        /* synthetic */ Object f129143v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ C14778b f129144w;

        /* renamed from: x  reason: collision with root package name */
        int f129145x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14778b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f129144w = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129143v = obj;
            this.f129145x |= Integer.MIN_VALUE;
            return this.f129144w.a((String) null, (String) null, (List<S>) null, (List<S>) null, (List<S>) null, (List<String>) null, false, this);
        }
    }

    public C14778b(C14328b bVar, C14587a aVar, C14596j jVar) {
        C17542s.j(bVar, "scanAndGoService");
        C17542s.j(aVar, "errorMapper");
        C17542s.j(jVar, "orderMapper");
        this.f129121a = bVar;
        this.f129122b = aVar;
        this.f129123c = jVar;
    }

    private final BarcodeAndQuantityDataModel d(S s10) {
        return new BarcodeAndQuantityDataModel(s10.a(), s10.b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r19, java.lang.String r20, java.util.List<rz.S> r21, java.util.List<rz.S> r22, java.util.List<rz.S> r23, java.util.List<java.lang.String> r24, boolean r25, dI.C17164e<? super rz.G> r26) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r26
            boolean r6 = r5 instanceof lz.C14778b.a
            if (r6 == 0) goto L_0x001f
            r6 = r5
            lz.b$a r6 = (lz.C14778b.a) r6
            int r7 = r6.f129145x
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.f129145x = r7
            goto L_0x0024
        L_0x001f:
            lz.b$a r6 = new lz.b$a
            r6.<init>(r1, r5)
        L_0x0024:
            java.lang.Object r7 = r6.f129143v
            java.lang.Object r8 = eI.C17187b.f()
            int r9 = r6.f129145x
            r10 = 1
            if (r9 == 0) goto L_0x0084
            if (r9 != r10) goto L_0x007c
            java.lang.Object r0 = r6.f129139r
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r6.f129138q
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r6.f129137p
            lz.h r0 = (lz.h) r0
            java.lang.Object r2 = r6.f129136o
            iz.a r2 = (iz.C14587a) r2
            java.lang.Object r3 = r6.f129135n
            iz.a r3 = (iz.C14587a) r3
            java.lang.Object r3 = r6.f129134m
            lz.h r3 = (lz.h) r3
            java.lang.Object r3 = r6.f129133l
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r6.f129132k
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoOrderBodyDataModel r3 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoOrderBodyDataModel) r3
            java.lang.Object r3 = r6.f129131j
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r3 = r6.f129130i
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r6.f129129h
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r6.f129128g
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r6.f129127f
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r6.f129126e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r6.f129125d
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r6.f129124c
            lz.b r3 = (lz.C14778b) r3
            XH.y.b(r7)     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            goto L_0x0145
        L_0x0076:
            r0 = move-exception
            goto L_0x0177
        L_0x0079:
            r0 = move-exception
            goto L_0x01e1
        L_0x007c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0084:
            XH.y.b(r7)
            r7 = r2
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            r11 = 10
            int r12 = YH.C16877v.y(r7, r11)
            r9.<init>(r12)
            java.util.Iterator r7 = r7.iterator()
        L_0x0099:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x00ad
            java.lang.Object r12 = r7.next()
            rz.S r12 = (rz.S) r12
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.BarcodeAndQuantityDataModel r12 = r1.d(r12)
            r9.add(r12)
            goto L_0x0099
        L_0x00ad:
            r7 = r3
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r15 = new java.util.ArrayList
            int r12 = YH.C16877v.y(r7, r11)
            r15.<init>(r12)
            java.util.Iterator r7 = r7.iterator()
        L_0x00bd:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x00d1
            java.lang.Object r12 = r7.next()
            rz.S r12 = (rz.S) r12
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.BarcodeAndQuantityDataModel r12 = r1.d(r12)
            r15.add(r12)
            goto L_0x00bd
        L_0x00d1:
            r7 = r4
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r14 = new java.util.ArrayList
            int r11 = YH.C16877v.y(r7, r11)
            r14.<init>(r11)
            java.util.Iterator r7 = r7.iterator()
        L_0x00e1:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x00f5
            java.lang.Object r11 = r7.next()
            rz.S r11 = (rz.S) r11
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.BarcodeAndQuantityDataModel r11 = r1.d(r11)
            r14.add(r11)
            goto L_0x00e1
        L_0x00f5:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoOrderBodyDataModel r13 = new com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoOrderBodyDataModel
            r11 = r13
            r12 = r20
            r10 = r13
            r13 = r9
            r16 = r24
            r17 = r25
            r11.<init>(r12, r13, r14, r15, r16, r17)
            lz.h r11 = lz.h.f129233a
            iz.a r12 = r1.f129122b
            cz.b r13 = r18.f129121a     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129124c = r1     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129125d = r0     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r14 = r20
            r6.f129126e = r14     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129127f = r2     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129128g = r3     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129129h = r4     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r2 = r24
            r6.f129130i = r2     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129131j = r5     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129132k = r10     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129133l = r9     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129134m = r11     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129135n = r12     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129136o = r12     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129137p = r11     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129138q = r6     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129139r = r7     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r2 = r25
            r6.f129140s = r2     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r2 = 0
            r6.f129141t = r2     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r6.f129142u = r2     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            r2 = 1
            r6.f129145x = r2     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            java.lang.Object r7 = r13.f(r0, r10, r6)     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            if (r7 != r8) goto L_0x0142
            return r8
        L_0x0142:
            r3 = r1
            r0 = r11
            r2 = r12
        L_0x0145:
            QL.x r7 = (QL.x) r7     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            java.lang.Object r0 = r0.b(r2, r7)     // Catch:{ CancellationException -> 0x0079, Exception -> 0x0076 }
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel r0 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel) r0
            lz.g r2 = lz.g.f129232a
            iz.j r2 = r3.f129123c     // Catch:{ CancellationException -> 0x015c, IllegalArgumentException -> 0x015a, Exception -> 0x0158 }
            rz.G r0 = r2.a(r0)     // Catch:{ CancellationException -> 0x015c, IllegalArgumentException -> 0x015a, Exception -> 0x0158 }
            return r0
        L_0x0158:
            r0 = move-exception
            goto L_0x015e
        L_0x015a:
            r0 = move-exception
            goto L_0x016a
        L_0x015c:
            r0 = move-exception
            goto L_0x0176
        L_0x015e:
            hp.b r2 = new hp.b
            java.lang.String r3 = "Unknown problem while mapping"
            java.lang.String r0 = lz.f.a(r0, r3)
            r2.<init>(r0)
            throw r2
        L_0x016a:
            hp.b r2 = new hp.b
            r3 = 0
            r4 = 1
            java.lang.String r0 = lz.f.b(r0, r3, r4, r3)
            r2.<init>(r0)
            throw r2
        L_0x0176:
            throw r0
        L_0x0177:
            boolean r2 = r0 instanceof java.lang.NullPointerException
            if (r2 == 0) goto L_0x018b
            hp.c r2 = new hp.c
            hp.c$a r3 = hp.C11377c.a.RESPONSE
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0187
            java.lang.String r0 = "NPE: Check if response body was null"
        L_0x0187:
            r2.<init>(r3, r0)
            goto L_0x01e0
        L_0x018b:
            boolean r2 = r0 instanceof java.net.SocketTimeoutException
            if (r2 != 0) goto L_0x01d1
            boolean r2 = r0 instanceof java.util.concurrent.TimeoutException
            if (r2 == 0) goto L_0x0194
            goto L_0x01d1
        L_0x0194:
            boolean r2 = r0 instanceof java.net.UnknownHostException
            if (r2 == 0) goto L_0x01a8
            hp.c r2 = new hp.c
            hp.c$a r3 = hp.C11377c.a.NO_NETWORK
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x01a4
            java.lang.String r0 = "Unknown host exception, but throwable message was null"
        L_0x01a4:
            r2.<init>(r3, r0)
            goto L_0x01e0
        L_0x01a8:
            hp.c r2 = new hp.c
            hp.c$a r3 = hp.C11377c.a.UNKNOWN
            java.lang.Throwable r4 = r0.getCause()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unknown error occurred during network call:\n "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " \n "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r2.<init>(r3, r0)
            goto L_0x01e0
        L_0x01d1:
            hp.c r2 = new hp.c
            hp.c$a r3 = hp.C11377c.a.TIMEOUT
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x01dd
            java.lang.String r0 = "Timeout exception, but throwable message was null"
        L_0x01dd:
            r2.<init>(r3, r0)
        L_0x01e0:
            throw r2
        L_0x01e1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.C14778b.a(java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, boolean, dI.e):java.lang.Object");
    }
}
