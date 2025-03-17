package z;

import C.C4397h0;
import android.graphics.PointF;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.impl.R0;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final R0 f32324a;

    public l(R0 r02) {
        this.f32324a = r02;
    }

    public PointF a(C4397h0 h0Var, int i10) {
        return (i10 != 1 || !this.f32324a.a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(h0Var.c(), h0Var.d()) : new PointF(1.0f - h0Var.c(), h0Var.d());
    }
}
