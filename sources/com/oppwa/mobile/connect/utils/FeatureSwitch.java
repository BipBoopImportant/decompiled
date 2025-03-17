package com.oppwa.mobile.connect.utils;

public enum FeatureSwitch {
    DEFAULT_UI_COMPONENTS(false),
    THREEDS_FALLBACK(false);
    

    /* renamed from: a  reason: collision with root package name */
    private final boolean f122160a;

    private FeatureSwitch(boolean z10) {
        this.f122160a = z10;
    }

    public static boolean isActivated(FeatureSwitch featureSwitch) {
        return featureSwitch.f122160a;
    }
}
