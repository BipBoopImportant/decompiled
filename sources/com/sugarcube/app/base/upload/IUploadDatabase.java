package com.sugarcube.app.base.upload;

import MF.C13207a;
import MF.C13208b;
import MF.C13209c;
import MF.e;
import MF.f;
import XH.C16807N;
import com.sugarcube.core.network.models.UploadSetState;
import com.sugarcube.core.network.models.UploadURL;
import dI.C17164e;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b!\u0010\"J \u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$H¦@¢\u0006\u0004\b&\u0010'J4\u0010.\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0006\u0010-\u001a\u00020,H¦@¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200H¦@¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\rH¦@¢\u0006\u0004\b3\u00102J\u0018\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0004H¦@¢\u0006\u0004\b5\u00106J \u00108\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u0002H¦@¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/sugarcube/app/base/upload/IUploadDatabase;", "", "Ljava/util/UUID;", "captureUUID", "LMF/e;", "getUploadSet", "(Ljava/util/UUID;)LMF/e;", "", "getAllUploadSets", "()Ljava/util/List;", "sceneUUID", "getUploadSetForScene", "uploadSetDBO", "LXH/N;", "insertSet", "(LMF/e;)V", "Ljava/io/File;", "file", "", "exists", "(Ljava/io/File;)Z", "LMF/b;", "uploadFileDBO", "insertFile", "(LMF/b;)V", "getFilesInSet", "(Ljava/util/UUID;)Ljava/util/List;", "LMF/f;", "newState", "updateSetLocalState", "(Ljava/util/UUID;LMF/f;LdI/e;)Ljava/lang/Object;", "updateSetSceneCreated", "(Ljava/util/UUID;Ljava/util/UUID;)V", "resetUpload", "(Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "fileDBO", "LMF/c;", "localState", "updateFileState", "(LMF/b;LMF/c;LdI/e;)Ljava/lang/Object;", "", "Lcom/sugarcube/core/network/models/UploadURL;", "", "remoteToLocalFileMap", "Lcom/sugarcube/core/network/models/UploadSetState;", "remoteState", "syncRemoteData", "(Ljava/util/UUID;Ljava/util/Map;Lcom/sugarcube/core/network/models/UploadSetState;LdI/e;)Ljava/lang/Object;", "LMF/a;", "validateStates", "(LdI/e;)Ljava/lang/Object;", "logCurrentState", "uploadSet", "deleteSet", "(LMF/e;LdI/e;)Ljava/lang/Object;", "originalCaptureUUID", "rememberCapture", "(Ljava/util/UUID;Ljava/util/UUID;LdI/e;)Ljava/lang/Object;", "getRememberedCapture", "(Ljava/util/UUID;)Ljava/util/UUID;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IUploadDatabase {
    Object deleteSet(e eVar, C17164e<? super C16807N> eVar2);

    boolean exists(File file);

    List<e> getAllUploadSets();

    List<C13208b> getFilesInSet(UUID uuid);

    UUID getRememberedCapture(UUID uuid);

    e getUploadSet(UUID uuid);

    e getUploadSetForScene(UUID uuid);

    void insertFile(C13208b bVar);

    void insertSet(e eVar);

    Object logCurrentState(C17164e<? super C16807N> eVar);

    Object rememberCapture(UUID uuid, UUID uuid2, C17164e<? super C16807N> eVar);

    Object resetUpload(UUID uuid, C17164e<? super C16807N> eVar);

    Object syncRemoteData(UUID uuid, Map<UploadURL, String> map, UploadSetState uploadSetState, C17164e<? super C16807N> eVar);

    Object updateFileState(C13208b bVar, C13209c cVar, C17164e<? super C16807N> eVar);

    Object updateSetLocalState(UUID uuid, f fVar, C17164e<? super C16807N> eVar);

    void updateSetSceneCreated(UUID uuid, UUID uuid2);

    Object validateStates(C17164e<? super C13207a> eVar);
}
