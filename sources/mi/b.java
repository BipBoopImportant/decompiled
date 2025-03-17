package mi;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lmi/b;", "", "c", "a", "b", "Lmi/b$a;", "Lmi/b$b;", "Lmi/b$c;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmi/b$a;", "Lmi/b;", "<init>", "()V", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75459a = new a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmi/b$b;", "Lmi/b;", "<init>", "()V", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mi.b$b  reason: collision with other inner class name */
    public static final class C1384b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C1384b f75460a = new C1384b();

        private C1384b() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmi/b$c;", "Lmi/b;", "LIC/e;", "priceText", "", "isLoading", "<init>", "(LIC/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "Z", "()Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: c  reason: collision with root package name */
        public static final int f75461c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f75462a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f75463b;

        public c(C13023e eVar, boolean z10) {
            C17542s.j(eVar, "priceText");
            this.f75462a = eVar;
            this.f75463b = z10;
        }

        public final C13023e a() {
            return this.f75462a;
        }

        public final boolean b() {
            return this.f75463b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f75462a, cVar.f75462a) && this.f75463b == cVar.f75463b;
        }

        public int hashCode() {
            return (this.f75462a.hashCode() * 31) + Boolean.hashCode(this.f75463b);
        }

        public String toString() {
            C13023e eVar = this.f75462a;
            boolean z10 = this.f75463b;
            return "Show(priceText=" + eVar + ", isLoading=" + z10 + ")";
        }
    }
}
