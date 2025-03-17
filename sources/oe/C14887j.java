package oE;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
/* renamed from: oE.j  reason: case insensitive filesystem */
class C14887j implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static Double f130092h;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f130093a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private Runnable f130094b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f130095c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f130096d = true;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C14886i f130097e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C14883f f130098f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<Activity> f130099g;

    /* renamed from: oE.j$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            if (C14887j.this.f130095c && C14887j.this.f130096d) {
                boolean unused = C14887j.this.f130095c = false;
                try {
                    double currentTimeMillis = ((double) System.currentTimeMillis()) - C14887j.f130092h.doubleValue();
                    if (currentTimeMillis >= ((double) C14887j.this.f130098f.p()) && currentTimeMillis < ((double) C14887j.this.f130098f.t())) {
                        double round = ((double) Math.round((currentTimeMillis / 1000.0d) * 10.0d)) / 10.0d;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("$ae_session_length", round);
                        C14887j.this.f130097e.t().d("$ae_total_app_sessions", 1.0d);
                        C14887j.this.f130097e.t().d("$ae_total_app_session_length", round);
                        C14887j.this.f130097e.P("$ae_session", jSONObject, true);
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                C14887j.this.f130097e.C();
            }
        }
    }

    public C14887j(C14886i iVar, C14883f fVar) {
        this.f130097e = iVar;
        this.f130098f = fVar;
        if (f130092h == null) {
            f130092h = Double.valueOf((double) System.currentTimeMillis());
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        this.f130096d = true;
        Runnable runnable = this.f130094b;
        if (runnable != null) {
            this.f130093a.removeCallbacks(runnable);
        }
        this.f130099g = null;
        Handler handler = this.f130093a;
        a aVar = new a();
        this.f130094b = aVar;
        handler.postDelayed(aVar, 500);
    }

    public void onActivityResumed(Activity activity) {
        this.f130099g = new WeakReference<>(activity);
        this.f130096d = false;
        boolean z10 = this.f130095c;
        this.f130095c = true;
        Runnable runnable = this.f130094b;
        if (runnable != null) {
            this.f130093a.removeCallbacks(runnable);
        }
        if (!z10) {
            f130092h = Double.valueOf((double) System.currentTimeMillis());
            this.f130097e.D();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
