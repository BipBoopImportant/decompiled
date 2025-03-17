package xm;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import wm.C12283d;
import wm.C12284e;

/* renamed from: xm.a  reason: case insensitive filesystem */
public final class C12319a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f106058a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f106059b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f106060c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f106061d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f106062e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f106063f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f106064g;

    private C12319a(ScrollView scrollView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, ImageView imageView3) {
        this.f106058a = scrollView;
        this.f106059b = imageView;
        this.f106060c = imageView2;
        this.f106061d = textView;
        this.f106062e = textView2;
        this.f106063f = textView3;
        this.f106064g = imageView3;
    }

    public static C12319a a(View view) {
        int i10 = C12283d.f105871a;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = C12283d.f105872b;
            ImageView imageView2 = (ImageView) b.a(view, i10);
            if (imageView2 != null) {
                i10 = C12283d.f105873c;
                TextView textView = (TextView) b.a(view, i10);
                if (textView != null) {
                    i10 = C12283d.f105874d;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        i10 = C12283d.f105875e;
                        TextView textView3 = (TextView) b.a(view, i10);
                        if (textView3 != null) {
                            i10 = C12283d.f105876f;
                            ImageView imageView3 = (ImageView) b.a(view, i10);
                            if (imageView3 != null) {
                                return new C12319a((ScrollView) view, imageView, imageView2, textView, textView2, textView3, imageView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C12319a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static C12319a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C12284e.f105877a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f106058a;
    }
}
