package a9;

import G8.t;
import android.net.Uri;
import c9.C7105c;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.z4  reason: case insensitive filesystem */
public final class C6985z4 {

    /* renamed from: a  reason: collision with root package name */
    public final t f42985a;

    /* renamed from: b  reason: collision with root package name */
    public final Z f42986b;

    public C6985z4(t tVar, Z z10) {
        C17542s.j(tVar, "systemInstantiable");
        C17542s.j(z10, "sessionReplayProperties");
        this.f42985a = tVar;
        this.f42986b = z10;
    }

    public final synchronized String a() {
        String uri;
        C7105c a10 = this.f42986b.a(this.f42985a.a());
        Uri.Builder buildUpon = Uri.parse("https://app.contentsquare.com/quick-playback/index.html").buildUpon();
        buildUpon.appendQueryParameter("uu", a10.p());
        buildUpon.appendQueryParameter("recordingType", "cs");
        buildUpon.appendQueryParameter("pid", String.valueOf(a10.n()));
        buildUpon.appendQueryParameter("sn", String.valueOf(a10.o()));
        uri = buildUpon.build().toString();
        C17542s.i(uri, "sessionReplayProperties.….build().toString()\n    }");
        return uri;
    }
}
