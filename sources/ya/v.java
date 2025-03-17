package Ya;

import Za.C9373D;
import Za.C9375F;
import Za.C9378c;
import Za.C9390o;
import Za.s;
import Za.y;
import ab.C9403a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import xa.C8971l;
import xa.C8972m;
import xa.C8974o;

final class v {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final s f64882e = new s("AppUpdateService");

    /* renamed from: f  reason: collision with root package name */
    private static final Intent f64883f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    C9373D f64884a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f64885b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f64886c;

    /* renamed from: d  reason: collision with root package name */
    private final x f64887d;

    v(Context context, x xVar) {
        this.f64885b = context.getPackageName();
        this.f64886c = context;
        this.f64887d = xVar;
        if (C9378c.a(context)) {
            this.f64884a = new C9373D(C9375F.a(context), f64882e, "AppUpdateService", f64883f, p.f64870a, (y) null);
        }
    }

    static /* bridge */ /* synthetic */ Bundle b(v vVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(i());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(vVar.f64886c.getPackageManager().getPackageInfo(vVar.f64886c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f64882e.b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    static /* bridge */ /* synthetic */ C9364a f(v vVar, Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        int i10 = bundle2.getInt("version.code", -1);
        int i11 = bundle2.getInt("update.availability");
        int i12 = bundle2.getInt("install.status", 0);
        Integer valueOf = bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness"));
        int i13 = bundle2.getInt("in.app.update.priority", 0);
        long j10 = bundle2.getLong("bytes.downloaded");
        HashMap hashMap = r9;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("blocking.destructive.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        hashMap2.put("nonblocking.destructive.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        hashMap2.put("blocking.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        hashMap2.put("nonblocking.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return C9364a.e(str, i10, i11, i12, valueOf, i13, j10, bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), vVar.f64887d.a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"), hashMap);
    }

    /* access modifiers changed from: private */
    public static Bundle i() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map a10 = C9390o.a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) a10.get("java")).intValue());
        if (a10.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) a10.get("native")).intValue());
        }
        if (a10.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) a10.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    private static C8971l j() {
        f64882e.b("onError(%d)", -9);
        return C8974o.e(new C9403a(-9));
    }

    private static HashSet k(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public final C8971l d(String str) {
        if (this.f64884a == null) {
            return j();
        }
        f64882e.d("completeUpdate(%s)", str);
        C8972m mVar = new C8972m();
        this.f64884a.s(new r(this, mVar, mVar, str), mVar);
        return mVar.a();
    }

    public final C8971l e(String str) {
        if (this.f64884a == null) {
            return j();
        }
        f64882e.d("requestUpdateInfo(%s)", str);
        C8972m mVar = new C8972m();
        this.f64884a.s(new q(this, mVar, str, mVar), mVar);
        return mVar.a();
    }
}
