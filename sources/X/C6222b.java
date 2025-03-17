package x;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.camera.core.impl.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u.C5965a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx/b;", "", "<init>", "()V", "Lu/a$a;", "options", "Landroidx/camera/core/impl/X$c;", "priority", "LXH/N;", "a", "(Lu/a$a;Landroidx/camera/core/impl/X$c;)V", "camera-camera2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.b  reason: case insensitive filesystem */
public final class C6222b {

    /* renamed from: a  reason: collision with root package name */
    public static final C6222b f31521a = new C6222b();

    private C6222b() {
    }

    public static final void a(C5965a.C0464a aVar, X.c cVar) {
        C17542s.j(aVar, "options");
        C17542s.j(cVar, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            aVar.g(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, cVar);
        }
    }
}
