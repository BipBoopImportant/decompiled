package go;

import IC.C13023e;
import KJ.C15987c;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lgo/T;", "", "<init>", "()V", "c", "b", "a", "Lgo/T$a;", "Lgo/T$b;", "Lgo/T$c;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class T {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgo/T$a;", "Lgo/T;", "LKJ/c;", "Lgo/T$a$a;", "deliveryPrices", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends T {

        /* renamed from: b  reason: collision with root package name */
        public static final int f97752b = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<C2190a> f97753a;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010&\u001a\u00020!8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lgo/T$a$a;", "LxB/a;", "", "id", "", "isSelected", "LIC/e;", "text", "value", "<init>", "(Ljava/lang/String;ZLIC/e;LIC/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Z", "i", "()Z", "c", "LIC/e;", "g", "()LIC/e;", "d", "h", "", "e", "J", "f", "()J", "stableId", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: go.T$a$a  reason: collision with other inner class name */
        public static final class C2190a implements C15201a {

            /* renamed from: f  reason: collision with root package name */
            public static final int f97754f = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final String f97755a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f97756b;

            /* renamed from: c  reason: collision with root package name */
            private final C13023e f97757c;

            /* renamed from: d  reason: collision with root package name */
            private final C13023e f97758d;

            /* renamed from: e  reason: collision with root package name */
            private final long f97759e;

            public C2190a(String str, boolean z10, C13023e eVar, C13023e eVar2) {
                C17542s.j(str, "id");
                C17542s.j(eVar, "text");
                C17542s.j(eVar2, "value");
                this.f97755a = str;
                this.f97756b = z10;
                this.f97757c = eVar;
                this.f97758d = eVar2;
                U u10 = new U(3);
                u10.a(P.b(C2190a.class));
                u10.a(str);
                u10.b(new Object[0]);
                this.f97759e = (long) Objects.hash(u10.d(new Object[u10.c()]));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2190a)) {
                    return false;
                }
                C2190a aVar = (C2190a) obj;
                return C17542s.e(this.f97755a, aVar.f97755a) && this.f97756b == aVar.f97756b && C17542s.e(this.f97757c, aVar.f97757c) && C17542s.e(this.f97758d, aVar.f97758d);
            }

            public long f() {
                return this.f97759e;
            }

            public final C13023e g() {
                return this.f97757c;
            }

            public final C13023e h() {
                return this.f97758d;
            }

            public int hashCode() {
                return (((((this.f97755a.hashCode() * 31) + Boolean.hashCode(this.f97756b)) * 31) + this.f97757c.hashCode()) * 31) + this.f97758d.hashCode();
            }

            public final boolean i() {
                return this.f97756b;
            }

            public String toString() {
                String str = this.f97755a;
                boolean z10 = this.f97756b;
                C13023e eVar = this.f97757c;
                C13023e eVar2 = this.f97758d;
                return "DeliveryPrice(id=" + str + ", isSelected=" + z10 + ", text=" + eVar + ", value=" + eVar2 + ")";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C15987c<C2190a> cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "deliveryPrices");
            this.f97753a = cVar;
        }

        public final C15987c<C2190a> a() {
            return this.f97753a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f97753a, ((a) obj).f97753a);
        }

        public int hashCode() {
            return this.f97753a.hashCode();
        }

        public String toString() {
            C15987c<C2190a> cVar = this.f97753a;
            return "Data(deliveryPrices=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgo/T$b;", "Lgo/T;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends T {

        /* renamed from: a  reason: collision with root package name */
        public static final b f97760a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -450706939;
        }

        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgo/T$c;", "Lgo/T;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends T {

        /* renamed from: a  reason: collision with root package name */
        public static final c f97761a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1817000455;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ T(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private T() {
    }
}
