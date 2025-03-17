package p1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lp1/W;", "Lp1/X0;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "", "startDistance", "stopDistance", "Lp1/U0;", "destination", "", "startWithMoveTo", "a", "(FFLp1/U0;Z)Z", "path", "forceClosed", "LXH/N;", "b", "(Lp1/U0;Z)V", "Landroid/graphics/PathMeasure;", "getLength", "()F", "length", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class W implements X0 {

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f27256a;

    public W(PathMeasure pathMeasure) {
        this.f27256a = pathMeasure;
    }

    public boolean a(float f10, float f11, U0 u02, boolean z10) {
        PathMeasure pathMeasure = this.f27256a;
        if (u02 instanceof T) {
            return pathMeasure.getSegment(f10, f11, ((T) u02).w(), z10);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void b(U0 u02, boolean z10) {
        Path path;
        PathMeasure pathMeasure = this.f27256a;
        if (u02 == null) {
            path = null;
        } else if (u02 instanceof T) {
            path = ((T) u02).w();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(path, z10);
    }

    public float getLength() {
        return this.f27256a.getLength();
    }
}
