package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

/* renamed from: QE.x  reason: case insensitive filesystem */
public final class C13446x implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114743a;

    /* renamed from: b  reason: collision with root package name */
    public final C13427d f114744b;

    /* renamed from: c  reason: collision with root package name */
    public final FloatingActionButton f114745c;

    /* renamed from: d  reason: collision with root package name */
    public final BouncingBallView f114746d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f114747e;

    private C13446x(ConstraintLayout constraintLayout, C13427d dVar, FloatingActionButton floatingActionButton, BouncingBallView bouncingBallView, RecyclerView recyclerView) {
        this.f114743a = constraintLayout;
        this.f114744b = dVar;
        this.f114745c = floatingActionButton;
        this.f114746d = bouncingBallView;
        this.f114747e = recyclerView;
    }

    public static C13446x a(View view) {
        int i10 = C13317i.f113010f;
        View a10 = b.a(view, i10);
        if (a10 != null) {
            C13427d a11 = C13427d.a(a10);
            i10 = C13317i.f112925L;
            FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
            if (floatingActionButton != null) {
                i10 = C13317i.f113041l0;
                BouncingBallView bouncingBallView = (BouncingBallView) b.a(view, i10);
                if (bouncingBallView != null) {
                    i10 = C13317i.f112971W1;
                    RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
                    if (recyclerView != null) {
                        return new C13446x((ConstraintLayout) view, a11, floatingActionButton, bouncingBallView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13446x c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113155v, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114743a;
    }
}
