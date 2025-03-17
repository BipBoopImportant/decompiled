package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.C5942c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\t\n\u000bB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LwK/C1;", "", "LwK/s1;", "alignment", "<init>", "(LwK/s1;)V", "a", "LwK/s1;", "()LwK/s1;", "d", "b", "c", "LwK/C1$a;", "LwK/C1$b;", "LwK/C1$c;", "LwK/C1$d;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class C1 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f149292b = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C18475s1 f149293a;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0007R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LwK/C1$a;", "LwK/C1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "I", "resource", "d", "Ljava/lang/String;", "b", "contentDescription", "LwK/s1;", "e", "LwK/s1;", "a", "()LwK/s1;", "alignment", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C1 {

        /* renamed from: c  reason: collision with root package name */
        private final int f149294c;

        /* renamed from: d  reason: collision with root package name */
        private final String f149295d;

        /* renamed from: e  reason: collision with root package name */
        private final C18475s1 f149296e;

        public C18475s1 a() {
            return this.f149296e;
        }

        public final String b() {
            return this.f149295d;
        }

        public final int c() {
            return this.f149294c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f149294c == aVar.f149294c && C17542s.e(this.f149295d, aVar.f149295d) && this.f149296e == aVar.f149296e;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f149294c) * 31;
            String str = this.f149295d;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f149296e.hashCode();
        }

        public String toString() {
            int i10 = this.f149294c;
            String str = this.f149295d;
            C18475s1 s1Var = this.f149296e;
            return "Icon(resource=" + i10 + ", contentDescription=" + str + ", alignment=" + s1Var + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LwK/C1$b;", "LwK/C1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lt1/c;", "c", "Lt1/c;", "()Lt1/c;", "painter", "d", "Ljava/lang/String;", "b", "contentDescription", "LwK/s1;", "e", "LwK/s1;", "a", "()LwK/s1;", "alignment", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C1 {

        /* renamed from: c  reason: collision with root package name */
        private final C5942c f149297c;

        /* renamed from: d  reason: collision with root package name */
        private final String f149298d;

        /* renamed from: e  reason: collision with root package name */
        private final C18475s1 f149299e;

        public C18475s1 a() {
            return this.f149299e;
        }

        public final String b() {
            return this.f149298d;
        }

        public final C5942c c() {
            return this.f149297c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f149297c, bVar.f149297c) && C17542s.e(this.f149298d, bVar.f149298d) && this.f149299e == bVar.f149299e;
        }

        public int hashCode() {
            int hashCode = this.f149297c.hashCode() * 31;
            String str = this.f149298d;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f149299e.hashCode();
        }

        public String toString() {
            C5942c cVar = this.f149297c;
            String str = this.f149298d;
            C18475s1 s1Var = this.f149299e;
            return "Image(painter=" + cVar + ", contentDescription=" + str + ", alignment=" + s1Var + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LwK/C1$c;", "LwK/C1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C1 {

        /* renamed from: c  reason: collision with root package name */
        public static final c f149300c = new c();

        private c() {
            super((C18475s1) null, 1, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1975939423;
        }

        public String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LwK/C1$d;", "LwK/C1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lt1/c;", "c", "Lt1/c;", "()Lt1/c;", "painter", "d", "Ljava/lang/String;", "b", "contentDescription", "LwK/s1;", "e", "LwK/s1;", "a", "()LwK/s1;", "alignment", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C1 {

        /* renamed from: c  reason: collision with root package name */
        private final C5942c f149301c;

        /* renamed from: d  reason: collision with root package name */
        private final String f149302d;

        /* renamed from: e  reason: collision with root package name */
        private final C18475s1 f149303e;

        public C18475s1 a() {
            return this.f149303e;
        }

        public final String b() {
            return this.f149302d;
        }

        public final C5942c c() {
            return this.f149301c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f149301c, dVar.f149301c) && C17542s.e(this.f149302d, dVar.f149302d) && this.f149303e == dVar.f149303e;
        }

        public int hashCode() {
            int hashCode = this.f149301c.hashCode() * 31;
            String str = this.f149302d;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f149303e.hashCode();
        }

        public String toString() {
            C5942c cVar = this.f149301c;
            String str = this.f149302d;
            C18475s1 s1Var = this.f149303e;
            return "PaymentLogo(painter=" + cVar + ", contentDescription=" + str + ", alignment=" + s1Var + ")";
        }
    }

    public /* synthetic */ C1(C18475s1 s1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(s1Var);
    }

    public C18475s1 a() {
        return this.f149293a;
    }

    private C1(C18475s1 s1Var) {
        this.f149293a = s1Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1(C18475s1 s1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C18475s1.Center : s1Var, (DefaultConstructorMarker) null);
    }
}
