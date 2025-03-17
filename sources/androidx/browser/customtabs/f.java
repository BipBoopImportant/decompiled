package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import b.C5249a;
import b.C5250b;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f16612a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final C5250b f16613b;

    /* renamed from: c  reason: collision with root package name */
    private final C5249a f16614c;

    /* renamed from: d  reason: collision with root package name */
    private final ComponentName f16615d;

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f16616e;

    f(C5250b bVar, C5249a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f16613b = bVar;
        this.f16614c = aVar;
        this.f16615d = componentName;
        this.f16616e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f16616e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public IBinder c() {
        return this.f16614c.asBinder();
    }

    /* access modifiers changed from: package-private */
    public ComponentName d() {
        return this.f16615d;
    }

    /* access modifiers changed from: package-private */
    public PendingIntent e() {
        return this.f16616e;
    }

    public boolean f(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f16613b.k2(this.f16614c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
