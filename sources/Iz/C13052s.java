package Iz;

import FB.C12863d;
import XH.x;
import android.net.Uri;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001\u001dB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH@¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\u0006\u0010\u001b\u001a\u00020\u001aH@¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"¨\u0006$"}, d2 = {"LIz/s;", "LIz/r;", "LFB/d;", "storeRepository", "LRy/a;", "scanAndGoSettingsRepo", "<init>", "(LFB/d;LRy/a;)V", "", "marketCode", "languageCode", "storeId", "additionalInfo", "LXH/x;", "LIz/t$b;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "string", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "e", "(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;", "countryCode", "LEB/c;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "LIz/t;", "a", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LFB/d;", "LRy/a;", "c", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Iz.s  reason: case insensitive filesystem */
public final class C13052s implements r {

    /* renamed from: c  reason: collision with root package name */
    public static final a f111115c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f111116d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C12863d f111117a;

    /* renamed from: b  reason: collision with root package name */
    private final Ry.a f111118b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"LIz/s$a;", "", "<init>", "()V", "", "DELIMITER", "Ljava/lang/String;", "", "ITEMS", "I", "MARKET_CODE_INDEX", "LANGUAGE_CODE_INDEX", "STORE_ID_INDEX", "ADDITIONAL_INFO_INDEX", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Iz.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.navigation.ScanAndGoDeepLinkExtractorImpl", f = "ScanAndGoDeepLinkExtractorImpl.kt", l = {42, 57}, m = "extractDeepLinkParameters-gIAlu-s")
    /* renamed from: Iz.s$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f111119c;

        /* renamed from: d  reason: collision with root package name */
        Object f111120d;

        /* renamed from: e  reason: collision with root package name */
        Object f111121e;

        /* renamed from: f  reason: collision with root package name */
        Object f111122f;

        /* renamed from: g  reason: collision with root package name */
        Object f111123g;

        /* renamed from: h  reason: collision with root package name */
        Object f111124h;

        /* renamed from: i  reason: collision with root package name */
        Object f111125i;

        /* renamed from: j  reason: collision with root package name */
        Object f111126j;

        /* renamed from: k  reason: collision with root package name */
        Object f111127k;

        /* renamed from: l  reason: collision with root package name */
        Object f111128l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f111129m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C13052s f111130n;

        /* renamed from: o  reason: collision with root package name */
        int f111131o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C13052s sVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f111130n = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111129m = obj;
            this.f111131o |= Integer.MIN_VALUE;
            Object a10 = this.f111130n.a((Uri) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.navigation.ScanAndGoDeepLinkExtractorImpl", f = "ScanAndGoDeepLinkExtractorImpl.kt", l = {73, 87}, m = "fromStoreId-0E7RQCE")
    /* renamed from: Iz.s$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f111132c;

        /* renamed from: d  reason: collision with root package name */
        Object f111133d;

        /* renamed from: e  reason: collision with root package name */
        Object f111134e;

        /* renamed from: f  reason: collision with root package name */
        Object f111135f;

        /* renamed from: g  reason: collision with root package name */
        Object f111136g;

        /* renamed from: h  reason: collision with root package name */
        Object f111137h;

        /* renamed from: i  reason: collision with root package name */
        Object f111138i;

        /* renamed from: j  reason: collision with root package name */
        Object f111139j;

        /* renamed from: k  reason: collision with root package name */
        Object f111140k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f111141l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C13052s f111142m;

        /* renamed from: n  reason: collision with root package name */
        int f111143n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C13052s sVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f111142m = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111141l = obj;
            this.f111143n |= Integer.MIN_VALUE;
            Object b10 = this.f111142m.b((String) null, (String) null, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.navigation.ScanAndGoDeepLinkExtractorImpl", f = "ScanAndGoDeepLinkExtractorImpl.kt", l = {125}, m = "tryFromScanAndGoStore-yxL6bBk")
    /* renamed from: Iz.s$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f111144c;

        /* renamed from: d  reason: collision with root package name */
        Object f111145d;

        /* renamed from: e  reason: collision with root package name */
        Object f111146e;

        /* renamed from: f  reason: collision with root package name */
        Object f111147f;

        /* renamed from: g  reason: collision with root package name */
        Object f111148g;

        /* renamed from: h  reason: collision with root package name */
        Object f111149h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f111150i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C13052s f111151j;

        /* renamed from: k  reason: collision with root package name */
        int f111152k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C13052s sVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f111151j = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111150i = obj;
            this.f111152k |= Integer.MIN_VALUE;
            Object c10 = this.f111151j.f((String) null, (String) null, (String) null, (String) null, this);
            return c10 == C17187b.f() ? c10 : x.a(c10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.navigation.ScanAndGoDeepLinkExtractorImpl", f = "ScanAndGoDeepLinkExtractorImpl.kt", l = {152}, m = "validStoreRepresentationOrNull")
    /* renamed from: Iz.s$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f111153c;

        /* renamed from: d  reason: collision with root package name */
        Object f111154d;

        /* renamed from: e  reason: collision with root package name */
        Object f111155e;

        /* renamed from: f  reason: collision with root package name */
        Object f111156f;

        /* renamed from: g  reason: collision with root package name */
        Object f111157g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f111158h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C13052s f111159i;

        /* renamed from: j  reason: collision with root package name */
        int f111160j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C13052s sVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f111159i = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111158h = obj;
            this.f111160j |= Integer.MIN_VALUE;
            return this.f111159i.g((String) null, (String) null, (String) null, this);
        }
    }

    public C13052s(C12863d dVar, Ry.a aVar) {
        C17542s.j(dVar, "storeRepository");
        C17542s.j(aVar, "scanAndGoSettingsRepo");
        this.f111117a = dVar;
        this.f111118b = aVar;
    }

    private final IllegalArgumentException e(String str) {
        return new IllegalArgumentException(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, dI.C17164e<? super XH.x<Iz.C13053t.b>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof Iz.C13052s.d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            Iz.s$d r0 = (Iz.C13052s.d) r0
            int r1 = r0.f111152k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111152k = r1
            goto L_0x0018
        L_0x0013:
            Iz.s$d r0 = new Iz.s$d
            r0.<init>(r9, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f111150i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111152k
            r4 = 1
            if (r3 == 0) goto L_0x0056
            if (r3 != r4) goto L_0x004e
            java.lang.Object r10 = r0.f111149h
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f111148g
            r13 = r10
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r10 = r0.f111147f
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r10 = r0.f111146e
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.f111145d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r14 = r0.f111144c
            Iz.s r14 = (Iz.C13052s) r14
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r0 = r1.j()
        L_0x0049:
            r4 = r10
            r5 = r11
            r7 = r12
            r6 = r13
            goto L_0x0072
        L_0x004e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0056:
            XH.y.b(r1)
            Ry.a r1 = r9.f111118b
            r0.f111144c = r9
            r0.f111145d = r10
            r0.f111146e = r11
            r0.f111147f = r12
            r0.f111148g = r13
            r0.f111149h = r14
            r0.f111152k = r4
            java.lang.Object r0 = r1.c(r12, r0)
            if (r0 != r2) goto L_0x0070
            return r2
        L_0x0070:
            r14 = r9
            goto L_0x0049
        L_0x0072:
            boolean r10 = XH.x.g(r0)
            if (r10 == 0) goto L_0x0079
            r0 = 0
        L_0x0079:
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r0 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r0
            if (r0 == 0) goto L_0x008c
            java.lang.String r8 = r0.n()
            Iz.t$b r10 = new Iz.t$b
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r10 = XH.x.b(r10)
            goto L_0x009a
        L_0x008c:
            java.lang.String r10 = "A store doesnt exist that matches the wanted parameters"
            java.lang.IllegalArgumentException r10 = r14.e(r10)
            java.lang.Object r10 = XH.y.a(r10)
            java.lang.Object r10 = XH.x.b(r10)
        L_0x009a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Iz.C13052s.f(java.lang.String, java.lang.String, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.lang.String r7, java.lang.String r8, java.lang.String r9, dI.C17164e<? super EB.C12831c> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof Iz.C13052s.e
            if (r0 == 0) goto L_0x0013
            r0 = r10
            Iz.s$e r0 = (Iz.C13052s.e) r0
            int r1 = r0.f111160j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111160j = r1
            goto L_0x0018
        L_0x0013:
            Iz.s$e r0 = new Iz.s$e
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f111158h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111160j
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0046
            if (r3 != r5) goto L_0x003e
            java.lang.Object r7 = r0.f111157g
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f111156f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f111155e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f111154d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f111153c
            Iz.s r7 = (Iz.C13052s) r7
            XH.y.b(r1)     // Catch:{ IOException -> 0x0069 }
            goto L_0x005e
        L_0x003e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0046:
            XH.y.b(r1)
            FB.d r1 = r6.f111117a     // Catch:{ IOException -> 0x0069 }
            r0.f111153c = r6     // Catch:{ IOException -> 0x0069 }
            r0.f111154d = r7     // Catch:{ IOException -> 0x0069 }
            r0.f111155e = r8     // Catch:{ IOException -> 0x0069 }
            r0.f111156f = r9     // Catch:{ IOException -> 0x0069 }
            r0.f111157g = r10     // Catch:{ IOException -> 0x0069 }
            r0.f111160j = r5     // Catch:{ IOException -> 0x0069 }
            java.lang.Object r1 = r1.a(r7, r8, r9, r0)     // Catch:{ IOException -> 0x0069 }
            if (r1 != r2) goto L_0x005e
            return r2
        L_0x005e:
            EB.c r1 = (EB.C12831c) r1     // Catch:{ IOException -> 0x0069 }
            if (r1 == 0) goto L_0x0069
            boolean r7 = r1.i()     // Catch:{ IOException -> 0x0069 }
            if (r7 != r5) goto L_0x0069
            r4 = r1
        L_0x0069:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Iz.C13052s.g(java.lang.String, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(android.net.Uri r23, dI.C17164e<? super XH.x<? extends Iz.C13053t>> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof Iz.C13052s.b
            if (r2 == 0) goto L_0x0018
            r2 = r1
            Iz.s$b r2 = (Iz.C13052s.b) r2
            int r3 = r2.f111131o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f111131o = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            Iz.s$b r2 = new Iz.s$b
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r8.f111129m
            java.lang.Object r9 = eI.C17187b.f()
            int r3 = r8.f111131o
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x009e
            if (r3 == r5) goto L_0x0069
            if (r3 != r4) goto L_0x0061
            java.lang.Object r1 = r8.f111128l
            EB.c r1 = (EB.C12831c) r1
            java.lang.Object r1 = r8.f111127k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r8.f111126j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r8.f111125i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r8.f111124h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r8.f111123g
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r8.f111122f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r8.f111121e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r8.f111120d
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r1 = r8.f111119c
            Iz.s r1 = (Iz.C13052s) r1
            XH.y.b(r2)
            XH.x r2 = (XH.x) r2
            java.lang.Object r1 = r2.j()
            goto L_0x0159
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0069:
            java.lang.Object r1 = r8.f111127k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r8.f111126j
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r8.f111125i
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r8.f111124h
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r8.f111123g
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r10 = r8.f111122f
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.f111121e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r8.f111120d
            android.net.Uri r12 = (android.net.Uri) r12
            java.lang.Object r13 = r8.f111119c
            Iz.s r13 = (Iz.C13052s) r13
            XH.y.b(r2)
            r20 = r11
            r11 = r1
            r1 = r20
            r21 = r7
            r7 = r3
            r3 = r13
            r13 = r10
            r10 = r21
            goto L_0x0119
        L_0x009e:
            XH.y.b(r2)
            java.lang.String r10 = r23.getLastPathSegment()
            if (r10 == 0) goto L_0x0149
            int r2 = r10.length()
            if (r2 != 0) goto L_0x00af
            goto L_0x0149
        L_0x00af:
            java.lang.String r2 = "-"
            java.lang.String[] r15 = new java.lang.String[]{r2}
            r18 = 6
            r19 = 0
            r16 = 0
            r17 = 0
            r14 = r10
            java.util.List r7 = HJ.C15854t.Y0(r14, r15, r16, r17, r18, r19)
            int r2 = r7.size()
            r3 = 4
            if (r2 == r3) goto L_0x00db
            XH.x$a r1 = XH.x.f139812b
            java.lang.String r1 = "Last path segment is not following the scheme"
            java.lang.IllegalArgumentException r1 = r0.e(r1)
            java.lang.Object r1 = XH.y.a(r1)
            java.lang.Object r1 = XH.x.b(r1)
            goto L_0x0159
        L_0x00db:
            r2 = 0
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r6 = r7.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            r11 = 3
            java.lang.Object r11 = r7.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r8.f111119c = r0
            r12 = r23
            r8.f111120d = r12
            r8.f111121e = r1
            r8.f111122f = r10
            r8.f111123g = r7
            r8.f111124h = r2
            r8.f111125i = r3
            r8.f111126j = r6
            r8.f111127k = r11
            r8.f111131o = r5
            java.lang.Object r5 = r0.g(r2, r3, r6, r8)
            if (r5 != r9) goto L_0x0112
            return r9
        L_0x0112:
            r13 = r10
            r10 = r7
            r7 = r6
            r6 = r2
            r2 = r5
            r5 = r3
            r3 = r0
        L_0x0119:
            EB.c r2 = (EB.C12831c) r2
            if (r2 == 0) goto L_0x0129
            XH.x$a r1 = XH.x.f139812b
            Iz.t$a r1 = new Iz.t$a
            r1.<init>(r6, r5, r11, r2)
            java.lang.Object r1 = XH.x.b(r1)
            goto L_0x0159
        L_0x0129:
            r8.f111119c = r3
            r8.f111120d = r12
            r8.f111121e = r1
            r8.f111122f = r13
            r8.f111123g = r10
            r8.f111124h = r6
            r8.f111125i = r5
            r8.f111126j = r7
            r8.f111127k = r11
            r8.f111128l = r2
            r8.f111131o = r4
            r4 = r6
            r6 = r7
            r7 = r11
            java.lang.Object r1 = r3.f(r4, r5, r6, r7, r8)
            if (r1 != r9) goto L_0x0159
            return r9
        L_0x0149:
            XH.x$a r1 = XH.x.f139812b
            java.lang.String r1 = "Last path segment is missing"
            java.lang.IllegalArgumentException r1 = r0.e(r1)
            java.lang.Object r1 = XH.y.a(r1)
            java.lang.Object r1 = XH.x.b(r1)
        L_0x0159:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Iz.C13052s.a(android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r19, java.lang.String r20, dI.C17164e<? super XH.x<? extends Iz.C13053t>> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            boolean r3 = r2 instanceof Iz.C13052s.c
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Iz.s$c r3 = (Iz.C13052s.c) r3
            int r4 = r3.f111143n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f111143n = r4
            goto L_0x001e
        L_0x0019:
            Iz.s$c r3 = new Iz.s$c
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f111141l
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f111143n
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x0083
            if (r6 == r8) goto L_0x0063
            if (r6 != r7) goto L_0x005b
            java.lang.Object r1 = r3.f111140k
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r1 = r3.f111139j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.f111138i
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r3.f111137h
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r5 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r5
            java.lang.Object r5 = r3.f111136g
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r5 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r5
            java.lang.Object r6 = r3.f111135f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r3.f111134e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r3.f111133d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r3.f111132c
            Iz.s r3 = (Iz.C13052s) r3
            XH.y.b(r4)
            r13 = r1
            r12 = r2
            r14 = r6
            r15 = r7
            goto L_0x00fb
        L_0x005b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0063:
            java.lang.Object r1 = r3.f111135f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r3.f111134e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r3.f111133d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r3.f111132c
            Iz.s r8 = (Iz.C13052s) r8
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r4 = r4.j()
            r17 = r4
            r4 = r1
            r1 = r6
        L_0x0080:
            r6 = r17
            goto L_0x00a1
        L_0x0083:
            XH.y.b(r4)
            Ry.a r4 = r0.f111118b
            r3.f111132c = r0
            r3.f111133d = r1
            r6 = r20
            r3.f111134e = r6
            r3.f111135f = r2
            r3.f111143n = r8
            java.lang.Object r4 = r4.c(r1, r3)
            if (r4 != r5) goto L_0x009b
            return r5
        L_0x009b:
            r8 = r0
            r17 = r4
            r4 = r2
            r2 = r6
            goto L_0x0080
        L_0x00a1:
            boolean r9 = XH.x.g(r6)
            r10 = 0
            if (r9 == 0) goto L_0x00a9
            r6 = r10
        L_0x00a9:
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r6 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r6
            if (r6 != 0) goto L_0x00b9
            Iz.r$a$a r1 = Iz.r.a.C2692a.f111114a
            java.lang.Object r1 = XH.y.a(r1)
            java.lang.Object r1 = XH.x.b(r1)
            goto L_0x0139
        L_0x00b9:
            java.lang.String r9 = r6.g()
            java.util.List r11 = r6.k()
            if (r11 == 0) goto L_0x00c9
            java.lang.Object r10 = YH.C16877v.y0(r11)
            java.lang.String r10 = (java.lang.String) r10
        L_0x00c9:
            if (r9 == 0) goto L_0x011c
            int r11 = r9.length()
            if (r11 != 0) goto L_0x00d2
            goto L_0x011c
        L_0x00d2:
            if (r10 == 0) goto L_0x011c
            int r11 = r10.length()
            if (r11 != 0) goto L_0x00db
            goto L_0x011c
        L_0x00db:
            r3.f111132c = r8
            r3.f111133d = r1
            r3.f111134e = r2
            r3.f111135f = r4
            r3.f111136g = r6
            r3.f111137h = r6
            r3.f111138i = r9
            r3.f111139j = r10
            r3.f111140k = r10
            r3.f111143n = r7
            java.lang.Object r4 = r8.g(r9, r10, r1, r3)
            if (r4 != r5) goto L_0x00f6
            return r5
        L_0x00f6:
            r15 = r1
            r14 = r2
            r5 = r6
            r12 = r9
            r13 = r10
        L_0x00fb:
            EB.c r4 = (EB.C12831c) r4
            if (r4 == 0) goto L_0x010b
            XH.x$a r1 = XH.x.f139812b
            Iz.t$a r1 = new Iz.t$a
            r1.<init>(r12, r13, r14, r4)
            java.lang.Object r1 = XH.x.b(r1)
            goto L_0x011b
        L_0x010b:
            XH.x$a r1 = XH.x.f139812b
            java.lang.String r16 = r5.n()
            Iz.t$b r1 = new Iz.t$b
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Object r1 = XH.x.b(r1)
        L_0x011b:
            return r1
        L_0x011c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to get cc/lc for store with id: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r1 = r8.e(r1)
            java.lang.Object r1 = XH.y.a(r1)
            java.lang.Object r1 = XH.x.b(r1)
        L_0x0139:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Iz.C13052s.b(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
