package Ys;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0015"}, d2 = {"LYs/d;", "LYs/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/android/installreferrer/api/InstallReferrerStateListener;", "listener", "LXH/N;", "b", "(Lcom/android/installreferrer/api/InstallReferrerStateListener;)V", "", "c", "()Ljava/lang/String;", "a", "()V", "Landroid/content/Context;", "Lcom/android/installreferrer/api/InstallReferrerClient;", "kotlin.jvm.PlatformType", "Lcom/android/installreferrer/api/InstallReferrerClient;", "referrerClient", "installreferrer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f89729a;

    /* renamed from: b  reason: collision with root package name */
    private final InstallReferrerClient f89730b;

    public d(Context context) {
        C17542s.j(context, "context");
        this.f89729a = context;
        this.f89730b = InstallReferrerClient.newBuilder(context).build();
    }

    public void a() {
        this.f89730b.endConnection();
    }

    public void b(InstallReferrerStateListener installReferrerStateListener) {
        C17542s.j(installReferrerStateListener, "listener");
        this.f89730b.startConnection(installReferrerStateListener);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String c() {
        /*
            r23 = this;
            java.lang.String r1 = "|"
            java.lang.String r2 = "b"
            java.lang.String r3 = "m"
            java.lang.String r4 = "main"
            java.lang.String r5 = "Kt"
            java.lang.Class<Ys.d> r6 = Ys.d.class
            r8 = 46
            r9 = 36
            r10 = 2
            r11 = 0
            qv.e r0 = qv.e.DEBUG     // Catch:{ RemoteException -> 0x003d }
            qv.d r12 = qv.d.f102012a     // Catch:{ RemoteException -> 0x003d }
            java.util.List r12 = r12.a()     // Catch:{ RemoteException -> 0x003d }
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch:{ RemoteException -> 0x003d }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x003d }
            r13.<init>()     // Catch:{ RemoteException -> 0x003d }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ RemoteException -> 0x003d }
        L_0x0025:
            boolean r14 = r12.hasNext()     // Catch:{ RemoteException -> 0x003d }
            r15 = 0
            if (r14 == 0) goto L_0x0042
            java.lang.Object r14 = r12.next()     // Catch:{ RemoteException -> 0x003d }
            r7 = r14
            qv.b r7 = (qv.C11819b) r7     // Catch:{ RemoteException -> 0x003d }
            boolean r7 = r7.b(r0, r15)     // Catch:{ RemoteException -> 0x003d }
            if (r7 == 0) goto L_0x0025
            r13.add(r14)     // Catch:{ RemoteException -> 0x003d }
            goto L_0x0025
        L_0x003d:
            r0 = move-exception
            r7 = r23
            goto L_0x00d1
        L_0x0042:
            java.util.Iterator r7 = r13.iterator()     // Catch:{ RemoteException -> 0x003d }
            r12 = r11
            r13 = r12
        L_0x0048:
            boolean r14 = r7.hasNext()     // Catch:{ RemoteException -> 0x003d }
            if (r14 == 0) goto L_0x005f
            java.lang.Object r14 = r7.next()     // Catch:{ RemoteException -> 0x003d }
            qv.b r14 = (qv.C11819b) r14     // Catch:{ RemoteException -> 0x003d }
            r15 = 0
            if (r12 != 0) goto L_0x0066
            java.lang.String r12 = "Getting referrer details"
            java.lang.String r12 = qv.C11818a.a(r12, r15)     // Catch:{ RemoteException -> 0x003d }
            if (r12 != 0) goto L_0x0062
        L_0x005f:
            r7 = r23
            goto L_0x00c0
        L_0x0062:
            java.lang.String r12 = qv.C11820c.a(r12)     // Catch:{ RemoteException -> 0x003d }
        L_0x0066:
            r18 = r12
            if (r13 != 0) goto L_0x00a8
            java.lang.String r12 = r6.getName()     // Catch:{ RemoteException -> 0x003d }
            kotlin.jvm.internal.C17542s.g(r12)     // Catch:{ RemoteException -> 0x003d }
            java.lang.String r13 = HJ.C15854t.s1(r12, r9, r11, r10, r11)     // Catch:{ RemoteException -> 0x003d }
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r11, r10, r11)     // Catch:{ RemoteException -> 0x003d }
            int r17 = r13.length()     // Catch:{ RemoteException -> 0x003d }
            if (r17 != 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            java.lang.String r12 = HJ.C15854t.P0(r13, r5)     // Catch:{ RemoteException -> 0x003d }
        L_0x0084:
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch:{ RemoteException -> 0x003d }
            java.lang.String r13 = r13.getName()     // Catch:{ RemoteException -> 0x003d }
            r15 = 1
            boolean r13 = HJ.C15854t.b0(r13, r4, r15)     // Catch:{ RemoteException -> 0x003d }
            if (r13 == 0) goto L_0x0095
            r13 = r3
            goto L_0x0096
        L_0x0095:
            r13 = r2
        L_0x0096:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x003d }
            r15.<init>()     // Catch:{ RemoteException -> 0x003d }
            r15.append(r13)     // Catch:{ RemoteException -> 0x003d }
            r15.append(r1)     // Catch:{ RemoteException -> 0x003d }
            r15.append(r12)     // Catch:{ RemoteException -> 0x003d }
            java.lang.String r13 = r15.toString()     // Catch:{ RemoteException -> 0x003d }
        L_0x00a8:
            r19 = r13
            r12 = r14
            r13 = r0
            r14 = r19
            r16 = 0
            r20 = 0
            r15 = r20
            r17 = r18
            r12.a(r13, r14, r15, r16, r17)     // Catch:{ RemoteException -> 0x003d }
            r12 = r18
            r13 = r19
            r15 = r20
            goto L_0x0048
        L_0x00c0:
            com.android.installreferrer.api.InstallReferrerClient r0 = r7.f89730b     // Catch:{ RemoteException -> 0x00d0 }
            com.android.installreferrer.api.ReferrerDetails r0 = r0.getInstallReferrer()     // Catch:{ RemoteException -> 0x00d0 }
            java.lang.String r12 = "getInstallReferrer(...)"
            kotlin.jvm.internal.C17542s.i(r0, r12)     // Catch:{ RemoteException -> 0x00d0 }
            java.lang.String r0 = r0.getInstallReferrer()     // Catch:{ RemoteException -> 0x00d0 }
            return r0
        L_0x00d0:
            r0 = move-exception
        L_0x00d1:
            qv.e r15 = qv.e.WARN
            qv.d r12 = qv.d.f102012a
            java.util.List r12 = r12.a()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x00e4:
            boolean r14 = r12.hasNext()
            r8 = 0
            if (r14 == 0) goto L_0x0100
            java.lang.Object r14 = r12.next()
            r9 = r14
            qv.b r9 = (qv.C11819b) r9
            boolean r8 = r9.b(r15, r8)
            if (r8 == 0) goto L_0x00fb
            r13.add(r14)
        L_0x00fb:
            r8 = 46
            r9 = 36
            goto L_0x00e4
        L_0x0100:
            java.util.Iterator r9 = r13.iterator()
            r12 = r11
            r13 = r12
        L_0x0106:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x01ab
            java.lang.Object r14 = r9.next()
            qv.b r14 = (qv.C11819b) r14
            if (r12 != 0) goto L_0x0135
            java.lang.String r12 = r0.getMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "RemoteException: "
            r8.append(r10)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = qv.C11818a.a(r8, r0)
            if (r8 != 0) goto L_0x0131
            goto L_0x01ab
        L_0x0131:
            java.lang.String r12 = qv.C11820c.a(r8)
        L_0x0135:
            r8 = r12
            if (r13 != 0) goto L_0x0185
            java.lang.String r10 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r19 = r2
            r12 = 36
            r13 = 2
            java.lang.String r2 = HJ.C15854t.s1(r10, r12, r11, r13, r11)
            r21 = r3
            r3 = 46
            java.lang.String r2 = HJ.C15854t.o1(r2, r3, r11, r13, r11)
            int r16 = r2.length()
            if (r16 != 0) goto L_0x0157
            goto L_0x015b
        L_0x0157:
            java.lang.String r10 = HJ.C15854t.P0(r2, r5)
        L_0x015b:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r3 = 1
            boolean r2 = HJ.C15854t.b0(r2, r4, r3)
            if (r2 == 0) goto L_0x016d
            r2 = r21
            goto L_0x016f
        L_0x016d:
            r2 = r19
        L_0x016f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r3 = r2
            r10 = r12
            r2 = r13
            goto L_0x018e
        L_0x0185:
            r19 = r2
            r21 = r3
            r2 = 2
            r12 = 36
            r10 = r12
            r3 = r13
        L_0x018e:
            r12 = r14
            r13 = r15
            r14 = r3
            r20 = r15
            r22 = 0
            r15 = r22
            r16 = r0
            r17 = r8
            r12.a(r13, r14, r15, r16, r17)
            r10 = r2
            r13 = r3
            r12 = r8
            r2 = r19
            r15 = r20
            r3 = r21
            r8 = r22
            goto L_0x0106
        L_0x01ab:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Ys.d.c():java.lang.String");
    }
}
