package Le;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H@¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"LLe/d;", "", "LPe/d;", "placesClient", "<init>", "(LPe/d;)V", "", "componentValue", "LXH/N;", "c", "(Ljava/lang/String;)V", "searchString", "countryCode", "", "LJe/b;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "address", "lookupKey", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "b", "(LJe/b;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LPe/d;", "Ljava/lang/String;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Pe.d f61624a;

    /* renamed from: b  reason: collision with root package name */
    private String f61625b = "uninitialized";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.addresspicker.addresslookup.repo.GoogleLookupRepository", f = "AddressLookupRepository.kt", l = {141}, m = "fetchAddresses")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f61626c;

        /* renamed from: d  reason: collision with root package name */
        Object f61627d;

        /* renamed from: e  reason: collision with root package name */
        Object f61628e;

        /* renamed from: f  reason: collision with root package name */
        Object f61629f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f61630g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f61631h;

        /* renamed from: i  reason: collision with root package name */
        int f61632i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f61631h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61630g = obj;
            this.f61632i |= Integer.MIN_VALUE;
            return this.f61631h.a((String) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.addresspicker.addresslookup.repo.GoogleLookupRepository", f = "AddressLookupRepository.kt", l = {171}, m = "fetchPostalCodeAddress")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f61633c;

        /* renamed from: d  reason: collision with root package name */
        Object f61634d;

        /* renamed from: e  reason: collision with root package name */
        Object f61635e;

        /* renamed from: f  reason: collision with root package name */
        Object f61636f;

        /* renamed from: g  reason: collision with root package name */
        Object f61637g;

        /* renamed from: h  reason: collision with root package name */
        Object f61638h;

        /* renamed from: i  reason: collision with root package name */
        Object f61639i;

        /* renamed from: j  reason: collision with root package name */
        Object f61640j;

        /* renamed from: k  reason: collision with root package name */
        Object f61641k;

        /* renamed from: l  reason: collision with root package name */
        Object f61642l;

        /* renamed from: m  reason: collision with root package name */
        Object f61643m;

        /* renamed from: n  reason: collision with root package name */
        Object f61644n;

        /* renamed from: o  reason: collision with root package name */
        int f61645o;

        /* renamed from: p  reason: collision with root package name */
        int f61646p;

        /* renamed from: q  reason: collision with root package name */
        int f61647q;

        /* renamed from: r  reason: collision with root package name */
        int f61648r;

        /* renamed from: s  reason: collision with root package name */
        int f61649s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f61650t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ d f61651u;

        /* renamed from: v  reason: collision with root package name */
        int f61652v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f61651u = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61650t = obj;
            this.f61652v |= Integer.MIN_VALUE;
            return this.f61651u.b((Je.b) null, (String) null, this);
        }
    }

    public d(Pe.d dVar) {
        C17542s.j(dVar, "placesClient");
        this.f61624a = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078 A[LOOP:0: B:17:0x0072->B:19:0x0078, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r10, java.lang.String r11, dI.C17164e<? super java.util.List<? extends Je.b>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof Le.d.a
            if (r0 == 0) goto L_0x0014
            r0 = r12
            Le.d$a r0 = (Le.d.a) r0
            int r1 = r0.f61632i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f61632i = r1
        L_0x0012:
            r7 = r0
            goto L_0x001a
        L_0x0014:
            Le.d$a r0 = new Le.d$a
            r0.<init>(r9, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r7.f61630g
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r7.f61632i
            r2 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 != r2) goto L_0x003b
            java.lang.Object r10 = r7.f61629f
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r7.f61628e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r7.f61627d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r7.f61626c
            Le.d r10 = (Le.d) r10
            XH.y.b(r0)
            goto L_0x005f
        L_0x003b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0043:
            XH.y.b(r0)
            Pe.d r1 = r9.f61624a
            java.lang.String r6 = r9.f61625b
            r7.f61626c = r9
            r7.f61627d = r10
            r7.f61628e = r11
            r7.f61629f = r12
            r7.f61632i = r2
            r3 = 0
            r4 = 0
            r2 = r10
            r5 = r11
            java.lang.Object r0 = r1.c(r2, r3, r4, r5, r6, r7)
            if (r0 != r8) goto L_0x005f
            return r8
        L_0x005f:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = YH.C16877v.y(r0, r11)
            r10.<init>(r11)
            java.util.Iterator r11 = r0.iterator()
        L_0x0072:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0093
            java.lang.Object r12 = r11.next()
            Pe.d$a r12 = (Pe.d.a) r12
            Je.b$b r0 = new Je.b$b
            java.lang.String r1 = r12.b()
            java.lang.String r2 = r12.a()
            java.lang.String r12 = r12.c()
            r0.<init>(r1, r2, r12)
            r10.add(r0)
            goto L_0x0072
        L_0x0093:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Le.d.a(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0293 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(Je.b r35, java.lang.String r36, dI.C17164e<? super com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress> r37) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            boolean r4 = r3 instanceof Le.d.b
            if (r4 == 0) goto L_0x001b
            r4 = r3
            Le.d$b r4 = (Le.d.b) r4
            int r5 = r4.f61652v
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f61652v = r5
            goto L_0x0020
        L_0x001b:
            Le.d$b r4 = new Le.d$b
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r5 = r4.f61650t
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f61652v
            java.lang.String r8 = "|"
            java.lang.String r9 = "b"
            java.lang.String r10 = "m"
            java.lang.String r11 = "main"
            java.lang.String r12 = "Kt"
            r13 = 1
            if (r7 == 0) goto L_0x0079
            if (r7 != r13) goto L_0x0071
            java.lang.Object r1 = r4.f61643m
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r4.f61642l
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r4.f61641k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f61640j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f61639i
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r4.f61638h
            Le.d r1 = (Le.d) r1
            java.lang.Object r1 = r4.f61637g
            Le.d r1 = (Le.d) r1
            java.lang.Object r1 = r4.f61636f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r4.f61635e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r4.f61634d
            Je.b r2 = (Je.b) r2
            java.lang.Object r3 = r4.f61633c
            Le.d r3 = (Le.d) r3
            XH.y.b(r5)
            r23 = r9
            r25 = r10
            r33 = r2
            r2 = r1
            r1 = r33
            goto L_0x01b7
        L_0x0071:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0079:
            XH.y.b(r5)
            if (r2 == 0) goto L_0x0388
            java.lang.String r5 = "null cannot be cast to non-null type com.ingka.ikea.app.addresspicker.addresslookup.delegates.AddressEntryDelegateModel.PlacesAddressModel"
            kotlin.jvm.internal.C17542s.h(r1, r5)
            r5 = r1
            Je.b$b r5 = (Je.b.C1013b) r5
            qv.e r7 = qv.e.DEBUG
            qv.d r17 = qv.d.f102012a
            java.util.List r17 = r17.a()
            java.lang.Iterable r17 = (java.lang.Iterable) r17
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r17 = r17.iterator()
        L_0x0099:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x00b4
            java.lang.Object r15 = r17.next()
            r23 = r9
            r9 = r15
            qv.b r9 = (qv.C11819b) r9
            boolean r9 = r9.b(r7, r13)
            if (r9 == 0) goto L_0x00b1
            r14.add(r15)
        L_0x00b1:
            r9 = r23
            goto L_0x0099
        L_0x00b4:
            r23 = r9
            java.util.Iterator r9 = r14.iterator()
            r17 = r14
            r13 = 0
            r15 = 0
        L_0x00be:
            boolean r18 = r9.hasNext()
            if (r18 == 0) goto L_0x0168
            java.lang.Object r24 = r9.next()
            r17 = r24
            qv.b r17 = (qv.C11819b) r17
            r25 = r10
            if (r15 != 0) goto L_0x00f8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r26 = r6
            java.lang.String r6 = "Address selected with id: "
            r10.append(r6)
            r10.append(r1)
            java.lang.String r6 = r10.toString()
            r10 = 0
            java.lang.String r6 = qv.C11818a.a(r6, r10)
            if (r6 != 0) goto L_0x00f2
            r27 = r9
            r28 = r14
            r6 = r24
            goto L_0x0172
        L_0x00f2:
            java.lang.String r6 = qv.C11820c.a(r6)
            r15 = r6
            goto L_0x00fa
        L_0x00f8:
            r26 = r6
        L_0x00fa:
            if (r13 != 0) goto L_0x014a
            java.lang.Class<Le.d> r6 = Le.d.class
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r27 = r9
            r28 = r14
            r9 = 0
            r10 = 36
            r13 = 2
            java.lang.String r14 = HJ.C15854t.s1(r6, r10, r9, r13, r9)
            r10 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r10, r9, r13, r9)
            int r9 = r14.length()
            if (r9 != 0) goto L_0x011e
            goto L_0x0122
        L_0x011e:
            java.lang.String r6 = HJ.C15854t.P0(r14, r12)
        L_0x0122:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r10 = 1
            boolean r9 = HJ.C15854t.b0(r9, r11, r10)
            if (r9 == 0) goto L_0x0134
            r9 = r25
            goto L_0x0136
        L_0x0134:
            r9 = r23
        L_0x0136:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r8)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r13 = r6
            goto L_0x014e
        L_0x014a:
            r27 = r9
            r28 = r14
        L_0x014e:
            r20 = 1
            r18 = r7
            r19 = r13
            r6 = 0
            r21 = r6
            r22 = r15
            r17.a(r18, r19, r20, r21, r22)
            r17 = r24
            r10 = r25
            r6 = r26
            r9 = r27
            r14 = r28
            goto L_0x00be
        L_0x0168:
            r26 = r6
            r27 = r9
            r25 = r10
            r28 = r14
            r6 = r17
        L_0x0172:
            Pe.d r9 = r0.f61624a
            Oe.a r10 = new Oe.a
            java.lang.String r14 = r5.a()
            java.lang.String r5 = r5.b()
            r10.<init>(r14, r5)
            java.lang.String r5 = r0.f61625b
            r4.f61633c = r0
            r4.f61634d = r1
            r4.f61635e = r2
            r4.f61636f = r3
            r4.f61637g = r0
            r4.f61638h = r0
            r4.f61639i = r7
            r4.f61640j = r15
            r4.f61641k = r13
            r3 = r28
            r4.f61642l = r3
            r3 = r27
            r4.f61643m = r3
            r4.f61644n = r6
            r3 = 1
            r4.f61645o = r3
            r6 = 0
            r4.f61646p = r6
            r4.f61647q = r6
            r4.f61648r = r6
            r4.f61649s = r6
            r4.f61652v = r3
            java.lang.Object r5 = r9.b(r10, r5, r4)
            r3 = r26
            if (r5 != r3) goto L_0x01b6
            return r3
        L_0x01b6:
            r3 = r0
        L_0x01b7:
            Oe.l r5 = (Oe.l) r5
            com.google.android.libraries.places.api.model.Place r4 = r5.b()
            qv.e r5 = qv.e.DEBUG
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x01d0:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x01e8
            java.lang.Object r9 = r6.next()
            r10 = r9
            qv.b r10 = (qv.C11819b) r10
            r13 = 0
            boolean r10 = r10.b(r5, r13)
            if (r10 == 0) goto L_0x01d0
            r7.add(r9)
            goto L_0x01d0
        L_0x01e8:
            java.util.Iterator r6 = r7.iterator()
            r7 = 0
            r9 = 0
        L_0x01ee:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0267
            java.lang.Object r10 = r6.next()
            r17 = r10
            qv.b r17 = (qv.C11819b) r17
            r10 = 0
            if (r7 != 0) goto L_0x020c
            java.lang.String r7 = "Place fetched successfully"
            java.lang.String r7 = qv.C11818a.a(r7, r10)
            if (r7 != 0) goto L_0x0208
            goto L_0x0267
        L_0x0208:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x020c:
            if (r9 != 0) goto L_0x0258
            java.lang.Class r9 = r3.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r13 = 36
            r14 = 2
            r15 = 0
            java.lang.String r10 = HJ.C15854t.s1(r9, r13, r15, r14, r15)
            r13 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r13, r15, r14, r15)
            int r13 = r10.length()
            if (r13 != 0) goto L_0x022e
            goto L_0x0232
        L_0x022e:
            java.lang.String r9 = HJ.C15854t.P0(r10, r12)
        L_0x0232:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            r13 = 1
            boolean r10 = HJ.C15854t.b0(r10, r11, r13)
            if (r10 == 0) goto L_0x0244
            r10 = r25
            goto L_0x0246
        L_0x0244:
            r10 = r23
        L_0x0246:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r8)
            r13.append(r9)
            java.lang.String r9 = r13.toString()
        L_0x0258:
            r20 = 0
            r18 = r5
            r19 = r9
            r10 = 0
            r21 = r10
            r22 = r7
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x01ee
        L_0x0267:
            if (r4 == 0) goto L_0x029d
            com.google.android.libraries.places.api.model.AddressComponents r5 = r4.getAddressComponents()
            if (r5 == 0) goto L_0x029d
            java.util.List r5 = r5.asList()
            if (r5 == 0) goto L_0x029d
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x027b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0293
            java.lang.Object r9 = r5.next()
            r6 = r9
            com.google.android.libraries.places.api.model.AddressComponent r6 = (com.google.android.libraries.places.api.model.AddressComponent) r6
            java.util.List r6 = r6.getTypes()
            boolean r6 = r6.contains(r2)
            if (r6 == 0) goto L_0x027b
            goto L_0x0294
        L_0x0293:
            r9 = 0
        L_0x0294:
            com.google.android.libraries.places.api.model.AddressComponent r9 = (com.google.android.libraries.places.api.model.AddressComponent) r9
            if (r9 == 0) goto L_0x029d
            java.lang.String r9 = r9.getShortName()
            goto L_0x029e
        L_0x029d:
            r9 = 0
        L_0x029e:
            qv.e r2 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x02b1:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02c9
            java.lang.Object r7 = r5.next()
            r10 = r7
            qv.b r10 = (qv.C11819b) r10
            r13 = 1
            boolean r10 = r10.b(r2, r13)
            if (r10 == 0) goto L_0x02b1
            r6.add(r7)
            goto L_0x02b1
        L_0x02c9:
            java.util.Iterator r5 = r6.iterator()
            r6 = 0
            r7 = 0
        L_0x02cf:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0363
            java.lang.Object r10 = r5.next()
            r17 = r10
            qv.b r17 = (qv.C11819b) r17
            r10 = 0
            if (r6 != 0) goto L_0x0304
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "Place picker: "
            r6.append(r13)
            r6.append(r4)
            java.lang.String r13 = ", postalCode: "
            r6.append(r13)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = qv.C11818a.a(r6, r10)
            if (r6 != 0) goto L_0x0300
            goto L_0x0363
        L_0x0300:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x0304:
            if (r7 != 0) goto L_0x0351
            java.lang.Class r7 = r3.getClass()
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r13 = 36
            r14 = 2
            r15 = 0
            java.lang.String r10 = HJ.C15854t.s1(r7, r13, r15, r14, r15)
            r13 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r13, r15, r14, r15)
            int r16 = r10.length()
            if (r16 != 0) goto L_0x0326
            goto L_0x032a
        L_0x0326:
            java.lang.String r7 = HJ.C15854t.P0(r10, r12)
        L_0x032a:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            r13 = 1
            boolean r10 = HJ.C15854t.b0(r10, r11, r13)
            if (r10 == 0) goto L_0x033c
            r10 = r25
            goto L_0x033e
        L_0x033c:
            r10 = r23
        L_0x033e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r8)
            r13.append(r7)
            java.lang.String r7 = r13.toString()
            goto L_0x0353
        L_0x0351:
            r14 = 2
            r15 = 0
        L_0x0353:
            r20 = 1
            r18 = r2
            r19 = r7
            r10 = 0
            r21 = r10
            r22 = r6
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x02cf
        L_0x0363:
            if (r9 == 0) goto L_0x0385
            int r2 = r9.length()
            if (r2 == 0) goto L_0x0385
            com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress r2 = new com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress
            Je.b$b r1 = (Je.b.C1013b) r1
            java.lang.String r28 = r1.a()
            java.lang.String r29 = r1.c()
            r31 = 8
            r32 = 0
            r30 = 0
            r26 = r2
            r27 = r9
            r26.<init>(r27, r28, r29, r30, r31, r32)
            return r2
        L_0x0385:
            Le.e r1 = Le.e.f61653a
            throw r1
        L_0x0388:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Missing lookup key"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Le.d.b(Je.b, java.lang.String, dI.e):java.lang.Object");
    }

    public final void c(String str) {
        C17542s.j(str, "componentValue");
        this.f61625b = str;
        this.f61624a.a(str);
    }
}
