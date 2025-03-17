package Ga;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: Ga.c  reason: case insensitive filesystem */
public class C9094c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f60570a = false;

    public static void a(C9092a aVar, View view, FrameLayout frameLayout) {
        c(aVar, view, frameLayout);
        if (aVar.i() != null) {
            aVar.i().setForeground(aVar);
        } else if (!f60570a) {
            view.getOverlay().add(aVar);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    public static void b(C9092a aVar, View view) {
        if (aVar != null) {
            if (f60570a || aVar.i() != null) {
                aVar.i().setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(aVar);
            }
        }
    }

    public static void c(C9092a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.Q(view, frameLayout);
    }

    public static void d(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}
