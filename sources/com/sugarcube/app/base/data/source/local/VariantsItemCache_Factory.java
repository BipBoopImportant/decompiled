package com.sugarcube.app.base.data.source.local;

import nH.C17624c;

public final class VariantsItemCache_Factory implements C17624c<VariantsItemCache> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final VariantsItemCache_Factory INSTANCE = new VariantsItemCache_Factory();

        private InstanceHolder() {
        }
    }

    public static VariantsItemCache_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VariantsItemCache newInstance() {
        return new VariantsItemCache();
    }

    public VariantsItemCache get() {
        return newInstance();
    }
}
