package wc;

import com.google.firebase.perf.application.a;

/* renamed from: wc.f  reason: case insensitive filesystem */
public final class C10357f implements a.C1180a {

    /* renamed from: a  reason: collision with root package name */
    private static final Ac.a f77602a = Ac.a.e();

    public void a() {
        try {
            C10356e.c();
        } catch (IllegalStateException e10) {
            f77602a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
