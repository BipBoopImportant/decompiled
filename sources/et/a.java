package Et;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import sp.C11879a;
import yt.f;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"LEt/a;", "Lsp/a;", "LEt/a$a;", "LEt/a$b;", "", "u", "()Z", "", "url", "Lkotlin/Function1;", "Lyt/f$c;", "LXH/N;", "action", "z", "(Ljava/lang/String;LnI/l;)Z", "a", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a extends C11879a<C1545a, b> {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LEt/a$a;", "", "g", "d", "b", "c", "e", "h", "a", "f", "LEt/a$a$a;", "LEt/a$a$b;", "LEt/a$a$c;", "LEt/a$a$d;", "LEt/a$a$e;", "LEt/a$a$f;", "LEt/a$a$g;", "LEt/a$a$h;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Et.a$a  reason: collision with other inner class name */
    public interface C1545a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"LEt/a$a$a;", "LEt/a$a;", "", "currentUrlPath", "newUrlPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Et.a$a$a  reason: collision with other inner class name */
        public static final class C1546a implements C1545a {

            /* renamed from: a  reason: collision with root package name */
            private final String f80781a;

            /* renamed from: b  reason: collision with root package name */
            private final String f80782b;

            public C1546a(String str, String str2) {
                C17542s.j(str, "currentUrlPath");
                C17542s.j(str2, "newUrlPath");
                this.f80781a = str;
                this.f80782b = str2;
            }

            public final String a() {
                return this.f80781a;
            }

            public final String b() {
                return this.f80782b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1546a)) {
                    return false;
                }
                C1546a aVar = (C1546a) obj;
                return C17542s.e(this.f80781a, aVar.f80781a) && C17542s.e(this.f80782b, aVar.f80782b);
            }

            public int hashCode() {
                return (this.f80781a.hashCode() * 31) + this.f80782b.hashCode();
            }

            public String toString() {
                String str = this.f80781a;
                String str2 = this.f80782b;
                return "BackClicked(currentUrlPath=" + str + ", newUrlPath=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEt/a$a$b;", "LEt/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Et.a$a$b */
        public static final class b implements C1545a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f80783a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -246268648;
            }

            public String toString() {
                return "CancelOrderClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEt/a$a$c;", "LEt/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Et.a$a$c */
        public static final class c implements C1545a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f80784a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -347709612;
            }

            public String toString() {
                return "CloseClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEt/a$a$d;", "LEt/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Et.a$a$d */
        public static final class d implements C1545a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f80785a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 201937541;
            }

            public String toString() {
                return "ContinueOrderClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEt/a$a$e;", "LEt/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Et.a$a$e */
        public static final class e implements C1545a {

            /* renamed from: a  reason: collision with root package name */
            public static final e f80786a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 594176516;
            }

            public String toString() {
                return "FoodMobileDismissed";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"LEt/a$a$f;", "LEt/a$a;", "", "isSystemInDarkTheme", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Et.a$a$f */
        public static final class f implements C1545a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f80787a;

            public f(boolean z10) {
                this.f80787a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f80787a == ((f) obj).f80787a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f80787a);
            }

            public String toString() {
                boolean z10 = this.f80787a;
                return "Load(isSystemInDarkTheme=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEt/a$a$g;", "LEt/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Et.a$a$g */
        public static final class g implements C1545a {

            /* renamed from: a  reason: collision with root package name */
            public static final g f80788a = new g();

            private g() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return -58478281;
            }

            public String toString() {
                return "SaveCurrentOrder";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LEt/a$a$h;", "LEt/a$a;", "", "resetRoot", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Et.a$a$h */
        public static final class h implements C1545a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f80789a;

            public h(boolean z10) {
                this.f80789a = z10;
            }

            public final boolean a() {
                return this.f80789a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f80789a == ((h) obj).f80789a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f80789a);
            }

            public String toString() {
                boolean z10 = this.f80789a;
                return "UpdateRoot(resetRoot=" + z10 + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"LEt/a$b;", "", "", "loading", "", "url", "storeName", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "a", "(ZLjava/lang/String;Ljava/lang/String;)LEt/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "Ljava/lang/String;", "e", "d", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f80790a;

        /* renamed from: b  reason: collision with root package name */
        private final String f80791b;

        /* renamed from: c  reason: collision with root package name */
        private final String f80792c;

        public b() {
            this(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ b b(b bVar, boolean z10, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = bVar.f80790a;
            }
            if ((i10 & 2) != 0) {
                str = bVar.f80791b;
            }
            if ((i10 & 4) != 0) {
                str2 = bVar.f80792c;
            }
            return bVar.a(z10, str, str2);
        }

        public final b a(boolean z10, String str, String str2) {
            C17542s.j(str2, "storeName");
            return new b(z10, str, str2);
        }

        public final boolean c() {
            return this.f80790a;
        }

        public final String d() {
            return this.f80792c;
        }

        public final String e() {
            return this.f80791b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f80790a == bVar.f80790a && C17542s.e(this.f80791b, bVar.f80791b) && C17542s.e(this.f80792c, bVar.f80792c);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.f80790a) * 31;
            String str = this.f80791b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f80792c.hashCode();
        }

        public String toString() {
            boolean z10 = this.f80790a;
            String str = this.f80791b;
            String str2 = this.f80792c;
            return "State(loading=" + z10 + ", url=" + str + ", storeName=" + str2 + ")";
        }

        public b(boolean z10, String str, String str2) {
            C17542s.j(str2, "storeName");
            this.f80790a = z10;
            this.f80791b = str;
            this.f80792c = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(boolean z10, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? "" : str2);
        }
    }

    boolean u();

    boolean z(String str, C17642l<? super f.c, C16807N> lVar);
}
