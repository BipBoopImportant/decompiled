package com.google.firebase.analytics;

import K9.C6620s;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C7327j1;
import com.google.firebase.installations.c;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sa.W;
import xa.C8974o;

public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    private static volatile FirebaseAnalytics f68155b;

    /* renamed from: a  reason: collision with root package name */
    private final C7327j1 f68156a;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    private FirebaseAnalytics(C7327j1 j1Var) {
        C6620s.l(j1Var);
        this.f68156a = j1Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f68155b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f68155b == null) {
                        f68155b = new FirebaseAnalytics(C7327j1.e(context));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68155b;
    }

    @Keep
    public static W getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C7327j1 f10 = C7327j1.f(context, (String) null, (String) null, (String) null, bundle);
        if (f10 == null) {
            return null;
        }
        return new a(f10);
    }

    public final void a(String str, Bundle bundle) {
        this.f68156a.s(str, bundle);
    }

    public final void b(boolean z10) {
        this.f68156a.p(Boolean.valueOf(z10));
    }

    public final void c(Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.AD_STORAGE);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int ordinal3 = aVar3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int ordinal4 = aVar4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f68156a.F(bundle);
    }

    public final void d(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f68156a.J(bundle);
    }

    public final void e(String str) {
        this.f68156a.K(str);
    }

    public final void f(String str, String str2) {
        this.f68156a.C(str, str2);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) C8974o.b(c.p().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Deprecated
    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f68156a.j(activity, str, str2);
    }
}
