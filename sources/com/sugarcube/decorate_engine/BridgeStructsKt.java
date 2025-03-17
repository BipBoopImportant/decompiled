package com.sugarcube.decorate_engine;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000*\"\u0010\u0003\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004*\"\u0010\u0006\"\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00042\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004*$\b\u0000\u0010\t\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00042\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004*\u0016\u0010\n\"\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0012\u0004\u0012\u00020\f0\u000b*\"\u0010\r\"\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u00042\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u0004*$\b\u0000\u0010\u000f\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00042\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0004¨\u0006\u0010"}, d2 = {"toPacked", "", "Landroid/view/MotionEvent;", "CombinableSocketId", "", "", "ModelInstanceDetailsMap", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "ModelInstanceDetailsMapInternal", "RoomPolygonTypeSet", "", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "RoomSurfaceDetailsMap", "Lcom/sugarcube/decorate_engine/RoomSurfaceDetails;", "RoomSurfaceDetailsMapInternal", "decorate_engine_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BridgeStructsKt {
    public static final long[] toPacked(MotionEvent motionEvent) {
        C17542s.j(motionEvent, "<this>");
        long[] packDevInputEvent = BridgeStructsUtil.packDevInputEvent(motionEvent);
        C17542s.i(packDevInputEvent, "packDevInputEvent(...)");
        return packDevInputEvent;
    }
}
