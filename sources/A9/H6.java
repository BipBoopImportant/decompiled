package a9;

import G8.d;
import XH.v;
import YH.X;
import android.net.Uri;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import v8.C8902a;

public final class H6 {

    /* renamed from: a  reason: collision with root package name */
    public final E f42048a;

    /* renamed from: b  reason: collision with root package name */
    public final V4 f42049b;

    /* renamed from: c  reason: collision with root package name */
    public final S0 f42050c;

    /* renamed from: d  reason: collision with root package name */
    public final List<C6981z0> f42051d;

    /* renamed from: e  reason: collision with root package name */
    public final C8902a f42052e;

    /* renamed from: f  reason: collision with root package name */
    public final d f42053f;

    /* renamed from: g  reason: collision with root package name */
    public String f42054g;

    /* renamed from: h  reason: collision with root package name */
    public int f42055h = 1;

    public H6(E e10, V4 v42, S0 s02, List<? extends C6981z0> list, C8902a aVar, d dVar) {
        C17542s.j(e10, "configuration");
        C17542s.j(v42, "endpointResolver");
        C17542s.j(s02, "userId");
        C17542s.j(list, "urlParameterProviders");
        C17542s.j(dVar, "buildInformation");
        this.f42048a = e10;
        this.f42049b = v42;
        this.f42050c = s02;
        this.f42051d = list;
        this.f42052e = aVar;
        this.f42053f = dVar;
        this.f42054g = s02.a();
    }

    public final synchronized String a(C6871l1 l1Var) {
        String builder;
        C8902a.b b10;
        try {
            C17542s.j(l1Var, "sessionState");
            Map c10 = X.c();
            c10.put("uu", this.f42054g);
            c10.put("rt", "5");
            c10.put("v", this.f42053f.i());
            c10.put("av", this.f42053f.d());
            c10.put("ri", String.valueOf(this.f42055h));
            int i10 = 0;
            c10.put("hlm", String.valueOf(l1Var.f42675c == 1));
            JsonConfig.ProjectConfiguration b11 = this.f42048a.f41974b.b();
            if (b11 != null) {
                i10 = b11.g();
            }
            c10.put("pid", String.valueOf(i10));
            c10.put("sn", String.valueOf(l1Var.f42673a));
            c10.put("pn", String.valueOf(l1Var.f42674b));
            C8902a aVar = this.f42052e;
            if (!(aVar == null || (b10 = aVar.b()) == null)) {
                c10.put("happid", String.valueOf(b10.a()));
                c10.put("hsid", String.valueOf(b10.b()));
                String str = (String) c10.put("huu", String.valueOf(b10.c()));
            }
            for (C6981z0 a10 : this.f42051d) {
                v<String, String> a11 = a10.a();
                c10.put(a11.a(), a11.b());
            }
            Map b12 = X.b(c10);
            this.f42055h++;
            this.f42054g = this.f42050c.a();
            if (l1Var.f42675c == 1) {
                this.f42055h = 1;
            }
            Uri.Builder buildUpon = Uri.parse(this.f42049b.f42353a).buildUpon();
            for (Map.Entry entry : b12.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            builder = buildUpon.toString();
            C17542s.i(builder, "builder.toString()");
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return builder;
    }
}
