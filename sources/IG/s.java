package ig;

import TJ.C16532g;
import com.ingka.ikea.mcomsettings.MComConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lig/s;", "", "LTJ/g;", "Lig/s$a;", "invoke", "()LTJ/g;", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface s {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b \u0010#R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b\u001c\u0010%¨\u0006&"}, d2 = {"Lig/s$a;", "", "", "discountCodeEnabledConfig", "showMaterialsInCartConfig", "Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "abortCheckoutSurveyConfig", "showTotalExclTaxInCartAndCheckout", "Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "employeeDiscountConfig", "", "Lcom/ingka/ikea/mcomsettings/MComConfig$a;", "availablePaymentOptionHolders", "<init>", "(ZZLcom/ingka/ikea/mcomsettings/MComConfig$f;ZLcom/ingka/ikea/mcomsettings/MComConfig$e;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "e", "Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "d", "f", "Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "Ljava/util/List;", "()Ljava/util/List;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f74607a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f74608b;

        /* renamed from: c  reason: collision with root package name */
        private final MComConfig.f f74609c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f74610d;

        /* renamed from: e  reason: collision with root package name */
        private final MComConfig.e f74611e;

        /* renamed from: f  reason: collision with root package name */
        private final List<MComConfig.a> f74612f;

        public a(boolean z10, boolean z11, MComConfig.f fVar, boolean z12, MComConfig.e eVar, List<MComConfig.a> list) {
            this.f74607a = z10;
            this.f74608b = z11;
            this.f74609c = fVar;
            this.f74610d = z12;
            this.f74611e = eVar;
            this.f74612f = list;
        }

        public final MComConfig.f a() {
            return this.f74609c;
        }

        public final List<MComConfig.a> b() {
            return this.f74612f;
        }

        public final boolean c() {
            return this.f74607a;
        }

        public final MComConfig.e d() {
            return this.f74611e;
        }

        public final boolean e() {
            return this.f74608b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f74607a == aVar.f74607a && this.f74608b == aVar.f74608b && C17542s.e(this.f74609c, aVar.f74609c) && this.f74610d == aVar.f74610d && C17542s.e(this.f74611e, aVar.f74611e) && C17542s.e(this.f74612f, aVar.f74612f);
        }

        public final boolean f() {
            return this.f74610d;
        }

        public int hashCode() {
            int hashCode = ((Boolean.hashCode(this.f74607a) * 31) + Boolean.hashCode(this.f74608b)) * 31;
            MComConfig.f fVar = this.f74609c;
            int i10 = 0;
            int hashCode2 = (((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + Boolean.hashCode(this.f74610d)) * 31;
            MComConfig.e eVar = this.f74611e;
            int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            List<MComConfig.a> list = this.f74612f;
            if (list != null) {
                i10 = list.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            boolean z10 = this.f74607a;
            boolean z11 = this.f74608b;
            MComConfig.f fVar = this.f74609c;
            boolean z12 = this.f74610d;
            MComConfig.e eVar = this.f74611e;
            List<MComConfig.a> list = this.f74612f;
            return "CartMComConfig(discountCodeEnabledConfig=" + z10 + ", showMaterialsInCartConfig=" + z11 + ", abortCheckoutSurveyConfig=" + fVar + ", showTotalExclTaxInCartAndCheckout=" + z12 + ", employeeDiscountConfig=" + eVar + ", availablePaymentOptionHolders=" + list + ")";
        }
    }

    C16532g<a> invoke();
}
