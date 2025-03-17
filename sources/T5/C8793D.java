package t5;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.C7034c;
import androidx.work.C7055y;
import androidx.work.S;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/c;", "configuration", "", "b", "(Landroid/content/Context;Landroidx/work/c;)Z", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.D  reason: case insensitive filesystem */
public final class C8793D {

    /* renamed from: a  reason: collision with root package name */
    private static final String f56560a;

    static {
        String i10 = C7055y.i("ProcessUtils");
        C17542s.i(i10, "tagWithPrefix(\"ProcessUtils\")");
        f56560a = i10;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    private static final String a(Context context) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            return C8806a.f56605a.a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, S.class.getClassLoader()).getDeclaredMethod("currentProcessName", (Class[]) null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, (Object[]) null);
            C17542s.g(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th2) {
            C7055y.e().b(f56560a, "Unable to check ActivityThread for processName", th2);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        C17542s.h(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean b(Context context, C7034c cVar) {
        C17542s.j(context, "context");
        C17542s.j(cVar, "configuration");
        String a10 = a(context);
        String c10 = cVar.c();
        return (c10 == null || c10.length() == 0) ? C17542s.e(a10, context.getApplicationInfo().processName) : C17542s.e(a10, cVar.c());
    }
}
