package com.sugarcube.app.base.data.asset;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/app/base/data/asset/VideoGroup;", "", "<init>", "(Ljava/lang/String;I)V", "LANDING", "CAPTURE_BOTH", "CAPTURE_HYBRID", "CAPTURE_HYBRID_UW", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum VideoGroup {
    LANDING,
    CAPTURE_BOTH,
    CAPTURE_HYBRID,
    CAPTURE_HYBRID_UW;

    static {
        VideoGroup[] $values;
        $ENTRIES = C17221b.a($values);
    }

    public static C17220a<VideoGroup> getEntries() {
        return $ENTRIES;
    }
}
