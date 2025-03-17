package androidx.compose.foundation.layout;

import E1.C4484q;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import E1.r;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import c2.C5267b;
import c2.t;
import i1.C5437c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import s0.C5838I;
import s0.C5839J;
import s0.C5840K;
import s0.C5841L;
import s0.C5879y;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J,\u0010\u001c\u001a\u00020\u001b*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%Ji\u0010,\u001a\u00020\u001b2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0&2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010-J=\u00104\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J)\u00109\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J)\u0010<\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010:J)\u0010=\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010:J)\u0010>\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010:J\u0010\u0010@\u001a\u00020?HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u0002022\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010I\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/foundation/layout/H;", "LE1/I;", "Ls0/J;", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Li1/c$c;", "verticalAlignment", "<init>", "(Landroidx/compose/foundation/layout/d$e;Li1/c$c;)V", "LE1/a0;", "placeable", "Ls0/L;", "parentData", "", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "r", "(LE1/a0;Ls0/L;II)I", "c", "(LE1/a0;)I", "e", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "measureScope", "LXH/N;", "g", "(I[I[ILE1/K;)V", "", "placeables", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "k", "([LE1/a0;LE1/K;I[III[IIII)LE1/J;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "b", "(IIIIZ)J", "LE1/r;", "LE1/q;", "height", "a", "(LE1/r;Ljava/util/List;I)I", "width", "j", "d", "h", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/layout/d$e;", "Li1/c$c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class H implements I, C5839J {

    /* renamed from: a  reason: collision with root package name */
    private final C5073d.e f17949a;

    /* renamed from: b  reason: collision with root package name */
    private final C5437c.C0386c f17950b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0[] f17951c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H f17952d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f17953e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f17954f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int[] f17955g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0[] a0VarArr, H h10, int i10, int i11, int[] iArr) {
            super(1);
            this.f17951c = a0VarArr;
            this.f17952d = h10;
            this.f17953e = i10;
            this.f17954f = i11;
            this.f17955g = iArr;
        }

        public final void a(a0.a aVar) {
            a0[] a0VarArr = this.f17951c;
            H h10 = this.f17952d;
            int i10 = this.f17953e;
            int i11 = this.f17954f;
            int[] iArr = this.f17955g;
            int length = a0VarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                a0 a0Var = a0VarArr[i12];
                C17542s.g(a0Var);
                a0.a.i(aVar, a0Var, iArr[i13], h10.r(a0Var, C5838I.d(a0Var), i10, i11), 0.0f, 4, (Object) null);
                i12++;
                i13++;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public H(C5073d.e eVar, C5437c.C0386c cVar) {
        this.f17949a = eVar;
        this.f17950b = cVar;
    }

    /* access modifiers changed from: private */
    public final int r(a0 a0Var, C5841L l10, int i10, int i11) {
        C5082m a10 = l10 != null ? l10.a() : null;
        return a10 != null ? a10.a(i10 - a0Var.z0(), t.Ltr, a0Var, i11) : this.f17950b.a(0, i10 - a0Var.z0());
    }

    public int a(r rVar, List<? extends C4484q> list, int i10) {
        return C5879y.f28856a.d(list, i10, rVar.K0(this.f17949a.a()));
    }

    public long b(int i10, int i11, int i12, int i13, boolean z10) {
        return G.a(z10, i10, i11, i12, i13);
    }

    public int c(a0 a0Var) {
        return a0Var.E0();
    }

    public int d(r rVar, List<? extends C4484q> list, int i10) {
        return C5879y.f28856a.b(list, i10, rVar.K0(this.f17949a.a()));
    }

    public int e(a0 a0Var) {
        return a0Var.z0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return C17542s.e(this.f17949a, h10.f17949a) && C17542s.e(this.f17950b, h10.f17950b);
    }

    public void g(int i10, int[] iArr, int[] iArr2, K k10) {
        this.f17949a.b(k10, i10, iArr, k10.getLayoutDirection(), iArr2);
    }

    public int h(r rVar, List<? extends C4484q> list, int i10) {
        return C5879y.f28856a.a(list, i10, rVar.K0(this.f17949a.a()));
    }

    public int hashCode() {
        return (this.f17949a.hashCode() * 31) + this.f17950b.hashCode();
    }

    public J i(K k10, List<? extends E1.H> list, long j10) {
        K k11 = k10;
        return C5840K.b(this, C5267b.n(j10), C5267b.m(j10), C5267b.l(j10), C5267b.k(j10), k11.K0(this.f17949a.a()), k11, list, new a0[list.size()], 0, list.size(), (int[]) null, 0, 3072, (Object) null);
    }

    public int j(r rVar, List<? extends C4484q> list, int i10) {
        return C5879y.f28856a.c(list, i10, rVar.K0(this.f17949a.a()));
    }

    public J k(a0[] a0VarArr, K k10, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return K.v0(k10, i11, i12, (Map) null, new a(a0VarArr, this, i12, i10, iArr), 4, (Object) null);
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f17949a + ", verticalAlignment=" + this.f17950b + ')';
    }
}
