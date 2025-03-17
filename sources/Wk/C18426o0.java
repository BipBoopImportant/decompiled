package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LwK/o0;", "", "<init>", "()V", "b", "a", "c", "d", "LwK/o0$a;", "LwK/o0$b;", "LwK/o0$c;", "LwK/o0$d;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.o0  reason: case insensitive filesystem */
public abstract class C18426o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f151328a = 0;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LwK/o0$a;", "LwK/o0;", "LwK/M;", "variant", "LwK/G;", "color", "<init>", "(LwK/M;LwK/G;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LwK/M;", "()LwK/M;", "c", "LwK/G;", "a", "()LwK/G;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.o0$a */
    public static final class a extends C18426o0 {

        /* renamed from: b  reason: collision with root package name */
        private final C18244M f151329b;

        /* renamed from: c  reason: collision with root package name */
        private final C18238G f151330c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C18244M m10, C18238G g10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(m10, "variant");
            C17542s.j(g10, "color");
            this.f151329b = m10;
            this.f151330c = g10;
        }

        public final C18238G a() {
            return this.f151330c;
        }

        public final C18244M b() {
            return this.f151329b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f151329b, aVar.f151329b) && this.f151330c == aVar.f151330c;
        }

        public int hashCode() {
            return (this.f151329b.hashCode() * 31) + this.f151330c.hashCode();
        }

        public String toString() {
            C18244M m10 = this.f151329b;
            C18238G g10 = this.f151330c;
            return "Badge(variant=" + m10 + ", color=" + g10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LwK/o0$b;", "LwK/o0;", "", "message", "LwK/N1;", "type", "<init>", "(Ljava/lang/String;LwK/N1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "c", "LwK/N1;", "()LwK/N1;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.o0$b */
    public static final class b extends C18426o0 {

        /* renamed from: b  reason: collision with root package name */
        private final String f151331b;

        /* renamed from: c  reason: collision with root package name */
        private final N1 f151332c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, N1 n12) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "message");
            C17542s.j(n12, "type");
            this.f151331b = str;
            this.f151332c = n12;
        }

        public final String a() {
            return this.f151331b;
        }

        public final N1 b() {
            return this.f151332c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f151331b, bVar.f151331b) && this.f151332c == bVar.f151332c;
        }

        public int hashCode() {
            return (this.f151331b.hashCode() * 31) + this.f151332c.hashCode();
        }

        public String toString() {
            String str = this.f151331b;
            N1 n12 = this.f151332c;
            return "CommercialMessage(message=" + str + ", type=" + n12 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LwK/o0$c;", "LwK/o0;", "", "icon", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.o0$c */
    public static final class c extends C18426o0 {

        /* renamed from: b  reason: collision with root package name */
        private final int f151333b;

        public c(int i10) {
            super((DefaultConstructorMarker) null);
            this.f151333b = i10;
        }

        public final int a() {
            return this.f151333b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f151333b == ((c) obj).f151333b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f151333b);
        }

        public String toString() {
            int i10 = this.f151333b;
            return "Icon(icon=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LwK/o0$d;", "LwK/o0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.o0$d */
    public static final class d extends C18426o0 {

        /* renamed from: b  reason: collision with root package name */
        public static final d f151334b = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1385360551;
        }

        public String toString() {
            return "None";
        }
    }

    public /* synthetic */ C18426o0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C18426o0() {
    }
}
