package Lf;

import com.ingka.ikea.analytics.Interaction$Component;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0001\rJ/\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LLf/d;", "", "", "LLf/d$a;", "items", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "", "componentValue", "LXH/N;", "b", "(Ljava/util/List;Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;)V", "reasonCode", "a", "(Ljava/lang/String;)V", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0014"}, d2 = {"LLf/d$a;", "", "", "itemNo", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f61658a;

        /* renamed from: b  reason: collision with root package name */
        private final int f61659b;

        public a(String str, int i10) {
            C17542s.j(str, "itemNo");
            this.f61658a = str;
            this.f61659b = i10;
        }

        public final String a() {
            return this.f61658a;
        }

        public final int b() {
            return this.f61659b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f61658a, aVar.f61658a) && this.f61659b == aVar.f61659b;
        }

        public int hashCode() {
            return (this.f61658a.hashCode() * 31) + Integer.hashCode(this.f61659b);
        }

        public String toString() {
            String str = this.f61658a;
            int i10 = this.f61659b;
            return "AddToCartAnalytics(itemNo=" + str + ", quantity=" + i10 + ")";
        }
    }

    void a(String str);

    void b(List<a> list, Interaction$Component interaction$Component, String str);
}
