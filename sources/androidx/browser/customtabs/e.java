package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.C5250b;

public abstract class e implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private Context f16610a;

    class a extends c {
        a(C5250b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, c cVar);

    /* access modifiers changed from: package-private */
    public void b(Context context) {
        this.f16610a = context;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f16610a != null) {
            a(componentName, new a(C5250b.a.I3(iBinder), componentName, this.f16610a));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
