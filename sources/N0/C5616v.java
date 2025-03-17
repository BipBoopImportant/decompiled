package n0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0018\u001a\u00020\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln0/v;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/widget/EdgeEffect;", "a", "(Landroid/content/Context;)Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "d", "(Landroid/widget/EdgeEffect;FF)F", "", "velocity", "LXH/N;", "c", "(Landroid/widget/EdgeEffect;I)V", "delta", "e", "(Landroid/widget/EdgeEffect;F)V", "b", "(Landroid/widget/EdgeEffect;)F", "distanceCompat", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.v  reason: case insensitive filesystem */
public final class C5616v {

    /* renamed from: a  reason: collision with root package name */
    public static final C5616v f26472a = new C5616v();

    private C5616v() {
    }

    public final EdgeEffect a(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? C5597c.f26425a.a(context, (AttributeSet) null) : new C5582E(context);
    }

    public final float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C5597c.f26425a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(EdgeEffect edgeEffect, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i10);
        }
    }

    public final float d(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C5597c.f26425a.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    public final void e(EdgeEffect edgeEffect, float f10) {
        if (edgeEffect instanceof C5582E) {
            ((C5582E) edgeEffect).a(f10);
        } else {
            edgeEffect.onRelease();
        }
    }
}
