package T0;

import c2.k;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u000e\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"LT0/c;", "", "LT0/d;", "widthSizeClass", "LT0/b;", "heightSizeClass", "<init>", "(II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "c", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f13501c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f13502a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13503b;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"LT0/c$a;", "", "<init>", "()V", "Lc2/k;", "size", "", "LT0/d;", "supportedWidthSizeClasses", "LT0/b;", "supportedHeightSizeClasses", "LT0/c;", "a", "(JLjava/util/Set;Ljava/util/Set;)LT0/c;", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c b(a aVar, long j10, Set<d> set, Set<b> set2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                set = d.f13504b.e();
            }
            if ((i10 & 4) != 0) {
                set2 = b.f13493b.e();
            }
            return aVar.a(j10, set, set2);
        }

        public final c a(long j10, Set<d> set, Set<b> set2) {
            return new c(d.f13504b.c(k.h(j10), set), b.f13493b.c(k.g(j10), set2), (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    public final int a() {
        return this.f13503b;
    }

    public final int b() {
        return this.f13502a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return d.F(this.f13502a, cVar.f13502a) && b.F(this.f13503b, cVar.f13503b);
    }

    public int hashCode() {
        return (d.G(this.f13502a) * 31) + b.G(this.f13503b);
    }

    public String toString() {
        return "WindowSizeClass(" + d.H(this.f13502a) + ", " + b.H(this.f13503b) + ')';
    }

    private c(int i10, int i11) {
        this.f13502a = i10;
        this.f13503b = i11;
    }
}
