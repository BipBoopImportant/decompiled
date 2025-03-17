package Op;

import com.ingka.ikea.core.model.Link;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LOp/Z0;", "", "d", "c", "b", "a", "e", "f", "g", "LOp/Z0$a;", "LOp/Z0$b;", "LOp/Z0$c;", "LOp/Z0$d;", "LOp/Z0$e;", "LOp/Z0$f;", "LOp/Z0$g;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Z0 {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LOp/Z0$a;", "LOp/Z0;", "", "itemNo", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Z0 {

        /* renamed from: a  reason: collision with root package name */
        private final String f85046a;

        public a(String str) {
            C17542s.j(str, "itemNo");
            this.f85046a = str;
        }

        public final String a() {
            return this.f85046a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f85046a, ((a) obj).f85046a);
        }

        public int hashCode() {
            return this.f85046a.hashCode();
        }

        public String toString() {
            String str = this.f85046a;
            return "ColorInfoClicked(itemNo=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LOp/Z0$b;", "LOp/Z0;", "", "itemNo", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Z0 {

        /* renamed from: a  reason: collision with root package name */
        private final String f85047a;

        public b(String str) {
            C17542s.j(str, "itemNo");
            this.f85047a = str;
        }

        public final String a() {
            return this.f85047a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f85047a, ((b) obj).f85047a);
        }

        public int hashCode() {
            return this.f85047a.hashCode();
        }

        public String toString() {
            String str = this.f85047a;
            return "EnergyLabelClicked(itemNo=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\n¨\u0006\u0019"}, d2 = {"LOp/Z0$c;", "LOp/Z0;", "LOp/Z0$c$a;", "type", "", "itemNo", "productName", "<init>", "(LOp/Z0$c$a;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOp/Z0$c$a;", "c", "()LOp/Z0$c$a;", "b", "Ljava/lang/String;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Z0 {

        /* renamed from: a  reason: collision with root package name */
        private final a f85048a;

        /* renamed from: b  reason: collision with root package name */
        private final String f85049b;

        /* renamed from: c  reason: collision with root package name */
        private final String f85050c;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LOp/Z0$c$a;", "", "<init>", "()V", "a", "f", "d", "g", "c", "b", "e", "LOp/Z0$c$a$a;", "LOp/Z0$c$a$b;", "LOp/Z0$c$a$c;", "LOp/Z0$c$a$d;", "LOp/Z0$c$a$e;", "LOp/Z0$c$a$f;", "LOp/Z0$c$a$g;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class a {

            /* renamed from: a  reason: collision with root package name */
            public static final int f85051a = 0;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/Z0$c$a$a;", "LOp/Z0$c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Op.Z0$c$a$a  reason: collision with other inner class name */
            public static final class C1718a extends a {

                /* renamed from: b  reason: collision with root package name */
                public static final C1718a f85052b = new C1718a();

                private C1718a() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1718a);
                }

                public int hashCode() {
                    return 1611386042;
                }

                public String toString() {
                    return "AddToCart";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LOp/Z0$c$a$b;", "LOp/Z0$c$a;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class b extends a {

                /* renamed from: b  reason: collision with root package name */
                private final String f85053b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public b(String str) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(str, "id");
                    this.f85053b = str;
                }

                public final String a() {
                    return this.f85053b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && C17542s.e(this.f85053b, ((b) obj).f85053b);
                }

                public int hashCode() {
                    return this.f85053b.hashCode();
                }

                public String toString() {
                    String str = this.f85053b;
                    return "Custom(id=" + str + ")";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/Z0$c$a$c;", "LOp/Z0$c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Op.Z0$c$a$c  reason: collision with other inner class name */
            public static final class C1719c extends a {

                /* renamed from: b  reason: collision with root package name */
                public static final C1719c f85054b = new C1719c();

                private C1719c() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1719c);
                }

                public int hashCode() {
                    return -1773393427;
                }

                public String toString() {
                    return "Delete";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/Z0$c$a$d;", "LOp/Z0$c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class d extends a {

                /* renamed from: b  reason: collision with root package name */
                public static final d f85055b = new d();

                private d() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return -1727780820;
                }

                public String toString() {
                    return "Favourites";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/Z0$c$a$e;", "LOp/Z0$c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class e extends a {

                /* renamed from: b  reason: collision with root package name */
                public static final e f85056b = new e();

                private e() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public int hashCode() {
                    return -1426731992;
                }

                public String toString() {
                    return "MarkAsCollected";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/Z0$c$a$f;", "LOp/Z0$c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class f extends a {

                /* renamed from: b  reason: collision with root package name */
                public static final f f85057b = new f();

                private f() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof f);
                }

                public int hashCode() {
                    return 1636601475;
                }

                public String toString() {
                    return "NotifyMe";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/Z0$c$a$g;", "LOp/Z0$c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class g extends a {

                /* renamed from: b  reason: collision with root package name */
                public static final g f85058b = new g();

                private g() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof g);
                }

                public int hashCode() {
                    return 1219877372;
                }

                public String toString() {
                    return "Scanner";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public c(a aVar, String str, String str2) {
            C17542s.j(aVar, "type");
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "productName");
            this.f85048a = aVar;
            this.f85049b = str;
            this.f85050c = str2;
        }

        public final String a() {
            return this.f85049b;
        }

        public final String b() {
            return this.f85050c;
        }

        public final a c() {
            return this.f85048a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f85048a, cVar.f85048a) && C17542s.e(this.f85049b, cVar.f85049b) && C17542s.e(this.f85050c, cVar.f85050c);
        }

        public int hashCode() {
            return (((this.f85048a.hashCode() * 31) + this.f85049b.hashCode()) * 31) + this.f85050c.hashCode();
        }

        public String toString() {
            a aVar = this.f85048a;
            String str = this.f85049b;
            String str2 = this.f85050c;
            return "FabClicked(type=" + aVar + ", itemNo=" + str + ", productName=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LOp/Z0$d;", "LOp/Z0;", "", "itemNo", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements Z0 {

        /* renamed from: a  reason: collision with root package name */
        private final String f85059a;

        public d(String str) {
            C17542s.j(str, "itemNo");
            this.f85059a = str;
        }

        public final String a() {
            return this.f85059a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f85059a, ((d) obj).f85059a);
        }

        public int hashCode() {
            return this.f85059a.hashCode();
        }

        public String toString() {
            String str = this.f85059a;
            return "ItemClicked(itemNo=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LOp/Z0$e;", "LOp/Z0;", "", "itemNo", "Lcom/ingka/ikea/core/model/Link;", "link", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/Link;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/core/model/Link;", "()Lcom/ingka/ikea/core/model/Link;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements Z0 {

        /* renamed from: a  reason: collision with root package name */
        private final String f85060a;

        /* renamed from: b  reason: collision with root package name */
        private final Link f85061b;

        public e(String str, Link link) {
            C17542s.j(str, "itemNo");
            C17542s.j(link, "link");
            this.f85060a = str;
            this.f85061b = link;
        }

        public final String a() {
            return this.f85060a;
        }

        public final Link b() {
            return this.f85061b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f85060a, eVar.f85060a) && C17542s.e(this.f85061b, eVar.f85061b);
        }

        public int hashCode() {
            return (this.f85060a.hashCode() * 31) + this.f85061b.hashCode();
        }

        public String toString() {
            String str = this.f85060a;
            Link link = this.f85061b;
            return "LinkClicked(itemNo=" + str + ", link=" + link + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LOp/Z0$f;", "LOp/Z0;", "", "itemNo", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements Z0 {

        /* renamed from: a  reason: collision with root package name */
        private final String f85062a;

        public f(String str) {
            C17542s.j(str, "itemNo");
            this.f85062a = str;
        }

        public final String a() {
            return this.f85062a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C17542s.e(this.f85062a, ((f) obj).f85062a);
        }

        public int hashCode() {
            return this.f85062a.hashCode();
        }

        public String toString() {
            String str = this.f85062a;
            return "OptionsMenuClicked(itemNo=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"LOp/Z0$g;", "LOp/Z0;", "", "itemNo", "", "newQuantity", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements Z0 {

        /* renamed from: a  reason: collision with root package name */
        private final String f85063a;

        /* renamed from: b  reason: collision with root package name */
        private final int f85064b;

        public g(String str, int i10) {
            C17542s.j(str, "itemNo");
            this.f85063a = str;
            this.f85064b = i10;
        }

        public final String a() {
            return this.f85063a;
        }

        public final int b() {
            return this.f85064b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C17542s.e(this.f85063a, gVar.f85063a) && this.f85064b == gVar.f85064b;
        }

        public int hashCode() {
            return (this.f85063a.hashCode() * 31) + Integer.hashCode(this.f85064b);
        }

        public String toString() {
            String str = this.f85063a;
            int i10 = this.f85064b;
            return "QuantityChanged(itemNo=" + str + ", newQuantity=" + i10 + ")";
        }
    }
}
