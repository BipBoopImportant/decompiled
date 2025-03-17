package v2;

import H2.i;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v2.C6162g;

/* renamed from: v2.i  reason: case insensitive filesystem */
public class C6164i {

    /* renamed from: a  reason: collision with root package name */
    private static volatile C6162g<?> f31024a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile List<C6157b> f31025b;

    /* renamed from: v2.i$a */
    private static class a {
        static String a(List<ShortcutInfo> list) {
            int i10 = -1;
            String str = null;
            for (ShortcutInfo next : list) {
                if (next.getRank() > i10) {
                    String id2 = next.getId();
                    str = id2;
                    i10 = next.getRank();
                }
            }
            return str;
        }
    }

    private C6164i() {
    }

    static boolean a(Context context, C6161f fVar) {
        Bitmap decodeStream;
        IconCompat iconCompat = fVar.f31010h;
        if (iconCompat == null) {
            return false;
        }
        int i10 = iconCompat.f21157a;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream k10 = iconCompat.k(context);
        if (k10 == null || (decodeStream = BitmapFactory.decodeStream(k10)) == null) {
            return false;
        }
        fVar.f31010h = i10 == 6 ? IconCompat.b(decodeStream) : IconCompat.c(decodeStream);
        return true;
    }

    public static int b(Context context) {
        i.g(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    private static String c(List<C6161f> list) {
        int i10 = -1;
        String str = null;
        for (C6161f next : list) {
            if (next.c() > i10) {
                String b10 = next.b();
                str = b10;
                i10 = next.c();
            }
        }
        return str;
    }

    private static List<C6157b> d(Context context) {
        Bundle bundle;
        String string;
        if (f31025b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) == null)) {
                    try {
                        arrayList.add((C6157b) Class.forName(string, false, C6164i.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f31025b == null) {
                f31025b = arrayList;
            }
        }
        return f31025b;
    }

    private static C6162g<?> e(Context context) {
        if (f31024a == null) {
            try {
                f31024a = (C6162g) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C6164i.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            } catch (Exception unused) {
            }
            if (f31024a == null) {
                f31024a = new C6162g.a();
            }
        }
        return f31024a;
    }

    public static boolean f(Context context, C6161f fVar) {
        i.g(context);
        i.g(fVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 32 || !fVar.d(1)) {
            int b10 = b(context);
            if (b10 == 0) {
                return false;
            }
            if (i10 <= 29) {
                a(context, fVar);
            }
            Class cls = ShortcutManager.class;
            if (i10 >= 30) {
                ((ShortcutManager) context.getSystemService(cls)).pushDynamicShortcut(fVar.e());
            } else {
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(cls);
                if (shortcutManager.isRateLimitingActive()) {
                    return false;
                }
                List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                if (dynamicShortcuts.size() >= b10) {
                    shortcutManager.removeDynamicShortcuts(Arrays.asList(new String[]{a.a(dynamicShortcuts)}));
                }
                shortcutManager.addDynamicShortcuts(Arrays.asList(new ShortcutInfo[]{fVar.e()}));
            }
            C6162g<?> e10 = e(context);
            try {
                List<C6161f> b11 = e10.b();
                if (b11.size() >= b10) {
                    e10.d(Arrays.asList(new String[]{c(b11)}));
                }
                e10.a(Arrays.asList(new C6161f[]{fVar}));
                for (C6157b b12 : d(context)) {
                    b12.b(Collections.singletonList(fVar));
                }
                h(context, fVar.b());
                return true;
            } catch (Exception unused) {
                for (C6157b b13 : d(context)) {
                    b13.b(Collections.singletonList(fVar));
                }
                h(context, fVar.b());
                return false;
            } catch (Throwable th2) {
                for (C6157b b14 : d(context)) {
                    b14.b(Collections.singletonList(fVar));
                }
                h(context, fVar.b());
                throw th2;
            }
        } else {
            for (C6157b b15 : d(context)) {
                b15.b(Collections.singletonList(fVar));
            }
            return true;
        }
    }

    public static void g(Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        e(context).c();
        for (C6157b a10 : d(context)) {
            a10.a();
        }
    }

    public static void h(Context context, String str) {
        i.g(context);
        i.g(str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        for (C6157b c10 : d(context)) {
            c10.c(Collections.singletonList(str));
        }
    }
}
