package a9;

import D8.c;
import E8.b;
import H2.a;
import android.app.Activity;
import com.contentsquare.android.sdk.C;
import com.contentsquare.android.sdk.C0;
import com.contentsquare.android.sdk.C7133k;
import com.contentsquare.android.sdk.C7149s;
import com.contentsquare.android.sdk.D0;
import com.contentsquare.android.sdk.G;
import com.contentsquare.android.sdk.J0;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.g0  reason: case insensitive filesystem */
public final class C6830g0 implements a<Activity> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C f42568a;

    public C6830g0(C c10) {
        this.f42568a = c10;
    }

    public final void accept(Object obj) {
        Activity activity = (Activity) obj;
        this.f42568a.f46916b.f42591a.o(b.IS_HIDE_EVENT_PENDING);
        this.f42568a.f46916b.f42591a.o(b.SCHEDULED_APP_HIDE_EVENT);
        C c10 = this.f42568a;
        Runnable runnable = c10.f46929o;
        if (runnable != null) {
            c10.f46926l.f("canceling hide event event");
            c10.f46928n.removeCallbacks(runnable);
        } else {
            C7149s.a aVar = (C7149s.a) C7133k.b(c10.f46920f, 1);
            c cVar = c10.f46926l;
            cVar.j("Starting with Session number: " + aVar.f47750h);
            c10.f46926l.f("sending show event");
            c10.f46917c.a(aVar);
        }
        C c11 = this.f42568a;
        c11.f46927m = activity;
        if (activity != null) {
            J0 j02 = c11.f46922h;
            c11.f46919e.getClass();
            j02.b(C0.f46934b);
            ((D4) this.f42568a.f46921g).a(activity);
            this.f42568a.f46925k.a(activity);
            String canonicalName = activity.getClass().getCanonicalName();
            if (canonicalName != null) {
                G g10 = this.f42568a.f46915a;
                g10.getClass();
                C17542s.j(canonicalName, "name");
                C7133k d10 = g10.f46981k.d();
                C17542s.i(d10, "csApplicationModule.eventsBuildersFactory");
                D0.a aVar2 = (D0.a) C7133k.b(d10, 30);
                aVar2.f46943k = canonicalName;
                g10.f46973c.a(aVar2);
                return;
            }
            return;
        }
        c11.f46926l.f("[onActivityResumed]: the activity was null when trying to call interceptors");
    }
}
