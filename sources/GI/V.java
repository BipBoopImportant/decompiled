package gi;

import KJ.C15987c;
import Op.d1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lgi/V;", "", "<init>", "()V", "a", "Lgi/V$a;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class V {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgi/V$a;", "Lgi/V;", "LKJ/c;", "LOp/d1;", "productItemUiModels", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends V {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<d1> f73345a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C15987c<d1> cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "productItemUiModels");
            this.f73345a = cVar;
        }

        public final C15987c<d1> a() {
            return this.f73345a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f73345a, ((a) obj).f73345a);
        }

        public int hashCode() {
            return this.f73345a.hashCode();
        }

        public String toString() {
            C15987c<d1> cVar = this.f73345a;
            return "VariantInformation(productItemUiModels=" + cVar + ")";
        }
    }

    public /* synthetic */ V(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private V() {
    }
}
