package a9;

import QJ.Q;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import j8.h;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@f(c = "com.contentsquare.android.internal.features.webviewbridge.WebViewTagDownloader$execute$1", f = "WebViewTagDownloader.kt", l = {48, 58}, m = "invokeSuspend")
public final class A1 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f41881c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ L1 f41882d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f41883e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f41884f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f41885g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C17631a<C16807N> f41886h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ C17642l<String, C16807N> f41887i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ C17631a<C16807N> f41888j;

    @f(c = "com.contentsquare.android.internal.features.webviewbridge.WebViewTagDownloader$execute$1$1", f = "WebViewTagDownloader.kt", l = {}, m = "invokeSuspend")
    public static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f41889c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ C17642l<String, C16807N> f41890d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, C17642l<? super String, C16807N> lVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f41889c = str;
            this.f41890d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f41889c, this.f41890d, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new a(this.f41889c, this.f41890d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            y.b(obj);
            String str = this.f41889c;
            if (str == null) {
                return null;
            }
            this.f41890d.invoke(str);
            return C16807N.f139792a;
        }
    }

    @f(c = "com.contentsquare.android.internal.features.webviewbridge.WebViewTagDownloader$execute$1$2$1", f = "WebViewTagDownloader.kt", l = {}, m = "invokeSuspend")
    public static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C17631a<C16807N> f41891c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a<C16807N> aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f41891c = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f41891c, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new b(this.f41891c, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            y.b(obj);
            this.f41891c.invoke();
            return C16807N.f139792a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A1(L1 l12, String str, String str2, String str3, h.b bVar, C17642l lVar, C17631a aVar, C17164e eVar) {
        super(2, eVar);
        this.f41882d = l12;
        this.f41883e = str;
        this.f41884f = str2;
        this.f41885g = str3;
        this.f41886h = bVar;
        this.f41887i = lVar;
        this.f41888j = aVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new A1(this.f41882d, this.f41883e, this.f41884f, this.f41885g, (h.b) this.f41886h, this.f41887i, this.f41888j, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((A1) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        jI.C17416c.a(r4, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        jI.C17416c.a(r6, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a1, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r12.f41881c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            XH.y.b(r13)
            goto L_0x01bb
        L_0x0013:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001b:
            XH.y.b(r13)
            goto L_0x00a5
        L_0x0020:
            XH.y.b(r13)
            a9.L1 r13 = r12.f41882d
            java.lang.String r1 = r12.f41883e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = r13.f42123c
            r4.append(r13)
            java.lang.String r13 = java.io.File.separator
            r4.append(r13)
            r4.append(r1)
            java.lang.String r1 = ".js"
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r4 = r5.exists()
            r5 = 0
            if (r4 == 0) goto L_0x00a8
            a9.L1 r2 = r12.f41882d
            java.lang.String r4 = r12.f41883e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.f42123c
            r6.append(r7)
            r6.append(r13)
            r6.append(r4)
            r6.append(r1)
            java.lang.String r13 = r6.toString()
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0089 }
            r1.<init>(r13)     // Catch:{ IOException -> 0x0089 }
            java.nio.charset.Charset r13 = HJ.C15838d.f135279b     // Catch:{ IOException -> 0x0089 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0089 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0089 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0089 }
            r4.<init>(r6, r13)     // Catch:{ IOException -> 0x0089 }
            java.lang.String r13 = jI.C17431r.h(r4)     // Catch:{ all -> 0x0082 }
            jI.C17416c.a(r4, r5)     // Catch:{ IOException -> 0x0089 }
            goto L_0x0091
        L_0x0082:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            jI.C17416c.a(r4, r13)     // Catch:{ IOException -> 0x0089 }
            throw r1     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            D8.c r13 = r2.f42125e
            java.lang.String r1 = "Failed to read local tag data"
            r13.h(r1)
            r13 = r5
        L_0x0091:
            QJ.P0 r1 = QJ.C16311i0.c()
            a9.A1$a r2 = new a9.A1$a
            nI.l<java.lang.String, XH.N> r4 = r12.f41887i
            r2.<init>(r13, r4, r5)
            r12.f41881c = r3
            java.lang.Object r13 = QJ.C16310i.g(r1, r2, r12)
            if (r13 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        L_0x00a8:
            a9.L1 r3 = r12.f41882d
            java.lang.String r4 = r12.f41883e
            r3.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "https://t.contentsquare.net/uxa/"
            r3.<init>(r6)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            a9.L1 r4 = r12.f41882d
            java.lang.String r6 = r12.f41884f
            java.lang.String r7 = r12.f41883e
            java.lang.String r8 = r12.f41885g
            r4.getClass()
            java.util.Map r9 = YH.X.c()
            if (r6 == 0) goto L_0x00e4
            G8.a r10 = r4.f42122b
            java.lang.String r10 = r10.a()
            java.lang.String r11 = "qa"
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r11)
            if (r10 == 0) goto L_0x00e4
            java.lang.String r10 = "uid"
            r9.put(r10, r6)
        L_0x00e4:
            java.util.Map r6 = YH.X.b(r9)
            C8.a r9 = r4.f42121a
            C8.d r6 = r9.d(r3, r6)
            int r9 = r6.f()
            r10 = 200(0xc8, float:2.8E-43)
            if (r9 == r10) goto L_0x0147
            r7 = 304(0x130, float:4.26E-43)
            if (r9 == r7) goto L_0x0161
            r7 = 404(0x194, float:5.66E-43)
            if (r9 == r7) goto L_0x011b
            D8.c r3 = r4.f42125e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to get the Contentsquare tag from server: "
            r4.<init>(r7)
            int r6 = r6.f()
            r4.append(r6)
            java.lang.String r6 = " HTTP code."
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.l(r4)
            goto L_0x0161
        L_0x011b:
            D8.c r6 = r4.f42125e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Got HTTP_NOT_FOUND for endpoint "
            r7.<init>(r9)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r6.h(r3)
            D8.c r3 = r4.f42125e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Tag for package name '"
            r4.<init>(r6)
            r4.append(r8)
            java.lang.String r6 = "' could not be retrieved. A Contentsquare project mightnot have been created for you yet. Send your package name to your Contentsquare contact."
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.k(r4)
            goto L_0x0161
        L_0x0147:
            java.lang.String r3 = r6.g()
            if (r3 == 0) goto L_0x0161
            D8.c r4 = r4.f42125e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Got remote tag: "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.f(r6)
            goto L_0x0162
        L_0x0161:
            r3 = r5
        L_0x0162:
            if (r3 == 0) goto L_0x01bd
            a9.L1 r4 = r12.f41882d
            java.lang.String r6 = r12.f41883e
            nI.a<XH.N> r7 = r12.f41888j
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r4.f42123c
            r8.append(r9)
            r8.append(r13)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r13 = r8.toString()
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x01a2 }
            r1.<init>(r13)     // Catch:{ IOException -> 0x01a2 }
            java.nio.charset.Charset r13 = HJ.C15838d.f135279b     // Catch:{ IOException -> 0x01a2 }
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x01a2 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01a2 }
            r8.<init>(r1)     // Catch:{ IOException -> 0x01a2 }
            r6.<init>(r8, r13)     // Catch:{ IOException -> 0x01a2 }
            r6.write(r3)     // Catch:{ all -> 0x019b }
            XH.N r13 = XH.C16807N.f139792a     // Catch:{ all -> 0x019b }
            jI.C17416c.a(r6, r5)     // Catch:{ IOException -> 0x01a2 }
            goto L_0x01a9
        L_0x019b:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x019d }
        L_0x019d:
            r1 = move-exception
            jI.C17416c.a(r6, r13)     // Catch:{ IOException -> 0x01a2 }
            throw r1     // Catch:{ IOException -> 0x01a2 }
        L_0x01a2:
            D8.c r13 = r4.f42125e
            java.lang.String r1 = "Failed to save tag data"
            r13.h(r1)
        L_0x01a9:
            QJ.P0 r13 = QJ.C16311i0.c()
            a9.A1$b r1 = new a9.A1$b
            r1.<init>(r7, r5)
            r12.f41881c = r2
            java.lang.Object r13 = QJ.C16310i.g(r13, r1, r12)
            if (r13 != r0) goto L_0x01bb
            return r0
        L_0x01bb:
            XH.N r5 = XH.C16807N.f139792a
        L_0x01bd:
            if (r5 != 0) goto L_0x01c4
            nI.a<XH.N> r13 = r12.f41886h
            r13.invoke()
        L_0x01c4:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.A1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
