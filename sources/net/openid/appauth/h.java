package net.openid.appauth;

import AK.C15444a;
import AK.C15445b;
import AK.d;
import AK.f;
import AK.g;
import BK.C15482b;
import BK.C15484d;
import BK.e;
import CK.C15520a;
import DK.C15581a;
import DK.C15582b;
import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import java.net.URLConnection;
import net.openid.appauth.d;
import net.openid.appauth.n;
import net.openid.appauth.r;
import org.json.JSONException;
import org.json.JSONObject;

public class h {

    /* renamed from: a  reason: collision with root package name */
    Context f145076a;

    /* renamed from: b  reason: collision with root package name */
    private final C15444a f145077b;

    /* renamed from: c  reason: collision with root package name */
    private final e f145078c;

    /* renamed from: d  reason: collision with root package name */
    private final C15482b f145079d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f145080e;

    private static class a extends AsyncTask<Void, Void, JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        private q f145081a;

        /* renamed from: b  reason: collision with root package name */
        private d f145082b;

        /* renamed from: c  reason: collision with root package name */
        private final C15520a f145083c;

        /* renamed from: d  reason: collision with root package name */
        private b f145084d;

        /* renamed from: e  reason: collision with root package name */
        private k f145085e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f145086f;

        /* renamed from: g  reason: collision with root package name */
        private d f145087g;

        a(q qVar, d dVar, C15520a aVar, k kVar, b bVar, Boolean bool) {
            this.f145081a = qVar;
            this.f145082b = dVar;
            this.f145083c = aVar;
            this.f145085e = kVar;
            this.f145084d = bVar;
            this.f145086f = bool.booleanValue();
        }

