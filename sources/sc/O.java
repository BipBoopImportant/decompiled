package SC;

import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wK.C18238G;
import wK.C18244M;
import wK.C18426o0;
import wK.N1;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\u0005\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LSC/O;", "", "<init>", "()V", "LwK/o0;", "a", "()LwK/o0;", "b", "c", "d", "LSC/O$a;", "LSC/O$b;", "LSC/O$c;", "LSC/O$d;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class O {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"LSC/O$a;", "LSC/O;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LwK/M;", "a", "LwK/M;", "c", "()LwK/M;", "variant", "LwK/G;", "b", "LwK/G;", "()LwK/G;", "color", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends O {

        /* renamed from: c  reason: collision with root package name */
        public static final int f115863c = C18244M.f149800b;

        /* renamed from: a  reason: collision with root package name */
        private final C18244M f115864a;

        /* renamed from: b  reason: collision with root package name */
        private final C18238G f115865b;

        public final C18238G b() {
            return this.f115865b;
        }

        public final C18244M c() {
            return this.f115864a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f115864a, aVar.f115864a) && this.f115865b == aVar.f115865b;
        }

        public int hashCode() {
            return (this.f115864a.hashCode() * 31) + this.f115865b.hashCode();
        }

        public String toString() {
            C18244M m10 = this.f115864a;
            C18238G g10 = this.f115865b;
            return "Badge(variant=" + m10 + ", color=" + g10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LSC/O$b;", "LSC/O;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "message", "LwK/N1;", "LwK/N1;", "c", "()LwK/N1;", "type", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends O {

        /* renamed from: a  reason: collision with root package name */
        private final String f115866a;

        /* renamed from: b  reason: collision with root package name */
        private final N1 f115867b;

        public final String b() {
            return this.f115866a;
        }

        public final N1 c() {
            return this.f115867b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f115866a, bVar.f115866a) && this.f115867b == bVar.f115867b;
        }

        public int hashCode() {
            return (this.f115866a.hashCode() * 31) + this.f115867b.hashCode();
        }

        public String toString() {
            String str = this.f115866a;
            N1 n12 = this.f115867b;
            return "CommercialMessage(message=" + str + ", type=" + n12 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"LSC/O$c;", "LSC/O;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "icon", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends O {

        /* renamed from: a  reason: collision with root package name */
        private final int f115868a;

        public final int b() {
            return this.f115868a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f115868a == ((c) obj).f115868a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f115868a);
        }

        public String toString() {
            int i10 = this.f115868a;
            return "Icon(icon=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSC/O$d;", "LSC/O;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends O {

        /* renamed from: a  reason: collision with root package name */
        public static final d f115869a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final int f115870b = 0;

        private d() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -176982481;
        }

        public String toString() {
            return "None";
        }
    }

    public /* synthetic */ O(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final C18426o0 a() {
        if (this instanceof a) {
            a aVar = (a) this;
            return new C18426o0.a(aVar.c(), aVar.b());
        } else if (this instanceof b) {
            b bVar = (b) this;
            return new C18426o0.b(bVar.b(), bVar.c());
        } else if (this instanceof c) {
            return new C18426o0.c(((c) this).b());
        } else {
            if (C17542s.e(this, d.f115869a)) {
                return C18426o0.d.f151334b;
            }
            throw new t();
        }
    }

    private O() {
    }
}
