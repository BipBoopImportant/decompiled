package ao;

import TJ.C16532g;
import com.ingka.ikea.mcomsettings.MComConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lao/a;", "", "LTJ/g;", "Lao/a$a;", "invoke", "()LTJ/g;", "a", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ao.a  reason: case insensitive filesystem */
public interface C11072a {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lao/a$a;", "", "", "showTotalExclTaxInCartAndCheckout", "", "dateAndTimePresentationPattern", "contactUri", "pickupDisabled", "Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "surveyConfig", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZLcom/ingka/ikea/mcomsettings/MComConfig$f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/lang/String;", "d", "getPickupDisabled", "e", "Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ao.a$a  reason: collision with other inner class name */
    public static final class C1955a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f90340a;

        /* renamed from: b  reason: collision with root package name */
        private final String f90341b;

        /* renamed from: c  reason: collision with root package name */
        private final String f90342c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f90343d;

        /* renamed from: e  reason: collision with root package name */
        private final MComConfig.f f90344e;

        public C1955a(boolean z10, String str, String str2, boolean z11, MComConfig.f fVar) {
            C17542s.j(str, "dateAndTimePresentationPattern");
            this.f90340a = z10;
            this.f90341b = str;
            this.f90342c = str2;
            this.f90343d = z11;
            this.f90344e = fVar;
        }

        public final String a() {
            return this.f90342c;
        }

        public final String b() {
            return this.f90341b;
        }

        public final boolean c() {
            return this.f90340a;
        }

        public final MComConfig.f d() {
            return this.f90344e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1955a)) {
                return false;
            }
            C1955a aVar = (C1955a) obj;
            return this.f90340a == aVar.f90340a && C17542s.e(this.f90341b, aVar.f90341b) && C17542s.e(this.f90342c, aVar.f90342c) && this.f90343d == aVar.f90343d && C17542s.e(this.f90344e, aVar.f90344e);
        }

        public int hashCode() {
            int hashCode = ((Boolean.hashCode(this.f90340a) * 31) + this.f90341b.hashCode()) * 31;
            String str = this.f90342c;
            int i10 = 0;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f90343d)) * 31;
            MComConfig.f fVar = this.f90344e;
            if (fVar != null) {
                i10 = fVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            boolean z10 = this.f90340a;
            String str = this.f90341b;
            String str2 = this.f90342c;
            boolean z11 = this.f90343d;
            MComConfig.f fVar = this.f90344e;
            return "ConfirmationConfig(showTotalExclTaxInCartAndCheckout=" + z10 + ", dateAndTimePresentationPattern=" + str + ", contactUri=" + str2 + ", pickupDisabled=" + z11 + ", surveyConfig=" + fVar + ")";
        }
    }

    C16532g<C1955a> invoke();
}
