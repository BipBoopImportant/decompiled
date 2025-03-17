package androidx.work;

import T4.a;
import android.content.Context;
import androidx.work.C7034c;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements a<S> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f45108a = C7055y.i("WrkMgrInitializer");

    public List<Class<? extends a<?>>> a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public S b(Context context) {
        C7055y.e().a(f45108a, "Initializing WorkManager with default configuration.");
        S.l(context, new C7034c.a().a());
        return S.i(context);
    }
}
