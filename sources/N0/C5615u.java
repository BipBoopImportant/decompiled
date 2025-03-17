package n0;

import XH.C16807N;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.C5137v0;
import androidx.compose.ui.platform.C5139w0;
import c2.d;
import c2.t;
import kotlin.Metadata;
import m1.h;
import nI.C17642l;
import o1.C5667g;
import o1.C5673m;
import p1.C5702H;
import p1.C5732n0;
import pI.C17752b;
import r1.C5817c;
import s1.C5905c;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J#\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J#\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J+\u0010!\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\t*\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010*R\u0014\u0010.\u001a\u00020)8BX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Ln0/u;", "Lm1/h;", "Landroidx/compose/ui/platform/w0;", "Ln0/a;", "overscrollEffect", "Ln0/w;", "edgeEffectWrapper", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v0;", "LXH/N;", "inspectorInfo", "<init>", "(Ln0/a;Ln0/w;LnI/l;)V", "", "l", "()Z", "j", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "b", "(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "f", "right", "c", "bottom", "a", "", "rotationDegrees", "edgeEffect", "g", "(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lr1/c;", "z", "(Lr1/c;)V", "e", "Ln0/a;", "Ln0/w;", "Landroid/graphics/RenderNode;", "Landroid/graphics/RenderNode;", "_renderNode", "i", "()Landroid/graphics/RenderNode;", "renderNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.u  reason: case insensitive filesystem */
final class C5615u extends C5139w0 implements h {

    /* renamed from: e  reason: collision with root package name */
    private final C5595a f26469e;

    /* renamed from: f  reason: collision with root package name */
    private final C5617w f26470f;

    /* renamed from: g  reason: collision with root package name */
    private RenderNode f26471g;

    public C5615u(C5595a aVar, C5617w wVar, C17642l<? super C5137v0, C16807N> lVar) {
        super(lVar);
        this.f26469e = aVar;
        this.f26470f = wVar;
    }

    private final boolean a(EdgeEffect edgeEffect, Canvas canvas) {
        return g(180.0f, edgeEffect, canvas);
    }

    private final boolean b(EdgeEffect edgeEffect, Canvas canvas) {
        return g(270.0f, edgeEffect, canvas);
    }

    private final boolean c(EdgeEffect edgeEffect, Canvas canvas) {
        return g(90.0f, edgeEffect, canvas);
    }

    private final boolean f(EdgeEffect edgeEffect, Canvas canvas) {
        return g(0.0f, edgeEffect, canvas);
    }

    private final boolean g(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f10);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final RenderNode i() {
        RenderNode renderNode = this.f26471g;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode a10 = C5614t.a("AndroidEdgeEffectOverscrollEffect");
        this.f26471g = a10;
        return a10;
    }

    private final boolean j() {
        C5617w wVar = this.f26470f;
        return wVar.r() || wVar.s() || wVar.u() || wVar.v();
    }

    private final boolean l() {
        C5617w wVar = this.f26470f;
        return wVar.y() || wVar.z() || wVar.o() || wVar.p();
    }

    public void z(C5817c cVar) {
        boolean z10;
        this.f26469e.r(cVar.b());
        if (C5673m.n(cVar.b())) {
            cVar.V1();
            return;
        }
        this.f26469e.j().getValue();
        float H12 = cVar.H1(C5606l.b());
        Canvas d10 = C5702H.d(cVar.I1().e());
        C5617w wVar = this.f26470f;
        boolean l10 = l();
        boolean j10 = j();
        boolean z11 = false;
        if (l10 && j10) {
            boolean unused = i().setPosition(0, 0, d10.getWidth(), d10.getHeight());
        } else if (l10) {
            boolean unused2 = i().setPosition(0, 0, d10.getWidth() + (C17752b.e(H12) * 2), d10.getHeight());
        } else if (j10) {
            boolean unused3 = i().setPosition(0, 0, d10.getWidth(), d10.getHeight() + (C17752b.e(H12) * 2));
        } else {
            cVar.V1();
            return;
        }
        RecordingCanvas a10 = i().beginRecording();
        if (wVar.s()) {
            EdgeEffect i10 = wVar.i();
            c(i10, a10);
            i10.finish();
        }
        if (wVar.r()) {
            EdgeEffect h10 = wVar.h();
            z10 = b(h10, a10);
            if (wVar.t()) {
                float n10 = C5667g.n(this.f26469e.i());
                C5616v vVar = C5616v.f26472a;
                vVar.d(wVar.i(), vVar.b(h10), ((float) 1) - n10);
            }
        } else {
            z10 = false;
        }
        if (wVar.z()) {
            EdgeEffect m10 = wVar.m();
            a(m10, a10);
            m10.finish();
        }
        if (wVar.y()) {
            EdgeEffect l11 = wVar.l();
            z10 = f(l11, a10) || z10;
            if (wVar.A()) {
                float m11 = C5667g.m(this.f26469e.i());
                C5616v vVar2 = C5616v.f26472a;
                vVar2.d(wVar.m(), vVar2.b(l11), m11);
            }
        }
        if (wVar.v()) {
            EdgeEffect k10 = wVar.k();
            b(k10, a10);
            k10.finish();
        }
        if (wVar.u()) {
            EdgeEffect j11 = wVar.j();
            z10 = c(j11, a10) || z10;
            if (wVar.w()) {
                float n11 = C5667g.n(this.f26469e.i());
                C5616v vVar3 = C5616v.f26472a;
                vVar3.d(wVar.k(), vVar3.b(j11), n11);
            }
        }
        if (wVar.p()) {
            EdgeEffect g10 = wVar.g();
            f(g10, a10);
            g10.finish();
        }
        if (wVar.o()) {
            EdgeEffect f10 = wVar.f();
            if (a(f10, a10) || z10) {
                z11 = true;
            }
            if (wVar.q()) {
                float m12 = C5667g.m(this.f26469e.i());
                C5616v vVar4 = C5616v.f26472a;
                vVar4.d(wVar.g(), vVar4.b(f10), ((float) 1) - m12);
            }
            z10 = z11;
        }
        if (z10) {
            this.f26469e.k();
        }
        float f11 = j10 ? 0.0f : H12;
        if (l10) {
            H12 = 0.0f;
        }
        t layoutDirection = cVar.getLayoutDirection();
        C5732n0 b10 = C5702H.b(a10);
        long b11 = cVar.b();
        d density = cVar.I1().getDensity();
        t layoutDirection2 = cVar.I1().getLayoutDirection();
        C5732n0 e10 = cVar.I1().e();
        long b12 = cVar.I1().b();
        C5905c h11 = cVar.I1().h();
        r1.d I12 = cVar.I1();
        I12.a(cVar);
        I12.d(layoutDirection);
        I12.f(b10);
        I12.g(b11);
        I12.i((C5905c) null);
        b10.t();
        try {
            cVar.I1().c().d(f11, H12);
            cVar.V1();
            float f12 = -f11;
            float f13 = -H12;
            cVar.I1().c().d(f12, f13);
            b10.n();
            r1.d I13 = cVar.I1();
            I13.a(density);
            I13.d(layoutDirection2);
            I13.f(e10);
            I13.g(b12);
            I13.i(h11);
            i().endRecording();
            int save = d10.save();
            d10.translate(f12, f13);
            d10.drawRenderNode(i());
            d10.restoreToCount(save);
        } catch (Throwable th2) {
            b10.n();
            r1.d I14 = cVar.I1();
            I14.a(density);
            I14.d(layoutDirection2);
            I14.f(e10);
            I14.g(b12);
            I14.i(h11);
            throw th2;
        }
    }
}
