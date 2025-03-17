package com.sugarcube.app.base.data.database;

import androidx.lifecycle.F;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H'¢\u0006\u0004\b\b\u0010\tJ)\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'¢\u0006\u0004\b\b\u0010\fJ1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\b\u0002\u0010\u0010\u001a\u00020\nH'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\nH'¢\u0006\u0004\b\u0011\u0010\u0015J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\b\u0010\u0018J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0019\u001a\u00020\rH'¢\u0006\u0004\b\b\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\rH'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH'¢\u0006\u0004\b\u001b\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0016H'¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0016H'¢\u0006\u0004\b\"\u0010 J!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\u0010$\u001a\u00020#\"\u00020\rH'¢\u0006\u0004\b\"\u0010%J)\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160&\"\u00020\u0016H'¢\u0006\u0004\b\"\u0010(J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\"\u0010)J#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'¢\u0006\u0004\b\"\u0010*J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0016H'¢\u0006\u0004\b\u001b\u0010+J\u001b\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005H'¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010,\u001a\u00020\rH'¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b0\u00101J-\u00106\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u00102\u001a\u00020\u00132\n\u00105\u001a\u000203\"\u000204H'¢\u0006\u0004\b6\u00107J5\u00106\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u00102\u001a\u00020\u00132\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160&\"\u00020\u0016H'¢\u0006\u0004\b6\u00108J-\u00106\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u00102\u001a\u00020\u00132\n\u0010$\u001a\u00020#\"\u00020\rH'¢\u0006\u0004\b6\u00109J\u0017\u0010;\u001a\u00020:2\u0006\u0010\u0019\u001a\u00020\rH'¢\u0006\u0004\b;\u0010<J\u0017\u0010;\u001a\u00020:2\u0006\u0010!\u001a\u00020\u0016H'¢\u0006\u0004\b;\u0010=J\u001b\u0010?\u001a\u00020/2\n\u0010>\u001a\u000203\"\u000204H'¢\u0006\u0004\b?\u0010@J\u001b\u0010?\u001a\u00020\r2\n\u0010\u0019\u001a\u00020#\"\u00020\rH'¢\u0006\u0004\b?\u0010AJ#\u0010?\u001a\u00020\r2\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160&\"\u00020\u0016H'¢\u0006\u0004\b?\u0010BJ#\u0010?\u001a\u00020\r2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0&\"\u00020\nH'¢\u0006\u0004\b?\u0010CJ\u001d\u0010D\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\rH'¢\u0006\u0004\bF\u0010-¨\u0006G"}, d2 = {"Lcom/sugarcube/app/base/data/database/DatabaseSceneDao;", "Lcom/sugarcube/app/base/data/database/GenericDao;", "Lcom/sugarcube/app/base/data/database/DatabaseScene;", "<init>", "()V", "Landroidx/lifecycle/F;", "", "Lcom/sugarcube/app/base/data/database/DatabaseSceneWithEntities;", "getWithEntities", "()Landroidx/lifecycle/F;", "Lcom/sugarcube/app/base/data/database/SceneState;", "states", "(Ljava/util/List;)Landroidx/lifecycle/F;", "", "wid", "(Ljava/util/List;I)Landroidx/lifecycle/F;", "state", "roomsReadyCount", "(Lcom/sugarcube/app/base/data/database/SceneState;)Landroidx/lifecycle/F;", "Ljava/time/Instant;", "modifiedAfter", "(ILjava/time/Instant;Lcom/sugarcube/app/base/data/database/SceneState;)Landroidx/lifecycle/F;", "Ljava/util/UUID;", "sceneUUID", "(Ljava/util/UUID;)Landroidx/lifecycle/F;", "sceneId", "(I)Landroidx/lifecycle/F;", "get", "(I)Lcom/sugarcube/app/base/data/database/DatabaseScene;", "(Lcom/sugarcube/app/base/data/database/SceneState;)Ljava/util/List;", "sceneUuid", "getWithEntitiesNowBySceneUuid", "(Ljava/util/UUID;)Lcom/sugarcube/app/base/data/database/DatabaseSceneWithEntities;", "uuid", "getWithEntitiesNow", "", "sceneIds", "([I)Ljava/util/List;", "", "uuids", "([Ljava/util/UUID;)Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)Ljava/util/List;", "(Ljava/util/UUID;)Lcom/sugarcube/app/base/data/database/DatabaseScene;", "getSceneCount", "()I", "entity", "LXH/N;", "updateWithLastModifiedTs", "(Lcom/sugarcube/app/base/data/database/DatabaseScene;)V", "ts", "", "", "ids", "updateState", "(Lcom/sugarcube/app/base/data/database/SceneState;Ljava/time/Instant;[J)I", "(Lcom/sugarcube/app/base/data/database/SceneState;Ljava/time/Instant;[Ljava/util/UUID;)I", "(Lcom/sugarcube/app/base/data/database/SceneState;Ljava/time/Instant;[I)I", "", "exists", "(I)Z", "(Ljava/util/UUID;)Z", "databaseSceneId", "delete", "([J)V", "([I)I", "([Ljava/util/UUID;)I", "([Lcom/sugarcube/app/base/data/database/SceneState;)I", "deleteAllScenesNotInState", "(Ljava/util/List;)I", "deleteAll", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DatabaseSceneDao implements GenericDao<DatabaseScene> {
    public static final int $stable = 0;

    public static /* synthetic */ F roomsReadyCount$default(DatabaseSceneDao databaseSceneDao, SceneState sceneState, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                sceneState = SceneState.SUCCESS;
            }
            return databaseSceneDao.roomsReadyCount(sceneState);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: roomsReadyCount");
    }

    public static /* synthetic */ int updateState$default(DatabaseSceneDao databaseSceneDao, SceneState sceneState, Instant instant, long[] jArr, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                instant = Instant.now();
            }
            return databaseSceneDao.updateState(sceneState, instant, jArr);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateState");
    }

    public abstract int delete(int... iArr);

    public abstract int delete(SceneState... sceneStateArr);

    public abstract int delete(UUID... uuidArr);

    public abstract void delete(long... jArr);

    public abstract int deleteAll();

    public abstract int deleteAllScenesNotInState(List<? extends SceneState> list);

    public abstract boolean exists(int i10);

    public abstract boolean exists(UUID uuid);

    public abstract F<List<DatabaseScene>> get();

    public abstract DatabaseScene get(int i10);

    public abstract DatabaseScene get(UUID uuid);

    public abstract List<DatabaseScene> get(SceneState sceneState);

    public abstract int getSceneCount();

    public abstract F<List<DatabaseSceneWithEntities>> getWithEntities();

    public abstract F<DatabaseSceneWithEntities> getWithEntities(int i10);

    public abstract F<List<DatabaseSceneWithEntities>> getWithEntities(List<? extends SceneState> list);

    public abstract F<List<DatabaseSceneWithEntities>> getWithEntities(List<? extends SceneState> list, int i10);

    public abstract F<DatabaseSceneWithEntities> getWithEntities(UUID uuid);

    public abstract DatabaseSceneWithEntities getWithEntitiesNow(UUID uuid);

    public abstract List<DatabaseSceneWithEntities> getWithEntitiesNow();

    public abstract List<DatabaseSceneWithEntities> getWithEntitiesNow(List<? extends SceneState> list);

    public abstract List<DatabaseSceneWithEntities> getWithEntitiesNow(int... iArr);

    public abstract List<DatabaseSceneWithEntities> getWithEntitiesNow(UUID... uuidArr);

    public abstract DatabaseSceneWithEntities getWithEntitiesNowBySceneUuid(UUID uuid);

    public abstract F<Integer> roomsReadyCount(int i10, Instant instant, SceneState sceneState);

    public abstract F<Integer> roomsReadyCount(SceneState sceneState);

    public abstract int updateState(SceneState sceneState, Instant instant, int... iArr);

    public abstract int updateState(SceneState sceneState, Instant instant, long... jArr);

    public abstract int updateState(SceneState sceneState, Instant instant, UUID... uuidArr);

    public final void updateWithLastModifiedTs(DatabaseScene databaseScene) {
        C17542s.j(databaseScene, "entity");
        databaseScene.setLastModifiedTs(Instant.now());
        update(databaseScene);
    }

    public static /* synthetic */ F roomsReadyCount$default(DatabaseSceneDao databaseSceneDao, int i10, Instant instant, SceneState sceneState, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                sceneState = SceneState.SUCCESS;
            }
            return databaseSceneDao.roomsReadyCount(i10, instant, sceneState);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: roomsReadyCount");
    }

    public static /* synthetic */ int updateState$default(DatabaseSceneDao databaseSceneDao, SceneState sceneState, Instant instant, UUID[] uuidArr, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                instant = Instant.now();
            }
            return databaseSceneDao.updateState(sceneState, instant, uuidArr);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateState");
    }

    public static /* synthetic */ int updateState$default(DatabaseSceneDao databaseSceneDao, SceneState sceneState, Instant instant, int[] iArr, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                instant = Instant.now();
            }
            return databaseSceneDao.updateState(sceneState, instant, iArr);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateState");
    }
}
