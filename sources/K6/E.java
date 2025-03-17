package K6;

import K6.r;
import android.os.Handler;
import android.os.Looper;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

final class E {

    /* renamed from: a  reason: collision with root package name */
    r.a f37569a;

    /* renamed from: b  reason: collision with root package name */
    ExecutorService f37570b = Executors.newSingleThreadExecutor();

    /* renamed from: c  reason: collision with root package name */
    private Handler f37571c = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ URL f37572a;

        a(URL url) {
            this.f37572a = url;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0088=Splitter:B:28:0x0088, B:34:0x00ad=Splitter:B:34:0x00ad} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                java.lang.String r0 = "CYFNetworkServiceTask"
                r1 = 0
                r2 = 0
                java.net.URL r3 = r7.f37572a     // Catch:{ JSONException -> 0x0085, Exception -> 0x0082, all -> 0x007f }
                java.net.URLConnection r3 = r3.openConnection()     // Catch:{ JSONException -> 0x0085, Exception -> 0x0082, all -> 0x007f }
                java.lang.Object r3 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r3)     // Catch:{ JSONException -> 0x0085, Exception -> 0x0082, all -> 0x007f }
                java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ JSONException -> 0x0085, Exception -> 0x0082, all -> 0x007f }
                java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ JSONException -> 0x0085, Exception -> 0x0082, all -> 0x007f }
                r4 = 10000(0x2710, float:1.4013E-41)
                r3.setReadTimeout(r4)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                r4 = 15000(0x3a98, float:2.102E-41)
                r3.setConnectTimeout(r4)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                java.lang.String r4 = "GET"
                r3.setRequestMethod(r4)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                r3.setUseCaches(r1)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                java.lang.String r4 = "User-Agent"
                java.lang.String r5 = K6.Q.d()     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                r3.setRequestProperty(r4, r5)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                int r4 = r3.getResponseCode()     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                r5 = 200(0xc8, float:2.8E-43)
                if (r4 == r5) goto L_0x004c
                java.lang.String r5 = "Failed to get PoW Params, HTTP response code: "
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                java.lang.String r4 = r5.concat(r4)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                java.lang.Throwable[] r5 = new java.lang.Throwable[r1]     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                K6.C6595p.e(r0, r4, r5)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                goto L_0x0076
            L_0x0045:
                r0 = move-exception
                goto L_0x00cf
            L_0x0048:
                r4 = move-exception
                goto L_0x0088
            L_0x004a:
                r4 = move-exception
                goto L_0x00ad
            L_0x004c:
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                java.io.InputStream r6 = r3.getInputStream()     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                r5.<init>(r6)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                r4.<init>(r5)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                r5.<init>()     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
            L_0x005f:
                java.lang.String r6 = r4.readLine()     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                if (r6 == 0) goto L_0x0069
                r5.append(r6)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                goto L_0x005f
            L_0x0069:
                r4.close()     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                r4.<init>(r5)     // Catch:{ JSONException -> 0x004a, Exception -> 0x0048 }
                r2 = r4
            L_0x0076:
                r3.disconnect()
                K6.E r0 = K6.E.this
                r0.a(r2)
                return
            L_0x007f:
                r0 = move-exception
                r3 = r2
                goto L_0x00cf
            L_0x0082:
                r4 = move-exception
                r3 = r2
                goto L_0x0088
            L_0x0085:
                r4 = move-exception
                r3 = r2
                goto L_0x00ad
            L_0x0088:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
                java.lang.String r6 = "Exception:"
                r5.<init>(r6)     // Catch:{ all -> 0x0045 }
                java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0045 }
                r5.append(r6)     // Catch:{ all -> 0x0045 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0045 }
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]     // Catch:{ all -> 0x0045 }
                K6.C6595p.e(r0, r5, r1)     // Catch:{ all -> 0x0045 }
                r4.printStackTrace()     // Catch:{ all -> 0x0045 }
                if (r3 == 0) goto L_0x00a7
                r3.disconnect()
            L_0x00a7:
                K6.E r0 = K6.E.this
                r0.a(r2)
                return
            L_0x00ad:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
                java.lang.String r6 = "JSONException:"
                r5.<init>(r6)     // Catch:{ all -> 0x0045 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0045 }
                r5.append(r4)     // Catch:{ all -> 0x0045 }
                java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0045 }
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]     // Catch:{ all -> 0x0045 }
                K6.C6595p.e(r0, r4, r1)     // Catch:{ all -> 0x0045 }
                if (r3 == 0) goto L_0x00c9
                r3.disconnect()
            L_0x00c9:
                K6.E r0 = K6.E.this
                r0.a(r2)
                return
            L_0x00cf:
                if (r3 == 0) goto L_0x00d4
                r3.disconnect()
            L_0x00d4:
                K6.E r1 = K6.E.this
                r1.a(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: K6.E.a.run():void");
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f37574a;

        b(JSONObject jSONObject) {
            this.f37574a = jSONObject;
        }

        public final void run() {
            JSONObject jSONObject = this.f37574a;
            if (jSONObject != null) {
                E.this.f37569a.a(jSONObject);
            } else {
                E.this.f37569a.a();
            }
        }
    }

    E(r.a aVar) {
        this.f37569a = aVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) {
        this.f37571c.post(new b(jSONObject));
    }
}
