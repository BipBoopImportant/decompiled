package com.sugarcube.app.base.data.asset;

import GK.C15776D;
import GK.C15777E;
import GK.z;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import android.content.Context;
import android.net.Uri;
import com.sugarcube.app.base.di.AppModule;
import dI.C17164e;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0011*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010 \u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/sugarcube/app/base/data/asset/VideoAssetCacheImpl;", "Lcom/sugarcube/app/base/data/asset/VideoAssetCache;", "Landroid/content/Context;", "context", "LQJ/Q;", "scope", "LQJ/M;", "dispatcher", "<init>", "(Landroid/content/Context;LQJ/Q;LQJ/M;)V", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "asset", "LGK/D;", "downloadFile", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;LdI/e;)Ljava/lang/Object;", "LGK/E;", "body", "", "fullPath", "writeToFile", "(LGK/E;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ljava/io/File;", "md5", "(Ljava/io/File;)Ljava/lang/String;", "Landroid/net/Uri;", "findInCache", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;)Landroid/net/Uri;", "cacheAsset", "getDownloadUri", "Landroid/content/Context;", "LQJ/Q;", "LQJ/M;", "folder", "Ljava/lang/String;", "oldFolder", "LGK/z;", "okHttpClient", "LGK/z;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoAssetCacheImpl implements VideoAssetCache {
    public static final int $stable = 8;
    private final Context context;
    private final M dispatcher;
    /* access modifiers changed from: private */
    public final String folder;
    /* access modifiers changed from: private */
    public final z okHttpClient = new z.a().c();
    private final String oldFolder;
    private final Q scope;

    public VideoAssetCacheImpl(Context context2, @AppModule.AppScope Q q10, @AppModule.IODispatcher M m10) {
        C17542s.j(context2, "context");
        C17542s.j(q10, "scope");
        C17542s.j(m10, "dispatcher");
        this.context = context2;
        this.scope = q10;
        this.dispatcher = m10;
        String absolutePath = context2.getFilesDir().getAbsolutePath();
        this.folder = absolutePath + "/sugarcube-assets";
        String absolutePath2 = context2.getFilesDir().getAbsolutePath();
        this.oldFolder = absolutePath2 + "/assets";
    }

    /* access modifiers changed from: private */
    public final Object downloadFile(VideoAsset videoAsset, C17164e<? super C15776D> eVar) {
        return C16310i.g(this.dispatcher, new VideoAssetCacheImpl$downloadFile$2(this, videoAsset, (C17164e<? super VideoAssetCacheImpl$downloadFile$2>) null), eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        jI.C17416c.a(r1, r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String md5(java.io.File r15) {
        /*
            r14 = this;
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r15)
            com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$md5$digest$1$1$1 r15 = new com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$md5$digest$1$1$1     // Catch:{ all -> 0x0037 }
            r15.<init>(r0)     // Catch:{ all -> 0x0037 }
            r2 = 0
            r3 = 2
            r4 = 0
            jI.C17415b.b(r1, r15, r2, r3, r4)     // Catch:{ all -> 0x0037 }
            XH.N r15 = XH.C16807N.f139792a     // Catch:{ all -> 0x0037 }
            jI.C17416c.a(r1, r4)
            byte[] r5 = r0.digest()
            java.lang.String r15 = "digest(...)"
            kotlin.jvm.internal.C17542s.i(r5, r15)
            com.sugarcube.app.base.data.asset.a r11 = new com.sugarcube.app.base.data.asset.a
            r11.<init>()
            r12 = 30
            r13 = 0
            java.lang.String r6 = ""
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r15 = YH.C16870n.B0(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        L_0x0037:
            r15 = move-exception
            throw r15     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            jI.C17416c.a(r1, r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.asset.VideoAssetCacheImpl.md5(java.io.File):java.lang.String");
    }

    /* access modifiers changed from: private */
    public static final CharSequence md5$lambda$8(byte b10) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        C17542s.i(format, "format(...)");
        return format;
    }

    /* access modifiers changed from: private */
    public final Object writeToFile(C15777E e10, String str, C17164e<? super String> eVar) {
        return C16310i.g(this.dispatcher, new VideoAssetCacheImpl$writeToFile$2(e10, this, str, (C17164e<? super VideoAssetCacheImpl$writeToFile$2>) null), eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x06a5  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0735 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0736  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object cacheAsset(com.sugarcube.app.base.data.asset.VideoAsset r23, dI.C17164e<? super android.net.Uri> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$cacheAsset$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$cacheAsset$1 r3 = (com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$cacheAsset$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$cacheAsset$1 r3 = new com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$cacheAsset$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.label
            r7 = 1
            r8 = 2
            if (r6 == 0) goto L_0x00bb
            if (r6 == r7) goto L_0x0067
            if (r6 != r8) goto L_0x005f
            java.lang.Object r1 = r3.L$10
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.L$9
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.L$8
            com.sugarcube.core.logger.Priority r1 = (com.sugarcube.core.logger.Priority) r1
            java.lang.Object r1 = r3.L$7
            com.sugarcube.app.base.data.asset.VideoAssetCacheImpl r1 = (com.sugarcube.app.base.data.asset.VideoAssetCacheImpl) r1
            java.lang.Object r1 = r3.L$6
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.L$5
            GK.D r1 = (GK.C15776D) r1
            java.lang.Object r1 = r3.L$4
            kotlin.jvm.internal.K r1 = (kotlin.jvm.internal.K) r1
            java.lang.Object r1 = r3.L$3
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r1 = r3.L$2
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.L$1
            com.sugarcube.app.base.data.asset.VideoAsset r1 = (com.sugarcube.app.base.data.asset.VideoAsset) r1
            java.lang.Object r2 = r3.L$0
            com.sugarcube.app.base.data.asset.VideoAssetCacheImpl r2 = (com.sugarcube.app.base.data.asset.VideoAssetCacheImpl) r2
            XH.y.b(r4)
            goto L_0x06e8
        L_0x005f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0067:
            int r1 = r3.I$4
            int r2 = r3.I$3
            int r6 = r3.I$2
            int r7 = r3.I$1
            int r9 = r3.I$0
            java.lang.Object r10 = r3.L$9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r3.L$8
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r3.L$7
            com.sugarcube.core.logger.Priority r12 = (com.sugarcube.core.logger.Priority) r12
            java.lang.Object r13 = r3.L$6
            com.sugarcube.app.base.data.asset.VideoAssetCacheImpl r13 = (com.sugarcube.app.base.data.asset.VideoAssetCacheImpl) r13
            java.lang.Object r14 = r3.L$5
            com.sugarcube.app.base.data.asset.VideoAssetCacheImpl r14 = (com.sugarcube.app.base.data.asset.VideoAssetCacheImpl) r14
            java.lang.Object r14 = r3.L$4
            kotlin.jvm.internal.K r14 = (kotlin.jvm.internal.K) r14
            java.lang.Object r15 = r3.L$3
            java.io.File r15 = (java.io.File) r15
            java.lang.Object r8 = r3.L$2
            dI.e r8 = (dI.C17164e) r8
            r23 = r1
            java.lang.Object r1 = r3.L$1
            com.sugarcube.app.base.data.asset.VideoAsset r1 = (com.sugarcube.app.base.data.asset.VideoAsset) r1
            r24 = r1
            java.lang.Object r1 = r3.L$0
            com.sugarcube.app.base.data.asset.VideoAssetCacheImpl r1 = (com.sugarcube.app.base.data.asset.VideoAssetCacheImpl) r1
            XH.y.b(r4)
            r0 = r14
            r14 = r12
            r12 = r10
            r10 = r7
            r7 = r4
            r4 = r1
            r1 = r24
            r20 = r6
            r6 = r23
            r23 = r15
            r15 = r13
            r13 = r11
            r11 = r9
            r9 = r20
            r21 = r5
            r5 = r2
            r2 = r8
            r8 = r21
            goto L_0x0697
        L_0x00bb:
            XH.y.b(r4)
            java.io.File r15 = new java.io.File
            java.lang.String r4 = r0.folder
            java.lang.String r6 = r23.getFilename()
            r15.<init>(r4, r6)
            kotlin.jvm.internal.K r14 = new kotlin.jvm.internal.K
            r14.<init>()
            boolean r4 = r15.exists()
            r9 = 3
            java.lang.String r10 = ""
            java.lang.String r11 = " "
            java.lang.String r12 = "Kt"
            java.lang.Class<com.sugarcube.app.base.data.asset.VideoAssetCacheImpl> r17 = com.sugarcube.app.base.data.asset.VideoAssetCacheImpl.class
            if (r4 == 0) goto L_0x024a
            java.lang.String r4 = r23.getMd5()
            if (r4 == 0) goto L_0x0246
            java.lang.String r13 = r0.md5(r15)
            boolean r18 = kotlin.jvm.internal.C17542s.e(r13, r4)
            if (r18 != 0) goto L_0x0244
            r15.delete()
            com.sugarcube.core.logger.Priority r18 = com.sugarcube.core.logger.Priority.INFO
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "invalid hash "
            r6.append(r8)
            r6.append(r1)
            java.lang.String r8 = " ("
            r6.append(r8)
            r6.append(r13)
            java.lang.String r8 = " != "
            r6.append(r8)
            r6.append(r4)
            java.lang.String r4 = ")"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            if (r4 != 0) goto L_0x011b
            r4 = r10
        L_0x011b:
            int[] r6 = com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$cacheAsset$lambda$1$$inlined$logInfo$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0
            int r8 = r18.ordinal()
            r6 = r6[r8]
            if (r6 == r7) goto L_0x020f
            r8 = 2
            if (r6 == r8) goto L_0x01d9
            if (r6 == r9) goto L_0x01a3
            r13 = 4
            if (r6 == r13) goto L_0x016c
            r13 = 5
            if (r6 != r13) goto L_0x0166
            java.lang.String r6 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r9 = 0
            r13 = 36
            java.lang.String r7 = HJ.C15854t.s1(r6, r13, r9, r8, r9)
            r13 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r13, r9, r8, r9)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x014b
            goto L_0x014f
        L_0x014b:
            java.lang.String r6 = HJ.C15854t.P0(r7, r12)
        L_0x014f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r4 = r7.toString()
            android.util.Log.e(r6, r4)
            goto L_0x0244
        L_0x0166:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x016c:
            java.lang.String r6 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r6, r8, r9, r7, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r7, r9)
            int r7 = r13.length()
            if (r7 != 0) goto L_0x0188
            goto L_0x018c
        L_0x0188:
            java.lang.String r6 = HJ.C15854t.P0(r13, r12)
        L_0x018c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r4 = r7.toString()
            android.util.Log.w(r6, r4)
            goto L_0x0244
        L_0x01a3:
            java.lang.String r6 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r6, r8, r9, r7, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r7, r9)
            int r7 = r13.length()
            if (r7 != 0) goto L_0x01bf
            goto L_0x01c3
        L_0x01bf:
            java.lang.String r6 = HJ.C15854t.P0(r13, r12)
        L_0x01c3:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r4 = r7.toString()
            android.util.Log.i(r6, r4)
            goto L_0x0244
        L_0x01d9:
            java.lang.String r6 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r6, r8, r9, r7, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r7, r9)
            int r7 = r13.length()
            if (r7 != 0) goto L_0x01f5
            goto L_0x01f9
        L_0x01f5:
            java.lang.String r6 = HJ.C15854t.P0(r13, r12)
        L_0x01f9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r4 = r7.toString()
            android.util.Log.d(r6, r4)
            goto L_0x0244
        L_0x020f:
            java.lang.String r6 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r6, r8, r9, r7, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r7, r9)
            int r7 = r13.length()
            if (r7 != 0) goto L_0x022b
            goto L_0x022f
        L_0x022b:
            java.lang.String r6 = HJ.C15854t.P0(r13, r12)
        L_0x022f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r4 = r7.toString()
            android.util.Log.v(r6, r4)
        L_0x0244:
            XH.N r4 = XH.C16807N.f139792a
        L_0x0246:
            r19 = r5
            goto L_0x0515
        L_0x024a:
            java.io.File r4 = new java.io.File
            java.lang.String r6 = r0.oldFolder
            java.lang.String r7 = r23.getFilename()
            r4.<init>(r6, r7)
            boolean r6 = r4.exists()
            if (r6 == 0) goto L_0x0511
            java.lang.String r6 = r23.getMd5()
            if (r6 == 0) goto L_0x0511
            java.lang.String r7 = r0.md5(r4)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r7, r6)
            if (r6 == 0) goto L_0x050c
            com.sugarcube.app.base.data.asset.VideoAsset r6 = com.sugarcube.app.base.data.asset.VideoAsset.LANDING_ENTRY_POINT
            if (r1 != r6) goto L_0x03b9
            com.sugarcube.core.logger.Priority r4 = com.sugarcube.core.logger.Priority.INFO
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "skip "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            if (r6 != 0) goto L_0x0285
            r6 = r10
        L_0x0285:
            int[] r7 = com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$cacheAsset$lambda$4$$inlined$logInfo$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r7[r4]
            r7 = 1
            if (r4 == r7) goto L_0x037c
            r7 = 2
            if (r4 == r7) goto L_0x0345
            r8 = 3
            if (r4 == r8) goto L_0x030f
            r8 = 4
            if (r4 == r8) goto L_0x02d9
            r8 = 5
            if (r4 != r8) goto L_0x02d3
            java.lang.String r4 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r4, r8, r9, r7, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r7, r9)
            int r7 = r13.length()
            if (r7 != 0) goto L_0x02b7
            goto L_0x02bb
        L_0x02b7:
            java.lang.String r4 = HJ.C15854t.P0(r13, r12)
        L_0x02bb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r4, r6)
        L_0x02d0:
            r4 = 1
            goto L_0x03b3
        L_0x02d3:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x02d9:
            java.lang.String r4 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r4, r8, r9, r7, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r7, r9)
            int r7 = r13.length()
            if (r7 != 0) goto L_0x02f5
            goto L_0x02f9
        L_0x02f5:
            java.lang.String r4 = HJ.C15854t.P0(r13, r12)
        L_0x02f9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r6 = r7.toString()
            android.util.Log.w(r4, r6)
            goto L_0x02d0
        L_0x030f:
            java.lang.String r4 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r4, r8, r9, r7, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r7, r9)
            int r7 = r13.length()
            if (r7 != 0) goto L_0x032b
            goto L_0x032f
        L_0x032b:
            java.lang.String r4 = HJ.C15854t.P0(r13, r12)
        L_0x032f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r6 = r7.toString()
            android.util.Log.i(r4, r6)
            goto L_0x02d0
        L_0x0345:
            java.lang.String r4 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r4, r8, r9, r7, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r7, r9)
            int r7 = r13.length()
            if (r7 != 0) goto L_0x0361
            goto L_0x0365
        L_0x0361:
            java.lang.String r4 = HJ.C15854t.P0(r13, r12)
        L_0x0365:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r6 = r7.toString()
            android.util.Log.d(r4, r6)
            goto L_0x02d0
        L_0x037c:
            java.lang.String r4 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r4, r8, r9, r7, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r7, r9)
            int r7 = r13.length()
            if (r7 != 0) goto L_0x0398
            goto L_0x039c
        L_0x0398:
            java.lang.String r4 = HJ.C15854t.P0(r13, r12)
        L_0x039c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r6 = r7.toString()
            android.util.Log.v(r4, r6)
            goto L_0x02d0
        L_0x03b3:
            r14.f144344a = r4
            XH.N r4 = XH.C16807N.f139792a
            goto L_0x050c
        L_0x03b9:
            com.sugarcube.core.logger.Priority r6 = com.sugarcube.core.logger.Priority.INFO
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "migrate "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            if (r7 != 0) goto L_0x03cf
            r7 = r10
        L_0x03cf:
            int[] r8 = com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$cacheAsset$lambda$4$$inlined$logInfo$default$2$wm$DslKt$WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r8[r6]
            r8 = 1
            if (r6 == r8) goto L_0x04cd
            r8 = 2
            if (r6 == r8) goto L_0x0495
            r9 = 3
            if (r6 == r9) goto L_0x045d
            r9 = 4
            if (r6 == r9) goto L_0x0424
            r9 = 5
            if (r6 != r9) goto L_0x041e
            java.lang.String r6 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r19 = r5
            r9 = 36
            r13 = 0
            java.lang.String r5 = HJ.C15854t.s1(r6, r9, r13, r8, r13)
            r9 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r9, r13, r8, r13)
            int r8 = r5.length()
            if (r8 != 0) goto L_0x0403
            goto L_0x0407
        L_0x0403:
            java.lang.String r6 = HJ.C15854t.P0(r5, r12)
        L_0x0407:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r11)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r6, r5)
            goto L_0x0504
        L_0x041e:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0424:
            r19 = r5
            java.lang.String r5 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r5, r8, r9, r6, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r6, r9)
            int r6 = r13.length()
            if (r6 != 0) goto L_0x0442
            goto L_0x0446
        L_0x0442:
            java.lang.String r5 = HJ.C15854t.P0(r13, r12)
        L_0x0446:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r11)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r5, r6)
            goto L_0x0504
        L_0x045d:
            r19 = r5
            java.lang.String r5 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r5, r8, r9, r6, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r6, r9)
            int r6 = r13.length()
            if (r6 != 0) goto L_0x047b
            goto L_0x047f
        L_0x047b:
            java.lang.String r5 = HJ.C15854t.P0(r13, r12)
        L_0x047f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r11)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.i(r5, r6)
            goto L_0x0504
        L_0x0495:
            r19 = r5
            java.lang.String r5 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r5, r8, r9, r6, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r6, r9)
            int r6 = r13.length()
            if (r6 != 0) goto L_0x04b3
            goto L_0x04b7
        L_0x04b3:
            java.lang.String r5 = HJ.C15854t.P0(r13, r12)
        L_0x04b7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r11)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
            goto L_0x0504
        L_0x04cd:
            r19 = r5
            java.lang.String r5 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 2
            r8 = 36
            r9 = 0
            java.lang.String r13 = HJ.C15854t.s1(r5, r8, r9, r6, r9)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r9, r6, r9)
            int r6 = r13.length()
            if (r6 != 0) goto L_0x04eb
            goto L_0x04ef
        L_0x04eb:
            java.lang.String r5 = HJ.C15854t.P0(r13, r12)
        L_0x04ef:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r11)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r5, r6)
        L_0x0504:
            boolean r4 = r4.renameTo(r15)
            kotlin.coroutines.jvm.internal.b.a(r4)
            goto L_0x050e
        L_0x050c:
            r19 = r5
        L_0x050e:
            XH.N r4 = XH.C16807N.f139792a
            goto L_0x0513
        L_0x0511:
            r19 = r5
        L_0x0513:
            XH.N r4 = XH.C16807N.f139792a
        L_0x0515:
            boolean r4 = r15.exists()
            if (r4 != 0) goto L_0x072d
            boolean r4 = r14.f144344a
            if (r4 != 0) goto L_0x072d
            com.sugarcube.core.logger.Priority r4 = com.sugarcube.core.logger.Priority.INFO
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "retrieve "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L_0x0535
            r5 = r10
        L_0x0535:
            int[] r6 = com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$cacheAsset$$inlined$logInfo$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0
            int r7 = r4.ordinal()
            r6 = r6[r7]
            r7 = 1
            if (r6 == r7) goto L_0x062b
            r7 = 2
            if (r6 == r7) goto L_0x05f5
            r8 = 3
            if (r6 == r8) goto L_0x05bf
            r8 = 4
            if (r6 == r8) goto L_0x0588
            r8 = 5
            if (r6 != r8) goto L_0x0582
            java.lang.String r6 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r8 = 36
            r9 = 0
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r9, r7, r9)
            r13 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r13, r9, r7, r9)
            int r7 = r8.length()
            if (r7 != 0) goto L_0x0567
            goto L_0x056b
        L_0x0567:
            java.lang.String r6 = HJ.C15854t.P0(r8, r12)
        L_0x056b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            android.util.Log.e(r6, r7)
            goto L_0x0660
        L_0x0582:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0588:
            java.lang.String r6 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r9, r7, r9)
            r13 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r13, r9, r7, r9)
            int r7 = r8.length()
            if (r7 != 0) goto L_0x05a4
            goto L_0x05a8
        L_0x05a4:
            java.lang.String r6 = HJ.C15854t.P0(r8, r12)
        L_0x05a8:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r6, r7)
            goto L_0x0660
        L_0x05bf:
            java.lang.String r6 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r9, r7, r9)
            r13 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r13, r9, r7, r9)
            int r7 = r8.length()
            if (r7 != 0) goto L_0x05db
            goto L_0x05df
        L_0x05db:
            java.lang.String r6 = HJ.C15854t.P0(r8, r12)
        L_0x05df:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            android.util.Log.i(r6, r7)
            goto L_0x0660
        L_0x05f5:
            java.lang.String r6 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r9, r7, r9)
            r13 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r13, r9, r7, r9)
            int r7 = r8.length()
            if (r7 != 0) goto L_0x0611
            goto L_0x0615
        L_0x0611:
            java.lang.String r6 = HJ.C15854t.P0(r8, r12)
        L_0x0615:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r6, r7)
            goto L_0x0660
        L_0x062b:
            java.lang.String r6 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r7 = 2
            r8 = 36
            r9 = 0
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r9, r7, r9)
            r13 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r13, r9, r7, r9)
            int r7 = r8.length()
            if (r7 != 0) goto L_0x0647
            goto L_0x064b
        L_0x0647:
            java.lang.String r6 = HJ.C15854t.P0(r8, r12)
        L_0x064b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r6, r7)
        L_0x0660:
            r3.L$0 = r0
            r3.L$1 = r1
            r3.L$2 = r2
            r3.L$3 = r15
            r3.L$4 = r14
            r3.L$5 = r0
            r3.L$6 = r0
            r3.L$7 = r4
            r3.L$8 = r5
            r3.L$9 = r10
            r6 = 0
            r3.I$0 = r6
            r3.I$1 = r6
            r3.I$2 = r6
            r3.I$3 = r6
            r3.I$4 = r6
            r7 = 1
            r3.label = r7
            java.lang.Object r7 = r0.downloadFile(r1, r3)
            r8 = r19
            if (r7 != r8) goto L_0x068b
            return r8
        L_0x068b:
            r13 = r5
            r5 = r6
            r9 = r5
            r11 = r9
            r12 = r10
            r23 = r15
            r15 = r0
            r10 = r11
            r0 = r14
            r14 = r4
            r4 = r15
        L_0x0697:
            GK.D r7 = (GK.C15776D) r7
            r19 = r8
            int r8 = r7.g()
            r16 = r6
            r6 = 200(0xc8, float:2.8E-43)
            if (r8 != r6) goto L_0x070d
            GK.E r6 = r7.c()
            java.lang.String r8 = r23.getAbsolutePath()
            r24 = r6
            java.lang.String r6 = "getAbsolutePath(...)"
            kotlin.jvm.internal.C17542s.i(r8, r6)
            r3.L$0 = r4
            r3.L$1 = r1
            r3.L$2 = r2
            r2 = r23
            r3.L$3 = r2
            r3.L$4 = r0
            r3.L$5 = r7
            r3.L$6 = r8
            r3.L$7 = r15
            r3.L$8 = r14
            r3.L$9 = r13
            r3.L$10 = r12
            r3.I$0 = r11
            r3.I$1 = r10
            r3.I$2 = r9
            r3.I$3 = r5
            r6 = r16
            r3.I$4 = r6
            r0 = 2
            r3.label = r0
            r0 = r24
            java.lang.Object r0 = r4.writeToFile(r0, r8, r3)
            r2 = r19
            if (r0 != r2) goto L_0x06e6
            return r2
        L_0x06e6:
            r2 = r4
            r4 = r0
        L_0x06e8:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x06ed
            goto L_0x072f
        L_0x06ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.getFilename()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not write asset "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " to file."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x070d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.getFilename()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not fetch asset "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x072d:
            r2 = r22
        L_0x072f:
            android.net.Uri r0 = r2.findInCache(r1)
            if (r0 == 0) goto L_0x0736
            return r0
        L_0x0736:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.getFilename()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not cache asset: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.asset.VideoAssetCacheImpl.cacheAsset(com.sugarcube.app.base.data.asset.VideoAsset, dI.e):java.lang.Object");
    }

    public Uri findInCache(VideoAsset videoAsset) {
        C17542s.j(videoAsset, "asset");
        File file = new File(this.folder, videoAsset.getFilename());
        if (file.exists()) {
            return Uri.fromFile(file);
        }
        return null;
    }

    public Uri getDownloadUri(VideoAsset videoAsset) {
        C17542s.j(videoAsset, "asset");
        String baseUrl = videoAsset.getBaseUrl();
        String filename = videoAsset.getFilename();
        return Uri.parse(baseUrl + filename);
    }
}
