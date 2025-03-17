package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m  reason: case insensitive filesystem */
enum C7639m {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');
    
    /* access modifiers changed from: private */
    public final char zzl;

    private C7639m(char c10) {
        this.zzl = c10;
    }

    public static C7639m b(char c10) {
        for (C7639m mVar : values()) {
            if (mVar.zzl == c10) {
                return mVar;
            }
        }
        return UNSET;
    }
}
