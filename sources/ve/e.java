package vE;

import android.content.Context;
import java.util.Date;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import org.slf4j.Logger;
import yE.C15302e;

public class e {

    /* renamed from: g  reason: collision with root package name */
    private static Long f131546g = 60000L;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public C15140a f131547a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C15141b f131548b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Logger f131549c;

    /* renamed from: d  reason: collision with root package name */
    private final C15302e f131550d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f131551e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f131552f = false;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f131553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f131554b;

        a(String str, d dVar) {
            this.f131553a = str;
            this.f131554b = dVar;
        }

        public void run() {
            if (!e.this.f131547a.b() || (e.this.f131547a.b() && e.this.f131547a.d() == null)) {
                new C15302e(e.this.f131551e).d(this.f131553a, 1);
            }
            String c10 = e.this.f131548b.c(this.f131553a);
            if (c10 == null || c10.isEmpty()) {
                String e10 = e.this.i();
                if (e10 != null) {
                    c10 = e10;
                }
            } else {
                if (e.this.f131547a.b() && !e.this.f131547a.a()) {
                    e.this.f131549c.warn("Unable to delete old datafile");
                }
                if (!e.this.f131547a.e(c10)) {
                    e.this.f131549c.warn("Unable to save new datafile");
                }
            }
            e.this.l(this.f131554b, c10);
            e.this.m(this.f131553a);
            e.this.f131549c.info("Refreshing data file");
        }
    }

    public e(Context context, C15141b bVar, C15140a aVar, Logger logger) {
        this.f131551e = context;
        this.f131549c = logger;
        this.f131548b = bVar;
        this.f131547a = aVar;
        this.f131550d = new C15302e(context);
    }

    private boolean h(String str, d dVar) {
        C15302e eVar = this.f131550d;
        if (new Date().getTime() - new Date(eVar.a(str + "optlyDatafileDownloadTime", 1)).getTime() >= f131546g.longValue() || !this.f131547a.b()) {
            return true;
        }
        this.f131549c.debug("Last download happened under 1 minute ago. Throttled to be at least 1 minute apart.");
        if (dVar == null) {
            return false;
        }
        l(dVar, i());
        return false;
    }

    /* access modifiers changed from: private */
    public String i() {
        JSONObject d10 = this.f131547a.d();
        if (d10 != null) {
            return d10.toString();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void l(d dVar, String str) {
        if (dVar != null) {
            dVar.a(str);
            this.f131552f = true;
        }
    }

    /* access modifiers changed from: private */
    public void m(String str) {
        long time = new Date().getTime();
        C15302e eVar = this.f131550d;
        eVar.d(str + "optlyDatafileDownloadTime", time);
    }

    public void j(String str, C15140a aVar, d dVar) {
        this.f131547a = aVar;
        k(str, dVar);
    }

    public void k(String str, d dVar) {
        if (this.f131547a == null) {
            this.f131549c.warn("DatafileCache is not set.");
        } else if (h(str, dVar)) {
            Executors.newSingleThreadExecutor().execute(new a(str, dVar));
        }
    }
}
