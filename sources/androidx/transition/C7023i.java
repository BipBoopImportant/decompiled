package androidx.transition;

import android.view.ViewGroup;

/* renamed from: androidx.transition.i  reason: case insensitive filesystem */
public class C7023i {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f44676a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f44677b;

    public static C7023i b(ViewGroup viewGroup) {
        return (C7023i) viewGroup.getTag(C7021g.f44672c);
    }

    static void c(ViewGroup viewGroup, C7023i iVar) {
        viewGroup.setTag(C7021g.f44672c, iVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f44676a) == this && (runnable = this.f44677b) != null) {
            runnable.run();
        }
    }
}
