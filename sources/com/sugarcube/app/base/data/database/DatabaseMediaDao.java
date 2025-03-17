package com.sugarcube.app.base.data.database;

import androidx.lifecycle.F;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\f2\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\fH'¢\u0006\u0004\b\r\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0005H'¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H'¢\u0006\u0004\b\u0015\u0010\u0004J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/app/base/data/database/DatabaseMediaDao;", "Lcom/sugarcube/app/base/data/database/GenericDao;", "Lcom/sugarcube/app/base/data/database/DatabaseMedia;", "<init>", "()V", "", "databaseSceneId", "Lcom/sugarcube/app/base/data/database/MediaType;", "type", "", "getNow", "(JLcom/sugarcube/app/base/data/database/MediaType;)Ljava/util/List;", "Landroidx/lifecycle/F;", "get", "(J)Landroidx/lifecycle/F;", "()Landroidx/lifecycle/F;", "LXH/N;", "deleteByDatabaseSceneId", "(J)V", "id", "delete", "deleteAll", "", "exists", "(JLcom/sugarcube/app/base/data/database/MediaType;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DatabaseMediaDao implements GenericDao<DatabaseMedia> {
    public static final int $stable = 0;

    public abstract void delete(long j10);

    public abstract void deleteAll();

    public abstract void deleteByDatabaseSceneId(long j10);

    public abstract boolean exists(long j10, MediaType mediaType);

    public abstract F<List<DatabaseMedia>> get();

    public abstract F<List<DatabaseMedia>> get(long j10);

    public abstract List<DatabaseMedia> getNow(long j10, MediaType mediaType);
}
