package com.sugarcube.app.base.data.database;

import O4.a;
import O4.b;
import O4.d;
import O4.e;
import Q4.k;
import XH.C16807N;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.F;
import androidx.room.B;
import androidx.room.C7013j;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.core.network.models.RoomType;
import j0.C5468y;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class DatabaseSceneDao_Impl extends DatabaseSceneDao {
    /* access modifiers changed from: private */
    public final Converters __converters = new Converters();
    /* access modifiers changed from: private */
    public final x __db;
    private final C7013j<DatabaseScene> __deletionAdapterOfDatabaseScene;
    private final C7014k<DatabaseScene> __insertionAdapterOfDatabaseScene;
    private final H __preparedStmtOfDeleteAll;
    private final C7013j<DatabaseScene> __updateAdapterOfDatabaseScene;

    public DatabaseSceneDao_Impl(x xVar) {
        this.__db = xVar;
        this.__insertionAdapterOfDatabaseScene = new C7014k<DatabaseScene>(xVar) {
            /* access modifiers changed from: protected */
            public String createQuery() {
                return "INSERT OR REPLACE INTO `DatabaseScene` (`id`,`uuid`,`sceneId`,`sceneUuid`,`name`,`createdTs`,`lastModifiedTs`,`state`,`compositionCount`,`manifest`,`glbUrl`,`isStock`,`uploadWorkerId`,`userAcknowledged`,`estimatedFinishTs`,`upload`,`wid`,`roomType`,`jobId`,`pipelineType`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* access modifiers changed from: protected */
            public void bind(k kVar, DatabaseScene databaseScene) {
                kVar.i2(1, databaseScene.getId());
                String fromUuid = DatabaseSceneDao_Impl.this.__converters.fromUuid(databaseScene.getUuid());
                if (fromUuid == null) {
                    kVar.I2(2);
                } else {
                    kVar.H(2, fromUuid);
                }
                kVar.i2(3, (long) databaseScene.getSceneId());
                String fromUuid2 = DatabaseSceneDao_Impl.this.__converters.fromUuid(databaseScene.getSceneUuid());
                if (fromUuid2 == null) {
                    kVar.I2(4);
                } else {
                    kVar.H(4, fromUuid2);
                }
                kVar.H(5, databaseScene.getName());
                Long fromInstant = DatabaseSceneDao_Impl.this.__converters.fromInstant(databaseScene.getCreatedTs());
                if (fromInstant == null) {
                    kVar.I2(6);
                } else {
                    kVar.i2(6, fromInstant.longValue());
                }
                Long fromInstant2 = DatabaseSceneDao_Impl.this.__converters.fromInstant(databaseScene.getLastModifiedTs());
                if (fromInstant2 == null) {
                    kVar.I2(7);
                } else {
                    kVar.i2(7, fromInstant2.longValue());
                }
                kVar.H(8, DatabaseSceneDao_Impl.this.__converters.fromState(databaseScene.getState()));
                kVar.i2(9, (long) databaseScene.getCompositionCount());
                String fromManifest = DatabaseSceneDao_Impl.this.__converters.fromManifest(databaseScene.getManifest());
                if (fromManifest == null) {
                    kVar.I2(10);
                } else {
                    kVar.H(10, fromManifest);
                }
                if (databaseScene.getGlbUrl() == null) {
                    kVar.I2(11);
                } else {
                    kVar.H(11, databaseScene.getGlbUrl());
                }
                kVar.i2(12, databaseScene.isStock() ? 1 : 0);
                String fromUuid3 = DatabaseSceneDao_Impl.this.__converters.fromUuid(databaseScene.getUploadWorkerId());
                if (fromUuid3 == null) {
                    kVar.I2(13);
                } else {
                    kVar.H(13, fromUuid3);
                }
                kVar.i2(14, databaseScene.getUserAcknowledged() ? 1 : 0);
                Long fromInstant3 = DatabaseSceneDao_Impl.this.__converters.fromInstant(databaseScene.getEstimatedFinishTs());
                if (fromInstant3 == null) {
                    kVar.I2(15);
                } else {
                    kVar.i2(15, fromInstant3.longValue());
                }
                String fromUuid4 = DatabaseSceneDao_Impl.this.__converters.fromUuid(databaseScene.getUpload());
                if (fromUuid4 == null) {
                    kVar.I2(16);
                } else {
                    kVar.H(16, fromUuid4);
                }
                kVar.i2(17, (long) databaseScene.getWid());
                String fromRoomType = DatabaseSceneDao_Impl.this.__converters.fromRoomType(databaseScene.getRoomType());
                if (fromRoomType == null) {
                    kVar.I2(18);
                } else {
                    kVar.H(18, fromRoomType);
                }
                String fromUuid5 = DatabaseSceneDao_Impl.this.__converters.fromUuid(databaseScene.getJobId());
                if (fromUuid5 == null) {
                    kVar.I2(19);
                } else {
                    kVar.H(19, fromUuid5);
                }
                if (databaseScene.getPipelineType() == null) {
                    kVar.I2(20);
                } else {
                    kVar.H(20, databaseScene.getPipelineType());
                }
            }
        };
        this.__deletionAdapterOfDatabaseScene = new C7013j<DatabaseScene>(this, xVar) {
            /* access modifiers changed from: protected */
            public String createQuery() {
                return "DELETE FROM `DatabaseScene` WHERE `id` = ?";
            }

            /* access modifiers changed from: protected */
            public void bind(k kVar, DatabaseScene databaseScene) {
                kVar.i2(1, databaseScene.getId());
            }
        };
        this.__updateAdapterOfDatabaseScene = new C7013j<DatabaseScene>(xVar) {
            /* access modifiers changed from: protected */
            public String createQuery() {
                return "UPDATE OR REPLACE `DatabaseScene` SET `id` = ?,`uuid` = ?,`sceneId` = ?,`sceneUuid` = ?,`name` = ?,`createdTs` = ?,`lastModifiedTs` = ?,`state` = ?,`compositionCount` = ?,`manifest` = ?,`glbUrl` = ?,`isStock` = ?,`uploadWorkerId` = ?,`userAcknowledged` = ?,`estimatedFinishTs` = ?,`upload` = ?,`wid` = ?,`roomType` = ?,`jobId` = ?,`pipelineType` = ? WHERE `id` = ?";
            }

            /* access modifiers changed from: protected */
            public void bind(k kVar, DatabaseScene databaseScene) {
                kVar.i2(1, databaseScene.getId());
                String fromUuid = DatabaseSceneDao_Impl.this.__converters.fromUuid(databaseScene.getUuid());
                if (fromUuid == null) {
                    kVar.I2(2);
                } else {
                    kVar.H(2, fromUuid);
                }
                kVar.i2(3, (long) databaseScene.getSceneId());
                String fromUuid2 = DatabaseSceneDao_Impl.this.__converters.fromUuid(databaseScene.getSceneUuid());
                if (fromUuid2 == null) {
                    kVar.I2(4);
                } else {
                    kVar.H(4, fromUuid2);
                }
                kVar.H(5, databaseScene.getName());
                Long fromInstant = DatabaseSceneDao_Impl.this.__converters.fromInstant(databaseScene.getCreatedTs());
                if (fromInstant == null) {
                    kVar.I2(6);
                } else {
                    kVar.i2(6, fromInstant.longValue());
                }
                Long fromInstant2 = DatabaseSceneDao_Impl.this.__converters.fromInstant(databaseScene.getLastModifiedTs());
                if (fromInstant2 == null) {
                    kVar.I2(7);
                } else {
                    kVar.i2(7, fromInstant2.longValue());
                }
                kVar.H(8, DatabaseSceneDao_Impl.this.__converters.fromState(databaseScene.getState()));
                kVar.i2(9, (long) databaseScene.getCompositionCount());
                String fromManifest = DatabaseSceneDao_Impl.this.__converters.fromManifest(databaseScene.getManifest());
                if (fromManifest == null) {
                    kVar.I2(10);
                } else {
                    kVar.H(10, fromManifest);
                }
                if (databaseScene.getGlbUrl() == null) {
                    kVar.I2(11);
                } else {
                    kVar.H(11, databaseScene.getGlbUrl());
                }
                kVar.i2(12, databaseScene.isStock() ? 1 : 0);
                String fromUuid3 = DatabaseSceneDao_Impl.this.__converters.fromUuid(databaseScene.getUploadWorkerId());
                if (fromUuid3 == null) {
                    kVar.I2(13);
                } else {
                    kVar.H(13, fromUuid3);
                }
                kVar.i2(14, databaseScene.getUserAcknowledged() ? 1 : 0);
                Long fromInstant3 = DatabaseSceneDao_Impl.this.__converters.fromInstant(databaseScene.getEstimatedFinishTs());
                if (fromInstant3 == null) {
                    kVar.I2(15);
                } else {
                    kVar.i2(15, fromInstant3.longValue());
                }
                String fromUuid4 = DatabaseSceneDao_Impl.this.__converters.fromUuid(databaseScene.getUpload());
                if (fromUuid4 == null) {
                    kVar.I2(16);
                } else {
                    kVar.H(16, fromUuid4);
                }
                kVar.i2(17, (long) databaseScene.getWid());
                String fromRoomType = DatabaseSceneDao_Impl.this.__converters.fromRoomType(databaseScene.getRoomType());
                if (fromRoomType == null) {
                    kVar.I2(18);
                } else {
                    kVar.H(18, fromRoomType);
                }
                String fromUuid5 = DatabaseSceneDao_Impl.this.__converters.fromUuid(databaseScene.getJobId());
                if (fromUuid5 == null) {
                    kVar.I2(19);
                } else {
                    kVar.H(19, fromUuid5);
                }
                if (databaseScene.getPipelineType() == null) {
                    kVar.I2(20);
                } else {
                    kVar.H(20, databaseScene.getPipelineType());
                }
                kVar.i2(21, databaseScene.getId());
            }
        };
        this.__preparedStmtOfDeleteAll = new H(this, xVar) {
            public String createQuery() {
                return "DELETE FROM DatabaseScene";
            }
        };
    }

    /* access modifiers changed from: private */
    public void __fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(C5468y<ArrayList<DatabaseMedia>> yVar) {
        C5468y<ArrayList<DatabaseMedia>> yVar2 = yVar;
        if (!yVar.f()) {
            if (yVar.o() > 999) {
                d.c(yVar2, true, new c(this));
                return;
            }
            StringBuilder b10 = e.b();
            b10.append("SELECT `id`,`databaseSceneId`,`name`,`uri`,`width`,`height`,`type` FROM `DatabaseMedia` WHERE `databaseSceneId` IN (");
            int o10 = yVar.o();
            e.a(b10, o10);
            b10.append(")");
            B e10 = B.e(b10.toString(), o10);
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < yVar.o(); i12++) {
                e10.i2(i11, yVar2.j(i12));
                i11++;
            }
            Cursor e11 = b.e(this.__db, e10, false, (CancellationSignal) null);
            try {
                int c10 = a.c(e11, "databaseSceneId");
                if (c10 != -1) {
                    while (e11.moveToNext()) {
                        ArrayList d10 = yVar2.d(e11.getLong(c10));
                        if (d10 != null) {
                            d10.add(new DatabaseMedia(e11.getLong(i10), e11.getLong(1), e11.getString(2), this.__converters.toUri(e11.getString(3)), e11.getInt(4), e11.getInt(5), this.__converters.toMediaType(e11.getString(6))));
                        }
                        i10 = 0;
                    }
                    e11.close();
                }
            } finally {
                e11.close();
            }
        }
    }

    /* access modifiers changed from: private */
    public void __fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(C5468y<ArrayList<DatabaseMetadata>> yVar) {
        if (!yVar.f()) {
            if (yVar.o() > 999) {
                d.c(yVar, true, new b(this));
                return;
            }
            StringBuilder b10 = e.b();
            b10.append("SELECT `id`,`databaseSceneId`,`name`,`uri` FROM `DatabaseMetadata` WHERE `databaseSceneId` IN (");
            int o10 = yVar.o();
            e.a(b10, o10);
            b10.append(")");
            B e10 = B.e(b10.toString(), o10);
            int i10 = 1;
            for (int i11 = 0; i11 < yVar.o(); i11++) {
                e10.i2(i10, yVar.j(i11));
                i10++;
            }
            Cursor e11 = b.e(this.__db, e10, false, (CancellationSignal) null);
            try {
                int c10 = a.c(e11, "databaseSceneId");
                if (c10 != -1) {
                    while (e11.moveToNext()) {
                        ArrayList d10 = yVar.d(e11.getLong(c10));
                        if (d10 != null) {
                            d10.add(new DatabaseMetadata(e11.getLong(0), e11.getLong(1), e11.getString(2), this.__converters.toUri(e11.getString(3))));
                        }
                    }
                    e11.close();
                }
            } finally {
                e11.close();
            }
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C16807N lambda$__fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia$0(C5468y yVar) {
        __fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C16807N lambda$__fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata$1(C5468y yVar) {
        __fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar);
        return C16807N.f139792a;
    }

    public int deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        k acquire = this.__preparedStmtOfDeleteAll.acquire();
        try {
            this.__db.beginTransaction();
            int b02 = acquire.b0();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(acquire);
            return b02;
        } catch (Throwable th2) {
            this.__preparedStmtOfDeleteAll.release(acquire);
            throw th2;
        }
    }

    public int deleteAllScenesNotInState(List<? extends SceneState> list) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder b10 = e.b();
        b10.append("DELETE FROM DatabaseScene WHERE sceneId != 0 AND state NOT IN (");
        e.a(b10, list.size());
        b10.append(")");
        k compileStatement = this.__db.compileStatement(b10.toString());
        int i10 = 1;
        for (SceneState fromState : list) {
            compileStatement.H(i10, this.__converters.fromState(fromState));
            i10++;
        }
        this.__db.beginTransaction();
        try {
            int b02 = compileStatement.b0();
            this.__db.setTransactionSuccessful();
            return b02;
        } finally {
            this.__db.endTransaction();
        }
    }

    public boolean exists(int i10) {
        Cursor e10;
        boolean z10 = true;
        B e11 = B.e("SELECT EXISTS(SELECT * FROM DatabaseScene WHERE sceneId = ?)", 1);
        e11.i2(1, (long) i10);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            boolean z11 = false;
            e10 = b.e(this.__db, e11, false, (CancellationSignal) null);
            if (e10.moveToFirst()) {
                if (e10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            this.__db.setTransactionSuccessful();
            e10.close();
            e11.h();
            this.__db.endTransaction();
            return z11;
        } catch (Throwable th2) {
            this.__db.endTransaction();
            throw th2;
        }
    }

    public DatabaseScene get(int i10) {
        B b10;
        DatabaseScene databaseScene;
        String str;
        String str2;
        Long l10;
        Long l11;
        String str3;
        String str4;
        String str5;
        boolean z10;
        int i11;
        Long l12;
        String str6;
        String str7;
        String str8;
        String str9;
        B e10 = B.e("SELECT * FROM DatabaseScene WHERE sceneId = ?", 1);
        e10.i2(1, (long) i10);
        this.__db.assertNotSuspendingTransaction();
        Cursor e11 = b.e(this.__db, e10, false, (CancellationSignal) null);
        try {
            int d10 = a.d(e11, "id");
            int d11 = a.d(e11, "uuid");
            int d12 = a.d(e11, "sceneId");
            int d13 = a.d(e11, "sceneUuid");
            int d14 = a.d(e11, "name");
            int d15 = a.d(e11, "createdTs");
            int d16 = a.d(e11, "lastModifiedTs");
            int d17 = a.d(e11, "state");
            int d18 = a.d(e11, "compositionCount");
            int d19 = a.d(e11, "manifest");
            int d20 = a.d(e11, "glbUrl");
            int d21 = a.d(e11, "isStock");
            int d22 = a.d(e11, "uploadWorkerId");
            b10 = e10;
            try {
                int d23 = a.d(e11, "userAcknowledged");
                int d24 = a.d(e11, "estimatedFinishTs");
                int d25 = a.d(e11, "upload");
                int d26 = a.d(e11, "wid");
                int d27 = a.d(e11, "roomType");
                int d28 = a.d(e11, "jobId");
                int d29 = a.d(e11, "pipelineType");
                if (e11.moveToFirst()) {
                    long j10 = e11.getLong(d10);
                    if (e11.isNull(d11)) {
                        str = null;
                    } else {
                        str = e11.getString(d11);
                    }
                    UUID uuid = this.__converters.toUuid(str);
                    if (uuid != null) {
                        int i12 = e11.getInt(d12);
                        if (e11.isNull(d13)) {
                            str2 = null;
                        } else {
                            str2 = e11.getString(d13);
                        }
                        UUID uuid2 = this.__converters.toUuid(str2);
                        if (uuid2 != null) {
                            String string = e11.getString(d14);
                            if (e11.isNull(d15)) {
                                l10 = null;
                            } else {
                                l10 = Long.valueOf(e11.getLong(d15));
                            }
                            Instant instant = this.__converters.toInstant(l10);
                            if (instant != null) {
                                if (e11.isNull(d16)) {
                                    l11 = null;
                                } else {
                                    l11 = Long.valueOf(e11.getLong(d16));
                                }
                                Instant instant2 = this.__converters.toInstant(l11);
                                if (instant2 != null) {
                                    SceneState state = this.__converters.toState(e11.getString(d17));
                                    int i13 = e11.getInt(d18);
                                    if (e11.isNull(d19)) {
                                        str3 = null;
                                    } else {
                                        str3 = e11.getString(d19);
                                    }
                                    Manifest manifest = this.__converters.toManifest(str3);
                                    if (e11.isNull(d20)) {
                                        str4 = null;
                                    } else {
                                        str4 = e11.getString(d20);
                                    }
                                    boolean z11 = e11.getInt(d21) != 0;
                                    if (e11.isNull(d22)) {
                                        str5 = null;
                                    } else {
                                        str5 = e11.getString(d22);
                                    }
                                    UUID uuid3 = this.__converters.toUuid(str5);
                                    if (e11.getInt(d23) != 0) {
                                        i11 = d24;
                                        z10 = true;
                                    } else {
                                        i11 = d24;
                                        z10 = false;
                                    }
                                    if (e11.isNull(i11)) {
                                        l12 = null;
                                    } else {
                                        l12 = Long.valueOf(e11.getLong(i11));
                                    }
                                    Instant instant3 = this.__converters.toInstant(l12);
                                    int i14 = d25;
                                    if (e11.isNull(i14)) {
                                        str6 = null;
                                    } else {
                                        str6 = e11.getString(i14);
                                    }
                                    UUID uuid4 = this.__converters.toUuid(str6);
                                    int i15 = e11.getInt(d26);
                                    int i16 = d27;
                                    if (e11.isNull(i16)) {
                                        str7 = null;
                                    } else {
                                        str7 = e11.getString(i16);
                                    }
                                    RoomType roomType = this.__converters.toRoomType(str7);
                                    int i17 = d28;
                                    if (e11.isNull(i17)) {
                                        str8 = null;
                                    } else {
                                        str8 = e11.getString(i17);
                                    }
                                    UUID uuid5 = this.__converters.toUuid(str8);
                                    if (e11.isNull(d29)) {
                                        str9 = null;
                                    } else {
                                        str9 = e11.getString(d29);
                                    }
                                    databaseScene = new DatabaseScene(j10, uuid, i12, uuid2, string, instant, instant2, state, i13, manifest, str4, z11, uuid3, z10, instant3, uuid4, i15, roomType, uuid5, str9);
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                    }
                } else {
                    databaseScene = null;
                }
                e11.close();
                b10.h();
                return databaseScene;
            } catch (Throwable th2) {
                th = th2;
                e11.close();
                b10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b10 = e10;
            e11.close();
            b10.h();
            throw th;
        }
    }

    public int getSceneCount() {
        int i10 = 0;
        B e10 = B.e("SELECT COUNT(uuid) FROM DatabaseScene", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor e11 = b.e(this.__db, e10, false, (CancellationSignal) null);
        try {
            if (e11.moveToFirst()) {
                i10 = e11.getInt(0);
            }
            return i10;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public F<List<DatabaseSceneWithEntities>> getWithEntities() {
        final B e10 = B.e("select * from DatabaseScene order by createdTs DESC", 0);
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseMedia", "DatabaseMetadata", "DatabaseScene"}, true, new Callable<List<DatabaseSceneWithEntities>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public List<DatabaseSceneWithEntities> call() {
                Cursor e10;
                String str;
                int i10;
                String str2;
                Long l10;
                Long l11;
                String str3;
                String str4;
                int i11;
                int i12;
                int i13;
                String str5;
                boolean z10;
                int i14;
                int i15;
                int i16;
                Long l12;
                String str6;
                int i17;
                int i18;
                String str7;
                String str8;
                String str9;
                int i19;
                DatabaseSceneDao_Impl.this.__db.beginTransaction();
                try {
                    e10 = b.e(DatabaseSceneDao_Impl.this.__db, e10, true, (CancellationSignal) null);
                    int d10 = a.d(e10, "id");
                    int d11 = a.d(e10, "uuid");
                    int d12 = a.d(e10, "sceneId");
                    int d13 = a.d(e10, "sceneUuid");
                    int d14 = a.d(e10, "name");
                    int d15 = a.d(e10, "createdTs");
                    int d16 = a.d(e10, "lastModifiedTs");
                    int d17 = a.d(e10, "state");
                    int d18 = a.d(e10, "compositionCount");
                    int d19 = a.d(e10, "manifest");
                    int d20 = a.d(e10, "glbUrl");
                    int d21 = a.d(e10, "isStock");
                    int d22 = a.d(e10, "uploadWorkerId");
                    int d23 = a.d(e10, "userAcknowledged");
                    int d24 = a.d(e10, "estimatedFinishTs");
                    int d25 = a.d(e10, "upload");
                    int d26 = a.d(e10, "wid");
                    int d27 = a.d(e10, "roomType");
                    int d28 = a.d(e10, "jobId");
                    int d29 = a.d(e10, "pipelineType");
                    C5468y yVar = new C5468y();
                    int i20 = d22;
                    C5468y yVar2 = new C5468y();
                    while (e10.moveToNext()) {
                        int i21 = d20;
                        int i22 = d21;
                        long j10 = e10.getLong(d10);
                        if (!yVar.c(j10)) {
                            i19 = d19;
                            yVar.k(j10, new ArrayList());
                        } else {
                            i19 = d19;
                        }
                        long j11 = e10.getLong(d10);
                        if (!yVar2.c(j11)) {
                            yVar2.k(j11, new ArrayList());
                        }
                        d20 = i21;
                        d21 = i22;
                        d19 = i19;
                    }
                    int i23 = d19;
                    int i24 = d20;
                    int i25 = d21;
                    e10.moveToPosition(-1);
                    DatabaseSceneDao_Impl.this.__fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
                    DatabaseSceneDao_Impl.this.__fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar2);
                    ArrayList arrayList = new ArrayList(e10.getCount());
                    while (e10.moveToNext()) {
                        long j12 = e10.getLong(d10);
                        if (e10.isNull(d11)) {
                            str = null;
                        } else {
                            str = e10.getString(d11);
                        }
                        UUID uuid = DatabaseSceneDao_Impl.this.__converters.toUuid(str);
                        if (uuid != null) {
                            int i26 = e10.getInt(d12);
                            if (e10.isNull(d13)) {
                                i10 = d11;
                                str2 = null;
                            } else {
                                str2 = e10.getString(d13);
                                i10 = d11;
                            }
                            UUID uuid2 = DatabaseSceneDao_Impl.this.__converters.toUuid(str2);
                            if (uuid2 != null) {
                                String string = e10.getString(d14);
                                if (e10.isNull(d15)) {
                                    l10 = null;
                                } else {
                                    l10 = Long.valueOf(e10.getLong(d15));
                                }
                                Instant instant = DatabaseSceneDao_Impl.this.__converters.toInstant(l10);
                                if (instant != null) {
                                    if (e10.isNull(d16)) {
                                        l11 = null;
                                    } else {
                                        l11 = Long.valueOf(e10.getLong(d16));
                                    }
                                    Instant instant2 = DatabaseSceneDao_Impl.this.__converters.toInstant(l11);
                                    if (instant2 != null) {
                                        SceneState state = DatabaseSceneDao_Impl.this.__converters.toState(e10.getString(d17));
                                        int i27 = e10.getInt(d18);
                                        int i28 = i23;
                                        if (e10.isNull(i28)) {
                                            str3 = null;
                                        } else {
                                            str3 = e10.getString(i28);
                                        }
                                        Manifest manifest = DatabaseSceneDao_Impl.this.__converters.toManifest(str3);
                                        int i29 = i24;
                                        if (e10.isNull(i29)) {
                                            i11 = i25;
                                            str4 = null;
                                        } else {
                                            str4 = e10.getString(i29);
                                            i11 = i25;
                                        }
                                        i23 = i28;
                                        int i30 = i20;
                                        boolean z11 = e10.getInt(i11) != 0;
                                        if (e10.isNull(i30)) {
                                            i12 = i30;
                                            i13 = d12;
                                            str5 = null;
                                        } else {
                                            i12 = i30;
                                            str5 = e10.getString(i30);
                                            i13 = d12;
                                        }
                                        UUID uuid3 = DatabaseSceneDao_Impl.this.__converters.toUuid(str5);
                                        int i31 = d23;
                                        if (e10.getInt(i31) != 0) {
                                            i14 = d24;
                                            z10 = true;
                                        } else {
                                            i14 = d24;
                                            z10 = false;
                                        }
                                        if (e10.isNull(i14)) {
                                            i15 = i31;
                                            i16 = i14;
                                            l12 = null;
                                        } else {
                                            i15 = i31;
                                            l12 = Long.valueOf(e10.getLong(i14));
                                            i16 = i14;
                                        }
                                        Instant instant3 = DatabaseSceneDao_Impl.this.__converters.toInstant(l12);
                                        int i32 = d25;
                                        if (e10.isNull(i32)) {
                                            d25 = i32;
                                            str6 = null;
                                        } else {
                                            str6 = e10.getString(i32);
                                            d25 = i32;
                                        }
                                        UUID uuid4 = DatabaseSceneDao_Impl.this.__converters.toUuid(str6);
                                        int i33 = d26;
                                        int i34 = e10.getInt(i33);
                                        int i35 = d27;
                                        if (e10.isNull(i35)) {
                                            i17 = i33;
                                            i18 = i35;
                                            str7 = null;
                                        } else {
                                            i17 = i33;
                                            str7 = e10.getString(i35);
                                            i18 = i35;
                                        }
                                        RoomType roomType = DatabaseSceneDao_Impl.this.__converters.toRoomType(str7);
                                        int i36 = d28;
                                        if (e10.isNull(i36)) {
                                            d28 = i36;
                                            str8 = null;
                                        } else {
                                            str8 = e10.getString(i36);
                                            d28 = i36;
                                        }
                                        UUID uuid5 = DatabaseSceneDao_Impl.this.__converters.toUuid(str8);
                                        int i37 = d29;
                                        if (e10.isNull(i37)) {
                                            str9 = null;
                                        } else {
                                            str9 = e10.getString(i37);
                                        }
                                        arrayList.add(new DatabaseSceneWithEntities(new DatabaseScene(j12, uuid, i26, uuid2, string, instant, instant2, state, i27, manifest, str4, z11, uuid3, z10, instant3, uuid4, i34, roomType, uuid5, str9), (ArrayList) yVar.d(e10.getLong(d10)), (ArrayList) yVar2.d(e10.getLong(d10))));
                                        yVar = yVar;
                                        d13 = d13;
                                        d12 = i13;
                                        i20 = i12;
                                        d14 = d14;
                                        d29 = i37;
                                        d11 = i10;
                                        i24 = i29;
                                        i25 = i11;
                                        int i38 = i15;
                                        d24 = i16;
                                        d23 = i38;
                                        int i39 = i17;
                                        d27 = i18;
                                        d26 = i39;
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    }
                    DatabaseSceneDao_Impl.this.__db.setTransactionSuccessful();
                    e10.close();
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    throw th2;
                }
            }
        });
    }

    public DatabaseSceneWithEntities getWithEntitiesNow(UUID uuid) {
        B b10;
        DatabaseSceneWithEntities databaseSceneWithEntities;
        String str;
        String str2;
        Long l10;
        Long l11;
        String str3;
        String str4;
        int i10;
        boolean z10;
        int i11;
        String str5;
        boolean z11;
        int i12;
        Long l12;
        String str6;
        String str7;
        String str8;
        String str9;
        int i13;
        B e10 = B.e("SELECT * FROM DatabaseScene WHERE uuid = ?", 1);
        String fromUuid = this.__converters.fromUuid(uuid);
        if (fromUuid == null) {
            e10.I2(1);
        } else {
            e10.H(1, fromUuid);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor e11 = b.e(this.__db, e10, true, (CancellationSignal) null);
            try {
                int d10 = a.d(e11, "id");
                int d11 = a.d(e11, "uuid");
                int d12 = a.d(e11, "sceneId");
                int d13 = a.d(e11, "sceneUuid");
                int d14 = a.d(e11, "name");
                int d15 = a.d(e11, "createdTs");
                int d16 = a.d(e11, "lastModifiedTs");
                int d17 = a.d(e11, "state");
                int d18 = a.d(e11, "compositionCount");
                int d19 = a.d(e11, "manifest");
                int d20 = a.d(e11, "glbUrl");
                int d21 = a.d(e11, "isStock");
                int d22 = a.d(e11, "uploadWorkerId");
                b10 = e10;
                try {
                    int d23 = a.d(e11, "userAcknowledged");
                    int d24 = a.d(e11, "estimatedFinishTs");
                    int d25 = a.d(e11, "upload");
                    int d26 = a.d(e11, "wid");
                    int d27 = a.d(e11, "roomType");
                    int d28 = a.d(e11, "jobId");
                    int d29 = a.d(e11, "pipelineType");
                    C5468y yVar = new C5468y();
                    int i14 = d22;
                    C5468y yVar2 = new C5468y();
                    while (e11.moveToNext()) {
                        int i15 = d19;
                        int i16 = d20;
                        long j10 = e11.getLong(d10);
                        if (!yVar.c(j10)) {
                            i13 = d21;
                            yVar.k(j10, new ArrayList());
                        } else {
                            i13 = d21;
                        }
                        long j11 = e11.getLong(d10);
                        if (!yVar2.c(j11)) {
                            yVar2.k(j11, new ArrayList());
                        }
                        d19 = i15;
                        d20 = i16;
                        d21 = i13;
                    }
                    int i17 = d21;
                    int i18 = d19;
                    int i19 = d20;
                    e11.moveToPosition(-1);
                    __fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
                    __fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar2);
                    if (e11.moveToFirst()) {
                        long j12 = e11.getLong(d10);
                        if (e11.isNull(d11)) {
                            str = null;
                        } else {
                            str = e11.getString(d11);
                        }
                        UUID uuid2 = this.__converters.toUuid(str);
                        if (uuid2 != null) {
                            int i20 = e11.getInt(d12);
                            if (e11.isNull(d13)) {
                                str2 = null;
                            } else {
                                str2 = e11.getString(d13);
                            }
                            UUID uuid3 = this.__converters.toUuid(str2);
                            if (uuid3 != null) {
                                String string = e11.getString(d14);
                                if (e11.isNull(d15)) {
                                    l10 = null;
                                } else {
                                    l10 = Long.valueOf(e11.getLong(d15));
                                }
                                Instant instant = this.__converters.toInstant(l10);
                                if (instant != null) {
                                    if (e11.isNull(d16)) {
                                        l11 = null;
                                    } else {
                                        l11 = Long.valueOf(e11.getLong(d16));
                                    }
                                    Instant instant2 = this.__converters.toInstant(l11);
                                    if (instant2 != null) {
                                        SceneState state = this.__converters.toState(e11.getString(d17));
                                        int i21 = e11.getInt(d18);
                                        int i22 = i18;
                                        if (e11.isNull(i22)) {
                                            str3 = null;
                                        } else {
                                            str3 = e11.getString(i22);
                                        }
                                        Manifest manifest = this.__converters.toManifest(str3);
                                        int i23 = i19;
                                        if (e11.isNull(i23)) {
                                            i10 = i17;
                                            str4 = null;
                                        } else {
                                            str4 = e11.getString(i23);
                                            i10 = i17;
                                        }
                                        if (e11.getInt(i10) != 0) {
                                            i11 = i14;
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                            i11 = i14;
                                        }
                                        if (e11.isNull(i11)) {
                                            str5 = null;
                                        } else {
                                            str5 = e11.getString(i11);
                                        }
                                        UUID uuid4 = this.__converters.toUuid(str5);
                                        if (e11.getInt(d23) != 0) {
                                            i12 = d24;
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                            i12 = d24;
                                        }
                                        if (e11.isNull(i12)) {
                                            l12 = null;
                                        } else {
                                            l12 = Long.valueOf(e11.getLong(i12));
                                        }
                                        Instant instant3 = this.__converters.toInstant(l12);
                                        int i24 = d25;
                                        if (e11.isNull(i24)) {
                                            str6 = null;
                                        } else {
                                            str6 = e11.getString(i24);
                                        }
                                        UUID uuid5 = this.__converters.toUuid(str6);
                                        int i25 = e11.getInt(d26);
                                        int i26 = d27;
                                        if (e11.isNull(i26)) {
                                            str7 = null;
                                        } else {
                                            str7 = e11.getString(i26);
                                        }
                                        RoomType roomType = this.__converters.toRoomType(str7);
                                        int i27 = d28;
                                        if (e11.isNull(i27)) {
                                            str8 = null;
                                        } else {
                                            str8 = e11.getString(i27);
                                        }
                                        UUID uuid6 = this.__converters.toUuid(str8);
                                        int i28 = d29;
                                        if (e11.isNull(i28)) {
                                            str9 = null;
                                        } else {
                                            str9 = e11.getString(i28);
                                        }
                                        databaseSceneWithEntities = new DatabaseSceneWithEntities(new DatabaseScene(j12, uuid2, i20, uuid3, string, instant, instant2, state, i21, manifest, str4, z10, uuid4, z11, instant3, uuid5, i25, roomType, uuid6, str9), (ArrayList) yVar.d(e11.getLong(d10)), (ArrayList) yVar2.d(e11.getLong(d10)));
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    } else {
                        databaseSceneWithEntities = null;
                    }
                    this.__db.setTransactionSuccessful();
                    e11.close();
                    b10.h();
                    return databaseSceneWithEntities;
                } catch (Throwable th2) {
                    th = th2;
                    e11.close();
                    b10.h();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                b10 = e10;
                e11.close();
                b10.h();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    public DatabaseSceneWithEntities getWithEntitiesNowBySceneUuid(UUID uuid) {
        B b10;
        DatabaseSceneWithEntities databaseSceneWithEntities;
        String str;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        B e10 = B.e("SELECT * FROM DatabaseScene WHERE sceneUuid = ?", 1);
        String fromUuid = this.__converters.fromUuid(uuid);
        if (fromUuid == null) {
            e10.I2(1);
        } else {
            e10.H(1, fromUuid);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor e11 = b.e(this.__db, e10, true, (CancellationSignal) null);
            try {
                int d10 = a.d(e11, "id");
                int d11 = a.d(e11, "uuid");
                int d12 = a.d(e11, "sceneId");
                int d13 = a.d(e11, "sceneUuid");
                int d14 = a.d(e11, "name");
                int d15 = a.d(e11, "createdTs");
                int d16 = a.d(e11, "lastModifiedTs");
                int d17 = a.d(e11, "state");
                int d18 = a.d(e11, "compositionCount");
                int d19 = a.d(e11, "manifest");
                int d20 = a.d(e11, "glbUrl");
                int d21 = a.d(e11, "isStock");
                int d22 = a.d(e11, "uploadWorkerId");
                b10 = e10;
                try {
                    int d23 = a.d(e11, "userAcknowledged");
                    int d24 = a.d(e11, "estimatedFinishTs");
                    int d25 = a.d(e11, "upload");
                    int d26 = a.d(e11, "wid");
                    int d27 = a.d(e11, "roomType");
                    int d28 = a.d(e11, "jobId");
                    int d29 = a.d(e11, "pipelineType");
                    C5468y yVar = new C5468y();
                    int i14 = d22;
                    C5468y yVar2 = new C5468y();
                    while (e11.moveToNext()) {
                        int i15 = d19;
                        int i16 = d20;
                        long j10 = e11.getLong(d10);
                        if (!yVar.c(j10)) {
                            i13 = d21;
                            yVar.k(j10, new ArrayList());
                        } else {
                            i13 = d21;
                        }
                        long j11 = e11.getLong(d10);
                        if (!yVar2.c(j11)) {
                            yVar2.k(j11, new ArrayList());
                        }
                        d19 = i15;
                        d20 = i16;
                        d21 = i13;
                    }
                    int i17 = d21;
                    int i18 = d19;
                    int i19 = d20;
                    e11.moveToPosition(-1);
                    __fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
                    __fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar2);
                    if (e11.moveToFirst()) {
                        long j12 = e11.getLong(d10);
                        UUID uuid2 = this.__converters.toUuid(e11.isNull(d11) ? null : e11.getString(d11));
                        if (uuid2 != null) {
                            int i20 = e11.getInt(d12);
                            UUID uuid3 = this.__converters.toUuid(e11.isNull(d13) ? null : e11.getString(d13));
                            if (uuid3 != null) {
                                String string = e11.getString(d14);
                                Instant instant = this.__converters.toInstant(e11.isNull(d15) ? null : Long.valueOf(e11.getLong(d15)));
                                if (instant != null) {
                                    Instant instant2 = this.__converters.toInstant(e11.isNull(d16) ? null : Long.valueOf(e11.getLong(d16)));
                                    if (instant2 != null) {
                                        SceneState state = this.__converters.toState(e11.getString(d17));
                                        int i21 = e11.getInt(d18);
                                        int i22 = i18;
                                        Manifest manifest = this.__converters.toManifest(e11.isNull(i22) ? null : e11.getString(i22));
                                        int i23 = i19;
                                        if (e11.isNull(i23)) {
                                            i10 = i17;
                                            str = null;
                                        } else {
                                            str = e11.getString(i23);
                                            i10 = i17;
                                        }
                                        if (e11.getInt(i10) != 0) {
                                            i11 = i14;
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                            i11 = i14;
                                        }
                                        UUID uuid4 = this.__converters.toUuid(e11.isNull(i11) ? null : e11.getString(i11));
                                        if (e11.getInt(d23) != 0) {
                                            i12 = d24;
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                            i12 = d24;
                                        }
                                        Instant instant3 = this.__converters.toInstant(e11.isNull(i12) ? null : Long.valueOf(e11.getLong(i12)));
                                        int i24 = d25;
                                        UUID uuid5 = this.__converters.toUuid(e11.isNull(i24) ? null : e11.getString(i24));
                                        int i25 = e11.getInt(d26);
                                        int i26 = d27;
                                        RoomType roomType = this.__converters.toRoomType(e11.isNull(i26) ? null : e11.getString(i26));
                                        int i27 = d28;
                                        UUID uuid6 = this.__converters.toUuid(e11.isNull(i27) ? null : e11.getString(i27));
                                        int i28 = d29;
                                        databaseSceneWithEntities = new DatabaseSceneWithEntities(new DatabaseScene(j12, uuid2, i20, uuid3, string, instant, instant2, state, i21, manifest, str, z10, uuid4, z11, instant3, uuid5, i25, roomType, uuid6, e11.isNull(i28) ? null : e11.getString(i28)), (ArrayList) yVar.d(e11.getLong(d10)), (ArrayList) yVar2.d(e11.getLong(d10)));
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    } else {
                        databaseSceneWithEntities = null;
                    }
                    this.__db.setTransactionSuccessful();
                    e11.close();
                    b10.h();
                    return databaseSceneWithEntities;
                } catch (Throwable th2) {
                    th = th2;
                    e11.close();
                    b10.h();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                b10 = e10;
                e11.close();
                b10.h();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    public F<Integer> roomsReadyCount(SceneState sceneState) {
        final B e10 = B.e("SELECT COUNT(*) FROM DatabaseScene WHERE state = ? AND compositionCount=0", 1);
        e10.H(1, this.__converters.fromState(sceneState));
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseScene"}, true, new Callable<Integer>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public Integer call() {
                Cursor e10;
                DatabaseSceneDao_Impl.this.__db.beginTransaction();
                try {
                    Integer num = null;
                    e10 = b.e(DatabaseSceneDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                    if (e10.moveToFirst()) {
                        if (!e10.isNull(0)) {
                            num = Integer.valueOf(e10.getInt(0));
                        }
                    }
                    DatabaseSceneDao_Impl.this.__db.setTransactionSuccessful();
                    e10.close();
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    return num;
                } catch (Throwable th2) {
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    throw th2;
                }
            }
        });
    }

    public int updateState(SceneState sceneState, Instant instant, long... jArr) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder b10 = e.b();
        b10.append("UPDATE DatabaseScene SET state = ");
        b10.append("?");
        b10.append(", lastModifiedTs = ");
        b10.append("?");
        b10.append(" WHERE id IN (");
        e.a(b10, jArr.length);
        b10.append(")");
        k compileStatement = this.__db.compileStatement(b10.toString());
        compileStatement.H(1, this.__converters.fromState(sceneState));
        Long fromInstant = this.__converters.fromInstant(instant);
        if (fromInstant == null) {
            compileStatement.I2(2);
        } else {
            compileStatement.i2(2, fromInstant.longValue());
        }
        int i10 = 3;
        for (long i22 : jArr) {
            compileStatement.i2(i10, i22);
            i10++;
        }
        this.__db.beginTransaction();
        try {
            int b02 = compileStatement.b0();
            this.__db.setTransactionSuccessful();
            return b02;
        } finally {
            this.__db.endTransaction();
        }
    }

    public int delete(DatabaseScene... databaseSceneArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            int handleMultiple = this.__deletionAdapterOfDatabaseScene.handleMultiple((T[]) databaseSceneArr);
            this.__db.setTransactionSuccessful();
            return handleMultiple;
        } finally {
            this.__db.endTransaction();
        }
    }

    public void update(DatabaseScene databaseScene) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfDatabaseScene.handle(databaseScene);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public F<List<DatabaseSceneWithEntities>> getWithEntities(List<? extends SceneState> list) {
        StringBuilder b10 = e.b();
        b10.append("select * from DatabaseScene where state in (");
        int size = list.size();
        e.a(b10, size);
        b10.append(") order by createdTs DESC");
        final B e10 = B.e(b10.toString(), size);
        int i10 = 1;
        for (SceneState fromState : list) {
            e10.H(i10, this.__converters.fromState(fromState));
            i10++;
        }
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseMedia", "DatabaseMetadata", "DatabaseScene"}, true, new Callable<List<DatabaseSceneWithEntities>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public List<DatabaseSceneWithEntities> call() {
                Cursor e10;
                String str;
                int i10;
                String str2;
                Long l10;
                Long l11;
                String str3;
                String str4;
                int i11;
                int i12;
                int i13;
                String str5;
                boolean z10;
                int i14;
                int i15;
                int i16;
                Long l12;
                String str6;
                int i17;
                int i18;
                String str7;
                String str8;
                String str9;
                int i19;
                DatabaseSceneDao_Impl.this.__db.beginTransaction();
                try {
                    e10 = b.e(DatabaseSceneDao_Impl.this.__db, e10, true, (CancellationSignal) null);
                    int d10 = a.d(e10, "id");
                    int d11 = a.d(e10, "uuid");
                    int d12 = a.d(e10, "sceneId");
                    int d13 = a.d(e10, "sceneUuid");
                    int d14 = a.d(e10, "name");
                    int d15 = a.d(e10, "createdTs");
                    int d16 = a.d(e10, "lastModifiedTs");
                    int d17 = a.d(e10, "state");
                    int d18 = a.d(e10, "compositionCount");
                    int d19 = a.d(e10, "manifest");
                    int d20 = a.d(e10, "glbUrl");
                    int d21 = a.d(e10, "isStock");
                    int d22 = a.d(e10, "uploadWorkerId");
                    int d23 = a.d(e10, "userAcknowledged");
                    int d24 = a.d(e10, "estimatedFinishTs");
                    int d25 = a.d(e10, "upload");
                    int d26 = a.d(e10, "wid");
                    int d27 = a.d(e10, "roomType");
                    int d28 = a.d(e10, "jobId");
                    int d29 = a.d(e10, "pipelineType");
                    C5468y yVar = new C5468y();
                    int i20 = d22;
                    C5468y yVar2 = new C5468y();
                    while (e10.moveToNext()) {
                        int i21 = d20;
                        int i22 = d21;
                        long j10 = e10.getLong(d10);
                        if (!yVar.c(j10)) {
                            i19 = d19;
                            yVar.k(j10, new ArrayList());
                        } else {
                            i19 = d19;
                        }
                        long j11 = e10.getLong(d10);
                        if (!yVar2.c(j11)) {
                            yVar2.k(j11, new ArrayList());
                        }
                        d20 = i21;
                        d21 = i22;
                        d19 = i19;
                    }
                    int i23 = d19;
                    int i24 = d20;
                    int i25 = d21;
                    e10.moveToPosition(-1);
                    DatabaseSceneDao_Impl.this.__fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
                    DatabaseSceneDao_Impl.this.__fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar2);
                    ArrayList arrayList = new ArrayList(e10.getCount());
                    while (e10.moveToNext()) {
                        long j12 = e10.getLong(d10);
                        if (e10.isNull(d11)) {
                            str = null;
                        } else {
                            str = e10.getString(d11);
                        }
                        UUID uuid = DatabaseSceneDao_Impl.this.__converters.toUuid(str);
                        if (uuid != null) {
                            int i26 = e10.getInt(d12);
                            if (e10.isNull(d13)) {
                                i10 = d11;
                                str2 = null;
                            } else {
                                str2 = e10.getString(d13);
                                i10 = d11;
                            }
                            UUID uuid2 = DatabaseSceneDao_Impl.this.__converters.toUuid(str2);
                            if (uuid2 != null) {
                                String string = e10.getString(d14);
                                if (e10.isNull(d15)) {
                                    l10 = null;
                                } else {
                                    l10 = Long.valueOf(e10.getLong(d15));
                                }
                                Instant instant = DatabaseSceneDao_Impl.this.__converters.toInstant(l10);
                                if (instant != null) {
                                    if (e10.isNull(d16)) {
                                        l11 = null;
                                    } else {
                                        l11 = Long.valueOf(e10.getLong(d16));
                                    }
                                    Instant instant2 = DatabaseSceneDao_Impl.this.__converters.toInstant(l11);
                                    if (instant2 != null) {
                                        SceneState state = DatabaseSceneDao_Impl.this.__converters.toState(e10.getString(d17));
                                        int i27 = e10.getInt(d18);
                                        int i28 = i23;
                                        if (e10.isNull(i28)) {
                                            str3 = null;
                                        } else {
                                            str3 = e10.getString(i28);
                                        }
                                        Manifest manifest = DatabaseSceneDao_Impl.this.__converters.toManifest(str3);
                                        int i29 = i24;
                                        if (e10.isNull(i29)) {
                                            i11 = i25;
                                            str4 = null;
                                        } else {
                                            str4 = e10.getString(i29);
                                            i11 = i25;
                                        }
                                        i23 = i28;
                                        int i30 = i20;
                                        boolean z11 = e10.getInt(i11) != 0;
                                        if (e10.isNull(i30)) {
                                            i12 = i30;
                                            i13 = d12;
                                            str5 = null;
                                        } else {
                                            i12 = i30;
                                            str5 = e10.getString(i30);
                                            i13 = d12;
                                        }
                                        UUID uuid3 = DatabaseSceneDao_Impl.this.__converters.toUuid(str5);
                                        int i31 = d23;
                                        if (e10.getInt(i31) != 0) {
                                            i14 = d24;
                                            z10 = true;
                                        } else {
                                            i14 = d24;
                                            z10 = false;
                                        }
                                        if (e10.isNull(i14)) {
                                            i15 = i31;
                                            i16 = i14;
                                            l12 = null;
                                        } else {
                                            i15 = i31;
                                            l12 = Long.valueOf(e10.getLong(i14));
                                            i16 = i14;
                                        }
                                        Instant instant3 = DatabaseSceneDao_Impl.this.__converters.toInstant(l12);
                                        int i32 = d25;
                                        if (e10.isNull(i32)) {
                                            d25 = i32;
                                            str6 = null;
                                        } else {
                                            str6 = e10.getString(i32);
                                            d25 = i32;
                                        }
                                        UUID uuid4 = DatabaseSceneDao_Impl.this.__converters.toUuid(str6);
                                        int i33 = d26;
                                        int i34 = e10.getInt(i33);
                                        int i35 = d27;
                                        if (e10.isNull(i35)) {
                                            i17 = i33;
                                            i18 = i35;
                                            str7 = null;
                                        } else {
                                            i17 = i33;
                                            str7 = e10.getString(i35);
                                            i18 = i35;
                                        }
                                        RoomType roomType = DatabaseSceneDao_Impl.this.__converters.toRoomType(str7);
                                        int i36 = d28;
                                        if (e10.isNull(i36)) {
                                            d28 = i36;
                                            str8 = null;
                                        } else {
                                            str8 = e10.getString(i36);
                                            d28 = i36;
                                        }
                                        UUID uuid5 = DatabaseSceneDao_Impl.this.__converters.toUuid(str8);
                                        int i37 = d29;
                                        if (e10.isNull(i37)) {
                                            str9 = null;
                                        } else {
                                            str9 = e10.getString(i37);
                                        }
                                        arrayList.add(new DatabaseSceneWithEntities(new DatabaseScene(j12, uuid, i26, uuid2, string, instant, instant2, state, i27, manifest, str4, z11, uuid3, z10, instant3, uuid4, i34, roomType, uuid5, str9), (ArrayList) yVar.d(e10.getLong(d10)), (ArrayList) yVar2.d(e10.getLong(d10))));
                                        yVar = yVar;
                                        d13 = d13;
                                        d12 = i13;
                                        i20 = i12;
                                        d14 = d14;
                                        d29 = i37;
                                        d11 = i10;
                                        i24 = i29;
                                        i25 = i11;
                                        int i38 = i15;
                                        d24 = i16;
                                        d23 = i38;
                                        int i39 = i17;
                                        d27 = i18;
                                        d26 = i39;
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    }
                    DatabaseSceneDao_Impl.this.__db.setTransactionSuccessful();
                    e10.close();
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    throw th2;
                }
            }
        });
    }

    public long insert(DatabaseScene databaseScene) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfDatabaseScene.insertAndReturnId(databaseScene);
            this.__db.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    public F<Integer> roomsReadyCount(int i10, Instant instant, SceneState sceneState) {
        final B e10 = B.e("SELECT COUNT(*) FROM DatabaseScene WHERE state = ? AND wid in (?, 0) AND lastModifiedTs > ? AND compositionCount=0", 3);
        e10.H(1, this.__converters.fromState(sceneState));
        e10.i2(2, (long) i10);
        Long fromInstant = this.__converters.fromInstant(instant);
        if (fromInstant == null) {
            e10.I2(3);
        } else {
            e10.i2(3, fromInstant.longValue());
        }
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseScene"}, true, new Callable<Integer>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public Integer call() {
                Cursor e10;
                DatabaseSceneDao_Impl.this.__db.beginTransaction();
                try {
                    Integer num = null;
                    e10 = b.e(DatabaseSceneDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                    if (e10.moveToFirst()) {
                        if (!e10.isNull(0)) {
                            num = Integer.valueOf(e10.getInt(0));
                        }
                    }
                    DatabaseSceneDao_Impl.this.__db.setTransactionSuccessful();
                    e10.close();
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    return num;
                } catch (Throwable th2) {
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    throw th2;
                }
            }
        });
    }

    public void delete(long... jArr) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder b10 = e.b();
        b10.append("DELETE FROM DatabaseScene WHERE id IN (");
        e.a(b10, jArr.length);
        b10.append(")");
        k compileStatement = this.__db.compileStatement(b10.toString());
        int i10 = 1;
        for (long i22 : jArr) {
            compileStatement.i2(i10, i22);
            i10++;
        }
        this.__db.beginTransaction();
        try {
            compileStatement.b0();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void update(List<? extends DatabaseScene> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfDatabaseScene.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<Long> insert(DatabaseScene... databaseSceneArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.__insertionAdapterOfDatabaseScene.insertAndReturnIdsList((T[]) databaseSceneArr);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }

    public F<List<DatabaseSceneWithEntities>> getWithEntities(List<? extends SceneState> list, int i10) {
        StringBuilder b10 = e.b();
        b10.append("select * from DatabaseScene where state in (");
        int size = list.size();
        e.a(b10, size);
        b10.append(") AND (wid in (");
        b10.append("?");
        b10.append(", 0) OR isStock) order by createdTs DESC");
        int i11 = size + 1;
        final B e10 = B.e(b10.toString(), i11);
        int i12 = 1;
        for (SceneState fromState : list) {
            e10.H(i12, this.__converters.fromState(fromState));
            i12++;
        }
        e10.i2(i11, (long) i10);
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseMedia", "DatabaseMetadata", "DatabaseScene"}, true, new Callable<List<DatabaseSceneWithEntities>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public List<DatabaseSceneWithEntities> call() {
                Cursor e10;
                String str;
                int i10;
                String str2;
                Long l10;
                Long l11;
                String str3;
                String str4;
                int i11;
                int i12;
                int i13;
                String str5;
                boolean z10;
                int i14;
                int i15;
                int i16;
                Long l12;
                String str6;
                int i17;
                int i18;
                String str7;
                String str8;
                String str9;
                int i19;
                DatabaseSceneDao_Impl.this.__db.beginTransaction();
                try {
                    e10 = b.e(DatabaseSceneDao_Impl.this.__db, e10, true, (CancellationSignal) null);
                    int d10 = a.d(e10, "id");
                    int d11 = a.d(e10, "uuid");
                    int d12 = a.d(e10, "sceneId");
                    int d13 = a.d(e10, "sceneUuid");
                    int d14 = a.d(e10, "name");
                    int d15 = a.d(e10, "createdTs");
                    int d16 = a.d(e10, "lastModifiedTs");
                    int d17 = a.d(e10, "state");
                    int d18 = a.d(e10, "compositionCount");
                    int d19 = a.d(e10, "manifest");
                    int d20 = a.d(e10, "glbUrl");
                    int d21 = a.d(e10, "isStock");
                    int d22 = a.d(e10, "uploadWorkerId");
                    int d23 = a.d(e10, "userAcknowledged");
                    int d24 = a.d(e10, "estimatedFinishTs");
                    int d25 = a.d(e10, "upload");
                    int d26 = a.d(e10, "wid");
                    int d27 = a.d(e10, "roomType");
                    int d28 = a.d(e10, "jobId");
                    int d29 = a.d(e10, "pipelineType");
                    C5468y yVar = new C5468y();
                    int i20 = d22;
                    C5468y yVar2 = new C5468y();
                    while (e10.moveToNext()) {
                        int i21 = d20;
                        int i22 = d21;
                        long j10 = e10.getLong(d10);
                        if (!yVar.c(j10)) {
                            i19 = d19;
                            yVar.k(j10, new ArrayList());
                        } else {
                            i19 = d19;
                        }
                        long j11 = e10.getLong(d10);
                        if (!yVar2.c(j11)) {
                            yVar2.k(j11, new ArrayList());
                        }
                        d20 = i21;
                        d21 = i22;
                        d19 = i19;
                    }
                    int i23 = d19;
                    int i24 = d20;
                    int i25 = d21;
                    e10.moveToPosition(-1);
                    DatabaseSceneDao_Impl.this.__fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
                    DatabaseSceneDao_Impl.this.__fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar2);
                    ArrayList arrayList = new ArrayList(e10.getCount());
                    while (e10.moveToNext()) {
                        long j12 = e10.getLong(d10);
                        if (e10.isNull(d11)) {
                            str = null;
                        } else {
                            str = e10.getString(d11);
                        }
                        UUID uuid = DatabaseSceneDao_Impl.this.__converters.toUuid(str);
                        if (uuid != null) {
                            int i26 = e10.getInt(d12);
                            if (e10.isNull(d13)) {
                                i10 = d11;
                                str2 = null;
                            } else {
                                str2 = e10.getString(d13);
                                i10 = d11;
                            }
                            UUID uuid2 = DatabaseSceneDao_Impl.this.__converters.toUuid(str2);
                            if (uuid2 != null) {
                                String string = e10.getString(d14);
                                if (e10.isNull(d15)) {
                                    l10 = null;
                                } else {
                                    l10 = Long.valueOf(e10.getLong(d15));
                                }
                                Instant instant = DatabaseSceneDao_Impl.this.__converters.toInstant(l10);
                                if (instant != null) {
                                    if (e10.isNull(d16)) {
                                        l11 = null;
                                    } else {
                                        l11 = Long.valueOf(e10.getLong(d16));
                                    }
                                    Instant instant2 = DatabaseSceneDao_Impl.this.__converters.toInstant(l11);
                                    if (instant2 != null) {
                                        SceneState state = DatabaseSceneDao_Impl.this.__converters.toState(e10.getString(d17));
                                        int i27 = e10.getInt(d18);
                                        int i28 = i23;
                                        if (e10.isNull(i28)) {
                                            str3 = null;
                                        } else {
                                            str3 = e10.getString(i28);
                                        }
                                        Manifest manifest = DatabaseSceneDao_Impl.this.__converters.toManifest(str3);
                                        int i29 = i24;
                                        if (e10.isNull(i29)) {
                                            i11 = i25;
                                            str4 = null;
                                        } else {
                                            str4 = e10.getString(i29);
                                            i11 = i25;
                                        }
                                        i23 = i28;
                                        int i30 = i20;
                                        boolean z11 = e10.getInt(i11) != 0;
                                        if (e10.isNull(i30)) {
                                            i12 = i30;
                                            i13 = d12;
                                            str5 = null;
                                        } else {
                                            i12 = i30;
                                            str5 = e10.getString(i30);
                                            i13 = d12;
                                        }
                                        UUID uuid3 = DatabaseSceneDao_Impl.this.__converters.toUuid(str5);
                                        int i31 = d23;
                                        if (e10.getInt(i31) != 0) {
                                            i14 = d24;
                                            z10 = true;
                                        } else {
                                            i14 = d24;
                                            z10 = false;
                                        }
                                        if (e10.isNull(i14)) {
                                            i15 = i31;
                                            i16 = i14;
                                            l12 = null;
                                        } else {
                                            i15 = i31;
                                            l12 = Long.valueOf(e10.getLong(i14));
                                            i16 = i14;
                                        }
                                        Instant instant3 = DatabaseSceneDao_Impl.this.__converters.toInstant(l12);
                                        int i32 = d25;
                                        if (e10.isNull(i32)) {
                                            d25 = i32;
                                            str6 = null;
                                        } else {
                                            str6 = e10.getString(i32);
                                            d25 = i32;
                                        }
                                        UUID uuid4 = DatabaseSceneDao_Impl.this.__converters.toUuid(str6);
                                        int i33 = d26;
                                        int i34 = e10.getInt(i33);
                                        int i35 = d27;
                                        if (e10.isNull(i35)) {
                                            i17 = i33;
                                            i18 = i35;
                                            str7 = null;
                                        } else {
                                            i17 = i33;
                                            str7 = e10.getString(i35);
                                            i18 = i35;
                                        }
                                        RoomType roomType = DatabaseSceneDao_Impl.this.__converters.toRoomType(str7);
                                        int i36 = d28;
                                        if (e10.isNull(i36)) {
                                            d28 = i36;
                                            str8 = null;
                                        } else {
                                            str8 = e10.getString(i36);
                                            d28 = i36;
                                        }
                                        UUID uuid5 = DatabaseSceneDao_Impl.this.__converters.toUuid(str8);
                                        int i37 = d29;
                                        if (e10.isNull(i37)) {
                                            str9 = null;
                                        } else {
                                            str9 = e10.getString(i37);
                                        }
                                        arrayList.add(new DatabaseSceneWithEntities(new DatabaseScene(j12, uuid, i26, uuid2, string, instant, instant2, state, i27, manifest, str4, z11, uuid3, z10, instant3, uuid4, i34, roomType, uuid5, str9), (ArrayList) yVar.d(e10.getLong(d10)), (ArrayList) yVar2.d(e10.getLong(d10))));
                                        yVar = yVar;
                                        d13 = d13;
                                        d12 = i13;
                                        i20 = i12;
                                        d14 = d14;
                                        d29 = i37;
                                        d11 = i10;
                                        i24 = i29;
                                        i25 = i11;
                                        int i38 = i15;
                                        d24 = i16;
                                        d23 = i38;
                                        int i39 = i17;
                                        d27 = i18;
                                        d26 = i39;
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    }
                    DatabaseSceneDao_Impl.this.__db.setTransactionSuccessful();
                    e10.close();
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    throw th2;
                }
            }
        });
    }

    public List<Long> insert(List<? extends DatabaseScene> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.__insertionAdapterOfDatabaseScene.insertAndReturnIdsList(list);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }

    public boolean exists(UUID uuid) {
        Cursor e10;
        boolean z10 = true;
        B e11 = B.e("SELECT EXISTS(SELECT * FROM DatabaseScene WHERE uuid = ?)", 1);
        String fromUuid = this.__converters.fromUuid(uuid);
        if (fromUuid == null) {
            e11.I2(1);
        } else {
            e11.H(1, fromUuid);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            boolean z11 = false;
            e10 = b.e(this.__db, e11, false, (CancellationSignal) null);
            if (e10.moveToFirst()) {
                if (e10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            this.__db.setTransactionSuccessful();
            e10.close();
            e11.h();
            this.__db.endTransaction();
            return z11;
        } catch (Throwable th2) {
            this.__db.endTransaction();
            throw th2;
        }
    }

    public int delete(int... iArr) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder b10 = e.b();
        b10.append("DELETE FROM DatabaseScene WHERE sceneId IN (");
        e.a(b10, iArr.length);
        b10.append(")");
        k compileStatement = this.__db.compileStatement(b10.toString());
        int i10 = 1;
        for (int i11 : iArr) {
            compileStatement.i2(i10, (long) i11);
            i10++;
        }
        this.__db.beginTransaction();
        try {
            int b02 = compileStatement.b0();
            this.__db.setTransactionSuccessful();
            return b02;
        } finally {
            this.__db.endTransaction();
        }
    }

    public int updateState(SceneState sceneState, Instant instant, UUID... uuidArr) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder b10 = e.b();
        b10.append("UPDATE DatabaseScene SET state = ");
        b10.append("?");
        b10.append(", lastModifiedTs = ");
        b10.append("?");
        b10.append(" WHERE uuid IN (");
        e.a(b10, uuidArr.length);
        b10.append(")");
        k compileStatement = this.__db.compileStatement(b10.toString());
        compileStatement.H(1, this.__converters.fromState(sceneState));
        Long fromInstant = this.__converters.fromInstant(instant);
        if (fromInstant == null) {
            compileStatement.I2(2);
        } else {
            compileStatement.i2(2, fromInstant.longValue());
        }
        int i10 = 3;
        for (UUID fromUuid : uuidArr) {
            String fromUuid2 = this.__converters.fromUuid(fromUuid);
            if (fromUuid2 == null) {
                compileStatement.I2(i10);
            } else {
                compileStatement.H(i10, fromUuid2);
            }
            i10++;
        }
        this.__db.beginTransaction();
        try {
            int b02 = compileStatement.b0();
            this.__db.setTransactionSuccessful();
            return b02;
        } finally {
            this.__db.endTransaction();
        }
    }

    public F<DatabaseSceneWithEntities> getWithEntities(UUID uuid) {
        final B e10 = B.e("SELECT * from DatabaseScene WHERE sceneUuid = ?", 1);
        String fromUuid = this.__converters.fromUuid(uuid);
        if (fromUuid == null) {
            e10.I2(1);
        } else {
            e10.H(1, fromUuid);
        }
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseMedia", "DatabaseMetadata", "DatabaseScene"}, true, new Callable<DatabaseSceneWithEntities>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public DatabaseSceneWithEntities call() {
                Cursor e10;
                DatabaseSceneWithEntities databaseSceneWithEntities;
                String str;
                String str2;
                Long l10;
                Long l11;
                String str3;
                String str4;
                int i10;
                boolean z10;
                int i11;
                String str5;
                boolean z11;
                int i12;
                Long l12;
                String str6;
                String str7;
                String str8;
                String str9;
                int i13;
                DatabaseSceneDao_Impl.this.__db.beginTransaction();
                try {
                    e10 = b.e(DatabaseSceneDao_Impl.this.__db, e10, true, (CancellationSignal) null);
                    int d10 = a.d(e10, "id");
                    int d11 = a.d(e10, "uuid");
                    int d12 = a.d(e10, "sceneId");
                    int d13 = a.d(e10, "sceneUuid");
                    int d14 = a.d(e10, "name");
                    int d15 = a.d(e10, "createdTs");
                    int d16 = a.d(e10, "lastModifiedTs");
                    int d17 = a.d(e10, "state");
                    int d18 = a.d(e10, "compositionCount");
                    int d19 = a.d(e10, "manifest");
                    int d20 = a.d(e10, "glbUrl");
                    int d21 = a.d(e10, "isStock");
                    int d22 = a.d(e10, "uploadWorkerId");
                    int d23 = a.d(e10, "userAcknowledged");
                    int d24 = a.d(e10, "estimatedFinishTs");
                    int d25 = a.d(e10, "upload");
                    int d26 = a.d(e10, "wid");
                    int d27 = a.d(e10, "roomType");
                    int d28 = a.d(e10, "jobId");
                    int d29 = a.d(e10, "pipelineType");
                    C5468y yVar = new C5468y();
                    int i14 = d22;
                    C5468y yVar2 = new C5468y();
                    while (e10.moveToNext()) {
                        int i15 = d20;
                        int i16 = d21;
                        long j10 = e10.getLong(d10);
                        if (!yVar.c(j10)) {
                            i13 = d19;
                            yVar.k(j10, new ArrayList());
                        } else {
                            i13 = d19;
                        }
                        long j11 = e10.getLong(d10);
                        if (!yVar2.c(j11)) {
                            yVar2.k(j11, new ArrayList());
                        }
                        d20 = i15;
                        d21 = i16;
                        d19 = i13;
                    }
                    int i17 = d19;
                    int i18 = d20;
                    int i19 = d21;
                    e10.moveToPosition(-1);
                    DatabaseSceneDao_Impl.this.__fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
                    DatabaseSceneDao_Impl.this.__fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar2);
                    if (e10.moveToFirst()) {
                        long j12 = e10.getLong(d10);
                        if (e10.isNull(d11)) {
                            str = null;
                        } else {
                            str = e10.getString(d11);
                        }
                        UUID uuid = DatabaseSceneDao_Impl.this.__converters.toUuid(str);
                        if (uuid != null) {
                            int i20 = e10.getInt(d12);
                            if (e10.isNull(d13)) {
                                str2 = null;
                            } else {
                                str2 = e10.getString(d13);
                            }
                            UUID uuid2 = DatabaseSceneDao_Impl.this.__converters.toUuid(str2);
                            if (uuid2 != null) {
                                String string = e10.getString(d14);
                                if (e10.isNull(d15)) {
                                    l10 = null;
                                } else {
                                    l10 = Long.valueOf(e10.getLong(d15));
                                }
                                Instant instant = DatabaseSceneDao_Impl.this.__converters.toInstant(l10);
                                if (instant != null) {
                                    if (e10.isNull(d16)) {
                                        l11 = null;
                                    } else {
                                        l11 = Long.valueOf(e10.getLong(d16));
                                    }
                                    Instant instant2 = DatabaseSceneDao_Impl.this.__converters.toInstant(l11);
                                    if (instant2 != null) {
                                        SceneState state = DatabaseSceneDao_Impl.this.__converters.toState(e10.getString(d17));
                                        int i21 = e10.getInt(d18);
                                        int i22 = i17;
                                        if (e10.isNull(i22)) {
                                            str3 = null;
                                        } else {
                                            str3 = e10.getString(i22);
                                        }
                                        Manifest manifest = DatabaseSceneDao_Impl.this.__converters.toManifest(str3);
                                        int i23 = i18;
                                        if (e10.isNull(i23)) {
                                            i10 = i19;
                                            str4 = null;
                                        } else {
                                            str4 = e10.getString(i23);
                                            i10 = i19;
                                        }
                                        if (e10.getInt(i10) != 0) {
                                            i11 = i14;
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                            i11 = i14;
                                        }
                                        if (e10.isNull(i11)) {
                                            str5 = null;
                                        } else {
                                            str5 = e10.getString(i11);
                                        }
                                        UUID uuid3 = DatabaseSceneDao_Impl.this.__converters.toUuid(str5);
                                        if (e10.getInt(d23) != 0) {
                                            i12 = d24;
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                            i12 = d24;
                                        }
                                        if (e10.isNull(i12)) {
                                            l12 = null;
                                        } else {
                                            l12 = Long.valueOf(e10.getLong(i12));
                                        }
                                        Instant instant3 = DatabaseSceneDao_Impl.this.__converters.toInstant(l12);
                                        int i24 = d25;
                                        if (e10.isNull(i24)) {
                                            str6 = null;
                                        } else {
                                            str6 = e10.getString(i24);
                                        }
                                        UUID uuid4 = DatabaseSceneDao_Impl.this.__converters.toUuid(str6);
                                        int i25 = e10.getInt(d26);
                                        int i26 = d27;
                                        if (e10.isNull(i26)) {
                                            str7 = null;
                                        } else {
                                            str7 = e10.getString(i26);
                                        }
                                        RoomType roomType = DatabaseSceneDao_Impl.this.__converters.toRoomType(str7);
                                        int i27 = d28;
                                        if (e10.isNull(i27)) {
                                            str8 = null;
                                        } else {
                                            str8 = e10.getString(i27);
                                        }
                                        UUID uuid5 = DatabaseSceneDao_Impl.this.__converters.toUuid(str8);
                                        int i28 = d29;
                                        if (e10.isNull(i28)) {
                                            str9 = null;
                                        } else {
                                            str9 = e10.getString(i28);
                                        }
                                        databaseSceneWithEntities = new DatabaseSceneWithEntities(new DatabaseScene(j12, uuid, i20, uuid2, string, instant, instant2, state, i21, manifest, str4, z10, uuid3, z11, instant3, uuid4, i25, roomType, uuid5, str9), (ArrayList) yVar.d(e10.getLong(d10)), (ArrayList) yVar2.d(e10.getLong(d10)));
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    } else {
                        databaseSceneWithEntities = null;
                    }
                    DatabaseSceneDao_Impl.this.__db.setTransactionSuccessful();
                    e10.close();
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    return databaseSceneWithEntities;
                } catch (Throwable th2) {
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    throw th2;
                }
            }
        });
    }

    public F<DatabaseSceneWithEntities> getWithEntities(int i10) {
        final B e10 = B.e("SELECT * from DatabaseScene WHERE sceneId = ?", 1);
        e10.i2(1, (long) i10);
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseMedia", "DatabaseMetadata", "DatabaseScene"}, true, new Callable<DatabaseSceneWithEntities>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public DatabaseSceneWithEntities call() {
                Cursor e10;
                DatabaseSceneWithEntities databaseSceneWithEntities;
                String str;
                String str2;
                Long l10;
                Long l11;
                String str3;
                String str4;
                int i10;
                boolean z10;
                int i11;
                String str5;
                boolean z11;
                int i12;
                Long l12;
                String str6;
                String str7;
                String str8;
                String str9;
                int i13;
                DatabaseSceneDao_Impl.this.__db.beginTransaction();
                try {
                    e10 = b.e(DatabaseSceneDao_Impl.this.__db, e10, true, (CancellationSignal) null);
                    int d10 = a.d(e10, "id");
                    int d11 = a.d(e10, "uuid");
                    int d12 = a.d(e10, "sceneId");
                    int d13 = a.d(e10, "sceneUuid");
                    int d14 = a.d(e10, "name");
                    int d15 = a.d(e10, "createdTs");
                    int d16 = a.d(e10, "lastModifiedTs");
                    int d17 = a.d(e10, "state");
                    int d18 = a.d(e10, "compositionCount");
                    int d19 = a.d(e10, "manifest");
                    int d20 = a.d(e10, "glbUrl");
                    int d21 = a.d(e10, "isStock");
                    int d22 = a.d(e10, "uploadWorkerId");
                    int d23 = a.d(e10, "userAcknowledged");
                    int d24 = a.d(e10, "estimatedFinishTs");
                    int d25 = a.d(e10, "upload");
                    int d26 = a.d(e10, "wid");
                    int d27 = a.d(e10, "roomType");
                    int d28 = a.d(e10, "jobId");
                    int d29 = a.d(e10, "pipelineType");
                    C5468y yVar = new C5468y();
                    int i14 = d22;
                    C5468y yVar2 = new C5468y();
                    while (e10.moveToNext()) {
                        int i15 = d20;
                        int i16 = d21;
                        long j10 = e10.getLong(d10);
                        if (!yVar.c(j10)) {
                            i13 = d19;
                            yVar.k(j10, new ArrayList());
                        } else {
                            i13 = d19;
                        }
                        long j11 = e10.getLong(d10);
                        if (!yVar2.c(j11)) {
                            yVar2.k(j11, new ArrayList());
                        }
                        d20 = i15;
                        d21 = i16;
                        d19 = i13;
                    }
                    int i17 = d19;
                    int i18 = d20;
                    int i19 = d21;
                    e10.moveToPosition(-1);
                    DatabaseSceneDao_Impl.this.__fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
                    DatabaseSceneDao_Impl.this.__fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar2);
                    if (e10.moveToFirst()) {
                        long j12 = e10.getLong(d10);
                        if (e10.isNull(d11)) {
                            str = null;
                        } else {
                            str = e10.getString(d11);
                        }
                        UUID uuid = DatabaseSceneDao_Impl.this.__converters.toUuid(str);
                        if (uuid != null) {
                            int i20 = e10.getInt(d12);
                            if (e10.isNull(d13)) {
                                str2 = null;
                            } else {
                                str2 = e10.getString(d13);
                            }
                            UUID uuid2 = DatabaseSceneDao_Impl.this.__converters.toUuid(str2);
                            if (uuid2 != null) {
                                String string = e10.getString(d14);
                                if (e10.isNull(d15)) {
                                    l10 = null;
                                } else {
                                    l10 = Long.valueOf(e10.getLong(d15));
                                }
                                Instant instant = DatabaseSceneDao_Impl.this.__converters.toInstant(l10);
                                if (instant != null) {
                                    if (e10.isNull(d16)) {
                                        l11 = null;
                                    } else {
                                        l11 = Long.valueOf(e10.getLong(d16));
                                    }
                                    Instant instant2 = DatabaseSceneDao_Impl.this.__converters.toInstant(l11);
                                    if (instant2 != null) {
                                        SceneState state = DatabaseSceneDao_Impl.this.__converters.toState(e10.getString(d17));
                                        int i21 = e10.getInt(d18);
                                        int i22 = i17;
                                        if (e10.isNull(i22)) {
                                            str3 = null;
                                        } else {
                                            str3 = e10.getString(i22);
                                        }
                                        Manifest manifest = DatabaseSceneDao_Impl.this.__converters.toManifest(str3);
                                        int i23 = i18;
                                        if (e10.isNull(i23)) {
                                            i10 = i19;
                                            str4 = null;
                                        } else {
                                            str4 = e10.getString(i23);
                                            i10 = i19;
                                        }
                                        if (e10.getInt(i10) != 0) {
                                            i11 = i14;
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                            i11 = i14;
                                        }
                                        if (e10.isNull(i11)) {
                                            str5 = null;
                                        } else {
                                            str5 = e10.getString(i11);
                                        }
                                        UUID uuid3 = DatabaseSceneDao_Impl.this.__converters.toUuid(str5);
                                        if (e10.getInt(d23) != 0) {
                                            i12 = d24;
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                            i12 = d24;
                                        }
                                        if (e10.isNull(i12)) {
                                            l12 = null;
                                        } else {
                                            l12 = Long.valueOf(e10.getLong(i12));
                                        }
                                        Instant instant3 = DatabaseSceneDao_Impl.this.__converters.toInstant(l12);
                                        int i24 = d25;
                                        if (e10.isNull(i24)) {
                                            str6 = null;
                                        } else {
                                            str6 = e10.getString(i24);
                                        }
                                        UUID uuid4 = DatabaseSceneDao_Impl.this.__converters.toUuid(str6);
                                        int i25 = e10.getInt(d26);
                                        int i26 = d27;
                                        if (e10.isNull(i26)) {
                                            str7 = null;
                                        } else {
                                            str7 = e10.getString(i26);
                                        }
                                        RoomType roomType = DatabaseSceneDao_Impl.this.__converters.toRoomType(str7);
                                        int i27 = d28;
                                        if (e10.isNull(i27)) {
                                            str8 = null;
                                        } else {
                                            str8 = e10.getString(i27);
                                        }
                                        UUID uuid5 = DatabaseSceneDao_Impl.this.__converters.toUuid(str8);
                                        int i28 = d29;
                                        if (e10.isNull(i28)) {
                                            str9 = null;
                                        } else {
                                            str9 = e10.getString(i28);
                                        }
                                        databaseSceneWithEntities = new DatabaseSceneWithEntities(new DatabaseScene(j12, uuid, i20, uuid2, string, instant, instant2, state, i21, manifest, str4, z10, uuid3, z11, instant3, uuid4, i25, roomType, uuid5, str9), (ArrayList) yVar.d(e10.getLong(d10)), (ArrayList) yVar2.d(e10.getLong(d10)));
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    } else {
                        databaseSceneWithEntities = null;
                    }
                    DatabaseSceneDao_Impl.this.__db.setTransactionSuccessful();
                    e10.close();
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    return databaseSceneWithEntities;
                } catch (Throwable th2) {
                    DatabaseSceneDao_Impl.this.__db.endTransaction();
                    throw th2;
                }
            }
        });
    }

    public int delete(UUID... uuidArr) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder b10 = e.b();
        b10.append("DELETE FROM DatabaseScene WHERE uuid IN (");
        e.a(b10, uuidArr.length);
        b10.append(")");
        k compileStatement = this.__db.compileStatement(b10.toString());
        int i10 = 1;
        for (UUID fromUuid : uuidArr) {
            String fromUuid2 = this.__converters.fromUuid(fromUuid);
            if (fromUuid2 == null) {
                compileStatement.I2(i10);
            } else {
                compileStatement.H(i10, fromUuid2);
            }
            i10++;
        }
        this.__db.beginTransaction();
        try {
            int b02 = compileStatement.b0();
            this.__db.setTransactionSuccessful();
            return b02;
        } finally {
            this.__db.endTransaction();
        }
    }

    public int updateState(SceneState sceneState, Instant instant, int... iArr) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder b10 = e.b();
        b10.append("UPDATE DatabaseScene SET state = ");
        b10.append("?");
        b10.append(", lastModifiedTs = ");
        b10.append("?");
        b10.append("  WHERE sceneId IN (");
        e.a(b10, iArr.length);
        b10.append(")");
        k compileStatement = this.__db.compileStatement(b10.toString());
        compileStatement.H(1, this.__converters.fromState(sceneState));
        Long fromInstant = this.__converters.fromInstant(instant);
        if (fromInstant == null) {
            compileStatement.I2(2);
        } else {
            compileStatement.i2(2, fromInstant.longValue());
        }
        int i10 = 3;
        for (int i11 : iArr) {
            compileStatement.i2(i10, (long) i11);
            i10++;
        }
        this.__db.beginTransaction();
        try {
            int b02 = compileStatement.b0();
            this.__db.setTransactionSuccessful();
            return b02;
        } finally {
            this.__db.endTransaction();
        }
    }

    public int delete(SceneState... sceneStateArr) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder b10 = e.b();
        b10.append("DELETE FROM DatabaseScene WHERE state IN (");
        e.a(b10, sceneStateArr.length);
        b10.append(")");
        k compileStatement = this.__db.compileStatement(b10.toString());
        int i10 = 1;
        for (SceneState fromState : sceneStateArr) {
            compileStatement.H(i10, this.__converters.fromState(fromState));
            i10++;
        }
        this.__db.beginTransaction();
        try {
            int b02 = compileStatement.b0();
            this.__db.setTransactionSuccessful();
            return b02;
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<DatabaseScene> get(SceneState sceneState) {
        B b10;
        int i10;
        String str;
        int i11;
        String str2;
        Long l10;
        Long l11;
        String str3;
        String str4;
        boolean z10;
        int i12;
        String str5;
        boolean z11;
        int i13;
        int i14;
        Long l12;
        String str6;
        String str7;
        String str8;
        String str9;
        B e10 = B.e("SELECT * FROM DatabaseScene WHERE state = ?", 1);
        e10.H(1, this.__converters.fromState(sceneState));
        this.__db.assertNotSuspendingTransaction();
        Cursor e11 = b.e(this.__db, e10, false, (CancellationSignal) null);
        try {
            int d10 = a.d(e11, "id");
            int d11 = a.d(e11, "uuid");
            int d12 = a.d(e11, "sceneId");
            int d13 = a.d(e11, "sceneUuid");
            int d14 = a.d(e11, "name");
            int d15 = a.d(e11, "createdTs");
            int d16 = a.d(e11, "lastModifiedTs");
            int d17 = a.d(e11, "state");
            int d18 = a.d(e11, "compositionCount");
            int d19 = a.d(e11, "manifest");
            int d20 = a.d(e11, "glbUrl");
            int d21 = a.d(e11, "isStock");
            int d22 = a.d(e11, "uploadWorkerId");
            b10 = e10;
            try {
                int d23 = a.d(e11, "userAcknowledged");
                int d24 = a.d(e11, "estimatedFinishTs");
                int d25 = a.d(e11, "upload");
                int d26 = a.d(e11, "wid");
                int d27 = a.d(e11, "roomType");
                int d28 = a.d(e11, "jobId");
                int d29 = a.d(e11, "pipelineType");
                int i15 = d22;
                ArrayList arrayList = new ArrayList(e11.getCount());
                while (e11.moveToNext()) {
                    long j10 = e11.getLong(d10);
                    if (e11.isNull(d11)) {
                        i10 = d10;
                        str = null;
                    } else {
                        str = e11.getString(d11);
                        i10 = d10;
                    }
                    UUID uuid = this.__converters.toUuid(str);
                    if (uuid != null) {
                        int i16 = e11.getInt(d12);
                        if (e11.isNull(d13)) {
                            i11 = d11;
                            str2 = null;
                        } else {
                            str2 = e11.getString(d13);
                            i11 = d11;
                        }
                        UUID uuid2 = this.__converters.toUuid(str2);
                        if (uuid2 != null) {
                            String string = e11.getString(d14);
                            if (e11.isNull(d15)) {
                                l10 = null;
                            } else {
                                l10 = Long.valueOf(e11.getLong(d15));
                            }
                            Instant instant = this.__converters.toInstant(l10);
                            if (instant != null) {
                                if (e11.isNull(d16)) {
                                    l11 = null;
                                } else {
                                    l11 = Long.valueOf(e11.getLong(d16));
                                }
                                Instant instant2 = this.__converters.toInstant(l11);
                                if (instant2 != null) {
                                    SceneState state = this.__converters.toState(e11.getString(d17));
                                    int i17 = e11.getInt(d18);
                                    if (e11.isNull(d19)) {
                                        str3 = null;
                                    } else {
                                        str3 = e11.getString(d19);
                                    }
                                    Manifest manifest = this.__converters.toManifest(str3);
                                    if (e11.isNull(d20)) {
                                        str4 = null;
                                    } else {
                                        str4 = e11.getString(d20);
                                    }
                                    if (e11.getInt(d21) != 0) {
                                        i12 = i15;
                                        z10 = true;
                                    } else {
                                        i12 = i15;
                                        z10 = false;
                                    }
                                    if (e11.isNull(i12)) {
                                        str5 = null;
                                    } else {
                                        str5 = e11.getString(i12);
                                    }
                                    UUID uuid3 = this.__converters.toUuid(str5);
                                    int i18 = d23;
                                    if (e11.getInt(i18) != 0) {
                                        i13 = d24;
                                        z11 = true;
                                    } else {
                                        i13 = d24;
                                        z11 = false;
                                    }
                                    if (e11.isNull(i13)) {
                                        i15 = i12;
                                        i14 = d20;
                                        l12 = null;
                                    } else {
                                        i15 = i12;
                                        l12 = Long.valueOf(e11.getLong(i13));
                                        i14 = d20;
                                    }
                                    Instant instant3 = this.__converters.toInstant(l12);
                                    int i19 = d25;
                                    if (e11.isNull(i19)) {
                                        d25 = i19;
                                        str6 = null;
                                    } else {
                                        str6 = e11.getString(i19);
                                        d25 = i19;
                                    }
                                    UUID uuid4 = this.__converters.toUuid(str6);
                                    int i20 = d26;
                                    int i21 = e11.getInt(i20);
                                    int i22 = d27;
                                    if (e11.isNull(i22)) {
                                        d26 = i20;
                                        d27 = i22;
                                        str7 = null;
                                    } else {
                                        d26 = i20;
                                        d27 = i22;
                                        str7 = e11.getString(i22);
                                    }
                                    RoomType roomType = this.__converters.toRoomType(str7);
                                    int i23 = d28;
                                    if (e11.isNull(i23)) {
                                        d28 = i23;
                                        str8 = null;
                                    } else {
                                        str8 = e11.getString(i23);
                                        d28 = i23;
                                    }
                                    UUID uuid5 = this.__converters.toUuid(str8);
                                    int i24 = d29;
                                    if (e11.isNull(i24)) {
                                        str9 = null;
                                    } else {
                                        str9 = e11.getString(i24);
                                    }
                                    arrayList.add(new DatabaseScene(j10, uuid, i16, uuid2, string, instant, instant2, state, i17, manifest, str4, z10, uuid3, z11, instant3, uuid4, i21, roomType, uuid5, str9));
                                    d29 = i24;
                                    d24 = i13;
                                    d20 = i14;
                                    d10 = i10;
                                    d11 = i11;
                                    d23 = i18;
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                    }
                }
                e11.close();
                b10.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                e11.close();
                b10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b10 = e10;
            e11.close();
            b10.h();
            throw th;
        }
    }

    public List<DatabaseSceneWithEntities> getWithEntitiesNow(int... iArr) {
        B b10;
        String str;
        int i10;
        String str2;
        Long l10;
        Long l11;
        String str3;
        String str4;
        int i11;
        int i12;
        int i13;
        String str5;
        boolean z10;
        int i14;
        int i15;
        int i16;
        Long l12;
        String str6;
        int i17;
        int i18;
        String str7;
        String str8;
        String str9;
        int i19;
        int[] iArr2 = iArr;
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM DatabaseScene WHERE sceneId IN (");
        int length = iArr2.length;
        e.a(b11, length);
        b11.append(")");
        B e10 = B.e(b11.toString(), length);
        int i20 = 1;
        for (int i21 : iArr2) {
            e10.i2(i20, (long) i21);
            i20++;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor e11 = b.e(this.__db, e10, true, (CancellationSignal) null);
            try {
                int d10 = a.d(e11, "id");
                int d11 = a.d(e11, "uuid");
                int d12 = a.d(e11, "sceneId");
                int d13 = a.d(e11, "sceneUuid");
                int d14 = a.d(e11, "name");
                int d15 = a.d(e11, "createdTs");
                int d16 = a.d(e11, "lastModifiedTs");
                int d17 = a.d(e11, "state");
                int d18 = a.d(e11, "compositionCount");
                int d19 = a.d(e11, "manifest");
                int d20 = a.d(e11, "glbUrl");
                int d21 = a.d(e11, "isStock");
                int d22 = a.d(e11, "uploadWorkerId");
                b10 = e10;
                try {
                    int d23 = a.d(e11, "userAcknowledged");
                    int d24 = a.d(e11, "estimatedFinishTs");
                    int d25 = a.d(e11, "upload");
                    int d26 = a.d(e11, "wid");
                    int d27 = a.d(e11, "roomType");
                    int d28 = a.d(e11, "jobId");
                    int d29 = a.d(e11, "pipelineType");
                    C5468y yVar = new C5468y();
                    int i22 = d22;
                    C5468y yVar2 = new C5468y();
                    while (e11.moveToNext()) {
                        int i23 = d20;
                        int i24 = d21;
                        long j10 = e11.getLong(d10);
                        if (!yVar.c(j10)) {
                            i19 = d19;
                            yVar.k(j10, new ArrayList());
                        } else {
                            i19 = d19;
                        }
                        long j11 = e11.getLong(d10);
                        if (!yVar2.c(j11)) {
                            yVar2.k(j11, new ArrayList());
                        }
                        d20 = i23;
                        d21 = i24;
                        d19 = i19;
                    }
                    int i25 = d20;
                    int i26 = d21;
                    int i27 = d19;
                    e11.moveToPosition(-1);
                    __fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
                    __fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar2);
                    ArrayList arrayList = new ArrayList(e11.getCount());
                    while (e11.moveToNext()) {
                        long j12 = e11.getLong(d10);
                        if (e11.isNull(d11)) {
                            str = null;
                        } else {
                            str = e11.getString(d11);
                        }
                        UUID uuid = this.__converters.toUuid(str);
                        if (uuid != null) {
                            int i28 = e11.getInt(d12);
                            if (e11.isNull(d13)) {
                                i10 = d11;
                                str2 = null;
                            } else {
                                str2 = e11.getString(d13);
                                i10 = d11;
                            }
                            UUID uuid2 = this.__converters.toUuid(str2);
                            if (uuid2 != null) {
                                String string = e11.getString(d14);
                                if (e11.isNull(d15)) {
                                    l10 = null;
                                } else {
                                    l10 = Long.valueOf(e11.getLong(d15));
                                }
                                Instant instant = this.__converters.toInstant(l10);
                                if (instant != null) {
                                    if (e11.isNull(d16)) {
                                        l11 = null;
                                    } else {
                                        l11 = Long.valueOf(e11.getLong(d16));
                                    }
                                    Instant instant2 = this.__converters.toInstant(l11);
                                    if (instant2 != null) {
                                        SceneState state = this.__converters.toState(e11.getString(d17));
                                        int i29 = e11.getInt(d18);
                                        int i30 = i27;
                                        if (e11.isNull(i30)) {
                                            str3 = null;
                                        } else {
                                            str3 = e11.getString(i30);
                                        }
                                        Manifest manifest = this.__converters.toManifest(str3);
                                        int i31 = i25;
                                        if (e11.isNull(i31)) {
                                            i11 = i26;
                                            str4 = null;
                                        } else {
                                            str4 = e11.getString(i31);
                                            i11 = i26;
                                        }
                                        i27 = i30;
                                        int i32 = i22;
                                        boolean z11 = e11.getInt(i11) != 0;
                                        if (e11.isNull(i32)) {
                                            i12 = i32;
                                            i13 = i31;
                                            str5 = null;
                                        } else {
                                            i12 = i32;
                                            str5 = e11.getString(i32);
                                            i13 = i31;
                                        }
                                        UUID uuid3 = this.__converters.toUuid(str5);
                                        int i33 = d23;
                                        if (e11.getInt(i33) != 0) {
                                            i14 = d24;
                                            z10 = true;
                                        } else {
                                            i14 = d24;
                                            z10 = false;
                                        }
                                        if (e11.isNull(i14)) {
                                            i15 = i33;
                                            i16 = i14;
                                            l12 = null;
                                        } else {
                                            i15 = i33;
                                            l12 = Long.valueOf(e11.getLong(i14));
                                            i16 = i14;
                                        }
                                        Instant instant3 = this.__converters.toInstant(l12);
                                        int i34 = d25;
                                        if (e11.isNull(i34)) {
                                            d25 = i34;
                                            str6 = null;
                                        } else {
                                            str6 = e11.getString(i34);
                                            d25 = i34;
                                        }
                                        UUID uuid4 = this.__converters.toUuid(str6);
                                        int i35 = d26;
                                        int i36 = e11.getInt(i35);
                                        int i37 = d27;
                                        if (e11.isNull(i37)) {
                                            i17 = i35;
                                            i18 = i37;
                                            str7 = null;
                                        } else {
                                            i17 = i35;
                                            str7 = e11.getString(i37);
                                            i18 = i37;
                                        }
                                        RoomType roomType = this.__converters.toRoomType(str7);
                                        int i38 = d28;
                                        if (e11.isNull(i38)) {
                                            d28 = i38;
                                            str8 = null;
                                        } else {
                                            str8 = e11.getString(i38);
                                            d28 = i38;
                                        }
                                        UUID uuid5 = this.__converters.toUuid(str8);
                                        int i39 = d29;
                                        if (e11.isNull(i39)) {
                                            str9 = null;
                                        } else {
                                            str9 = e11.getString(i39);
                                        }
                                        arrayList.add(new DatabaseSceneWithEntities(new DatabaseScene(j12, uuid, i28, uuid2, string, instant, instant2, state, i29, manifest, str4, z11, uuid3, z10, instant3, uuid4, i36, roomType, uuid5, str9), (ArrayList) yVar.d(e11.getLong(d10)), (ArrayList) yVar2.d(e11.getLong(d10))));
                                        d12 = d12;
                                        d13 = d13;
                                        d14 = d14;
                                        d11 = i10;
                                        d29 = i39;
                                        i26 = i11;
                                        int i40 = i15;
                                        d24 = i16;
                                        d23 = i40;
                                        int i41 = i17;
                                        d27 = i18;
                                        d26 = i41;
                                        int i42 = i12;
                                        i25 = i13;
                                        i22 = i42;
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    }
                    this.__db.setTransactionSuccessful();
                    e11.close();
                    b10.h();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    e11.close();
                    b10.h();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                b10 = e10;
                e11.close();
                b10.h();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    public DatabaseScene get(UUID uuid) {
        B b10;
        DatabaseScene databaseScene;
        String str;
        String str2;
        Long l10;
        Long l11;
        String str3;
        String str4;
        String str5;
        boolean z10;
        int i10;
        Long l12;
        String str6;
        String str7;
        String str8;
        String str9;
        B e10 = B.e("SELECT * FROM DatabaseScene WHERE uuid = ?", 1);
        String fromUuid = this.__converters.fromUuid(uuid);
        if (fromUuid == null) {
            e10.I2(1);
        } else {
            e10.H(1, fromUuid);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor e11 = b.e(this.__db, e10, false, (CancellationSignal) null);
        try {
            int d10 = a.d(e11, "id");
            int d11 = a.d(e11, "uuid");
            int d12 = a.d(e11, "sceneId");
            int d13 = a.d(e11, "sceneUuid");
            int d14 = a.d(e11, "name");
            int d15 = a.d(e11, "createdTs");
            int d16 = a.d(e11, "lastModifiedTs");
            int d17 = a.d(e11, "state");
            int d18 = a.d(e11, "compositionCount");
            int d19 = a.d(e11, "manifest");
            int d20 = a.d(e11, "glbUrl");
            int d21 = a.d(e11, "isStock");
            int d22 = a.d(e11, "uploadWorkerId");
            b10 = e10;
            try {
                int d23 = a.d(e11, "userAcknowledged");
                int d24 = a.d(e11, "estimatedFinishTs");
                int d25 = a.d(e11, "upload");
                int d26 = a.d(e11, "wid");
                int d27 = a.d(e11, "roomType");
                int d28 = a.d(e11, "jobId");
                int d29 = a.d(e11, "pipelineType");
                if (e11.moveToFirst()) {
                    long j10 = e11.getLong(d10);
                    if (e11.isNull(d11)) {
                        str = null;
                    } else {
                        str = e11.getString(d11);
                    }
                    UUID uuid2 = this.__converters.toUuid(str);
                    if (uuid2 != null) {
                        int i11 = e11.getInt(d12);
                        if (e11.isNull(d13)) {
                            str2 = null;
                        } else {
                            str2 = e11.getString(d13);
                        }
                        UUID uuid3 = this.__converters.toUuid(str2);
                        if (uuid3 != null) {
                            String string = e11.getString(d14);
                            if (e11.isNull(d15)) {
                                l10 = null;
                            } else {
                                l10 = Long.valueOf(e11.getLong(d15));
                            }
                            Instant instant = this.__converters.toInstant(l10);
                            if (instant != null) {
                                if (e11.isNull(d16)) {
                                    l11 = null;
                                } else {
                                    l11 = Long.valueOf(e11.getLong(d16));
                                }
                                Instant instant2 = this.__converters.toInstant(l11);
                                if (instant2 != null) {
                                    SceneState state = this.__converters.toState(e11.getString(d17));
                                    int i12 = e11.getInt(d18);
                                    if (e11.isNull(d19)) {
                                        str3 = null;
                                    } else {
                                        str3 = e11.getString(d19);
                                    }
                                    Manifest manifest = this.__converters.toManifest(str3);
                                    if (e11.isNull(d20)) {
                                        str4 = null;
                                    } else {
                                        str4 = e11.getString(d20);
                                    }
                                    boolean z11 = e11.getInt(d21) != 0;
                                    if (e11.isNull(d22)) {
                                        str5 = null;
                                    } else {
                                        str5 = e11.getString(d22);
                                    }
                                    UUID uuid4 = this.__converters.toUuid(str5);
                                    if (e11.getInt(d23) != 0) {
                                        i10 = d24;
                                        z10 = true;
                                    } else {
                                        i10 = d24;
                                        z10 = false;
                                    }
                                    if (e11.isNull(i10)) {
                                        l12 = null;
                                    } else {
                                        l12 = Long.valueOf(e11.getLong(i10));
                                    }
                                    Instant instant3 = this.__converters.toInstant(l12);
                                    int i13 = d25;
                                    if (e11.isNull(i13)) {
                                        str6 = null;
                                    } else {
                                        str6 = e11.getString(i13);
                                    }
                                    UUID uuid5 = this.__converters.toUuid(str6);
                                    int i14 = e11.getInt(d26);
                                    int i15 = d27;
                                    if (e11.isNull(i15)) {
                                        str7 = null;
                                    } else {
                                        str7 = e11.getString(i15);
                                    }
                                    RoomType roomType = this.__converters.toRoomType(str7);
                                    int i16 = d28;
                                    if (e11.isNull(i16)) {
                                        str8 = null;
                                    } else {
                                        str8 = e11.getString(i16);
                                    }
                                    UUID uuid6 = this.__converters.toUuid(str8);
                                    if (e11.isNull(d29)) {
                                        str9 = null;
                                    } else {
                                        str9 = e11.getString(d29);
                                    }
                                    databaseScene = new DatabaseScene(j10, uuid2, i11, uuid3, string, instant, instant2, state, i12, manifest, str4, z11, uuid4, z10, instant3, uuid5, i14, roomType, uuid6, str9);
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                    }
                } else {
                    databaseScene = null;
                }
                e11.close();
                b10.h();
                return databaseScene;
            } catch (Throwable th2) {
                th = th2;
                e11.close();
                b10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b10 = e10;
            e11.close();
            b10.h();
            throw th;
        }
    }

    public List<DatabaseSceneWithEntities> getWithEntitiesNow(UUID... uuidArr) {
        B b10;
        String str;
        int i10;
        String str2;
        Long l10;
        Long l11;
        String str3;
        String str4;
        int i11;
        int i12;
        int i13;
        String str5;
        boolean z10;
        int i14;
        int i15;
        int i16;
        Long l12;
        String str6;
        int i17;
        int i18;
        String str7;
        String str8;
        String str9;
        int i19;
        UUID[] uuidArr2 = uuidArr;
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM DatabaseScene WHERE uuid IN (");
        int length = uuidArr2.length;
        e.a(b11, length);
        b11.append(")");
        B e10 = B.e(b11.toString(), length);
        int i20 = 1;
        for (UUID fromUuid : uuidArr2) {
            String fromUuid2 = this.__converters.fromUuid(fromUuid);
            if (fromUuid2 == null) {
                e10.I2(i20);
            } else {
                e10.H(i20, fromUuid2);
            }
            i20++;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor e11 = b.e(this.__db, e10, true, (CancellationSignal) null);
            try {
                int d10 = a.d(e11, "id");
                int d11 = a.d(e11, "uuid");
                int d12 = a.d(e11, "sceneId");
                int d13 = a.d(e11, "sceneUuid");
                int d14 = a.d(e11, "name");
                int d15 = a.d(e11, "createdTs");
                int d16 = a.d(e11, "lastModifiedTs");
                int d17 = a.d(e11, "state");
                int d18 = a.d(e11, "compositionCount");
                int d19 = a.d(e11, "manifest");
                int d20 = a.d(e11, "glbUrl");
                int d21 = a.d(e11, "isStock");
                int d22 = a.d(e11, "uploadWorkerId");
                b10 = e10;
                try {
                    int d23 = a.d(e11, "userAcknowledged");
                    int d24 = a.d(e11, "estimatedFinishTs");
                    int d25 = a.d(e11, "upload");
                    int d26 = a.d(e11, "wid");
                    int d27 = a.d(e11, "roomType");
                    int d28 = a.d(e11, "jobId");
                    int d29 = a.d(e11, "pipelineType");
                    C5468y yVar = new C5468y();
                    int i21 = d22;
                    C5468y yVar2 = new C5468y();
                    while (e11.moveToNext()) {
                        int i22 = d20;
                        int i23 = d21;
                        long j10 = e11.getLong(d10);
                        if (!yVar.c(j10)) {
                            i19 = d19;
                            yVar.k(j10, new ArrayList());
                        } else {
                            i19 = d19;
                        }
                        long j11 = e11.getLong(d10);
                        if (!yVar2.c(j11)) {
                            yVar2.k(j11, new ArrayList());
                        }
                        d20 = i22;
                        d21 = i23;
                        d19 = i19;
                    }
                    int i24 = d20;
                    int i25 = d21;
                    int i26 = d19;
                    e11.moveToPosition(-1);
                    __fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
                    __fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar2);
                    ArrayList arrayList = new ArrayList(e11.getCount());
                    while (e11.moveToNext()) {
                        long j12 = e11.getLong(d10);
                        if (e11.isNull(d11)) {
                            str = null;
                        } else {
                            str = e11.getString(d11);
                        }
                        UUID uuid = this.__converters.toUuid(str);
                        if (uuid != null) {
                            int i27 = e11.getInt(d12);
                            if (e11.isNull(d13)) {
                                i10 = d11;
                                str2 = null;
                            } else {
                                str2 = e11.getString(d13);
                                i10 = d11;
                            }
                            UUID uuid2 = this.__converters.toUuid(str2);
                            if (uuid2 != null) {
                                String string = e11.getString(d14);
                                if (e11.isNull(d15)) {
                                    l10 = null;
                                } else {
                                    l10 = Long.valueOf(e11.getLong(d15));
                                }
                                Instant instant = this.__converters.toInstant(l10);
                                if (instant != null) {
                                    if (e11.isNull(d16)) {
                                        l11 = null;
                                    } else {
                                        l11 = Long.valueOf(e11.getLong(d16));
                                    }
                                    Instant instant2 = this.__converters.toInstant(l11);
                                    if (instant2 != null) {
                                        SceneState state = this.__converters.toState(e11.getString(d17));
                                        int i28 = e11.getInt(d18);
                                        int i29 = i26;
                                        if (e11.isNull(i29)) {
                                            str3 = null;
                                        } else {
                                            str3 = e11.getString(i29);
                                        }
                                        Manifest manifest = this.__converters.toManifest(str3);
                                        int i30 = i24;
                                        if (e11.isNull(i30)) {
                                            i11 = i25;
                                            str4 = null;
                                        } else {
                                            str4 = e11.getString(i30);
                                            i11 = i25;
                                        }
                                        i26 = i29;
                                        int i31 = i21;
                                        boolean z11 = e11.getInt(i11) != 0;
                                        if (e11.isNull(i31)) {
                                            i12 = i31;
                                            i13 = i30;
                                            str5 = null;
                                        } else {
                                            i12 = i31;
                                            str5 = e11.getString(i31);
                                            i13 = i30;
                                        }
                                        UUID uuid3 = this.__converters.toUuid(str5);
                                        int i32 = d23;
                                        if (e11.getInt(i32) != 0) {
                                            i14 = d24;
                                            z10 = true;
                                        } else {
                                            i14 = d24;
                                            z10 = false;
                                        }
                                        if (e11.isNull(i14)) {
                                            i15 = i32;
                                            i16 = i14;
                                            l12 = null;
                                        } else {
                                            i15 = i32;
                                            l12 = Long.valueOf(e11.getLong(i14));
                                            i16 = i14;
                                        }
                                        Instant instant3 = this.__converters.toInstant(l12);
                                        int i33 = d25;
                                        if (e11.isNull(i33)) {
                                            d25 = i33;
                                            str6 = null;
                                        } else {
                                            str6 = e11.getString(i33);
                                            d25 = i33;
                                        }
                                        UUID uuid4 = this.__converters.toUuid(str6);
                                        int i34 = d26;
                                        int i35 = e11.getInt(i34);
                                        int i36 = d27;
                                        if (e11.isNull(i36)) {
                                            i17 = i34;
                                            i18 = i36;
                                            str7 = null;
                                        } else {
                                            i17 = i34;
                                            str7 = e11.getString(i36);
                                            i18 = i36;
                                        }
                                        RoomType roomType = this.__converters.toRoomType(str7);
                                        int i37 = d28;
                                        if (e11.isNull(i37)) {
                                            d28 = i37;
                                            str8 = null;
                                        } else {
                                            str8 = e11.getString(i37);
                                            d28 = i37;
                                        }
                                        UUID uuid5 = this.__converters.toUuid(str8);
                                        int i38 = d29;
                                        if (e11.isNull(i38)) {
                                            str9 = null;
                                        } else {
                                            str9 = e11.getString(i38);
                                        }
                                        arrayList.add(new DatabaseSceneWithEntities(new DatabaseScene(j12, uuid, i27, uuid2, string, instant, instant2, state, i28, manifest, str4, z11, uuid3, z10, instant3, uuid4, i35, roomType, uuid5, str9), (ArrayList) yVar.d(e11.getLong(d10)), (ArrayList) yVar2.d(e11.getLong(d10))));
                                        d12 = d12;
                                        d13 = d13;
                                        d14 = d14;
                                        d11 = i10;
                                        d29 = i38;
                                        i25 = i11;
                                        int i39 = i15;
                                        d24 = i16;
                                        d23 = i39;
                                        int i40 = i17;
                                        d27 = i18;
                                        d26 = i40;
                                        int i41 = i12;
                                        i24 = i13;
                                        i21 = i41;
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    }
                    this.__db.setTransactionSuccessful();
                    e11.close();
                    b10.h();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    e11.close();
                    b10.h();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                b10 = e10;
                e11.close();
                b10.h();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    public F<List<DatabaseScene>> get() {
        final B e10 = B.e("SELECT * FROM DatabaseScene", 0);
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseScene"}, false, new Callable<List<DatabaseScene>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public List<DatabaseScene> call() {
                int i10;
                String str;
                int i11;
                String str2;
                Long l10;
                Long l11;
                String str3;
                String str4;
                boolean z10;
                int i12;
                String str5;
                boolean z11;
                int i13;
                Long l12;
                String str6;
                String str7;
                String str8;
                String str9;
                Cursor e10 = b.e(DatabaseSceneDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int d10 = a.d(e10, "id");
                    int d11 = a.d(e10, "uuid");
                    int d12 = a.d(e10, "sceneId");
                    int d13 = a.d(e10, "sceneUuid");
                    int d14 = a.d(e10, "name");
                    int d15 = a.d(e10, "createdTs");
                    int d16 = a.d(e10, "lastModifiedTs");
                    int d17 = a.d(e10, "state");
                    int d18 = a.d(e10, "compositionCount");
                    int d19 = a.d(e10, "manifest");
                    int d20 = a.d(e10, "glbUrl");
                    int d21 = a.d(e10, "isStock");
                    int d22 = a.d(e10, "uploadWorkerId");
                    int d23 = a.d(e10, "userAcknowledged");
                    int d24 = a.d(e10, "estimatedFinishTs");
                    int d25 = a.d(e10, "upload");
                    int d26 = a.d(e10, "wid");
                    int d27 = a.d(e10, "roomType");
                    int d28 = a.d(e10, "jobId");
                    int d29 = a.d(e10, "pipelineType");
                    int i14 = d22;
                    ArrayList arrayList = new ArrayList(e10.getCount());
                    while (e10.moveToNext()) {
                        long j10 = e10.getLong(d10);
                        if (e10.isNull(d11)) {
                            i10 = d10;
                            str = null;
                        } else {
                            str = e10.getString(d11);
                            i10 = d10;
                        }
                        UUID uuid = DatabaseSceneDao_Impl.this.__converters.toUuid(str);
                        if (uuid != null) {
                            int i15 = e10.getInt(d12);
                            if (e10.isNull(d13)) {
                                i11 = d11;
                                str2 = null;
                            } else {
                                str2 = e10.getString(d13);
                                i11 = d11;
                            }
                            UUID uuid2 = DatabaseSceneDao_Impl.this.__converters.toUuid(str2);
                            if (uuid2 != null) {
                                String string = e10.getString(d14);
                                if (e10.isNull(d15)) {
                                    l10 = null;
                                } else {
                                    l10 = Long.valueOf(e10.getLong(d15));
                                }
                                Instant instant = DatabaseSceneDao_Impl.this.__converters.toInstant(l10);
                                if (instant != null) {
                                    if (e10.isNull(d16)) {
                                        l11 = null;
                                    } else {
                                        l11 = Long.valueOf(e10.getLong(d16));
                                    }
                                    Instant instant2 = DatabaseSceneDao_Impl.this.__converters.toInstant(l11);
                                    if (instant2 != null) {
                                        SceneState state = DatabaseSceneDao_Impl.this.__converters.toState(e10.getString(d17));
                                        int i16 = e10.getInt(d18);
                                        if (e10.isNull(d19)) {
                                            str3 = null;
                                        } else {
                                            str3 = e10.getString(d19);
                                        }
                                        Manifest manifest = DatabaseSceneDao_Impl.this.__converters.toManifest(str3);
                                        if (e10.isNull(d20)) {
                                            str4 = null;
                                        } else {
                                            str4 = e10.getString(d20);
                                        }
                                        if (e10.getInt(d21) != 0) {
                                            i12 = i14;
                                            z10 = true;
                                        } else {
                                            i12 = i14;
                                            z10 = false;
                                        }
                                        if (e10.isNull(i12)) {
                                            str5 = null;
                                        } else {
                                            str5 = e10.getString(i12);
                                        }
                                        UUID uuid3 = DatabaseSceneDao_Impl.this.__converters.toUuid(str5);
                                        int i17 = d23;
                                        if (e10.getInt(i17) != 0) {
                                            i13 = d24;
                                            z11 = true;
                                        } else {
                                            i13 = d24;
                                            z11 = false;
                                        }
                                        if (e10.isNull(i13)) {
                                            i14 = i12;
                                            d23 = i17;
                                            l12 = null;
                                        } else {
                                            i14 = i12;
                                            l12 = Long.valueOf(e10.getLong(i13));
                                            d23 = i17;
                                        }
                                        Instant instant3 = DatabaseSceneDao_Impl.this.__converters.toInstant(l12);
                                        int i18 = d25;
                                        if (e10.isNull(i18)) {
                                            d25 = i18;
                                            str6 = null;
                                        } else {
                                            str6 = e10.getString(i18);
                                            d25 = i18;
                                        }
                                        UUID uuid4 = DatabaseSceneDao_Impl.this.__converters.toUuid(str6);
                                        int i19 = d26;
                                        int i20 = e10.getInt(i19);
                                        int i21 = d27;
                                        if (e10.isNull(i21)) {
                                            d26 = i19;
                                            d27 = i21;
                                            str7 = null;
                                        } else {
                                            d26 = i19;
                                            d27 = i21;
                                            str7 = e10.getString(i21);
                                        }
                                        RoomType roomType = DatabaseSceneDao_Impl.this.__converters.toRoomType(str7);
                                        int i22 = d28;
                                        if (e10.isNull(i22)) {
                                            d28 = i22;
                                            str8 = null;
                                        } else {
                                            str8 = e10.getString(i22);
                                            d28 = i22;
                                        }
                                        UUID uuid5 = DatabaseSceneDao_Impl.this.__converters.toUuid(str8);
                                        int i23 = d29;
                                        if (e10.isNull(i23)) {
                                            str9 = null;
                                        } else {
                                            str9 = e10.getString(i23);
                                        }
                                        arrayList.add(new DatabaseScene(j10, uuid, i15, uuid2, string, instant, instant2, state, i16, manifest, str4, z10, uuid3, z11, instant3, uuid4, i20, roomType, uuid5, str9));
                                        d29 = i23;
                                        d24 = i13;
                                        d10 = i10;
                                        d11 = i11;
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    }
                    e10.close();
                    return arrayList;
                } catch (Throwable th2) {
                    e10.close();
                    throw th2;
                }
            }
        });
    }

    public List<DatabaseSceneWithEntities> getWithEntitiesNow() {
        B b10;
        String str;
        int i10;
        String str2;
        Long l10;
        Long l11;
        String str3;
        String str4;
        int i11;
        boolean z10;
        int i12;
        int i13;
        String str5;
        boolean z11;
        int i14;
        int i15;
        int i16;
        Long l12;
        String str6;
        int i17;
        int i18;
        String str7;
        String str8;
        String str9;
        int i19;
        B e10 = B.e("SELECT * FROM DatabaseScene", 0);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor e11 = b.e(this.__db, e10, true, (CancellationSignal) null);
            try {
                int d10 = a.d(e11, "id");
                int d11 = a.d(e11, "uuid");
                int d12 = a.d(e11, "sceneId");
                int d13 = a.d(e11, "sceneUuid");
                int d14 = a.d(e11, "name");
                int d15 = a.d(e11, "createdTs");
                int d16 = a.d(e11, "lastModifiedTs");
                int d17 = a.d(e11, "state");
                int d18 = a.d(e11, "compositionCount");
                int d19 = a.d(e11, "manifest");
                int d20 = a.d(e11, "glbUrl");
                int d21 = a.d(e11, "isStock");
                int d22 = a.d(e11, "uploadWorkerId");
                b10 = e10;
                try {
                    int d23 = a.d(e11, "userAcknowledged");
                    int d24 = a.d(e11, "estimatedFinishTs");
                    int d25 = a.d(e11, "upload");
                    int d26 = a.d(e11, "wid");
                    int d27 = a.d(e11, "roomType");
                    int d28 = a.d(e11, "jobId");
                    int d29 = a.d(e11, "pipelineType");
                    C5468y yVar = new C5468y();
                    int i20 = d22;
                    C5468y yVar2 = new C5468y();
                    while (e11.moveToNext()) {
                        int i21 = d18;
                        int i22 = d19;
                        long j10 = e11.getLong(d10);
                        if (!yVar.c(j10)) {
                            i19 = d21;
                            yVar.k(j10, new ArrayList());
                        } else {
                            i19 = d21;
                        }
                        long j11 = e11.getLong(d10);
                        if (!yVar2.c(j11)) {
                            yVar2.k(j11, new ArrayList());
                        }
                        d18 = i21;
                        d19 = i22;
                        d21 = i19;
                    }
                    int i23 = d21;
                    int i24 = d18;
                    int i25 = d19;
                    e11.moveToPosition(-1);
                    __fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
                    __fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar2);
                    ArrayList arrayList = new ArrayList(e11.getCount());
                    while (e11.moveToNext()) {
                        long j12 = e11.getLong(d10);
                        if (e11.isNull(d11)) {
                            str = null;
                        } else {
                            str = e11.getString(d11);
                        }
                        UUID uuid = this.__converters.toUuid(str);
                        if (uuid != null) {
                            int i26 = e11.getInt(d12);
                            if (e11.isNull(d13)) {
                                i10 = d11;
                                str2 = null;
                            } else {
                                str2 = e11.getString(d13);
                                i10 = d11;
                            }
                            UUID uuid2 = this.__converters.toUuid(str2);
                            if (uuid2 != null) {
                                String string = e11.getString(d14);
                                if (e11.isNull(d15)) {
                                    l10 = null;
                                } else {
                                    l10 = Long.valueOf(e11.getLong(d15));
                                }
                                Instant instant = this.__converters.toInstant(l10);
                                if (instant != null) {
                                    if (e11.isNull(d16)) {
                                        l11 = null;
                                    } else {
                                        l11 = Long.valueOf(e11.getLong(d16));
                                    }
                                    Instant instant2 = this.__converters.toInstant(l11);
                                    if (instant2 != null) {
                                        SceneState state = this.__converters.toState(e11.getString(d17));
                                        int i27 = i24;
                                        int i28 = e11.getInt(i27);
                                        int i29 = i25;
                                        if (e11.isNull(i29)) {
                                            i24 = i27;
                                            str3 = null;
                                        } else {
                                            str3 = e11.getString(i29);
                                            i24 = i27;
                                        }
                                        Manifest manifest = this.__converters.toManifest(str3);
                                        if (e11.isNull(d20)) {
                                            i11 = i23;
                                            str4 = null;
                                        } else {
                                            str4 = e11.getString(d20);
                                            i11 = i23;
                                        }
                                        if (e11.getInt(i11) != 0) {
                                            i12 = i20;
                                            z10 = true;
                                        } else {
                                            i12 = i20;
                                            z10 = false;
                                        }
                                        if (e11.isNull(i12)) {
                                            i13 = d20;
                                            i23 = i11;
                                            str5 = null;
                                        } else {
                                            i13 = d20;
                                            i23 = i11;
                                            str5 = e11.getString(i12);
                                        }
                                        UUID uuid3 = this.__converters.toUuid(str5);
                                        int i30 = d23;
                                        if (e11.getInt(i30) != 0) {
                                            i14 = d24;
                                            z11 = true;
                                        } else {
                                            i14 = d24;
                                            z11 = false;
                                        }
                                        if (e11.isNull(i14)) {
                                            i15 = i30;
                                            i16 = i14;
                                            l12 = null;
                                        } else {
                                            i15 = i30;
                                            l12 = Long.valueOf(e11.getLong(i14));
                                            i16 = i14;
                                        }
                                        Instant instant3 = this.__converters.toInstant(l12);
                                        int i31 = d25;
                                        if (e11.isNull(i31)) {
                                            d25 = i31;
                                            str6 = null;
                                        } else {
                                            str6 = e11.getString(i31);
                                            d25 = i31;
                                        }
                                        UUID uuid4 = this.__converters.toUuid(str6);
                                        int i32 = d26;
                                        int i33 = e11.getInt(i32);
                                        int i34 = d27;
                                        if (e11.isNull(i34)) {
                                            i17 = i32;
                                            i18 = i34;
                                            str7 = null;
                                        } else {
                                            i17 = i32;
                                            str7 = e11.getString(i34);
                                            i18 = i34;
                                        }
                                        RoomType roomType = this.__converters.toRoomType(str7);
                                        int i35 = d28;
                                        if (e11.isNull(i35)) {
                                            d28 = i35;
                                            str8 = null;
                                        } else {
                                            str8 = e11.getString(i35);
                                            d28 = i35;
                                        }
                                        UUID uuid5 = this.__converters.toUuid(str8);
                                        int i36 = d29;
                                        if (e11.isNull(i36)) {
                                            str9 = null;
                                        } else {
                                            str9 = e11.getString(i36);
                                        }
                                        int i37 = d13;
                                        int i38 = i36;
                                        arrayList.add(new DatabaseSceneWithEntities(new DatabaseScene(j12, uuid, i26, uuid2, string, instant, instant2, state, i28, manifest, str4, z10, uuid3, z11, instant3, uuid4, i33, roomType, uuid5, str9), (ArrayList) yVar.d(e11.getLong(d10)), (ArrayList) yVar2.d(e11.getLong(d10))));
                                        yVar = yVar;
                                        d12 = d12;
                                        d13 = i37;
                                        d20 = i13;
                                        d29 = i38;
                                        d11 = i10;
                                        i25 = i29;
                                        i20 = i12;
                                        int i39 = i15;
                                        d24 = i16;
                                        d23 = i39;
                                        int i40 = i17;
                                        d27 = i18;
                                        d26 = i40;
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    }
                    this.__db.setTransactionSuccessful();
                    e11.close();
                    b10.h();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    e11.close();
                    b10.h();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                b10 = e10;
                e11.close();
                b10.h();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<DatabaseSceneWithEntities> getWithEntitiesNow(List<? extends SceneState> list) {
        B b10;
        String str;
        int i10;
        String str2;
        Long l10;
        Long l11;
        String str3;
        String str4;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        String str5;
        boolean z11;
        int i15;
        int i16;
        int i17;
        Long l12;
        String str6;
        int i18;
        int i19;
        String str7;
        String str8;
        String str9;
        int i20;
        StringBuilder b11 = e.b();
        b11.append("select * from DatabaseScene where state in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(") order by createdTs DESC");
        B e10 = B.e(b11.toString(), size);
        int i21 = 1;
        for (SceneState fromState : list) {
            e10.H(i21, this.__converters.fromState(fromState));
            i21++;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor e11 = b.e(this.__db, e10, true, (CancellationSignal) null);
            try {
                int d10 = a.d(e11, "id");
                int d11 = a.d(e11, "uuid");
                int d12 = a.d(e11, "sceneId");
                int d13 = a.d(e11, "sceneUuid");
                int d14 = a.d(e11, "name");
                int d15 = a.d(e11, "createdTs");
                int d16 = a.d(e11, "lastModifiedTs");
                int d17 = a.d(e11, "state");
                int d18 = a.d(e11, "compositionCount");
                int d19 = a.d(e11, "manifest");
                int d20 = a.d(e11, "glbUrl");
                int d21 = a.d(e11, "isStock");
                int d22 = a.d(e11, "uploadWorkerId");
                b10 = e10;
                try {
                    int d23 = a.d(e11, "userAcknowledged");
                    int d24 = a.d(e11, "estimatedFinishTs");
                    int d25 = a.d(e11, "upload");
                    int d26 = a.d(e11, "wid");
                    int d27 = a.d(e11, "roomType");
                    int d28 = a.d(e11, "jobId");
                    int d29 = a.d(e11, "pipelineType");
                    C5468y yVar = new C5468y();
                    int i22 = d22;
                    C5468y yVar2 = new C5468y();
                    while (e11.moveToNext()) {
                        int i23 = d19;
                        int i24 = d20;
                        long j10 = e11.getLong(d10);
                        if (!yVar.c(j10)) {
                            i20 = d21;
                            yVar.k(j10, new ArrayList());
                        } else {
                            i20 = d21;
                        }
                        long j11 = e11.getLong(d10);
                        if (!yVar2.c(j11)) {
                            yVar2.k(j11, new ArrayList());
                        }
                        d19 = i23;
                        d20 = i24;
                        d21 = i20;
                    }
                    int i25 = d21;
                    int i26 = d19;
                    int i27 = d20;
                    e11.moveToPosition(-1);
                    __fetchRelationshipDatabaseMediaAscomSugarcubeAppBaseDataDatabaseDatabaseMedia(yVar);
                    __fetchRelationshipDatabaseMetadataAscomSugarcubeAppBaseDataDatabaseDatabaseMetadata(yVar2);
                    ArrayList arrayList = new ArrayList(e11.getCount());
                    while (e11.moveToNext()) {
                        long j12 = e11.getLong(d10);
                        if (e11.isNull(d11)) {
                            str = null;
                        } else {
                            str = e11.getString(d11);
                        }
                        UUID uuid = this.__converters.toUuid(str);
                        if (uuid != null) {
                            int i28 = e11.getInt(d12);
                            if (e11.isNull(d13)) {
                                i10 = d11;
                                str2 = null;
                            } else {
                                str2 = e11.getString(d13);
                                i10 = d11;
                            }
                            UUID uuid2 = this.__converters.toUuid(str2);
                            if (uuid2 != null) {
                                String string = e11.getString(d14);
                                if (e11.isNull(d15)) {
                                    l10 = null;
                                } else {
                                    l10 = Long.valueOf(e11.getLong(d15));
                                }
                                Instant instant = this.__converters.toInstant(l10);
                                if (instant != null) {
                                    if (e11.isNull(d16)) {
                                        l11 = null;
                                    } else {
                                        l11 = Long.valueOf(e11.getLong(d16));
                                    }
                                    Instant instant2 = this.__converters.toInstant(l11);
                                    if (instant2 != null) {
                                        SceneState state = this.__converters.toState(e11.getString(d17));
                                        int i29 = e11.getInt(d18);
                                        int i30 = i26;
                                        if (e11.isNull(i30)) {
                                            str3 = null;
                                        } else {
                                            str3 = e11.getString(i30);
                                        }
                                        Manifest manifest = this.__converters.toManifest(str3);
                                        int i31 = i27;
                                        if (e11.isNull(i31)) {
                                            i11 = i25;
                                            str4 = null;
                                        } else {
                                            str4 = e11.getString(i31);
                                            i11 = i25;
                                        }
                                        if (e11.getInt(i11) != 0) {
                                            i26 = i30;
                                            i12 = i22;
                                            z10 = true;
                                        } else {
                                            i26 = i30;
                                            i12 = i22;
                                            z10 = false;
                                        }
                                        if (e11.isNull(i12)) {
                                            i13 = i12;
                                            i14 = d12;
                                            str5 = null;
                                        } else {
                                            i13 = i12;
                                            str5 = e11.getString(i12);
                                            i14 = d12;
                                        }
                                        UUID uuid3 = this.__converters.toUuid(str5);
                                        int i32 = d23;
                                        if (e11.getInt(i32) != 0) {
                                            i15 = d24;
                                            z11 = true;
                                        } else {
                                            i15 = d24;
                                            z11 = false;
                                        }
                                        if (e11.isNull(i15)) {
                                            i16 = i32;
                                            i17 = i15;
                                            l12 = null;
                                        } else {
                                            i16 = i32;
                                            l12 = Long.valueOf(e11.getLong(i15));
                                            i17 = i15;
                                        }
                                        Instant instant3 = this.__converters.toInstant(l12);
                                        int i33 = d25;
                                        if (e11.isNull(i33)) {
                                            d25 = i33;
                                            str6 = null;
                                        } else {
                                            str6 = e11.getString(i33);
                                            d25 = i33;
                                        }
                                        UUID uuid4 = this.__converters.toUuid(str6);
                                        int i34 = d26;
                                        int i35 = e11.getInt(i34);
                                        int i36 = d27;
                                        if (e11.isNull(i36)) {
                                            i18 = i34;
                                            i19 = i36;
                                            str7 = null;
                                        } else {
                                            i18 = i34;
                                            str7 = e11.getString(i36);
                                            i19 = i36;
                                        }
                                        RoomType roomType = this.__converters.toRoomType(str7);
                                        int i37 = d28;
                                        if (e11.isNull(i37)) {
                                            d28 = i37;
                                            str8 = null;
                                        } else {
                                            str8 = e11.getString(i37);
                                            d28 = i37;
                                        }
                                        UUID uuid5 = this.__converters.toUuid(str8);
                                        int i38 = d29;
                                        if (e11.isNull(i38)) {
                                            str9 = null;
                                        } else {
                                            str9 = e11.getString(i38);
                                        }
                                        arrayList.add(new DatabaseSceneWithEntities(new DatabaseScene(j12, uuid, i28, uuid2, string, instant, instant2, state, i29, manifest, str4, z10, uuid3, z11, instant3, uuid4, i35, roomType, uuid5, str9), (ArrayList) yVar.d(e11.getLong(d10)), (ArrayList) yVar2.d(e11.getLong(d10))));
                                        d13 = d13;
                                        d12 = i14;
                                        d14 = d14;
                                        i22 = i13;
                                        d15 = d15;
                                        d29 = i38;
                                        i27 = i31;
                                        i25 = i11;
                                        d11 = i10;
                                        int i39 = i16;
                                        d24 = i17;
                                        d23 = i39;
                                        int i40 = i18;
                                        d27 = i19;
                                        d26 = i40;
                                    } else {
                                        throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                    }
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                    }
                    this.__db.setTransactionSuccessful();
                    e11.close();
                    b10.h();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    e11.close();
                    b10.h();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                b10 = e10;
                e11.close();
                b10.h();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }
}
