package Vi;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uK.C18146a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"LVi/m0;", "", "", "showHint", "", "count", "LVi/m0$a;", "icon", "<init>", "(ZILVi/m0$a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "I", "LVi/m0$a;", "()LVi/m0$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f88604a;

    /* renamed from: b  reason: collision with root package name */
    private final int f88605b;

    /* renamed from: c  reason: collision with root package name */
    private final a f88606c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LVi/m0$a;", "", "", "resource", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "Check", "Info", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        Check(C18146a.f148631s1),
        Info(C18146a.f148220R5);
        
        private final int resource;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(int i10) {
            this.resource = i10;
        }

        public final int b() {
            return this.resource;
        }
    }

    public m0(boolean z10, int i10, a aVar) {
        C17542s.j(aVar, "icon");
        this.f88604a = z10;
        this.f88605b = i10;
        this.f88606c = aVar;
    }

    public final int a() {
        return this.f88605b;
    }

    public final a b() {
        return this.f88606c;
    }

    public final boolean c() {
        return this.f88604a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f88604a == m0Var.f88604a && this.f88605b == m0Var.f88605b && this.f88606c == m0Var.f88606c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f88604a) * 31) + Integer.hashCode(this.f88605b)) * 31) + this.f88606c.hashCode();
    }

    public String toString() {
        boolean z10 = this.f88604a;
        int i10 = this.f88605b;
        a aVar = this.f88606c;
        return "QuantityToCollectModel(showHint=" + z10 + ", count=" + i10 + ", icon=" + aVar + ")";
    }
}
