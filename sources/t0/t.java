package t0;

import E1.a0;
import androidx.compose.foundation.lazy.layout.c;
import c2.C5267b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v0.C6127A;
import v0.x;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u001d\u0010#\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lt0/t;", "Lv0/A;", "Lt0/s;", "Lc2/b;", "constraints", "", "isVertical", "Lt0/l;", "itemProvider", "Lv0/x;", "measureScope", "<init>", "(JZLt0/l;Lv0/x;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "index", "lane", "span", "c", "(IIIJ)Lt0/s;", "d", "(IJ)Lt0/s;", "", "key", "contentType", "", "LE1/a0;", "placeables", "b", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Lt0/s;", "a", "Lt0/l;", "Lv0/x;", "J", "f", "()J", "childConstraints", "Landroidx/compose/foundation/lazy/layout/c;", "g", "()Landroidx/compose/foundation/lazy/layout/c;", "keyIndexMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class t implements C6127A<s> {

    /* renamed from: a  reason: collision with root package name */
    private final l f29306a;

    /* renamed from: b  reason: collision with root package name */
    private final x f29307b;

    /* renamed from: c  reason: collision with root package name */
    private final long f29308c;

    public /* synthetic */ t(long j10, boolean z10, l lVar, x xVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, z10, lVar, xVar);
    }

    public static /* synthetic */ s e(t tVar, int i10, long j10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                j10 = tVar.f29308c;
            }
            return tVar.d(i10, j10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
    }

    public abstract s b(int i10, Object obj, Object obj2, List<? extends a0> list, long j10);

    /* renamed from: c */
    public s a(int i10, int i11, int i12, long j10) {
        return d(i10, j10);
    }

    public final s d(int i10, long j10) {
        return b(i10, this.f29306a.d(i10), this.f29306a.e(i10), this.f29307b.q0(i10, j10), j10);
    }

    public final long f() {
        return this.f29308c;
    }

    public final c g() {
        return this.f29306a.b();
    }

    private t(long j10, boolean z10, l lVar, x xVar) {
        this.f29306a = lVar;
        this.f29307b = xVar;
        this.f29308c = c2.c.b(0, z10 ? C5267b.l(j10) : Integer.MAX_VALUE, 0, !z10 ? C5267b.k(j10) : Integer.MAX_VALUE, 5, (Object) null);
    }
}
