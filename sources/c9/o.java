package C9;

import H9.C6531e;
import N9.a;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final a f33790a = new a("GoogleSignInCommon", new String[0]);

    public static i a(g gVar, Context context, boolean z10) {
        f33790a.a("Revoking access", new Object[0]);
        String e10 = c.b(context).e();
        c(context);
        return z10 ? f.a(e10) : gVar.a(new m(gVar));
    }

    public static i b(g gVar, Context context, boolean z10) {
        f33790a.a("Signing out", new Object[0]);
        c(context);
        return z10 ? j.b(Status.f47983f, gVar) : gVar.a(new k(gVar));
    }

    private static void c(Context context) {
        p.a(context).b();
        for (g e10 : g.b()) {
            e10.e();
        }
        C6531e.a();
    }
}
