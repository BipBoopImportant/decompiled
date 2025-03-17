package lz;

import XH.x;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel;
import dI.C17164e;
import dz.C14369a;
import eI.C17187b;
import iz.C14599m;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kz.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\nH@¢\u0006\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Llz/i;", "Lkz/e;", "Ldz/a;", "database", "Liz/m;", "productMapper", "<init>", "(Ldz/a;Liz/m;)V", "", "barcode", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "responseBody", "Lrz/I;", "e", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;LdI/e;)Ljava/lang/Object;", "LXH/x;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "item", "h", "Ldz/a;", "b", "Liz/m;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14369a f129234a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14599m f129235b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.ProductScanSourceLocalImpl", f = "ProductScanSourceLocalImpl.kt", l = {21, 23}, m = "getScannedProduct-gIAlu-s")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f129236c;

        /* renamed from: d  reason: collision with root package name */
        Object f129237d;

        /* renamed from: e  reason: collision with root package name */
        Object f129238e;

        /* renamed from: f  reason: collision with root package name */
        Object f129239f;

        /* renamed from: g  reason: collision with root package name */
        Object f129240g;

        /* renamed from: h  reason: collision with root package name */
        Object f129241h;

        /* renamed from: i  reason: collision with root package name */
        Object f129242i;

        /* renamed from: j  reason: collision with root package name */
        Object f129243j;

        /* renamed from: k  reason: collision with root package name */
        int f129244k;

        /* renamed from: l  reason: collision with root package name */
        int f129245l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f129246m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ i f129247n;

        /* renamed from: o  reason: collision with root package name */
        int f129248o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f129247n = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129246m = obj;
            this.f129248o |= Integer.MIN_VALUE;
            Object a10 = this.f129247n.a((String) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.ProductScanSourceLocalImpl", f = "ProductScanSourceLocalImpl.kt", l = {48, 52}, m = "mapProduct")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f129249c;

        /* renamed from: d  reason: collision with root package name */
        Object f129250d;

        /* renamed from: e  reason: collision with root package name */
        Object f129251e;

        /* renamed from: f  reason: collision with root package name */
        Object f129252f;

        /* renamed from: g  reason: collision with root package name */
        Object f129253g;

        /* renamed from: h  reason: collision with root package name */
        Object f129254h;

        /* renamed from: i  reason: collision with root package name */
        Object f129255i;

        /* renamed from: j  reason: collision with root package name */
        int f129256j;

        /* renamed from: k  reason: collision with root package name */
        int f129257k;

        /* renamed from: l  reason: collision with root package name */
        int f129258l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f129259m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ i f129260n;

        /* renamed from: o  reason: collision with root package name */
        int f129261o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f129260n = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129259m = obj;
            this.f129261o |= Integer.MIN_VALUE;
            return this.f129260n.e((String) null, (ScanAndGoProductResponseDataModel) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.ProductScanSourceLocalImpl", f = "ProductScanSourceLocalImpl.kt", l = {34, 40}, m = "saveScannedProduct")
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f129262c;

        /* renamed from: d  reason: collision with root package name */
        Object f129263d;

        /* renamed from: e  reason: collision with root package name */
        Object f129264e;

        /* renamed from: f  reason: collision with root package name */
        Object f129265f;

        /* renamed from: g  reason: collision with root package name */
        Object f129266g;

        /* renamed from: h  reason: collision with root package name */
        Object f129267h;

        /* renamed from: i  reason: collision with root package name */
        Object f129268i;

        /* renamed from: j  reason: collision with root package name */
        int f129269j;

        /* renamed from: k  reason: collision with root package name */
        int f129270k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f129271l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ i f129272m;

        /* renamed from: n  reason: collision with root package name */
        int f129273n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f129272m = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129271l = obj;
            this.f129273n |= Integer.MIN_VALUE;
            return this.f129272m.h((String) null, (ScanAndGoProductResponseDataModel) null, this);
        }
    }

    public i(C14369a aVar, C14599m mVar) {
        C17542s.j(aVar, "database");
        C17542s.j(mVar, "productMapper");
        this.f129234a = aVar;
        this.f129235b = mVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r22, com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r23, dI.C17164e<? super rz.I> r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r24
            boolean r3 = r2 instanceof lz.i.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            lz.i$b r3 = (lz.i.b) r3
            int r4 = r3.f129261o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f129261o = r4
            goto L_0x001e
        L_0x0019:
            lz.i$b r3 = new lz.i$b
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f129259m
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f129261o
            java.lang.String r7 = "Could not get error message from exception"
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            if (r6 == 0) goto L_0x0090
            if (r6 == r10) goto L_0x006b
            if (r6 != r8) goto L_0x0063
            int r0 = r3.f129256j
            java.lang.Object r2 = r3.f129255i
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.f129254h
            lz.m r2 = (lz.m) r2
            java.lang.Object r2 = r3.f129253g
            lz.m r2 = (lz.m) r2
            java.lang.Object r2 = r3.f129252f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.f129251e
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r2 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel) r2
            java.lang.Object r5 = r3.f129250d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.f129249c
            lz.i r3 = (lz.i) r3
            XH.y.b(r4)     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r17 = r0
            r19 = r2
            r15 = r5
            goto L_0x00ec
        L_0x005a:
            r0 = move-exception
            goto L_0x011a
        L_0x005d:
            r0 = move-exception
            goto L_0x012e
        L_0x0060:
            r0 = move-exception
            goto L_0x013a
        L_0x0063:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x006b:
            java.lang.Object r0 = r3.f129254h
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r3.f129253g
            lz.m r0 = (lz.m) r0
            java.lang.Object r2 = r3.f129252f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r6 = r3.f129251e
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r6 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel) r6
            java.lang.Object r12 = r3.f129250d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r3.f129249c
            lz.i r13 = (lz.i) r13
            XH.y.b(r4)     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            goto L_0x00bc
        L_0x0087:
            r0 = move-exception
            goto L_0x013b
        L_0x008a:
            r0 = move-exception
            goto L_0x014f
        L_0x008d:
            r0 = move-exception
            goto L_0x015b
        L_0x0090:
            XH.y.b(r4)
            lz.m r4 = lz.m.f129322a
            dz.a r6 = r21.f129234a     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            r3.f129249c = r1     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            r3.f129250d = r0     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            r12 = r23
            r3.f129251e = r12     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            r3.f129252f = r2     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            r3.f129253g = r4     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            r3.f129254h = r3     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            r3.f129256j = r9     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            r3.f129257k = r9     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            r3.f129261o = r10     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            java.lang.Object r6 = r6.k(r0, r3)     // Catch:{ CancellationException -> 0x008d, NullPointerException -> 0x008a, Exception -> 0x0087 }
            if (r6 != r5) goto L_0x00b4
            return r5
        L_0x00b4:
            r13 = r1
            r20 = r12
            r12 = r0
            r0 = r4
            r4 = r6
            r6 = r20
        L_0x00bc:
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            lz.m r14 = lz.m.f129322a
            dz.a r15 = r13.f129234a     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r3.f129249c = r13     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r3.f129250d = r12     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r3.f129251e = r6     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r3.f129252f = r2     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r3.f129253g = r0     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r3.f129254h = r14     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r3.f129255i = r3     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r3.f129256j = r4     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r3.f129257k = r9     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r3.f129258l = r9     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            r3.f129261o = r8     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            java.lang.Object r0 = r15.o(r3)     // Catch:{ CancellationException -> 0x0060, NullPointerException -> 0x005d, Exception -> 0x005a }
            if (r0 != r5) goto L_0x00e5
            return r5
        L_0x00e5:
            r17 = r4
            r19 = r6
            r15 = r12
            r3 = r13
            r4 = r0
        L_0x00ec:
            r18 = r4
            java.util.List r18 = (java.util.List) r18
            lz.g r0 = lz.g.f129232a
            iz.m r14 = r3.f129235b     // Catch:{ CancellationException -> 0x0101, IllegalArgumentException -> 0x00ff, Exception -> 0x00fd }
            java.lang.String r16 = ""
            rz.I r0 = r14.a(r15, r16, r17, r18, r19)     // Catch:{ CancellationException -> 0x0101, IllegalArgumentException -> 0x00ff, Exception -> 0x00fd }
            return r0
        L_0x00fd:
            r0 = move-exception
            goto L_0x0103
        L_0x00ff:
            r0 = move-exception
            goto L_0x010f
        L_0x0101:
            r0 = move-exception
            goto L_0x0119
        L_0x0103:
            hp.b r2 = new hp.b
            java.lang.String r3 = "Unknown problem while mapping"
            java.lang.String r0 = lz.f.a(r0, r3)
            r2.<init>(r0)
            throw r2
        L_0x010f:
            hp.b r2 = new hp.b
            java.lang.String r0 = lz.f.b(r0, r11, r10, r11)
            r2.<init>(r0)
            throw r2
        L_0x0119:
            throw r0
        L_0x011a:
            hp.a r2 = new hp.a
            hp.a$a r3 = hp.C11375a.C2209a.UNKNOWN
            java.lang.String r4 = r0.getMessage()
            if (r4 != 0) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r7 = r4
        L_0x0126:
            java.lang.String r0 = lz.f.a(r0, r7)
            r2.<init>(r3, r0)
            throw r2
        L_0x012e:
            hp.a r2 = new hp.a
            hp.a$a r3 = hp.C11375a.C2209a.ITEM_NOT_FOUND
            java.lang.String r0 = lz.f.b(r0, r11, r10, r11)
            r2.<init>(r3, r0)
            throw r2
        L_0x013a:
            throw r0
        L_0x013b:
            hp.a r2 = new hp.a
            hp.a$a r3 = hp.C11375a.C2209a.UNKNOWN
            java.lang.String r4 = r0.getMessage()
            if (r4 != 0) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r7 = r4
        L_0x0147:
            java.lang.String r0 = lz.f.a(r0, r7)
            r2.<init>(r3, r0)
            throw r2
        L_0x014f:
            hp.a r2 = new hp.a
            hp.a$a r3 = hp.C11375a.C2209a.ITEM_NOT_FOUND
            java.lang.String r0 = lz.f.b(r0, r11, r10, r11)
            r2.<init>(r3, r0)
            throw r2
        L_0x015b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.i.e(java.lang.String, com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa A[Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r12, dI.C17164e<? super XH.x<rz.I>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof lz.i.a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            lz.i$a r0 = (lz.i.a) r0
            int r1 = r0.f129248o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129248o = r1
            goto L_0x0018
        L_0x0013:
            lz.i$a r0 = new lz.i$a
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f129246m
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129248o
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0081
            if (r3 == r6) goto L_0x0056
            if (r3 != r4) goto L_0x004e
            java.lang.Object r12 = r0.f129243j
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r12 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel) r12
            java.lang.Object r12 = r0.f129242i
            gz.e r12 = (gz.e) r12
            java.lang.Object r12 = r0.f129241h
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f129240g
            XH.x$a r12 = (XH.x.a) r12
            java.lang.Object r12 = r0.f129239f
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r12 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel) r12
            java.lang.Object r12 = r0.f129238e
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f129237d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f129236c
            lz.i r12 = (lz.i) r12
            XH.y.b(r1)
            goto L_0x00cf
        L_0x004e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0056:
            int r12 = r0.f129245l
            int r13 = r0.f129244k
            java.lang.Object r3 = r0.f129240g
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r7 = r0.f129239f
            lz.m r7 = (lz.m) r7
            java.lang.Object r7 = r0.f129238e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r8 = r0.f129237d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.f129236c
            lz.i r9 = (lz.i) r9
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r10 = r1
            r1 = r12
            r12 = r8
            r8 = r3
            r3 = r13
            r13 = r7
            r7 = r10
            goto L_0x00a6
        L_0x0079:
            r12 = move-exception
            goto L_0x00e6
        L_0x007b:
            r12 = move-exception
            goto L_0x00fa
        L_0x007e:
            r12 = move-exception
            goto L_0x0106
        L_0x0081:
            XH.y.b(r1)
            lz.m r1 = lz.m.f129322a
            dz.a r3 = r11.f129234a     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129236c = r11     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129237d = r12     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129238e = r13     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129239f = r1     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129240g = r0     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r1 = 0
            r0.f129244k = r1     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129245l = r1     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129248o = r6     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            java.lang.Object r3 = r3.j(r12, r0)     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            if (r3 != r2) goto L_0x00a2
            return r2
        L_0x00a2:
            r9 = r11
            r8 = r0
            r7 = r3
            r3 = r1
        L_0x00a6:
            gz.e r7 = (gz.e) r7     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
            if (r7 == 0) goto L_0x00ae
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r5 = r7.d()     // Catch:{ CancellationException -> 0x007e, NullPointerException -> 0x007b, Exception -> 0x0079 }
        L_0x00ae:
            if (r5 == 0) goto L_0x00d4
            XH.x$a r6 = XH.x.f139812b
            r0.f129236c = r9
            r0.f129237d = r12
            r0.f129238e = r13
            r0.f129239f = r5
            r0.f129240g = r6
            r0.f129241h = r8
            r0.f129242i = r7
            r0.f129243j = r5
            r0.f129244k = r3
            r0.f129245l = r1
            r0.f129248o = r4
            java.lang.Object r1 = r9.e(r12, r5, r0)
            if (r1 != r2) goto L_0x00cf
            return r2
        L_0x00cf:
            java.lang.Object r12 = XH.x.b(r1)
            goto L_0x00e5
        L_0x00d4:
            XH.x$a r12 = XH.x.f139812b
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Could not find product in DB"
            r12.<init>(r13)
            java.lang.Object r12 = XH.y.a(r12)
            java.lang.Object r12 = XH.x.b(r12)
        L_0x00e5:
            return r12
        L_0x00e6:
            hp.a r13 = new hp.a
            hp.a$a r0 = hp.C11375a.C2209a.UNKNOWN
            java.lang.String r1 = r12.getMessage()
            if (r1 != 0) goto L_0x00f2
            java.lang.String r1 = "Could not get error message from exception"
        L_0x00f2:
            java.lang.String r12 = lz.f.a(r12, r1)
            r13.<init>(r0, r12)
            throw r13
        L_0x00fa:
            hp.a r13 = new hp.a
            hp.a$a r0 = hp.C11375a.C2209a.ITEM_NOT_FOUND
            java.lang.String r12 = lz.f.b(r12, r5, r6, r5)
            r13.<init>(r0, r12)
            throw r13
        L_0x0106:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.i.a(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4 A[PHI: r1 
      PHI: (r1v1 java.lang.Object) = (r1v3 java.lang.Object), (r1v0 java.lang.Object) binds: [B:28:0x00c1, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(java.lang.String r12, com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r13, dI.C17164e<? super rz.I> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof lz.i.c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            lz.i$c r0 = (lz.i.c) r0
            int r1 = r0.f129273n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129273n = r1
            goto L_0x0018
        L_0x0013:
            lz.i$c r0 = new lz.i$c
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f129271l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129273n
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x007f
            if (r3 == r5) goto L_0x0051
            if (r3 != r4) goto L_0x0049
            java.lang.Object r12 = r0.f129268i
            XH.N r12 = (XH.C16807N) r12
            java.lang.Object r12 = r0.f129267h
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f129266g
            lz.m r12 = (lz.m) r12
            java.lang.Object r12 = r0.f129265f
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f129264e
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r12 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel) r12
            java.lang.Object r12 = r0.f129263d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f129262c
            lz.i r12 = (lz.i) r12
            XH.y.b(r1)
            goto L_0x00c4
        L_0x0049:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0051:
            int r12 = r0.f129270k
            int r13 = r0.f129269j
            java.lang.Object r14 = r0.f129267h
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r3 = r0.f129266g
            lz.m r3 = (lz.m) r3
            java.lang.Object r6 = r0.f129265f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r0.f129264e
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r7 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel) r7
            java.lang.Object r8 = r0.f129263d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.f129262c
            lz.i r9 = (lz.i) r9
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r1 = r6
            r6 = r12
            r12 = r8
            r10 = r14
            r14 = r13
            r13 = r7
            r7 = r3
            r3 = r10
            goto L_0x00a7
        L_0x0079:
            r12 = move-exception
            goto L_0x00c5
        L_0x007b:
            r12 = move-exception
            goto L_0x00d9
        L_0x007d:
            r12 = move-exception
            goto L_0x00e6
        L_0x007f:
            XH.y.b(r1)
            lz.m r3 = lz.m.f129322a
            dz.a r1 = r11.f129234a     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129262c = r11     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129263d = r12     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129264e = r13     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129265f = r14     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129266g = r3     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129267h = r0     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r6 = 0
            r0.f129269j = r6     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129270k = r6     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129273n = r5     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            java.lang.Object r1 = r1.h(r12, r13, r0)     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            if (r1 != r2) goto L_0x00a2
            return r2
        L_0x00a2:
            r9 = r11
            r1 = r14
            r7 = r3
            r14 = r6
            r3 = r0
        L_0x00a7:
            XH.N r5 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x007d, NullPointerException -> 0x007b, Exception -> 0x0079 }
            r0.f129262c = r9
            r0.f129263d = r12
            r0.f129264e = r13
            r0.f129265f = r1
            r0.f129266g = r7
            r0.f129267h = r3
            r0.f129268i = r5
            r0.f129269j = r14
            r0.f129270k = r6
            r0.f129273n = r4
            java.lang.Object r1 = r9.e(r12, r13, r0)
            if (r1 != r2) goto L_0x00c4
            return r2
        L_0x00c4:
            return r1
        L_0x00c5:
            hp.a r13 = new hp.a
            hp.a$a r14 = hp.C11375a.C2209a.UNKNOWN
            java.lang.String r0 = r12.getMessage()
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "Could not get error message from exception"
        L_0x00d1:
            java.lang.String r12 = lz.f.a(r12, r0)
            r13.<init>(r14, r12)
            throw r13
        L_0x00d9:
            hp.a r13 = new hp.a
            hp.a$a r14 = hp.C11375a.C2209a.ITEM_NOT_FOUND
            r0 = 0
            java.lang.String r12 = lz.f.b(r12, r0, r5, r0)
            r13.<init>(r14, r12)
            throw r13
        L_0x00e6:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.i.h(java.lang.String, com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel, dI.e):java.lang.Object");
    }
}
