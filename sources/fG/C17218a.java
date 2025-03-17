package fG;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import eG.C17177b;
import eG.C17178c;

/* renamed from: fG.a  reason: case insensitive filesystem */
public final class C17218a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final View f143138a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f143139b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f143140c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f143141d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f143142e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f143143f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f143144g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f143145h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f143146i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f143147j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f143148k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f143149l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f143150m;

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f143151n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f143152o;

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f143153p;

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f143154q;

    private C17218a(View view, ImageView imageView, ConstraintLayout constraintLayout, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, ImageView imageView3, TextView textView10, ImageView imageView4, ImageView imageView5) {
        this.f143138a = view;
        this.f143139b = imageView;
        this.f143140c = constraintLayout;
        this.f143141d = imageView2;
        this.f143142e = textView;
        this.f143143f = textView2;
        this.f143144g = textView3;
        this.f143145h = textView4;
        this.f143146i = textView5;
        this.f143147j = textView6;
        this.f143148k = textView7;
        this.f143149l = textView8;
        this.f143150m = textView9;
        this.f143151n = imageView3;
        this.f143152o = textView10;
        this.f143153p = imageView4;
        this.f143154q = imageView5;
    }

    public static C17218a a(View view) {
        View view2 = view;
        int i10 = C17177b.f142983a;
        ImageView imageView = (ImageView) b.a(view2, i10);
        if (imageView != null) {
            i10 = C17177b.f142984b;
            ConstraintLayout constraintLayout = (ConstraintLayout) b.a(view2, i10);
            if (constraintLayout != null) {
                i10 = C17177b.f142985c;
                ImageView imageView2 = (ImageView) b.a(view2, i10);
                if (imageView2 != null) {
                    i10 = C17177b.f142986d;
                    TextView textView = (TextView) b.a(view2, i10);
                    if (textView != null) {
                        i10 = C17177b.f142987e;
                        TextView textView2 = (TextView) b.a(view2, i10);
                        if (textView2 != null) {
                            i10 = C17177b.f142988f;
                            TextView textView3 = (TextView) b.a(view2, i10);
                            if (textView3 != null) {
                                i10 = C17177b.f142989g;
                                TextView textView4 = (TextView) b.a(view2, i10);
                                if (textView4 != null) {
                                    i10 = C17177b.f142990h;
                                    TextView textView5 = (TextView) b.a(view2, i10);
                                    if (textView5 != null) {
                                        i10 = C17177b.f142991i;
                                        TextView textView6 = (TextView) b.a(view2, i10);
                                        if (textView6 != null) {
                                            i10 = C17177b.f142992j;
                                            TextView textView7 = (TextView) b.a(view2, i10);
                                            if (textView7 != null) {
                                                i10 = C17177b.f142993k;
                                                TextView textView8 = (TextView) b.a(view2, i10);
                                                if (textView8 != null) {
                                                    i10 = C17177b.f142994l;
                                                    TextView textView9 = (TextView) b.a(view2, i10);
                                                    if (textView9 != null) {
                                                        i10 = C17177b.f142995m;
                                                        ImageView imageView3 = (ImageView) b.a(view2, i10);
                                                        if (imageView3 != null) {
                                                            i10 = C17177b.f142996n;
                                                            TextView textView10 = (TextView) b.a(view2, i10);
                                                            if (textView10 != null) {
                                                                i10 = C17177b.f142997o;
                                                                ImageView imageView4 = (ImageView) b.a(view2, i10);
                                                                if (imageView4 != null) {
                                                                    i10 = C17177b.f142998p;
                                                                    ImageView imageView5 = (ImageView) b.a(view2, i10);
                                                                    if (imageView5 != null) {
                                                                        return new C17218a(view, imageView, constraintLayout, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, imageView3, textView10, imageView4, imageView5);
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

    public static C17218a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17178c.f142999a, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.f143138a;
    }
}
