package wK;

import U0.C4889m;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import t1.C5942c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0006\t\n\u000b\fB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LwK/G1;", "", "LwK/s1;", "alignment", "<init>", "(LwK/s1;)V", "a", "LwK/s1;", "()LwK/s1;", "b", "e", "d", "c", "LwK/G1$a;", "LwK/G1$b;", "LwK/G1$c;", "LwK/G1$d;", "LwK/G1$e;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class G1 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f149506b = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C18475s1 f149507a;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0007R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LwK/G1$a;", "LwK/G1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "I", "resource", "d", "Ljava/lang/String;", "b", "contentDescription", "LwK/s1;", "e", "LwK/s1;", "a", "()LwK/s1;", "alignment", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends G1 {

        /* renamed from: c  reason: collision with root package name */
        private final int f149508c;

        /* renamed from: d  reason: collision with root package name */
        private final String f149509d;

        /* renamed from: e  reason: collision with root package name */
        private final C18475s1 f149510e;

        public C18475s1 a() {
            return this.f149510e;
        }

        public final String b() {
            return this.f149509d;
        }

        public final int c() {
            return this.f149508c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f149508c == aVar.f149508c && C17542s.e(this.f149509d, aVar.f149509d) && this.f149510e == aVar.f149510e;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f149508c) * 31;
            String str = this.f149509d;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f149510e.hashCode();
        }

        public String toString() {
            int i10 = this.f149508c;
            String str = this.f149509d;
            C18475s1 s1Var = this.f149510e;
            return "Icon(resource=" + i10 + ", contentDescription=" + str + ", alignment=" + s1Var + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LwK/G1$b;", "LwK/G1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lt1/c;", "c", "Lt1/c;", "()Lt1/c;", "painter", "d", "Ljava/lang/String;", "b", "contentDescription", "LwK/s1;", "e", "LwK/s1;", "a", "()LwK/s1;", "alignment", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends G1 {

        /* renamed from: c  reason: collision with root package name */
        private final C5942c f149511c;

        /* renamed from: d  reason: collision with root package name */
        private final String f149512d;

        /* renamed from: e  reason: collision with root package name */
        private final C18475s1 f149513e;

        public C18475s1 a() {
            return this.f149513e;
        }

        public final String b() {
            return this.f149512d;
        }

        public final C5942c c() {
            return this.f149511c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f149511c, bVar.f149511c) && C17542s.e(this.f149512d, bVar.f149512d) && this.f149513e == bVar.f149513e;
        }

        public int hashCode() {
            int hashCode = this.f149511c.hashCode() * 31;
            String str = this.f149512d;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f149513e.hashCode();
        }

        public String toString() {
            C5942c cVar = this.f149511c;
            String str = this.f149512d;
            C18475s1 s1Var = this.f149513e;
            return "Image(painter=" + cVar + ", contentDescription=" + str + ", alignment=" + s1Var + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LwK/G1$c;", "LwK/G1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends G1 {

        /* renamed from: c  reason: collision with root package name */
        public static final c f149514c = new c();

        private c() {
            super((C18475s1) null, 1, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1675670235;
        }

        public String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LwK/G1$d;", "LwK/G1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function0;", "LXH/N;", "c", "LnI/p;", "b", "()LnI/p;", "price", "LwK/s1;", "d", "LwK/s1;", "a", "()LwK/s1;", "alignment", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends G1 {

        /* renamed from: c  reason: collision with root package name */
        private final p<C4889m, Integer, C16807N> f149515c;

        /* renamed from: d  reason: collision with root package name */
        private final C18475s1 f149516d;

        public C18475s1 a() {
            return this.f149516d;
        }

        public final p<C4889m, Integer, C16807N> b() {
            return this.f149515c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f149515c, dVar.f149515c) && this.f149516d == dVar.f149516d;
        }

        public int hashCode() {
            return (this.f149515c.hashCode() * 31) + this.f149516d.hashCode();
        }

        public String toString() {
            p<C4889m, Integer, C16807N> pVar = this.f149515c;
            C18475s1 s1Var = this.f149516d;
            return "Price(price=" + pVar + ", alignment=" + s1Var + ")";
        }
    }

    public /* synthetic */ G1(C18475s1 s1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(s1Var);
    }

    public C18475s1 a() {
        return this.f149507a;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LwK/G1$e;", "LwK/G1;", "", "value", "LwK/s1;", "alignment", "<init>", "(Ljava/lang/String;LwK/s1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "d", "LwK/s1;", "a", "()LwK/s1;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends G1 {

        /* renamed from: c  reason: collision with root package name */
        private final String f149517c;

        /* renamed from: d  reason: collision with root package name */
        private final C18475s1 f149518d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(String str, C18475s1 s1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? C18475s1.Center : s1Var);
        }

        public C18475s1 a() {
            return this.f149518d;
        }

        public final String b() {
            return this.f149517c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f149517c, eVar.f149517c) && this.f149518d == eVar.f149518d;
        }

        public int hashCode() {
            return (this.f149517c.hashCode() * 31) + this.f149518d.hashCode();
        }

        public String toString() {
            String str = this.f149517c;
            C18475s1 s1Var = this.f149518d;
            return "Text(value=" + str + ", alignment=" + s1Var + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, C18475s1 s1Var) {
            super(s1Var, (DefaultConstructorMarker) null);
            C17542s.j(str, "value");
            C17542s.j(s1Var, "alignment");
            this.f149517c = str;
            this.f149518d = s1Var;
        }
    }

    private G1(C18475s1 s1Var) {
        this.f149507a = s1Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G1(C18475s1 s1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C18475s1.Center : s1Var, (DefaultConstructorMarker) null);
    }
}
