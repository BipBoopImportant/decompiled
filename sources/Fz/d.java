package Fz;

import Ez.c;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110078a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialButton f110079b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f110080c;

    /* renamed from: d  reason: collision with root package name */
    public final ComposeView f110081d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f110082e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f110083f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f110084g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f110085h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f110086i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f110087j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f110088k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f110089l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f110090m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f110091n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f110092o;

    private d(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, ComposeView composeView, TextView textView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, TextView textView5, TextView textView6, ImageView imageView2, ImageView imageView3, TextView textView7, TextView textView8) {
        this.f110078a = constraintLayout;
        this.f110079b = materialButton;
        this.f110080c = constraintLayout2;
        this.f110081d = composeView;
        this.f110082e = textView;
        this.f110083f = textView2;
        this.f110084g = textView3;
        this.f110085h = imageView;
        this.f110086i = textView4;
        this.f110087j = textView5;
        this.f110088k = textView6;
        this.f110089l = imageView2;
        this.f110090m = imageView3;
        this.f110091n = textView7;
        this.f110092o = textView8;
    }

    public static d a(View view) {
        View view2 = view;
        int i10 = c.f109559c;
        MaterialButton materialButton = (MaterialButton) b.a(view2, i10);
        if (materialButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
            i10 = c.f109502A0;
            ComposeView composeView = (ComposeView) b.a(view2, i10);
            if (composeView != null) {
                i10 = c.f109526M0;
                TextView textView = (TextView) b.a(view2, i10);
                if (textView != null) {
                    i10 = c.f109528N0;
                    TextView textView2 = (TextView) b.a(view2, i10);
                    if (textView2 != null) {
                        i10 = c.f109530O0;
                        TextView textView3 = (TextView) b.a(view2, i10);
                        if (textView3 != null) {
                            i10 = c.f109534Q0;
                            ImageView imageView = (ImageView) b.a(view2, i10);
                            if (imageView != null) {
                                i10 = c.f109536R0;
                                TextView textView4 = (TextView) b.a(view2, i10);
                                if (textView4 != null) {
                                    i10 = c.f109538S0;
                                    TextView textView5 = (TextView) b.a(view2, i10);
                                    if (textView5 != null) {
                                        i10 = c.f109540T0;
                                        TextView textView6 = (TextView) b.a(view2, i10);
                                        if (textView6 != null) {
                                            i10 = c.f109542U0;
                                            ImageView imageView2 = (ImageView) b.a(view2, i10);
                                            if (imageView2 != null) {
                                                i10 = c.f109544V0;
                                                ImageView imageView3 = (ImageView) b.a(view2, i10);
                                                if (imageView3 != null) {
                                                    i10 = c.f109546W0;
                                                    TextView textView7 = (TextView) b.a(view2, i10);
                                                    if (textView7 != null) {
                                                        i10 = c.f109570f1;
                                                        TextView textView8 = (TextView) b.a(view2, i10);
                                                        if (textView8 != null) {
                                                            return new d(constraintLayout, materialButton, constraintLayout, composeView, textView, textView2, textView3, imageView, textView4, textView5, textView6, imageView2, imageView3, textView7, textView8);
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

    public static d c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(Ez.d.f109636d, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110078a;
    }
}
