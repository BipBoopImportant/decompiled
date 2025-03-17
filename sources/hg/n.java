package hg;

import Of.C9224x;
import Op.a1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lhg/n;", "", "<init>", "()V", "a", "b", "c", "Lhg/n$a;", "Lhg/n$b;", "Lhg/n$c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhg/n$a;", "Lhg/n;", "LOf/x;", "uiModel", "<init>", "(LOf/x;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOf/x;", "()LOf/x;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends n {

        /* renamed from: a  reason: collision with root package name */
        private final C9224x f73706a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C9224x xVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(xVar, "uiModel");
            this.f73706a = xVar;
        }

        public final C9224x a() {
            return this.f73706a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f73706a, ((a) obj).f73706a);
        }

        public int hashCode() {
            return this.f73706a.hashCode();
        }

        public String toString() {
            C9224x xVar = this.f73706a;
            return "AvailabilityHeader(uiModel=" + xVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhg/n$b;", "Lhg/n;", "LOp/a1;", "item", "<init>", "(LOp/a1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOp/a1;", "()LOp/a1;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends n {

        /* renamed from: a  reason: collision with root package name */
        private final a1 f73707a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a1 a1Var) {
            super((DefaultConstructorMarker) null);
            C17542s.j(a1Var, "item");
            this.f73707a = a1Var;
        }

        public final a1 a() {
            return this.f73707a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f73707a, ((b) obj).f73707a);
        }

        public int hashCode() {
            return this.f73707a.hashCode();
        }

        public String toString() {
            a1 a1Var = this.f73707a;
            return "ProductV2(item=" + a1Var + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhg/n$c;", "Lhg/n;", "", "Lhg/n$c$a;", "items", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends n {

        /* renamed from: a  reason: collision with root package name */
        private final List<a> f73708a;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lhg/n$c$a;", "", "", "productNumber", "name", "imageUrl", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Ljava/lang/Integer;", "getQuantity", "()Ljava/lang/Integer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final String f73709a;

            /* renamed from: b  reason: collision with root package name */
            private final String f73710b;

            /* renamed from: c  reason: collision with root package name */
            private final String f73711c;

            /* renamed from: d  reason: collision with root package name */
            private final Integer f73712d;

            public a(String str, String str2, String str3, Integer num) {
                C17542s.j(str, "productNumber");
                C17542s.j(str2, "name");
                this.f73709a = str;
                this.f73710b = str2;
                this.f73711c = str3;
                this.f73712d = num;
            }

            public final String a() {
                return this.f73711c;
            }

            public final String b() {
                return this.f73710b;
            }

            public final String c() {
                return this.f73709a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f73709a, aVar.f73709a) && C17542s.e(this.f73710b, aVar.f73710b) && C17542s.e(this.f73711c, aVar.f73711c) && C17542s.e(this.f73712d, aVar.f73712d);
            }

            public int hashCode() {
                int hashCode = ((this.f73709a.hashCode() * 31) + this.f73710b.hashCode()) * 31;
                String str = this.f73711c;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.f73712d;
                if (num != null) {
                    i10 = num.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                String str = this.f73709a;
                String str2 = this.f73710b;
                String str3 = this.f73711c;
                Integer num = this.f73712d;
                return "UnavailableItemData(productNumber=" + str + ", name=" + str2 + ", imageUrl=" + str3 + ", quantity=" + num + ")";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List<a> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "items");
            this.f73708a = list;
        }

        public final List<a> a() {
            return this.f73708a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f73708a, ((c) obj).f73708a);
        }

        public int hashCode() {
            return this.f73708a.hashCode();
        }

        public String toString() {
            List<a> list = this.f73708a;
            return "UnavailableItemsUiState(items=" + list + ")";
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private n() {
    }
}
