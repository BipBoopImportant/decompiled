package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.C5249a;
import b.C5250b;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final C5250b f16593a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f16594b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f16595c;

    class a extends C5249a.C0353a {

        /* renamed from: a  reason: collision with root package name */
        private Handler f16596a = new Handler(Looper.getMainLooper());

        a(b bVar) {
        }

        public void A3(int i10, Uri uri, boolean z10, Bundle bundle) {
        }

        public void E2(Bundle bundle) {
        }

        public void L2(int i10, int i11, Bundle bundle) {
        }

        public void O(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
        }

        public void P0(String str, Bundle bundle) {
        }

        public void W0(Bundle bundle) {
        }

        public void Z2(int i10, Bundle bundle) {
        }

        public Bundle f0(String str, Bundle bundle) {
            return null;
        }

        public void p3(String str, Bundle bundle) {
        }

        public void w2(Bundle bundle) {
        }

        public void x3(Bundle bundle) {
        }
    }

    c(C5250b bVar, ComponentName componentName, Context context) {
        this.f16593a = bVar;
        this.f16594b = componentName;
        this.f16595c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean b(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 1);
    }

    private C5249a.C0353a c(b bVar) {
        return new a(bVar);
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getActivity(context, i10, new Intent(), 67108864);
    }

    private f g(b bVar, PendingIntent pendingIntent) {
        boolean z10;
        C5249a.C0353a c10 = c(bVar);
        if (pendingIntent != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                z10 = this.f16593a.S0(c10, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        } else {
            z10 = this.f16593a.A2(c10);
        }
        if (!z10) {
            return null;
        }
        return new f(this.f16593a, c10, this.f16594b, pendingIntent);
    }

    public f e(b bVar) {
        return g(bVar, (PendingIntent) null);
    }

    public f f(b bVar, int i10) {
        return g(bVar, d(this.f16595c, i10));
    }

    public boolean h(long j10) {
        try {
            return this.f16593a.t2(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
