package com.sugarcube.app.base.upload;

import XH.C16807N;
import androidx.work.C7054x;
import com.sugarcube.app.base.data.database.Media;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jd\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u000fH&¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH¦@¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/sugarcube/app/base/upload/IUploaderV2;", "", "Ljava/util/UUID;", "captureUUID", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "", "roomTitle", "Ljava/time/Instant;", "creation", "", "Lcom/sugarcube/app/base/data/database/Media;", "medias", "Lcom/sugarcube/app/base/data/database/Metadata;", "metas", "", "result", "captureType", "captureStrategy", "LXH/N;", "addUpload", "(Ljava/util/UUID;Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "retryFailures", "reason", "doTrack", "scheduleUploads", "(ZLjava/lang/String;Z)V", "Lcom/sugarcube/app/base/upload/UploadWorkerV2;", "workerV2", "Landroidx/work/x$a;", "startUploading", "(ZLcom/sugarcube/app/base/upload/UploadWorkerV2;LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IUploaderV2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(IUploaderV2 iUploaderV2, boolean z10, String str, boolean z11, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 4) != 0) {
                    z11 = true;
                }
                iUploaderV2.scheduleUploads(z10, str, z11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scheduleUploads");
        }
    }

    Object addUpload(UUID uuid, RoomType roomType, String str, Instant instant, List<Media> list, List<com.sugarcube.app.base.data.database.Metadata> list2, boolean z10, String str2, String str3, C17164e<? super C16807N> eVar);

    void scheduleUploads(boolean z10, String str, boolean z11);

    Object startUploading(boolean z10, UploadWorkerV2 uploadWorkerV2, C17164e<? super C7054x.a> eVar);
}
