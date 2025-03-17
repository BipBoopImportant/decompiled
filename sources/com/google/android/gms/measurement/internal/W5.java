package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;

public final class W5 {

    /* renamed from: a  reason: collision with root package name */
    private final P2 f49986a;

    public W5(P2 p22) {
        this.f49986a = p22;
    }

    private final boolean d() {
        return this.f49986a.E().f50381z.a() > 0;
    }

    private final boolean e() {
        return d() && this.f49986a.zzb().a() - this.f49986a.E().f50381z.a() > this.f49986a.y().A((String) null, K.f49755e0);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f49986a.q().k();
        if (d()) {
            if (e()) {
                this.f49986a.E().f50380y.b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(Constants.MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f49986a.G().e1("auto", "_cmpx", bundle);
            } else {
                String a10 = this.f49986a.E().f50380y.a();
                if (TextUtils.isEmpty(a10)) {
                    this.f49986a.f().G().a("Cache still valid but referrer not found");
                } else {
                    long a11 = ((this.f49986a.E().f50381z.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a11);
                    Object obj = pair.first;
                    this.f49986a.G().e1(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f49986a.E().f50380y.b((String) null);
            }
            this.f49986a.E().f50381z.b(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String str2;
        this.f49986a.q().k();
        if (!this.f49986a.o()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f49986a.E().f50380y.b(str2);
                this.f49986a.E().f50381z.b(this.f49986a.zzb().a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.f49986a.E().f50380y.b((String) null);
        }
    }
}
