package IL;

import DL.C15583a;
import DL.C15584b;
import DL.C15585c;
import DL.C15586d;
import DL.C15587e;
import GK.C15774B;
import GK.C15776D;
import GK.C15777E;
import GK.C15786e;
import GK.C15787f;
import GK.C15797p;
import GK.C15803v;
import GK.z;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Locale;
import javax.net.ssl.SSLException;
import zL.C18771a;

/* renamed from: IL.a  reason: case insensitive filesystem */
public class C15917a implements C15585c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f135509b = C15918b.a(String.format("%s %s (%s) Android/%s (%s)", new Object[]{C15583a.a(), "MapLibre Native/11.7.1", "c94864f1a9", Integer.valueOf(Build.VERSION.SDK_INT), Build.SUPPORTED_ABIS[0]}));

    /* renamed from: c  reason: collision with root package name */
    static final z f135510c;

    /* renamed from: d  reason: collision with root package name */
    static C15786e.a f135511d;

    /* renamed from: a  reason: collision with root package name */
    private C15786e f135512a;

    /* renamed from: IL.a$a  reason: collision with other inner class name */
    private static class C3335a implements C15787f {

        /* renamed from: a  reason: collision with root package name */
        private C15587e f135513a;

        C3335a(C15587e eVar) {
            this.f135513a = eVar;
        }

        private int b(Exception exc) {
            if ((exc instanceof NoRouteToHostException) || (exc instanceof UnknownHostException) || (exc instanceof SocketException) || (exc instanceof ProtocolException) || (exc instanceof SSLException)) {
                return 0;
            }
            return exc instanceof InterruptedIOException ? 1 : 2;
        }

        /* access modifiers changed from: private */
        public void d(C15786e eVar, Exception exc) {
            String message = exc.getMessage() != null ? exc.getMessage() : "Error processing the request";
            int b10 = b(exc);
            if (!(!C15584b.f133888b || eVar == null || eVar.t() == null)) {
                C15584b.b(b10, message, eVar.t().k().toString());
            }
            this.f135513a.handleFailure(b10, message);
        }

        public void c(C15786e eVar, IOException iOException) {
            d(eVar, iOException);
        }

        public void e(C15786e eVar, C15776D d10) {
            if (d10.e1()) {
                C15584b.a(2, String.format("[HTTP] Request was successful (code = %s).", new Object[]{Integer.valueOf(d10.g())}));
            } else {
                C15584b.a(3, String.format("[HTTP] Request with response = %s: %s", new Object[]{Integer.valueOf(d10.g()), !TextUtils.isEmpty(d10.s()) ? d10.s() : "No additional information"}));
            }
            C15777E c10 = d10.c();
            if (c10 == null) {
                C15584b.a(6, "[HTTP] Received empty response body");
                return;
            }
            try {
                byte[] d11 = c10.d();
                d10.close();
                this.f135513a.onResponse(d10.g(), d10.l("ETag"), d10.l("Last-Modified"), d10.l("Cache-Control"), d10.l("Expires"), d10.l("Retry-After"), d10.l("x-rate-limit-reset"), d11);
            } catch (IOException e10) {
                c(eVar, e10);
                d10.close();
            } catch (Throwable th2) {
                d10.close();
                throw th2;
            }
        }
    }

    static {
        z c10 = new z.a().h(c()).c();
        f135510c = c10;
        f135511d = c10;
    }

    private static C15797p c() {
        C15797p pVar = new C15797p();
        pVar.j(20);
        return pVar;
    }

    public void a(C15587e eVar, long j10, String str, String str2, String str3, boolean z10) {
        C3335a aVar = new C3335a(eVar);
        try {
            C15803v m10 = C15803v.m(str);
            if (m10 == null) {
                C15584b.a(6, String.format("[HTTP] Unable to parse resourceUrl %s", new Object[]{str}));
                return;
            }
            String i10 = m10.i();
            Locale locale = C18771a.f152883a;
            String a10 = C15586d.a(i10.toLowerCase(locale), str, m10.q(), z10);
            C15774B.a a11 = new C15774B.a().n(a10).l(a10.toLowerCase(locale)).a("User-Agent", f135509b);
            if (str2.length() > 0) {
                a11.a("If-None-Match", str2);
            } else if (str3.length() > 0) {
                a11.a("If-Modified-Since", str3);
            }
            C15786e b10 = f135511d.b(a11.b());
            this.f135512a = b10;
            FirebasePerfOkHttpClient.enqueue(b10, aVar);
        } catch (Exception e10) {
            aVar.d(this.f135512a, e10);
        }
    }

    public void b() {
        C15786e eVar = this.f135512a;
        if (eVar != null) {
            C15584b.a(3, String.format("[HTTP] This request was cancelled (%s). This is expected for tiles that were being prefetched but are no longer needed for the map to render.", new Object[]{eVar.t().k()}));
            this.f135512a.cancel();
        }
    }
}
