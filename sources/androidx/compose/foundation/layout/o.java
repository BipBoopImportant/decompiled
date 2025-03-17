package androidx.compose.foundation.layout;

import E1.H;
import E1.a0;
import androidx.compose.foundation.layout.q;
import c2.C5267b;
import j0.C5456l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0016 B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010\"\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/o;", "", "", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/r;", "overflow", "Ls0/D;", "constraints", "maxLines", "mainAxisSpacing", "crossAxisSpacing", "<init>", "(ILandroidx/compose/foundation/layout/r;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/layout/o$b;", "wrapInfo", "", "hasNext", "lastContentLineIndex", "totalCrossAxisSize", "leftOverMainAxis", "nextIndexInLine", "Landroidx/compose/foundation/layout/o$a;", "a", "(Landroidx/compose/foundation/layout/o$b;ZIIII)Landroidx/compose/foundation/layout/o$a;", "nextItemHasNext", "Lj0/l;", "leftOver", "nextSize", "lineIndex", "currentLineCrossAxisSize", "isWrappingRound", "isEllipsisWrap", "b", "(ZIJLj0/l;IIIZZ)Landroidx/compose/foundation/layout/o$b;", "I", "Landroidx/compose/foundation/layout/r;", "c", "J", "d", "e", "f", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final int f18149a;

    /* renamed from: b  reason: collision with root package name */
    private final r f18150b;

    /* renamed from: c  reason: collision with root package name */
    private final long f18151c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18152d;

    /* renamed from: e  reason: collision with root package name */
    private final int f18153e;

    /* renamed from: f  reason: collision with root package name */
    private final int f18154f;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/o$a;", "", "LE1/H;", "ellipsis", "LE1/a0;", "placeable", "Lj0/l;", "ellipsisSize", "", "placeEllipsisOnLastContentLine", "<init>", "(LE1/H;LE1/a0;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "LE1/H;", "()LE1/H;", "b", "LE1/a0;", "d", "()LE1/a0;", "c", "J", "()J", "Z", "()Z", "e", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final H f18155a;

        /* renamed from: b  reason: collision with root package name */
        private final a0 f18156b;

        /* renamed from: c  reason: collision with root package name */
        private final long f18157c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f18158d;

        public /* synthetic */ a(H h10, a0 a0Var, long j10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(h10, a0Var, j10, z10);
        }

        public final H a() {
            return this.f18155a;
        }

        public final long b() {
            return this.f18157c;
        }

        public final boolean c() {
            return this.f18158d;
        }

        public final a0 d() {
            return this.f18156b;
        }

        public final void e(boolean z10) {
            this.f18158d = z10;
        }

        private a(H h10, a0 a0Var, long j10, boolean z10) {
            this.f18155a = h10;
            this.f18156b = a0Var;
            this.f18157c = j10;
            this.f18158d = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(H h10, a0 a0Var, long j10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(h10, a0Var, j10, (i10 & 8) != 0 ? true : z10, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/layout/o$b;", "", "", "isLastItemInLine", "isLastItemInContainer", "<init>", "(ZZ)V", "a", "Z", "b", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f18159a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f18160b;

        public b(boolean z10, boolean z11) {
            this.f18159a = z10;
            this.f18160b = z11;
        }

        public final boolean a() {
            return this.f18160b;
        }

        public final boolean b() {
            return this.f18159a;
        }
    }

    public /* synthetic */ o(int i10, r rVar, long j10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, rVar, j10, i11, i12, i13);
    }

    public final a a(b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        a e10;
        if (!bVar.a() || (e10 = this.f18150b.e(z10, i10, i11)) == null) {
            return null;
        }
        e10.e(i10 >= 0 && (i13 == 0 || (i12 - C5456l.e(e10.b()) >= 0 && i13 < this.f18149a)));
        return e10;
    }

    public final b b(boolean z10, int i10, long j10, C5456l lVar, int i11, int i12, int i13, boolean z11, boolean z12) {
        C5456l f10;
        int i14 = i10;
        int i15 = i11;
        int i16 = i13;
        int i17 = i12 + i16;
        if (lVar == null) {
            return new b(true, true);
        }
        if (this.f18150b.i() != q.a.Visible && (i15 >= this.f18152d || C5456l.f(j10) - C5456l.f(lVar.i()) < 0)) {
            return new b(true, true);
        }
        if (i14 == 0 || (i14 < this.f18149a && C5456l.e(j10) - C5456l.e(lVar.i()) >= 0)) {
            int max = i12 + Math.max(i16, C5456l.f(lVar.i()));
            if (z12) {
                f10 = null;
            } else {
                boolean z13 = z10;
                f10 = this.f18150b.f(z10, i15, max);
            }
            C5456l lVar2 = f10;
            if (lVar2 != null) {
                lVar2.i();
                if (i14 + 1 >= this.f18149a || ((C5456l.e(j10) - C5456l.e(lVar.i())) - this.f18153e) - C5456l.e(lVar2.i()) < 0) {
                    if (z12) {
                        return new b(true, true);
                    }
                    b b10 = b(false, 0, C5456l.b(C5267b.l(this.f18151c), (C5456l.f(j10) - this.f18154f) - Math.max(i16, C5456l.f(lVar.i()))), lVar2, i15 + 1, max, 0, true, true);
                    return new b(b10.a(), b10.a());
                }
            }
            return new b(false, false);
        } else if (z11) {
            return new b(true, true);
        } else {
            int i18 = i15 + 1;
            return new b(true, b(z10, 0, C5456l.b(C5267b.l(this.f18151c), (C5456l.f(j10) - this.f18154f) - i16), C5456l.a(C5456l.b(C5456l.e(lVar.i()) - this.f18153e, C5456l.f(lVar.i()))), i18, i17, 0, true, false).a());
        }
    }

    private o(int i10, r rVar, long j10, int i11, int i12, int i13) {
        this.f18149a = i10;
        this.f18150b = rVar;
        this.f18151c = j10;
        this.f18152d = i11;
        this.f18153e = i12;
        this.f18154f = i13;
    }
}
