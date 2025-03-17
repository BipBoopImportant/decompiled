package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

/* renamed from: TF.k  reason: case insensitive filesystem */
public final class C16468k implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138434a;

    /* renamed from: b  reason: collision with root package name */
    public final C16464g f138435b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageButton f138436c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f138437d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f138438e;

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f138439f;

    /* renamed from: g  reason: collision with root package name */
    public final BouncingBallView f138440g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f138441h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f138442i;

    private C16468k(ConstraintLayout constraintLayout, C16464g gVar, ImageButton imageButton, TextView textView, RecyclerView recyclerView, RecyclerView recyclerView2, BouncingBallView bouncingBallView, TextView textView2, TextView textView3) {
        this.f138434a = constraintLayout;
        this.f138435b = gVar;
        this.f138436c = imageButton;
        this.f138437d = textView;
        this.f138438e = recyclerView;
        this.f138439f = recyclerView2;
        this.f138440g = bouncingBallView;
        this.f138441h = textView2;
        this.f138442i = textView3;
    }

    public static C16468k a(View view) {
        int i10 = C16401b.f138139i0;
        View a10 = b.a(view, i10);
        if (a10 != null) {
            C16464g a11 = C16464g.a(a10);
            i10 = C16401b.f138119b1;
            ImageButton imageButton = (ImageButton) b.a(view, i10);
            if (imageButton != null) {
                i10 = C16401b.f138122c1;
                TextView textView = (TextView) b.a(view, i10);
                if (textView != null) {
                    i10 = C16401b.f138125d1;
                    RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
                    if (recyclerView != null) {
                        i10 = C16401b.f138128e1;
                        RecyclerView recyclerView2 = (RecyclerView) b.a(view, i10);
                        if (recyclerView2 != null) {
                            i10 = C16401b.f138131f1;
                            BouncingBallView bouncingBallView = (BouncingBallView) b.a(view, i10);
                            if (bouncingBallView != null) {
                                i10 = C16401b.f138134g1;
                                TextView textView2 = (TextView) b.a(view, i10);
                                if (textView2 != null) {
                                    i10 = C16401b.f138137h1;
                                    TextView textView3 = (TextView) b.a(view, i10);
                                    if (textView3 != null) {
                                        return new C16468k((ConstraintLayout) view, a11, imageButton, textView, recyclerView, recyclerView2, bouncingBallView, textView2, textView3);
                                    }
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
        return this.f138434a;
    }
}
