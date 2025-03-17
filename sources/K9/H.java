package K9;

import H9.C6535i;
import android.content.Intent;

final class H extends I {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f37765a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C6535i f37766b;

    H(Intent intent, C6535i iVar, int i10) {
        this.f37765a = intent;
        this.f37766b = iVar;
    }

    public final void a() {
        Intent intent = this.f37765a;
        if (intent != null) {
            this.f37766b.startActivityForResult(intent, 2);
        }
    }
}
