package ZF;

import android.view.MotionEvent;
import com.sugarcube.decorate_engine.PanZoomRegion;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"LZF/L0;", "LZF/S0;", "LZF/V0;", "scheme", "<init>", "(LZF/V0;)V", "LXH/N;", "e", "()V", "", "f", "()Z", "g", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZF.L0  reason: case insensitive filesystem */
public final class C16917L0 extends C16930S0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16917L0(C16936V0 v02) {
        super(v02, (DefaultConstructorMarker) null);
        C17542s.j(v02, "scheme");
        c().x();
    }

    public void e() {
        C16942a f10;
        if (c().k() == 0 && (f10 = b().f()) != null) {
            f10.W(d().d0());
        }
    }

    public boolean f() {
        if (b().g()) {
            return false;
        }
        PanZoomRegion panZoomRegion = a().getPanZoomRegion();
        if (panZoomRegion.isUnzoomed()) {
            return false;
        }
        MotionEvent.PointerCoords pointerCoords = c().l()[0];
        MotionEvent.PointerCoords pointerCoords2 = c().n()[0];
        panZoomRegion.movePixelCenter(-(pointerCoords.x - pointerCoords2.x), -(pointerCoords.y - pointerCoords2.y));
        a().setPanZoomRegion(panZoomRegion);
        b().e().onRegionChanged(panZoomRegion);
        return true;
    }

    public boolean g() {
        return false;
    }
}
