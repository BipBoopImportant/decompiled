package V1;

import N1.C4679n;
import N1.C4684t;
import Y1.k;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import o1.C5674n;
import p1.C5728l0;
import p1.C5730m0;
import p1.C5732n0;
import p1.e1;
import p1.g1;
import p1.j1;
import r1.g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a^\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aT\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LN1/n;", "Lp1/n0;", "canvas", "Lp1/l0;", "brush", "", "alpha", "Lp1/g1;", "shadow", "LY1/k;", "decoration", "Lr1/g;", "drawStyle", "Lp1/d0;", "blendMode", "LXH/N;", "a", "(LN1/n;Lp1/n0;Lp1/l0;FLp1/g1;LY1/k;Lr1/g;I)V", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final void a(C4679n nVar, C5732n0 n0Var, C5728l0 l0Var, float f10, g1 g1Var, k kVar, g gVar, int i10) {
        C5728l0 l0Var2 = l0Var;
        n0Var.t();
        if (nVar.w().size() <= 1) {
            b(nVar, n0Var, l0Var, f10, g1Var, kVar, gVar, i10);
        } else if (l0Var2 instanceof j1) {
            b(nVar, n0Var, l0Var, f10, g1Var, kVar, gVar, i10);
        } else if (l0Var2 instanceof e1) {
            List<C4684t> w10 = nVar.w();
            int size = w10.size();
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                C4684t tVar = w10.get(i11);
                f12 += tVar.e().getHeight();
                f11 = Math.max(f11, tVar.e().getWidth());
            }
            Shader b10 = ((e1) l0Var2).b(C5674n.a(f11, f12));
            Matrix matrix = new Matrix();
            b10.getLocalMatrix(matrix);
            List<C4684t> w11 = nVar.w();
            int size2 = w11.size();
            for (int i12 = 0; i12 < size2; i12++) {
                C4684t tVar2 = w11.get(i12);
                C5732n0 n0Var2 = n0Var;
                tVar2.e().f(n0Var2, C5730m0.a(b10), f10, g1Var, kVar, gVar, i10);
                n0Var2.d(0.0f, tVar2.e().getHeight());
                matrix.setTranslate(0.0f, -tVar2.e().getHeight());
                b10.setLocalMatrix(matrix);
            }
        }
        C5732n0 n0Var3 = n0Var;
        n0Var.n();
    }

    private static final void b(C4679n nVar, C5732n0 n0Var, C5728l0 l0Var, float f10, g1 g1Var, k kVar, g gVar, int i10) {
        List<C4684t> w10 = nVar.w();
        int size = w10.size();
        for (int i11 = 0; i11 < size; i11++) {
            C4684t tVar = w10.get(i11);
            tVar.e().f(n0Var, l0Var, f10, g1Var, kVar, gVar, i10);
            n0Var.d(0.0f, tVar.e().getHeight());
        }
    }
}
