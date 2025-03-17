package com.sugarcube.app.base.data;

import QJ.Q;
import QJ.T;
import QJ.Y;
import android.net.Uri;
import dI.C17164e;
import dI.C17168i;
import java.io.File;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u000eJ\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/sugarcube/app/base/data/AssetItem;", "Lcom/sugarcube/app/base/data/Item;", "Landroid/net/Uri;", "uri", "Ljava/io/File;", "file", "", "responseCode", "", "downloadTimeMS", "<init>", "(Landroid/net/Uri;Ljava/io/File;IJ)V", "LXH/N;", "fetchSync", "()V", "LQJ/Q;", "scope", "LQJ/Y;", "fetchAsync", "(LQJ/Q;)LQJ/Y;", "lastModified", "()J", "touch", "size", "release", "fetch", "fetchDeferred", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "I", "getResponseCode", "()I", "setResponseCode", "(I)V", "J", "getDownloadTimeMS", "setDownloadTimeMS", "(J)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssetItem implements Item {
    public static final int $stable = 8;
    private long downloadTimeMS;
    private final File file;
    private int responseCode;
    private final Uri uri;

    public AssetItem(Uri uri2, File file2, int i10, long j10) {
        C17542s.j(uri2, "uri");
        C17542s.j(file2, "file");
        this.uri = uri2;
        this.file = file2;
        this.responseCode = i10;
        this.downloadTimeMS = j10;
    }

    private final Y<AssetItem> fetchAsync(Q q10) {
        return C16314k.b(q10, (C17168i) null, (T) null, new AssetItem$fetchAsync$1(this, (C17164e<? super AssetItem$fetchAsync$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01de, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        jI.C17416c.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01e2, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void fetchSync() {
        /*
            r13 = this;
            monitor-enter(r13)
            android.net.Uri r0 = r13.uri     // Catch:{ all -> 0x003d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)     // Catch:{ all -> 0x003d }
            java.io.File r1 = r13.file     // Catch:{ all -> 0x003d }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x003d }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != 0) goto L_0x02bd
            int r1 = r0.length()     // Catch:{ all -> 0x003d }
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 1
            r7 = 2
            if (r1 <= 0) goto L_0x01f2
            com.sugarcube.core.logger.Priority r1 = com.sugarcube.core.logger.Priority.DEBUG     // Catch:{ all -> 0x003d }
            android.net.Uri r8 = r13.getUri()     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r9.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r10 = "Fetching model for "
            r9.append(r10)     // Catch:{ all -> 0x003d }
            r9.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x003d }
            if (r8 != 0) goto L_0x0040
            java.lang.String r8 = ""
            goto L_0x0040
        L_0x003d:
            r0 = move-exception
            goto L_0x02cd
        L_0x0040:
            java.lang.String r9 = ""
            int[] r10 = com.sugarcube.app.base.data.AssetItem$fetchSync$$inlined$logDebug$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0     // Catch:{ all -> 0x003d }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x003d }
            r1 = r10[r1]     // Catch:{ all -> 0x003d }
            r10 = 46
            r11 = 36
            r12 = 0
            if (r1 == r6) goto L_0x0139
            if (r1 == r7) goto L_0x0103
            if (r1 == r5) goto L_0x00cd
            if (r1 == r4) goto L_0x0096
            if (r1 != r3) goto L_0x0090
            java.lang.Class<com.sugarcube.app.base.data.AssetItem> r1 = com.sugarcube.app.base.data.AssetItem.class
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = HJ.C15854t.s1(r1, r11, r12, r7, r12)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = HJ.C15854t.o1(r3, r10, r12, r7, r12)     // Catch:{ all -> 0x003d }
            int r4 = r3.length()     // Catch:{ all -> 0x003d }
            if (r4 != 0) goto L_0x0071
            goto L_0x0077
        L_0x0071:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r3, r1)     // Catch:{ all -> 0x003d }
        L_0x0077:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            r3.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            r3.append(r9)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003d }
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x003d }
            goto L_0x016e
        L_0x0090:
            XH.t r0 = new XH.t     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0096:
            java.lang.Class<com.sugarcube.app.base.data.AssetItem> r1 = com.sugarcube.app.base.data.AssetItem.class
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = HJ.C15854t.s1(r1, r11, r12, r7, r12)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = HJ.C15854t.o1(r3, r10, r12, r7, r12)     // Catch:{ all -> 0x003d }
            int r4 = r3.length()     // Catch:{ all -> 0x003d }
            if (r4 != 0) goto L_0x00ae
            goto L_0x00b4
        L_0x00ae:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r3, r1)     // Catch:{ all -> 0x003d }
        L_0x00b4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            r3.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            r3.append(r9)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003d }
            android.util.Log.w(r1, r3)     // Catch:{ all -> 0x003d }
            goto L_0x016e
        L_0x00cd:
            java.lang.Class<com.sugarcube.app.base.data.AssetItem> r1 = com.sugarcube.app.base.data.AssetItem.class
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = HJ.C15854t.s1(r1, r11, r12, r7, r12)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = HJ.C15854t.o1(r3, r10, r12, r7, r12)     // Catch:{ all -> 0x003d }
            int r4 = r3.length()     // Catch:{ all -> 0x003d }
            if (r4 != 0) goto L_0x00e5
            goto L_0x00eb
        L_0x00e5:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r3, r1)     // Catch:{ all -> 0x003d }
        L_0x00eb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            r3.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            r3.append(r9)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003d }
            android.util.Log.i(r1, r3)     // Catch:{ all -> 0x003d }
            goto L_0x016e
        L_0x0103:
            java.lang.Class<com.sugarcube.app.base.data.AssetItem> r1 = com.sugarcube.app.base.data.AssetItem.class
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = HJ.C15854t.s1(r1, r11, r12, r7, r12)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = HJ.C15854t.o1(r3, r10, r12, r7, r12)     // Catch:{ all -> 0x003d }
            int r4 = r3.length()     // Catch:{ all -> 0x003d }
            if (r4 != 0) goto L_0x011b
            goto L_0x0121
        L_0x011b:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r3, r1)     // Catch:{ all -> 0x003d }
        L_0x0121:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            r3.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            r3.append(r9)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003d }
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x003d }
            goto L_0x016e
        L_0x0139:
            java.lang.Class<com.sugarcube.app.base.data.AssetItem> r1 = com.sugarcube.app.base.data.AssetItem.class
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = HJ.C15854t.s1(r1, r11, r12, r7, r12)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = HJ.C15854t.o1(r3, r10, r12, r7, r12)     // Catch:{ all -> 0x003d }
            int r4 = r3.length()     // Catch:{ all -> 0x003d }
            if (r4 != 0) goto L_0x0151
            goto L_0x0157
        L_0x0151:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r3, r1)     // Catch:{ all -> 0x003d }
        L_0x0157:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            r3.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            r3.append(r9)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003d }
            android.util.Log.v(r1, r3)     // Catch:{ all -> 0x003d }
        L_0x016e:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003d }
            GK.z r1 = new GK.z     // Catch:{ all -> 0x003d }
            r1.<init>()     // Catch:{ all -> 0x003d }
            GK.B$a r5 = new GK.B$a     // Catch:{ all -> 0x003d }
            r5.<init>()     // Catch:{ all -> 0x003d }
            GK.B$a r0 = r5.n(r0)     // Catch:{ all -> 0x003d }
            GK.B r0 = r0.b()     // Catch:{ all -> 0x003d }
            GK.e r0 = r1.b(r0)     // Catch:{ all -> 0x003d }
            GK.D r0 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r0)     // Catch:{ all -> 0x003d }
            int r1 = r0.g()     // Catch:{ all -> 0x003d }
            if (r2 > r1) goto L_0x01e3
            r5 = 300(0x12c, float:4.2E-43)
            if (r1 >= r5) goto L_0x01e3
            GK.E r1 = r0.c()     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x02bd
            java.io.InputStream r1 = r1.c()     // Catch:{ all -> 0x003d }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x003d }
            java.io.File r6 = r13.file     // Catch:{ all -> 0x003d }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r8.<init>()     // Catch:{ all -> 0x003d }
            r8.append(r6)     // Catch:{ all -> 0x003d }
            java.lang.String r6 = ".part"
            r8.append(r6)     // Catch:{ all -> 0x003d }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x003d }
            r5.<init>(r6)     // Catch:{ all -> 0x003d }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x003d }
            r6.<init>(r5)     // Catch:{ all -> 0x003d }
            r8 = 0
            jI.C17415b.b(r1, r6, r8, r7, r12)     // Catch:{ all -> 0x01dc }
            jI.C17416c.a(r6, r12)     // Catch:{ all -> 0x003d }
            java.io.File r1 = r13.file     // Catch:{ all -> 0x003d }
            r5.renameTo(r1)     // Catch:{ all -> 0x003d }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003d }
            long r5 = r5 - r3
            r13.downloadTimeMS = r5     // Catch:{ all -> 0x003d }
            int r0 = r0.g()     // Catch:{ all -> 0x003d }
            r13.responseCode = r0     // Catch:{ all -> 0x003d }
            goto L_0x02bd
        L_0x01dc:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01de }
        L_0x01de:
            r1 = move-exception
            jI.C17416c.a(r6, r0)     // Catch:{ all -> 0x003d }
            throw r1     // Catch:{ all -> 0x003d }
        L_0x01e3:
            int r0 = r0.g()     // Catch:{ all -> 0x003d }
            r13.responseCode = r0     // Catch:{ all -> 0x003d }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003d }
            long r0 = r0 - r3
            r13.downloadTimeMS = r0     // Catch:{ all -> 0x003d }
            goto L_0x02bd
        L_0x01f2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x003d }
            android.net.Uri r8 = r13.uri     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r9.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r10 = "Couldn't fetch model, url is empty: url="
            r9.append(r10)     // Catch:{ all -> 0x003d }
            r9.append(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = ", uri="
            r9.append(r0)     // Catch:{ all -> 0x003d }
            r9.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x003d }
            r1.<init>(r0)     // Catch:{ all -> 0x003d }
            com.sugarcube.core.logger.Priority r0 = com.sugarcube.core.logger.Priority.ERROR     // Catch:{ all -> 0x003d }
            java.lang.String r8 = r1.getMessage()     // Catch:{ all -> 0x003d }
            if (r8 != 0) goto L_0x021c
            java.lang.String r8 = ""
        L_0x021c:
            java.lang.String r1 = XH.C16816g.b(r1)     // Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x0224
            java.lang.String r1 = ""
        L_0x0224:
            int[] r9 = com.sugarcube.app.base.data.AssetItem$fetchSync$$inlined$logError$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0     // Catch:{ all -> 0x003d }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x003d }
            r0 = r9[r0]     // Catch:{ all -> 0x003d }
            if (r0 == r6) goto L_0x02a4
            if (r0 == r7) goto L_0x028a
            if (r0 == r5) goto L_0x0270
            if (r0 == r4) goto L_0x0256
            if (r0 != r3) goto L_0x0250
            java.lang.String r0 = "Sugarcube"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            r3.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            r3.append(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x003d }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x003d }
            goto L_0x02bd
        L_0x0250:
            XH.t r0 = new XH.t     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0256:
            java.lang.String r0 = "Sugarcube"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            r3.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            r3.append(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x003d }
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x003d }
            goto L_0x02bd
        L_0x0270:
            java.lang.String r0 = "Sugarcube"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            r3.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            r3.append(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x003d }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x003d }
            goto L_0x02bd
        L_0x028a:
            java.lang.String r0 = "Sugarcube"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            r3.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            r3.append(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x003d }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x003d }
            goto L_0x02bd
        L_0x02a4:
            java.lang.String r0 = "Sugarcube"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            r3.append(r8)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            r3.append(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x003d }
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x003d }
        L_0x02bd:
            java.io.File r0 = r13.file     // Catch:{ all -> 0x003d }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x02cb
            int r0 = r13.responseCode     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x02cb
            r13.responseCode = r2     // Catch:{ all -> 0x003d }
        L_0x02cb:
            monitor-exit(r13)
            return
        L_0x02cd:
            monitor-exit(r13)     // Catch:{ all -> 0x003d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.AssetItem.fetchSync():void");
    }

    public final void fetch() {
        fetchSync();
    }

    public final Y<AssetItem> fetchDeferred(Q q10) {
        C17542s.j(q10, "scope");
        return fetchAsync(q10);
    }

    public final long getDownloadTimeMS() {
        return this.downloadTimeMS;
    }

    public final File getFile() {
        return this.file;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public long lastModified() {
        return this.file.lastModified();
    }

    public void release() {
        String absolutePath = this.file.getAbsolutePath();
        new File(absolutePath + ".key").delete();
        this.file.delete();
    }

    public final void setDownloadTimeMS(long j10) {
        this.downloadTimeMS = j10;
    }

    public final void setResponseCode(int i10) {
        this.responseCode = i10;
    }

    public long size() {
        return this.file.length();
    }

    public void touch() {
        if (this.file.exists()) {
            this.file.setLastModified(Instant.now().toEpochMilli());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AssetItem(Uri uri2, File file2, int i10, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri2, file2, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? 0 : j10);
    }
}
