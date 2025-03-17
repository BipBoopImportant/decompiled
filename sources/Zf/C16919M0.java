package ZF;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LZF/M0;", "LZF/S0;", "LZF/V0;", "scheme", "<init>", "(LZF/V0;)V", "Landroid/view/MotionEvent$PointerCoords;", "pos", "", "h", "(Landroid/view/MotionEvent$PointerCoords;)Z", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZF.M0  reason: case insensitive filesystem */
public final class C16919M0 extends C16930S0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16919M0(C16936V0 v02) {
        super(v02, (DefaultConstructorMarker) null);
        C17542s.j(v02, "scheme");
    }

    public boolean h(MotionEvent.PointerCoords pointerCoords) {
        C17542s.j(pointerCoords, "pos");
        if (c().k() == 1) {
            if (!b().o()) {
                c().G(k(c().l()[0]));
            } else {
                c().D(a().eraserPick(pointerCoords.x, pointerCoords.y));
            }
        }
        return false;
    }
}
