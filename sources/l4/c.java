package L4;

import android.content.Context;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;

public final /* synthetic */ class c implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f38269a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f38270b;

    public /* synthetic */ c(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f38269a = profileInstallerInitializer;
        this.f38270b = context;
    }

    public final void doFrame(long j10) {
        this.f38269a.h(this.f38270b, j10);
    }
}
