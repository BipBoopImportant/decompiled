package ZF;

import RF.i;
import RF.k;
import android.view.MotionEvent;
import com.sugarcube.app.base.data.analytics.ProductParentType;
import com.sugarcube.decorate.internal.shared.IDecorateEngine;
import com.sugarcube.decorate.v1.internal.v1.b;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8@X\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010&\u0001\u0004()*+¨\u0006,"}, d2 = {"LZF/S0;", "", "LZF/V0;", "scheme", "<init>", "(LZF/V0;)V", "Landroid/view/MotionEvent$PointerCoords;", "pos", "", "h", "(Landroid/view/MotionEvent$PointerCoords;)Z", "i", "()Z", "f", "g", "LXH/N;", "e", "()V", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "startXF", "j", "(Lcom/sugarcube/decorate_engine/ModelScreenTransform;)V", "LRF/k;", "k", "(Landroid/view/MotionEvent$PointerCoords;)LRF/k;", "a", "LZF/V0;", "b", "()LZF/V0;", "LZF/W0;", "c", "()LZF/W0;", "touchState", "Lcom/sugarcube/decorate/v1/internal/v1/b;", "d", "()Lcom/sugarcube/decorate/v1/internal/v1/b;", "viewModel", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "()Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "engine", "LZF/K0;", "LZF/L0;", "LZF/M0;", "LZF/R0;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZF.S0  reason: case insensitive filesystem */
public abstract class C16930S0 {

    /* renamed from: a  reason: collision with root package name */
    private final C16936V0 f140577a;

    public /* synthetic */ C16930S0(C16936V0 v02, DefaultConstructorMarker defaultConstructorMarker) {
        this(v02);
    }

    public final IDecorateEngine a() {
        return this.f140577a.d();
    }

    public final C16936V0 b() {
        return this.f140577a;
    }

    public final C16938W0 c() {
        return this.f140577a.h();
    }

    public final b d() {
        return this.f140577a.c();
    }

    public void e() {
    }

    public boolean f() {
        return true;
    }

    public boolean g() {
        if (c().k() == 1) {
            return h(c().l()[0]);
        }
        return true;
    }

    public boolean h(MotionEvent.PointerCoords pointerCoords) {
        C17542s.j(pointerCoords, "pos");
        return true;
    }

    public boolean i() {
        return false;
    }

    public final void j(ModelScreenTransform modelScreenTransform) {
        C17542s.j(modelScreenTransform, "startXF");
        k H02 = d().H0();
        if (H02 != null) {
            ModelScreenTransform modelScreenTransform2 = a().getModelScreenTransform(H02.f());
            ProductParentType n10 = i.n(a(), H02.f());
            C16942a f10 = this.f140577a.f();
            if (f10 != null) {
                f10.L(H02, modelScreenTransform, modelScreenTransform2, false, n10, d().l0().getValue(), d().d0());
            }
        }
    }

    public final k k(MotionEvent.PointerCoords pointerCoords) {
        C17542s.j(pointerCoords, "pos");
        ObjectInstanceId a10 = IDecorateEngine.a.a(a(), pointerCoords.x, pointerCoords.y, false, 4, (Object) null);
        if (d().w0().keySet().contains(a10)) {
            return d().w0().get(a10);
        }
        return null;
    }

    private C16930S0(C16936V0 v02) {
        this.f140577a = v02;
    }
}
