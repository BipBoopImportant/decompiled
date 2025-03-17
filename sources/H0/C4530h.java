package H0;

import androidx.compose.ui.window.p;
import c2.n;
import c2.o;
import c2.r;
import c2.t;
import i1.C5437c;
import kotlin.Metadata;
import o1.C5667g;
import o1.C5668h;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"LH0/h;", "Landroidx/compose/ui/window/p;", "Li1/c;", "handleReferencePoint", "LH0/m;", "positionProvider", "<init>", "(Li1/c;LH0/m;)V", "Lc2/p;", "anchorBounds", "Lc2/r;", "windowSize", "Lc2/t;", "layoutDirection", "popupContentSize", "Lc2/n;", "a", "(Lc2/p;JLc2/t;J)J", "Li1/c;", "b", "LH0/m;", "Lo1/g;", "c", "J", "prevPosition", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.h  reason: case insensitive filesystem */
public final class C4530h implements p {

    /* renamed from: a  reason: collision with root package name */
    private final C5437c f6941a;

    /* renamed from: b  reason: collision with root package name */
    private final C4535m f6942b;

    /* renamed from: c  reason: collision with root package name */
    private long f6943c = C5667g.f26701b.c();

    public C4530h(C5437c cVar, C4535m mVar) {
        this.f6941a = cVar;
        this.f6942b = mVar;
    }

    public long a(c2.p pVar, long j10, t tVar, long j11) {
        long a10 = this.f6942b.a();
        if (!C5668h.c(a10)) {
            a10 = this.f6943c;
        }
        this.f6943c = a10;
        return n.l(n.l(pVar.n(), o.d(a10)), this.f6941a.a(j11, r.f23053b.a(), tVar));
    }
}
