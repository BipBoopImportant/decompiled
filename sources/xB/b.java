package Xb;

import Qb.C;
import Qb.P;
import Tb.F;
import Ub.j;
import android.content.Context;
import com.google.android.datatransport.cct.a;
import com.optimizely.ab.config.FeatureVariable;
import j9.c;
import j9.h;
import l9.u;
import xa.C8971l;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static final j f64770c = new j();

    /* renamed from: d  reason: collision with root package name */
    private static final String f64771d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e  reason: collision with root package name */
    private static final String f64772e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f  reason: collision with root package name */
    private static final h<F, byte[]> f64773f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final e f64774a;

    /* renamed from: b  reason: collision with root package name */
    private final h<F, byte[]> f64775b;

    b(e eVar, h<F, byte[]> hVar) {
        this.f64774a = eVar;
        this.f64775b = hVar;
    }

    public static b b(Context context, Yb.j jVar, P p10) {
        u.f(context);
        j9.j h10 = u.c().h(new a(f64771d, f64772e));
        c b10 = c.b(FeatureVariable.JSON_TYPE);
        h<F, byte[]> hVar = f64773f;
        return new b(new e(h10.b("FIREBASE_CRASHLYTICS_REPORT", F.class, b10, hVar), jVar.b(), p10), hVar);
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public C8971l<C> c(C c10, boolean z10) {
        return this.f64774a.i(c10, z10).a();
    }
}
