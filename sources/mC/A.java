package Mc;

import Fb.f;
import Nc.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import fc.C9700a;
import hc.C9771d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LMc/A;", "", "<init>", "()V", "LNc/b;", "subscriber", "LMc/d;", "d", "(LNc/b;)LMc/d;", "LFb/f;", "firebaseApp", "LMc/y;", "sessionDetails", "LOc/f;", "sessionsSettings", "", "LNc/b$a;", "subscribers", "", "firebaseInstallationId", "firebaseAuthenticationToken", "LMc/z;", "a", "(LFb/f;LMc/y;LOc/f;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)LMc/z;", "LMc/b;", "b", "(LFb/f;)LMc/b;", "Lfc/a;", "Lfc/a;", "c", "()Lfc/a;", "SESSION_EVENT_ENCODER", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class A {

    /* renamed from: a  reason: collision with root package name */
    public static final A f61711a = new A();

    /* renamed from: b  reason: collision with root package name */
    private static final C9700a f61712b;

    static {
        C9700a i10 = new C9771d().j(C9144c.f61771a).k(true).i();
        C17542s.i(i10, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f61712b = i10;
    }

    private A() {
    }

    private final C9145d d(b bVar) {
        return bVar == null ? C9145d.COLLECTION_SDK_NOT_INSTALLED : bVar.a() ? C9145d.COLLECTION_ENABLED : C9145d.COLLECTION_DISABLED;
    }

    public final z a(f fVar, y yVar, Oc.f fVar2, Map<b.a, ? extends b> map, String str, String str2) {
        Map<b.a, ? extends b> map2 = map;
        C17542s.j(fVar, "firebaseApp");
        C17542s.j(yVar, "sessionDetails");
        C17542s.j(fVar2, "sessionsSettings");
        C17542s.j(map2, "subscribers");
        C17542s.j(str, "firebaseInstallationId");
        C17542s.j(str2, "firebaseAuthenticationToken");
        return new z(C9150i.SESSION_START, new C(yVar.b(), yVar.a(), yVar.c(), yVar.d(), new C9146e(d((b) map2.get(b.a.PERFORMANCE)), d((b) map2.get(b.a.CRASHLYTICS)), fVar2.b()), str, str2), b(fVar));
    }

    public final C9143b b(f fVar) {
        C17542s.j(fVar, "firebaseApp");
        Context k10 = fVar.k();
        C17542s.i(k10, "firebaseApp.applicationContext");
        String packageName = k10.getPackageName();
        PackageInfo packageInfo = k10.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String c10 = fVar.n().c();
        C17542s.i(c10, "firebaseApp.options.applicationId");
        String str = Build.MODEL;
        C17542s.i(str, "MODEL");
        String str2 = Build.VERSION.RELEASE;
        C17542s.i(str2, "RELEASE");
        t tVar = t.LOG_ENVIRONMENT_PROD;
        C17542s.i(packageName, "packageName");
        String str3 = packageInfo.versionName;
        String str4 = str3 == null ? valueOf : str3;
        String str5 = Build.MANUFACTURER;
        C17542s.i(str5, "MANUFACTURER");
        v vVar = v.f61832a;
        Context k11 = fVar.k();
        C17542s.i(k11, "firebaseApp.applicationContext");
        u d10 = vVar.d(k11);
        Context k12 = fVar.k();
        C17542s.i(k12, "firebaseApp.applicationContext");
        return new C9143b(c10, str, "2.0.8", str2, tVar, new C9142a(packageName, str4, valueOf, str5, d10, vVar.c(k12)));
    }

    public final C9700a c() {
        return f61712b;
    }
}
