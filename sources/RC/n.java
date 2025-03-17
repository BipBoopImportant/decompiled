package RC;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import qx.c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LRC/n;", "", "<init>", "()V", "a", "b", "LRC/n$a;", "LRC/n$b;", "price-summary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final int f115373a = 0;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LRC/n$a;", "LRC/n;", "Lqx/c;", "value", "Lkp/d;", "currencyConfig", "<init>", "(Lqx/c;Lkp/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lqx/c;", "()Lqx/c;", "c", "Lkp/d;", "a", "()Lkp/d;", "price-summary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends n {

        /* renamed from: d  reason: collision with root package name */
        public static final int f115374d = 8;

        /* renamed from: b  reason: collision with root package name */
        private final c f115375b;

        /* renamed from: c  reason: collision with root package name */
        private final C11522d f115376c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, C11522d dVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "value");
            C17542s.j(dVar, "currencyConfig");
            this.f115375b = cVar;
            this.f115376c = dVar;
        }

        public final C11522d a() {
            return this.f115376c;
        }

        public final c b() {
            return this.f115375b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f115375b, aVar.f115375b) && C17542s.e(this.f115376c, aVar.f115376c);
        }

        public int hashCode() {
            return (this.f115375b.hashCode() * 31) + this.f115376c.hashCode();
        }

        public String toString() {
            c cVar = this.f115375b;
            C11522d dVar = this.f115376c;
            return "Price(value=" + cVar + ", currencyConfig=" + dVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LRC/n$b;", "LRC/n;", "LIC/e;", "price", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIC/e;", "a", "()LIC/e;", "price-summary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends n {

        /* renamed from: c  reason: collision with root package name */
        public static final int f115377c = C13023e.f110931a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f115378b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C13023e eVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(eVar, "price");
            this.f115378b = eVar;
        }

        public final C13023e a() {
            return this.f115378b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f115378b, ((b) obj).f115378b);
        }

        public int hashCode() {
            return this.f115378b.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f115378b;
            return "Text(price=" + eVar + ")";
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private n() {
    }
}
