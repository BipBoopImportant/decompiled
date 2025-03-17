package sa;

import K9.C6620s;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C7282e1;
import com.google.android.gms.measurement.internal.C7607h2;
import com.google.android.gms.measurement.internal.P2;

/* renamed from: sa.s  reason: case insensitive filesystem */
public final class C8765s {

    /* renamed from: a  reason: collision with root package name */
    private final a f56134a;

    /* renamed from: sa.s$a */
    public interface a {
        void a(Context context, Intent intent);
    }

    public C8765s(a aVar) {
        C6620s.l(aVar);
        this.f56134a = aVar;
    }

    public final void a(Context context, Intent intent) {
        C7607h2 f10 = P2.a(context, (C7282e1) null, (Long) null).f();
        if (intent == null) {
            f10.J().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        f10.I().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            f10.I().a("Starting wakeful intent.");
            this.f56134a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            f10.J().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
