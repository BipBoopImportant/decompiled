package rz;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lrz/C;", "", "<init>", "()V", "c", "e", "d", "b", "a", "Lrz/C$b;", "Lrz/C$c;", "Lrz/C$d;", "Lrz/C$e;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class C {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lrz/C$a;", "", "<init>", "(Ljava/lang/String;I)V", "PAYMENT_UNKNOWN_STATUS", "PAYMENT_COMPLETED", "PAYMENT_WAITING", "PAYMENT_IN_PROGRESS", "PAYMENT_ABORTED", "PAYMENT_TIMEOUT", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        PAYMENT_UNKNOWN_STATUS,
        PAYMENT_COMPLETED,
        PAYMENT_WAITING,
        PAYMENT_IN_PROGRESS,
        PAYMENT_ABORTED,
        PAYMENT_TIMEOUT;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lrz/C$b;", "Lrz/C;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "aborted", "c", "b", "Lrz/C$b$a;", "Lrz/C$b$b;", "Lrz/C$b$c;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b extends C {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lrz/C$b$a;", "Lrz/C$b;", "", "aborted", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f130706a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "aborted");
                this.f130706a = str;
            }

            public String a() {
                return this.f130706a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f130706a, ((a) obj).f130706a);
            }

            public int hashCode() {
                return this.f130706a.hashCode();
            }

            public String toString() {
                String str = this.f130706a;
                return "PaymentAborted(aborted=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lrz/C$b$b;", "Lrz/C$b;", "", "aborted", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rz.C$b$b  reason: collision with other inner class name */
        public static final class C3232b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f130707a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3232b(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "aborted");
                this.f130707a = str;
            }

            public String a() {
                return this.f130707a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3232b) && C17542s.e(this.f130707a, ((C3232b) obj).f130707a);
            }

            public int hashCode() {
                return this.f130707a.hashCode();
            }

            public String toString() {
                String str = this.f130707a;
                return "PaymentTimeout(aborted=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lrz/C$b$c;", "Lrz/C$b;", "", "aborted", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f130708a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "aborted");
                this.f130708a = str;
            }

            public String a() {
                return this.f130708a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f130708a, ((c) obj).f130708a);
            }

            public int hashCode() {
                return this.f130708a.hashCode();
            }

            public String toString() {
                String str = this.f130708a;
                return "PaymentUnknownStatus(aborted=" + str + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String a();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lrz/C$c;", "Lrz/C;", "", "code", "heading", "body", "pickupHeading", "pickupBody", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "getPickupHeading", "e", "getPickupBody", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C {

        /* renamed from: a  reason: collision with root package name */
        private final String f130709a;

        /* renamed from: b  reason: collision with root package name */
        private final String f130710b;

        /* renamed from: c  reason: collision with root package name */
        private final String f130711c;

        /* renamed from: d  reason: collision with root package name */
        private final String f130712d;

        /* renamed from: e  reason: collision with root package name */
        private final String f130713e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4, String str5) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "code");
            C17542s.j(str2, "heading");
            C17542s.j(str3, "body");
            C17542s.j(str4, "pickupHeading");
            C17542s.j(str5, "pickupBody");
            this.f130709a = str;
            this.f130710b = str2;
            this.f130711c = str3;
            this.f130712d = str4;
            this.f130713e = str5;
        }

        public final String a() {
            return this.f130711c;
        }

        public final String b() {
            return this.f130709a;
        }

        public final String c() {
            return this.f130710b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f130709a, cVar.f130709a) && C17542s.e(this.f130710b, cVar.f130710b) && C17542s.e(this.f130711c, cVar.f130711c) && C17542s.e(this.f130712d, cVar.f130712d) && C17542s.e(this.f130713e, cVar.f130713e);
        }

        public int hashCode() {
            return (((((((this.f130709a.hashCode() * 31) + this.f130710b.hashCode()) * 31) + this.f130711c.hashCode()) * 31) + this.f130712d.hashCode()) * 31) + this.f130713e.hashCode();
        }

        public String toString() {
            String str = this.f130709a;
            String str2 = this.f130710b;
            String str3 = this.f130711c;
            String str4 = this.f130712d;
            String str5 = this.f130713e;
            return "PaymentCompleted(code=" + str + ", heading=" + str2 + ", body=" + str3 + ", pickupHeading=" + str4 + ", pickupBody=" + str5 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lrz/C$d;", "Lrz/C;", "", "heading", "body", "cancel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C {

        /* renamed from: a  reason: collision with root package name */
        private final String f130714a;

        /* renamed from: b  reason: collision with root package name */
        private final String f130715b;

        /* renamed from: c  reason: collision with root package name */
        private final String f130716c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "heading");
            C17542s.j(str2, "body");
            C17542s.j(str3, "cancel");
            this.f130714a = str;
            this.f130715b = str2;
            this.f130716c = str3;
        }

        public final String a() {
            return this.f130715b;
        }

        public final String b() {
            return this.f130716c;
        }

        public final String c() {
            return this.f130714a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f130714a, dVar.f130714a) && C17542s.e(this.f130715b, dVar.f130715b) && C17542s.e(this.f130716c, dVar.f130716c);
        }

        public int hashCode() {
            return (((this.f130714a.hashCode() * 31) + this.f130715b.hashCode()) * 31) + this.f130716c.hashCode();
        }

        public String toString() {
            String str = this.f130714a;
            String str2 = this.f130715b;
            String str3 = this.f130716c;
            return "PaymentInProgress(heading=" + str + ", body=" + str2 + ", cancel=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrz/C$e;", "Lrz/C;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends C {

        /* renamed from: a  reason: collision with root package name */
        public static final e f130717a = new e();

        private e() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -1428259616;
        }

        public String toString() {
            return "PaymentWaiting";
        }
    }

    public /* synthetic */ C(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C() {
    }
}
