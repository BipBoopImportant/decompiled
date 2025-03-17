package fb;

import android.os.IBinder;

/* renamed from: fb.k  reason: case insensitive filesystem */
public final /* synthetic */ class C9695k implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f72940a;

    public /* synthetic */ C9695k(t tVar) {
        this.f72940a = tVar;
    }

    public final void binderDied() {
        t.j(this.f72940a);
    }
}
