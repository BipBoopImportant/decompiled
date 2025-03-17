package com.google.ar.core;

/* renamed from: com.google.ar.core.k  reason: case insensitive filesystem */
enum C9503k {
    BASE_TRACKABLE(1095893248, Trackable.class),
    UNKNOWN_TO_JAVA(-1, (int) null),
    PLANE(1095893249, Plane.class),
    POINT(1095893250, Point.class),
    AUGMENTED_IMAGE(1095893252, AugmentedImage.class),
    FACE(1095893253, AugmentedFace.class),
    STREETSCAPE_GEOMETRY(1095893251, StreetscapeGeometry.class),
    EARTH(1095893257, Earth.class),
    DEPTH_POINT(1095893265, DepthPoint.class),
    INSTANT_PLACEMENT_POINT(1095893266, InstantPlacementPoint.class);
    

    /* renamed from: k  reason: collision with root package name */
    final int f67811k;

    /* renamed from: l  reason: collision with root package name */
    private final Class f67812l;

    private C9503k(int i10, Class cls) {
        this.f67811k = i10;
        this.f67812l = cls;
    }

    public static C9503k a(Class cls) {
        for (C9503k kVar : values()) {
            Class cls2 = kVar.f67812l;
            if (cls2 != null && cls2.equals(cls)) {
                return kVar;
            }
        }
        return UNKNOWN_TO_JAVA;
    }
}
