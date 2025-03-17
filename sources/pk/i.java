package pk;

import IC.C13023e;
import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpk/i;", "", "Lpk/i$a;", "departmentName", "LKJ/c;", "Lpk/l;", "productItems", "<init>", "(Lpk/i$a;LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpk/i$a;", "()Lpk/i$a;", "b", "LKJ/c;", "()LKJ/c;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final a f100953a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<l> f100954b;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpk/i$a;", "", "LIC/e;", "name", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final int f100955b = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f100956a;

        public a(C13023e eVar) {
            C17542s.j(eVar, "name");
            this.f100956a = eVar;
        }

        public final C13023e a() {
            return this.f100956a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f100956a, ((a) obj).f100956a);
        }

        public int hashCode() {
            return this.f100956a.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f100956a;
            return "DepartmentName(name=" + eVar + ")";
        }
    }

    public i(a aVar, C15987c<l> cVar) {
        C17542s.j(aVar, "departmentName");
        C17542s.j(cVar, "productItems");
        this.f100953a = aVar;
        this.f100954b = cVar;
    }

    public final a a() {
        return this.f100953a;
    }

    public final C15987c<l> b() {
        return this.f100954b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C17542s.e(this.f100953a, iVar.f100953a) && C17542s.e(this.f100954b, iVar.f100954b);
    }

    public int hashCode() {
        return (this.f100953a.hashCode() * 31) + this.f100954b.hashCode();
    }

    public String toString() {
        a aVar = this.f100953a;
        C15987c<l> cVar = this.f100954b;
        return "DepartmentWithProducts(departmentName=" + aVar + ", productItems=" + cVar + ")";
    }
}
