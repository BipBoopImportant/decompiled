package com.android.volley.toolbox;

import android.content.Context;
import com.android.volley.h;
import com.android.volley.o;
import com.android.volley.toolbox.d;
import java.io.File;

public class n {

    class a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        private File f46281a = null;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f46282b;

        a(Context context) {
            this.f46282b = context;
        }

        public File get() {
            if (this.f46281a == null) {
                this.f46281a = new File(this.f46282b.getCacheDir(), "volley");
            }
            return this.f46281a;
        }
    }

    public static o a(Context context) {
        return c(context, (a) null);
    }

    private static o b(Context context, h hVar) {
        o oVar = new o(new d(new a(context.getApplicationContext())), hVar);
        oVar.g();
        return oVar;
    }

    public static o c(Context context, a aVar) {
        return b(context, aVar == null ? new b(new h()) : new b(aVar));
    }
}
