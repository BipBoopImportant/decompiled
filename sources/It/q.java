package It;

import Gt.b;
import It.C10749l;
import KJ.C15987c;
import Mt.a;
import Op.c1;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\"\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#\u0001\"$%&'()*+,-./0123456789:;<=>?@ABCDE¨\u0006F"}, d2 = {"LIt/q;", "", "r", "w", "x", "D", "y", "k", "h", "G", "a", "H", "l", "E", "i", "n", "C", "s", "q", "o", "p", "f", "g", "z", "m", "j", "b", "c", "d", "e", "t", "v", "u", "F", "B", "A", "LIt/q$a;", "LIt/q$b;", "LIt/q$c;", "LIt/q$d;", "LIt/q$e;", "LIt/q$f;", "LIt/q$g;", "LIt/q$h;", "LIt/q$i;", "LIt/q$j;", "LIt/q$k;", "LIt/q$l;", "LIt/q$m;", "LIt/q$n;", "LIt/q$o;", "LIt/q$p;", "LIt/q$q;", "LIt/q$r;", "LIt/q$s;", "LIt/q$t;", "LIt/q$u;", "LIt/q$v;", "LIt/q$w;", "LIt/q$x;", "LIt/q$y;", "LIt/q$z;", "LIt/q$A;", "LIt/q$B;", "LIt/q$C;", "LIt/q$D;", "LIt/q$E;", "LIt/q$F;", "LIt/q$G;", "LIt/q$H;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface q {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/q$A;", "LIt/q;", "", "storeId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class A implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82368a;

        public A(String str) {
            C17542s.j(str, "storeId");
            this.f82368a = str;
        }

        public final String a() {
            return this.f82368a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && C17542s.e(this.f82368a, ((A) obj).f82368a);
        }

        public int hashCode() {
            return this.f82368a.hashCode();
        }

        public String toString() {
            String str = this.f82368a;
            return "SmallStoreActionClicked(storeId=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/q$B;", "LIt/q;", "", "storeId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class B implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82369a;

        public B(String str) {
            C17542s.j(str, "storeId");
            this.f82369a = str;
        }

        public final String a() {
            return this.f82369a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof B) && C17542s.e(this.f82369a, ((B) obj).f82369a);
        }

        public int hashCode() {
            return this.f82369a.hashCode();
        }

        public String toString() {
            String str = this.f82369a;
            return "SmallStoreDismissed(storeId=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$C;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final C f82370a = new C();

        private C() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C);
        }

        public int hashCode() {
            return -607478654;
        }

        public String toString() {
            return "SnackBarRetry";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LIt/q$D;", "LIt/q;", "LAe/l;", "entryPoint", "<init>", "(LAe/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LAe/l;", "()LAe/l;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class D implements q {

        /* renamed from: a  reason: collision with root package name */
        private final Ae.l f82371a;

        public D(Ae.l lVar) {
            C17542s.j(lVar, "entryPoint");
            this.f82371a = lVar;
        }

        public final Ae.l a() {
            return this.f82371a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof D) && this.f82371a == ((D) obj).f82371a;
        }

        public int hashCode() {
            return this.f82371a.hashCode();
        }

        public String toString() {
            Ae.l lVar = this.f82371a;
            return "StartScanningClicked(entryPoint=" + lVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/q$E;", "LIt/q;", "", "storeId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class E implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82372a;

        public E(String str) {
            C17542s.j(str, "storeId");
            this.f82372a = str;
        }

        public final String a() {
            return this.f82372a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof E) && C17542s.e(this.f82372a, ((E) obj).f82372a);
        }

        public int hashCode() {
            return this.f82372a.hashCode();
        }

        public String toString() {
            String str = this.f82372a;
            return "StoreDetailsClicked(storeId=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LIt/q$F;", "LIt/q;", "LKJ/c;", "", "itemIds", "<init>", "(LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class F implements q {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<String> f82373a;

        public F(C15987c<String> cVar) {
            C17542s.j(cVar, "itemIds");
            this.f82373a = cVar;
        }

        public final C15987c<String> a() {
            return this.f82373a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof F) && C17542s.e(this.f82373a, ((F) obj).f82373a);
        }

        public int hashCode() {
            return this.f82373a.hashCode();
        }

        public String toString() {
            C15987c<String> cVar = this.f82373a;
            return "StoreOffersShown(itemIds=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$G;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class G implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final G f82374a = new G();

        private G() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof G);
        }

        public int hashCode() {
            return -1355437259;
        }

        public String toString() {
            return "UpgradeAccountClicked";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/q$H;", "LIt/q;", "", "storeId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class H implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82375a;

        public H(String str) {
            C17542s.j(str, "storeId");
            this.f82375a = str;
        }

        public final String a() {
            return this.f82375a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof H) && C17542s.e(this.f82375a, ((H) obj).f82375a);
        }

        public int hashCode() {
            return this.f82375a.hashCode();
        }

        public String toString() {
            String str = this.f82375a;
            return "WayfindingClicked(storeId=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LIt/q$a;", "LIt/q;", "", "storeId", "LIt/l$h$a;", "origin", "<init>", "(Ljava/lang/String;LIt/l$h$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LIt/l$h$a;", "()LIt/l$h$a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.q$a  reason: case insensitive filesystem */
    public static final class C10753a implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82376a;

        /* renamed from: b  reason: collision with root package name */
        private final C10749l.h.a f82377b;

        public C10753a(String str, C10749l.h.a aVar) {
            C17542s.j(str, "storeId");
            C17542s.j(aVar, "origin");
            this.f82376a = str;
            this.f82377b = aVar;
        }

        public final C10749l.h.a a() {
            return this.f82377b;
        }

        public final String b() {
            return this.f82376a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10753a)) {
                return false;
            }
            C10753a aVar = (C10753a) obj;
            return C17542s.e(this.f82376a, aVar.f82376a) && this.f82377b == aVar.f82377b;
        }

        public int hashCode() {
            return (this.f82376a.hashCode() * 31) + this.f82377b.hashCode();
        }

        public String toString() {
            String str = this.f82376a;
            C10749l.h.a aVar = this.f82377b;
            return "AllEventsClicked(storeId=" + str + ", origin=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LIt/q$b;", "LIt/q;", "LMt/a;", "benefit", "<init>", "(LMt/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMt/a;", "()LMt/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.q$b  reason: case insensitive filesystem */
    public static final class C10754b implements q {

        /* renamed from: a  reason: collision with root package name */
        private final a f82378a;

        public C10754b(a aVar) {
            C17542s.j(aVar, "benefit");
            this.f82378a = aVar;
        }

        public final a a() {
            return this.f82378a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10754b) && C17542s.e(this.f82378a, ((C10754b) obj).f82378a);
        }

        public int hashCode() {
            return this.f82378a.hashCode();
        }

        public String toString() {
            a aVar = this.f82378a;
            return "BenefitClicked(benefit=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$c;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.q$c  reason: case insensitive filesystem */
    public static final class C10755c implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final C10755c f82379a = new C10755c();

        private C10755c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C10755c);
        }

        public int hashCode() {
            return 303331001;
        }

        public String toString() {
            return "BenefitClickedConsumed";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$d;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.q$d  reason: case insensitive filesystem */
    public static final class C10756d implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final C10756d f82380a = new C10756d();

        private C10756d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C10756d);
        }

        public int hashCode() {
            return 1831774885;
        }

        public String toString() {
            return "BenefitDetailsActionClicked";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"LIt/q$e;", "LIt/q;", "c", "a", "b", "LIt/q$e$a;", "LIt/q$e$c;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.q$e  reason: case insensitive filesystem */
    public interface C10757e extends q {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LIt/q$e$a;", "LIt/q$e;", "", "nearbyStoreId", "LIt/q$e$b;", "type", "<init>", "(Ljava/lang/String;LIt/q$e$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LIt/q$e$b;", "()LIt/q$e$b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: It.q$e$a */
        public static final class a implements C10757e {

            /* renamed from: a  reason: collision with root package name */
            private final String f82381a;

            /* renamed from: b  reason: collision with root package name */
            private final b f82382b;

            public a(String str, b bVar) {
                C17542s.j(str, "nearbyStoreId");
                C17542s.j(bVar, "type");
                this.f82381a = str;
                this.f82382b = bVar;
            }

            public final String a() {
                return this.f82381a;
            }

            public final b b() {
                return this.f82382b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f82381a, aVar.f82381a) && this.f82382b == aVar.f82382b;
            }

            public int hashCode() {
                return (this.f82381a.hashCode() * 31) + this.f82382b.hashCode();
            }

            public String toString() {
                String str = this.f82381a;
                b bVar = this.f82382b;
                return "ChangeStoreConfirmed(nearbyStoreId=" + str + ", type=" + bVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LIt/q$e$b;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_STORE", "CHANGE_STORE_CLEAR_SCAN_AND_GO", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: It.q$e$b */
        public enum b {
            CHANGE_STORE,
            CHANGE_STORE_CLEAR_SCAN_AND_GO;

            static {
                b[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LIt/q$e$c;", "LIt/q$e;", "LIt/q$e$b;", "type", "<init>", "(LIt/q$e$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIt/q$e$b;", "()LIt/q$e$b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: It.q$e$c */
        public static final class c implements C10757e {

            /* renamed from: a  reason: collision with root package name */
            private final b f82383a;

            public c(b bVar) {
                C17542s.j(bVar, "type");
                this.f82383a = bVar;
            }

            public final b a() {
                return this.f82383a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f82383a == ((c) obj).f82383a;
            }

            public int hashCode() {
                return this.f82383a.hashCode();
            }

            public String toString() {
                b bVar = this.f82383a;
                return "Dismissed(type=" + bVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$f;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.q$f  reason: case insensitive filesystem */
    public static final class C10758f implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final C10758f f82384a = new C10758f();

        private C10758f() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C10758f);
        }

        public int hashCode() {
            return -2086424214;
        }

        public String toString() {
            return "DisableStoreModeClicked";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LIt/q$g;", "LIt/q;", "", "storeId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStoreId", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.q$g  reason: case insensitive filesystem */
    public static final class C10759g implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82385a;

        public C10759g(String str) {
            C17542s.j(str, "storeId");
            this.f82385a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10759g) && C17542s.e(this.f82385a, ((C10759g) obj).f82385a);
        }

        public int hashCode() {
            return this.f82385a.hashCode();
        }

        public String toString() {
            String str = this.f82385a;
            return "DisableStoreModeConfirmed(storeId=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$h;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.q$h  reason: case insensitive filesystem */
    public static final class C10760h implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final C10760h f82386a = new C10760h();

        private C10760h() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C10760h);
        }

        public int hashCode() {
            return 1482898738;
        }

        public String toString() {
            return "FamilyCardClicked";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/q$i;", "LIt/q;", "", "url", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82387a;

        public i(String str) {
            C17542s.j(str, "url");
            this.f82387a = str;
        }

        public final String a() {
            return this.f82387a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C17542s.e(this.f82387a, ((i) obj).f82387a);
        }

        public int hashCode() {
            return this.f82387a.hashCode();
        }

        public String toString() {
            String str = this.f82387a;
            return "FoodMobileClicked(url=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$j;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final j f82388a = new j();

        private j() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return -1517253413;
        }

        public String toString() {
            return "HandleStoreMode";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$k;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final k f82389a = new k();

        private k() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public int hashCode() {
            return 823245023;
        }

        public String toString() {
            return "LoginClicked";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LIt/q$l;", "LIt/q;", "LGt/b;", "item", "<init>", "(LGt/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGt/b;", "()LGt/b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l implements q {

        /* renamed from: a  reason: collision with root package name */
        private final b f82390a;

        public l(b bVar) {
            C17542s.j(bVar, "item");
            this.f82390a = bVar;
        }

        public final b a() {
            return this.f82390a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f82390a == ((l) obj).f82390a;
        }

        public int hashCode() {
            return this.f82390a.hashCode();
        }

        public String toString() {
            b bVar = this.f82390a;
            return "MenuClicked(item=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$m;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final m f82391a = new m();

        private m() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public int hashCode() {
            return 1260981283;
        }

        public String toString() {
            return "NextOnboardingEntry";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"LIt/q$n;", "LIt/q;", "", "eventId", "storeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82392a;

        /* renamed from: b  reason: collision with root package name */
        private final String f82393b;

        public n(String str, String str2) {
            C17542s.j(str, "eventId");
            C17542s.j(str2, "storeId");
            this.f82392a = str;
            this.f82393b = str2;
        }

        public final String a() {
            return this.f82392a;
        }

        public final String b() {
            return this.f82393b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return C17542s.e(this.f82392a, nVar.f82392a) && C17542s.e(this.f82393b, nVar.f82393b);
        }

        public int hashCode() {
            return (this.f82392a.hashCode() * 31) + this.f82393b.hashCode();
        }

        public String toString() {
            String str = this.f82392a;
            String str2 = this.f82393b;
            return "OnEventClicked(eventId=" + str + ", storeId=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LIt/q$o;", "LIt/q;", "LOp/c1;", "event", "<init>", "(LOp/c1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOp/c1;", "()LOp/c1;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class o implements q {

        /* renamed from: a  reason: collision with root package name */
        private final c1 f82394a;

        public o(c1 c1Var) {
            C17542s.j(c1Var, "event");
            this.f82394a = c1Var;
        }

        public final c1 a() {
            return this.f82394a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && C17542s.e(this.f82394a, ((o) obj).f82394a);
        }

        public int hashCode() {
            return this.f82394a.hashCode();
        }

        public String toString() {
            c1 c1Var = this.f82394a;
            return "OnOfferClicked(event=" + c1Var + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"LIt/q$p;", "LIt/q;", "", "storeId", "eventId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class p implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82395a;

        /* renamed from: b  reason: collision with root package name */
        private final String f82396b;

        public p(String str, String str2) {
            C17542s.j(str, "storeId");
            C17542s.j(str2, "eventId");
            this.f82395a = str;
            this.f82396b = str2;
        }

        public final String a() {
            return this.f82396b;
        }

        public final String b() {
            return this.f82395a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return C17542s.e(this.f82395a, pVar.f82395a) && C17542s.e(this.f82396b, pVar.f82396b);
        }

        public int hashCode() {
            return (this.f82395a.hashCode() * 31) + this.f82396b.hashCode();
        }

        public String toString() {
            String str = this.f82395a;
            String str2 = this.f82396b;
            return "OnStoreEventReminderClicked(storeId=" + str + ", eventId=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$q;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.q$q  reason: collision with other inner class name */
    public static final class C1616q implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final C1616q f82397a = new C1616q();

        private C1616q() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1616q);
        }

        public int hashCode() {
            return 1614698196;
        }

        public String toString() {
            return "OnViewAllOffersClicked";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$r;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class r implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final r f82398a = new r();

        private r() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public int hashCode() {
            return -2106788213;
        }

        public String toString() {
            return "OneTimeEffectConsumed";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/q$s;", "LIt/q;", "", "storeId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class s implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82399a;

        public s(String str) {
            C17542s.j(str, "storeId");
            this.f82399a = str;
        }

        public final String a() {
            return this.f82399a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && C17542s.e(this.f82399a, ((s) obj).f82399a);
        }

        public int hashCode() {
            return this.f82399a.hashCode();
        }

        public String toString() {
            String str = this.f82399a;
            return "PopularTimesClicked(storeId=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, d2 = {"LIt/q$t;", "LIt/q;", "", "productName", "listName", "listId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class t implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82400a;

        /* renamed from: b  reason: collision with root package name */
        private final String f82401b;

        /* renamed from: c  reason: collision with root package name */
        private final String f82402c;

        public t(String str, String str2, String str3) {
            C17542s.j(str, "productName");
            C17542s.j(str2, "listName");
            C17542s.j(str3, "listId");
            this.f82400a = str;
            this.f82401b = str2;
            this.f82402c = str3;
        }

        public final String a() {
            return this.f82402c;
        }

        public final String b() {
            return this.f82401b;
        }

        public final String c() {
            return this.f82400a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return C17542s.e(this.f82400a, tVar.f82400a) && C17542s.e(this.f82401b, tVar.f82401b) && C17542s.e(this.f82402c, tVar.f82402c);
        }

        public int hashCode() {
            return (((this.f82400a.hashCode() * 31) + this.f82401b.hashCode()) * 31) + this.f82402c.hashCode();
        }

        public String toString() {
            String str = this.f82400a;
            String str2 = this.f82401b;
            String str3 = this.f82402c;
            return "ProductAddedToList(productName=" + str + ", listName=" + str2 + ", listId=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$u;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class u implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final u f82403a = new u();

        private u() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public int hashCode() {
            return 371352339;
        }

        public String toString() {
            return "ProductAddedToListConsumed";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, d2 = {"LIt/q$v;", "LIt/q;", "", "productName", "listName", "listId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class v implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82404a;

        /* renamed from: b  reason: collision with root package name */
        private final String f82405b;

        /* renamed from: c  reason: collision with root package name */
        private final String f82406c;

        public v(String str, String str2, String str3) {
            C17542s.j(str, "productName");
            C17542s.j(str2, "listName");
            C17542s.j(str3, "listId");
            this.f82404a = str;
            this.f82405b = str2;
            this.f82406c = str3;
        }

        public final String a() {
            return this.f82406c;
        }

        public final String b() {
            return this.f82405b;
        }

        public final String c() {
            return this.f82404a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return C17542s.e(this.f82404a, vVar.f82404a) && C17542s.e(this.f82405b, vVar.f82405b) && C17542s.e(this.f82406c, vVar.f82406c);
        }

        public int hashCode() {
            return (((this.f82404a.hashCode() * 31) + this.f82405b.hashCode()) * 31) + this.f82406c.hashCode();
        }

        public String toString() {
            String str = this.f82404a;
            String str2 = this.f82405b;
            String str3 = this.f82406c;
            return "ProductRemovedFromList(productName=" + str + ", listName=" + str2 + ", listId=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$w;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class w implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final w f82407a = new w();

        private w() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        public int hashCode() {
            return -1815495284;
        }

        public String toString() {
            return "ScrollToTop";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$x;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class x implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final x f82408a = new x();

        private x() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public int hashCode() {
            return 791083715;
        }

        public String toString() {
            return "SelectStoreClicked";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/q$y;", "LIt/q;", "", "listId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class y implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f82409a;

        public y(String str) {
            this.f82409a = str;
        }

        public final String a() {
            return this.f82409a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && C17542s.e(this.f82409a, ((y) obj).f82409a);
        }

        public int hashCode() {
            String str = this.f82409a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f82409a;
            return "ShoppingListClicked(listId=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/q$z;", "LIt/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class z implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final z f82410a = new z();

        private z() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        public int hashCode() {
            return -1907617978;
        }

        public String toString() {
            return "ShortcutsMoreClicked";
        }
    }
}
