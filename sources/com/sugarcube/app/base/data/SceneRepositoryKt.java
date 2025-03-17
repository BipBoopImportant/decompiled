package com.sugarcube.app.base.data;

import XH.C16807N;
import androidx.lifecycle.F;
import androidx.lifecycle.e0;
import com.sugarcube.app.base.data.database.DatabaseSceneDao;
import com.sugarcube.app.base.data.database.DatabaseSceneWithEntities;
import com.sugarcube.app.base.data.database.EntitiesKt;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.database.SceneState;
import com.sugarcube.app.base.data.database.ScenesDatabase;
import com.sugarcube.core.network.models.LoggedInUser;
import com.sugarcube.core.network.models.SceneResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a?\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\r\u0010\u000e\"\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\t8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/core/network/models/SceneResponse;", "Lcom/sugarcube/app/base/data/database/DatabaseScene;", "asDatabaseModel", "(Lcom/sugarcube/core/network/models/SceneResponse;)Lcom/sugarcube/app/base/data/database/DatabaseScene;", "Lcom/sugarcube/app/base/data/database/ScenesDatabase;", "database", "", "Lcom/sugarcube/app/base/data/database/SceneState;", "defaultSceneStates", "Landroidx/lifecycle/F;", "Lcom/sugarcube/core/network/models/LoggedInUser;", "user", "Lcom/sugarcube/app/base/data/database/Scene;", "getLiveScenes", "(Lcom/sugarcube/app/base/data/database/ScenesDatabase;Ljava/util/List;Landroidx/lifecycle/F;)Landroidx/lifecycle/F;", "LIVE_SCENES", "Landroidx/lifecycle/F;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SceneRepositoryKt {
    private static F<List<Scene>> LIVE_SCENES;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0094, code lost:
        r2 = r2.getComplete();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.sugarcube.app.base.data.database.DatabaseScene asDatabaseModel(com.sugarcube.core.network.models.SceneResponse r26) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r26
            kotlin.jvm.internal.C17542s.j(r1, r0)
            com.sugarcube.app.base.data.database.DatabaseScene r0 = new com.sugarcube.app.base.data.database.DatabaseScene
            r2 = r0
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r25 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            int r2 = r26.getSceneId()
            r0.setSceneId(r2)
            java.lang.String r2 = r26.getName()
            r0.setName(r2)
            java.util.UUID r2 = r26.getSceneUuid()
            r0.setUuid(r2)
            java.util.UUID r2 = r26.getSceneUuid()
            r0.setSceneUuid(r2)
            java.time.Instant r2 = r26.getCreation()
            r0.setCreatedTs(r2)
            java.time.Instant r2 = r26.getLastModifiedTs()
            r0.setLastModifiedTs(r2)
            com.sugarcube.app.base.data.database.SceneState$Companion r2 = com.sugarcube.app.base.data.database.SceneState.Companion
            com.sugarcube.core.network.models.SceneResponseState r3 = r26.state()
            com.sugarcube.core.network.models.SceneResponseJobState r4 = r26.jobState()
            com.sugarcube.core.network.models.Manifest r5 = r26.getManifest()
            if (r5 == 0) goto L_0x0071
            boolean r5 = r5.isPreviewable()
            r7 = 1
            if (r5 != r7) goto L_0x0071
            r6 = r7
        L_0x0071:
            com.sugarcube.app.base.data.database.SceneState r2 = r2.fromSceneResponseState(r3, r4, r6)
            r0.setState(r2)
            int r2 = r26.getCompositionCount()
            r0.setCompositionCount(r2)
            java.time.Instant r2 = r26.getEstimatedFinishTs()
            r0.setEstimatedFinishTs(r2)
            com.sugarcube.core.network.models.Manifest r2 = r26.getManifest()
            r0.setManifest(r2)
            com.sugarcube.core.network.models.GlbUrls r2 = r26.getGlbUrls()
            r3 = 0
            if (r2 == 0) goto L_0x009f
            android.net.Uri r2 = r2.getComplete()
            if (r2 == 0) goto L_0x009f
            java.lang.String r2 = r2.toString()
            goto L_0x00a0
        L_0x009f:
            r2 = r3
        L_0x00a0:
            r0.setGlbUrl(r2)
            boolean r2 = r26.isStock()
            r0.setStock(r2)
            int r2 = r26.getWid()
            r0.setWid(r2)
            java.util.UUID r2 = r26.getUpload()
            r0.setUpload(r2)
            java.lang.String r2 = r26.getRoomType()
            if (r2 == 0) goto L_0x00cf
            com.sugarcube.core.network.models.RoomType$Companion r3 = com.sugarcube.core.network.models.RoomType.Companion
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.C17542s.i(r2, r4)
            com.sugarcube.core.network.models.RoomType r3 = r3.getTypeFromKey(r2)
        L_0x00cf:
            r0.setRoomType(r3)
            java.util.UUID r2 = r26.getJobId()
            r0.setJobId(r2)
            java.lang.String r1 = r26.getPipelineType()
            r0.setPipelineType(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.SceneRepositoryKt.asDatabaseModel(com.sugarcube.core.network.models.SceneResponse):com.sugarcube.app.base.data.database.DatabaseScene");
    }

    public static final F<List<Scene>> getLiveScenes(ScenesDatabase scenesDatabase, List<? extends SceneState> list, F<LoggedInUser> f10) {
        C17542s.j(scenesDatabase, "database");
        C17542s.j(list, "defaultSceneStates");
        C17542s.j(f10, "user");
        synchronized (SceneResponse.class) {
            try {
                if (LIVE_SCENES == null) {
                    LIVE_SCENES = e0.c(f10, new d(scenesDatabase, list, f10));
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        F<List<Scene>> f11 = LIVE_SCENES;
        if (f11 != null) {
            return f11;
        }
        C17542s.z("LIVE_SCENES");
        return null;
    }

    /* access modifiers changed from: private */
    public static final F getLiveScenes$lambda$4$lambda$3(ScenesDatabase scenesDatabase, List list, F f10, LoggedInUser loggedInUser) {
        DatabaseSceneDao databaseSceneDao = scenesDatabase.getDatabaseSceneDao();
        LoggedInUser loggedInUser2 = (LoggedInUser) f10.getValue();
        return e0.b(databaseSceneDao.getWithEntities(list, loggedInUser2 != null ? loggedInUser2.getWid() : 0), new c());
    }

    /* access modifiers changed from: private */
    public static final List getLiveScenes$lambda$4$lambda$3$lambda$2(List list) {
        C17542s.j(list, "it");
        return EntitiesKt.asDomainModel((List<DatabaseSceneWithEntities>) list);
    }
}
