package com.sugarcube.app.base.data;

import IJ.C15906b;
import KF.C13164r;
import QJ.Q;
import XH.C16807N;
import com.sugarcube.app.base.data.SceneRepository;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/sugarcube/app/base/data/SceneRepository$SceneRepoStatus;", "<anonymous>", "(LQJ/Q;)Lcom/sugarcube/app/base/data/SceneRepository$SceneRepoStatus;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.SceneRepository$startRefresh$2", f = "SceneRepository.kt", l = {412, 416}, m = "invokeSuspend")
final class SceneRepository$startRefresh$2 extends l implements p<Q, C17164e<? super SceneRepository.SceneRepoStatus>, Object> {
    final /* synthetic */ boolean $checkSchedule;
    final /* synthetic */ C15906b $minTimeBetweenRefresh;
    final /* synthetic */ C13164r $uploadVersion;
    int I$0;
    int label;
    final /* synthetic */ SceneRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SceneRepository$startRefresh$2(SceneRepository sceneRepository, boolean z10, C13164r rVar, C15906b bVar, C17164e<? super SceneRepository$startRefresh$2> eVar) {
        super(2, eVar);
        this.this$0 = sceneRepository;
        this.$checkSchedule = z10;
        this.$uploadVersion = rVar;
        this.$minTimeBetweenRefresh = bVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new SceneRepository$startRefresh$2(this.this$0, this.$checkSchedule, this.$uploadVersion, this.$minTimeBetweenRefresh, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super SceneRepository.SceneRepoStatus> eVar) {
        return ((SceneRepository$startRefresh$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r9.label
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 == r4) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            int r0 = r9.I$0
            XH.y.b(r10)
            goto L_0x0069
        L_0x0015:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001d:
            XH.y.b(r10)
            goto L_0x0033
        L_0x0021:
            XH.y.b(r10)
            com.sugarcube.app.base.data.SceneRepository r10 = r9.this$0
            boolean r1 = r9.$checkSchedule
            KF.r r5 = r9.$uploadVersion
            r9.label = r4
            java.lang.Object r10 = r10.checkUploads(r1, r5, r9)
            if (r10 != r0) goto L_0x0033
            return r0
        L_0x0033:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 <= 0) goto L_0x003d
            r10 = r4
            goto L_0x003e
        L_0x003d:
            r10 = r3
        L_0x003e:
            IJ.b r1 = r9.$minTimeBetweenRefresh
            if (r1 == 0) goto L_0x005b
            long r5 = java.lang.System.currentTimeMillis()
            com.sugarcube.app.base.data.SceneRepository r1 = r9.this$0
            long r7 = r1.lastRefreshTs
            long r5 = r5 - r7
            IJ.b r1 = r9.$minTimeBetweenRefresh
            long r7 = r1.f0()
            long r7 = IJ.C15906b.K(r7)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x006a
        L_0x005b:
            com.sugarcube.app.base.data.SceneRepository r1 = r9.this$0
            r9.I$0 = r10
            r9.label = r2
            java.lang.Object r1 = r1.doRefresh(r9)
            if (r1 != r0) goto L_0x0068
            return r0
        L_0x0068:
            r0 = r10
        L_0x0069:
            r10 = r0
        L_0x006a:
            com.sugarcube.app.base.data.SceneRepository r0 = r9.this$0
            java.util.List r0 = r0.getProcessingScenes()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0078
            r0 = r4
            goto L_0x0079
        L_0x0078:
            r0 = r3
        L_0x0079:
            com.sugarcube.app.base.data.SceneRepository r1 = r9.this$0
            com.sugarcube.app.base.data.database.ScenesDatabase r1 = r1.getDatabase()
            com.sugarcube.app.base.data.database.DatabaseSceneDao r1 = r1.getDatabaseSceneDao()
            int r1 = r1.getSceneCount()
            if (r1 == 0) goto L_0x008b
            r1 = r4
            goto L_0x008c
        L_0x008b:
            r1 = r3
        L_0x008c:
            com.sugarcube.app.base.data.SceneRepository$SceneRepoStatus r2 = new com.sugarcube.app.base.data.SceneRepository$SceneRepoStatus
            if (r10 == 0) goto L_0x0091
            r3 = r4
        L_0x0091:
            com.sugarcube.app.base.data.SceneRepository r10 = r9.this$0
            boolean r10 = r10.isFirstFetch
            r2.<init>(r1, r3, r0, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.SceneRepository$startRefresh$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
