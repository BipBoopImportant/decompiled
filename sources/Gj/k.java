package gj;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lgj/k;", "", "Lgj/l;", "supportedEncodingMapper", "Lgj/m;", "upptackaMapper", "Lgj/c;", "barcodeMapper", "Lgj/d;", "dataMatrixMapper", "Lgj/e;", "qrScannerResultMapper", "<init>", "(Lgj/l;Lgj/m;Lgj/c;Lgj/d;Lgj/e;)V", "", "format", "", "rawValue", "Lgj/k$a;", "a", "(ILjava/lang/String;)Lgj/k$a;", "Lgj/l;", "b", "Lgj/m;", "c", "Lgj/c;", "d", "Lgj/d;", "e", "Lgj/e;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final l f97607a;

    /* renamed from: b  reason: collision with root package name */
    private final m f97608b;

    /* renamed from: c  reason: collision with root package name */
    private final C11292c f97609c;

    /* renamed from: d  reason: collision with root package name */
    private final C11293d f97610d;

    /* renamed from: e  reason: collision with root package name */
    private final C11294e f97611e;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lgj/k$a;", "", "<init>", "()V", "b", "c", "a", "Lgj/k$a$a;", "Lgj/k$a$b;", "Lgj/k$a$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lgj/k$a$a;", "Lgj/k$a;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gj.k$a$a  reason: collision with other inner class name */
        public static final class C2185a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f97612a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2185a(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "message");
                this.f97612a = str;
            }

            public final String a() {
                return this.f97612a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2185a) && C17542s.e(this.f97612a, ((C2185a) obj).f97612a);
            }

            public int hashCode() {
                return this.f97612a.hashCode();
            }

            public String toString() {
                String str = this.f97612a;
                return "InvalidBarcode(message=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgj/k$a$b;", "Lgj/k$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f97613a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1344531968;
            }

            public String toString() {
                return "NotSupported";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgj/k$a$c;", "Lgj/k$a;", "Lgj/j;", "scannerProductResult", "<init>", "(Lgj/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgj/j;", "()Lgj/j;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final j f97614a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(j jVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(jVar, "scannerProductResult");
                this.f97614a = jVar;
            }

            public final j a() {
                return this.f97614a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f97614a, ((c) obj).f97614a);
            }

            public int hashCode() {
                return this.f97614a.hashCode();
            }

            public String toString() {
                j jVar = this.f97614a;
                return "Success(scannerProductResult=" + jVar + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k(l lVar, m mVar, C11292c cVar, C11293d dVar, C11294e eVar) {
        C17542s.j(lVar, "supportedEncodingMapper");
        C17542s.j(mVar, "upptackaMapper");
        C17542s.j(cVar, "barcodeMapper");
        C17542s.j(dVar, "dataMatrixMapper");
        C17542s.j(eVar, "qrScannerResultMapper");
        this.f97607a = lVar;
        this.f97608b = mVar;
        this.f97609c = cVar;
        this.f97610d = dVar;
        this.f97611e = eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: gj.j$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: gj.j$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: gj.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: gj.j$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: gj.j$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: gj.j$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: gj.j$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: gj.j$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: gj.j$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: gj.j$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final gj.k.a a(int r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "rawValue"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            gj.l r0 = r8.f97607a
            Vj.a r0 = r0.a(r9, r10)
            boolean r1 = r0 instanceof Vj.a.j
            if (r1 == 0) goto L_0x0012
            gj.k$a$b r9 = gj.k.a.b.f97613a
            return r9
        L_0x0012:
            Vj.a$h r1 = Vj.a.h.f88665e
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 == 0) goto L_0x0026
            gj.j$b r9 = new gj.j$b
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r2 = r9
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x006a
        L_0x0026:
            boolean r1 = r0 instanceof Vj.a.e
            if (r1 != 0) goto L_0x0064
            boolean r1 = r0 instanceof Vj.a.g
            if (r1 == 0) goto L_0x002f
            goto L_0x0064
        L_0x002f:
            boolean r1 = r0 instanceof Vj.a.d
            if (r1 == 0) goto L_0x003a
            gj.d r1 = r8.f97610d
            gj.j$c r9 = r1.a(r9, r10)
            goto L_0x006a
        L_0x003a:
            boolean r1 = r0 instanceof Vj.a.i
            if (r1 == 0) goto L_0x005e
            gj.m r1 = r8.f97608b
            java.lang.Object r1 = r1.a(r9, r10)
            java.lang.Throwable r2 = XH.x.e(r1)
            if (r2 != 0) goto L_0x004e
            r9 = r1
            gj.j$e r9 = (gj.j.e) r9
            goto L_0x006a
        L_0x004e:
            gj.e r1 = r8.f97611e
            java.lang.Object r9 = r1.b(r9, r10)
            boolean r1 = XH.x.g(r9)
            if (r1 == 0) goto L_0x005b
            r9 = 0
        L_0x005b:
            gj.j r9 = (gj.j) r9
            goto L_0x006a
        L_0x005e:
            XH.t r9 = new XH.t
            r9.<init>()
            throw r9
        L_0x0064:
            gj.c r1 = r8.f97609c
            gj.j$a r9 = r1.c(r9, r10)
        L_0x006a:
            if (r9 == 0) goto L_0x0072
            gj.k$a$c r10 = new gj.k$a$c
            r10.<init>(r9)
            goto L_0x0099
        L_0x0072:
            java.lang.Class r9 = r0.getClass()
            java.lang.String r9 = r9.getSimpleName()
            gj.k$a$a r0 = new gj.k$a$a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid barcode encoding:"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = " value:"
            r1.append(r9)
            r1.append(r10)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            r10 = r0
        L_0x0099:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.k.a(int, java.lang.String):gj.k$a");
    }
}
