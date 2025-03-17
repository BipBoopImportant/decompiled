package h5;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import d5.C7744b;
import f5.C7847c;
import f5.C7848d;
import f5.k;
import f5.l;
import f5.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lh5/f;", "", "<init>", "()V", "Lf5/l;", "windowMetrics", "Ld5/b;", "bounds", "", "d", "(Lf5/l;Ld5/b;)Z", "Landroidx/window/extensions/layout/FoldingFeature;", "oemFeature", "Lf5/c;", "a", "(Lf5/l;Landroidx/window/extensions/layout/FoldingFeature;)Lf5/c;", "Landroid/content/Context;", "context", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "info", "Lf5/k;", "b", "(Landroid/content/Context;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lf5/k;", "c", "(Lf5/l;Landroidx/window/extensions/layout/WindowLayoutInfo;)Lf5/k;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h5.f  reason: case insensitive filesystem */
public final class C7931f {

    /* renamed from: a  reason: collision with root package name */
    public static final C7931f f51649a = new C7931f();

    private C7931f() {
    }

    private final boolean d(l lVar, C7744b bVar) {
        Rect a10 = lVar.a();
        if (bVar.e()) {
            return false;
        }
        if (bVar.d() != a10.width() && bVar.a() != a10.height()) {
            return false;
        }
        if (bVar.d() >= a10.width() || bVar.a() >= a10.height()) {
            return (bVar.d() == a10.width() && bVar.a() == a10.height()) ? false : true;
        }
        return false;
    }

    public final C7847c a(l lVar, FoldingFeature foldingFeature) {
        C7848d.b bVar;
        C7847c.C0840c cVar;
        C17542s.j(lVar, "windowMetrics");
        C17542s.j(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = C7848d.b.f51129b.a();
        } else if (type != 2) {
            return null;
        } else {
            bVar = C7848d.b.f51129b.b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            cVar = C7847c.C0840c.f51122c;
        } else if (state != 2) {
            return null;
        } else {
            cVar = C7847c.C0840c.f51123d;
        }
        Rect bounds = foldingFeature.getBounds();
        C17542s.i(bounds, "oemFeature.bounds");
        if (!d(lVar, new C7744b(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        C17542s.i(bounds2, "oemFeature.bounds");
        return new C7848d(new C7744b(bounds2), bVar, cVar);
    }

    public final k b(Context context, WindowLayoutInfo windowLayoutInfo) {
        C17542s.j(context, "context");
        C17542s.j(windowLayoutInfo, "info");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return c(p.f51170b.a(context), windowLayoutInfo);
        }
        if (i10 >= 29 && (context instanceof Activity)) {
            return c(p.f51170b.b((Activity) context), windowLayoutInfo);
        }
        throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
    }

    public final k c(l lVar, WindowLayoutInfo windowLayoutInfo) {
        C7847c cVar;
        C17542s.j(lVar, "windowMetrics");
        C17542s.j(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        C17542s.i(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C7931f fVar = f51649a;
                C17542s.i(foldingFeature, "feature");
                cVar = fVar.a(lVar, foldingFeature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new k(arrayList);
    }
}
