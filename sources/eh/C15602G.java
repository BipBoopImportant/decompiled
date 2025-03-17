package EH;

import YH.C16877v;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 H2\u00020\u0001:\u0001\u0014Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00103\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010!\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010$R$\u00106\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010!\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010$R\"\u00109\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u0010!\u001a\u0004\b*\u0010\u0017\"\u0004\b8\u0010$R(\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010:\u001a\u0004\b7\u0010;\"\u0004\b<\u0010=R*\u0010F\u001a\u00020?2\u0006\u0010@\u001a\u00020?8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b0\u0010C\"\u0004\bD\u0010ER$\u0010\r\u001a\u00020?2\u0006\u0010G\u001a\u00020?8\u0006@BX\u000e¢\u0006\f\n\u0004\b\"\u0010B\u001a\u0004\bH\u0010CR(\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010@\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0017\"\u0004\bJ\u0010$R(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010@\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\bK\u0010\u0017\"\u0004\bL\u0010$R$\u0010\u000e\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00048F@FX\u000e¢\u0006\f\u001a\u0004\bA\u0010\u0017\"\u0004\bM\u0010$R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\n8F@FX\u000e¢\u0006\f\u001a\u0004\bN\u0010;\"\u0004\bO\u0010=¨\u0006P"}, d2 = {"LEH/G;", "", "LEH/M;", "protocol", "", "host", "", "port", "user", "password", "", "pathSegments", "LEH/A;", "parameters", "fragment", "", "trailingQuery", "<init>", "(LEH/M;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LEH/A;Ljava/lang/String;Z)V", "LXH/N;", "a", "()V", "c", "()Ljava/lang/String;", "toString", "LEH/Q;", "b", "()LEH/Q;", "LEH/M;", "o", "()LEH/M;", "y", "(LEH/M;)V", "Ljava/lang/String;", "j", "w", "(Ljava/lang/String;)V", "I", "n", "()I", "x", "(I)V", "d", "Z", "p", "()Z", "z", "(Z)V", "e", "h", "v", "encodedUser", "f", "t", "encodedPassword", "g", "r", "encodedFragment", "Ljava/util/List;", "()Ljava/util/List;", "u", "(Ljava/util/List;)V", "encodedPathSegments", "LEH/B;", "value", "i", "LEH/B;", "()LEH/B;", "s", "(LEH/B;)V", "encodedParameters", "<set-?>", "k", "q", "A", "l", "setPassword", "setFragment", "m", "setPathSegments", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.G  reason: case insensitive filesystem */
public final class C15602G {

    /* renamed from: k  reason: collision with root package name */
    public static final a f133924k;

    /* renamed from: l  reason: collision with root package name */
    private static final C15612Q f133925l;

    /* renamed from: a  reason: collision with root package name */
    private C15608M f133926a;

    /* renamed from: b  reason: collision with root package name */
    private String f133927b;

    /* renamed from: c  reason: collision with root package name */
    private int f133928c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f133929d;

    /* renamed from: e  reason: collision with root package name */
    private String f133930e;

    /* renamed from: f  reason: collision with root package name */
    private String f133931f;

    /* renamed from: g  reason: collision with root package name */
    private String f133932g;

    /* renamed from: h  reason: collision with root package name */
    private List<String> f133933h;

    /* renamed from: i  reason: collision with root package name */
    private C15597B f133934i;

    /* renamed from: j  reason: collision with root package name */
    private C15597B f133935j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LEH/G$a;", "", "<init>", "()V", "LEH/Q;", "originUrl", "LEH/Q;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.G$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f133924k = aVar;
        f133925l = C15610O.d(C15603H.a(aVar));
    }

    public C15602G(C15608M m10, String str, int i10, String str2, String str3, List<String> list, C15596A a10, String str4, boolean z10) {
        C17542s.j(m10, "protocol");
        C17542s.j(str, "host");
        C17542s.j(list, "pathSegments");
        C17542s.j(a10, "parameters");
        C17542s.j(str4, "fragment");
        this.f133926a = m10;
        this.f133927b = str;
        this.f133928c = i10;
        this.f133929d = z10;
        String str5 = null;
        this.f133930e = str2 != null ? C15617b.m(str2, false, 1, (Object) null) : null;
        this.f133931f = str3 != null ? C15617b.m(str3, false, 1, (Object) null) : str5;
        this.f133932g = C15617b.r(str4, false, false, (Charset) null, 7, (Object) null);
        Iterable<String> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (String p10 : iterable) {
            arrayList.add(C15617b.p(p10));
        }
        this.f133933h = arrayList;
        C15597B e10 = C15614T.e(a10);
        this.f133934i = e10;
        this.f133935j = new C15613S(e10);
    }

    private final void a() {
        if (this.f133927b.length() <= 0 && !C17542s.e(this.f133926a.d(), "file")) {
            C15612Q q10 = f133925l;
            this.f133927b = q10.g();
            if (C17542s.e(this.f133926a, C15608M.f133938c.c())) {
                this.f133926a = q10.k();
            }
            if (this.f133928c == 0) {
                this.f133928c = q10.l();
            }
        }
    }

    public final void A(String str) {
        String str2 = null;
        if (str != null) {
            str2 = C15617b.m(str, false, 1, (Object) null);
        }
        this.f133930e = str2;
    }

    public final C15612Q b() {
        a();
        return new C15612Q(this.f133926a, this.f133927b, this.f133928c, m(), this.f133935j.g(), i(), q(), l(), this.f133929d, c());
    }

    public final String c() {
        a();
        String sb2 = ((StringBuilder) C15604I.d(this, new StringBuilder(256))).toString();
        C17542s.i(sb2, "appendTo(StringBuilder(256)).toString()");
        return sb2;
    }

    public final String d() {
        return this.f133932g;
    }

    public final C15597B e() {
        return this.f133934i;
    }

    public final String f() {
        return this.f133931f;
    }

    public final List<String> g() {
        return this.f133933h;
    }

    public final String h() {
        return this.f133930e;
    }

    public final String i() {
        return C15617b.k(this.f133932g, 0, 0, false, (Charset) null, 15, (Object) null);
    }

    public final String j() {
        return this.f133927b;
    }

    public final C15597B k() {
        return this.f133935j;
    }

    public final String l() {
        String str = this.f133931f;
        if (str != null) {
            return C15617b.i(str, 0, 0, (Charset) null, 7, (Object) null);
        }
        return null;
    }

    public final List<String> m() {
        Iterable<String> iterable = this.f133933h;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (String i10 : iterable) {
            arrayList.add(C15617b.i(i10, 0, 0, (Charset) null, 7, (Object) null));
        }
        return arrayList;
    }

    public final int n() {
        return this.f133928c;
    }

    public final C15608M o() {
        return this.f133926a;
    }

    public final boolean p() {
        return this.f133929d;
    }

    public final String q() {
        String str = this.f133930e;
        if (str != null) {
            return C15617b.i(str, 0, 0, (Charset) null, 7, (Object) null);
        }
        return null;
    }

    public final void r(String str) {
        C17542s.j(str, "<set-?>");
        this.f133932g = str;
    }

    public final void s(C15597B b10) {
        C17542s.j(b10, "value");
        this.f133934i = b10;
        this.f133935j = new C15613S(b10);
    }

    public final void t(String str) {
        this.f133931f = str;
    }

    public String toString() {
        String sb2 = ((StringBuilder) C15604I.d(this, new StringBuilder(256))).toString();
        C17542s.i(sb2, "appendTo(StringBuilder(256)).toString()");
        return sb2;
    }

    public final void u(List<String> list) {
        C17542s.j(list, "<set-?>");
        this.f133933h = list;
    }

    public final void v(String str) {
        this.f133930e = str;
    }

    public final void w(String str) {
        C17542s.j(str, "<set-?>");
        this.f133927b = str;
    }

    public final void x(int i10) {
        this.f133928c = i10;
    }

    public final void y(C15608M m10) {
        C17542s.j(m10, "<set-?>");
        this.f133926a = m10;
    }

    public final void z(boolean z10) {
        this.f133929d = z10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C15602G(EH.C15608M r12, java.lang.String r13, int r14, java.lang.String r15, java.lang.String r16, java.util.List r17, EH.C15596A r18, java.lang.String r19, boolean r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r11 = this;
            r0 = r21
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            EH.M$a r1 = EH.C15608M.f133938c
            EH.M r1 = r1.c()
            goto L_0x000e
        L_0x000d:
            r1 = r12
        L_0x000e:
            r2 = r0 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0016
            r2 = r3
            goto L_0x0017
        L_0x0016:
            r2 = r13
        L_0x0017:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x001e
            r4 = r5
            goto L_0x001f
        L_0x001e:
            r4 = r14
        L_0x001f:
            r6 = r0 & 8
            r7 = 0
            if (r6 == 0) goto L_0x0026
            r6 = r7
            goto L_0x0027
        L_0x0026:
            r6 = r15
        L_0x0027:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0037
            java.util.List r8 = YH.C16877v.n()
            goto L_0x0039
        L_0x0037:
            r8 = r17
        L_0x0039:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0044
            EH.A$a r9 = EH.C15596A.f133921b
            EH.A r9 = r9.a()
            goto L_0x0046
        L_0x0044:
            r9 = r18
        L_0x0046:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r3 = r19
        L_0x004d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r5 = r20
        L_0x0054:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r3
            r21 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: EH.C15602G.<init>(EH.M, java.lang.String, int, java.lang.String, java.lang.String, java.util.List, EH.A, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
