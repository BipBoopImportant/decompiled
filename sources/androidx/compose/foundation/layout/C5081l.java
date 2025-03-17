package androidx.compose.foundation.layout;

import E1.C4484q;
import E1.H;
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

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJi\u0010'\u001a\u00020&2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u00182\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J=\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J,\u00106\u001a\u00020&*\u00020\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00105\u001a\u00020/H\u0016ø\u0001\u0001¢\u0006\u0004\b6\u00107J)\u0010;\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010<J)\u0010>\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010<J)\u0010?\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b?\u0010<J)\u0010@\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010<J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020-2\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010JR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010K\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"Landroidx/compose/foundation/layout/l;", "LE1/I;", "Ls0/J;", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "Li1/c$b;", "horizontalAlignment", "<init>", "(Landroidx/compose/foundation/layout/d$m;Li1/c$b;)V", "LE1/a0;", "placeable", "Ls0/L;", "parentData", "", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "Lc2/t;", "layoutDirection", "r", "(LE1/a0;Ls0/L;IILc2/t;)I", "c", "(LE1/a0;)I", "e", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "LE1/K;", "measureScope", "LXH/N;", "g", "(I[I[ILE1/K;)V", "", "placeables", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "LE1/J;", "k", "([LE1/a0;LE1/K;I[III[IIII)LE1/J;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "Lc2/b;", "b", "(IIIIZ)J", "", "LE1/H;", "measurables", "constraints", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "LE1/r;", "LE1/q;", "height", "a", "(LE1/r;Ljava/util/List;I)I", "width", "j", "d", "h", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/layout/d$m;", "Li1/c$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.l  reason: case insensitive filesystem */
public final class C5081l implements I, C5839J {

    /* renamed from: a  reason: collision with root package name */
    private final C5073d.m f18128a;

    /* renamed from: b  reason: collision with root package name */
    private final C5437c.b f18129b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.l$a */
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0[] f18130c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5081l f18131d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f18132e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18133f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ K f18134g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int[] f18135h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0[] a0VarArr, C5081l lVar, int i10, int i11, K k10, int[] iArr) {
            super(1);
            this.f18130c = a0VarArr;
            this.f18131d = lVar;
            this.f18132e = i10;
            this.f18133f = i11;
            this.f18134g = k10;
            this.f18135h = iArr;
        }

        public final void a(a0.a aVar) {
            a0[] a0VarArr = this.f18130c;
            C5081l lVar = this.f18131d;
            int i10 = this.f18132e;
            int i11 = this.f18133f;
            K k10 = this.f18134g;
            int[] iArr = this.f18135h;
            int length = a0VarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                a0 a0Var = a0VarArr[i12];
                C17542s.g(a0Var);
                a0.a.i(aVar, a0Var, lVar.r(a0Var, C5838I.d(a0Var), i10, i11, k10.getLayoutDirection()), iArr[i13], 0.0f, 4, (Object) null);
                i12++;
                i13++;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public C5081l(C5073d.m mVar, C5437c.b bVar) {
        this.f18128a = mVar;
        this.f18129b = bVar;
    }

    /* access modifiers changed from: private */
    public final int r(a0 a0Var, C5841L l10, int i10, int i11, t tVar) {
        C5082m a10 = l10 != null ? l10.a() : null;
        return a10 != null ? a10.a(i10 - a0Var.E0(), tVar, a0Var, i11) : this.f18129b.a(0, i10 - a0Var.E0(), tVar);
    }

    public int a(r rVar, List<? extends C4484q> list, int i10) {
        return C5879y.f28856a.h(list, i10, rVar.K0(this.f18128a.a()));
    }

    public long b(int i10, int i11, int i12, int i13, boolean z10) {
        return C5080k.b(z10, i10, i11, i12, i13);
    }

    public int c(a0 a0Var) {
        return a0Var.z0();
    }

    public int d(r rVar, List<? extends C4484q> list, int i10) {
        return C5879y.f28856a.f(list, i10, rVar.K0(this.f18128a.a()));
    }

    public int e(a0 a0Var) {
        return a0Var.E0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5081l)) {
            return false;
        }
        C5081l lVar = (C5081l) obj;
        return C17542s.e(this.f18128a, lVar.f18128a) && C17542s.e(this.f18129b, lVar.f18129b);
    }

    public void g(int i10, int[] iArr, int[] iArr2, K k10) {
        this.f18128a.c(k10, i10, iArr, iArr2);
    }

    public int h(r rVar, List<? extends C4484q> list, int i10) {
        return C5879y.f28856a.e(list, i10, rVar.K0(this.f18128a.a()));
    }

    public int hashCode() {
        return (this.f18128a.hashCode() * 31) + this.f18129b.hashCode();
    }

    public J i(K k10, List<? extends H> list, long j10) {
        K k11 = k10;
        return C5840K.b(this, C5267b.m(j10), C5267b.n(j10), C5267b.k(j10), C5267b.l(j10), k11.K0(this.f18128a.a()), k11, list, new a0[list.size()], 0, list.size(), (int[]) null, 0, 3072, (Object) null);
    }

    public int j(r rVar, List<? extends C4484q> list, int i10) {
        return C5879y.f28856a.g(list, i10, rVar.K0(this.f18128a.a()));
    }

    public J k(a0[] a0VarArr, K k10, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return K.v0(k10, i12, i11, (Map) null, new a(a0VarArr, this, i12, i10, k10, iArr), 4, (Object) null);
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f18128a + ", horizontalAlignment=" + this.f18129b + ')';
    }
}
