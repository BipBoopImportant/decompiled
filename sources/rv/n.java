package Rv;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LRv/n;", "", "b", "c", "a", "d", "LRv/n$b;", "LRv/n$c;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface n {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0013B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0007\u0010\u001b¨\u0006\u001d"}, d2 = {"LRv/n$a;", "LRv/n$c;", "", "firstName", "lastName", "cardNumber", "", "isLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getLastName", "c", "getCardNumber", "d", "Z", "()Z", "e", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: e  reason: collision with root package name */
        public static final C0649a f39824e = new C0649a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f39825a;

        /* renamed from: b  reason: collision with root package name */
        private final String f39826b;

        /* renamed from: c  reason: collision with root package name */
        private final String f39827c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f39828d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRv/n$a$a;", "", "<init>", "()V", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rv.n$a$a  reason: collision with other inner class name */
        public static final class C0649a {
            public /* synthetic */ C0649a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0649a() {
            }
        }

        public a(String str, String str2, String str3, boolean z10) {
            C17542s.j(str, "firstName");
            C17542s.j(str2, "lastName");
            C17542s.j(str3, "cardNumber");
            this.f39825a = str;
            this.f39826b = str2;
            this.f39827c = str3;
            this.f39828d = z10;
        }

        public String a() {
            return this.f39825a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f39825a, aVar.f39825a) && C17542s.e(this.f39826b, aVar.f39826b) && C17542s.e(this.f39827c, aVar.f39827c) && this.f39828d == aVar.f39828d;
        }

        public int hashCode() {
            return (((((this.f39825a.hashCode() * 31) + this.f39826b.hashCode()) * 31) + this.f39827c.hashCode()) * 31) + Boolean.hashCode(this.f39828d);
        }

        public String toString() {
            String str = this.f39825a;
            String str2 = this.f39826b;
            String str3 = this.f39827c;
            boolean z10 = this.f39828d;
            return "Family(firstName=" + str + ", lastName=" + str2 + ", cardNumber=" + str3 + ", isLoading=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRv/n$b;", "LRv/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39829a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 2111832019;
        }

        public String toString() {
            return "Guest";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LRv/n$c;", "LRv/n;", "", "a", "()Ljava/lang/String;", "firstName", "LRv/n$a;", "LRv/n$d;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c extends n {
        String a();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018¨\u0006\u001a"}, d2 = {"LRv/n$d;", "LRv/n$c;", "", "firstName", "lastName", "", "isLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getLastName", "c", "Z", "()Z", "d", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements c {

        /* renamed from: d  reason: collision with root package name */
        public static final a f39830d = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f39831a;

        /* renamed from: b  reason: collision with root package name */
        private final String f39832b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f39833c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRv/n$d$a;", "", "<init>", "()V", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public d(String str, String str2, boolean z10) {
            C17542s.j(str, "firstName");
            C17542s.j(str2, "lastName");
            this.f39831a = str;
            this.f39832b = str2;
            this.f39833c = z10;
        }

        public String a() {
            return this.f39831a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f39831a, dVar.f39831a) && C17542s.e(this.f39832b, dVar.f39832b) && this.f39833c == dVar.f39833c;
        }

        public int hashCode() {
            return (((this.f39831a.hashCode() * 31) + this.f39832b.hashCode()) * 31) + Boolean.hashCode(this.f39833c);
        }

        public String toString() {
            String str = this.f39831a;
            String str2 = this.f39832b;
            boolean z10 = this.f39833c;
            return "Regular(firstName=" + str + ", lastName=" + str2 + ", isLoading=" + z10 + ")";
        }
    }
}
