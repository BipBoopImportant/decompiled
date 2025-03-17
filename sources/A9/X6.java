package a9;

import XH.C16796C;
import XH.v;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a;
import kotlin.jvm.internal.C17542s;

public final class X6 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f42397a;

    public X6(a aVar) {
        this.f42397a = aVar;
    }

    public final void onGlobalLayout() {
        int i10;
        int i11;
        a aVar = this.f42397a;
        View rootView = aVar.a().getRootView();
        if (rootView != null) {
            Rect rect = new Rect();
            rootView.getWindowVisibleDisplayFrame(rect);
            i11 = rect.height();
            i10 = rect.width();
        } else {
            i11 = 0;
            i10 = 0;
        }
        if (aVar.f46630j == 0 || aVar.f46631k == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            aVar.f46623c.getDefaultDisplay().getMetrics(displayMetrics);
            int i12 = displayMetrics.heightPixels;
            i10 = displayMetrics.widthPixels;
            i11 = i12;
        }
        v a10 = C16796C.a(Integer.valueOf(i11), Integer.valueOf(i10));
        this.f42397a.f46630j = ((Number) a10.c()).intValue();
        this.f42397a.f46631k = ((Number) a10.d()).intValue();
        ViewTreeObserver viewTreeObserver = this.f42397a.a().getViewTreeObserver();
        C17542s.i(viewTreeObserver, "fabLayout.viewTreeObserver");
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
