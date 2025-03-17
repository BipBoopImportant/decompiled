package QE;

import OE.C13318j;
import X4.a;
import android.opengl.GLSurfaceView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;

/* renamed from: QE.c  reason: case insensitive filesystem */
public final class C13426c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114531a;

    /* renamed from: b  reason: collision with root package name */
    public final ComposeView f114532b;

    /* renamed from: c  reason: collision with root package name */
    public final C13440q f114533c;

    /* renamed from: d  reason: collision with root package name */
    public final FragmentContainerView f114534d;

    /* renamed from: e  reason: collision with root package name */
    public final r f114535e;

    /* renamed from: f  reason: collision with root package name */
    public final GLSurfaceView f114536f;

    private C13426c(ConstraintLayout constraintLayout, ComposeView composeView, C13440q qVar, FragmentContainerView fragmentContainerView, r rVar, GLSurfaceView gLSurfaceView) {
        this.f114531a = constraintLayout;
        this.f114532b = composeView;
        this.f114533c = qVar;
        this.f114534d = fragmentContainerView;
        this.f114535e = rVar;
        this.f114536f = gLSurfaceView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = OE.C13317i.f113075s1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r0 = OE.C13317i.f112883A1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static QE.C13426c a(android.view.View r9) {
        /*
            int r0 = OE.C13317i.f112965V
            android.view.View r1 = X4.b.a(r9, r0)
            r4 = r1
            androidx.compose.ui.platform.ComposeView r4 = (androidx.compose.ui.platform.ComposeView) r4
            if (r4 == 0) goto L_0x0043
            int r0 = OE.C13317i.f113075s1
            android.view.View r1 = X4.b.a(r9, r0)
            if (r1 == 0) goto L_0x0043
            QE.q r5 = QE.C13440q.a(r1)
            int r0 = OE.C13317i.f113091w1
            android.view.View r1 = X4.b.a(r9, r0)
            r6 = r1
            androidx.fragment.app.FragmentContainerView r6 = (androidx.fragment.app.FragmentContainerView) r6
            if (r6 == 0) goto L_0x0043
            int r0 = OE.C13317i.f112883A1
            android.view.View r1 = X4.b.a(r9, r0)
            if (r1 == 0) goto L_0x0043
            QE.r r7 = QE.r.a(r1)
            int r0 = OE.C13317i.f113019g3
            android.view.View r1 = X4.b.a(r9, r0)
            r8 = r1
            android.opengl.GLSurfaceView r8 = (android.opengl.GLSurfaceView) r8
            if (r8 == 0) goto L_0x0043
            QE.c r0 = new QE.c
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0043:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QE.C13426c.a(android.view.View):QE.c");
    }

    public static C13426c c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static C13426c d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113135c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114531a;
    }
}
