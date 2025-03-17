package Fz;

import Ez.c;
import Ez.d;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: Fz.b  reason: case insensitive filesystem */
public final class C12912b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110067a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialButton f110068b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f110069c;

    /* renamed from: d  reason: collision with root package name */
    public final CoordinatorLayout f110070d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f110071e;

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f110072f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f110073g;

    private C12912b(ConstraintLayout constraintLayout, MaterialButton materialButton, Button button, CoordinatorLayout coordinatorLayout, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        this.f110067a = constraintLayout;
        this.f110068b = materialButton;
        this.f110069c = button;
        this.f110070d = coordinatorLayout;
        this.f110071e = imageView;
        this.f110072f = recyclerView;
        this.f110073g = textView;
    }

    public static C12912b a(View view) {
        int i10 = c.f109523L;
        MaterialButton materialButton = (MaterialButton) b.a(view, i10);
        if (materialButton != null) {
            i10 = c.f109527N;
            Button button = (Button) b.a(view, i10);
            if (button != null) {
                i10 = c.f109554a0;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) b.a(view, i10);
                if (coordinatorLayout != null) {
                    i10 = c.f109617v0;
                    ImageView imageView = (ImageView) b.a(view, i10);
                    if (imageView != null) {
                        i10 = c.f109564d1;
                        RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
                        if (recyclerView != null) {
                            i10 = c.f109603q1;
                            TextView textView = (TextView) b.a(view, i10);
                            if (textView != null) {
                                return new C12912b((ConstraintLayout) view, materialButton, button, coordinatorLayout, imageView, recyclerView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C12912b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109634b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110067a;
    }
}
