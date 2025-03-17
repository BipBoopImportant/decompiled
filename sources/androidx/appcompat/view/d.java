package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import i.C5429i;

public class d extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    private static Configuration f15643f;

    /* renamed from: a  reason: collision with root package name */
    private int f15644a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f15645b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f15646c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f15647d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f15648e;

    public d() {
        super((Context) null);
    }

    private Resources b() {
        if (this.f15648e == null) {
            Configuration configuration = this.f15647d;
            if (configuration == null || e(configuration)) {
                this.f15648e = super.getResources();
            } else {
                this.f15648e = createConfigurationContext(this.f15647d).getResources();
            }
        }
        return this.f15648e;
    }

    private void d() {
        boolean z10 = this.f15645b == null;
        if (z10) {
            this.f15645b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f15645b.setTo(theme);
            }
        }
        f(this.f15645b, this.f15644a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f15643f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f15643f = configuration2;
        }
        return configuration.equals(f15643f);
    }

    public void a(Configuration configuration) {
        if (this.f15648e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f15647d == null) {
            this.f15647d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f15644a;
    }

    /* access modifiers changed from: protected */
    public void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f15646c == null) {
            this.f15646c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f15646c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f15645b;
        if (theme != null) {
            return theme;
        }
        if (this.f15644a == 0) {
            this.f15644a = C5429i.f24039c;
        }
        d();
        return this.f15645b;
    }

    public void setTheme(int i10) {
        if (this.f15644a != i10) {
            this.f15644a = i10;
            d();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f15644a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f15645b = theme;
    }
}
