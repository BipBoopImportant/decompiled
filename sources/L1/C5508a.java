package l1;

import XH.C16807N;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5673m;
import p1.C5702H;
import p1.C5732n0;
import r1.C5815a;
import r1.f;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Ll1/a;", "Landroid/view/View$DragShadowBuilder;", "Lc2/d;", "density", "Lo1/m;", "decorationSize", "Lkotlin/Function1;", "Lr1/f;", "LXH/N;", "drawDragDecoration", "<init>", "(Lc2/d;JLnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "a", "Lc2/d;", "b", "J", "c", "LnI/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l1.a  reason: case insensitive filesystem */
public final class C5508a extends View.DragShadowBuilder {

    /* renamed from: a  reason: collision with root package name */
    private final d f25442a;

    /* renamed from: b  reason: collision with root package name */
    private final long f25443b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<f, C16807N> f25444c;

    public /* synthetic */ C5508a(d dVar, long j10, C17642l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10, lVar);
    }

    public void onDrawShadow(Canvas canvas) {
        C5815a aVar = new C5815a();
        d dVar = this.f25442a;
        long j10 = this.f25443b;
        t tVar = t.Ltr;
        C5732n0 b10 = C5702H.b(canvas);
        C17642l<f, C16807N> lVar = this.f25444c;
        C5815a.C0452a E10 = aVar.E();
        d a10 = E10.a();
        t b11 = E10.b();
        C5732n0 c10 = E10.c();
        long d10 = E10.d();
        C5815a.C0452a E11 = aVar.E();
        E11.j(dVar);
        E11.k(tVar);
        E11.i(b10);
        E11.l(j10);
        b10.t();
        lVar.invoke(aVar);
        b10.n();
        C5815a.C0452a E12 = aVar.E();
        E12.j(a10);
        E12.k(b11);
        E12.i(c10);
        E12.l(d10);
    }

    public void onProvideShadowMetrics(Point point, Point point2) {
        d dVar = this.f25442a;
        point.set(dVar.K0(dVar.x1(C5673m.l(this.f25443b))), dVar.K0(dVar.x1(C5673m.i(this.f25443b))));
        point2.set(point.x / 2, point.y / 2);
    }

    private C5508a(d dVar, long j10, C17642l<? super f, C16807N> lVar) {
        this.f25442a = dVar;
        this.f25443b = j10;
        this.f25444c = lVar;
    }
}
