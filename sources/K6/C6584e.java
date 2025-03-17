package K6;

import android.app.Application;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

/* renamed from: K6.e  reason: case insensitive filesystem */
public class C6584e extends C6586g {

    /* renamed from: F  reason: collision with root package name */
    private static final String f37647F = "e";

    /* renamed from: G  reason: collision with root package name */
    private static final C6584e f37648G = new C6584e();

    /* renamed from: A  reason: collision with root package name */
    private String f37649A;

    /* renamed from: B  reason: collision with root package name */
    private String f37650B;

    /* renamed from: C  reason: collision with root package name */
    private long f37651C = System.currentTimeMillis();

    /* renamed from: D  reason: collision with root package name */
    public String f37652D;

    /* renamed from: E  reason: collision with root package name */
    private String f37653E = "";

    /* renamed from: K6.e$a */
    class a implements Runnable {
        a() {
        }

        public final void run() {
            C6584e eVar = C6584e.this;
            boolean unused = eVar.v(eVar.f37678v);
        }
    }

    private C6584e() {
    }

    public static C6584e s() {
        return f37648G;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0134, code lost:
        if (r2 == null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0177, code lost:
        if (r2 == null) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014f A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0164 A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0182  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:57:0x0122=Splitter:B:57:0x0122, B:62:0x013b=Splitter:B:62:0x013b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean v(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "payload"
            r1 = 3
            r12.k(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.f37657a
            r2.append(r3)
            java.lang.String r3 = "/_sec/cp_challenge/verify"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r4 = 0
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x011e, ProtocolException -> 0x011a, IOException -> 0x0116, JSONException -> 0x0112, all -> 0x010f }
            r5.<init>(r2)     // Catch:{ MalformedURLException -> 0x011e, ProtocolException -> 0x011a, IOException -> 0x0116, JSONException -> 0x0112, all -> 0x010f }
            java.net.URLConnection r2 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x011e, ProtocolException -> 0x011a, IOException -> 0x0116, JSONException -> 0x0112, all -> 0x010f }
            java.lang.Object r2 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r2)     // Catch:{ MalformedURLException -> 0x011e, ProtocolException -> 0x011a, IOException -> 0x0116, JSONException -> 0x0112, all -> 0x010f }
            java.net.URLConnection r2 = (java.net.URLConnection) r2     // Catch:{ MalformedURLException -> 0x011e, ProtocolException -> 0x011a, IOException -> 0x0116, JSONException -> 0x0112, all -> 0x010f }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ MalformedURLException -> 0x011e, ProtocolException -> 0x011a, IOException -> 0x0116, JSONException -> 0x0112, all -> 0x010f }
            r5 = 10000(0x2710, float:1.4013E-41)
            r2.setReadTimeout(r5)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r5 = 15000(0x3a98, float:2.102E-41)
            r2.setConnectTimeout(r5)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.lang.String r5 = "POST"
            r2.setRequestMethod(r5)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r2.setUseCaches(r3)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "application/json"
            r2.setRequestProperty(r5, r6)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.lang.String r5 = "User-Agent"
            java.lang.String r6 = K6.Q.d()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r2.setRequestProperty(r5, r6)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r5.<init>()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.lang.String r6 = "pow_response"
            r5.put(r6, r13)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.lang.String r13 = "context"
            java.lang.String r6 = r12.f37652D     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r5.put(r13, r6)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.io.DataOutputStream r13 = new java.io.DataOutputStream     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.io.OutputStream r6 = r2.getOutputStream()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r13.<init>(r6)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.lang.String r5 = r5.toString()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r13.write(r5)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r13.flush()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r13.close()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            int r13 = r2.getResponseCode()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r13 != r5) goto L_0x0104
            java.io.BufferedReader r13 = new java.io.BufferedReader     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.io.InputStream r6 = r2.getInputStream()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r5.<init>(r6)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r13.<init>(r5)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r5.<init>()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
        L_0x0096:
            java.lang.String r6 = r13.readLine()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            if (r6 == 0) goto L_0x00b4
            r5.append(r6)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            goto L_0x0096
        L_0x00a0:
            r13 = move-exception
            r4 = r2
            goto L_0x0183
        L_0x00a4:
            r13 = move-exception
            r5 = r3
            goto L_0x0122
        L_0x00a8:
            r13 = move-exception
            r5 = r3
            goto L_0x013b
        L_0x00ac:
            r13 = move-exception
            r5 = r3
            goto L_0x0150
        L_0x00b0:
            r13 = move-exception
            r5 = r3
            goto L_0x0165
        L_0x00b4:
            r13.close()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.lang.String r5 = r5.toString()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r13.<init>(r5)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            java.lang.String r5 = "success"
            boolean r5 = r13.getBoolean(r5)     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            int r6 = r12.f37658b     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            if (r6 != r1) goto L_0x00fa
            if (r5 == 0) goto L_0x00ec
            java.lang.String r0 = "token"
            java.lang.String r13 = r13.getString(r0)     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            r12.f37649A = r13     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            long r8 = r12.f37662f     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            long r6 = r6 + r8
            r12.f37651C = r6     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            r3 = r5
            goto L_0x010a
        L_0x00e2:
            r13 = move-exception
            goto L_0x0122
        L_0x00e4:
            r13 = move-exception
            goto L_0x013b
        L_0x00e6:
            r13 = move-exception
            goto L_0x0150
        L_0x00e9:
            r13 = move-exception
            goto L_0x0165
        L_0x00ec:
            boolean r6 = r13.has(r0)     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            if (r6 != 0) goto L_0x00f3
            goto L_0x010a
        L_0x00f3:
            java.lang.String r13 = r13.getString(r0)     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            r12.f37653E = r13     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            throw r4     // Catch:{ all -> 0x00a0 }
        L_0x00fa:
            java.lang.String r13 = f37647F     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            java.lang.String r0 = "Cancel Verify"
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            K6.C6595p.d(r13, r0, r6)     // Catch:{ MalformedURLException -> 0x00e9, ProtocolException -> 0x00e6, IOException -> 0x00e4, JSONException -> 0x00e2 }
            throw r4     // Catch:{ all -> 0x00a0 }
        L_0x0104:
            java.lang.String r13 = r2.getResponseMessage()     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
            r12.f37650B = r13     // Catch:{ MalformedURLException -> 0x00b0, ProtocolException -> 0x00ac, IOException -> 0x00a8, JSONException -> 0x00a4 }
        L_0x010a:
            r2.disconnect()
            goto L_0x017a
        L_0x010f:
            r13 = move-exception
            goto L_0x0183
        L_0x0112:
            r13 = move-exception
            r5 = r3
            r2 = r4
            goto L_0x0122
        L_0x0116:
            r13 = move-exception
            r5 = r3
            r2 = r4
            goto L_0x013b
        L_0x011a:
            r13 = move-exception
            r5 = r3
            r2 = r4
            goto L_0x0150
        L_0x011e:
            r13 = move-exception
            r5 = r3
            r2 = r4
            goto L_0x0165
        L_0x0122:
            java.lang.String r0 = f37647F     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = r13.toString()     // Catch:{ all -> 0x00a0 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x00a0 }
            K6.C6595p.e(r0, r6, r3)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "JSONException"
            r12.f37650B = r0     // Catch:{ all -> 0x00a0 }
            r13.printStackTrace()     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x0139
        L_0x0136:
            r2.disconnect()
        L_0x0139:
            r3 = r5
            goto L_0x017a
        L_0x013b:
            java.lang.String r0 = f37647F     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = r13.toString()     // Catch:{ all -> 0x00a0 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x00a0 }
            K6.C6595p.e(r0, r6, r3)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "IOException"
            r12.f37650B = r0     // Catch:{ all -> 0x00a0 }
            r13.printStackTrace()     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x0139
            goto L_0x0136
        L_0x0150:
            java.lang.String r0 = f37647F     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = r13.toString()     // Catch:{ all -> 0x00a0 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x00a0 }
            K6.C6595p.e(r0, r6, r3)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "ProtocolException"
            r12.f37650B = r0     // Catch:{ all -> 0x00a0 }
            r13.printStackTrace()     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x0139
            goto L_0x0136
        L_0x0165:
            java.lang.String r0 = f37647F     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = r13.toString()     // Catch:{ all -> 0x00a0 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x00a0 }
            K6.C6595p.e(r0, r6, r3)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "MalformedURLException"
            r12.f37650B = r0     // Catch:{ all -> 0x00a0 }
            r13.printStackTrace()     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x0139
            goto L_0x0136
        L_0x017a:
            int r13 = r12.f37658b
            if (r13 != r1) goto L_0x0182
            if (r3 == 0) goto L_0x0181
            throw r4
        L_0x0181:
            throw r4
        L_0x0182:
            throw r4
        L_0x0183:
            if (r4 == 0) goto L_0x0188
            r4.disconnect()
        L_0x0188:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.C6584e.v(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    public final void d(int i10) {
        throw null;
    }

    public final void h(Application application, String str, JSONObject jSONObject) {
        g(application, str);
    }

    /* access modifiers changed from: protected */
    public final void i(String str) {
        C6595p.e(f37647F, "Error: ".concat(String.valueOf(str)), new Throwable[0]);
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final String n() {
        StringBuilder sb2 = new StringBuilder(this.f37657a + "/_bm/get_params?type=sdk-cca");
        try {
            String str = this.f37652D;
            if (str != null) {
                if (!str.equals("")) {
                    sb2.append("&context=");
                    sb2.append(URLEncoder.encode(this.f37652D, Constants.ENCODING));
                }
            }
            String str2 = this.f37653E;
            if (str2 != null && !str2.equals("")) {
                sb2.append("&payload=");
                sb2.append(URLEncoder.encode(this.f37653E, Constants.ENCODING));
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f37653E = "";
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final void o() {
        new Thread(new a()).start();
    }

    /* access modifiers changed from: protected */
    public final void p() {
        super.p();
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized String u() {
        if (this.f37649A != null) {
            if (System.currentTimeMillis() <= this.f37651C) {
                return this.f37649A;
            }
        }
        return "";
    }
}
