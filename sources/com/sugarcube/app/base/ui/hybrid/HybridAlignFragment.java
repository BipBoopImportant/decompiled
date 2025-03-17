package com.sugarcube.app.base.ui.hybrid;

import QE.C13423D;
import XH.C16807N;
import XH.v;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5191t;
import androidx.navigation.fragment.a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.navigation.Kreativ;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import q3.E;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridAlignFragment;", "Lcom/sugarcube/app/base/ui/hybrid/HybridFragment;", "<init>", "()V", "", "width", "height", "D0", "(II)I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LXH/N;", "onResume", "onStop", "Lq3/E;", "P", "Lq3/E;", "player", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridAlignFragment extends Hilt_HybridAlignFragment {

    /* renamed from: P  reason: collision with root package name */
    private E f124770P;

    private final int D0(int i10, int i11) {
        WindowManager windowManager;
        Display defaultDisplay;
        WindowManager windowManager2;
        WindowMetrics a10;
        Rect a11;
        v vVar = null;
        if (Build.VERSION.SDK_INT >= 30) {
            C5191t activity = getActivity();
            if (!(activity == null || (windowManager2 = activity.getWindowManager()) == null || (a10 = windowManager2.getCurrentWindowMetrics()) == null || (a11 = a10.getBounds()) == null)) {
                vVar = new v(Integer.valueOf(a11.right - a11.left), Integer.valueOf(a11.bottom - a11.top));
            }
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C5191t activity2 = getActivity();
            if (!(activity2 == null || (windowManager = activity2.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            int i12 = displayMetrics.widthPixels;
            if (i12 > 0 && displayMetrics.heightPixels > 0) {
                vVar = new v(Integer.valueOf(i12), Integer.valueOf(displayMetrics.heightPixels));
            }
        }
        if (vVar == null) {
            return 0;
        }
        int intValue = i10 - ((i11 * ((Number) vVar.a()).intValue()) / ((Number) vVar.b()).intValue());
        if (intValue > 0) {
            return intValue / 2;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final C16807N E0(HybridAlignFragment hybridAlignFragment) {
        E0 u02 = hybridAlignFragment.u0();
        u02.w1().b().captureAlignExit(u02.y1(), u02.r1(), u02.e1(), u02.d1());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void F0(HybridAlignFragment hybridAlignFragment, View view) {
        E0 u02 = hybridAlignFragment.u0();
        u02.w1().b().captureAlignEnd(u02.y1(), u02.r1(), true, u02.e1(), u02.d1());
        C8951o.f0(a.a(hybridAlignFragment), Kreativ.Capture.Hybrid.c.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C13423D c10 = C13423D.c(layoutInflater, viewGroup, false);
        w0(true);
        E0 u02 = u0();
        u02.w1().b().captureAlignStart(u02.y1(), u02.r1(), u02.e1(), u02.d1());
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114337e;
        C17542s.i(floatingActionButton, "cancelButton");
        x0(b10, floatingActionButton, new C14285z(this));
        E A02 = A0(v0(VideoAsset.CAPTURE_ICON_ALIGN));
        this.f124770P = A02;
        c10.f114335c.setPlayer(A02);
        c10.f114334b.setClipToOutline(true);
        c10.f114336d.setOnClickListener(new A(this));
        Bitmap n12 = u0().n1();
        if (n12 != null) {
            c10.f114340h.setImageBitmap(Bitmap.createBitmap(n12, D0(n12.getWidth(), n12.getHeight()), 0, n12.getWidth() / 2, n12.getHeight()));
        }
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onResume() {
        super.onResume();
        E e10 = this.f124770P;
        if (e10 != null) {
            e10.q(true);
        }
    }

    public void onStop() {
        super.onStop();
        E e10 = this.f124770P;
        if (e10 != null) {
            e10.stop();
        }
        E e11 = this.f124770P;
        if (e11 != null) {
            e11.release();
        }
    }
}
