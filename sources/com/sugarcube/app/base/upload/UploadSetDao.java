package com.sugarcube.app.base.upload;

import MF.e;
import MF.f;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H'¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H'¢\u0006\u0004\b \u0010\u0013J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/sugarcube/app/base/upload/UploadSetDao;", "", "", "LMF/e;", "getAll", "()Ljava/util/List;", "Ljava/util/UUID;", "captureUUID", "get", "(Ljava/util/UUID;)LMF/e;", "sceneUUID", "getWithSceneUUID", "(Ljava/util/UUID;)Ljava/util/List;", "uploadSetDBO", "LXH/N;", "insert", "(LMF/e;)V", "uploadUUID", "updateUploadUUID", "(Ljava/util/UUID;Ljava/util/UUID;)V", "", "createdTs", "updateCreatedTs", "(Ljava/util/UUID;J)V", "LMF/f;", "state", "updateLocalState", "(Ljava/util/UUID;LMF/f;)V", "", "attempts", "updateUploadAttempts", "(Ljava/util/UUID;I)V", "updateSceneCreated", "delete", "(Ljava/util/UUID;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UploadSetDao {
    void delete(UUID uuid);

    e get(UUID uuid);

    List<e> getAll();

    List<e> getWithSceneUUID(UUID uuid);

    void insert(e eVar);

    void updateCreatedTs(UUID uuid, long j10);

    void updateLocalState(UUID uuid, f fVar);

    void updateSceneCreated(UUID uuid, UUID uuid2);

    void updateUploadAttempts(UUID uuid, int i10);

    void updateUploadUUID(UUID uuid, UUID uuid2);
}
