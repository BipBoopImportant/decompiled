package An;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0006\u0007\u0004\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"LAn/b;", "", "<init>", "()V", "a", "c", "d", "e", "b", "LAn/b$a;", "LAn/b$c;", "LAn/b$d;", "LAn/b$e;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1462b f78982a = new C1462b((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0015"}, d2 = {"LAn/b$a;", "LAn/b;", "", "postalCode", "storeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "c", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private final String f78983b;

        /* renamed from: c  reason: collision with root package name */
        private final String f78984c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "postalCode");
            C17542s.j(str2, "storeName");
            this.f78983b = str;
            this.f78984c = str2;
        }

        public final String a() {
            return this.f78983b;
        }

        public final String b() {
            return this.f78984c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f78983b, aVar.f78983b) && C17542s.e(this.f78984c, aVar.f78984c);
        }

        public int hashCode() {
            return (this.f78983b.hashCode() * 31) + this.f78984c.hashCode();
        }

        public String toString() {
            String str = this.f78983b;
            String str2 = this.f78984c;
            return "BothSelected(postalCode=" + str + ", storeName=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LAn/b$b;", "", "<init>", "()V", "", "storeName", "postalCode", "", "deliverySwitchActivated", "storeSwitchActivated", "LAn/b;", "a", "(Ljava/lang/String;Ljava/lang/String;ZZ)LAn/b;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: An.b$b  reason: collision with other inner class name */
    public static final class C1462b {
        public /* synthetic */ C1462b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String str, String str2, boolean z10, boolean z11) {
            C17542s.j(str, "storeName");
            C17542s.j(str2, "postalCode");
            return (z10 || z11) ? (!z10 || !z11) ? z10 ? new d(str2) : new e(str) : new a(str2, str) : c.f78985b;
        }

        private C1462b() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LAn/b$c;", "LAn/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final c f78985b = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -823336335;
        }

        public String toString() {
            return "Deactivated";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LAn/b$d;", "LAn/b;", "", "postalCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends b {

        /* renamed from: b  reason: collision with root package name */
        private final String f78986b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "postalCode");
            this.f78986b = str;
        }

        public final String a() {
            return this.f78986b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f78986b, ((d) obj).f78986b);
        }

        public int hashCode() {
            return this.f78986b.hashCode();
        }

        public String toString() {
            String str = this.f78986b;
            return "DeliverySelected(postalCode=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LAn/b$e;", "LAn/b;", "", "storeName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends b {

        /* renamed from: b  reason: collision with root package name */
        private final String f78987b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "storeName");
            this.f78987b = str;
        }

        public final String a() {
            return this.f78987b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C17542s.e(this.f78987b, ((e) obj).f78987b);
        }

        public int hashCode() {
            return this.f78987b.hashCode();
        }

        public String toString() {
            String str = this.f78987b;
            return "StoreSelected(storeName=" + str + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
