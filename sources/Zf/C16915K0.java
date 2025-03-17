package ZF;

import RF.k;
import android.view.MotionEvent;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LZF/K0;", "LZF/S0;", "LZF/V0;", "scheme", "<init>", "(LZF/V0;)V", "LXH/N;", "e", "()V", "", "f", "()Z", "g", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "b", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "startXF", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZF.K0  reason: case insensitive filesystem */
public final class C16915K0 extends C16930S0 {

    /* renamed from: b  reason: collision with root package name */
    private final ModelScreenTransform f140555b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r2 = a().getModelScreenTransform(r2.f());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16915K0(ZF.C16936V0 r2) {
        /*
            r1 = this;
            java.lang.String r0 = "scheme"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 0
            r1.<init>(r2, r0)
            ZF.W0 r2 = r1.c()
            r2.x()
            com.sugarcube.decorate.v1.internal.v1.b r2 = r1.d()
            RF.k r2 = r2.H0()
            if (r2 == 0) goto L_0x0028
            com.sugarcube.decorate.internal.shared.IDecorateEngine r0 = r1.a()
            com.sugarcube.decorate_engine.ObjectInstanceId r2 = r2.f()
            com.sugarcube.decorate_engine.ModelScreenTransform r2 = r0.getModelScreenTransform(r2)
            if (r2 != 0) goto L_0x002d
        L_0x0028:
            com.sugarcube.decorate_engine.ModelScreenTransform r2 = new com.sugarcube.decorate_engine.ModelScreenTransform
            r2.<init>()
        L_0x002d:
            r1.f140555b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ZF.C16915K0.<init>(ZF.V0):void");
    }

    public void e() {
        j(this.f140555b);
    }

    public boolean f() {
        k H02;
        MotionEvent.PointerCoords pointerCoords = c().m()[0];
        MotionEvent.PointerCoords pointerCoords2 = c().l()[0];
        if (C16938W0.f140600q.e(pointerCoords, pointerCoords2) < c().g() || (H02 = d().H0()) == null) {
            return false;
        }
        ModelScreenTransform modelScreenTransform = this.f140555b;
        b().e().onMove(H02, modelScreenTransform.screenX + (pointerCoords2.x - pointerCoords.x), modelScreenTransform.screenY + (pointerCoords2.y - pointerCoords.y));
        return true;
    }

    public boolean g() {
        return false;
    }
}
