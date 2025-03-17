package com.sugarcube.app.base.data.database;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007\"\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\nJ#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH'¢\u0006\u0004\b\u0005\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH'¢\u0006\u0004\b\r\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007\"\u00028\u0000H'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/app/base/data/database/GenericDao;", "T", "", "entity", "", "insert", "(Ljava/lang/Object;)J", "", "entities", "", "([Ljava/lang/Object;)Ljava/util/List;", "(Ljava/util/List;)Ljava/util/List;", "LXH/N;", "update", "(Ljava/lang/Object;)V", "(Ljava/util/List;)V", "", "delete", "([Ljava/lang/Object;)I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GenericDao<T> {
    int delete(T... tArr);

    long insert(T t10);

    List<Long> insert(List<? extends T> list);

    List<Long> insert(T... tArr);

    void update(T t10);

    void update(List<? extends T> list);
}
