package n0;

import android.content.Context;
import android.widget.EdgeEffect;
import c2.C5266a;
import c2.h;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Ln0/E;", "Landroid/widget/EdgeEffect;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "deltaDistance", "displacement", "LXH/N;", "onPull", "(FF)V", "(F)V", "onRelease", "()V", "", "velocity", "onAbsorb", "(I)V", "delta", "a", "F", "oppositeReleaseDeltaThreshold", "b", "oppositeReleaseDelta", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.E  reason: case insensitive filesystem */
final class C5582E extends EdgeEffect {

    /* renamed from: a  reason: collision with root package name */
    private final float f26317a;

    /* renamed from: b  reason: collision with root package name */
    private float f26318b;

    public C5582E(Context context) {
        super(context);
        this.f26317a = C5266a.a(context).H1(h.B((float) 1));
    }

    public final void a(float f10) {
        float f11 = this.f26318b + f10;
        this.f26318b = f11;
        if (Math.abs(f11) > this.f26317a) {
            onRelease();
        }
    }

    public void onAbsorb(int i10) {
        this.f26318b = 0.0f;
        super.onAbsorb(i10);
    }

    public void onPull(float f10, float f11) {
        this.f26318b = 0.0f;
        super.onPull(f10, f11);
    }

    public void onRelease() {
        this.f26318b = 0.0f;
        super.onRelease();
    }

    public void onPull(float f10) {
        this.f26318b = 0.0f;
        super.onPull(f10);
    }
}
