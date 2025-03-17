package TF;

import SF.C16401b;
import SF.C16402c;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: TF.A  reason: case insensitive filesystem */
public final class C16457A implements a {

    /* renamed from: a  reason: collision with root package name */
    private final View f138358a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f138359b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f138360c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f138361d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f138362e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f138363f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f138364g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f138365h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f138366i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f138367j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f138368k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f138369l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f138370m;

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f138371n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f138372o;

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f138373p;

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f138374q;

    private C16457A(View view, ImageView imageView, ConstraintLayout constraintLayout, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, ImageView imageView3, TextView textView10, ImageView imageView4, ImageView imageView5) {
        this.f138358a = view;
        this.f138359b = imageView;
        this.f138360c = constraintLayout;
        this.f138361d = imageView2;
        this.f138362e = textView;
        this.f138363f = textView2;
        this.f138364g = textView3;
        this.f138365h = textView4;
        this.f138366i = textView5;
        this.f138367j = textView6;
        this.f138368k = textView7;
        this.f138369l = textView8;
        this.f138370m = textView9;
        this.f138371n = imageView3;
        this.f138372o = textView10;
        this.f138373p = imageView4;
        this.f138374q = imageView5;
    }

    public static C16457A a(View view) {
        View view2 = view;
        int i10 = C16401b.f138114a;
        ImageView imageView = (ImageView) b.a(view2, i10);
        if (imageView != null) {
            i10 = C16401b.f138082K;
            ConstraintLayout constraintLayout = (ConstraintLayout) b.a(view2, i10);
            if (constraintLayout != null) {
                i10 = C16401b.f138166r0;
                ImageView imageView2 = (ImageView) b.a(view2, i10);
                if (imageView2 != null) {
                    i10 = C16401b.f138169s0;
                    TextView textView = (TextView) b.a(view2, i10);
                    if (textView != null) {
                        i10 = C16401b.f138172t0;
                        TextView textView2 = (TextView) b.a(view2, i10);
                        if (textView2 != null) {
                            i10 = C16401b.f138175u0;
                            TextView textView3 = (TextView) b.a(view2, i10);
                            if (textView3 != null) {
                                i10 = C16401b.f138178v0;
                                TextView textView4 = (TextView) b.a(view2, i10);
                                if (textView4 != null) {
                                    i10 = C16401b.f138181w0;
                                    TextView textView5 = (TextView) b.a(view2, i10);
                                    if (textView5 != null) {
                                        i10 = C16401b.f138184x0;
                                        TextView textView6 = (TextView) b.a(view2, i10);
                                        if (textView6 != null) {
                                            i10 = C16401b.f138187y0;
                                            TextView textView7 = (TextView) b.a(view2, i10);
                                            if (textView7 != null) {
                                                i10 = C16401b.f138190z0;
                                                TextView textView8 = (TextView) b.a(view2, i10);
                                                if (textView8 != null) {
                                                    i10 = C16401b.f138063A0;
                                                    TextView textView9 = (TextView) b.a(view2, i10);
                                                    if (textView9 != null) {
                                                        i10 = C16401b.f138065B0;
                                                        ImageView imageView3 = (ImageView) b.a(view2, i10);
                                                        if (imageView3 != null) {
                                                            i10 = C16401b.f138067C0;
                                                            TextView textView10 = (TextView) b.a(view2, i10);
                                                            if (textView10 != null) {
                                                                i10 = C16401b.f138069D0;
                                                                ImageView imageView4 = (ImageView) b.a(view2, i10);
                                                                if (imageView4 != null) {
                                                                    i10 = C16401b.f138182w1;
                                                                    ImageView imageView5 = (ImageView) b.a(view2, i10);
                                                                    if (imageView5 != null) {
                                                                        return new C16457A(view, imageView, constraintLayout, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, imageView3, textView10, imageView4, imageView5);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static C16457A b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C16402c.f138202k, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.f138358a;
    }
}
