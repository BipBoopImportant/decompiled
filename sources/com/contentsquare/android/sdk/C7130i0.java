package com.contentsquare.android.sdk;

import A8.b;
import E8.c;
import F8.g;
import F8.i;
import G8.a;
import G8.d;
import G8.e;
import G8.k;
import QJ.C16340x0;
import QJ.Q;
import QJ.S;
import YH.C16877v;
import a9.G0;
import android.app.Application;
import android.util.DisplayMetrics;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u8.C8886a;

/* renamed from: com.contentsquare.android.sdk.i0  reason: case insensitive filesystem */
public final class C7130i0 {

    /* renamed from: a  reason: collision with root package name */
    public final c f47431a;

    /* renamed from: b  reason: collision with root package name */
    public final g f47432b;

    /* renamed from: c  reason: collision with root package name */
    public final d f47433c;

    /* renamed from: d  reason: collision with root package name */
    public final b f47434d;

    /* renamed from: e  reason: collision with root package name */
    public final C7131j f47435e;

    /* renamed from: f  reason: collision with root package name */
    public final G0 f47436f;

    /* renamed from: g  reason: collision with root package name */
    public final C7146q f47437g;

    /* renamed from: h  reason: collision with root package name */
    public final Q f47438h;

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f47439i = C16877v.f1(k.f36275a.a());

