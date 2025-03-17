package com.google.firebase.remoteconfig.internal;

import Fb.f;
import Ic.c;
import Ic.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.j;
import com.google.firebase.installations.g;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nc.e;
import org.json.JSONObject;
import xa.C8971l;
import xa.C8974o;

public class s {

    /* renamed from: q  reason: collision with root package name */
    static final int[] f68809q = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f68810r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    private final Set<c> f68811a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f68812b;

    /* renamed from: c  reason: collision with root package name */
    private int f68813c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f68814d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f68815e;

    /* renamed from: f  reason: collision with root package name */
    private final int f68816f = 8;

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledExecutorService f68817g;

    /* renamed from: h  reason: collision with root package name */
    private final m f68818h;

    /* renamed from: i  reason: collision with root package name */
    private final f f68819i;

    /* renamed from: j  reason: collision with root package name */
    private final e f68820j;

    /* renamed from: k  reason: collision with root package name */
    f f68821k;

    /* renamed from: l  reason: collision with root package name */
    private final Context f68822l;

    /* renamed from: m  reason: collision with root package name */
    private final String f68823m;

    /* renamed from: n  reason: collision with root package name */
    private final Random f68824n;

    /* renamed from: o  reason: collision with root package name */
    private final com.google.android.gms.common.util.e f68825o;

    /* renamed from: p  reason: collision with root package name */
    private final t f68826p;

    class a implements Runnable {
        a() {
        }

        public void run() {
            s.this.e();
        }
    }

    class b implements c {
        b() {
        }

        public void a(i iVar) {
            s.this.j();
            s.this.u(iVar);
        }

        public void b(Ic.b bVar) {
        }
    }

    public s(f fVar, e eVar, m mVar, f fVar2, Context context, String str, Set<c> set, t tVar, ScheduledExecutorService scheduledExecutorService) {
        this.f68811a = set;
        this.f68812b = false;
        this.f68817g = scheduledExecutorService;
        this.f68824n = new Random();
        this.f68813c = Math.max(8 - tVar.i().b(), 1);
        this.f68825o = h.d();
        this.f68819i = fVar;
        this.f68818h = mVar;
        this.f68820j = eVar;
        this.f68821k = fVar2;
        this.f68822l = context;
        this.f68823m = str;
        this.f68826p = tVar;
        this.f68814d = false;
        this.f68815e = false;
    }

    private void D(Date date) {
        int b10 = this.f68826p.i().b() + 1;
        this.f68826p.o(b10, new Date(date.getTime() + m(b10)));
    }

    private synchronized boolean f() {
        return !this.f68811a.isEmpty() && !this.f68812b && !this.f68814d && !this.f68815e;
    }

