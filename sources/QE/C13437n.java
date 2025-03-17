package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;

/* renamed from: QE.n  reason: case insensitive filesystem */
public final class C13437n implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114658a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114659b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114660c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f114661d;

    /* renamed from: e  reason: collision with root package name */
    public final ShapeableImageView f114662e;

    /* renamed from: f  reason: collision with root package name */
    public final View f114663f;

    private C13437n(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, TextView textView2, ShapeableImageView shapeableImageView, View view) {
        this.f114658a = constraintLayout;
        this.f114659b = floatingActionButton;
        this.f114660c = textView;
        this.f114661d = textView2;
        this.f114662e = shapeableImageView;
        this.f114663f = view;
    }

    public static C13437n a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            TextView textView = (TextView) b.a(view, C13317i.f113030j);
            TextView textView2 = (TextView) b.a(view, C13317i.f113050n);
            ShapeableImageView shapeableImageView = (ShapeableImageView) b.a(view, C13317i.f112942P0);
            i10 = C13317i.f112999c3;
            View a10 = b.a(view, i10);
            if (a10 != null) {
                return new C13437n((ConstraintLayout) view, floatingActionButton, textView, textView2, shapeableImageView, a10);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13437n c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113148o, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114658a;
    }
}
