package com.sugarcube.app.base.data.source.local;

import nH.C17624c;

public final class QuickFilterLocalDataSourceImpl_Factory implements C17624c<QuickFilterLocalDataSourceImpl> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final QuickFilterLocalDataSourceImpl_Factory INSTANCE = new QuickFilterLocalDataSourceImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static QuickFilterLocalDataSourceImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static QuickFilterLocalDataSourceImpl newInstance() {
        return new QuickFilterLocalDataSourceImpl();
    }

    public QuickFilterLocalDataSourceImpl get() {
        return newInstance();
    }
}
