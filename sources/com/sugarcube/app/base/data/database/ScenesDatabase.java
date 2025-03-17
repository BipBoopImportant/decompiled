package com.sugarcube.app.base.data.database;

import androidx.room.x;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/app/base/data/database/ScenesDatabase;", "Landroidx/room/x;", "<init>", "()V", "Lcom/sugarcube/app/base/data/database/DatabaseSceneDao;", "getDatabaseSceneDao", "()Lcom/sugarcube/app/base/data/database/DatabaseSceneDao;", "databaseSceneDao", "Lcom/sugarcube/app/base/data/database/DatabaseMetadataDao;", "getDatabaseMetadataDao", "()Lcom/sugarcube/app/base/data/database/DatabaseMetadataDao;", "databaseMetadataDao", "Lcom/sugarcube/app/base/data/database/DatabaseMediaDao;", "getDatabaseMediaDao", "()Lcom/sugarcube/app/base/data/database/DatabaseMediaDao;", "databaseMediaDao", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ScenesDatabase extends x {
    public static final int $stable = 0;

    public abstract DatabaseMediaDao getDatabaseMediaDao();

    public abstract DatabaseMetadataDao getDatabaseMetadataDao();

    public abstract DatabaseSceneDao getDatabaseSceneDao();
}
