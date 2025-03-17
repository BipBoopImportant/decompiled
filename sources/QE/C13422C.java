package QE;

import OE.C13318j;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

/* renamed from: QE.C  reason: case insensitive filesystem */
public final class C13422C implements a {

    /* renamed from: a  reason: collision with root package name */
    private final NestedScrollView f114326a;

    /* renamed from: b  reason: collision with root package name */
    public final ComposeView f114327b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f114328c;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f114329d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f114330e;

    /* renamed from: f  reason: collision with root package name */
    public final BouncingBallView f114331f;

    /* renamed from: g  reason: collision with root package name */
    public final ComposeView f114332g;

    private C13422C(NestedScrollView nestedScrollView, ComposeView composeView, ConstraintLayout constraintLayout, e0 e0Var, ImageView imageView, BouncingBallView bouncingBallView, ComposeView composeView2) {
        this.f114326a = nestedScrollView;
        this.f114327b = composeView;
        this.f114328c = constraintLayout;
        this.f114329d = e0Var;
        this.f114330e = imageView;
        this.f114331f = bouncingBallView;
        this.f114332g = composeView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = OE.C13317i.f113074s0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static QE.C13422C a(android.view.View r10) {
        /*
            int r0 = OE.C13317i.f113066q0
            android.view.View r1 = X4.b.a(r10, r0)
            r4 = r1
            androidx.compose.ui.platform.ComposeView r4 = (androidx.compose.ui.platform.ComposeView) r4
            if (r4 == 0) goto L_0x004d
            int r0 = OE.C13317i.f113070r0
            android.view.View r1 = X4.b.a(r10, r0)
            r5 = r1
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            if (r5 == 0) goto L_0x004d
            int r0 = OE.C13317i.f113074s0
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x004d
            QE.e0 r6 = QE.e0.a(r1)
            int r0 = OE.C13317i.f113078t0
            android.view.View r1 = X4.b.a(r10, r0)
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x004d
            int r0 = OE.C13317i.f113082u0
            android.view.View r1 = X4.b.a(r10, r0)
            r8 = r1
            com.sugarcube.app.base.ui.utils.BouncingBallView r8 = (com.sugarcube.app.base.ui.utils.BouncingBallView) r8
            if (r8 == 0) goto L_0x004d
            int r0 = OE.C13317i.f113022h1
            android.view.View r1 = X4.b.a(r10, r0)
            r9 = r1
            androidx.compose.ui.platform.ComposeView r9 = (androidx.compose.ui.platform.ComposeView) r9
            if (r9 == 0) goto L_0x004d
            QE.C r0 = new QE.C
            r3 = r10
            androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x004d:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QE.C13422C.a(android.view.View):QE.C");
    }

    public static C13422C c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113105A, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f114326a;
    }
}
