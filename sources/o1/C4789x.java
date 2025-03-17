package O1;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LO1/x;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "rect", "", "c", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z", "Landroid/graphics/Path;", "path", "b", "(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z", "", "left", "top", "right", "bottom", "a", "(Landroid/graphics/Canvas;FFFF)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O1.x  reason: case insensitive filesystem */
final class C4789x {

    /* renamed from: a  reason: collision with root package name */
    public static final C4789x f11762a = new C4789x();

    private C4789x() {
    }

    public final boolean a(Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.quickReject(f10, f11, f12, f13);
    }

    public final boolean b(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public final boolean c(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
