package O1;

import P1.a;
import P1.j;
import android.graphics.RectF;
import android.text.SegmentFinder;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LO1/f;", "", "<init>", "()V", "LO1/f0;", "layout", "Landroid/graphics/RectF;", "rectF", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "c", "(LO1/f0;Landroid/graphics/RectF;ILnI/p;)[I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O1.f  reason: case insensitive filesystem */
public final class C4772f {

    /* renamed from: a  reason: collision with root package name */
    public static final C4772f f11735a = new C4772f();

    private C4772f() {
    }

    /* access modifiers changed from: private */
    public static final boolean b(p pVar, RectF rectF, RectF rectF2) {
        return ((Boolean) pVar.invoke(rectF, rectF2)).booleanValue();
    }

    public final int[] c(f0 f0Var, RectF rectF, int i10, p<? super RectF, ? super RectF, Boolean> pVar) {
        SegmentFinder segmentFinder;
        if (i10 == 1) {
            segmentFinder = a.f11833a.a(new j(f0Var.G(), f0Var.I()));
        } else {
            C4768b.a();
            segmentFinder = C4769c.a(C4767a.a(f0Var.G(), f0Var.H()));
        }
        return f0Var.i().getRangeForRect(rectF, segmentFinder, new C4771e(pVar));
    }
}
