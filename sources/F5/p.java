package f5;

import I2.C0;
import YH.C16877v;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import d5.C7744b;
import j5.C8400a;
import j5.C8401b;
import j5.f;
import j5.k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R*\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\r0'j\b\u0012\u0004\u0012\u00020\r`(8\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lf5/p;", "Lf5/m;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "bounds", "LXH/N;", "j", "(Landroid/app/Activity;Landroid/graphics/Rect;)V", "Landroid/content/Context;", "context", "", "h", "(Landroid/content/Context;)I", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "g", "(Landroid/view/Display;)Landroid/view/DisplayCutout;", "Lf5/l;", "a", "(Landroid/content/Context;)Lf5/l;", "b", "(Landroid/app/Activity;)Lf5/l;", "e", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "d", "c", "Landroid/graphics/Point;", "i", "(Landroid/view/Display;)Landroid/graphics/Point;", "LI2/C0;", "f", "(Landroid/content/Context;)LI2/C0;", "", "Ljava/lang/String;", "TAG", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getInsetsTypeMasks$window_release", "()Ljava/util/ArrayList;", "insetsTypeMasks", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p implements m {

    /* renamed from: b  reason: collision with root package name */
    public static final p f51170b = new p();

    /* renamed from: c  reason: collision with root package name */
    private static final String f51171c;

    /* renamed from: d  reason: collision with root package name */
    private static final ArrayList<Integer> f51172d = C16877v.h(Integer.valueOf(C0.l.g()), Integer.valueOf(C0.l.f()), Integer.valueOf(C0.l.a()), Integer.valueOf(C0.l.c()), Integer.valueOf(C0.l.i()), Integer.valueOf(C0.l.e()), Integer.valueOf(C0.l.j()), Integer.valueOf(C0.l.b()));

    static {
        String simpleName = p.class.getSimpleName();
        C17542s.i(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f51171c = simpleName;
    }

    private p() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout g(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor((Class[]) null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance((Object[]) null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{newInstance.getClass()});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, new Object[]{newInstance});
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (n.a(obj)) {
                return o.a(obj);
            }
            return null;
        } catch (ClassNotFoundException e10) {
            Log.w(f51171c, e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.w(f51171c, e11);
            return null;
        } catch (NoSuchFieldException e12) {
            Log.w(f51171c, e12);
            return null;
        } catch (IllegalAccessException e13) {
            Log.w(f51171c, e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w(f51171c, e14);
            return null;
        } catch (InstantiationException e15) {
            Log.w(f51171c, e15);
            return null;
        }
    }

    private final int h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void j(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    public l a(Context context) {
        C17542s.j(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return f.f54042a.c(context);
        }
        Context a10 = C8401b.f54041a.a(context);
        if (a10 instanceof Activity) {
            return b((Activity) a10);
        }
        if (a10 instanceof InputMethodService) {
            Object systemService = context.getSystemService("window");
            C17542s.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            C17542s.i(defaultDisplay, "wm.defaultDisplay");
            Point i10 = i(defaultDisplay);
            return new l(new Rect(0, 0, i10.x, i10.y), (C0) null, 2, (DefaultConstructorMarker) null);
        }
        throw new IllegalArgumentException(context + " is not a UiContext");
    }

    public l b(Activity activity) {
        C0 c02;
        C17542s.j(activity, "activity");
        int i10 = Build.VERSION.SDK_INT;
        Rect a10 = i10 >= 30 ? f.f54042a.a(activity) : i10 >= 29 ? e(activity) : i10 >= 28 ? d(activity) : c(activity);
        if (i10 >= 30) {
            c02 = f(activity);
        } else {
            c02 = new C0.a().a();
            C17542s.i(c02, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new l(new C7744b(a10), c02);
    }

    public final Rect c(Activity activity) {
        C17542s.j(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!C8400a.f54040a.a(activity)) {
            C17542s.i(defaultDisplay, "defaultDisplay");
            Point i10 = i(defaultDisplay);
            int h10 = h(activity);
            int i11 = rect.bottom;
            if (i11 + h10 == i10.y) {
                rect.bottom = i11 + h10;
            } else {
                int i12 = rect.right;
                if (i12 + h10 == i10.x) {
                    rect.right = i12 + h10;
                }
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect d(Activity activity) {
        C17542s.j(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (C8400a.f54040a.a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
                C17542s.h(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", (Class[]) null).invoke(obj, (Object[]) null);
                C17542s.h(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (NoSuchFieldException e10) {
            Log.w(f51171c, e10);
            j(activity, rect);
        } catch (NoSuchMethodException e11) {
            Log.w(f51171c, e11);
            j(activity, rect);
        } catch (IllegalAccessException e12) {
            Log.w(f51171c, e12);
            j(activity, rect);
        } catch (InvocationTargetException e13) {
            Log.w(f51171c, e13);
            j(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        C8400a aVar = C8400a.f54040a;
        if (!aVar.a(activity)) {
            int h10 = h(activity);
            int i10 = rect.bottom;
            if (i10 + h10 == point.y) {
                rect.bottom = i10 + h10;
            } else {
                int i11 = rect.right;
                if (i11 + h10 == point.x) {
                    rect.right = i11 + h10;
                } else if (rect.left == h10) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity)) {
            C17542s.i(defaultDisplay, "currentDisplay");
            DisplayCutout g10 = g(defaultDisplay);
            if (g10 != null) {
                int i12 = rect.left;
                k kVar = k.f54043a;
                if (i12 == kVar.b(g10)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == kVar.c(g10)) {
                    rect.right += kVar.c(g10);
                }
                if (rect.top == kVar.d(g10)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == kVar.a(g10)) {
                    rect.bottom += kVar.a(g10);
                }
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect e(Activity activity) {
        C17542s.j(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
            C17542s.h(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (NoSuchFieldException e10) {
            Log.w(f51171c, e10);
            return d(activity);
        } catch (NoSuchMethodException e11) {
            Log.w(f51171c, e11);
            return d(activity);
        } catch (IllegalAccessException e12) {
            Log.w(f51171c, e12);
            return d(activity);
        } catch (InvocationTargetException e13) {
            Log.w(f51171c, e13);
            return d(activity);
        }
    }

    public final C0 f(Context context) {
        C17542s.j(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return f.f54042a.b(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final Point i(Display display) {
        C17542s.j(display, "display");
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
