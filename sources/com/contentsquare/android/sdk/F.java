package com.contentsquare.android.sdk;

import XH.C16796C;
import XH.v;
import a9.D6;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;

public final class F implements ComponentCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final t1 f46963a;

    /* renamed from: b  reason: collision with root package name */
    public final Application f46964b;

    /* renamed from: c  reason: collision with root package name */
    public final DisplayMetrics f46965c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f46966d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f46967e;

    /* renamed from: f  reason: collision with root package name */
    public int f46968f;

    public interface a {
        void a(int i10, int i11);
    }

    public F(t1 t1Var, Application application, DisplayMetrics displayMetrics) {
        C17542s.j(t1Var, "mSdkManager");
        C17542s.j(application, "application");
        C17542s.j(displayMetrics, "metrics");
        this.f46963a = t1Var;
        this.f46964b = application;
        this.f46965c = displayMetrics;
        Object systemService = application.getSystemService("window");
        v vVar = null;
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            vVar = C16796C.a(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        }
        if (vVar != null) {
            this.f46967e = ((Number) vVar.c()).intValue();
            this.f46968f = ((Number) vVar.d()).intValue();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C17542s.j(configuration, "newConfig");
        if (D6.a(C8886a.f56874d.a(), "exposure_metrics")) {
            Object systemService = this.f46964b.getSystemService("window");
            v vVar = null;
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(this.f46965c);
                DisplayMetrics displayMetrics = this.f46965c;
                vVar = C16796C.a(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
            }
            if (vVar != null) {
                int intValue = ((Number) vVar.c()).intValue();
                int intValue2 = ((Number) vVar.d()).intValue();
                if (this.f46967e != intValue || this.f46968f != intValue2) {
                    this.f46967e = intValue;
                    this.f46968f = intValue2;
                    Iterator it = this.f46966d.iterator();
                    while (it.hasNext()) {
                        int i10 = configuration.orientation;
                        ((a) it.next()).a(intValue, intValue2);
                    }
                }
            }
        }
    }

    public final void onLowMemory() {
        this.f46963a.b(false);
    }
}
