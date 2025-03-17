package Rw;

import com.ingka.ikea.mcomsettings.MComConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001e"}, d2 = {"LRw/k;", "", "", "showPriceViewInPaymentExpanded", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "cardHolderInAci", "", "Lcom/ingka/ikea/mcomsettings/MComConfig$g;", "paymentTermsAndConditionHolders", "<init>", "(ZLcom/ingka/ikea/mcomsettings/MComConfig$b;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "Ljava/util/List;", "()Ljava/util/List;", "d", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f115628d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f115629e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f115630a;

    /* renamed from: b  reason: collision with root package name */
    private final MComConfig.b f115631b;

    /* renamed from: c  reason: collision with root package name */
    private final List<MComConfig.g> f115632c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LRw/k$a;", "", "<init>", "()V", "LRw/k;", "a", "()LRw/k;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return new k(false, (MComConfig.b) null, (List<MComConfig.g>) null);
        }

        private a() {
        }
    }

    public k(boolean z10, MComConfig.b bVar, List<MComConfig.g> list) {
        this.f115630a = z10;
        this.f115631b = bVar;
        this.f115632c = list;
    }

    public final MComConfig.b a() {
        return this.f115631b;
    }

    public final List<MComConfig.g> b() {
        return this.f115632c;
    }

    public final boolean c() {
        return this.f115630a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f115630a == kVar.f115630a && C17542s.e(this.f115631b, kVar.f115631b) && C17542s.e(this.f115632c, kVar.f115632c);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f115630a) * 31;
        MComConfig.b bVar = this.f115631b;
        int i10 = 0;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List<MComConfig.g> list = this.f115632c;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        boolean z10 = this.f115630a;
        MComConfig.b bVar = this.f115631b;
        List<MComConfig.g> list = this.f115632c;
        return "PaymentOptionsConfig(showPriceViewInPaymentExpanded=" + z10 + ", cardHolderInAci=" + bVar + ", paymentTermsAndConditionHolders=" + list + ")";
    }
}
