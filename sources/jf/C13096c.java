package JF;

import F2.e;
import android.app.Activity;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.sugarcube.decorate_engine.SceneLayout;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/app/Activity;", "Landroid/view/View;", "root", "LXH/N;", "c", "(Landroid/app/Activity;Landroid/view/View;)V", "", "e", "(Landroid/app/Activity;)I", "", "f", "(Landroid/app/Activity;)Z", "Ljava/util/Locale;", "locale", "b", "(Landroid/app/Activity;Ljava/util/Locale;)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: JF.c  reason: case insensitive filesystem */
public final class C13096c {
    public static final void b(Activity activity, Locale locale) {
        C17542s.j(activity, "<this>");
        C17542s.j(locale, "locale");
        Locale.setDefault(locale);
        activity.getResources().getConfiguration().setLocale(locale);
        activity.getResources().updateConfiguration(activity.getResources().getConfiguration(), activity.getResources().getDisplayMetrics());
    }

    public static final void c(Activity activity, View view) {
        C17542s.j(activity, "<this>");
        C17542s.j(view, "root");
        if (Build.VERSION.SDK_INT >= 30) {
            activity.getWindow().setDecorFitsSystemWindows(false);
            view.setOnApplyWindowInsetsListener(new C13095b(view));
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(SceneLayout.kCurrent3DVersion);
    }

    /* access modifiers changed from: private */
    public static final WindowInsets d(View view, View view2, WindowInsets windowInsets) {
        C17542s.j(view2, "<unused var>");
        C17542s.j(windowInsets, "<unused var>");
        int a10 = WindowInsets.Type.navigationBars();
        Insets a11 = view.getRootWindowInsets().getInsets(a10);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(a11.left, a11.top, a11.right, a11.bottom);
            view.setLayoutParams(marginLayoutParams);
            return e.a().setInsets(a10, a11).build();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final int e(Activity activity) {
        DisplayCutout a10;
        C17542s.j(activity, "<this>");
        if (Build.VERSION.SDK_INT < 28 || (a10 = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) == null || a10.getBoundingRects().size() <= 0) {
            return 0;
        }
        return ((Rect) a10.getBoundingRects().get(0)).height();
    }

    public static final boolean f(Activity activity) {
        C17542s.j(activity, "<this>");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels > displayMetrics.heightPixels;
    }
}
