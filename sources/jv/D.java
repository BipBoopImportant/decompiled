package Jv;

import Nv.i;
import SC.C13575d;
import T0.d;
import U0.C4889m;
import U0.C4895p;
import c2.h;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"LJv/D;", "", "<init>", "()V", "LJv/D$a;", "a", "(LU0/m;I)LJv/D$a;", "Lc2/h;", "b", "F", "d", "()F", "Spacing", "c", "Padding", "Lp1/v0;", "(LU0/m;I)J", "BackgroundColor", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public static final D f37431a = new D();

    /* renamed from: b  reason: collision with root package name */
    private static final float f37432b = h.B((float) 12);

    /* renamed from: c  reason: collision with root package name */
    private static final float f37433c = h.B((float) 16);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LJv/D$a;", "", "", "count", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "Portrait", "Landscape", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        Portrait(2),
        Landscape(3);
        
        private final int count;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(int i10) {
            this.count = i10;
        }

        public final int b() {
            return this.count;
        }
    }

    private D() {
    }

    public final a a(C4889m mVar, int i10) {
        mVar.W(-1201879744);
        if (C4895p.J()) {
            C4895p.S(-1201879744, i10, -1, "com.ingka.ikea.membership.impl.compose.member.overview.TileDefaults.calculateRowSpan (ActionTile.kt:249)");
        }
        a aVar = d.F(i.a(mVar, 0), d.f13504b.d()) ? a.Portrait : a.Landscape;
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return aVar;
    }

    public final long b(C4889m mVar, int i10) {
        mVar.W(-1569633776);
        if (C4895p.J()) {
            C4895p.S(-1569633776, i10, -1, "com.ingka.ikea.membership.impl.compose.member.overview.TileDefaults.<get-BackgroundColor> (ActionTile.kt:240)");
        }
        long l02 = C13575d.a(mVar, 0).l0();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return l02;
    }

    public final float c() {
        return f37433c;
    }

    public final float d() {
        return f37432b;
    }
}
