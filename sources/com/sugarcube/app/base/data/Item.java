package com.sugarcube.app.base.data;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/sugarcube/app/base/data/Item;", "", "", "lastModified", "()J", "LXH/N;", "touch", "()V", "size", "release", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Item {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void release(Item item) {
        }
    }

    long lastModified();

    void release();

    long size();

    void touch();
}
