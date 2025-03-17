package s;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s.C5827f;

/* renamed from: s.h  reason: case insensitive filesystem */
public class C5829h {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f28707a;

    /* renamed from: b  reason: collision with root package name */
    private final d.C0230d f28708b = new d.C0230d();

    /* renamed from: c  reason: collision with root package name */
    private List<String> f28709c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f28710d;

    /* renamed from: e  reason: collision with root package name */
    private C5827f f28711e = new C5827f.a();

    /* renamed from: f  reason: collision with root package name */
    private int f28712f = 0;

    public C5829h(Uri uri) {
        this.f28707a = uri;
    }

    public C5828g a(f fVar) {
        if (fVar != null) {
            this.f28708b.f(fVar);
            Intent intent = this.f28708b.a().f16598a;
            intent.setData(this.f28707a);
            intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
            if (this.f28709c != null) {
                intent.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(this.f28709c));
            }
            Bundle bundle = this.f28710d;
            if (bundle != null) {
                intent.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", bundle);
            }
            List emptyList = Collections.emptyList();
            intent.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", this.f28711e.a());
            intent.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", this.f28712f);
            return new C5828g(intent, emptyList);
        }
        throw new NullPointerException("CustomTabsSession is required for launching a TWA");
    }

    public d b() {
        return this.f28708b.a();
    }

    public Uri c() {
        return this.f28707a;
    }

    public C5829h d(a aVar) {
        this.f28708b.d(aVar);
        return this;
    }
}
