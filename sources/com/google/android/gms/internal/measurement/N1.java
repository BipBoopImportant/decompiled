package com.google.android.gms.internal.measurement;

import K9.C6620s;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7327j1;

final class N1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Bundle f48757e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Activity f48758f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ C7327j1.b f48759g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    N1(C7327j1.b bVar, Bundle bundle, Activity activity) {
        super(C7327j1.this);
        this.f48757e = bundle;
        this.f48758f = activity;
        this.f48759g = bVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Bundle bundle;
        if (this.f48757e != null) {
            bundle = new Bundle();
            if (this.f48757e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f48757e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((Q0) C6620s.l(C7327j1.this.f48973i)).onActivityCreatedByScionActivityInfo(C7309h1.x(this.f48758f), bundle, this.f48975b);
    }
}
