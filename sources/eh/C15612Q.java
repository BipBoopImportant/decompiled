package EH;

import HJ.C15854t;
import XH.C16824o;
import XH.C16825p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b2\u0018\u0000 @2\u00020\u0001:\u0001\u001bBc\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b/\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b0\u0010\u0015R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b2\u00103R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010 R\u001b\u00106\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b%\u0010\u0015R\u001b\u00107\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b)\u0010\u0015R\u001b\u00109\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b2\u00105\u001a\u0004\b8\u0010\u0015R\u001d\u0010:\u001a\u0004\u0018\u00010\u00048FX\u0002¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b-\u0010\u0015R\u001d\u0010<\u001a\u0004\u0018\u00010\u00048FX\u0002¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b\"\u0010\u0015R\u001b\u0010>\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010?\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b4\u0010\u001a¨\u0006A"}, d2 = {"LEH/Q;", "", "LEH/M;", "protocol", "", "host", "", "specifiedPort", "", "pathSegments", "LEH/A;", "parameters", "fragment", "user", "password", "", "trailingQuery", "urlString", "<init>", "(LEH/M;Ljava/lang/String;ILjava/util/List;LEH/A;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "LEH/M;", "k", "()LEH/M;", "b", "Ljava/lang/String;", "g", "c", "I", "l", "d", "Ljava/util/List;", "i", "()Ljava/util/List;", "e", "LEH/A;", "getParameters", "()LEH/A;", "f", "getFragment", "n", "h", "Z", "m", "()Z", "j", "LXH/o;", "encodedPath", "encodedQuery", "getEncodedPathAndQuery", "encodedPathAndQuery", "encodedUser", "o", "encodedPassword", "p", "encodedFragment", "port", "q", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.Q  reason: case insensitive filesystem */
public final class C15612Q {

    /* renamed from: q  reason: collision with root package name */
    public static final a f133948q = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C15608M f133949a;

    /* renamed from: b  reason: collision with root package name */
    private final String f133950b;

    /* renamed from: c  reason: collision with root package name */
    private final int f133951c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f133952d;

    /* renamed from: e  reason: collision with root package name */
    private final C15596A f133953e;

    /* renamed from: f  reason: collision with root package name */
    private final String f133954f;

    /* renamed from: g  reason: collision with root package name */
    private final String f133955g;

    /* renamed from: h  reason: collision with root package name */
    private final String f133956h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f133957i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final String f133958j;

    /* renamed from: k  reason: collision with root package name */
    private final C16824o f133959k;

    /* renamed from: l  reason: collision with root package name */
    private final C16824o f133960l;

    /* renamed from: m  reason: collision with root package name */
    private final C16824o f133961m;

    /* renamed from: n  reason: collision with root package name */
    private final C16824o f133962n;

    /* renamed from: o  reason: collision with root package name */
    private final C16824o f133963o;

    /* renamed from: p  reason: collision with root package name */
    private final C16824o f133964p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEH/Q$a;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.Q$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.Q$b */
    static final class b extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15612Q f133965c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C15612Q q10) {
            super(0);
            this.f133965c = q10;
        }

        /* renamed from: b */
        public final String invoke() {
            int r02 = C15854t.r0(this.f133965c.f133958j, '#', 0, false, 6, (Object) null) + 1;
            if (r02 == 0) {
                return "";
            }
            String substring = this.f133965c.f133958j.substring(r02);
            C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.Q$c */
    static final class c extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15612Q f133966c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C15612Q q10) {
            super(0);
            this.f133966c = q10;
        }

        /* renamed from: b */
        public final String invoke() {
            if (this.f133966c.h() == null) {
                return null;
            }
            if (this.f133966c.h().length() == 0) {
                return "";
            }
            int r02 = C15854t.r0(this.f133966c.f133958j, '@', 0, false, 6, (Object) null);
            String substring = this.f133966c.f133958j.substring(C15854t.r0(this.f133966c.f133958j, ':', this.f133966c.k().d().length() + 3, false, 4, (Object) null) + 1, r02);
            C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.Q$d */
    static final class d extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15612Q f133967c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C15612Q q10) {
            super(0);
            this.f133967c = q10;
        }

        /* renamed from: b */
        public final String invoke() {
            int r02;
            if (this.f133967c.i().isEmpty() || (r02 = C15854t.r0(this.f133967c.f133958j, '/', this.f133967c.k().d().length() + 3, false, 4, (Object) null)) == -1) {
                return "";
            }
            int u02 = C15854t.u0(this.f133967c.f133958j, new char[]{'?', '#'}, r02, false, 4, (Object) null);
            if (u02 == -1) {
                String substring = this.f133967c.f133958j.substring(r02);
                C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            String substring2 = this.f133967c.f133958j.substring(r02, u02);
            C17542s.i(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.Q$e */
    static final class e extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15612Q f133968c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C15612Q q10) {
            super(0);
            this.f133968c = q10;
        }

        /* renamed from: b */
        public final String invoke() {
            int r02 = C15854t.r0(this.f133968c.f133958j, '/', this.f133968c.k().d().length() + 3, false, 4, (Object) null);
            if (r02 == -1) {
                return "";
            }
            int r03 = C15854t.r0(this.f133968c.f133958j, '#', r02, false, 4, (Object) null);
            if (r03 == -1) {
                String substring = this.f133968c.f133958j.substring(r02);
                C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            String substring2 = this.f133968c.f133958j.substring(r02, r03);
            C17542s.i(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.Q$f */
    static final class f extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15612Q f133969c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C15612Q q10) {
            super(0);
            this.f133969c = q10;
        }

        /* renamed from: b */
        public final String invoke() {
            int r02 = C15854t.r0(this.f133969c.f133958j, '?', 0, false, 6, (Object) null) + 1;
            if (r02 == 0) {
                return "";
            }
            int r03 = C15854t.r0(this.f133969c.f133958j, '#', r02, false, 4, (Object) null);
            if (r03 == -1) {
                String substring = this.f133969c.f133958j.substring(r02);
                C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            String substring2 = this.f133969c.f133958j.substring(r02, r03);
            C17542s.i(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: EH.Q$g */
    static final class g extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15612Q f133970c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C15612Q q10) {
            super(0);
            this.f133970c = q10;
        }

        /* renamed from: b */
        public final String invoke() {
            if (this.f133970c.n() == null) {
                return null;
            }
            if (this.f133970c.n().length() == 0) {
                return "";
            }
            int length = this.f133970c.k().d().length() + 3;
            String substring = this.f133970c.f133958j.substring(length, C15854t.u0(this.f133970c.f133958j, new char[]{':', '@'}, length, false, 4, (Object) null));
            C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
    }

    public C15612Q(C15608M m10, String str, int i10, List<String> list, C15596A a10, String str2, String str3, String str4, boolean z10, String str5) {
        C17542s.j(m10, "protocol");
        C17542s.j(str, "host");
        C17542s.j(list, "pathSegments");
        C17542s.j(a10, "parameters");
        C17542s.j(str2, "fragment");
        C17542s.j(str5, "urlString");
        this.f133949a = m10;
        this.f133950b = str;
        this.f133951c = i10;
        this.f133952d = list;
        this.f133953e = a10;
        this.f133954f = str2;
        this.f133955g = str3;
        this.f133956h = str4;
        this.f133957i = z10;
        this.f133958j = str5;
        if ((i10 < 0 || i10 >= 65536) && i10 != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        this.f133959k = C16825p.b(new d(this));
        this.f133960l = C16825p.b(new f(this));
        this.f133961m = C16825p.b(new e(this));
        this.f133962n = C16825p.b(new g(this));
        this.f133963o = C16825p.b(new c(this));
        this.f133964p = C16825p.b(new b(this));
    }

    public final String b() {
        return (String) this.f133964p.getValue();
    }

    public final String c() {
        return (String) this.f133963o.getValue();
    }

    public final String d() {
        return (String) this.f133959k.getValue();
    }

    public final String e() {
        return (String) this.f133960l.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C15612Q.class == obj.getClass() && C17542s.e(this.f133958j, ((C15612Q) obj).f133958j);
    }

    public final String f() {
        return (String) this.f133962n.getValue();
    }

    public final String g() {
        return this.f133950b;
    }

    public final String h() {
        return this.f133956h;
    }

    public int hashCode() {
        return this.f133958j.hashCode();
    }

    public final List<String> i() {
        return this.f133952d;
    }

    public final int j() {
        Integer valueOf = Integer.valueOf(this.f133951c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.f133949a.c();
    }

    public final C15608M k() {
        return this.f133949a;
    }

    public final int l() {
        return this.f133951c;
    }

    public final boolean m() {
        return this.f133957i;
    }

    public final String n() {
        return this.f133955g;
    }

    public String toString() {
        return this.f133958j;
    }
}
