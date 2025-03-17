package to;

import IC.C13023e;
import U0.C4899r0;
import U0.o1;
import XH.C16796C;
import YH.X;
import f1.C5300b;
import f1.C5309k;
import f1.m;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001:\u0003\u001e\u0019\u001bB?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010%¨\u0006&"}, d2 = {"Lto/C0;", "", "Lto/C0$b;", "fiscalCodeEntry", "", "Lto/C0$c;", "idMethods", "Lto/C0$a;", "countries", "Lto/z0;", "validator", "LIC/e;", "idSelectionLabel", "<init>", "(Lto/C0$b;Ljava/util/List;Ljava/util/List;Lto/z0;LIC/e;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lto/C0$b;", "b", "()Lto/C0$b;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "Lto/z0;", "e", "()Lto/z0;", "LIC/e;", "()LIC/e;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f103001a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f103002b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a> f103003c;

    /* renamed from: d  reason: collision with root package name */
    private final C11978z0 f103004d;

    /* renamed from: e  reason: collision with root package name */
    private final C13023e f103005e;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lto/C0$a;", "", "", "label", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "f", "c", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final C2456a f103006c = new C2456a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final C5309k<C4899r0<a>, Object> f103007d = C5300b.a(new A0(), new B0());

        /* renamed from: a  reason: collision with root package name */
        private final String f103008a;

        /* renamed from: b  reason: collision with root package name */
        private final String f103009b;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lto/C0$a$a;", "", "<init>", "()V", "Lf1/k;", "LU0/r0;", "Lto/C0$a;", "Saver", "Lf1/k;", "a", "()Lf1/k;", "", "LABEL", "Ljava/lang/String;", "CODE", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: to.C0$a$a  reason: collision with other inner class name */
        public static final class C2456a {
            public /* synthetic */ C2456a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5309k<C4899r0<a>, Object> a() {
                return a.f103007d;
            }

            private C2456a() {
            }
        }

        public a(String str, String str2) {
            C17542s.j(str, "label");
            C17542s.j(str2, "code");
            this.f103008a = str;
            this.f103009b = str2;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
            r1 = YH.X.m(XH.C16796C.a("label", r1.f103008a), XH.C16796C.a("code", r1.f103009b));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.util.Map c(f1.m r1, U0.C4899r0 r2) {
            /*
                java.lang.String r0 = "$this$mapSaver"
                kotlin.jvm.internal.C17542s.j(r1, r0)
                java.lang.String r1 = "it"
                kotlin.jvm.internal.C17542s.j(r2, r1)
                java.lang.Object r1 = r2.getValue()
                to.C0$a r1 = (to.C0.a) r1
                if (r1 == 0) goto L_0x002c
                java.lang.String r2 = "label"
                java.lang.String r0 = r1.f103008a
                XH.v r2 = XH.C16796C.a(r2, r0)
                java.lang.String r0 = "code"
                java.lang.String r1 = r1.f103009b
                XH.v r1 = XH.C16796C.a(r0, r1)
                XH.v[] r1 = new XH.v[]{r2, r1}
                java.util.Map r1 = YH.X.m(r1)
                if (r1 != 0) goto L_0x0030
            L_0x002c:
                java.util.Map r1 = YH.X.j()
            L_0x0030:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: to.C0.a.c(f1.m, U0.r0):java.util.Map");
        }

        /* access modifiers changed from: private */
        public static final C4899r0 d(Map map) {
            C17542s.j(map, "map");
            if (map.isEmpty()) {
                return u1.e((Object) null, (o1) null, 2, (Object) null);
            }
            Object obj = map.get("label");
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = map.get("code");
            C17542s.h(obj2, "null cannot be cast to non-null type kotlin.String");
            return u1.e(new a((String) obj, (String) obj2), (o1) null, 2, (Object) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f103008a, aVar.f103008a) && C17542s.e(this.f103009b, aVar.f103009b);
        }

        public final String f() {
            return this.f103009b;
        }

        public final String g() {
            return this.f103008a;
        }

        public int hashCode() {
            return (this.f103008a.hashCode() * 31) + this.f103009b.hashCode();
        }

        public String toString() {
            String str = this.f103008a;
            String str2 = this.f103009b;
            return "Country(label=" + str + ", code=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lto/C0$b;", "", "", "label", "errorMessage", "Lkotlin/Function1;", "", "validator", "<init>", "(Ljava/lang/String;Ljava/lang/String;LnI/l;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", "LnI/l;", "()LnI/l;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f103010a;

        /* renamed from: b  reason: collision with root package name */
        private final String f103011b;

        /* renamed from: c  reason: collision with root package name */
        private final C17642l<String, Boolean> f103012c;

        public b(String str, String str2, C17642l<? super String, Boolean> lVar) {
            C17542s.j(str, "label");
            C17542s.j(str2, "errorMessage");
            C17542s.j(lVar, "validator");
            this.f103010a = str;
            this.f103011b = str2;
            this.f103012c = lVar;
        }

        public final String a() {
            return this.f103011b;
        }

        public final String b() {
            return this.f103010a;
        }

        public final C17642l<String, Boolean> c() {
            return this.f103012c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f103010a, bVar.f103010a) && C17542s.e(this.f103011b, bVar.f103011b);
        }

        public int hashCode() {
            return (this.f103010a.hashCode() * 31) + this.f103011b.hashCode();
        }

        public String toString() {
            String str = this.f103010a;
            String str2 = this.f103011b;
            C17642l<String, Boolean> lVar = this.f103012c;
            return "FiscalCodeEntry(label=" + str + ", errorMessage=" + str2 + ", validator=" + lVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0012B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lto/C0$c;", "", "", "label", "type", "", "requiresCountry", "requiresInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "i", "c", "Z", "g", "()Z", "d", "h", "e", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: e  reason: collision with root package name */
        public static final a f103013e = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final C5309k<C4899r0<c>, Object> f103014f = C5300b.a(new D0(), new E0());

        /* renamed from: a  reason: collision with root package name */
        private final String f103015a;

        /* renamed from: b  reason: collision with root package name */
        private final String f103016b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f103017c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f103018d;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lto/C0$c$a;", "", "<init>", "()V", "Lf1/k;", "LU0/r0;", "Lto/C0$c;", "Saver", "Lf1/k;", "a", "()Lf1/k;", "", "LABEL", "Ljava/lang/String;", "TYPE", "REQUIRES_INPUT", "REQUIRES_COUNTRY", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5309k<C4899r0<c>, Object> a() {
                return c.f103014f;
            }

            private a() {
            }
        }

        public c(String str, String str2, boolean z10, boolean z11) {
            C17542s.j(str, "label");
            C17542s.j(str2, "type");
            this.f103015a = str;
            this.f103016b = str2;
            this.f103017c = z10;
            this.f103018d = z11;
        }

        /* access modifiers changed from: private */
        public static final Map c(m mVar, C4899r0 r0Var) {
            C17542s.j(mVar, "$this$mapSaver");
            C17542s.j(r0Var, "it");
            return X.m(C16796C.a("label", ((c) r0Var.getValue()).f103015a), C16796C.a("type", ((c) r0Var.getValue()).f103016b), C16796C.a("requiresInput", Boolean.valueOf(((c) r0Var.getValue()).f103018d)), C16796C.a("requiresCountry", Boolean.valueOf(((c) r0Var.getValue()).f103017c)));
        }

        /* access modifiers changed from: private */
        public static final C4899r0 d(Map map) {
            C17542s.j(map, "it");
            Object obj = map.get("label");
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = map.get("type");
            C17542s.h(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = map.get("requiresInput");
            C17542s.h(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = map.get("requiresCountry");
            C17542s.h(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            return u1.e(new c((String) obj, (String) obj2, ((Boolean) obj4).booleanValue(), booleanValue), (o1) null, 2, (Object) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f103015a, cVar.f103015a) && C17542s.e(this.f103016b, cVar.f103016b) && this.f103017c == cVar.f103017c && this.f103018d == cVar.f103018d;
        }

        public final String f() {
            return this.f103015a;
        }

        public final boolean g() {
            return this.f103017c;
        }

        public final boolean h() {
            return this.f103018d;
        }

        public int hashCode() {
            return (((((this.f103015a.hashCode() * 31) + this.f103016b.hashCode()) * 31) + Boolean.hashCode(this.f103017c)) * 31) + Boolean.hashCode(this.f103018d);
        }

        public final String i() {
            return this.f103016b;
        }

        public String toString() {
            String str = this.f103015a;
            String str2 = this.f103016b;
            boolean z10 = this.f103017c;
            boolean z11 = this.f103018d;
            return "IdMethod(label=" + str + ", type=" + str2 + ", requiresCountry=" + z10 + ", requiresInput=" + z11 + ")";
        }
    }

    public C0(b bVar, List<c> list, List<a> list2, C11978z0 z0Var, C13023e eVar) {
        C17542s.j(list, "idMethods");
        C17542s.j(list2, "countries");
        C17542s.j(z0Var, "validator");
        C17542s.j(eVar, "idSelectionLabel");
        this.f103001a = bVar;
        this.f103002b = list;
        this.f103003c = list2;
        this.f103004d = z0Var;
        this.f103005e = eVar;
    }

    public final List<a> a() {
        return this.f103003c;
    }

    public final b b() {
        return this.f103001a;
    }

    public final List<c> c() {
        return this.f103002b;
    }

    public final C13023e d() {
        return this.f103005e;
    }

    public final C11978z0 e() {
        return this.f103004d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return C17542s.e(this.f103002b, c02.f103002b) && C17542s.e(this.f103003c, c02.f103003c) && C17542s.e(this.f103001a, c02.f103001a) && C17542s.e(this.f103005e, c02.f103005e);
    }

    public int hashCode() {
        int hashCode = ((((this.f103002b.hashCode() * 31) + this.f103003c.hashCode()) * 31) + this.f103005e.hashCode()) * 31;
        b bVar = this.f103001a;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        b bVar = this.f103001a;
        List<c> list = this.f103002b;
        List<a> list2 = this.f103003c;
        C11978z0 z0Var = this.f103004d;
        C13023e eVar = this.f103005e;
        return "TaxIdOptionsState(fiscalCodeEntry=" + bVar + ", idMethods=" + list + ", countries=" + list2 + ", validator=" + z0Var + ", idSelectionLabel=" + eVar + ")";
    }
}
