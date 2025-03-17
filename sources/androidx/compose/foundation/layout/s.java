package androidx.compose.foundation.layout;

import E1.J;
import E1.K;
import E1.a0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import c2.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import s0.C5838I;
import s0.C5839J;
import s0.C5841L;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJi\u0010\u001e\u001a\u00020\u001d2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010%\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108ø\u0001\u0002\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/s;", "Ls0/J;", "LE1/a0;", "", "c", "(LE1/a0;)I", "e", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "Lc2/b;", "b", "(IIIIZ)J", "", "placeables", "LE1/K;", "measureScope", "beforeCrossAxisAlignmentLine", "", "mainAxisPositions", "mainAxisLayoutSize", "crossAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "LE1/J;", "k", "([LE1/a0;LE1/K;I[III[IIII)LE1/J;", "placeable", "Ls0/L;", "rowColumnParentData", "Lc2/t;", "layoutDirection", "p", "(LE1/a0;Ls0/L;ILc2/t;I)I", "childrenMainAxisSize", "LXH/N;", "g", "(I[I[ILE1/K;)V", "f", "()Z", "isHorizontal", "Landroidx/compose/foundation/layout/d$e;", "n", "()Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/d$m;", "o", "()Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "Landroidx/compose/foundation/layout/m;", "l", "()Landroidx/compose/foundation/layout/m;", "crossAxisAlignment", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface s extends C5839J {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int[] f18201c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f18202d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f18203e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18204f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a0[] f18205g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ s f18206h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f18207i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ K f18208j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f18209k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int[] f18210l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int[] iArr, int i10, int i11, int i12, a0[] a0VarArr, s sVar, int i13, K k10, int i14, int[] iArr2) {
            super(1);
            this.f18201c = iArr;
            this.f18202d = i10;
            this.f18203e = i11;
            this.f18204f = i12;
            this.f18205g = a0VarArr;
            this.f18206h = sVar;
            this.f18207i = i13;
            this.f18208j = k10;
            this.f18209k = i14;
            this.f18210l = iArr2;
        }

        public final void a(a0.a aVar) {
            int[] iArr = this.f18201c;
            int i10 = iArr != null ? iArr[this.f18202d] : 0;
            for (int i11 = this.f18203e; i11 < this.f18204f; i11++) {
                a0 a0Var = this.f18205g[i11];
                C17542s.g(a0Var);
                int p10 = this.f18206h.p(a0Var, C5838I.d(a0Var), this.f18207i, this.f18208j.getLayoutDirection(), this.f18209k) + i10;
                if (this.f18206h.f()) {
                    a0.a.i(aVar, a0Var, this.f18210l[i11 - this.f18203e], p10, 0.0f, 4, (Object) null);
                } else {
                    a0.a.i(aVar, a0Var, p10, this.f18210l[i11 - this.f18203e], 0.0f, 4, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    long b(int i10, int i11, int i12, int i13, boolean z10) {
        return f() ? G.a(z10, i10, i11, i12, i13) : C5080k.b(z10, i10, i11, i12, i13);
    }

    int c(a0 a0Var) {
        return f() ? a0Var.C0() : a0Var.z();
    }

    int e(a0 a0Var) {
        return f() ? a0Var.z() : a0Var.C0();
    }

    boolean f();

    void g(int i10, int[] iArr, int[] iArr2, K k10) {
        if (f()) {
            n().b(k10, i10, iArr, k10.getLayoutDirection(), iArr2);
            return;
        }
        o().c(k10, i10, iArr, iArr2);
    }

    J k(a0[] a0VarArr, K k10, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        int i16;
        int i17;
        if (f()) {
            i17 = i11;
            i16 = i12;
        } else {
            i16 = i11;
            i17 = i12;
        }
        return K.v0(k10, i17, i16, (Map) null, new a(iArr2, i13, i14, i15, a0VarArr, this, i12, k10, i10, iArr), 4, (Object) null);
    }

    C5082m l();

    C5073d.e n();

    C5073d.m o();

    int p(a0 a0Var, C5841L l10, int i10, t tVar, int i11) {
        C5082m mVar;
        if (l10 == null || (mVar = l10.a()) == null) {
            mVar = l();
        }
        int e10 = i10 - e(a0Var);
        if (f()) {
            tVar = t.Ltr;
        }
        return mVar.a(e10, tVar, a0Var, i11);
    }
}
