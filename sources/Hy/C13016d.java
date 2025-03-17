package Hy;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LHy/d;", "", "<init>", "()V", "a", "b", "LHy/d$a;", "LHy/d$b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hy.d  reason: case insensitive filesystem */
public abstract class C13016d {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LHy/d$a;", "LHy/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hy.d$a */
    public static final class a extends C13016d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f110852a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -2067602684;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LHy/d$b;", "LHy/d;", "LHy/c;", "uiData", "<init>", "(LHy/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHy/c;", "()LHy/c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hy.d$b */
    public static final class b extends C13016d {

        /* renamed from: a  reason: collision with root package name */
        private final C13015c f110853a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C13015c cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "uiData");
            this.f110853a = cVar;
        }

        public final C13015c a() {
            return this.f110853a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f110853a, ((b) obj).f110853a);
        }

        public int hashCode() {
            return this.f110853a.hashCode();
        }

        public String toString() {
            C13015c cVar = this.f110853a;
            return "ShowInfo(uiData=" + cVar + ")";
        }
    }

    public /* synthetic */ C13016d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C13016d() {
    }
}
