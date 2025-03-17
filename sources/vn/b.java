package Vn;

import Nn.C10812o;
import Nn.G;
import Nn.J;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\t\u000bJ6\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H¦B¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LVn/b;", "", "", "checkoutId", "LVn/b$b;", "selectDeliveryService", "", "additionalValues", "LVn/b$a;", "a", "(Ljava/lang/String;LVn/b$b;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "b", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LVn/b$a;", "", "<init>", "()V", "b", "a", "LVn/b$a$a;", "LVn/b$a$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LVn/b$a$a;", "LVn/b$a;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Vn.b$a$a  reason: collision with other inner class name */
        public static final class C1879a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f88720a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1879a(Throwable th2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(th2, UiComponentContainer.RESULT_ERROR);
                this.f88720a = th2;
            }

            public final Throwable a() {
                return this.f88720a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1879a) && C17542s.e(this.f88720a, ((C1879a) obj).f88720a);
            }

            public int hashCode() {
                return this.f88720a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f88720a;
                return "Error(error=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVn/b$a$b;", "LVn/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Vn.b$a$b  reason: collision with other inner class name */
        public static final class C1880b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1880b f88721a = new C1880b();

            private C1880b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1880b);
            }

            public int hashCode() {
                return 2108719502;
            }

            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"LVn/b$b;", "", "<init>", "()V", "LNn/J$b;", "b", "()LNn/J$b;", "selectServiceCategory", "", "a", "()Ljava/lang/String;", "deliveryServiceId", "LVn/b$b$a;", "LVn/b$b$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vn.b$b  reason: collision with other inner class name */
    public static abstract class C1881b {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001d\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001e"}, d2 = {"LVn/b$b$a;", "LVn/b$b;", "", "deliveryServiceId", "LNn/G;", "pickupPoint", "deliveryId", "<init>", "(Ljava/lang/String;LNn/G;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LNn/G;", "d", "()LNn/G;", "c", "LNn/J$b;", "LNn/J$b;", "()LNn/J$b;", "selectServiceCategory", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Vn.b$b$a */
        public static final class a extends C1881b {

            /* renamed from: a  reason: collision with root package name */
            private final String f88722a;

            /* renamed from: b  reason: collision with root package name */
            private final G f88723b;

            /* renamed from: c  reason: collision with root package name */
            private final String f88724c;

            /* renamed from: d  reason: collision with root package name */
            private final J.b f88725d = J.b.COLLECT;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, G g10, String str2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "deliveryServiceId");
                C17542s.j(g10, "pickupPoint");
                C17542s.j(str2, "deliveryId");
                this.f88722a = str;
                this.f88723b = g10;
                this.f88724c = str2;
            }

            public String a() {
                return this.f88722a;
            }

            public J.b b() {
                return this.f88725d;
            }

            public final String c() {
                return this.f88724c;
            }

            public final G d() {
                return this.f88723b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f88722a, aVar.f88722a) && C17542s.e(this.f88723b, aVar.f88723b) && C17542s.e(this.f88724c, aVar.f88724c);
            }

            public int hashCode() {
                return (((this.f88722a.hashCode() * 31) + this.f88723b.hashCode()) * 31) + this.f88724c.hashCode();
            }

            public String toString() {
                String str = this.f88722a;
                G g10 = this.f88723b;
                String str2 = this.f88724c;
                return "Collect(deliveryServiceId=" + str + ", pickupPoint=" + g10 + ", deliveryId=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LVn/b$b$b;", "LVn/b$b;", "LNn/o$a;", "deliveryService", "<init>", "(LNn/o$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/o$a;", "c", "()LNn/o$a;", "b", "Ljava/lang/String;", "deliveryServiceId", "LNn/J$b;", "LNn/J$b;", "()LNn/J$b;", "selectServiceCategory", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Vn.b$b$b  reason: collision with other inner class name */
        public static final class C1882b extends C1881b {

            /* renamed from: a  reason: collision with root package name */
            private final C10812o.a f88726a;

            /* renamed from: b  reason: collision with root package name */
            private final String f88727b;

            /* renamed from: c  reason: collision with root package name */
            private final J.b f88728c = J.b.HOME;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1882b(C10812o.a aVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(aVar, "deliveryService");
                this.f88726a = aVar;
                this.f88727b = aVar.h();
            }

            public String a() {
                return this.f88727b;
            }

            public J.b b() {
                return this.f88728c;
            }

            public final C10812o.a c() {
                return this.f88726a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1882b) && C17542s.e(this.f88726a, ((C1882b) obj).f88726a);
            }

            public int hashCode() {
                return this.f88726a.hashCode();
            }

            public String toString() {
                C10812o.a aVar = this.f88726a;
                return "Home(deliveryService=" + aVar + ")";
            }
        }

        public /* synthetic */ C1881b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String a();

        public abstract J.b b();

        private C1881b() {
        }
    }

    Object a(String str, C1881b bVar, Map<String, String> map, C17164e<? super a> eVar);
}
