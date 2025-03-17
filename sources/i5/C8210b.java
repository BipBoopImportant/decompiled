package i5;

import H2.a;
import android.app.Activity;
import android.content.res.Configuration;
import androidx.window.layout.adapter.sidecar.SidecarCompat;

/* renamed from: i5.b  reason: case insensitive filesystem */
public final /* synthetic */ class C8210b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SidecarCompat f53147a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f53148b;

    public /* synthetic */ C8210b(SidecarCompat sidecarCompat, Activity activity) {
        this.f53147a = sidecarCompat;
        this.f53148b = activity;
    }

    public final void accept(Object obj) {
        SidecarCompat.l(this.f53147a, this.f53148b, (Configuration) obj);
    }
}
