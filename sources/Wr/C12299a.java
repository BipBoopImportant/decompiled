package wr;

import Go.a;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import up.C12074d;
import vr.C12206a;
import yr.C12501a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0012H@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lwr/a;", "Lvr/a;", "Lyr/a;", "genericInspirationService", "Lyr/b;", "personalisedInspirationService", "LGo/a;", "clientIdentityProvider", "Lup/d;", "userConsentRepository", "<init>", "(Lyr/a;Lyr/b;LGo/a;Lup/d;)V", "", "paginationRequestId", "filter", "", "includedInspirationIds", "similarToInspirationId", "", "startIndex", "pageSize", "Lzr/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;IILdI/e;)Ljava/lang/Object;", "productNumber", "numberOfItems", "Lzr/a;", "b", "(Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "Lyr/a;", "Lyr/b;", "c", "LGo/a;", "d", "Lup/d;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wr.a  reason: case insensitive filesystem */
public final class C12299a implements C12206a {

    /* renamed from: a  reason: collision with root package name */
    private final C12501a f105967a;

    /* renamed from: b  reason: collision with root package name */
    private final yr.b f105968b;

    /* renamed from: c  reason: collision with root package name */
    private final a f105969c;

    /* renamed from: d  reason: collision with root package name */
    private final C12074d f105970d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.feature.inspire.datalayer.impl.InspireRepositoryImpl", f = "InspireRepositoryImpl.kt", l = {77}, m = "getInspireFeed")
    /* renamed from: wr.a$a  reason: collision with other inner class name */
    static final class C2516a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f105971c;

        /* renamed from: d  reason: collision with root package name */
        Object f105972d;

        /* renamed from: e  reason: collision with root package name */
        Object f105973e;

        /* renamed from: f  reason: collision with root package name */
        Object f105974f;

        /* renamed from: g  reason: collision with root package name */
        Object f105975g;

        /* renamed from: h  reason: collision with root package name */
        Object f105976h;

        /* renamed from: i  reason: collision with root package name */
        Object f105977i;

        /* renamed from: j  reason: collision with root package name */
        Object f105978j;

        /* renamed from: k  reason: collision with root package name */
        int f105979k;

        /* renamed from: l  reason: collision with root package name */
        int f105980l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f105981m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C12299a f105982n;

        /* renamed from: o  reason: collision with root package name */
        int f105983o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2516a(C12299a aVar, C17164e<? super C2516a> eVar) {
            super(eVar);
            this.f105982n = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f105981m = obj;
            this.f105983o |= Integer.MIN_VALUE;
            return this.f105982n.a((String) null, (String) null, (List<String>) null, (String) null, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.feature.inspire.datalayer.impl.InspireRepositoryImpl", f = "InspireRepositoryImpl.kt", l = {102, 108}, m = "getPersonalisedInspireFeedImagesForProduct")
    /* renamed from: wr.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f105984c;

        /* renamed from: d  reason: collision with root package name */
        Object f105985d;

        /* renamed from: e  reason: collision with root package name */
        Object f105986e;

        /* renamed from: f  reason: collision with root package name */
        Object f105987f;

        /* renamed from: g  reason: collision with root package name */
        Object f105988g;

        /* renamed from: h  reason: collision with root package name */
        Object f105989h;

        /* renamed from: i  reason: collision with root package name */
        Object f105990i;

        /* renamed from: j  reason: collision with root package name */
        int f105991j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f105992k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C12299a f105993l;

        /* renamed from: m  reason: collision with root package name */
        int f105994m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12299a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f105993l = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f105992k = obj;
            this.f105994m |= Integer.MIN_VALUE;
            return this.f105993l.b((String) null, 0, this);
        }
    }

    public C12299a(C12501a aVar, yr.b bVar, a aVar2, C12074d dVar) {
        C17542s.j(aVar, "genericInspirationService");
        C17542s.j(bVar, "personalisedInspirationService");
        C17542s.j(aVar2, "clientIdentityProvider");
        C17542s.j(dVar, "userConsentRepository");
        this.f105967a = aVar;
        this.f105968b = bVar;
        this.f105969c = aVar2;
        this.f105970d = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r21, java.lang.String r22, java.util.List<java.lang.String> r23, java.lang.String r24, int r25, int r26, dI.C17164e<? super zr.b> r27) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r27
            boolean r6 = r5 instanceof wr.C12299a.C2516a
            if (r6 == 0) goto L_0x001f
            r6 = r5
            wr.a$a r6 = (wr.C12299a.C2516a) r6
            int r7 = r6.f105983o
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.f105983o = r7
            goto L_0x0024
        L_0x001f:
            wr.a$a r6 = new wr.a$a
            r6.<init>(r0, r5)
        L_0x0024:
            java.lang.Object r7 = r6.f105981m
            java.lang.Object r8 = eI.C17187b.f()
            int r9 = r6.f105983o
            r10 = 1
            if (r9 == 0) goto L_0x0060
            if (r9 != r10) goto L_0x0058
            int r1 = r6.f105979k
            java.lang.Object r2 = r6.f105978j
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r2 = r6.f105977i
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r2 = r6.f105976h
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r6.f105975g
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r6.f105974f
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r6.f105973e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r6.f105972d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r6.f105971c
            wr.a r2 = (wr.C12299a) r2
            XH.y.b(r7)
            goto L_0x00ec
        L_0x0058:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0060:
            XH.y.b(r7)
            java.lang.String r7 = "startIndex"
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.e(r25)
            XH.v r7 = XH.C16796C.a(r7, r9)
            java.lang.String r9 = "maxResults"
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.b.e(r26)
            XH.v r9 = XH.C16796C.a(r9, r11)
            XH.v[] r7 = new XH.v[]{r7, r9}
            java.util.Map r7 = YH.X.p(r7)
            int r9 = r21.length()
            if (r9 <= 0) goto L_0x008a
            java.lang.String r9 = "requestId"
            r7.put(r9, r1)
        L_0x008a:
            int r9 = r22.length()
            if (r9 <= 0) goto L_0x0095
            java.lang.String r9 = "filter"
            r7.put(r9, r2)
        L_0x0095:
            if (r4 == 0) goto L_0x00a3
            int r9 = r24.length()
            if (r9 != 0) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            java.lang.String r9 = "similarTo"
            r7.put(r9, r4)
        L_0x00a3:
            if (r3 == 0) goto L_0x00c8
            r9 = r3
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r10
            if (r9 != r10) goto L_0x00c8
            r11 = r3
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r18 = 62
            r19 = 0
            java.lang.String r12 = ","
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r9 = YH.C16877v.G0(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r11 = "initialInspireIds"
            r7.put(r11, r9)
        L_0x00c8:
            yr.a r9 = r0.f105967a
            r6.f105971c = r0
            r6.f105972d = r1
            r6.f105973e = r2
            r6.f105974f = r3
            r6.f105975g = r4
            r6.f105976h = r5
            r6.f105977i = r7
            r6.f105978j = r4
            r1 = r25
            r6.f105979k = r1
            r2 = r26
            r6.f105980l = r2
            r6.f105983o = r10
            r2 = 2
            java.lang.Object r7 = r9.a(r2, r7, r6)
            if (r7 != r8) goto L_0x00ec
            return r8
        L_0x00ec:
            com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6 r7 = (com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6) r7
            if (r1 != 0) goto L_0x00f5
            zr.a r1 = r7.b()
            goto L_0x00f9
        L_0x00f5:
            zr.e r1 = r7.c()
        L_0x00f9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wr.C12299a.a(java.lang.String, java.lang.String, java.util.List, java.lang.String, int, int, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r9, int r10, dI.C17164e<? super zr.C12550a> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof wr.C12299a.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            wr.a$b r0 = (wr.C12299a.b) r0
            int r1 = r0.f105994m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f105994m = r1
            goto L_0x0018
        L_0x0013:
            wr.a$b r0 = new wr.a$b
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f105992k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f105994m
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L_0x0069
            if (r3 == r4) goto L_0x0049
            if (r3 != r5) goto L_0x0041
            java.lang.Object r9 = r0.f105988g
            XH.v[] r9 = (XH.v[]) r9
            java.lang.Object r9 = r0.f105987f
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r9 = r0.f105986e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f105985d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f105984c
            wr.a r9 = (wr.C12299a) r9
            XH.y.b(r1)
            goto L_0x00d1
        L_0x0041:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0049:
            java.lang.Object r9 = r0.f105990i
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f105989h
            yr.b r9 = (yr.b) r9
            java.lang.Object r9 = r0.f105988g
            XH.v[] r9 = (XH.v[]) r9
            java.lang.Object r9 = r0.f105987f
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r9 = r0.f105986e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f105985d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f105984c
            wr.a r9 = (wr.C12299a) r9
            XH.y.b(r1)
            goto L_0x00b7
        L_0x0069:
            XH.y.b(r1)
            java.lang.String r1 = "startIndex"
            java.lang.String r3 = "0"
            XH.v r1 = XH.C16796C.a(r1, r3)
            java.lang.String r3 = "maxResults"
            java.lang.String r6 = java.lang.String.valueOf(r10)
            XH.v r3 = XH.C16796C.a(r3, r6)
            java.lang.String r6 = "productLook"
            XH.v r6 = XH.C16796C.a(r6, r9)
            XH.v[] r1 = new XH.v[]{r1, r3, r6}
            java.util.Map r3 = YH.X.p(r1)
            up.d r6 = r8.f105970d
            up.a$c r7 = up.C12071a.c.f103981e
            boolean r6 = r6.b(r7)
            if (r6 == 0) goto L_0x00ba
            yr.b r6 = r8.f105968b
            Go.a r7 = r8.f105969c
            java.lang.String r7 = r7.c()
            r0.f105984c = r8
            r0.f105985d = r9
            r0.f105986e = r11
            r0.f105987f = r3
            r0.f105988g = r1
            r0.f105989h = r6
            r0.f105990i = r7
            r0.f105991j = r10
            r0.f105994m = r4
            java.lang.Object r1 = r6.a(r3, r5, r7, r0)
            if (r1 != r2) goto L_0x00b7
            return r2
        L_0x00b7:
            com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6 r1 = (com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6) r1
            goto L_0x00d3
        L_0x00ba:
            yr.a r4 = r8.f105967a
            r0.f105984c = r8
            r0.f105985d = r9
            r0.f105986e = r11
            r0.f105987f = r3
            r0.f105988g = r1
            r0.f105991j = r10
            r0.f105994m = r5
            java.lang.Object r1 = r4.a(r5, r3, r0)
            if (r1 != r2) goto L_0x00d1
            return r2
        L_0x00d1:
            com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6 r1 = (com.ingka.ikea.feature.inspire.datalayer.impl.v6.models.InspirationFeedRemoteV6) r1
        L_0x00d3:
            zr.a r9 = r1.b()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wr.C12299a.b(java.lang.String, int, dI.e):java.lang.Object");
    }
}
