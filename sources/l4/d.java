package L4;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f38271a;

    public /* synthetic */ d(Context context) {
        this.f38271a = context;
    }

    public final void run() {
        ProfileInstallerInitializer.k(this.f38271a);
    }
}
