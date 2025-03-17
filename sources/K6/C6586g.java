package K6;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: K6.g  reason: case insensitive filesystem */
public class C6586g {

    /* renamed from: y  reason: collision with root package name */
    private static final Locale f37655y = Locale.US;

    /* renamed from: z  reason: collision with root package name */
    private static final C6586g f37656z = new C6586g();

    /* renamed from: a  reason: collision with root package name */
    String f37657a;

    /* renamed from: b  reason: collision with root package name */
    public int f37658b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f37659c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f37660d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f37661e;

    /* renamed from: f  reason: collision with root package name */
    long f37662f;

    /* renamed from: g  reason: collision with root package name */
    private long f37663g;

    /* renamed from: h  reason: collision with root package name */
    private long f37664h;

    /* renamed from: i  reason: collision with root package name */
    private long f37665i;

    /* renamed from: j  reason: collision with root package name */
    private long f37666j;

    /* renamed from: k  reason: collision with root package name */
    private String f37667k;

    /* renamed from: l  reason: collision with root package name */
    private String f37668l;

    /* renamed from: m  reason: collision with root package name */
    private long f37669m;

    /* renamed from: n  reason: collision with root package name */
    private String f37670n;

    /* renamed from: o  reason: collision with root package name */
    private int f37671o;

    /* renamed from: p  reason: collision with root package name */
    private int f37672p;

    /* renamed from: q  reason: collision with root package name */
    private long f37673q;

    /* renamed from: r  reason: collision with root package name */
    private ArrayList<String> f37674r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    private ArrayList<Long> f37675s = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<Integer> f37676t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    private String f37677u = "";

    /* renamed from: v  reason: collision with root package name */
    String f37678v = "";

    /* renamed from: w  reason: collision with root package name */
    private int f37679w = 0;

    /* renamed from: x  reason: collision with root package name */
    public String f37680x = "";

    /* renamed from: K6.g$a */
    class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f37681a;

        /* renamed from: K6.g$a$a  reason: collision with other inner class name */
        class C0598a implements Runnable {
            C0598a() {
            }

            public final void run() {
                a aVar = a.this;
                C6586g.f(C6586g.this, aVar.f37681a);
            }
        }

        a(int i10) {
            this.f37681a = i10;
        }

