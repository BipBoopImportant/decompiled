package GK;

import GK.C15805x;
import HK.C15864d;
import WK.C16771f;
import WK.C16773h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0003\u0014\u0012\u001aB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0005\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010#\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"LGK/y;", "LGK/C;", "LWK/h;", "boundaryByteString", "LGK/x;", "type", "", "LGK/y$c;", "parts", "<init>", "(LWK/h;LGK/x;Ljava/util/List;)V", "LWK/f;", "sink", "", "countBytes", "", "j", "(LWK/f;Z)J", "b", "()LGK/x;", "a", "()J", "LXH/N;", "h", "(LWK/f;)V", "LWK/h;", "c", "LGK/x;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "contentType", "f", "J", "contentLength", "", "i", "()Ljava/lang/String;", "boundary", "g", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.y  reason: case insensitive filesystem */
public final class C15806y extends C15775C {

    /* renamed from: g  reason: collision with root package name */
    public static final b f135137g = new b((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final C15805x f135138h;

    /* renamed from: i  reason: collision with root package name */
    public static final C15805x f135139i;

    /* renamed from: j  reason: collision with root package name */
    public static final C15805x f135140j;

    /* renamed from: k  reason: collision with root package name */
    public static final C15805x f135141k;

    /* renamed from: l  reason: collision with root package name */
    public static final C15805x f135142l;

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f135143m = {58, 32};

    /* renamed from: n  reason: collision with root package name */
    private static final byte[] f135144n = {13, 10};

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f135145o = {45, 45};

    /* renamed from: b  reason: collision with root package name */
    private final C16773h f135146b;

    /* renamed from: c  reason: collision with root package name */
    private final C15805x f135147c;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f135148d;

    /* renamed from: e  reason: collision with root package name */
    private final C15805x f135149e;

    /* renamed from: f  reason: collision with root package name */
    private long f135150f = -1;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"LGK/y$a;", "", "", "boundary", "<init>", "(Ljava/lang/String;)V", "LGK/x;", "type", "d", "(LGK/x;)LGK/y$a;", "LGK/u;", "headers", "LGK/C;", "body", "a", "(LGK/u;LGK/C;)LGK/y$a;", "LGK/y$c;", "part", "b", "(LGK/y$c;)LGK/y$a;", "LGK/y;", "c", "()LGK/y;", "LWK/h;", "LWK/h;", "LGK/x;", "", "Ljava/util/List;", "parts", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.y$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C16773h f135151a;

        /* renamed from: b  reason: collision with root package name */
        private C15805x f135152b;

        /* renamed from: c  reason: collision with root package name */
        private final List<c> f135153c;

        public a() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public final a a(C15802u uVar, C15775C c10) {
            C17542s.j(c10, "body");
            b(c.f135154c.a(uVar, c10));
            return this;
        }

        public final a b(c cVar) {
            C17542s.j(cVar, "part");
            this.f135153c.add(cVar);
            return this;
        }

        public final C15806y c() {
            if (!this.f135153c.isEmpty()) {
                return new C15806y(this.f135151a, this.f135152b, C15864d.W(this.f135153c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public final a d(C15805x xVar) {
            C17542s.j(xVar, "type");
            if (C17542s.e(xVar.g(), "multipart")) {
                this.f135152b = xVar;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + xVar).toString());
        }

        public a(String str) {
            C17542s.j(str, "boundary");
            this.f135151a = C16773h.f139664d.d(str);
            this.f135152b = C15806y.f135138h;
            this.f135153c = new ArrayList();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                kotlin.jvm.internal.C17542s.i(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: GK.C15806y.a.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"LGK/y$b;", "", "<init>", "()V", "LGK/x;", "ALTERNATIVE", "LGK/x;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.y$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"LGK/y$c;", "", "LGK/u;", "headers", "LGK/C;", "body", "<init>", "(LGK/u;LGK/C;)V", "a", "LGK/u;", "b", "()LGK/u;", "LGK/C;", "()LGK/C;", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.y$c */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f135154c = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final C15802u f135155a;

        /* renamed from: b  reason: collision with root package name */
        private final C15775C f135156b;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LGK/y$c$a;", "", "<init>", "()V", "LGK/u;", "headers", "LGK/C;", "body", "LGK/y$c;", "a", "(LGK/u;LGK/C;)LGK/y$c;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: GK.y$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(C15802u uVar, C15775C c10) {
                C17542s.j(c10, "body");
                if ((uVar != null ? uVar.b("Content-Type") : null) == null) {
                    if ((uVar != null ? uVar.b("Content-Length") : null) == null) {
                        return new c(uVar, c10, (DefaultConstructorMarker) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }

            private a() {
            }
        }

        public /* synthetic */ c(C15802u uVar, C15775C c10, DefaultConstructorMarker defaultConstructorMarker) {
            this(uVar, c10);
        }

        public final C15775C a() {
            return this.f135156b;
        }

        public final C15802u b() {
            return this.f135155a;
        }

        private c(C15802u uVar, C15775C c10) {
            this.f135155a = uVar;
            this.f135156b = c10;
        }
    }

    static {
        C15805x.a aVar = C15805x.f135130e;
        f135138h = aVar.a("multipart/mixed");
        f135139i = aVar.a("multipart/alternative");
        f135140j = aVar.a("multipart/digest");
        f135141k = aVar.a("multipart/parallel");
        f135142l = aVar.a("multipart/form-data");
    }

    public C15806y(C16773h hVar, C15805x xVar, List<c> list) {
        C17542s.j(hVar, "boundaryByteString");
        C17542s.j(xVar, "type");
        C17542s.j(list, "parts");
        this.f135146b = hVar;
        this.f135147c = xVar;
        this.f135148d = list;
        C15805x.a aVar = C15805x.f135130e;
        this.f135149e = aVar.a(xVar + "; boundary=" + i());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: WK.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: WK.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: WK.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: WK.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: WK.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long j(WK.C16771f r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            WK.e r13 = new WK.e
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<GK.y$c> r1 = r12.f135148d
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00ae
            java.util.List<GK.y$c> r6 = r12.f135148d
            java.lang.Object r6 = r6.get(r5)
            GK.y$c r6 = (GK.C15806y.c) r6
            GK.u r7 = r6.b()
            GK.C r6 = r6.a()
            kotlin.jvm.internal.C17542s.g(r13)
            byte[] r8 = f135145o
            r13.f1(r8)
            WK.h r8 = r12.f135146b
            r13.j2(r8)
            byte[] r8 = f135144n
            r13.f1(r8)
            if (r7 == 0) goto L_0x005f
            int r8 = r7.size()
            r9 = r2
        L_0x003f:
            if (r9 >= r8) goto L_0x005f
            java.lang.String r10 = r7.k(r9)
            WK.f r10 = r13.D0(r10)
            byte[] r11 = f135143m
            WK.f r10 = r10.f1(r11)
            java.lang.String r11 = r7.t(r9)
            WK.f r10 = r10.D0(r11)
            byte[] r11 = f135144n
            r10.f1(r11)
            int r9 = r9 + 1
            goto L_0x003f
        L_0x005f:
            GK.x r7 = r6.b()
            if (r7 == 0) goto L_0x0078
            java.lang.String r8 = "Content-Type: "
            WK.f r8 = r13.D0(r8)
            java.lang.String r7 = r7.toString()
            WK.f r7 = r8.D0(r7)
            byte[] r8 = f135144n
            r7.f1(r8)
        L_0x0078:
            long r7 = r6.a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            java.lang.String r9 = "Content-Length: "
            WK.f r9 = r13.D0(r9)
            WK.f r9 = r9.u1(r7)
            byte[] r10 = f135144n
            r9.f1(r10)
            goto L_0x009b
        L_0x0092:
            if (r14 == 0) goto L_0x009b
            kotlin.jvm.internal.C17542s.g(r0)
            r0.c()
            return r9
        L_0x009b:
            byte[] r9 = f135144n
            r13.f1(r9)
            if (r14 == 0) goto L_0x00a4
            long r3 = r3 + r7
            goto L_0x00a7
        L_0x00a4:
            r6.h(r13)
        L_0x00a7:
            r13.f1(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00ae:
            kotlin.jvm.internal.C17542s.g(r13)
            byte[] r1 = f135145o
            r13.f1(r1)
            WK.h r2 = r12.f135146b
            r13.j2(r2)
            r13.f1(r1)
            byte[] r1 = f135144n
            r13.f1(r1)
            if (r14 == 0) goto L_0x00d0
            kotlin.jvm.internal.C17542s.g(r0)
            long r13 = r0.size()
            long r3 = r3 + r13
            r0.c()
        L_0x00d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: GK.C15806y.j(WK.f, boolean):long");
    }

    public long a() {
        long j10 = this.f135150f;
        if (j10 != -1) {
            return j10;
        }
        long j11 = j((C16771f) null, true);
        this.f135150f = j11;
        return j11;
    }

    public C15805x b() {
        return this.f135149e;
    }

    public void h(C16771f fVar) {
        C17542s.j(fVar, "sink");
        j(fVar, false);
    }

    public final String i() {
        return this.f135146b.c0();
    }
}
