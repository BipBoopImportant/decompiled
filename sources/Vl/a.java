package Vl;

import HJ.C15854t;
import XH.C16796C;
import YH.X;
import android.net.Uri;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u0017\u0010\u000eJ\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u0019\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LVl/a;", "LYl/b;", "LWl/b;", "linkItRemoteSource", "LUl/a;", "linkItAnalytics", "LVl/b;", "utmIdGenerator", "<init>", "(LWl/b;LUl/a;LVl/b;)V", "Landroid/net/Uri;", "uri", "LYl/a;", "e", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "fallbackDesktopUri", "LXH/N;", "g", "(Ljava/lang/String;)V", "appLink", "d", "(Ljava/lang/String;)Ljava/lang/String;", "f", "LYl/b$a;", "a", "LWl/b;", "b", "LUl/a;", "c", "LVl/b;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Yl.b {

    /* renamed from: d  reason: collision with root package name */
    public static final C1876a f88685d = new C1876a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, String> f88686e = X.m(C16796C.a("link", "link"), C16796C.a("fbd", "fbd"), C16796C.a("utm_source", "utm_source"), C16796C.a("utm_medium", "utm_medium"), C16796C.a("utm_content", "utm_content"), C16796C.a("utm_campaign", "utm_campaign"), C16796C.a("guid", "guid"));

    /* renamed from: a  reason: collision with root package name */
    private final Wl.b f88687a;

    /* renamed from: b  reason: collision with root package name */
    private final Ul.a f88688b;

    /* renamed from: c  reason: collision with root package name */
    private final b f88689c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LVl/a$a;", "", "<init>", "()V", "", "LINK", "Ljava/lang/String;", "DESKTOP_FALLBACK", "OVERRIDE_FALLBACK", "UTM_SOURCE", "UTM_MEDIUM", "UTM_CONTENT", "UTM_CAMPAIGN", "UTM_TERM", "GUID", "FALLBACK_DESKTOP_HOST", "", "requiredParameterList", "Ljava/util/Map;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vl.a$a  reason: collision with other inner class name */
    public static final class C1876a {
        public /* synthetic */ C1876a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1876a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appfoundation.linkit.impl.data.LinkItRepositoryImpl", f = "LinkItRepositoryImpl.kt", l = {25, 27}, m = "resolveLink")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f88690c;

        /* renamed from: d  reason: collision with root package name */
        Object f88691d;

        /* renamed from: e  reason: collision with root package name */
        Object f88692e;

        /* renamed from: f  reason: collision with root package name */
        int f88693f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f88694g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f88695h;

        /* renamed from: i  reason: collision with root package name */
        int f88696i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f88695h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f88694g = obj;
            this.f88696i |= Integer.MIN_VALUE;
            return this.f88695h.a((Uri) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appfoundation.linkit.impl.data.LinkItRepositoryImpl", f = "LinkItRepositoryImpl.kt", l = {67}, m = "resolveRuntimeLink")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f88697c;

        /* renamed from: d  reason: collision with root package name */
        Object f88698d;

        /* renamed from: e  reason: collision with root package name */
        Object f88699e;

        /* renamed from: f  reason: collision with root package name */
        Object f88700f;

        /* renamed from: g  reason: collision with root package name */
        Object f88701g;

        /* renamed from: h  reason: collision with root package name */
        Object f88702h;

        /* renamed from: i  reason: collision with root package name */
        int f88703i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f88704j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ a f88705k;

        /* renamed from: l  reason: collision with root package name */
        int f88706l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f88705k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f88704j = obj;
            this.f88706l |= Integer.MIN_VALUE;
            return this.f88705k.e((Uri) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appfoundation.linkit.impl.data.LinkItRepositoryImpl", f = "LinkItRepositoryImpl.kt", l = {123}, m = "resolveShortLink")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f88707c;

        /* renamed from: d  reason: collision with root package name */
        Object f88708d;

        /* renamed from: e  reason: collision with root package name */
        Object f88709e;

        /* renamed from: f  reason: collision with root package name */
        Object f88710f;

        /* renamed from: g  reason: collision with root package name */
        Object f88711g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f88712h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f88713i;

        /* renamed from: j  reason: collision with root package name */
        int f88714j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f88713i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f88712h = obj;
            this.f88714j |= Integer.MIN_VALUE;
            return this.f88713i.f((Uri) null, this);
        }
    }

    public a(Wl.b bVar, Ul.a aVar, b bVar2) {
        C17542s.j(bVar, "linkItRemoteSource");
        C17542s.j(aVar, "linkItAnalytics");
        C17542s.j(bVar2, "utmIdGenerator");
        this.f88687a = bVar;
        this.f88688b = aVar;
        this.f88689c = bVar2;
    }

    private final String d(String str) {
        String decode = Uri.decode(str);
        C17542s.i(decode, "decode(...)");
        return decode;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(android.net.Uri r23, dI.C17164e<? super Yl.a> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            boolean r3 = r2 instanceof Vl.a.c
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Vl.a$c r3 = (Vl.a.c) r3
            int r4 = r3.f88706l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f88706l = r4
            goto L_0x001e
        L_0x0019:
            Vl.a$c r3 = new Vl.a$c
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f88704j
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f88706l
            r7 = 1
            java.lang.String r8 = "guid"
            if (r6 == 0) goto L_0x0054
            if (r6 != r7) goto L_0x004c
            java.lang.Object r1 = r3.f88702h
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f88701g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.f88700f
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r5 = r3.f88699e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r3.f88698d
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.Object r3 = r3.f88697c
            Vl.a r3 = (Vl.a) r3
            XH.y.b(r4)
            r9 = r1
            r1 = r5
            goto L_0x00e0
        L_0x004c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0054:
            XH.y.b(r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Map<java.lang.String, java.lang.String> r6 = f88686e
            java.util.Set r6 = r6.keySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0068:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00ba
            java.lang.Object r9 = r6.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r1.getQueryParameter(r9)
            java.lang.String r11 = "Uri missing "
            if (r10 == 0) goto L_0x00a0
            boolean r12 = HJ.C15854t.v0(r10)
            if (r12 != 0) goto L_0x0086
            r4.put(r9, r10)
            goto L_0x0068
        L_0x0086:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r9)
            java.lang.String r3 = " parameter value"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00a0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r9)
            java.lang.String r3 = " parameter"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00ba:
            java.lang.Object r9 = YH.X.k(r4, r8)
            java.lang.String r9 = (java.lang.String) r9
            Wl.b r10 = r0.f88687a
            r3.f88697c = r0
            r3.f88698d = r1
            r3.f88699e = r2
            r3.f88700f = r4
            r3.f88701g = r9
            r3.f88702h = r6
            r2 = 0
            r3.f88703i = r2
            r3.f88706l = r7
            java.lang.Object r2 = r10.a(r9, r3)
            if (r2 != r5) goto L_0x00da
            return r5
        L_0x00da:
            r3 = r0
            r21 = r4
            r4 = r2
            r2 = r21
        L_0x00e0:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x019a
            java.lang.String r4 = "fbd"
            java.lang.Object r4 = YH.X.k(r2, r4)
            java.lang.String r4 = (java.lang.String) r4
            r3.g(r4)
            java.lang.String r5 = "link"
            java.lang.Object r6 = YH.X.k(r2, r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r3.d(r6)
            java.lang.String r7 = "utm_term"
            java.lang.String r7 = r1.getQueryParameter(r7)
            java.lang.String r9 = ""
            if (r7 != 0) goto L_0x010a
            r7 = r9
        L_0x010a:
            Vl.b r3 = r3.f88689c
            java.lang.Object r5 = YH.X.k(r2, r5)
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r5 = "fbo"
            java.lang.Object r5 = r2.getOrDefault(r5, r9)
            r17 = r5
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r5 = YH.X.k(r2, r8)
            r16 = r5
            java.lang.String r16 = (java.lang.String) r16
            java.lang.String r5 = "utm_medium"
            java.lang.Object r9 = YH.X.k(r2, r5)
            r13 = r9
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r15 = "utm_content"
            java.lang.Object r9 = YH.X.k(r2, r15)
            r18 = r9
            java.lang.String r18 = (java.lang.String) r18
            java.lang.String r14 = "utm_campaign"
            java.lang.Object r9 = YH.X.k(r2, r14)
            r19 = r9
            java.lang.String r19 = (java.lang.String) r19
            java.lang.String r12 = "utm_source"
            java.lang.Object r9 = YH.X.k(r2, r12)
            r20 = r9
            java.lang.String r20 = (java.lang.String) r20
            r9 = r3
            r11 = r4
            r3 = r12
            r12 = r20
            r0 = r14
            r14 = r19
            r23 = r4
            r4 = r15
            r15 = r18
            r18 = r7
            java.lang.String r19 = r9.a(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            Yl.a r20 = new Yl.a
            java.lang.String r10 = r1.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r10, r1)
            java.lang.Object r1 = YH.X.k(r2, r3)
            r13 = r1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r1 = YH.X.k(r2, r5)
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r1 = YH.X.k(r2, r4)
            r15 = r1
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r0 = YH.X.k(r2, r0)
            r16 = r0
            java.lang.String r16 = (java.lang.String) r16
            java.lang.Object r0 = YH.X.k(r2, r8)
            r18 = r0
            java.lang.String r18 = (java.lang.String) r18
            r9 = r20
            r11 = r6
            r12 = r23
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r20
        L_0x019a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Id is not valid, "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Vl.a.e(android.net.Uri, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(android.net.Uri r19, dI.C17164e<? super Yl.a> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof Vl.a.d
            if (r2 == 0) goto L_0x0017
            r2 = r1
            Vl.a$d r2 = (Vl.a.d) r2
            int r3 = r2.f88714j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f88714j = r3
            goto L_0x001c
        L_0x0017:
            Vl.a$d r2 = new Vl.a$d
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f88712h
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f88714j
            java.lang.String r6 = ""
            r7 = 1
            if (r5 == 0) goto L_0x004b
            if (r5 != r7) goto L_0x0043
            java.lang.Object r1 = r2.f88711g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f88710f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f88709e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f88708d
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r2 = r2.f88707c
            Vl.a r2 = (Vl.a) r2
            XH.y.b(r3)
            goto L_0x0070
        L_0x0043:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004b:
            XH.y.b(r3)
            java.lang.String r3 = r19.getLastPathSegment()
            if (r3 != 0) goto L_0x0056
            r5 = r6
            goto L_0x0057
        L_0x0056:
            r5 = r3
        L_0x0057:
            Wl.b r8 = r0.f88687a
            r2.f88707c = r0
            r9 = r19
            r2.f88708d = r9
            r2.f88709e = r1
            r2.f88710f = r5
            r2.f88711g = r3
            r2.f88714j = r7
            java.lang.Object r3 = r8.b(r5, r2)
            if (r3 != r4) goto L_0x006e
            return r4
        L_0x006e:
            r2 = r0
            r1 = r9
        L_0x0070:
            com.ingka.ikea.appfoundation.linkit.impl.data.model.LinkItMetadataRemote r3 = (com.ingka.ikea.appfoundation.linkit.impl.data.model.LinkItMetadataRemote) r3
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r4 = r3.a()
            boolean r4 = HJ.C15854t.v0(r4)
            if (r4 == 0) goto L_0x0086
            java.lang.String r4 = "link"
            r7.add(r4)
        L_0x0086:
            java.lang.String r4 = r3.b()
            boolean r4 = HJ.C15854t.v0(r4)
            if (r4 == 0) goto L_0x0095
            java.lang.String r4 = "fbd"
            r7.add(r4)
        L_0x0095:
            com.ingka.ikea.appfoundation.linkit.impl.data.model.UtmRemote r4 = r3.d()
            java.lang.String r4 = r4.d()
            boolean r4 = HJ.C15854t.v0(r4)
            if (r4 == 0) goto L_0x00a8
            java.lang.String r4 = "utm_source"
            r7.add(r4)
        L_0x00a8:
            com.ingka.ikea.appfoundation.linkit.impl.data.model.UtmRemote r4 = r3.d()
            java.lang.String r4 = r4.c()
            boolean r4 = HJ.C15854t.v0(r4)
            if (r4 == 0) goto L_0x00bb
            java.lang.String r4 = "utm_medium"
            r7.add(r4)
        L_0x00bb:
            com.ingka.ikea.appfoundation.linkit.impl.data.model.UtmRemote r4 = r3.d()
            java.lang.String r4 = r4.b()
            boolean r4 = HJ.C15854t.v0(r4)
            if (r4 == 0) goto L_0x00ce
            java.lang.String r4 = "utm_content"
            r7.add(r4)
        L_0x00ce:
            com.ingka.ikea.appfoundation.linkit.impl.data.model.UtmRemote r4 = r3.d()
            java.lang.String r4 = r4.a()
            boolean r4 = HJ.C15854t.v0(r4)
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = "utm_campaign"
            r7.add(r4)
        L_0x00e1:
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L_0x0139
            java.lang.String r4 = r3.b()
            r2.g(r4)
            java.lang.String r8 = r1.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r8, r1)
            java.lang.String r9 = r3.a()
            java.lang.String r10 = r3.b()
            com.ingka.ikea.appfoundation.linkit.impl.data.model.UtmRemote r1 = r3.d()
            java.lang.String r11 = r1.d()
            com.ingka.ikea.appfoundation.linkit.impl.data.model.UtmRemote r1 = r3.d()
            java.lang.String r12 = r1.c()
            com.ingka.ikea.appfoundation.linkit.impl.data.model.UtmRemote r1 = r3.d()
            java.lang.String r13 = r1.b()
            com.ingka.ikea.appfoundation.linkit.impl.data.model.UtmRemote r1 = r3.d()
            java.lang.String r14 = r1.a()
            java.lang.String r17 = r3.c()
            com.ingka.ikea.appfoundation.linkit.impl.data.model.UtmRemote r1 = r3.d()
            java.lang.String r1 = r1.e()
            if (r1 != 0) goto L_0x012f
            r15 = r6
            goto L_0x0130
        L_0x012f:
            r15 = r1
        L_0x0130:
            Yl.a r1 = new Yl.a
            java.lang.String r16 = ""
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x0139:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r14 = 62
            r15 = 0
            java.lang.String r8 = ", "
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r2 = YH.C16877v.G0(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Uri missing "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " parameter value"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Vl.a.f(android.net.Uri, dI.e):java.lang.Object");
    }

    private final void g(String str) {
        String host = Uri.parse(str).getHost();
        if (host != null && !C15854t.G(host, "ikea.com", false, 2, (Object) null)) {
            throw new IllegalArgumentException("Invalid desktop fallback uri, " + str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(android.net.Uri r9, dI.C17164e<? super Yl.b.a> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "parse(...)"
            boolean r1 = r10 instanceof Vl.a.b
            if (r1 == 0) goto L_0x0015
            r1 = r10
            Vl.a$b r1 = (Vl.a.b) r1
            int r2 = r1.f88696i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f88696i = r2
            goto L_0x001a
        L_0x0015:
            Vl.a$b r1 = new Vl.a$b
            r1.<init>(r8, r10)
        L_0x001a:
            java.lang.Object r2 = r1.f88694g
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r1.f88696i
            r5 = 2
            java.lang.String r6 = "Unknown error"
            r7 = 1
            if (r4 == 0) goto L_0x0060
            if (r4 == r7) goto L_0x0050
            if (r4 != r5) goto L_0x0048
            java.lang.Object r9 = r1.f88692e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r1.f88691d
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.Object r9 = r1.f88690c
            Vl.a r9 = (Vl.a) r9
            XH.y.b(r2)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            goto L_0x0081
        L_0x003c:
            r9 = move-exception
            goto L_0x00d0
        L_0x003f:
            r9 = move-exception
            goto L_0x00df
        L_0x0042:
            r9 = move-exception
            goto L_0x00ed
        L_0x0045:
            r9 = move-exception
            goto L_0x00fc
        L_0x0048:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0050:
            java.lang.Object r9 = r1.f88692e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r1.f88691d
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.Object r9 = r1.f88690c
            Vl.a r9 = (Vl.a) r9
            XH.y.b(r2)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            goto L_0x00ad
        L_0x0060:
            XH.y.b(r2)
            java.util.List r2 = r9.getPathSegments()     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            int r2 = r2.size()     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            if (r2 == 0) goto L_0x009b
            if (r2 != r7) goto L_0x0084
            r1.f88690c = r8     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r1.f88691d = r9     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r1.f88692e = r10     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r1.f88693f = r2     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r1.f88696i = r5     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            java.lang.Object r2 = r8.f(r9, r1)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            if (r2 != r3) goto L_0x0080
            return r3
        L_0x0080:
            r9 = r8
        L_0x0081:
            Yl.a r2 = (Yl.a) r2     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            goto L_0x00af
        L_0x0084:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r0.<init>()     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            java.lang.String r1 = "Uri is not correct, too many path segments. "
            r0.append(r1)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r0.append(r9)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            java.lang.String r9 = r0.toString()     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r10.<init>(r9)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            throw r10     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
        L_0x009b:
            r1.f88690c = r8     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r1.f88691d = r9     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r1.f88692e = r10     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r1.f88693f = r2     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r1.f88696i = r7     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            java.lang.Object r2 = r8.e(r9, r1)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            if (r2 != r3) goto L_0x00ac
            return r3
        L_0x00ac:
            r9 = r8
        L_0x00ad:
            Yl.a r2 = (Yl.a) r2     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
        L_0x00af:
            Ul.a r9 = r9.f88688b     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r9.a(r2)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            Yl.b$a$b r9 = new Yl.b$a$b     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            java.lang.String r10 = r2.a()     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            kotlin.jvm.internal.C17542s.i(r10, r0)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            java.lang.String r1 = r2.b()     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            kotlin.jvm.internal.C17542s.i(r1, r0)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            r9.<init>(r10, r1)     // Catch:{ CancellationException -> 0x0045, NoSuchElementException -> 0x0042, IllegalArgumentException -> 0x003f, Exception -> 0x003c }
            goto L_0x00fb
        L_0x00d0:
            Yl.b$a$a r10 = new Yl.b$a$a
            java.lang.String r9 = r9.getMessage()
            if (r9 != 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r6 = r9
        L_0x00da:
            r10.<init>(r6)
        L_0x00dd:
            r9 = r10
            goto L_0x00fb
        L_0x00df:
            Yl.b$a$a r10 = new Yl.b$a$a
            java.lang.String r9 = r9.getMessage()
            if (r9 != 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r6 = r9
        L_0x00e9:
            r10.<init>(r6)
            goto L_0x00dd
        L_0x00ed:
            Yl.b$a$a r10 = new Yl.b$a$a
            java.lang.String r9 = r9.getMessage()
            if (r9 != 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r6 = r9
        L_0x00f7:
            r10.<init>(r6)
            goto L_0x00dd
        L_0x00fb:
            return r9
        L_0x00fc:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Vl.a.a(android.net.Uri, dI.e):java.lang.Object");
    }
}
