package bJ;

import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bJ.d  reason: case insensitive filesystem */
public abstract class C17045d {

    /* renamed from: bJ.d$a */
    public static final class a extends C17045d {

        /* renamed from: a  reason: collision with root package name */
        private final String f141173a;

        /* renamed from: b  reason: collision with root package name */
        private final String f141174b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "name");
            C17542s.j(str2, "desc");
            this.f141173a = str;
            this.f141174b = str2;
        }

        public String a() {
            return e() + ':' + d();
        }

        public final String b() {
            return this.f141173a;
        }

        public final String c() {
            return this.f141174b;
        }

        public String d() {
            return this.f141174b;
        }

        public String e() {
            return this.f141173a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f141173a, aVar.f141173a) && C17542s.e(this.f141174b, aVar.f141174b);
        }

        public int hashCode() {
            return (this.f141173a.hashCode() * 31) + this.f141174b.hashCode();
        }
    }

    /* renamed from: bJ.d$b */
    public static final class b extends C17045d {

        /* renamed from: a  reason: collision with root package name */
        private final String f141175a;

        /* renamed from: b  reason: collision with root package name */
        private final String f141176b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "name");
            C17542s.j(str2, "desc");
            this.f141175a = str;
            this.f141176b = str2;
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f141175a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f141176b;
            }
            return bVar.b(str, str2);
        }

        public String a() {
            return e() + d();
        }

        public final b b(String str, String str2) {
            C17542s.j(str, "name");
            C17542s.j(str2, "desc");
            return new b(str, str2);
        }

        public String d() {
            return this.f141176b;
        }

        public String e() {
            return this.f141175a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f141175a, bVar.f141175a) && C17542s.e(this.f141176b, bVar.f141176b);
        }

        public int hashCode() {
            return (this.f141175a.hashCode() * 31) + this.f141176b.hashCode();
        }
    }

    public /* synthetic */ C17045d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public final String toString() {
        return a();
    }

    private C17045d() {
    }
}
