package a9;

import android.app.Activity;
import android.view.ViewGroup;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

public final class X3 implements C17642l<ViewGroup, String> {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f42381a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42382b;

    /* renamed from: c  reason: collision with root package name */
    public final O0 f42383c;

    public X3(Activity activity, String str, O0 o02) {
        C17542s.j(activity, "activity");
        C17542s.j(str, "title");
        C17542s.j(o02, "pathGenerator");
        this.f42381a = activity;
        this.f42382b = str;
        this.f42383c = o02;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            a9.O0 r0 = r13.f42383c
            android.app.Activity r1 = r13.f42381a
            java.lang.String r2 = r13.f42382b
            r0.getClass()
            java.lang.String r3 = "activity"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "pageTitle"
            kotlin.jvm.internal.C17542s.j(r2, r3)
            android.app.Application r3 = r0.f42166a
            java.lang.String r3 = r3.getPackageName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "app-and://"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r4 = "parse(PROTOCOL + appId)"
            kotlin.jvm.internal.C17542s.i(r3, r4)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r4 = r1.getSimpleName()
            java.lang.String r1 = "activity.javaClass.simpleName"
            kotlin.jvm.internal.C17542s.i(r4, r1)
            r8 = 4
            r9 = 0
            java.lang.String r5 = "Activity"
            java.lang.String r6 = ""
            r7 = 0
            java.lang.String r1 = HJ.C15854t.Q(r4, r5, r6, r7, r8, r9)
            r3.appendPath(r1)
            if (r14 == 0) goto L_0x0144
            com.contentsquare.android.sdk.o1 r1 = r0.f42167b
            r1.getClass()
            java.lang.String r4 = "root"
            kotlin.jvm.internal.C17542s.j(r14, r4)
            java.util.concurrent.ArrayBlockingQueue r4 = new java.util.concurrent.ArrayBlockingQueue
            r5 = 1
            r4.<init>(r5)
            r4.add(r14)
            D8.c r5 = r1.f47577a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Finding the biggest segment in "
            r6.<init>(r7)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            r5.f(r6)
            r5 = 0
        L_0x007a:
            r6 = r5
        L_0x007b:
            if (r6 != 0) goto L_0x0126
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x0126
            java.lang.Object r6 = r4.poll()
            kotlin.jvm.internal.C17542s.g(r6)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r7 = r1.b(r6)
            if (r7 != 0) goto L_0x00a6
            D8.c r7 = r1.f47577a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "No biggest child, returning: "
            r8.<init>(r9)
        L_0x009b:
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r7.f(r8)
            goto L_0x007b
        L_0x00a6:
            boolean r8 = r7 instanceof android.widget.AdapterView
            if (r8 == 0) goto L_0x00be
            D8.c r6 = r1.f47577a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Found an AdapterView, returning as biggest: "
            r8.<init>(r9)
        L_0x00b3:
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            r6.f(r8)
            goto L_0x00fc
        L_0x00be:
            java.lang.Class r8 = r7.getClass()
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "biggest.javaClass.toString()"
            kotlin.jvm.internal.C17542s.i(r8, r9)
            java.lang.String r10 = "RecyclerView"
            r11 = 0
            r12 = 2
            boolean r8 = HJ.C15854t.d0(r8, r10, r11, r12, r5)
            if (r8 == 0) goto L_0x00df
            D8.c r6 = r1.f47577a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Found a RecyclerView, returning as biggest: "
            r8.<init>(r9)
            goto L_0x00b3
        L_0x00df:
            java.lang.Class r8 = r7.getClass()
            java.lang.String r8 = r8.toString()
            kotlin.jvm.internal.C17542s.i(r8, r9)
            java.lang.String r9 = "AndroidComposeView"
            boolean r8 = HJ.C15854t.d0(r8, r9, r11, r12, r5)
            if (r8 == 0) goto L_0x00ff
            D8.c r6 = r1.f47577a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Found an AndroidComposeView, returning as biggest: "
            r8.<init>(r9)
            goto L_0x00b3
        L_0x00fc:
            r6 = r7
            goto L_0x007b
        L_0x00ff:
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x011b
            D8.c r6 = r1.f47577a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Adding child for processing: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            r6.f(r8)
            r4.add(r7)
            goto L_0x007a
        L_0x011b:
            D8.c r7 = r1.f47577a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Found biggest child, returning parent: "
            r8.<init>(r9)
            goto L_0x009b
        L_0x0126:
            if (r6 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r14 = r6
        L_0x012a:
            java.lang.Class r1 = r14.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r4 = "id_"
            java.lang.String r1 = r4.concat(r1)
            java.lang.String r14 = a9.C6862k0.a(r14, r1)
            java.lang.String r1 = "getResourceEntryName(\n  …simpleName,\n            )"
            kotlin.jvm.internal.C17542s.i(r14, r1)
            r3.appendPath(r14)
        L_0x0144:
            java.lang.String r14 = "ub"
            kotlin.jvm.internal.C17542s.i(r3, r14)
            if (r2 == 0) goto L_0x0157
            int r14 = r2.length()
            if (r14 != 0) goto L_0x0152
            goto L_0x0157
        L_0x0152:
            java.lang.String r14 = "title"
            r3.appendQueryParameter(r14, r2)
        L_0x0157:
            java.lang.String r14 = r3.toString()
            java.lang.String r1 = "ub.toString()"
            kotlin.jvm.internal.C17542s.i(r14, r1)
            D8.c r0 = r0.f42168c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Complete Path: "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.f(r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.X3.invoke(java.lang.Object):java.lang.Object");
    }
}
