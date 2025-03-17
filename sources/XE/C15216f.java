package xE;

import BE.C12648a;
import CE.C12694a;
import CE.C12696c;
import CE.C12697d;
import GE.C12939d;
import GE.C12945j;
import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.content.Context;
import com.optimizely.ab.Optimizely;
import com.optimizely.ab.bucketing.e;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.event.internal.payload.EventBatch;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wE.C15186a;
import yE.C15301d;
import zE.C15337a;

/* renamed from: xE.f  reason: case insensitive filesystem */
public class C15216f {

    /* renamed from: a  reason: collision with root package name */
    private C15211a f131881a = new C15211a((Optimizely) null, LoggerFactory.getLogger((Class<?>) C15211a.class));

    /* renamed from: b  reason: collision with root package name */
    private vE.c f131882b;

    /* renamed from: c  reason: collision with root package name */
    private final long f131883c;

    /* renamed from: d  reason: collision with root package name */
    private final long f131884d;

    /* renamed from: e  reason: collision with root package name */
    private C12696c f131885e = null;

    /* renamed from: f  reason: collision with root package name */
    private C12697d f131886f = null;

    /* renamed from: g  reason: collision with root package name */
    private C12939d f131887g = null;

    /* renamed from: h  reason: collision with root package name */
    private C12648a f131888h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Logger f131889i;

    /* renamed from: j  reason: collision with root package name */
    private final String f131890j;

    /* renamed from: k  reason: collision with root package name */
    private final String f131891k;

    /* renamed from: l  reason: collision with root package name */
    private final C15301d f131892l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public e f131893m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public C15217g f131894n;

    /* renamed from: o  reason: collision with root package name */
    private final List<IE.e> f131895o;

    /* renamed from: p  reason: collision with root package name */
    private String f131896p = null;

    /* renamed from: xE.f$a */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProjectConfig f131897a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15337a f131898b;

        a(ProjectConfig projectConfig, C15337a aVar) {
            this.f131897a = projectConfig;
            this.f131898b = aVar;
        }

