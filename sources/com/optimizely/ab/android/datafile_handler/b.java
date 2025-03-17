package com.optimizely.ab.android.datafile_handler;

import android.content.Context;
import android.os.FileObserver;
import com.optimizely.ab.config.DatafileProjectConfig;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.ProjectConfigManager;
import com.optimizely.ab.config.parser.ConfigParseException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vE.C15140a;
import vE.C15141b;
import vE.c;
import vE.d;
import vE.e;
import yE.C15298a;
import yE.C15299b;
import yE.C15301d;
import yE.C15302e;
import yE.f;

public class b implements c, ProjectConfigManager {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f122270c = LoggerFactory.getLogger((Class<?>) b.class);

    /* renamed from: a  reason: collision with root package name */
    private ProjectConfig f122271a;

    /* renamed from: b  reason: collision with root package name */
    private FileObserver f122272b;

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f122273a;

        a(d dVar) {
            this.f122273a = dVar;
        }

        public void a(String str) {
            d dVar = this.f122273a;
            if (dVar != null) {
                dVar.a(str);
            }
        }
    }

    /* renamed from: com.optimizely.ab.android.datafile_handler.b$b  reason: collision with other inner class name */
    class C3016b extends FileObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15140a f122275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f122276b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3016b(String str, C15140a aVar, d dVar) {
            super(str);
            this.f122275a = aVar;
            this.f122276b = dVar;
        }

        public void onEvent(int i10, String str) {
            Logger d10 = b.f122270c;
            d10.debug("EVENT: " + String.valueOf(i10) + " " + str + " (" + this.f122275a.c() + ")");
            if (i10 == 2 && str.equals(this.f122275a.c())) {
                JSONObject d11 = this.f122275a.d();
                if (d11 == null) {
                    b.f122270c.error("Cached datafile is empty or corrupt");
                    return;
                }
                String jSONObject = d11.toString();
                b.this.i(jSONObject);
                d dVar = this.f122276b;
                if (dVar != null) {
                    dVar.a(jSONObject);
                }
            }
        }
    }

    private void e(Context context, C15301d dVar) {
        new a(new C15298a(context, LoggerFactory.getLogger((Class<?>) C15298a.class)), LoggerFactory.getLogger((Class<?>) a.class)).c(dVar, false);
    }

    private synchronized void f() {
        FileObserver fileObserver = this.f122272b;
        if (fileObserver != null) {
            fileObserver.stopWatching();
            this.f122272b = null;
        }
    }

    private void g(Context context, C15301d dVar) {
        new a(new C15298a(context, LoggerFactory.getLogger((Class<?>) C15298a.class)), LoggerFactory.getLogger((Class<?>) a.class)).c(dVar, true);
    }

    private static void j(Context context, long j10) {
        new C15302e(context).d("DATAFILE_INTERVAL", j10);
    }

    public void a(Context context, C15301d dVar, Long l10, d dVar2) {
        long longValue = l10.longValue() / 60;
        Logger logger = f122270c;
        logger.info("Datafile background polling scheduled (period interval: " + String.valueOf(longValue) + " minutes)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DatafileWorker");
        sb2.append(dVar.b());
        f.a(context, sb2.toString(), DatafileWorker.class, DatafileWorker.d(dVar), longValue);
        g(context, dVar);
        j(context, longValue);
        h(context, dVar, dVar2);
    }

    public void b(Context context, C15301d dVar, d dVar2) {
        C15141b bVar = new C15141b(new C15299b(new C15302e(context.getApplicationContext()), LoggerFactory.getLogger((Class<?>) C15302e.class)), LoggerFactory.getLogger((Class<?>) C15141b.class));
        C15140a aVar = new C15140a(dVar.b(), new C15298a(context, LoggerFactory.getLogger((Class<?>) C15298a.class)), LoggerFactory.getLogger((Class<?>) C15140a.class));
        new e(context, bVar, aVar, LoggerFactory.getLogger((Class<?>) e.class)).k(dVar.c(), new a(dVar2));
    }

    public void c(Context context, C15301d dVar) {
        f.c(context, "DatafileWorker" + dVar.b());
        e(context, dVar);
        j(context, -1);
        f();
    }

    public ProjectConfig getConfig() {
        return this.f122271a;
    }

    public synchronized void h(Context context, C15301d dVar, d dVar2) {
        if (this.f122272b == null) {
            C3016b bVar = new C3016b(context.getFilesDir().getPath(), new C15140a(dVar.b(), new C15298a(context, LoggerFactory.getLogger((Class<?>) C15298a.class)), LoggerFactory.getLogger((Class<?>) C15140a.class)), dVar2);
            this.f122272b = bVar;
            bVar.startWatching();
        }
    }

    public void i(String str) {
        if (str == null) {
            f122270c.info("datafile is null, ignoring update");
        } else if (str.isEmpty()) {
            f122270c.info("datafile is empty, ignoring update");
        } else {
            try {
                ProjectConfig build = new DatafileProjectConfig.Builder().withDatafile(str).build();
                this.f122271a = build;
                f122270c.info("Datafile successfully loaded with revision: {}", (Object) build.getRevision());
            } catch (ConfigParseException e10) {
                Logger logger = f122270c;
                logger.error("Unable to parse the datafile", (Throwable) e10);
                logger.info("Datafile is invalid");
            }
        }
    }
}
