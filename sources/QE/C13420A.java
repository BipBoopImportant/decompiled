package QE;

import OE.C13318j;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

/* renamed from: QE.A  reason: case insensitive filesystem */
public final class C13420A implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f114311a;

    /* renamed from: b  reason: collision with root package name */
    public final C13427d f114312b;

    /* renamed from: c  reason: collision with root package name */
    public final ComposeView f114313c;

    /* renamed from: d  reason: collision with root package name */
    public final ScrollView f114314d;

    /* renamed from: e  reason: collision with root package name */
    public final Z f114315e;

    /* renamed from: f  reason: collision with root package name */
    public final BouncingBallView f114316f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f114317g;

    /* renamed from: h  reason: collision with root package name */
    public final ConstraintLayout f114318h;

    /* renamed from: i  reason: collision with root package name */
    public final MaterialButton f114319i;

    /* renamed from: j  reason: collision with root package name */
    public final MaterialButton f114320j;

    private C13420A(LinearLayout linearLayout, C13427d dVar, ComposeView composeView, ScrollView scrollView, Z z10, BouncingBallView bouncingBallView, TextView textView, ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f114311a = linearLayout;
        this.f114312b = dVar;
        this.f114313c = composeView;
        this.f114314d = scrollView;
        this.f114315e = z10;
        this.f114316f = bouncingBallView;
        this.f114317g = textView;
        this.f114318h = constraintLayout;
        this.f114319i = materialButton;
        this.f114320j = materialButton2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r0 = OE.C13317i.f113027i1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static QE.C13420A a(android.view.View r13) {
        /*
            int r0 = OE.C13317i.f113010f
            android.view.View r1 = X4.b.a(r13, r0)
            if (r1 == 0) goto L_0x006f
            QE.d r4 = QE.C13427d.a(r1)
            int r0 = OE.C13317i.f112901F
            android.view.View r1 = X4.b.a(r13, r0)
            r5 = r1
            androidx.compose.ui.platform.ComposeView r5 = (androidx.compose.ui.platform.ComposeView) r5
            if (r5 == 0) goto L_0x006f
            int r0 = OE.C13317i.f113051n0
            android.view.View r1 = X4.b.a(r13, r0)
            r6 = r1
            android.widget.ScrollView r6 = (android.widget.ScrollView) r6
            if (r6 == 0) goto L_0x006f
            int r0 = OE.C13317i.f113027i1
            android.view.View r1 = X4.b.a(r13, r0)
            if (r1 == 0) goto L_0x006f
            QE.Z r7 = QE.Z.a(r1)
            int r0 = OE.C13317i.f113032j1
            android.view.View r1 = X4.b.a(r13, r0)
            r8 = r1
            com.sugarcube.app.base.ui.utils.BouncingBallView r8 = (com.sugarcube.app.base.ui.utils.BouncingBallView) r8
            if (r8 == 0) goto L_0x006f
            int r0 = OE.C13317i.f113057o1
            android.view.View r1 = X4.b.a(r13, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x006f
            int r0 = OE.C13317i.f113062p1
            android.view.View r1 = X4.b.a(r13, r0)
            r10 = r1
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            if (r10 == 0) goto L_0x006f
            int r0 = OE.C13317i.f113067q1
            android.view.View r1 = X4.b.a(r13, r0)
            r11 = r1
            com.google.android.material.button.MaterialButton r11 = (com.google.android.material.button.MaterialButton) r11
            if (r11 == 0) goto L_0x006f
            int r0 = OE.C13317i.f113071r1
            android.view.View r1 = X4.b.a(r13, r0)
            r12 = r1
            com.google.android.material.button.MaterialButton r12 = (com.google.android.material.button.MaterialButton) r12
            if (r12 == 0) goto L_0x006f
            QE.A r0 = new QE.A
            r3 = r13
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006f:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QE.C13420A.a(android.view.View):QE.A");
    }

    public static C13420A c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113158y, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f114311a;
    }
}
