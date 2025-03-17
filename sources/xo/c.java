package Xo;

import HJ.C15854t;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import u2.C6012a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0000H\u0010¢\u0006\u0004\b\u0007\u0010\b\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroid/content/Context;", "", "uri", "LXH/N;", "c", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/app/Activity;", "a", "(Landroid/content/Context;)Landroid/app/Activity;", "", "b", "(Landroid/content/Context;)Z", "isScreenReaderOn", "core-android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r2 
      PHI: (r2v1 android.content.Context) = (r2v0 android.content.Context), (r2v3 android.content.Context) binds: [B:0:0x0000, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.app.Activity a(android.content.Context r2) {
        /*
        L_0x0000:
            boolean r0 = r2 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r2
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 != 0) goto L_0x001d
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0013
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            if (r2 == 0) goto L_0x001e
            android.content.Context r2 = r2.getBaseContext()
            if (r2 == 0) goto L_0x001e
            goto L_0x0000
        L_0x001d:
            r1 = r0
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Xo.c.a(android.content.Context):android.app.Activity");
    }

    public static final boolean b(Context context) {
        C17542s.j(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        C17542s.g(enabledAccessibilityServiceList);
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public static final void c(Context context, String str) {
        char c10;
        Context context2 = context;
        C17542s.j(context2, "<this>");
        C17542s.j(str, "uri");
        char c11 = '$';
        if (C15854t.v0(str)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No contact uri");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = context.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str3 = str5;
                str2 = str4;
                c11 = '$';
            }
            return;
        }
        try {
            C6012a.o(context2, new Intent("android.intent.action.VIEW", Uri.parse(str)), (Bundle) null);
        } catch (ActivityNotFoundException e10) {
            ActivityNotFoundException activityNotFoundException = e10;
            e eVar2 = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a("Could not start any intent for the provided Uri", activityNotFoundException);
                    if (a11 != null) {
                        str6 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str7 == null) {
                    String name2 = context.getClass().getName();
                    C17542s.g(name2);
                    c10 = '$';
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    c10 = '$';
                }
                char c12 = c10;
                bVar2.a(eVar2, str7, false, activityNotFoundException, str6);
                Context context3 = context;
            }
        }
    }
}
