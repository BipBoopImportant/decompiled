package ZF;

import RF.j;
import RF.k;
import XH.C16807N;
import ZF.C16938W0;
import android.view.MotionEvent;
import com.sugarcube.app.base.data.model.DecorateViewMode;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import com.sugarcube.decorate_engine.PanZoomRegion;
import kotlin.Metadata;
import nI.C17631a;
import tI.C17978n;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LZF/R0;", "LZF/S0;", "LZF/V0;", "scheme", "<init>", "(LZF/V0;)V", "Landroid/view/MotionEvent$PointerCoords;", "cp", "pp", "LZF/T0;", "u", "(Landroid/view/MotionEvent$PointerCoords;Landroid/view/MotionEvent$PointerCoords;)LZF/T0;", "LXH/N;", "p", "()V", "e", "", "f", "()Z", "i", "Lkotlin/Function0;", "b", "LnI/a;", "onEndAction", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "c", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "startXF", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZF.R0  reason: case insensitive filesystem */
public final class C16928R0 extends C16930S0 {

    /* renamed from: b  reason: collision with root package name */
    private C17631a<C16807N> f140574b = null;

    /* renamed from: c  reason: collision with root package name */
    private final ModelScreenTransform f140575c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        r2 = a().getModelScreenTransform(r2.f());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16928R0(ZF.C16936V0 r2) {
        /*
            r1 = this;
            java.lang.String r0 = "scheme"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 0
            r1.<init>(r2, r0)
            r1.f140574b = r0
            ZF.W0 r2 = r1.c()
            r2.x()
            com.sugarcube.decorate.v1.internal.v1.b r2 = r1.d()
            RF.k r2 = r2.H0()
            if (r2 == 0) goto L_0x002a
            com.sugarcube.decorate.internal.shared.IDecorateEngine r0 = r1.a()
            com.sugarcube.decorate_engine.ObjectInstanceId r2 = r2.f()
            com.sugarcube.decorate_engine.ModelScreenTransform r2 = r0.getModelScreenTransform(r2)
            if (r2 != 0) goto L_0x002f
        L_0x002a:
            com.sugarcube.decorate_engine.ModelScreenTransform r2 = new com.sugarcube.decorate_engine.ModelScreenTransform
            r2.<init>()
        L_0x002f:
            r1.f140575c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ZF.C16928R0.<init>(ZF.V0):void");
    }

    private final void p() {
        if (c().k() == 2) {
            C16938W0.a aVar = C16938W0.f140600q;
            float e10 = aVar.e(c().n()[0], c().n()[1]);
            float e11 = aVar.e(c().l()[0], c().l()[1]);
            float f10 = e11 / e10;
            if (d().l0().getValue() == DecorateViewMode.FocusMode) {
                DecorateViewMode value = d().l0().getValue();
                j d02 = d().d0();
                if (e10 > e11) {
                    b().e().onFocusModeZoomIncrease();
                    this.f140574b = new C16921N0(this, value, d02);
                    return;
                }
                b().e().onFocusModeZoomDecrease();
                this.f140574b = new C16923O0(this, value, d02);
                return;
            }
            PanZoomRegion panZoomRegion = a().getPanZoomRegion();
            MotionEvent.PointerCoords d10 = aVar.d(c().l()[0], c().l()[1]);
            if (panZoomRegion.isUnzoomed()) {
                panZoomRegion.setPixelCenterCoords(d10);
                panZoomRegion.zoom = 1.0f;
            } else {
                MotionEvent.PointerCoords d11 = aVar.d(c().n()[0], c().n()[1]);
                panZoomRegion.movePixelCenter(-(d10.x - d11.x), -(d10.y - d11.y));
            }
            panZoomRegion.zoom = C17978n.l(panZoomRegion.zoom * f10, 1.0f, 2.0f);
            b().e().onPinch();
            float d12 = C17978n.d(a().getPanZoomRegion().zoom, 1.0f);
            if (panZoomRegion.zoom != d12) {
                b().e().onRegionChanged(panZoomRegion);
                float f11 = panZoomRegion.zoom;
                if (f11 == 2.0f) {
                    b().e().onMaxZoomReached();
                } else if (f11 == 1.0f) {
                    b().e().onMinZoomReached();
                }
                DecorateViewMode value2 = d().l0().getValue();
                j d03 = d().d0();
                if (panZoomRegion.zoom < d12) {
                    this.f140574b = new C16925P0(this, value2, d03);
                } else {
                    this.f140574b = new C16927Q0(this, value2, d03);
                }
            }
            a().setPanZoomRegion(panZoomRegion);
            b().r(panZoomRegion.isUnzoomed());
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C16928R0 r02, DecorateViewMode decorateViewMode, j jVar) {
        C16942a z02 = r02.d().z0();
        if (z02 != null) {
            z02.V(decorateViewMode, jVar);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C16928R0 r02, DecorateViewMode decorateViewMode, j jVar) {
        C16942a z02 = r02.d().z0();
        if (z02 != null) {
            z02.T(decorateViewMode, jVar);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C16928R0 r02, DecorateViewMode decorateViewMode, j jVar) {
        C16942a z02 = r02.d().z0();
        if (z02 != null) {
            z02.V(decorateViewMode, jVar);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C16928R0 r02, DecorateViewMode decorateViewMode, j jVar) {
        C16942a z02 = r02.d().z0();
        if (z02 != null) {
            z02.T(decorateViewMode, jVar);
        }
        return C16807N.f139792a;
    }

    private final C16932T0 u(MotionEvent.PointerCoords pointerCoords, MotionEvent.PointerCoords pointerCoords2) {
        float f10 = pointerCoords.x - pointerCoords2.x;
        float f11 = pointerCoords.y - pointerCoords2.y;
        return Math.abs(f10) > Math.abs(f11) ? f10 > 0.0f ? C16932T0.RIGHT : C16932T0.LEFT : f11 > 0.0f ? C16932T0.DOWN : C16932T0.UP;
    }

    public void e() {
        C17631a<C16807N> aVar = this.f140574b;
        if (aVar != null) {
            aVar.invoke();
        }
        j(this.f140575c);
    }

    public boolean f() {
        MotionEvent.PointerCoords pointerCoords = c().l()[0];
        MotionEvent.PointerCoords pointerCoords2 = c().l()[1];
        MotionEvent.PointerCoords pointerCoords3 = c().n()[0];
        MotionEvent.PointerCoords pointerCoords4 = c().n()[1];
        C16932T0 u10 = u(pointerCoords, pointerCoords3);
        C16932T0 u11 = u(pointerCoords2, pointerCoords4);
        if (c().c() == C16901D0.TWO_FINGERS_ROTATE) {
            k H02 = d().H0();
            if (H02 != null) {
                if (!b().j() && H02.d().isWallPlaceableAny() && a().getInstanceParent(H02.f()).isWall()) {
                    return false;
                }
                double atan2 = Math.atan2((double) (pointerCoords2.y - pointerCoords.y), (double) (pointerCoords2.x - pointerCoords.x));
                b().e().onRotate(H02, (float) ((Math.atan2((double) (pointerCoords4.y - pointerCoords3.y), (double) (pointerCoords4.x - pointerCoords3.x)) - atan2) * 2.0d));
            }
            return true;
        } else if (u10 == u11) {
            b().e().onSwipe(u10);
            return true;
        } else if (c().c() == null) {
            return true;
        } else {
            p();
            return true;
        }
    }

    public boolean i() {
        return true;
    }
}