        public void run() {
            try {
                this.f131898b.d(this.f131897a.getExperimentIdMapping().keySet());
            } catch (Exception e10) {
                C15216f.this.f131889i.error("Error removing invalid experiments from default user profile service.", (Throwable) e10);
            }
        }
    }

    /* renamed from: xE.f$b */
    class b implements vE.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f131900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f131901b;

        b(Context context, Integer num) {
            this.f131900a = context;
            this.f131901b = num;
        }

        public void a(String str) {
            if (str == null || str.isEmpty()) {
                C15216f fVar = C15216f.this;
                fVar.p(this.f131900a, fVar.f131893m, C15216f.this.u(this.f131900a, this.f131901b));
                return;
            }
            C15216f fVar2 = C15216f.this;
            fVar2.p(this.f131900a, fVar2.f131893m, str);
        }
    }

    /* renamed from: xE.f$c */
    class c implements C15337a.b {
        c() {
        }

        public void a(e eVar) {
            C15216f.this.j(eVar);
            if (C15216f.this.f131894n != null) {
                C15216f.this.f131889i.info("Sending Optimizely instance to listener");
                C15216f.this.t();
                return;
            }
            C15216f.this.f131889i.info("No listener to send Optimizely to");
        }
    }

    /* renamed from: xE.f$d */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f131904a = null;

        /* renamed from: b  reason: collision with root package name */
        private long f131905b = -1;

        /* renamed from: c  reason: collision with root package name */
        private long f131906c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f131907d = -1;

        /* renamed from: e  reason: collision with root package name */
        private vE.c f131908e = null;

        /* renamed from: f  reason: collision with root package name */
        private Logger f131909f = null;

        /* renamed from: g  reason: collision with root package name */
        private C12696c f131910g = null;

        /* renamed from: h  reason: collision with root package name */
        private C12648a f131911h = null;

        /* renamed from: i  reason: collision with root package name */
        private C12697d f131912i = null;

        /* renamed from: j  reason: collision with root package name */
        private C12939d f131913j = null;

        /* renamed from: k  reason: collision with root package name */
        private e f131914k = null;

        /* renamed from: l  reason: collision with root package name */
        private String f131915l = null;

        /* renamed from: m  reason: collision with root package name */
        private C15301d f131916m = null;

        /* renamed from: n  reason: collision with root package name */
        private List<IE.e> f131917n = null;

        d() {
        }

        public C15216f a(Context context) {
            if (this.f131909f == null) {
                try {
                    this.f131909f = LoggerFactory.getLogger("com.optimizely.ab.android.sdk.OptimizelyManager");
                } catch (Exception e10) {
                    C15214d dVar = new C15214d("com.optimizely.ab.android.sdk.OptimizelyManager");
                    this.f131909f = dVar;
                    dVar.error("Unable to generate logger from class.", (Throwable) e10);
                } catch (Error e11) {
                    C15214d dVar2 = new C15214d("com.optimizely.ab.android.sdk.OptimizelyManager");
                    this.f131909f = dVar2;
                    dVar2.error("Unable to generate logger from class.", (Throwable) e11);
                }
            }
            if (this.f131905b > 0) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(JobInfo.getMinPeriodMillis());
                long minutes = TimeUnit.SECONDS.toMinutes(seconds);
                if (this.f131905b < seconds) {
                    this.f131905b = seconds;
                    this.f131909f.warn("Minimum datafile polling interval is {} minutes. Defaulting to the minimum.", (Object) Long.valueOf(minutes));
                }
            }
            if (this.f131916m == null) {
                if (this.f131904a == null && this.f131915l == null) {
                    this.f131909f.error("ProjectId and SDKKey cannot both be null");
                    return null;
                }
                this.f131916m = new C15301d(this.f131904a, this.f131915l);
            }
            if (this.f131908e == null) {
                this.f131908e = new com.optimizely.ab.android.datafile_handler.b();
            }
            if (this.f131914k == null) {
                this.f131914k = C15337a.c(this.f131916m.b(), context);
            } else {
                Context context2 = context;
            }
            if (this.f131910g == null) {
                C15186a b10 = C15186a.b(context);
                b10.c(this.f131907d);
                this.f131910g = b10;
            }
            if (this.f131913j == null) {
                this.f131913j = new C12939d();
            }
            if (this.f131912i == null) {
                this.f131912i = C12694a.l().h(this.f131913j).f(this.f131910g).g(Long.valueOf(this.f131906c)).b();
            }
            String str = this.f131904a;
            String str2 = this.f131915l;
            C15301d dVar3 = this.f131916m;
            Logger logger = this.f131909f;
            long j10 = this.f131905b;
            vE.c cVar = this.f131908e;
            C12648a aVar = this.f131911h;
            long j11 = this.f131907d;
            C12696c cVar2 = this.f131910g;
            C12697d dVar4 = this.f131912i;
            e eVar = this.f131914k;
            return new C15216f(str, str2, dVar3, logger, j10, cVar, aVar, j11, cVar2, dVar4, eVar, this.f131913j, this.f131917n);
        }

        public d b(long j10, TimeUnit timeUnit) {
            if (j10 > 0) {
                j10 = timeUnit.toMillis(j10);
            }
            this.f131906c = j10;
            return this;
        }

        public d c(C12697d dVar) {
            this.f131912i = dVar;
            return this;
        }

        public d d(String str) {
            this.f131915l = str;
            return this;
        }
    }

    C15216f(String str, String str2, C15301d dVar, Logger logger, long j10, vE.c cVar, C12648a aVar, long j11, C12696c cVar2, C12697d dVar2, e eVar, C12939d dVar3, List<IE.e> list) {
        String str3 = str;
        String str4 = str2;
        C15301d dVar4 = dVar;
        Logger logger2 = logger;
        if (str3 == null && str4 == null) {
            logger.error("projectId and sdkKey are both null!");
        }
        this.f131890j = str3;
        this.f131891k = str4;
        if (dVar4 == null) {
            this.f131892l = new C15301d(str, str2);
        } else {
            this.f131892l = dVar4;
        }
        this.f131889i = logger2;
        this.f131883c = j10;
        this.f131882b = cVar;
        this.f131884d = j11;
        this.f131885e = cVar2;
        this.f131886f = dVar2;
        this.f131888h = aVar;
        this.f131893m = eVar;
        this.f131887g = dVar3;
        this.f131895o = list;
        try {
            this.f131896p = "3.13.4";
            logger.info("SDK Version: {}", (Object) "3.13.4");
        } catch (Exception unused) {
            logger.warn("Error getting BuildConfig version");
        }
    }

    private C15211a h(Context context, String str) {
        C12696c m10 = m(context);
        EventBatch.ClientEngine a10 = C15212b.a(context);
        Optimizely.b builder = Optimizely.builder();
        builder.g(m10);
        builder.h(this.f131886f);
        vE.c cVar = this.f131882b;
        if (cVar instanceof com.optimizely.ab.android.datafile_handler.b) {
            com.optimizely.ab.android.datafile_handler.b bVar = (com.optimizely.ab.android.datafile_handler.b) cVar;
            bVar.i(str);
            builder.c(bVar);
        } else {
            builder.d(str);
        }
        builder.b(a10, this.f131896p);
        C12648a aVar = this.f131888h;
        if (aVar != null) {
            builder.f(aVar);
        }
        builder.j(this.f131893m);
        builder.i(this.f131887g);
        builder.e(this.f131895o);
        return new C15211a(builder.a(), LoggerFactory.getLogger((Class<?>) C15211a.class));
    }

    public static d i() {
        return new d();
    }

    /* access modifiers changed from: private */
    public void j(e eVar) {
        if (eVar instanceof C15337a) {
            C15337a aVar = (C15337a) eVar;
            ProjectConfig g10 = this.f131881a.g();
            if (g10 != null) {
                new Thread(new a(g10, aVar)).start();
            }
        }
    }

    private boolean k() {
        return this.f131883c > 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(String str) {
        C12939d e10 = n().e();
        if (e10 == null) {
            this.f131889i.debug("NotificationCenter null, not sending notification");
        } else {
            e10.c(new C12945j());
        }
    }

    public static String s(Context context, int i10) {
        InputStream openRawResource = context.getResources().openRawResource(i10);
        byte[] bArr = new byte[openRawResource.available()];
        if (openRawResource.read(bArr) > -1) {
            return new String(bArr);
        }
        throw new IOException("Couldn't parse raw res fixture, no bytes");
    }

    /* access modifiers changed from: private */
    public void t() {
        C15217g gVar = this.f131894n;
        if (gVar != null) {
            gVar.a(n());
            this.f131894n = null;
        }
    }

    /* access modifiers changed from: private */
    public String u(Context context, Integer num) {
        if (num != null) {
            try {
                return s(context, num.intValue());
            } catch (IOException e10) {
                this.f131889i.error("Error parsing resource", (Throwable) e10);
                return null;
            }
        } else {
            this.f131889i.error("Invalid datafile resource ID.");
            return null;
        }
    }

    private void w(Context context) {
        this.f131882b.c(context, this.f131892l);
        if (!k()) {
            this.f131889i.debug("Invalid download interval, ignoring background updates.");
        } else {
            this.f131882b.a(context, this.f131892l, Long.valueOf(this.f131883c), new C15215e(this));
        }
    }

    /* access modifiers changed from: package-private */
    public vE.d l(Context context, Integer num) {
        return new b(context, num);
    }

    /* access modifiers changed from: protected */
    public C12696c m(Context context) {
        if (this.f131885e == null) {
            C15186a b10 = C15186a.b(context);
            b10.c(this.f131884d);
            this.f131885e = b10;
        }
        return this.f131885e;
    }

    public C15211a n() {
        q();
        return this.f131881a;
    }

    @TargetApi(14)
    public void o(Context context, Integer num, C15217g gVar) {
        if (q()) {
            v(gVar);
            this.f131882b.b(context, this.f131892l, l(context, num));
        }
    }

    /* access modifiers changed from: package-private */
    public void p(Context context, e eVar, String str) {
        try {
            C15211a h10 = h(context, str);
            this.f131881a = h10;
            h10.j(C15213c.a(context, this.f131889i));
            w(context);
            if (eVar instanceof C15337a) {
                ((C15337a) eVar).f(new c());
            } else if (this.f131894n != null) {
                this.f131889i.info("Sending Optimizely instance to listener");
                t();
            } else {
                this.f131889i.info("No listener to send Optimizely to");
            }
        } catch (Exception e10) {
            this.f131889i.error("Unable to build OptimizelyClient instance", (Throwable) e10);
            if (this.f131894n != null) {
                this.f131889i.info("Sending Optimizely instance to listener may be null on failure");
                t();
            }
        } catch (Error e11) {
            this.f131889i.error("Unable to build OptimizelyClient instance", (Throwable) e11);
        }
    }

    /* access modifiers changed from: protected */
    public boolean q() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void v(C15217g gVar) {
        this.f131894n = gVar;
    }

    public void x(Context context) {
        if (q()) {
            this.f131894n = null;
        }
    }
}
