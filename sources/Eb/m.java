package eb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import fb.C9693i;
import fb.C9699o;
import fb.t;
import fb.w;
import xa.C8971l;
import xa.C8972m;
import xa.C8974o;

@SuppressLint({"RestrictedApi"})
public final class m {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C9693i f72580c = new C9693i("ReviewService");

    /* renamed from: a  reason: collision with root package name */
    t f72581a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f72582b;

    public m(Context context) {
        this.f72582b = context.getPackageName();
        if (w.a(context)) {
            Context context2 = context;
            this.f72581a = new t(context2, f72580c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new i(), (C9699o) null);
        }
    }

    public final C8971l a() {
        String str = this.f72582b;
        C9693i iVar = f72580c;
        iVar.c("requestInAppReview (%s)", str);
        if (this.f72581a == null) {
            iVar.a("Play Store app is either not installed or not the official version", new Object[0]);
            return C8974o.e(new C9630a(-1));
        }
        C8972m mVar = new C8972m();
        this.f72581a.s(new j(this, mVar, mVar), mVar);
        return mVar.a();
    }
}
