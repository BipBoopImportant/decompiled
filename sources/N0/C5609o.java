package n0;

import XH.C16807N;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.C5137v0;
import androidx.compose.ui.platform.C5139w0;
import kotlin.Metadata;
import m1.h;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;
import p1.C5702H;
import pI.C17752b;
import r1.C5817c;
import r1.f;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0016\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J'\u0010\u001b\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J'\u0010\u001d\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J6\u0010#\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\u000b*\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010+\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Ln0/o;", "Lm1/h;", "Landroidx/compose/ui/platform/w0;", "Ln0/a;", "overscrollEffect", "Ln0/w;", "edgeEffectWrapper", "Ln0/Q;", "overscrollConfig", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v0;", "LXH/N;", "inspectorInfo", "<init>", "(Ln0/a;Ln0/w;Ln0/Q;LnI/l;)V", "Lr1/f;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "", "b", "(Lr1/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "f", "right", "c", "bottom", "a", "", "rotationDegrees", "Lo1/g;", "offset", "edgeEffect", "g", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lr1/c;", "z", "(Lr1/c;)V", "e", "Ln0/a;", "Ln0/w;", "Ln0/Q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.o  reason: case insensitive filesystem */
final class C5609o extends C5139w0 implements h {

    /* renamed from: e  reason: collision with root package name */
    private final C5595a f26466e;

    /* renamed from: f  reason: collision with root package name */
    private final C5617w f26467f;

    /* renamed from: g  reason: collision with root package name */
    private final C5594Q f26468g;

    public C5609o(C5595a aVar, C5617w wVar, C5594Q q10, C17642l<? super C5137v0, C16807N> lVar) {
        super(lVar);
        this.f26466e = aVar;
        this.f26467f = wVar;
        this.f26468g = q10;
    }

    private final boolean a(f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return g(180.0f, C5668h.a(-C5673m.l(fVar.b()), (-C5673m.i(fVar.b())) + fVar.H1(this.f26468g.a().a())), edgeEffect, canvas);
    }

    private final boolean b(f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return g(270.0f, C5668h.a(-C5673m.i(fVar.b()), fVar.H1(this.f26468g.a().c(fVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean c(f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return g(90.0f, C5668h.a(0.0f, (-((float) C17752b.e(C5673m.l(fVar.b())))) + fVar.H1(this.f26468g.a().b(fVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean f(f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return g(0.0f, C5668h.a(0.0f, fVar.H1(this.f26468g.a().d())), edgeEffect, canvas);
    }

    private final boolean g(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f10);
        canvas.translate(C5667g.m(j10), C5667g.n(j10));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public void z(C5817c cVar) {
        this.f26466e.r(cVar.b());
        if (C5673m.n(cVar.b())) {
            cVar.V1();
            return;
        }
        cVar.V1();
        this.f26466e.j().getValue();
        Canvas d10 = C5702H.d(cVar.I1().e());
        C5617w wVar = this.f26467f;
        boolean z10 = false;
        boolean b10 = wVar.r() ? b(cVar, wVar.h(), d10) : false;
        if (wVar.y()) {
            b10 = f(cVar, wVar.l(), d10) || b10;
        }
        if (wVar.u()) {
            b10 = c(cVar, wVar.j(), d10) || b10;
        }
        if (wVar.o()) {
            if (a(cVar, wVar.f(), d10) || b10) {
                z10 = true;
            }
            b10 = z10;
        }
        if (b10) {
            this.f26466e.k();
        }
    }
}
