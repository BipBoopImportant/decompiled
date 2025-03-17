package s1;

import android.graphics.Outline;
import kotlin.Metadata;
import p1.T;
import p1.U0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls1/K;", "", "<init>", "()V", "Landroid/graphics/Outline;", "outline", "Lp1/U0;", "path", "LXH/N;", "a", "(Landroid/graphics/Outline;Lp1/U0;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s1.K  reason: case insensitive filesystem */
public final class C5891K {

    /* renamed from: a  reason: collision with root package name */
    public static final C5891K f28927a = new C5891K();

    private C5891K() {
    }

    public final void a(Outline outline, U0 u02) {
        if (u02 instanceof T) {
            outline.setPath(((T) u02).w());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
