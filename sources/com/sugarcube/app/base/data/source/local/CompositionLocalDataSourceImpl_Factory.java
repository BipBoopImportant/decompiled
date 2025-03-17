package com.sugarcube.app.base.data.source.local;

import nH.C17624c;

public final class CompositionLocalDataSourceImpl_Factory implements C17624c<CompositionLocalDataSourceImpl> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CompositionLocalDataSourceImpl_Factory INSTANCE = new CompositionLocalDataSourceImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static CompositionLocalDataSourceImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CompositionLocalDataSourceImpl newInstance() {
        return new CompositionLocalDataSourceImpl();
    }

    public CompositionLocalDataSourceImpl get() {
        return newInstance();
    }
}
