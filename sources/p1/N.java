package p1;

import android.graphics.Bitmap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00138VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lp1/N;", "Lp1/J0;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "LXH/N;", "a", "()V", "b", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "", "getWidth", "()I", "width", "getHeight", "height", "Lp1/K0;", "config", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class N implements J0 {

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f27224b;

    public N(Bitmap bitmap) {
        this.f27224b = bitmap;
    }

    public void a() {
        this.f27224b.prepareToDraw();
    }

    public int b() {
        return O.e(this.f27224b.getConfig());
    }

    public final Bitmap c() {
        return this.f27224b;
    }

    public int getHeight() {
        return this.f27224b.getHeight();
    }

    public int getWidth() {
        return this.f27224b.getWidth();
    }
}
