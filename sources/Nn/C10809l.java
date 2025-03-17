package Nn;

import com.oppwa.mobile.connect.checkout.dialog.fragment.copyandpay.CopyAndPayFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LNn/l;", "", "<init>", "()V", "b", "a", "LNn/l$a;", "LNn/l$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.l  reason: case insensitive filesystem */
public abstract class C10809l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNn/l$a;", "LNn/l;", "<init>", "()V", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.l$a */
    public static final class a extends C10809l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f84097a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LNn/l$b;", "LNn/l;", "", "brand", "label", "", "leftToPay", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "D", "()D", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.l$b */
    public static final class b extends C10809l {

        /* renamed from: a  reason: collision with root package name */
        private final String f84098a;

        /* renamed from: b  reason: collision with root package name */
        private final String f84099b;

        /* renamed from: c  reason: collision with root package name */
        private final double f84100c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, double d10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, CopyAndPayFragment.BRAND_KEY);
            C17542s.j(str2, "label");
            this.f84098a = str;
            this.f84099b = str2;
            this.f84100c = d10;
        }

        public final String a() {
            return this.f84098a;
        }

        public final String b() {
            return this.f84099b;
        }

        public final double c() {
            return this.f84100c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f84098a, bVar.f84098a) && C17542s.e(this.f84099b, bVar.f84099b) && Double.compare(this.f84100c, bVar.f84100c) == 0;
        }

        public int hashCode() {
            return (((this.f84098a.hashCode() * 31) + this.f84099b.hashCode()) * 31) + Double.hashCode(this.f84100c);
        }

        public String toString() {
            String str = this.f84098a;
            String str2 = this.f84099b;
            double d10 = this.f84100c;
            return "PayOnDelivery(brand=" + str + ", label=" + str2 + ", leftToPay=" + d10 + ")";
        }
    }

    public /* synthetic */ C10809l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C10809l() {
    }
}