        private void a(URLConnection uRLConnection) {
            if (TextUtils.isEmpty(uRLConnection.getRequestProperty("Accept"))) {
                uRLConnection.setRequestProperty("Accept", "application/json");
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x00c6=Splitter:B:33:0x00c6, B:38:0x00da=Splitter:B:38:0x00da} */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public org.json.JSONObject doInBackground(java.lang.Void... r8) {
            /*
                r7 = this;
                java.lang.String r8 = "Failed to complete exchange request"
                r0 = 0
                r1 = 0
                CK.a r2 = r7.f145083c     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                net.openid.appauth.q r3 = r7.f145081a     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                net.openid.appauth.i r3 = r3.f145160a     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                android.net.Uri r3 = r3.f145089b     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.net.HttpURLConnection r2 = r2.a(r3)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.lang.String r3 = "POST"
                r2.setRequestMethod(r3)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.lang.String r3 = "Content-Type"
                java.lang.String r4 = "application/x-www-form-urlencoded"
                r2.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                r7.a(r2)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                r3 = 1
                r2.setDoOutput(r3)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                AK.d r3 = r7.f145082b     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                net.openid.appauth.q r4 = r7.f145081a     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.lang.String r4 = r4.f145162c     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.util.Map r3 = r3.a(r4)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                if (r3 == 0) goto L_0x005e
                java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
            L_0x0037:
                boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                if (r4 == 0) goto L_0x005e
                java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                r2.setRequestProperty(r5, r4)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                goto L_0x0037
            L_0x0053:
                r8 = move-exception
                goto L_0x00e9
            L_0x0056:
                r2 = move-exception
                r3 = r1
                goto L_0x00c6
            L_0x005a:
                r2 = move-exception
                r3 = r1
                goto L_0x00da
            L_0x005e:
                net.openid.appauth.q r3 = r7.f145081a     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.util.Map r3 = r3.b()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                AK.d r4 = r7.f145082b     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                net.openid.appauth.q r5 = r7.f145081a     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.lang.String r5 = r5.f145162c     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.util.Map r4 = r4.b(r5)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                if (r4 == 0) goto L_0x0073
                r3.putAll(r4)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
            L_0x0073:
                java.lang.String r3 = DK.C15582b.b(r3)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.lang.String r4 = "Content-Length"
                int r5 = r3.length()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                r2.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                java.io.OutputStream r5 = r2.getOutputStream()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                r4.<init>(r5)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                r4.write(r3)     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                r4.flush()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                r4 = 200(0xc8, float:2.8E-43)
                if (r3 < r4) goto L_0x00a8
                int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                r4 = 300(0x12c, float:4.2E-43)
                if (r3 >= r4) goto L_0x00a8
                java.io.InputStream r2 = r2.getInputStream()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
                goto L_0x00ac
            L_0x00a8:
                java.io.InputStream r2 = r2.getErrorStream()     // Catch:{ IOException -> 0x005a, JSONException -> 0x0056, all -> 0x0053 }
            L_0x00ac:
                java.lang.String r3 = net.openid.appauth.s.b(r2)     // Catch:{ IOException -> 0x00c1, JSONException -> 0x00bc, all -> 0x00b9 }
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ IOException -> 0x00c1, JSONException -> 0x00bc, all -> 0x00b9 }
                r4.<init>(r3)     // Catch:{ IOException -> 0x00c1, JSONException -> 0x00bc, all -> 0x00b9 }
                net.openid.appauth.s.a(r2)
                return r4
            L_0x00b9:
                r8 = move-exception
                r1 = r2
                goto L_0x00e9
            L_0x00bc:
                r3 = move-exception
                r6 = r3
                r3 = r2
                r2 = r6
                goto L_0x00c6
            L_0x00c1:
                r3 = move-exception
                r6 = r3
                r3 = r2
                r2 = r6
                goto L_0x00da
            L_0x00c6:
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00d7 }
                DK.C15581a.b(r2, r8, r0)     // Catch:{ all -> 0x00d7 }
                net.openid.appauth.d r8 = net.openid.appauth.d.b.f145006f     // Catch:{ all -> 0x00d7 }
                net.openid.appauth.d r8 = net.openid.appauth.d.l(r8, r2)     // Catch:{ all -> 0x00d7 }
                r7.f145087g = r8     // Catch:{ all -> 0x00d7 }
            L_0x00d3:
                net.openid.appauth.s.a(r3)
                goto L_0x00e8
            L_0x00d7:
                r8 = move-exception
                r1 = r3
                goto L_0x00e9
            L_0x00da:
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00d7 }
                DK.C15581a.b(r2, r8, r0)     // Catch:{ all -> 0x00d7 }
                net.openid.appauth.d r8 = net.openid.appauth.d.b.f145004d     // Catch:{ all -> 0x00d7 }
                net.openid.appauth.d r8 = net.openid.appauth.d.l(r8, r2)     // Catch:{ all -> 0x00d7 }
                r7.f145087g = r8     // Catch:{ all -> 0x00d7 }
                goto L_0x00d3
            L_0x00e8:
                return r1
            L_0x00e9:
                net.openid.appauth.s.a(r1)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.h.a.doInBackground(java.lang.Void[]):org.json.JSONObject");
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(JSONObject jSONObject) {
            d dVar;
            d dVar2 = this.f145087g;
            if (dVar2 != null) {
                this.f145084d.a((r) null, dVar2);
            } else if (jSONObject.has(UiComponentContainer.RESULT_ERROR)) {
                try {
                    String string = jSONObject.getString(UiComponentContainer.RESULT_ERROR);
                    dVar = d.k(d.c.a(string), string, jSONObject.optString("error_description", (String) null), C15582b.e(jSONObject.optString("error_uri")));
                } catch (JSONException e10) {
                    dVar = d.l(d.b.f145006f, e10);
                }
                this.f145084d.a((r) null, dVar);
            } else {
                try {
                    r a10 = new r.a(this.f145081a).b(jSONObject).a();
                    String str = a10.f145185e;
                    if (str != null) {
                        try {
                            try {
                                n.a(str).c(this.f145081a, this.f145085e, this.f145086f);
                            } catch (d e11) {
                                this.f145084d.a((r) null, e11);
                                return;
                            }
                        } catch (n.a | JSONException e12) {
                            this.f145084d.a((r) null, d.l(d.b.f145009i, e12));
                            return;
                        }
                    }
                    C15581a.a("Token exchange with %s completed", this.f145081a.f145160a.f145089b);
                    this.f145084d.a(a10, (d) null);
                } catch (JSONException e13) {
                    this.f145084d.a((r) null, d.l(d.b.f145006f, e13));
                }
            }
        }
    }

    public interface b {
        void a(r rVar, d dVar);
    }

    public h(Context context) {
        this(context, C15444a.f133157d);
    }

    private void a() {
        if (this.f145080e) {
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        }
    }

    private Intent g(C15445b bVar, androidx.browser.customtabs.d dVar) {
        a();
        if (this.f145079d != null) {
            Uri a10 = bVar.a();
            Intent intent = this.f145079d.f133417d.booleanValue() ? dVar.f16598a : new Intent("android.intent.action.VIEW");
            intent.setPackage(this.f145079d.f133414a);
            intent.setData(a10);
            C15581a.a("Using %s as browser for auth, custom tab = %s", intent.getPackage(), this.f145079d.f133417d.toString());
            return intent;
        }
        throw new ActivityNotFoundException();
    }

    public d.C0230d b(Uri... uriArr) {
        a();
        return this.f145078c.e(uriArr);
    }

    @TargetApi(21)
    public Intent c(f fVar) {
        return d(fVar, b(new Uri[0]).a());
    }

    @TargetApi(21)
    public Intent d(f fVar, androidx.browser.customtabs.d dVar) {
        return AuthorizationManagementActivity.y(this.f145076a, fVar, g(fVar, dVar));
    }

    public void e(q qVar, AK.d dVar, b bVar) {
        a();
        C15581a.a("Initiating code exchange request to %s", qVar.f145160a.f145089b);
        new a(qVar, dVar, this.f145077b.b(), p.f145158a, bVar, Boolean.valueOf(this.f145077b.c())).execute(new Void[0]);
    }

    public void f(q qVar, b bVar) {
        e(qVar, f.f133165a, bVar);
    }

    public h(Context context, C15444a aVar) {
        this(context, aVar, C15484d.d(context, aVar.a()), new e(context));
    }

    h(Context context, C15444a aVar, C15482b bVar, e eVar) {
        this.f145080e = false;
        this.f145076a = (Context) g.d(context);
        this.f145077b = aVar;
        this.f145078c = eVar;
        this.f145079d = bVar;
        if (bVar != null && bVar.f133417d.booleanValue()) {
            eVar.c(bVar.f133414a);
        }
    }
}
