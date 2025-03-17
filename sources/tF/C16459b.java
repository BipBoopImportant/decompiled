package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

/* renamed from: TF.b  reason: case insensitive filesystem */
public final class C16459b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138389a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f138390b;

    /* renamed from: c  reason: collision with root package name */
    public final BouncingBallView f138391c;

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f138392d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f138393e;

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f138394f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f138395g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageButton f138396h;

    private C16459b(ConstraintLayout constraintLayout, RecyclerView recyclerView, BouncingBallView bouncingBallView, ConstraintLayout constraintLayout2, TextView textView, RecyclerView recyclerView2, LinearLayout linearLayout, ImageButton imageButton) {
        this.f138389a = constraintLayout;
        this.f138390b = recyclerView;
        this.f138391c = bouncingBallView;
        this.f138392d = constraintLayout2;
        this.f138393e = textView;
        this.f138394f = recyclerView2;
        this.f138395g = linearLayout;
        this.f138396h = imageButton;
    }

    public static C16459b a(View view) {
        int i10 = C16401b.f138126e;
        RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
        if (recyclerView != null) {
            i10 = C16401b.f138129f;
            BouncingBallView bouncingBallView = (BouncingBallView) b.a(view, i10);
            if (bouncingBallView != null) {
                i10 = C16401b.f138132g;
                ConstraintLayout constraintLayout = (ConstraintLayout) b.a(view, i10);
                if (constraintLayout != null) {
                    i10 = C16401b.f138135h;
                    TextView textView = (TextView) b.a(view, i10);
                    if (textView != null) {
                        i10 = C16401b.f138183x;
                        RecyclerView recyclerView2 = (RecyclerView) b.a(view, i10);
                        if (recyclerView2 != null) {
                            i10 = C16401b.f138076H;
                            LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
                            if (linearLayout != null) {
                                i10 = C16401b.f138078I;
                                ImageButton imageButton = (ImageButton) b.a(view, i10);
                                if (imageButton != null) {
                                    return new C16459b((ConstraintLayout) view, recyclerView, bouncingBallView, constraintLayout, textView, recyclerView2, linearLayout, imageButton);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138389a;
    }
}
