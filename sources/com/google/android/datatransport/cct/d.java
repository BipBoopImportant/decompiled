package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.adjust.sdk.Constants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.optimizely.ab.config.FeatureVariable;
import fc.C9700a;
import fc.C9701b;
import j9.c;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k9.C8467a;
import k9.C8480n;
import k9.C8481o;
import k9.C8482p;
import k9.C8483q;
import k9.C8484r;
import k9.C8485s;
import k9.C8486t;
import k9.C8487u;
import k9.C8488v;
import k9.C8489w;
import k9.C8490x;
import l9.h;
import l9.i;
import m9.f;
import m9.g;
import m9.m;
import p9.C8639a;
import q9.C8687b;
import v9.C8903a;

final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    private final C9700a f47799a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f47800b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f47801c;

    /* renamed from: d  reason: collision with root package name */
    final URL f47802d;

    /* renamed from: e  reason: collision with root package name */
    private final C8903a f47803e;

    /* renamed from: f  reason: collision with root package name */
    private final C8903a f47804f;

    /* renamed from: g  reason: collision with root package name */
    private final int f47805g;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f47806a;

        /* renamed from: b  reason: collision with root package name */
        final C8480n f47807b;

        /* renamed from: c  reason: collision with root package name */
        final String f47808c;

        a(URL url, C8480n nVar, String str) {
            this.f47806a = url;
            this.f47807b = nVar;
            this.f47808c = str;
        }

        /* access modifiers changed from: package-private */
        public a a(URL url) {
            return new a(url, this.f47807b, this.f47808c);
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f47809a;

        /* renamed from: b  reason: collision with root package name */
        final URL f47810b;

        /* renamed from: c  reason: collision with root package name */
        final long f47811c;

        b(int i10, URL url, long j10) {
            this.f47809a = i10;
            this.f47810b = url;
            this.f47811c = j10;
        }
    }

    d(Context context, C8903a aVar, C8903a aVar2, int i10) {
        this.f47799a = C8480n.b();
        this.f47801c = context;
        this.f47800b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f47802d = o(a.f47790c);
        this.f47803e = aVar2;
        this.f47804f = aVar;
        this.f47805g = i10;
    }

    /* access modifiers changed from: private */
    public b e(a aVar) {
        OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        InputStream n10;
        C8639a.e("CctTransportBackend", "Making request to: %s", aVar.f47806a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f47806a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f47805g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.3.0"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f47808c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            outputStream = httpURLConnection.getOutputStream();
            gZIPOutputStream = new GZIPOutputStream(outputStream);
            this.f47799a.a(aVar.f47807b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
            gZIPOutputStream.close();
            if (outputStream != null) {
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            C8639a.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
            C8639a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
            C8639a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
            }
            if (responseCode != 200) {
                return new b(responseCode, (URL) null, 0);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                n10 = n(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                b bVar = new b(responseCode, (URL) null, C8488v.b(new BufferedReader(new InputStreamReader(n10))).c());
                if (n10 != null) {
                    n10.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return bVar;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
            throw th;
            throw th;
            throw th;
        } catch (ConnectException | UnknownHostException e10) {
            C8639a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new b(500, (URL) null, 0);
        } catch (C9701b | IOException e11) {
            C8639a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new b(Constants.MINIMAL_ERROR_STATUS_CODE, (URL) null, 0);
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return C8489w.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return C8489w.b.COMBINED.b();
        }
        if (C8489w.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? C8489w.c.NONE.b() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            C8639a.c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private C8480n j(f fVar) {
        C8486t.a aVar;
        HashMap hashMap = new HashMap();
        for (i next : fVar.b()) {
            String n10 = next.n();
            if (!hashMap.containsKey(n10)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(n10, arrayList);
            } else {
                ((List) hashMap.get(n10)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar = (i) ((List) entry.getValue()).get(0);
            C8487u.a b10 = C8487u.a().f(C8490x.DEFAULT).g(this.f47804f.a()).h(this.f47803e.a()).b(C8481o.a().c(C8481o.b.ANDROID_FIREBASE).b(C8467a.a().m(Integer.valueOf(iVar.i("sdk-version"))).j(iVar.b("model")).f(iVar.b("hardware")).d(iVar.b("device")).l(iVar.b("product")).k(iVar.b("os-uild")).h(iVar.b("manufacturer")).e(iVar.b("fingerprint")).c(iVar.b(PlaceTypes.COUNTRY)).g(iVar.b("locale")).i(iVar.b("mcc_mnc")).b(iVar.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar2 : (List) entry.getValue()) {
                h e10 = iVar2.e();
                c b11 = e10.b();
                if (b11.equals(c.b("proto"))) {
                    aVar = C8486t.l(e10.a());
                } else if (b11.equals(c.b(FeatureVariable.JSON_TYPE))) {
                    aVar = C8486t.k(new String(e10.a(), Charset.forName(Constants.ENCODING)));
                } else {
                    C8639a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                aVar.d(iVar2.f()).e(iVar2.o()).j(iVar2.j("tz-offset")).g(C8489w.a().c(C8489w.c.a(iVar2.i("net-type"))).b(C8489w.b.a(iVar2.i("mobile-subtype"))).a());
                if (iVar2.d() != null) {
                    aVar.c(iVar2.d());
                }
                if (iVar2.l() != null) {
                    aVar.b(C8482p.a().b(C8485s.a().b(C8484r.a().b(iVar2.l()).a()).a()).c(C8482p.b.EVENT_OVERRIDE).a());
                }
                if (!(iVar2.g() == null && iVar2.h() == null)) {
                    C8483q.a a10 = C8483q.a();
                    if (iVar2.g() != null) {
                        a10.b(iVar2.g());
                    }
                    if (iVar2.h() != null) {
                        a10.c(iVar2.h());
                    }
                    aVar.f(a10.a());
                }
                arrayList3.add(aVar.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return C8480n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long l() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a m(a aVar, b bVar) {
        URL url = bVar.f47810b;
        if (url == null) {
            return null;
        }
        C8639a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f47810b);
    }

    private static InputStream n(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL o(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f47800b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c(PlaceTypes.COUNTRY, Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f47801c)).c("application_build", Integer.toString(i(this.f47801c))).d();
    }

    public g b(f fVar) {
        C8480n j10 = j(fVar);
        URL url = this.f47802d;
        String str = null;
        if (fVar.c() != null) {
            try {
                a c10 = a.c(fVar.c());
                if (c10.d() != null) {
                    str = c10.d();
                }
                if (c10.e() != null) {
                    url = o(c10.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) C8687b.a(5, new a(url, j10, str), new b(this), new c());
            int i10 = bVar.f47809a;
            if (i10 == 200) {
                return g.e(bVar.f47811c);
            }
            if (i10 < 500) {
                if (i10 != 404) {
                    return i10 == 400 ? g.d() : g.a();
                }
            }
            return g.f();
        } catch (IOException e10) {
            C8639a.c("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    d(Context context, C8903a aVar, C8903a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
