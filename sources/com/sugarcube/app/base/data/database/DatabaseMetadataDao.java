package com.sugarcube.app.base.data.database;

import androidx.lifecycle.F;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\n2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\nH'¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/data/database/DatabaseMetadataDao;", "Lcom/sugarcube/app/base/data/database/GenericDao;", "Lcom/sugarcube/app/base/data/database/DatabaseMetadata;", "<init>", "()V", "", "databaseSceneId", "", "getNow", "(J)Ljava/util/List;", "Landroidx/lifecycle/F;", "get", "(J)Landroidx/lifecycle/F;", "()Landroidx/lifecycle/F;", "LXH/N;", "delete", "(J)V", "deleteAll", "", "exists", "(J)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DatabaseMetadataDao implements GenericDao<DatabaseMetadata> {
    public static final int $stable = 0;

    public abstract void delete(long j10);

    public abstract void deleteAll();

    public abstract boolean exists(long j10);

    public abstract F<List<DatabaseMetadata>> get();

    public abstract F<List<DatabaseMetadata>> get(long j10);

    public abstract List<DatabaseMetadata> getNow(long j10);
}
