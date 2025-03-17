package Za;

import android.os.IBinder;

public final /* synthetic */ class v implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C9373D f65054a;

    public /* synthetic */ v(C9373D d10) {
        this.f65054a = d10;
    }

    public final void binderDied() {
        C9373D.j(this.f65054a);
    }
}
