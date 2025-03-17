package Nb;

import Qb.C9251i;
import android.content.Context;
import com.optimizely.ab.config.FeatureVariable;
import java.io.IOException;
import java.io.InputStream;

public class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f61975a;

    /* renamed from: b  reason: collision with root package name */
    private b f61976b = null;

    private class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f61977a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final String f61978b;

        private b() {
            int p10 = C9251i.p(f.this.f61975a, "com.google.firebase.crashlytics.unity_version", FeatureVariable.STRING_TYPE);
            if (p10 != 0) {
                this.f61977a = "Unity";
                String string = f.this.f61975a.getResources().getString(p10);
                this.f61978b = string;
                g f10 = g.f();
                f10.i("Unity Editor version is: " + string);
            } else if (f.this.c("flutter_assets/NOTICES.Z")) {
                this.f61977a = "Flutter";
                this.f61978b = null;
                g.f().i("Development platform is: Flutter");
            } else {
                this.f61977a = null;
                this.f61978b = null;
            }
        }
    }

    public f(Context context) {
        this.f61975a = context;
    }

    /* access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f61975a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f61975a.getAssets().open(str);
            if (open == null) {
                return true;
            }
            open.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f61976b == null) {
            this.f61976b = new b();
        }
        return this.f61976b;
    }

    public static boolean g(Context context) {
        return C9251i.p(context, "com.google.firebase.crashlytics.unity_version", FeatureVariable.STRING_TYPE) != 0;
    }

    public String d() {
        return f().f61977a;
    }

    public String e() {
        return f().f61978b;
    }
}
