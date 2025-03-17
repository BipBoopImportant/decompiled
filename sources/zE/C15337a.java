package zE;

import android.content.Context;
import android.os.AsyncTask;
import com.optimizely.ab.bucketing.e;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yE.C15298a;
import zE.C15338b;

/* renamed from: zE.a  reason: case insensitive filesystem */
public class C15337a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C15338b f132535a;

    /* renamed from: b  reason: collision with root package name */
    private final Logger f132536b;

    /* renamed from: zE.a$a  reason: collision with other inner class name */
    class C3275a extends AsyncTask<Void, Void, e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15337a f132537a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f132538b;

        C3275a(C15337a aVar, b bVar) {
            this.f132537a = aVar;
            this.f132538b = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public e doInBackground(Void[] voidArr) {
            this.f132537a.e();
            return this.f132537a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(e eVar) {
            b bVar = this.f132538b;
            if (bVar != null) {
                bVar.a(eVar);
            }
        }
    }

    /* renamed from: zE.a$b */
    public interface b {
        void a(e eVar);
    }

    C15337a(C15338b bVar, Logger logger) {
        this.f132535a = bVar;
        this.f132536b = logger;
    }

    public static e c(String str, Context context) {
        Class<C15298a> cls = C15298a.class;
        return new C15337a(new C15338b(new C15338b.a(new C15298a(context, LoggerFactory.getLogger((Class<?>) cls)), Executors.newSingleThreadExecutor(), LoggerFactory.getLogger((Class<?>) C15338b.a.class), str), LoggerFactory.getLogger((Class<?>) C15338b.class), new ConcurrentHashMap(), new C15338b.C3277b(new C15298a(context, LoggerFactory.getLogger((Class<?>) cls)), Executors.newSingleThreadExecutor(), LoggerFactory.getLogger((Class<?>) C15338b.C3277b.class), str)), LoggerFactory.getLogger((Class<?>) C15337a.class));
    }

    public Map<String, Object> a(String str) {
        if (str == null) {
            this.f132536b.error("Received null user ID, unable to lookup activation.");
            return null;
        } else if (!str.isEmpty()) {
            return this.f132535a.b(str);
        } else {
            this.f132536b.error("Received empty user ID, unable to lookup activation.");
            return null;
        }
    }

    public void b(Map<String, Object> map) {
        this.f132535a.e(map);
    }

    public void d(Set<String> set) {
        try {
            this.f132535a.d(set);
        } catch (Exception e10) {
            this.f132536b.error("Error calling userProfileCache to remove invalid experiments", (Throwable) e10);
        }
    }

    public void e() {
        this.f132535a.f();
    }

    public void f(b bVar) {
        try {
            new C3275a(this, bVar).executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
        } catch (Exception unused) {
            this.f132536b.error("Error loading user profile service from AndroidUserProfileServiceDefault");
            bVar.a((e) null);
        }
    }
}
