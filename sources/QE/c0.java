package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;

public final class c0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CardView f114537a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f114538b;

    /* renamed from: c  reason: collision with root package name */
    public final j0 f114539c;

    /* renamed from: d  reason: collision with root package name */
    public final k0 f114540d;

    /* renamed from: e  reason: collision with root package name */
    public final l0 f114541e;

    /* renamed from: f  reason: collision with root package name */
    public final m0 f114542f;

    /* renamed from: g  reason: collision with root package name */
    public final o0 f114543g;

    /* renamed from: h  reason: collision with root package name */
    public final p0 f114544h;

    /* renamed from: i  reason: collision with root package name */
    public final n0 f114545i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f114546j;

    /* renamed from: k  reason: collision with root package name */
    public final ImageButton f114547k;

    private c0(CardView cardView, i0 i0Var, j0 j0Var, k0 k0Var, l0 l0Var, m0 m0Var, o0 o0Var, p0 p0Var, n0 n0Var, ImageView imageView, ImageButton imageButton) {
        this.f114537a = cardView;
        this.f114538b = i0Var;
        this.f114539c = j0Var;
        this.f114540d = k0Var;
        this.f114541e = l0Var;
        this.f114542f = m0Var;
        this.f114543g = o0Var;
        this.f114544h = p0Var;
        this.f114545i = n0Var;
        this.f114546j = imageView;
        this.f114547k = imageButton;
    }

    public static c0 a(View view) {
        int i10 = C13317i.f113081u;
        View a10 = b.a(view, i10);
        if (a10 != null) {
            i0 a11 = i0.a(a10);
            i10 = C13317i.f113085v;
            View a12 = b.a(view, i10);
            if (a12 != null) {
                j0 a13 = j0.a(a12);
                i10 = C13317i.f113089w;
                View a14 = b.a(view, i10);
                if (a14 != null) {
                    k0 a15 = k0.a(a14);
                    i10 = C13317i.f113093x;
                    View a16 = b.a(view, i10);
                    if (a16 != null) {
                        l0 a17 = l0.a(a16);
                        i10 = C13317i.f113097y;
                        View a18 = b.a(view, i10);
                        if (a18 != null) {
                            m0 a19 = m0.a(a18);
                            i10 = C13317i.f113101z;
                            View a20 = b.a(view, i10);
                            if (a20 != null) {
                                o0 a21 = o0.a(a20);
                                i10 = C13317i.f112881A;
                                View a22 = b.a(view, i10);
                                if (a22 != null) {
                                    p0 a23 = p0.a(a22);
                                    i10 = C13317i.f112885B;
                                    View a24 = b.a(view, i10);
                                    if (a24 != null) {
                                        n0 a25 = n0.a(a24);
                                        i10 = C13317i.f112930M0;
                                        ImageView imageView = (ImageView) b.a(view, i10);
                                        if (imageView != null) {
                                            i10 = C13317i.f112948Q2;
                                            ImageButton imageButton = (ImageButton) b.a(view, i10);
                                            if (imageButton != null) {
                                                return new c0((CardView) view, a11, a13, a15, a17, a19, a21, a23, a25, imageView, imageButton);
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

    public static c0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113129Y, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public CardView getRoot() {
        return this.f114537a;
    }
}
