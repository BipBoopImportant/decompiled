package I2;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: I2.b  reason: case insensitive filesystem */
public abstract class C4599b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8623a;

    /* renamed from: b  reason: collision with root package name */
    private a f8624b;

    /* renamed from: c  reason: collision with root package name */
    private C0119b f8625c;

    /* renamed from: I2.b$a */
    public interface a {
    }

    /* renamed from: I2.b$b  reason: collision with other inner class name */
    public interface C0119b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public C4599b(Context context) {
        this.f8623a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f8625c = null;
        this.f8624b = null;
    }

    public void i(a aVar) {
        this.f8624b = aVar;
    }

    public void j(C0119b bVar) {
        if (!(this.f8625c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f8625c = bVar;
    }
}
