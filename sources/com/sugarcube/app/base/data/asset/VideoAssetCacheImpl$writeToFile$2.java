package com.sugarcube.app.base.data.asset;

import GK.C15777E;
import QJ.Q;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$writeToFile$2", f = "VideoAssetRepository.kt", l = {}, m = "invokeSuspend")
final class VideoAssetCacheImpl$writeToFile$2 extends l implements p<Q, C17164e<? super String>, Object> {
    final /* synthetic */ C15777E $body;
    final /* synthetic */ String $fullPath;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VideoAssetCacheImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoAssetCacheImpl$writeToFile$2(C15777E e10, VideoAssetCacheImpl videoAssetCacheImpl, String str, C17164e<? super VideoAssetCacheImpl$writeToFile$2> eVar) {
        super(2, eVar);
        this.$body = e10;
        this.this$0 = videoAssetCacheImpl;
        this.$fullPath = str;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        VideoAssetCacheImpl$writeToFile$2 videoAssetCacheImpl$writeToFile$2 = new VideoAssetCacheImpl$writeToFile$2(this.$body, this.this$0, this.$fullPath, eVar);
        videoAssetCacheImpl$writeToFile$2.L$0 = obj;
        return videoAssetCacheImpl$writeToFile$2;
    }

    public final Object invoke(Q q10, C17164e<? super String> eVar) {
        return ((VideoAssetCacheImpl$writeToFile$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a9, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        jI.C17416c.a(r2, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ad, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01af, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        jI.C17416c.a(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b3, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            eI.C17187b.f()
            int r0 = r10.label
            if (r0 != 0) goto L_0x01ef
            XH.y.b(r11)
            java.lang.Object r11 = r10.L$0
            QJ.Q r11 = (QJ.Q) r11
            GK.E r0 = r10.$body
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.io.File r0 = new java.io.File
            com.sugarcube.app.base.data.asset.VideoAssetCacheImpl r2 = r10.this$0
            java.lang.String r2 = r2.folder
            r0.<init>(r2)
            r0.mkdirs()
            java.lang.String r0 = r10.$fullPath
            com.sugarcube.core.logger.Priority r2 = com.sugarcube.core.logger.Priority.INFO
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "write to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x003c
            r0 = r3
        L_0x003c:
            int[] r4 = com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$writeToFile$2$invokeSuspend$$inlined$logInfo$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r4[r2]
            r4 = 1
            java.lang.String r5 = "Kt"
            r6 = 46
            r7 = 36
            java.lang.String r8 = " "
            r9 = 2
            if (r2 == r4) goto L_0x0133
            if (r2 == r9) goto L_0x00ff
            r4 = 3
            if (r2 == r4) goto L_0x00cb
            r4 = 4
            if (r2 == r4) goto L_0x0096
            r4 = 5
            if (r2 != r4) goto L_0x0090
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            java.lang.String r2 = HJ.C15854t.s1(r11, r7, r1, r9, r1)
            java.lang.String r2 = HJ.C15854t.o1(r2, r6, r1, r9, r1)
            int r4 = r2.length()
            if (r4 != 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            java.lang.String r11 = HJ.C15854t.P0(r2, r5)
        L_0x0079:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r8)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r11, r0)
            goto L_0x0166
        L_0x0090:
            XH.t r11 = new XH.t
            r11.<init>()
            throw r11
        L_0x0096:
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            java.lang.String r2 = HJ.C15854t.s1(r11, r7, r1, r9, r1)
            java.lang.String r2 = HJ.C15854t.o1(r2, r6, r1, r9, r1)
            int r4 = r2.length()
            if (r4 != 0) goto L_0x00b0
            goto L_0x00b4
        L_0x00b0:
            java.lang.String r11 = HJ.C15854t.P0(r2, r5)
        L_0x00b4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r8)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r11, r0)
            goto L_0x0166
        L_0x00cb:
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            java.lang.String r2 = HJ.C15854t.s1(r11, r7, r1, r9, r1)
            java.lang.String r2 = HJ.C15854t.o1(r2, r6, r1, r9, r1)
            int r4 = r2.length()
            if (r4 != 0) goto L_0x00e5
            goto L_0x00e9
        L_0x00e5:
            java.lang.String r11 = HJ.C15854t.P0(r2, r5)
        L_0x00e9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r8)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            android.util.Log.i(r11, r0)
            goto L_0x0166
        L_0x00ff:
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            java.lang.String r2 = HJ.C15854t.s1(r11, r7, r1, r9, r1)
            java.lang.String r2 = HJ.C15854t.o1(r2, r6, r1, r9, r1)
            int r4 = r2.length()
            if (r4 != 0) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            java.lang.String r11 = HJ.C15854t.P0(r2, r5)
        L_0x011d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r8)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r11, r0)
            goto L_0x0166
        L_0x0133:
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            java.lang.String r2 = HJ.C15854t.s1(r11, r7, r1, r9, r1)
            java.lang.String r2 = HJ.C15854t.o1(r2, r6, r1, r9, r1)
            int r4 = r2.length()
            if (r4 != 0) goto L_0x014d
            goto L_0x0151
        L_0x014d:
            java.lang.String r11 = HJ.C15854t.P0(r2, r5)
        L_0x0151:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r8)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            android.util.Log.v(r11, r0)
        L_0x0166:
            java.io.File r11 = new java.io.File     // Catch:{ IOException -> 0x01a3 }
            java.lang.String r0 = r10.$fullPath     // Catch:{ IOException -> 0x01a3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01a3 }
            r2.<init>()     // Catch:{ IOException -> 0x01a3 }
            r2.append(r0)     // Catch:{ IOException -> 0x01a3 }
            java.lang.String r0 = ".tmp"
            r2.append(r0)     // Catch:{ IOException -> 0x01a3 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x01a3 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x01a3 }
            r11.createNewFile()     // Catch:{ IOException -> 0x01a3 }
            GK.E r0 = r10.$body     // Catch:{ IOException -> 0x01a3 }
            java.io.InputStream r0 = r0.c()     // Catch:{ IOException -> 0x01a3 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x01a5 }
            r2.<init>(r11)     // Catch:{ all -> 0x01a5 }
            r3 = 0
            jI.C17415b.b(r0, r2, r3, r9, r1)     // Catch:{ all -> 0x01a7 }
            jI.C17416c.a(r2, r1)     // Catch:{ all -> 0x01a5 }
            jI.C17416c.a(r0, r1)     // Catch:{ IOException -> 0x01a3 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x01a3 }
            java.lang.String r2 = r10.$fullPath     // Catch:{ IOException -> 0x01a3 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x01a3 }
            r11.renameTo(r0)     // Catch:{ IOException -> 0x01a3 }
            java.lang.String r11 = r10.$fullPath     // Catch:{ IOException -> 0x01a3 }
            return r11
        L_0x01a3:
            r11 = move-exception
            goto L_0x01b4
        L_0x01a5:
            r11 = move-exception
            goto L_0x01ae
        L_0x01a7:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x01a9 }
        L_0x01a9:
            r3 = move-exception
            jI.C17416c.a(r2, r11)     // Catch:{ all -> 0x01a5 }
            throw r3     // Catch:{ all -> 0x01a5 }
        L_0x01ae:
            throw r11     // Catch:{ all -> 0x01af }
        L_0x01af:
            r2 = move-exception
            jI.C17416c.a(r0, r11)     // Catch:{ IOException -> 0x01a3 }
            throw r2     // Catch:{ IOException -> 0x01a3 }
        L_0x01b4:
            YE.b r0 = YE.C13868b.f118106a
            java.lang.String r2 = r10.$fullPath
            java.lang.String r11 = r11.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "error "
            r3.append(r4)
            r3.append(r2)
            r3.append(r8)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            YE.e r2 = YE.e.Asset
            r0.b(r11, r2)
            java.lang.String r11 = r10.$fullPath
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "write failed "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r0.b(r11, r2)
            return r1
        L_0x01ef:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$writeToFile$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
