package androidx.camera.video.internal.compat.quirk;

import G.q;
import a0.k0;
import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.N0;
import com.sugarcube.decorate_engine.SceneLayout;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SizeCannotEncodeVideoQuirk implements N0 {
    private static Set<Size> g() {
        return h() ? new HashSet(Collections.singletonList(new Size(720, SceneLayout.kCurrent3DVersion))) : Collections.emptySet();
    }

    private static boolean h() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean j() {
        return h();
    }

    public Rect f(Rect rect, int i10, k0 k0Var) {
        Size q10 = q.q(q.m(rect), i10);
        if (!i(q10)) {
            return rect;
        }
        int c10 = k0Var != null ? k0Var.c() / 2 : 8;
        Rect rect2 = new Rect(rect);
        if (rect.width() == q10.getHeight()) {
            rect2.left += c10;
            rect2.right -= c10;
        } else {
            rect2.top += c10;
            rect2.bottom -= c10;
        }
        return rect2;
    }

    public boolean i(Size size) {
        return g().contains(size);
    }
}
