package a9;

import H2.j;
import android.app.Activity;
import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C17542s;

public final class G1 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<Class<? extends Activity>> f42014a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public static final HashSet<Class<? extends View>> f42015b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public static final WeakHashMap<View, Object> f42016c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static final j<Activity> f42017d = new D1();

    /* renamed from: e  reason: collision with root package name */
    public static final j<View> f42018e = new E1();

    /* renamed from: f  reason: collision with root package name */
    public static final j<View> f42019f = new F1();

    public static final boolean a(Activity activity) {
        return f42014a.contains(activity.getClass());
    }

    public static final boolean b(View view) {
        return f42016c.containsKey(view);
    }

    @SafeVarargs
    public static final void c(Class<? extends View>... clsArr) {
        C17542s.j(clsArr, "viewsClasses");
        Collections.addAll(f42015b, Arrays.copyOf(clsArr, clsArr.length));
    }

    public static final boolean d(View view) {
        return f42015b.contains(view.getClass()) || view.getId() == 16908336;
    }
}
