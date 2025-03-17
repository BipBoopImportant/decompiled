package ck;

import HJ.C15854t;
import KE.C13146b;
import android.content.Context;
import android.os.Build;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"Lck/b;", "Lck/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "a", "(LdI/e;)Ljava/lang/Object;", "c", "", "b", "()Ljava/lang/String;", "LKE/b;", "LKE/b;", "rootBeer", "security_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ck.b  reason: case insensitive filesystem */
public final class C11142b implements C11143c {

    /* renamed from: a  reason: collision with root package name */
    private final C13146b f90762a;

    public C11142b(Context context) {
        C17542s.j(context, "context");
        this.f90762a = new C13146b(context);
    }

    public Object a(C17164e<? super Boolean> eVar) {
        boolean n10 = this.f90762a.n();
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Root: " + n10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C11142b.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar2, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        return b.a(n10);
    }

    public final String b() {
        String str = Build.BRAND;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.HARDWARE;
        String str4 = Build.MODEL;
        String str5 = Build.PRODUCT;
        return C15854t.o("\n                brand=" + str + " \n                manufacturer=" + str2 + " \n                hardware=" + str3 + " \n                model=" + str4 + " \n                product=" + str5 + "\n    ", (String) null, 1, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d9, code lost:
        if (android.os.Debug.isDebuggerConnected() == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (HJ.C15854t.W(r0, "generic", false, 2, (java.lang.Object) null) == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(dI.C17164e<? super java.lang.Boolean> r17) {
        /*
            r16 = this;
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = HJ.C15854t.W(r0, r1, r2, r3, r4)
            r5 = 1
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r6 = "DEVICE"
            kotlin.jvm.internal.C17542s.i(r0, r6)
            boolean r0 = HJ.C15854t.W(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00db
        L_0x0020:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r6 = "FINGERPRINT"
            kotlin.jvm.internal.C17542s.i(r0, r6)
            boolean r1 = HJ.C15854t.W(r0, r1, r2, r3, r4)
            if (r1 != 0) goto L_0x00db
            kotlin.jvm.internal.C17542s.i(r0, r6)
            java.lang.String r1 = "unknown"
            boolean r0 = HJ.C15854t.W(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r6 = "goldfish"
            boolean r6 = HJ.C15854t.d0(r0, r6, r2, r3, r4)
            if (r6 != 0) goto L_0x00db
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r1 = "ranchu"
            boolean r0 = HJ.C15854t.d0(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r6 = "google_sdk"
            boolean r7 = HJ.C15854t.d0(r0, r6, r2, r3, r4)
            if (r7 != 0) goto L_0x00db
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r7 = "Emulator"
            boolean r7 = HJ.C15854t.d0(r0, r7, r2, r3, r4)
            if (r7 != 0) goto L_0x00db
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = HJ.C15854t.d0(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = HJ.C15854t.d0(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r1 = "PRODUCT"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r7 = "sdk_google"
            boolean r7 = HJ.C15854t.d0(r0, r7, r2, r3, r4)
            if (r7 != 0) goto L_0x00db
            kotlin.jvm.internal.C17542s.i(r0, r1)
            boolean r6 = HJ.C15854t.d0(r0, r6, r2, r3, r4)
            if (r6 != 0) goto L_0x00db
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r6 = "sdk"
            boolean r6 = HJ.C15854t.d0(r0, r6, r2, r3, r4)
            if (r6 != 0) goto L_0x00db
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r6 = "sdk_x86"
            boolean r6 = HJ.C15854t.d0(r0, r6, r2, r3, r4)
            if (r6 != 0) goto L_0x00db
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r6 = "vbox86p"
            boolean r6 = HJ.C15854t.d0(r0, r6, r2, r3, r4)
            if (r6 != 0) goto L_0x00db
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r6 = "emulator"
            boolean r6 = HJ.C15854t.d0(r0, r6, r2, r3, r4)
            if (r6 != 0) goto L_0x00db
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.String r1 = "simulator"
            boolean r0 = HJ.C15854t.d0(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00db
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 == 0) goto L_0x00dc
        L_0x00db:
            r2 = r5
        L_0x00dc:
            if (r2 == 0) goto L_0x019d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r16.b()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "A wild emulator appears:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            qv.e r1 = qv.e.ERROR
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x010b:
            boolean r8 = r6.hasNext()
            r12 = 0
            if (r8 == 0) goto L_0x0123
            java.lang.Object r8 = r6.next()
            r9 = r8
            qv.b r9 = (qv.C11819b) r9
            boolean r9 = r9.b(r1, r12)
            if (r9 == 0) goto L_0x010b
            r7.add(r8)
            goto L_0x010b
        L_0x0123:
            java.util.Iterator r13 = r7.iterator()
            r6 = r4
            r7 = r6
        L_0x0129:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x019d
            java.lang.Object r8 = r13.next()
            qv.b r8 = (qv.C11819b) r8
            if (r6 != 0) goto L_0x0142
            java.lang.String r6 = qv.C11818a.a(r4, r0)
            if (r6 != 0) goto L_0x013e
            goto L_0x019d
        L_0x013e:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x0142:
            r14 = r6
            if (r7 != 0) goto L_0x0190
            java.lang.Class<ck.b> r6 = ck.C11142b.class
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r7 = 36
            java.lang.String r7 = HJ.C15854t.s1(r6, r7, r4, r3, r4)
            r9 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r9, r4, r3, r4)
            int r9 = r7.length()
            if (r9 != 0) goto L_0x0161
            goto L_0x0167
        L_0x0161:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r7, r6)
        L_0x0167:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r9 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r9, r5)
            if (r7 == 0) goto L_0x017a
            java.lang.String r7 = "m"
            goto L_0x017c
        L_0x017a:
            java.lang.String r7 = "b"
        L_0x017c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = "|"
            r9.append(r7)
            r9.append(r6)
            java.lang.String r7 = r9.toString()
        L_0x0190:
            r15 = r7
            r6 = r8
            r7 = r1
            r8 = r15
            r9 = r12
            r10 = r0
            r11 = r14
            r6.a(r7, r8, r9, r10, r11)
            r6 = r14
            r7 = r15
            goto L_0x0129
        L_0x019d:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ck.C11142b.c(dI.e):java.lang.Object");
    }
}
