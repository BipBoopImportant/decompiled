package com.sugarcube.app.base.data;

import XH.C16807N;
import com.sugarcube.app.base.data.database.Media;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001Jz\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/app/base/data/ISceneRepository;", "", "Ljava/util/UUID;", "uuid", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "", "roomTitle", "Ljava/time/Instant;", "createdTs", "", "Lcom/sugarcube/app/base/data/database/Media;", "medias", "Lcom/sugarcube/app/base/data/database/Metadata;", "metas", "", "result", "captureType", "captureStrategy", "pipelineType", "uploadsV2", "LXH/N;", "addCapture", "(Ljava/util/UUID;Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "hasPendingUploads", "(LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ISceneRepository {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object addCapture$default(ISceneRepository iSceneRepository, UUID uuid, RoomType roomType, String str, Instant instant, List list, List list2, boolean z10, String str2, String str3, String str4, boolean z11, C17164e eVar, int i10, Object obj) {
            int i11 = i10;
            if (obj == null) {
                return iSceneRepository.addCapture(uuid, roomType, str, instant, list, list2, (i11 & 64) != 0 ? true : z10, str2, str3, (i11 & 512) != 0 ? null : str4, z11, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCapture");
        }
    }

    Object addCapture(UUID uuid, RoomType roomType, String str, Instant instant, List<Media> list, List<com.sugarcube.app.base.data.database.Metadata> list2, boolean z10, String str2, String str3, String str4, boolean z11, C17164e<? super C16807N> eVar);

    Object hasPendingUploads(C17164e<? super Boolean> eVar);
}
