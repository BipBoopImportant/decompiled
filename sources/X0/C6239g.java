package x0;

import c2.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0002\u0006\bJ#\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lx0/g;", "", "Lc2/d;", "", "availableSpace", "pageSpacing", "a", "(Lc2/d;II)I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x0.g  reason: case insensitive filesystem */
public interface C6239g {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx0/g$a;", "Lx0/g;", "<init>", "()V", "Lc2/d;", "", "availableSpace", "pageSpacing", "a", "(Lc2/d;II)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x0.g$a */
    public static final class a implements C6239g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31702a = new a();

        private a() {
        }

        public int a(d dVar, int i10, int i11) {
            return i10;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lx0/g$b;", "Lx0/g;", "Lc2/h;", "pageSize", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lc2/d;", "", "availableSpace", "pageSpacing", "a", "(Lc2/d;II)I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "getPageSize-D9Ej5fM", "()F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x0.g$b */
    public static final class b implements C6239g {

        /* renamed from: a  reason: collision with root package name */
        private final float f31703a;

        public /* synthetic */ b(float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10);
        }

        public int a(d dVar, int i10, int i11) {
            return dVar.K0(this.f31703a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return h.D(this.f31703a, ((b) obj).f31703a);
        }

        public int hashCode() {
            return h.E(this.f31703a);
        }

        private b(float f10) {
            this.f31703a = f10;
        }
    }

    int a(d dVar, int i10, int i11);
}
