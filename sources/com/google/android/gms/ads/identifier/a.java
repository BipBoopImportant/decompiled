package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;
import y9.C8995a;

final class a extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map f47902a;

    a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f47902a = map;
    }

    public final void run() {
        Map map = this.f47902a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C8995a.a(buildUpon.build().toString());
    }
}
