package com.sugarcube.core.network.models;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/core/network/models/ClientFeatures;", "", "feature", "", "version", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getFeature", "()Ljava/lang/String;", "getVersion", "()I", "DESIGN", "ERASED", "WALL_ART", "WALL_PLACEABLE", "WALL_PLACEABLES", "STACKABLE", "COMBINABLE", "UNSUPPORTED", "WALL_PAINT", "WALL_PAINT_INPAINT", "SNAP_ROTATE", "WALL_FLOOR_PLACEABLES", "MIRRORING", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum ClientFeatures {
    DESIGN("design", 1),
    ERASED("erased", 1),
    WALL_ART("wallArt", 1),
    WALL_PLACEABLE("wallPlaceable", 1),
    WALL_PLACEABLES("wallPlaceables", 1),
    STACKABLE("stackable", 1),
    COMBINABLE("combinable", 1),
    UNSUPPORTED("unsupported", 0),
    WALL_PAINT("wallPaint", 1),
    WALL_PAINT_INPAINT("wallPaintInpaint", 1),
    SNAP_ROTATE("snapRotate", 1),
    WALL_FLOOR_PLACEABLES("wallFloorPlaceables", 1),
    MIRRORING("mirror", 1);
    
    private final String feature;
    private final int version;

    static {
        ClientFeatures[] $values;
        $ENTRIES = C17221b.a($values);
    }

    private ClientFeatures(String str, int i10) {
        this.feature = str;
        this.version = i10;
    }

    public static C17220a<ClientFeatures> getEntries() {
        return $ENTRIES;
    }

    public final String getFeature() {
        return this.feature;
    }

    public final int getVersion() {
        return this.version;
    }
}
