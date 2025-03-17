package Nb;

import Tb.F;
import YH.C16877v;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LNb/j;", "", "<init>", "()V", "", "f", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "", "LTb/F$e$d$a$c;", "d", "(Landroid/content/Context;)Ljava/util/List;", "e", "(Landroid/content/Context;)LTb/F$e$d$a$c;", "processName", "", "pid", "importance", "", "isDefaultProcess", "b", "(Ljava/lang/String;IIZ)LTb/F$e$d$a$c;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f61983a = new j();

    private j() {
    }

    public static /* synthetic */ F.e.d.a.c c(j jVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return jVar.b(str, i10, i11, z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = android.app.Application.getProcessName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String f() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x0010
            java.lang.String r0 = android.os.Process.myProcessName()
            java.lang.String r1 = "{\n      Process.myProcessName()\n    }"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            goto L_0x001d
        L_0x0010:
            r1 = 28
            java.lang.String r2 = ""
            if (r0 < r1) goto L_0x001c
            java.lang.String r0 = android.app.Application.getProcessName()
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Nb.j.f():java.lang.String");
    }

    public final F.e.d.a.c a(String str, int i10, int i11) {
        C17542s.j(str, "processName");
        return c(this, str, i10, i11, false, 8, (Object) null);
    }

    public final F.e.d.a.c b(String str, int i10, int i11, boolean z10) {
        C17542s.j(str, "processName");
        F.e.d.a.c a10 = F.e.d.a.c.a().e(str).d(i10).c(i11).b(z10).a();
        C17542s.i(a10, "builder()\n      .setProc…ltProcess)\n      .build()");
        return a10;
    }

    public final List<F.e.d.a.c> d(Context context) {
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
            arrayList2.add(F.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(C17542s.e(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final F.e.d.a.c e(Context context) {
        Object obj;
        C17542s.j(context, "context");
        int myPid = Process.myPid();
        Iterator it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((F.e.d.a.c) obj).c() == myPid) {
                break;
            }
        }
        F.e.d.a.c cVar = (F.e.d.a.c) obj;
        if (cVar != null) {
            return cVar;
        }
        return c(this, f(), myPid, 0, false, 12, (Object) null);
    }
}
