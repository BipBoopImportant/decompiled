package com.sugarcube.app.base.data.asset;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/app/base/data/asset/VideoAssetDownloadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepositoryImpl;", "videoAssetRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/sugarcube/app/base/data/asset/VideoAssetRepositoryImpl;)V", "Landroidx/work/x$a;", "doWork", "(LdI/e;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/sugarcube/app/base/data/asset/VideoAssetRepositoryImpl;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoAssetDownloadWorker extends CoroutineWorker {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String WORKER_TAG = "Sugarcube.VideoAssetDownload";
    private final Context context;
    private final VideoAssetRepositoryImpl videoAssetRepository;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/app/base/data/asset/VideoAssetDownloadWorker$Companion;", "", "<init>", "()V", "WORKER_TAG", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoAssetDownloadWorker(Context context2, WorkerParameters workerParameters, VideoAssetRepositoryImpl videoAssetRepositoryImpl) {
        super(context2, workerParameters);
        C17542s.j(context2, "context");
        C17542s.j(workerParameters, "workerParameters");
        C17542s.j(videoAssetRepositoryImpl, "videoAssetRepository");
        this.context = context2;
        this.videoAssetRepository = videoAssetRepositoryImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(dI.C17164e<? super androidx.work.C7054x.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.sugarcube.app.base.data.asset.VideoAssetDownloadWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.sugarcube.app.base.data.asset.VideoAssetDownloadWorker$doWork$1 r0 = (com.sugarcube.app.base.data.asset.VideoAssetDownloadWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.asset.VideoAssetDownloadWorker$doWork$1 r0 = new com.sugarcube.app.base.data.asset.VideoAssetDownloadWorker$doWork$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.L$1
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.L$0
            com.sugarcube.app.base.data.asset.VideoAssetDownloadWorker r6 = (com.sugarcube.app.base.data.asset.VideoAssetDownloadWorker) r6
            XH.y.b(r1)
            goto L_0x004b
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl r1 = r5.videoAssetRepository
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r1 = r1.downloadUncachedVideos(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r6 = r1.booleanValue()
            if (r6 == 0) goto L_0x0061
            YE.b r6 = YE.C13868b.f118106a
            java.lang.String r0 = "VideoAssetDownloadWorker success"
            YE.e r1 = YE.e.Asset
            r6.b(r0, r1)
            androidx.work.x$a r6 = androidx.work.C7054x.a.c()
            goto L_0x006e
        L_0x0061:
            YE.b r6 = YE.C13868b.f118106a
            java.lang.String r0 = "VideoAssetDownloadWorker failure"
            YE.e r1 = YE.e.Asset
            r6.b(r0, r1)
            androidx.work.x$a r6 = androidx.work.C7054x.a.a()
        L_0x006e:
            kotlin.jvm.internal.C17542s.g(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.asset.VideoAssetDownloadWorker.doWork(dI.e):java.lang.Object");
    }
}
