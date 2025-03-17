package B8;

import C8.d;
import D8.c;
import G8.v;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.HashMap;
import java.util.List;

@Deprecated
public class b extends AsyncTask<String, Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    private int f33250a = 4;

    /* renamed from: b  reason: collision with root package name */
    private int f33251b = 1000;

    /* renamed from: c  reason: collision with root package name */
    private final a f33252c;

    /* renamed from: d  reason: collision with root package name */
    private final C8.a f33253d;

    /* renamed from: e  reason: collision with root package name */
    private final c f33254e = new c("ConfigRetrieverTask");

    /* renamed from: f  reason: collision with root package name */
    private final A8.b f33255f;

    /* renamed from: g  reason: collision with root package name */
    private final String f33256g;

    /* renamed from: h  reason: collision with root package name */
    private final G8.a f33257h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f33258i = false;

    public interface a {
        void a();
    }

    public b(String str, A8.b bVar, a aVar, C8.a aVar2, G8.a aVar3) {
        this.f33255f = bVar;
        this.f33252c = aVar;
        this.f33253d = aVar2;
        this.f33256g = str;
        this.f33257h = aVar3;
    }

    private String b(String str, String str2, int i10) {
        HashMap hashMap = new HashMap();
        if (this.f33256g != null && this.f33257h.a().equals("qa")) {
            hashMap.put("uid", this.f33256g);
        }
        if (!this.f33255f.a().isEmpty()) {
            hashMap.put("If-None-Match", this.f33255f.a());
        }
        d d10 = this.f33253d.d(str, hashMap);
        if (d10.p()) {
            this.f33254e.f("Got HTTP_OK for endpoint: " + str);
            String g10 = d10.g();
            if (!TextUtils.isEmpty(g10)) {
                List list = d10.e().get("ETag");
                this.f33255f.h((list == null || list.isEmpty()) ? "" : (String) list.get(0));
                this.f33254e.f("Got remote config " + g10);
                return g10;
            }
        } else if (d10.f() == 304) {
            this.f33254e.f("Got HTTP Not-Modified: current config still valid, do nothing.");
            return null;
        }
        if (d10.f() == 404) {
            this.f33254e.h("Got HTTP_NOT_FOUND for endpoint " + str);
            this.f33254e.k("Config for package name '" + str2 + "' could not be retrieved. A Contentsquare project might not have been created for you yet. Send your package name to your Contentsquare contact.");
        }
        if (d10.f() >= 400) {
            this.f33254e.j("Failed to fetch config for " + str2 + ". Network error: " + d10.f());
        }
        int i11 = i10 - 1;
        int i12 = this.f33250a - i11;
        if (i11 <= 0) {
            return null;
        }
        this.f33254e.l("retrying the conf fetch for the " + i12 + "th time");
        try {
            int pow = (int) (((double) this.f33251b) * Math.pow((double) i12, 2.0d));
            this.f33254e.f("sleeping " + pow + " msec before the next retry");
            Thread.sleep((long) pow);
        } catch (InterruptedException e10) {
            this.f33254e.i(e10, "Config fetch interrupted.");
        }
        return b(str, str2, i11);
    }

    /* renamed from: a */
    public Void doInBackground(String... strArr) {
        String str = strArr[0];
        String b10 = b(v.e(str), str, this.f33250a);
        JsonConfig.RootConfig c10 = !TextUtils.isEmpty(b10) ? JsonConfig.c(b10) : null;
        if (c10 == null || !this.f33255f.c(c10)) {
            this.f33254e.f("The config fetched from CS servers is the same as the one saved in the device");
        } else {
            this.f33255f.g(b10);
            this.f33258i = true;
        }
        return null;
    }

    /* renamed from: c */
    public void onPostExecute(Void voidR) {
        if (this.f33258i) {
            this.f33258i = false;
            this.f33252c.a();
            return;
        }
        this.f33254e.f("callback not called");
    }
}
