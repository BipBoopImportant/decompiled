package com.sugarcube.app.base.data;

import QJ.Q;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/app/base/data/AssetItem;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/app/base/data/AssetItem;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.AssetItem$fetchAsync$1", f = "Cache.kt", l = {}, m = "invokeSuspend")
final class AssetItem$fetchAsync$1 extends l implements p<Q, C17164e<? super AssetItem>, Object> {
    int label;
    final /* synthetic */ AssetItem this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AssetItem$fetchAsync$1(AssetItem assetItem, C17164e<? super AssetItem$fetchAsync$1> eVar) {
        super(2, eVar);
        this.this$0 = assetItem;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new AssetItem$fetchAsync$1(this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super AssetItem> eVar) {
        return ((AssetItem$fetchAsync$1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a1, code lost:
        jI.C17416c.a(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            eI.C17187b.f()
            int r0 = r10.label
            if (r0 != 0) goto L_0x00d4
            XH.y.b(r11)
            com.sugarcube.app.base.data.AssetItem r11 = r10.this$0
            java.io.File r11 = r11.getFile()
            boolean r11 = r11.exists()
            r0 = 200(0xc8, float:2.8E-43)
            if (r11 != 0) goto L_0x00b8
            long r1 = java.lang.System.currentTimeMillis()
            GK.z r11 = new GK.z
            r11.<init>()
            GK.B$a r3 = new GK.B$a
            r3.<init>()
            com.sugarcube.app.base.data.AssetItem r4 = r10.this$0
            android.net.Uri r4 = r4.getUri()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r4, r5)
            GK.B$a r3 = r3.n(r4)
            GK.B r3 = r3.b()
            GK.e r11 = r11.b(r3)
            GK.D r11 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r11)
            int r3 = r11.g()
            if (r0 > r3) goto L_0x00a5
            r4 = 300(0x12c, float:4.2E-43)
            if (r3 >= r4) goto L_0x00a5
            GK.E r3 = r11.c()
            if (r3 == 0) goto L_0x00b8
            com.sugarcube.app.base.data.AssetItem r4 = r10.this$0
            java.io.InputStream r3 = r3.c()
            java.io.File r5 = new java.io.File
            java.io.File r6 = r4.getFile()
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = ".part"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream
            r6.<init>(r5)
            r7 = 0
            r8 = 2
            r9 = 0
            jI.C17415b.b(r3, r6, r7, r8, r9)     // Catch:{ all -> 0x009e }
            jI.C17416c.a(r6, r9)
            java.io.File r3 = r4.getFile()
            r5.renameTo(r3)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r1
            r4.setDownloadTimeMS(r5)
            int r11 = r11.g()
            r4.setResponseCode(r11)
            goto L_0x00b8
        L_0x009e:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            jI.C17416c.a(r6, r11)
            throw r0
        L_0x00a5:
            com.sugarcube.app.base.data.AssetItem r3 = r10.this$0
            int r11 = r11.g()
            r3.setResponseCode(r11)
            com.sugarcube.app.base.data.AssetItem r11 = r10.this$0
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r11.setDownloadTimeMS(r3)
        L_0x00b8:
            com.sugarcube.app.base.data.AssetItem r11 = r10.this$0
            java.io.File r11 = r11.getFile()
            boolean r11 = r11.exists()
            if (r11 == 0) goto L_0x00d1
            com.sugarcube.app.base.data.AssetItem r11 = r10.this$0
            int r11 = r11.getResponseCode()
            if (r11 != 0) goto L_0x00d1
            com.sugarcube.app.base.data.AssetItem r11 = r10.this$0
            r11.setResponseCode(r0)
        L_0x00d1:
            com.sugarcube.app.base.data.AssetItem r11 = r10.this$0
            return r11
        L_0x00d4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.AssetItem$fetchAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
