package Qe;

import Ge.l;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.app.uicomponents.view.ClearableEditText;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f63084a;

    /* renamed from: b  reason: collision with root package name */
    public final ClearableEditText f63085b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f63086c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f63087d;

    /* renamed from: e  reason: collision with root package name */
    public final View f63088e;

    private d(ConstraintLayout constraintLayout, ClearableEditText clearableEditText, RecyclerView recyclerView, ImageView imageView, View view) {
        this.f63084a = constraintLayout;
        this.f63085b = clearableEditText;
        this.f63086c = recyclerView;
        this.f63087d = imageView;
        this.f63088e = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = Ge.k.f60625i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Qe.d a(android.view.View r8) {
        /*
            int r0 = Ge.k.f60619c
            android.view.View r1 = X4.b.a(r8, r0)
            r4 = r1
            com.ingka.ikea.app.uicomponents.view.ClearableEditText r4 = (com.ingka.ikea.app.uicomponents.view.ClearableEditText) r4
            if (r4 == 0) goto L_0x0033
            int r0 = Ge.k.f60621e
            android.view.View r1 = X4.b.a(r8, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0033
            int r0 = Ge.k.f60622f
            android.view.View r1 = X4.b.a(r8, r0)
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0033
            int r0 = Ge.k.f60625i
            android.view.View r7 = X4.b.a(r8, r0)
            if (r7 == 0) goto L_0x0033
            Qe.d r0 = new Qe.d
            r3 = r8
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0033:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Qe.d.a(android.view.View):Qe.d");
    }

    public static d c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static d d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(l.f60635d, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f63084a;
    }
}
