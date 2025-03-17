package TF;

import SF.C16401b;
import SF.C16402c;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: TF.w  reason: case insensitive filesystem */
public final class C16480w implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138480a;

    /* renamed from: b  reason: collision with root package name */
    public final C16458a f138481b;

    /* renamed from: c  reason: collision with root package name */
    public final C16461d f138482c;

    /* renamed from: d  reason: collision with root package name */
    public final C16459b f138483d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f138484e;

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f138485f;

    /* renamed from: g  reason: collision with root package name */
    public final C16461d f138486g;

    /* renamed from: h  reason: collision with root package name */
    public final C16468k f138487h;

    /* renamed from: i  reason: collision with root package name */
    public final C16467j f138488i;

    /* renamed from: j  reason: collision with root package name */
    public final C16465h f138489j;

    private C16480w(ConstraintLayout constraintLayout, C16458a aVar, C16461d dVar, C16459b bVar, ImageView imageView, ConstraintLayout constraintLayout2, C16461d dVar2, C16468k kVar, C16467j jVar, C16465h hVar) {
        this.f138480a = constraintLayout;
        this.f138481b = aVar;
        this.f138482c = dVar;
        this.f138483d = bVar;
        this.f138484e = imageView;
        this.f138485f = constraintLayout2;
        this.f138486g = dVar2;
        this.f138487h = kVar;
        this.f138488i = jVar;
        this.f138489j = hVar;
    }

    public static C16480w a(View view) {
        int i10 = C16401b.f138120c;
        View a10 = b.a(view, i10);
        if (a10 != null) {
            C16458a a11 = C16458a.a(a10);
            i10 = C16401b.f138123d;
            View a12 = b.a(view, i10);
            if (a12 != null) {
                C16461d a13 = C16461d.a(a12);
                i10 = C16401b.f138141j;
                View a14 = b.a(view, i10);
                if (a14 != null) {
                    C16459b a15 = C16459b.a(a14);
                    i10 = C16401b.f138147l;
                    ImageView imageView = (ImageView) b.a(view, i10);
                    if (imageView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i10 = C16401b.f138162q;
                        View a16 = b.a(view, i10);
                        if (a16 != null) {
                            C16461d a17 = C16461d.a(a16);
                            i10 = C16401b.f138174u;
                            View a18 = b.a(view, i10);
                            if (a18 != null) {
                                C16468k a19 = C16468k.a(a18);
                                i10 = C16401b.f138177v;
                                View a20 = b.a(view, i10);
                                if (a20 != null) {
                                    C16467j a21 = C16467j.a(a20);
                                    i10 = C16401b.f138142j0;
                                    View a22 = b.a(view, i10);
                                    if (a22 != null) {
                                        return new C16480w(constraintLayout, a11, a13, a15, imageView, constraintLayout, a17, a19, a21, C16465h.a(a22));
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

    public static C16480w c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C16402c.f138200i, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138480a;
    }
}
