package com.sugarcube.app.base.upload;

import com.sugarcube.app.base.network.ApiResponse;
import com.sugarcube.core.network.models.CreateSceneRequest;
import com.sugarcube.core.network.models.CreateUploadSetRequest;
import com.sugarcube.core.network.models.SceneResponse;
import com.sugarcube.core.network.models.UploadSetState;
import com.sugarcube.core.network.models.UploadURL;
import dI.C17164e;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\t\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/upload/IUploadApi;", "", "Ljava/util/UUID;", "uploadUUID", "Lcom/sugarcube/app/base/network/ApiResponse;", "Lcom/sugarcube/core/network/models/UploadSetState;", "getUploadSetState", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CreateUploadSetRequest;", "request", "createUploadSet", "(Lcom/sugarcube/core/network/models/CreateUploadSetRequest;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/UploadURL;", "updateUploadURL", "uploadNotify", "(Lcom/sugarcube/core/network/models/UploadURL;Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CreateSceneRequest;", "Lcom/sugarcube/core/network/models/SceneResponse;", "createScene", "(Lcom/sugarcube/core/network/models/CreateSceneRequest;LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IUploadApi {
    Object createScene(CreateSceneRequest createSceneRequest, C17164e<? super ApiResponse<SceneResponse>> eVar);

    Object createUploadSet(CreateUploadSetRequest createUploadSetRequest, C17164e<? super ApiResponse<UploadSetState>> eVar);

    Object getUploadSetState(UUID uuid, C17164e<? super ApiResponse<UploadSetState>> eVar);

    Object uploadNotify(UploadURL uploadURL, UUID uuid, C17164e<? super ApiResponse<UploadSetState>> eVar);
}
