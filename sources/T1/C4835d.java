package T1;

import N1.P;
import N1.W;
import N1.X;
import XH.C16814e;
import Y1.i;
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import c2.r;
import kotlin.Metadata;
import o1.C5669i;
import tI.C17978n;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ak\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u00020\f*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "LT1/P;", "textFieldValue", "LT1/H;", "offsetMapping", "LN1/P;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Lo1/i;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "b", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LT1/P;LT1/H;LN1/P;Landroid/graphics/Matrix;Lo1/i;Lo1/i;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", "d", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILT1/H;LN1/P;Lo1/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "endOffset", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILT1/H;LN1/P;Lo1/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "x", "y", "c", "(Lo1/i;FF)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: T1.d  reason: case insensitive filesystem */
public final class C4835d {
    private static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, int i10, int i11, H h10, P p10, C5669i iVar) {
        int i12 = i11;
        H h11 = h10;
        int i13 = i10;
        C5669i iVar2 = iVar;
        int b10 = h11.b(i13);
        int b11 = h11.b(i12);
        float[] fArr = new float[((b11 - b10) * 4)];
        p10.w().a(X.b(b10, b11), fArr, 0);
        while (i13 < i12) {
            int b12 = h11.b(i13);
            int i14 = (b12 - b10) * 4;
            C5669i iVar3 = new C5669i(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], fArr[i14 + 3]);
            boolean y10 = iVar2.y(iVar3);
            if (!c(iVar2, iVar3.o(), iVar3.r()) || !c(iVar2, iVar3.p(), iVar3.j())) {
                y10 |= true;
            }
            builder.addCharacterBounds(i13, iVar3.o(), iVar3.r(), iVar3.p(), iVar3.j(), p10.c(b12) == i.Rtl ? y10 | true : y10 ? 1 : 0);
            i13++;
        }
        return builder;
    }

    @C16814e
    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, P p10, H h10, P p11, Matrix matrix, C5669i iVar, C5669i iVar2, boolean z10, boolean z11, boolean z12, boolean z13) {
        CursorAnchorInfo.Builder builder2 = builder;
        P p12 = p11;
        C5669i iVar3 = iVar;
        builder.reset();
        Matrix matrix2 = matrix;
        builder.setMatrix(matrix);
        int l10 = W.l(p10.h());
        builder.setSelectionRange(l10, W.k(p10.h()));
        H h11 = h10;
        if (z10) {
            d(builder, l10, h10, p11, iVar);
        }
        if (z11) {
            W g10 = p10.g();
            int l11 = g10 != null ? W.l(g10.r()) : -1;
            W g11 = p10.g();
            int k10 = g11 != null ? W.k(g11.r()) : -1;
            if (l11 >= 0 && l11 < k10) {
                builder.setComposingText(l11, p10.i().subSequence(l11, k10));
                a(builder, l11, k10, h10, p11, iVar);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && z12) {
            C5669i iVar4 = iVar2;
            C4833b.a(builder, iVar2);
        }
        if (i10 >= 34 && z13) {
            C4834c.a(builder, p11, iVar);
        }
        return builder.build();
    }

    private static final boolean c(C5669i iVar, float f10, float f11) {
        float o10 = iVar.o();
        if (f10 <= iVar.p() && o10 <= f10) {
            return f11 <= iVar.j() && iVar.r() <= f11;
        }
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i10, H h10, P p10, C5669i iVar) {
        if (i10 < 0) {
            return builder;
        }
        int b10 = h10.b(i10);
        C5669i e10 = p10.e(b10);
        float l10 = C17978n.l(e10.o(), 0.0f, (float) r.h(p10.B()));
        boolean c10 = c(iVar, l10, e10.r());
        boolean c11 = c(iVar, l10, e10.j());
        int i11 = 0;
        boolean z10 = p10.c(b10) == i.Rtl;
        if (c10 || c11) {
            i11 = 1;
        }
        if (!c10 || !c11) {
            i11 |= 2;
        }
        builder.setInsertionMarkerLocation(l10, e10.r(), e10.j(), e10.j(), z10 ? i11 | 4 : i11);
        return builder;
    }
}
