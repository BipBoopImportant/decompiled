package sj;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0018\u0010\u000f\u001a\u00020\f*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lsj/h;", "Lsj/e;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lsj/e$a;", "event", "LXH/N;", "a", "(J)V", "Landroid/content/Context;", "Landroid/os/Vibrator;", "b", "(Landroid/content/Context;)Landroid/os/Vibrator;", "vibrator", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sj.h  reason: case insensitive filesystem */
public final class C11857h implements C11854e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f102381a;

    public C11857h(Context context) {
        C17542s.j(context, "context");
        this.f102381a = context;
    }

    private final Vibrator b(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            C17542s.h(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            Vibrator a10 = C11855f.a(systemService).getDefaultVibrator();
            C17542s.g(a10);
            return a10;
        }
        Object systemService2 = context.getSystemService("vibrator");
        C17542s.h(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
        return (Vibrator) systemService2;
    }

    public void a(long j10) {
        if (Build.VERSION.SDK_INT >= 31) {
            b(this.f102381a).vibrate(VibrationEffect.createOneShot(j10, -1));
        } else {
            b(this.f102381a).vibrate(j10);
        }
    }
}
