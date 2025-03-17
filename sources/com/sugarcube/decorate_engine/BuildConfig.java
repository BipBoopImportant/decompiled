package com.sugarcube.decorate_engine;

public final class BuildConfig {
    public static final Boolean ARM7_SUPPORT_ENABLED;
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME = "com.sugarcube.decorate_engine";
    public static final int VERSION_CODE = -1;
    public static final String VERSION_NAME = "4.11.41";
    public static final Boolean X64_SUPPORT_ENABLED;
    public static final Boolean X86_SUPPORT_ENABLED;

    static {
        Boolean bool = Boolean.FALSE;
        ARM7_SUPPORT_ENABLED = bool;
        X64_SUPPORT_ENABLED = bool;
        X86_SUPPORT_ENABLED = bool;
    }
}