    public C7130i0(Application application) {
        C17542s.j(application, "application");
        C8886a.C0914a aVar = C8886a.f56874d;
        c f10 = aVar.b(application).f();
        this.f47431a = f10;
        this.f47434d = aVar.b(application).c();
        this.f47432b = new g(application, new DisplayMetrics(), (d) null, (i) null, (a) null, (e) null, 60, (DefaultConstructorMarker) null);
        this.f47433c = new d(application);
        this.f47435e = C7131j.f47442k;
        this.f47437g = C7146q.f47587c.getValue();
        this.f47436f = new G0(application, f10);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C17542s.i(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f47438h = S.a(C16340x0.c(newSingleThreadExecutor));
        new D8.c("SettingsViewModel");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
        r1 = (r1 = r1.c()).b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.Intent a(com.contentsquare.android.sdk.C7130i0 r6, android.content.Context r7, java.io.File r8) {
        /*
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.SEND"
            r0.<init>(r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SENDTO"
            r1.<init>(r2)
            java.lang.String r2 = "mailto:"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.setData(r2)
            r0.setSelector(r1)
            u8.a$a r1 = u8.C8886a.f56874d
            u8.a r1 = r1.a()
            r2 = 0
            if (r1 == 0) goto L_0x0038
            A8.b r1 = r1.c()
            if (r1 == 0) goto L_0x0038
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r1 = r1.b()
            if (r1 == 0) goto L_0x0038
            int r1 = r1.g()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0039
        L_0x0038:
            r1 = r2
        L_0x0039:
            java.lang.String r3 = "mobile-devices@contentsquare.com"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.String r4 = "android.intent.extra.EMAIL"
            r0.putExtra(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Debug Information for "
            r3.<init>(r4)
            G8.d r4 = r6.f47433c
            java.lang.String r4 = r4.c()
            r3.append(r4)
            java.lang.String r4 = ": "
            r3.append(r4)
            G8.d r4 = r6.f47433c
            java.lang.String r4 = r4.b()
            r3.append(r4)
            java.lang.String r4 = " - pid "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "android.intent.extra.SUBJECT"
            r0.putExtra(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Thank you to share logs with the Contentsquare support team, this will help us to investigate your issue.\n                    |\n                    |Details:\n                    |App name: "
            r3.<init>(r4)
            G8.d r4 = r6.f47433c
            java.lang.String r4 = r4.c()
            r3.append(r4)
            java.lang.String r4 = "\n                    |App id: "
            r3.append(r4)
            G8.d r4 = r6.f47433c
            java.lang.String r4 = r4.b()
            r3.append(r4)
            java.lang.String r4 = "\n                    |Cs project ID: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "\n                    |App version name: "
            r3.append(r1)
            G8.d r1 = r6.f47433c
            java.lang.String r1 = r1.d()
            r3.append(r1)
            java.lang.String r1 = "\n                    |App version code: "
            r3.append(r1)
            G8.d r1 = r6.f47433c
            long r4 = r1.e()
            r3.append(r4)
            java.lang.String r1 = "\n                    |App min sdk: "
            r3.append(r1)
            G8.d r1 = r6.f47433c
            int r1 = r1.g()
            r3.append(r1)
            java.lang.String r1 = "\n                    |App compile sdk: "
            r3.append(r1)
            G8.d r1 = r6.f47433c
            int r1 = r1.f()
            r3.append(r1)
            java.lang.String r1 = "\n                    |App target sdk: "
            r3.append(r1)
            G8.d r1 = r6.f47433c
            int r1 = r1.j()
            r3.append(r1)
            java.lang.String r1 = "\n                    |App Kotlin version: "
            r3.append(r1)
            G8.d r1 = r6.f47433c
            java.lang.String r1 = r1.a()
            r3.append(r1)
            java.lang.String r1 = "\n                    |Sdk version name: "
            r3.append(r1)
            G8.d r1 = r6.f47433c
            java.lang.String r1 = r1.i()
            r3.append(r1)
            java.lang.String r1 = "\n                    |Sdk version code: "
            r3.append(r1)
            G8.d r6 = r6.f47433c
            int r6 = r6.h()
            r3.append(r6)
            java.lang.String r6 = "\n                "
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r1 = 1
            java.lang.String r6 = HJ.C15854t.o(r6, r2, r1, r2)
            java.lang.String r2 = "android.intent.extra.TEXT"
            r0.putExtra(r2, r6)
            r0.addFlags(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = r7.getPackageName()
            r6.append(r1)
            java.lang.String r1 = ".provider"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            android.net.Uri r6 = androidx.core.content.FileProvider.h(r7, r6, r8)
            java.lang.String r7 = "android.intent.extra.STREAM"
            r0.putExtra(r7, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7130i0.a(com.contentsquare.android.sdk.i0, android.content.Context, java.io.File):android.content.Intent");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        jI.C17416c.a(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.io.File r8, java.lang.String r9, java.util.zip.ZipOutputStream r10) {
        /*
            java.io.File[] r8 = r8.listFiles()
            if (r8 == 0) goto L_0x0086
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L_0x0009:
            if (r2 >= r0) goto L_0x0086
            r3 = r8[r2]
            int r4 = r9.length()
            r5 = 47
            if (r4 != 0) goto L_0x001a
            java.lang.String r4 = r3.getName()
            goto L_0x0030
        L_0x001a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r5)
            java.lang.String r6 = r3.getName()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
        L_0x0030:
            boolean r6 = r3.isDirectory()
            if (r6 == 0) goto L_0x005e
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            r10.putNextEntry(r6)
            r10.closeEntry()
            java.lang.String r5 = "file"
            kotlin.jvm.internal.C17542s.i(r3, r5)
            java.lang.String r5 = "zipEntryName"
            kotlin.jvm.internal.C17542s.i(r4, r5)
            c(r3, r4, r10)
            goto L_0x007c
        L_0x005e:
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r3)
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x007f }
            r3.<init>(r4)     // Catch:{ all -> 0x007f }
            r10.putNextEntry(r3)     // Catch:{ all -> 0x007f }
            byte[] r3 = jI.C17415b.c(r5)     // Catch:{ all -> 0x007f }
            int r4 = r3.length     // Catch:{ all -> 0x007f }
            r10.write(r3, r1, r4)     // Catch:{ all -> 0x007f }
            r10.closeEntry()     // Catch:{ all -> 0x007f }
            XH.N r3 = XH.C16807N.f139792a     // Catch:{ all -> 0x007f }
            r3 = 0
            jI.C17416c.a(r5, r3)
        L_0x007c:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x007f:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r9 = move-exception
            jI.C17416c.a(r5, r8)
            throw r9
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7130i0.c(java.io.File, java.lang.String, java.util.zip.ZipOutputStream):void");
    }

    public final String b() {
        JsonConfig.ProjectConfiguration b10 = this.f47434d.b();
        if (b10 == null) {
            return com.contentsquare.android.core.features.config.model.a.Companion.a();
        }
        JsonConfig.SessionReplay o10 = b10.o();
        return this.f47432b.b() == F8.e.WIFI ? o10.h() : o10.g();
    }
}