        public final void run() {
            new Thread(new C0598a()).start();
        }
    }

    /* renamed from: K6.g$b */
    class b extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f37684a;

        /* renamed from: K6.g$b$a */
        class a implements Runnable {
            a() {
            }

            public final void run() {
                b bVar = b.this;
                C6586g.m(C6586g.this, bVar.f37684a);
            }
        }

        b(int i10) {
            this.f37684a = i10;
        }

        public final void run() {
            new Thread(new a()).start();
        }
    }

    C6586g() {
    }

    private static long a(byte[] bArr, long j10) {
        long j11 = 0;
        for (byte b10 : bArr) {
            j11 = ((j11 << 8) | ((long) (b10 & 255))) % j10;
        }
        return j11;
    }

    private Boolean b(JSONObject jSONObject, int i10) {
        try {
            this.f37660d = jSONObject.getInt("mode");
            this.f37661e = jSONObject.getString("nonce");
            this.f37662f = jSONObject.getLong("ttl");
            this.f37663g = jSONObject.getLong("difficulty");
            this.f37664h = jSONObject.getLong("timeout");
            if (i10 == 0) {
                this.f37665i = jSONObject.getLong("n");
            }
            this.f37666j = jSONObject.getLong("s_timeout");
            this.f37667k = jSONObject.getString("checksum");
            if (this.f37660d != 0) {
                this.f37680x = "Enabled";
                this.f37659c = 0;
                this.f37669m = SystemClock.uptimeMillis();
                this.f37670n = this.f37668l + this.f37669m + this.f37661e;
                this.f37677u = this.f37668l + ";" + this.f37669m + ";" + this.f37661e + ";" + this.f37663g + ";" + this.f37667k;
                this.f37673q = SystemClock.uptimeMillis();
                this.f37671o = 0;
                if (this.f37658b == 2) {
                    C6595p.d("PoW", "Cancel Get Params", new Throwable[0]);
                    p();
                    return Boolean.TRUE;
                }
                l(100, i10);
            } else {
                k(0);
                this.f37680x = "Disabled";
            }
            if (i10 == 0) {
                e(this.f37662f * 1000, i10);
            }
            return Boolean.TRUE;
        } catch (Exception e10) {
            C6595p.e("PoW", "Exception:".concat(String.valueOf(e10)), new Throwable[0]);
            e10.printStackTrace();
            return Boolean.FALSE;
        }
    }

    private void c() {
        this.f37671o = 0;
        this.f37672p = 0;
        this.f37674r = new ArrayList<>();
        this.f37675s = new ArrayList<>();
        this.f37676t = new ArrayList<>();
        p();
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v3, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        K6.C6595p.c("PoW", "Getting PoW Parameters from Akamai...\"", new java.lang.Throwable[0]);
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = (java.net.HttpURLConnection) ((java.net.URLConnection) com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(new java.net.URL(r8.n()).openConnection()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.setReadTimeout(10000);
        r2.setConnectTimeout(15000);
        r2.setRequestMethod("GET");
        r2.setUseCaches(false);
        r2.setRequestProperty("User-Agent", K6.Q.d());
        r4 = r2.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r4 == 200) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        K6.C6595p.e("PoW", "Failed to get PoW Params, HTTP response code: ".concat(java.lang.String.valueOf(r4)), new java.lang.Throwable[0]);
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        r4 = new java.io.BufferedReader(new java.io.InputStreamReader(r2.getInputStream()));
        r5 = new java.lang.StringBuffer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        r6 = r4.readLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        if (r6 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        r5.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        r1 = new org.json.JSONObject(r5.toString());
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        r2.disconnect();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a9, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        K6.C6595p.e("PoW", "Exception:" + r4.toString(), new java.lang.Throwable[0]);
        r4.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
        if (r2 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c9, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        K6.C6595p.e("PoW", "JSONException:" + r4.toString(), new java.lang.Throwable[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e6, code lost:
        if (r2 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e9, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ea, code lost:
        if (r1 == 0) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ec, code lost:
        r4 = r8.b(r1, r9).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f4, code lost:
        if (r4 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f6, code lost:
        r8.i("Get Params error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fb, code lost:
        if (r9 != 1) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fd, code lost:
        r8.k(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0101, code lost:
        r1 = r8.f37659c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0105, code lost:
        if (r1 >= 10) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0107, code lost:
        r8.f37659c = r1 + 1;
        r8.e(5000, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010f, code lost:
        r8.k(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0113, code lost:
        if (r1 != 0) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0115, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0118, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void f(K6.C6586g r8, int r9) {
        /*
            monitor-enter(r8)
            int r0 = r8.f37658b     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x0011
            r9 = 2
            if (r0 != r9) goto L_0x000f
            r8.p()     // Catch:{ all -> 0x000c }
            goto L_0x000f
        L_0x000c:
            r9 = move-exception
            goto L_0x0119
        L_0x000f:
            monitor-exit(r8)     // Catch:{ all -> 0x000c }
            return
        L_0x0011:
            r0 = 1
            r8.f37658b = r0     // Catch:{ all -> 0x000c }
            monitor-exit(r8)     // Catch:{ all -> 0x000c }
            java.lang.String r1 = "PoW"
            java.lang.String r2 = "Getting PoW Parameters from Akamai...\""
            r3 = 0
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            K6.C6595p.c(r1, r2, r4)
            r1 = 0
            java.lang.String r2 = r8.n()     // Catch:{ JSONException -> 0x00a8, Exception -> 0x00a5, all -> 0x00a2 }
            java.net.URL r4 = new java.net.URL     // Catch:{ JSONException -> 0x00a8, Exception -> 0x00a5, all -> 0x00a2 }
            r4.<init>(r2)     // Catch:{ JSONException -> 0x00a8, Exception -> 0x00a5, all -> 0x00a2 }
            java.net.URLConnection r2 = r4.openConnection()     // Catch:{ JSONException -> 0x00a8, Exception -> 0x00a5, all -> 0x00a2 }
            java.lang.Object r2 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r2)     // Catch:{ JSONException -> 0x00a8, Exception -> 0x00a5, all -> 0x00a2 }
            java.net.URLConnection r2 = (java.net.URLConnection) r2     // Catch:{ JSONException -> 0x00a8, Exception -> 0x00a5, all -> 0x00a2 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ JSONException -> 0x00a8, Exception -> 0x00a5, all -> 0x00a2 }
            r4 = 10000(0x2710, float:1.4013E-41)
            r2.setReadTimeout(r4)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            r4 = 15000(0x3a98, float:2.102E-41)
            r2.setConnectTimeout(r4)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            java.lang.String r4 = "GET"
            r2.setRequestMethod(r4)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            r2.setUseCaches(r3)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = K6.Q.d()     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            r2.setRequestProperty(r4, r5)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            int r4 = r2.getResponseCode()     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x0073
            java.lang.String r5 = "PoW"
            java.lang.String r6 = "Failed to get PoW Params, HTTP response code: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            java.lang.String r4 = r6.concat(r4)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            K6.C6595p.e(r5, r4, r6)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            r4 = r3
            goto L_0x009e
        L_0x006b:
            r8 = move-exception
            r1 = r2
            goto L_0x0113
        L_0x006f:
            r4 = move-exception
            goto L_0x00ab
        L_0x0071:
            r4 = move-exception
            goto L_0x00cd
        L_0x0073:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            java.io.InputStream r6 = r2.getInputStream()     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            r5.<init>(r6)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            r5.<init>()     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
        L_0x0086:
            java.lang.String r6 = r4.readLine()     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            if (r6 == 0) goto L_0x0090
            r5.append(r6)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            goto L_0x0086
        L_0x0090:
            r4.close()     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0071, Exception -> 0x006f }
            r1 = r4
            r4 = r0
        L_0x009e:
            r2.disconnect()
            goto L_0x00ea
        L_0x00a2:
            r8 = move-exception
            goto L_0x0113
        L_0x00a5:
            r4 = move-exception
            r2 = r1
            goto L_0x00ab
        L_0x00a8:
            r4 = move-exception
            r2 = r1
            goto L_0x00cd
        L_0x00ab:
            java.lang.String r5 = "PoW"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            java.lang.String r7 = "Exception:"
            r6.<init>(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x006b }
            r6.append(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006b }
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x006b }
            K6.C6595p.e(r5, r6, r7)     // Catch:{ all -> 0x006b }
            r4.printStackTrace()     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x00e9
        L_0x00c9:
            r2.disconnect()
            goto L_0x00e9
        L_0x00cd:
            java.lang.String r5 = "PoW"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            java.lang.String r7 = "JSONException:"
            r6.<init>(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x006b }
            r6.append(r4)     // Catch:{ all -> 0x006b }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x006b }
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x006b }
            K6.C6595p.e(r5, r4, r6)     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x00e9
            goto L_0x00c9
        L_0x00e9:
            r4 = r3
        L_0x00ea:
            if (r1 == 0) goto L_0x00f4
            java.lang.Boolean r1 = r8.b(r1, r9)
            boolean r4 = r1.booleanValue()
        L_0x00f4:
            if (r4 != 0) goto L_0x0112
            java.lang.String r1 = "Get Params error"
            r8.i(r1)
            if (r9 != r0) goto L_0x0101
            r8.k(r3)
            return
        L_0x0101:
            int r1 = r8.f37659c
            r2 = 10
            if (r1 >= r2) goto L_0x010f
            int r1 = r1 + r0
            r8.f37659c = r1
            r0 = 5000(0x1388, double:2.4703E-320)
            r8.e(r0, r9)
        L_0x010f:
            r8.k(r3)
        L_0x0112:
            return
        L_0x0113:
            if (r1 == 0) goto L_0x0118
            r1.disconnect()
        L_0x0118:
            throw r8
        L_0x0119:
            monitor-exit(r8)     // Catch:{ all -> 0x000c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.C6586g.f(K6.g, int):void");
    }

    private void j() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f37677u);
        sb2.append(";");
        Iterator<String> it = this.f37674r.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(";");
        Iterator<Long> it2 = this.f37675s.iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(";");
        Iterator<Integer> it3 = this.f37676t.iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            sb2.append(",");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        synchronized (this) {
            this.f37678v = sb2.toString();
            this.f37679w = 0;
        }
        C6595p.c("PoW", "PoW Data: " + this.f37678v, new Throwable[0]);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f37669m;
        C6595p.c("PoW", "Time taken to solve PoW challenge: " + uptimeMillis + "ms", new Throwable[0]);
        this.f37680x = "Solved in " + uptimeMillis + "ms";
    }

    private void l(long j10, int i10) {
        new Timer().schedule(new b(i10), j10);
    }

    static /* synthetic */ void m(C6586g gVar, int i10) {
        long j10;
        C6586g gVar2 = gVar;
        int i11 = i10;
        if (gVar2.f37658b == 2) {
            gVar.c();
            return;
        }
        C6595p.c("PoW", "computeProofOfWork, Challenge Count: " + gVar2.f37671o, new Throwable[0]);
        gVar2.f37680x = "Solving MC: " + gVar2.f37671o;
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j11 = gVar2.f37663g + ((long) gVar2.f37671o);
            Random random = new Random();
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(f37655y);
            decimalFormat.applyPattern("#.############");
            boolean z10 = false;
            long j12 = 0;
            while (true) {
                if (z10) {
                    break;
                }
                String format = decimalFormat.format(random.nextDouble());
                String str = gVar2.f37670n + j11 + format;
                MessageDigest instance = MessageDigest.getInstance(Constants.SHA256);
                instance.update(str.getBytes());
                if (a(instance.digest(), j11) != 0) {
                    j10 = j11;
                    int i12 = gVar2.f37672p + 1;
                    gVar2.f37672p = i12;
                    if (i12 % 1000 == 0) {
                        j12 = SystemClock.uptimeMillis() - uptimeMillis;
                        long j13 = gVar2.f37666j;
                        if (j12 > j13 && gVar2.f37658b != 2) {
                            gVar2.l(j13 + 1000, i11);
                            break;
                        }
                    }
                } else {
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    j12 = uptimeMillis2 - uptimeMillis;
                    j10 = j11;
                    long j14 = uptimeMillis2 - gVar2.f37673q;
                    C6595p.c("PoW", "Challenge (" + str + ") " + gVar2.f37671o + " solved at iteration: " + gVar2.f37672p + " in " + j14 + "ms", new Throwable[0]);
                    gVar2.f37674r.add(format);
                    gVar2.f37676t.add(Integer.valueOf(gVar2.f37672p));
                    gVar2.f37675s.add(Long.valueOf(j14));
                    z10 = true;
                }
                if (gVar2.f37658b == 2) {
                    gVar.c();
                    return;
                }
                j11 = j10;
            }
            if (z10) {
                gVar2.f37671o++;
                gVar2.f37673q = SystemClock.uptimeMillis();
                gVar2.d(gVar2.f37671o);
                if (gVar2.f37671o < 10) {
                    gVar2.f37672p = 0;
                    gVar2.l(gVar2.f37664h + j12, i11);
                    return;
                }
                gVar2.f37672p = 0;
                gVar.j();
                gVar2.f37674r = new ArrayList<>();
                gVar2.f37675s = new ArrayList<>();
                gVar2.f37676t = new ArrayList<>();
                gVar2.k(0);
                if (SystemClock.uptimeMillis() - gVar2.f37669m > gVar2.f37662f * 1000 && i11 == 0) {
                    gVar2.e(100, i11);
                }
                gVar.o();
            }
        } catch (NoSuchAlgorithmException e10) {
            C6595p.e("PoW", "computeProofOfWork: " + e10.toString(), new Throwable[0]);
        }
    }

    public static C6586g q() {
        return f37656z;
    }

    /* access modifiers changed from: protected */
    public void d(int i10) {
    }

    public final void e(long j10, int i10) {
        new Timer().schedule(new a(i10), j10);
    }

    public final void g(Application application, String str) {
        this.f37657a = str;
        this.f37668l = Q.e(application);
    }

    public void h(Application application, String str, JSONObject jSONObject) {
        g(application, str);
        if (jSONObject == null) {
            e(1000, 0);
        } else {
            b(jSONObject, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void i(String str) {
        C6595p.e("PoW", "Error: ".concat(String.valueOf(str)), new Throwable[0]);
    }

    /* access modifiers changed from: package-private */
    public final void k(int i10) {
        synchronized (this) {
            this.f37658b = i10;
        }
    }

    /* access modifiers changed from: package-private */
    public String n() {
        return this.f37657a + "/_bm/get_params?type=sdk-pow";
    }

    /* access modifiers changed from: protected */
    public void o() {
        C6587h.a().d(this.f37678v);
    }

    /* access modifiers changed from: protected */
    public void p() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized String r() {
        if (this.f37660d == 0) {
            return "";
        }
        if (this.f37678v.length() != 0) {
            int i10 = this.f37679w + 1;
            this.f37679w = i10;
            if (((double) i10) >= ((double) this.f37665i) * 0.9d) {
                e(100, 0);
            }
            return this.f37678v;
        } else if (this.f37677u.length() == 0) {
            Context context = C6587h.a().f37688a.get();
            if (context == null) {
                C6595p.d("SensorDataCache", "getPoWResponse: Context is null", new Throwable[0]);
            } else {
                String string = context.getSharedPreferences("com.akamai.botman.preferences", 0).getString("pow_response", (String) null);
                if (string != null) {
                    return string;
                }
            }
            return "";
        } else {
            return this.f37677u;
        }
    }
}
