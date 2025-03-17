package com.google.firebase.remoteconfig.internal;

import Ic.c;
import Ic.h;
import Ic.i;
import Ic.l;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.m;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import xa.C8971l;
import xa.C8974o;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Set<c> f68720a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpURLConnection f68721b;

    /* renamed from: c  reason: collision with root package name */
    private final m f68722c;

    /* renamed from: d  reason: collision with root package name */
    private final f f68723d;

    /* renamed from: e  reason: collision with root package name */
    private final c f68724e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f68725f;

    /* renamed from: g  reason: collision with root package name */
    private final Random f68726g = new Random();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f68727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f68728b;

        a(int i10, long j10) {
            this.f68727a = i10;
            this.f68728b = j10;
        }

        public void run() {
            b.this.d(this.f68727a, this.f68728b);
        }
    }

    public b(HttpURLConnection httpURLConnection, m mVar, f fVar, Set<c> set, c cVar, ScheduledExecutorService scheduledExecutorService) {
        this.f68721b = httpURLConnection;
        this.f68722c = mVar;
        this.f68723d = fVar;
        this.f68720a = set;
        this.f68724e = cVar;
        this.f68725f = scheduledExecutorService;
    }

    private void b(int i10, long j10) {
        if (i10 == 0) {
            k(new l("Unable to fetch the latest version of the template.", i.a.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.f68725f.schedule(new a(i10, j10), (long) this.f68726g.nextInt(4), TimeUnit.SECONDS);
    }

    private synchronized void c(Ic.b bVar) {
        for (c b10 : this.f68720a) {
            b10.b(bVar);
        }
    }

    private static Boolean e(m.a aVar, long j10) {
        boolean z10 = false;
        if (aVar.d() != null) {
            if (aVar.d().k() >= j10) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        if (aVar.f() == 1) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r5.has("featureDisabled") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r5.getBoolean("featureDisabled") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r9.f68724e.a(new Ic.l("The server is temporarily unavailable. Try again in a few minutes.", Ic.i.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (g() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r5.has("latestTemplateVersionNumber") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        r6 = r9.f68722c.r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r4 <= r6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        b(3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(java.io.InputStream r10) {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L_0x0012:
            r4 = r3
        L_0x0013:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L_0x0096
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0013
            java.lang.String r4 = r9.j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x003b
            goto L_0x0013
        L_0x003b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005b }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x005b }
            boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x005d
            boolean r4 = r5.getBoolean(r1)     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x005d
            Ic.c r4 = r9.f68724e     // Catch:{ JSONException -> 0x005b }
            Ic.l r5 = new Ic.l     // Catch:{ JSONException -> 0x005b }
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            Ic.i$a r7 = Ic.i.a.CONFIG_UPDATE_UNAVAILABLE     // Catch:{ JSONException -> 0x005b }
            r5.<init>((java.lang.String) r6, (Ic.i.a) r7)     // Catch:{ JSONException -> 0x005b }
            r4.a(r5)     // Catch:{ JSONException -> 0x005b }
            goto L_0x0096
        L_0x005b:
            r4 = move-exception
            goto L_0x007d
        L_0x005d:
            boolean r4 = r9.g()     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x0064
            goto L_0x0096
        L_0x0064:
            boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x0012
            com.google.firebase.remoteconfig.internal.m r4 = r9.f68722c     // Catch:{ JSONException -> 0x005b }
            long r6 = r4.r()     // Catch:{ JSONException -> 0x005b }
            long r4 = r5.getLong(r0)     // Catch:{ JSONException -> 0x005b }
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0012
            r6 = 3
            r9.b(r6, r4)     // Catch:{ JSONException -> 0x005b }
            goto L_0x0012
        L_0x007d:
            Ic.h r5 = new Ic.h
            java.lang.Throwable r6 = r4.getCause()
            Ic.i$a r7 = Ic.i.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.k(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L_0x0012
        L_0x0096:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.b.f(java.io.InputStream):void");
    }

    private synchronized boolean g() {
        return this.f68720a.isEmpty();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8971l h(C8971l lVar, C8971l lVar2, long j10, int i10, C8971l lVar3) {
        if (!lVar.q()) {
            return C8974o.e(new h("Failed to auto-fetch config update.", (Throwable) lVar.l()));
        }
        if (!lVar2.q()) {
            return C8974o.e(new h("Failed to get activated config for auto-fetch", (Throwable) lVar2.l()));
        }
        m.a aVar = (m.a) lVar.m();
        g gVar = (g) lVar2.m();
        if (!e(aVar, j10).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            b(i10, j10);
            return C8974o.f(null);
        } else if (aVar.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return C8974o.f(null);
        } else {
            if (gVar == null) {
                gVar = g.l().a();
            }
            Set<String> f10 = gVar.f(aVar.d());
            if (f10.isEmpty()) {
                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                return C8974o.f(null);
            }
            c(Ic.b.a(f10));
            return C8974o.f(null);
        }
    }

    private String j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        return (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
    }

    private synchronized void k(i iVar) {
        for (c a10 : this.f68720a) {
            a10.a(iVar);
        }
    }

    public synchronized C8971l<Void> d(int i10, long j10) {
        int i11;
        C8971l<m.a> n10;
        C8971l<g> e10;
        i11 = i10 - 1;
        n10 = this.f68722c.n(m.b.REALTIME, 3 - i11);
        e10 = this.f68723d.e();
        return C8974o.k(n10, e10).j(this.f68725f, new a(this, n10, e10, j10, i11));
    }

    public void i() {
        HttpURLConnection httpURLConnection = this.f68721b;
        if (httpURLConnection != null) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                f(inputStream);
                inputStream.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e10);
            } catch (Throwable th2) {
                this.f68721b.disconnect();
                throw th2;
            }
            this.f68721b.disconnect();
        }
    }
}
