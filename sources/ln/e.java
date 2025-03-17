package Ln;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11523e;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0003\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LLn/e;", "", "", "a", "()Ljava/lang/Double;", "familySavings", "d", "upsellFamilySavings", "c", "totalSavings", "LLn/e$a;", "b", "()LLn/e$a;", "currentPrice", "cart-data-layer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001d"}, d2 = {"LLn/e$a;", "", "LLn/e$b;", "totalPrice", "totalProductExclDiscount", "", "Lkp/e;", "discountSummaries", "assemblyPrice", "<init>", "(LLn/e$b;LLn/e$b;Ljava/util/List;LLn/e$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLn/e$b;", "c", "()LLn/e$b;", "b", "d", "Ljava/util/List;", "()Ljava/util/List;", "cart-data-layer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final b f83305a;

        /* renamed from: b  reason: collision with root package name */
        private final b f83306b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C11523e> f83307c;

        /* renamed from: d  reason: collision with root package name */
        private final b f83308d;

        public a(b bVar, b bVar2, List<C11523e> list, b bVar3) {
            C17542s.j(bVar, "totalPrice");
            C17542s.j(list, "discountSummaries");
            this.f83305a = bVar;
            this.f83306b = bVar2;
            this.f83307c = list;
            this.f83308d = bVar3;
        }

        public final b a() {
            return this.f83308d;
        }

        public final List<C11523e> b() {
            return this.f83307c;
        }

        public final b c() {
            return this.f83305a;
        }

        public final b d() {
            return this.f83306b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f83305a, aVar.f83305a) && C17542s.e(this.f83306b, aVar.f83306b) && C17542s.e(this.f83307c, aVar.f83307c) && C17542s.e(this.f83308d, aVar.f83308d);
        }

        public int hashCode() {
            int hashCode = this.f83305a.hashCode() * 31;
            b bVar = this.f83306b;
            int i10 = 0;
            int hashCode2 = (((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f83307c.hashCode()) * 31;
            b bVar2 = this.f83308d;
            if (bVar2 != null) {
                i10 = bVar2.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            b bVar = this.f83305a;
            b bVar2 = this.f83306b;
            List<C11523e> list = this.f83307c;
            b bVar3 = this.f83308d;
            return "CartReceiptPrice(totalPrice=" + bVar + ", totalProductExclDiscount=" + bVar2 + ", discountSummaries=" + list + ", assemblyPrice=" + bVar3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"LLn/e$b;", "", "", "inclTax", "exclTax", "tax", "<init>", "(Ljava/lang/Double;DLjava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "D", "()D", "c", "cart-data-layer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Double f83309a;

        /* renamed from: b  reason: collision with root package name */
        private final double f83310b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f83311c;

        public b(Double d10, double d11, Double d12) {
            this.f83309a = d10;
            this.f83310b = d11;
            this.f83311c = d12;
        }

        public final double a() {
            return this.f83310b;
        }

        public final Double b() {
            return this.f83309a;
        }

        public final Double c() {
            return this.f83311c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f83309a, bVar.f83309a) && Double.compare(this.f83310b, bVar.f83310b) == 0 && C17542s.e(this.f83311c, bVar.f83311c);
        }

        public int hashCode() {
            Double d10 = this.f83309a;
            int i10 = 0;
            int hashCode = (((d10 == null ? 0 : d10.hashCode()) * 31) + Double.hashCode(this.f83310b)) * 31;
            Double d11 = this.f83311c;
            if (d11 != null) {
                i10 = d11.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Double d10 = this.f83309a;
            double d11 = this.f83310b;
            Double d12 = this.f83311c;
            return "Price(inclTax=" + d10 + ", exclTax=" + d11 + ", tax=" + d12 + ")";
        }
    }

    Double a();

    a b();

    Double c();

    Double d();
}
