package Mc;

import YH.C16877v;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LMc/v;", "", "<init>", "()V", "", "processName", "", "pid", "importance", "", "isDefaultProcess", "LMc/u;", "a", "(Ljava/lang/String;IIZ)LMc/u;", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)Ljava/util/List;", "d", "(Landroid/content/Context;)LMc/u;", "e", "()Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f61832a = new v();

    private v() {
    }

    private final u a(String str, int i10, int i11, boolean z10) {
        return new u(str, i10, i11, z10);
    }

    static /* synthetic */ u b(v vVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return vVar.a(str, i10, i11, z10);
    }

    public final List<u> c(Context context) {
        C17542s.j(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = C16877v.n();
        }
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList<>();
        for (Object next : C16877v.t0(list)) {
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i10) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            C17542s.i(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new u(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, C17542s.e(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final u d(Context context) {
        Object obj;
        C17542s.j(context, "context");
        int myPid = Process.myPid();
        Iterator it = c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((u) obj).b() == myPid) {
                break;
            }
        }
        u uVar = (u) obj;
        if (uVar != null) {
            return uVar;
        }
        return b(this, e(), myPid, 0, false, 12, (Object) null);
    }

    public final String e() {
        String a10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            String a11 = Process.myProcessName();
            C17542s.i(a11, "myProcessName()");
            return a11;
        } else if (i10 >= 28 && (a10 = Application.getProcessName()) != null) {
            return a10;
        } else {
            String a12 = o.a();
            return a12 != null ? a12 : "";
        }
    }
}