    private JSONObject i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", k(this.f68819i.n().c()));
        hashMap.put("namespace", this.f68823m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f68818h.r()));
        hashMap.put("appId", this.f68819i.n().c());
        hashMap.put("sdkVersion", "22.1.0");
        hashMap.put("appInstanceId", str);
        return new JSONObject(hashMap);
    }

    /* access modifiers changed from: private */
    public synchronized void j() {
        this.f68814d = true;
    }

    private static String k(String str) {
        Matcher matcher = f68810r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String l() {
        try {
            Context context = this.f68822l;
            byte[] a10 = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (a10 != null) {
                return j.b(a10, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f68822l.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f68822l.getPackageName());
            return null;
        }
    }

    private long m(int i10) {
        int[] iArr = f68809q;
        int length = iArr.length;
        if (i10 >= length) {
            i10 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis((long) iArr[i10 - 1]);
        return (millis / 2) + ((long) this.f68824n.nextInt((int) millis));
    }

    private String n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", new Object[]{k(this.f68819i.n().c()), str});
    }

    private URL o() {
        try {
            return new URL(n(this.f68823m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean p(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ xa.C8971l q(xa.C8971l r10, xa.C8971l r11) {
        /*
            r9 = this;
            java.lang.String r11 = "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"
            r0 = 403(0x193, float:5.65E-43)
            r1 = 1
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 0
            r4 = 0
            boolean r5 = r10.q()     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            if (r5 == 0) goto L_0x008b
            r9.y(r1)     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            java.lang.Object r10 = r10.m()     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            int r5 = r10.getResponseCode()     // Catch:{ IOException -> 0x007e, all -> 0x0079 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x007e, all -> 0x0079 }
            if (r5 != r2) goto L_0x0037
            r9.v()     // Catch:{ IOException -> 0x0035 }
            com.google.firebase.remoteconfig.internal.t r7 = r9.f68826p     // Catch:{ IOException -> 0x0035 }
            r7.k()     // Catch:{ IOException -> 0x0035 }
            com.google.firebase.remoteconfig.internal.b r7 = r9.B(r10)     // Catch:{ IOException -> 0x0035 }
            r7.i()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0037
        L_0x0032:
            r4 = move-exception
            goto L_0x00f0
        L_0x0035:
            r5 = move-exception
            goto L_0x0095
        L_0x0037:
            r9.g(r10)
            r9.y(r3)
            boolean r1 = r9.p(r5)
            if (r1 == 0) goto L_0x0051
            java.util.Date r3 = new java.util.Date
            com.google.android.gms.common.util.e r7 = r9.f68825o
            long r7 = r7.a()
            r3.<init>(r7)
            r9.D(r3)
        L_0x0051:
            if (r1 != 0) goto L_0x0074
            if (r5 != r2) goto L_0x0056
            goto L_0x0074
        L_0x0056:
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r11 = java.lang.String.format(r11, r1)
            if (r5 != r0) goto L_0x0068
            java.io.InputStream r10 = r10.getErrorStream()
            java.lang.String r11 = r9.t(r10)
        L_0x0068:
            Ic.l r10 = new Ic.l
            Ic.i$a r0 = Ic.i.a.CONFIG_UPDATE_STREAM_ERROR
            r10.<init>((int) r5, (java.lang.String) r11, (Ic.i.a) r0)
        L_0x006f:
            r9.u(r10)
            goto L_0x00eb
        L_0x0074:
            r9.w()
            goto L_0x00eb
        L_0x0079:
            r5 = move-exception
            r6 = r4
            r4 = r5
            goto L_0x00f0
        L_0x007e:
            r5 = move-exception
            r6 = r4
            goto L_0x0095
        L_0x0081:
            r10 = move-exception
            r6 = r4
            r4 = r10
            r10 = r6
            goto L_0x00f0
        L_0x0087:
            r5 = move-exception
            r10 = r4
            r6 = r10
            goto L_0x0095
        L_0x008b:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            java.lang.Exception r10 = r10.l()     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            r5.<init>(r10)     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            throw r5     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
        L_0x0095:
            java.lang.String r7 = "FirebaseRemoteConfig"
            java.lang.String r8 = "Exception connecting to real-time RC backend. Retrying the connection..."
            android.util.Log.d(r7, r8, r5)     // Catch:{ all -> 0x0032 }
            r9.g(r10)
            r9.y(r3)
            if (r6 == 0) goto L_0x00b0
            int r5 = r6.intValue()
            boolean r5 = r9.p(r5)
            if (r5 == 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r1 = r3
        L_0x00b0:
            if (r1 == 0) goto L_0x00c0
            java.util.Date r3 = new java.util.Date
            com.google.android.gms.common.util.e r5 = r9.f68825o
            long r7 = r5.a()
            r3.<init>(r7)
            r9.D(r3)
        L_0x00c0:
            if (r1 != 0) goto L_0x0074
            int r1 = r6.intValue()
            if (r1 != r2) goto L_0x00c9
            goto L_0x0074
        L_0x00c9:
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r11 = java.lang.String.format(r11, r1)
            int r1 = r6.intValue()
            if (r1 != r0) goto L_0x00df
            java.io.InputStream r10 = r10.getErrorStream()
            java.lang.String r11 = r9.t(r10)
        L_0x00df:
            Ic.l r10 = new Ic.l
            int r0 = r6.intValue()
            Ic.i$a r1 = Ic.i.a.CONFIG_UPDATE_STREAM_ERROR
            r10.<init>((int) r0, (java.lang.String) r11, (Ic.i.a) r1)
            goto L_0x006f
        L_0x00eb:
            xa.l r10 = xa.C8974o.f(r4)
            return r10
        L_0x00f0:
            r9.g(r10)
            r9.y(r3)
            if (r6 == 0) goto L_0x0104
            int r5 = r6.intValue()
            boolean r5 = r9.p(r5)
            if (r5 == 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r1 = r3
        L_0x0104:
            if (r1 == 0) goto L_0x0114
            java.util.Date r3 = new java.util.Date
            com.google.android.gms.common.util.e r5 = r9.f68825o
            long r7 = r5.a()
            r3.<init>(r7)
            r9.D(r3)
        L_0x0114:
            if (r1 != 0) goto L_0x0141
            int r1 = r6.intValue()
            if (r1 == r2) goto L_0x0141
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r11 = java.lang.String.format(r11, r1)
            int r1 = r6.intValue()
            if (r1 != r0) goto L_0x0132
            java.io.InputStream r10 = r10.getErrorStream()
            java.lang.String r11 = r9.t(r10)
        L_0x0132:
            Ic.l r10 = new Ic.l
            int r0 = r6.intValue()
            Ic.i$a r1 = Ic.i.a.CONFIG_UPDATE_STREAM_ERROR
            r10.<init>((int) r0, (java.lang.String) r11, (Ic.i.a) r1)
            r9.u(r10)
            goto L_0x0144
        L_0x0141:
            r9.w()
        L_0x0144:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.s.q(xa.l, xa.l):xa.l");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8971l r(C8971l lVar, C8971l lVar2, C8971l lVar3) {
        if (!lVar.q()) {
            return C8974o.e(new Ic.h("Firebase Installations failed to get installation auth token for config update listener connection.", (Throwable) lVar.l()));
        }
        if (!lVar2.q()) {
            return C8974o.e(new Ic.h("Firebase Installations failed to get installation ID for config update listener connection.", (Throwable) lVar2.l()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) o().openConnection();
            A(httpURLConnection, (String) lVar2.m(), ((g) lVar.m()).b());
            return C8974o.f(httpURLConnection);
        } catch (IOException e10) {
            return C8974o.e(new Ic.h("Failed to open HTTP stream connection", (Throwable) e10));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void s(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f()     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            int r0 = r3.f68813c     // Catch:{ all -> 0x001e }
            if (r0 <= 0) goto L_0x0020
            int r0 = r0 + -1
            r3.f68813c = r0     // Catch:{ all -> 0x001e }
            java.util.concurrent.ScheduledExecutorService r0 = r3.f68817g     // Catch:{ all -> 0x001e }
            com.google.firebase.remoteconfig.internal.s$a r1 = new com.google.firebase.remoteconfig.internal.s$a     // Catch:{ all -> 0x001e }
            r1.<init>()     // Catch:{ all -> 0x001e }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x001e }
            r0.schedule(r1, r4, r2)     // Catch:{ all -> 0x001e }
            goto L_0x0030
        L_0x001e:
            r4 = move-exception
            goto L_0x0032
        L_0x0020:
            boolean r4 = r3.f68815e     // Catch:{ all -> 0x001e }
            if (r4 != 0) goto L_0x0030
            Ic.h r4 = new Ic.h     // Catch:{ all -> 0x001e }
            java.lang.String r5 = "Unable to connect to the server. Check your connection and try again."
            Ic.i$a r0 = Ic.i.a.CONFIG_UPDATE_STREAM_ERROR     // Catch:{ all -> 0x001e }
            r4.<init>((java.lang.String) r5, (Ic.i.a) r0)     // Catch:{ all -> 0x001e }
            r3.u(r4)     // Catch:{ all -> 0x001e }
        L_0x0030:
            monitor-exit(r3)
            return
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.s.s(long):void");
    }

    private String t(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public synchronized void u(i iVar) {
        for (c a10 : this.f68811a) {
            a10.a(iVar);
        }
    }

    private synchronized void v() {
        this.f68813c = 8;
    }

    private void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f68819i.n().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f68822l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void y(boolean z10) {
        this.f68812b = z10;
    }

    @SuppressLint({"VisibleForTests"})
    public void A(HttpURLConnection httpURLConnection, String str, String str2) {
        httpURLConnection.setRequestMethod("POST");
        x(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized b B(HttpURLConnection httpURLConnection) {
        HttpURLConnection httpURLConnection2;
        httpURLConnection2 = httpURLConnection;
        return new b(httpURLConnection2, this.f68818h, this.f68821k, this.f68811a, new b(), this.f68817g);
    }

    public void C() {
        s(0);
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void e() {
        if (f()) {
            if (new Date(this.f68825o.a()).before(this.f68826p.i().a())) {
                w();
                return;
            }
            C8971l<HttpURLConnection> h10 = h();
            C8974o.k(h10).h(this.f68817g, new q(this, h10));
        }
    }

    public void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public C8971l<HttpURLConnection> h() {
        C8971l<g> a10 = this.f68820j.a(false);
        C8971l<String> id2 = this.f68820j.getId();
        return C8974o.k(a10, id2).j(this.f68817g, new r(this, a10, id2));
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void w() {
        s(Math.max(0, this.f68826p.i().a().getTime() - new Date(this.f68825o.a()).getTime()));
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z10) {
        this.f68815e = z10;
    }
}
