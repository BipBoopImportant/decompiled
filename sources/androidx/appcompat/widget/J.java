package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class J extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f16246c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<J>> f16247d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f16248a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f16249b;

    private J(Context context) {
        super(context);
        if (T.d()) {
            T t10 = new T(this, context.getResources());
            this.f16248a = t10;
            Resources.Theme newTheme = t10.newTheme();
            this.f16249b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f16248a = new L(this, context.getResources());
        this.f16249b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof J) || (context.getResources() instanceof L) || (context.getResources() instanceof T)) {
            return false;
        }
        return T.d();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f16246c) {
            try {
                ArrayList<WeakReference<J>> arrayList = f16247d;
                if (arrayList == null) {
                    f16247d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = f16247d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f16247d.remove(size);
                        }
                    }
                    for (int size2 = f16247d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = f16247d.get(size2);
                        J j10 = weakReference2 != null ? (J) weakReference2.get() : null;
                        if (j10 != null && j10.getBaseContext() == context) {
                            return j10;
                        }
                    }
                }
                J j11 = new J(context);
                f16247d.add(new WeakReference(j11));
                return j11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AssetManager getAssets() {
        return this.f16248a.getAssets();
    }

    public Resources getResources() {
        return this.f16248a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f16249b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i10) {
        Resources.Theme theme = this.f16249b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
