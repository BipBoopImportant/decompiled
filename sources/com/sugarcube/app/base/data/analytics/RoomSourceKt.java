package com.sugarcube.app.base.data.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRoomSource", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RoomSourceKt {
    public static final RoomSource toRoomSource(String str) {
        RoomSource roomSource;
        C17542s.j(str, "<this>");
        RoomSource[] values = RoomSource.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                roomSource = null;
                break;
            }
            roomSource = values[i10];
            if (C17542s.e(roomSource.getKey(), str)) {
                break;
            }
            i10++;
        }
        return roomSource == null ? RoomSource.UserCaptured : roomSource;
    }
}
