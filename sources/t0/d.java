package T0;

import YH.C16877v;
import YH.g0;
import c2.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@C17604b
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b@\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0001\u0003\u0001\u00020\u0002\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"LT0/d;", "", "", "value", "D", "(I)I", "other", "C", "(II)I", "", "H", "(I)Ljava/lang/String;", "G", "", "", "E", "(ILjava/lang/Object;)Z", "a", "I", "b", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements Comparable<d> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13504b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f13505c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f13506d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f13507e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Set<d> f13508f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final List<d> f13509g;

    /* renamed from: h  reason: collision with root package name */
    private static final Set<d> f13510h;

    /* renamed from: a  reason: collision with root package name */
    private final int f13511a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"LT0/d$a;", "", "<init>", "()V", "LT0/d;", "Lc2/h;", "b", "(I)F", "width", "", "supportedSizeClasses", "c", "(FLjava/util/Set;)I", "Compact", "I", "d", "()I", "Medium", "g", "Expanded", "f", "DefaultSizeClasses", "Ljava/util/Set;", "e", "()Ljava/util/Set;", "getDefaultSizeClasses$annotations", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final float b(int i10) {
            return d.F(i10, f()) ? h.B((float) 840) : d.F(i10, g()) ? h.B((float) 600) : h.B((float) 0);
        }

        public final int c(float f10, Set<d> set) {
            if (h.v(f10, h.B((float) 0)) < 0) {
                throw new IllegalArgumentException("Width must not be negative");
            } else if (!set.isEmpty()) {
                int d10 = d();
                List a10 = d.f13509g;
                int size = a10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int I10 = ((d) a10.get(i10)).I();
                    if (set.contains(d.v(I10))) {
                        if (h.v(f10, d.f13504b.b(I10)) >= 0) {
                            return I10;
                        }
                        d10 = I10;
                    }
                }
                return d10;
            } else {
                throw new IllegalArgumentException("Must support at least one size class");
            }
        }

        public final int d() {
            return d.f13505c;
        }

        public final Set<d> e() {
            return d.f13508f;
        }

        public final int f() {
            return d.f13507e;
        }

        public final int g() {
            return d.f13506d;
        }

        private a() {
        }
    }

    static {
        int D10 = D(0);
        f13505c = D10;
        int D11 = D(1);
        f13506d = D11;
        int D12 = D(2);
        f13507e = D12;
        f13508f = g0.h(v(D10), v(D11), v(D12));
        List<d> q10 = C16877v.q(v(D12), v(D11), v(D10));
        f13509g = q10;
        f13510h = C16877v.y1(q10);
    }

    private /* synthetic */ d(int i10) {
        this.f13511a = i10;
    }

    public static int C(int i10, int i11) {
        a aVar = f13504b;
        return h.v(aVar.b(i10), aVar.b(i11));
    }

    private static int D(int i10) {
        return i10;
    }

    public static boolean E(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).I();
    }

    public static final boolean F(int i10, int i11) {
        return i10 == i11;
    }

    public static int G(int i10) {
        return Integer.hashCode(i10);
    }

    public static String H(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WindowWidthSizeClass.");
        sb2.append(F(i10, f13505c) ? "Compact" : F(i10, f13506d) ? "Medium" : F(i10, f13507e) ? "Expanded" : "");
        return sb2.toString();
    }

    public static final /* synthetic */ d v(int i10) {
        return new d(i10);
    }

    public int B(int i10) {
        return C(this.f13511a, i10);
    }

    public final /* synthetic */ int I() {
        return this.f13511a;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return B(((d) obj).I());
    }

    public boolean equals(Object obj) {
        return E(this.f13511a, obj);
    }

    public int hashCode() {
        return G(this.f13511a);
    }

    public String toString() {
        return H(this.f13511a);
    }
}
