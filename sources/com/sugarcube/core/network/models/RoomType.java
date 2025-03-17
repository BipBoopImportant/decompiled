package com.sugarcube.core.network.models;

import HJ.C15854t;
import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/core/network/models/RoomType;", "", "apiKey", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "LIVING_ROOM", "OFFICE", "HALLWAY", "DINING_ROOM", "KITCHEN", "BEDROOM", "FAMILY_ROOM", "OTHER", "UNKNOWN", "Companion", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum RoomType {
    LIVING_ROOM("living_room"),
    OFFICE("office"),
    HALLWAY("hallway"),
    DINING_ROOM("dining_room"),
    KITCHEN("kitchen"),
    BEDROOM("bedroom"),
    FAMILY_ROOM("family_room"),
    OTHER("other"),
    UNKNOWN("unknown");
    
    public static final Companion Companion = null;
    private final String apiKey;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/core/network/models/RoomType$Companion;", "", "<init>", "()V", "getTypeFromKey", "Lcom/sugarcube/core/network/models/RoomType;", "key", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RoomType getTypeFromKey(String str) {
            RoomType roomType;
            T t10;
            C17542s.j(str, "key");
            Iterator<T> it = RoomType.getEntries().iterator();
            while (true) {
                roomType = null;
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C15854t.A(((RoomType) t10).getApiKey(), str, true)) {
                    break;
                }
            }
            RoomType roomType2 = (RoomType) t10;
            if (roomType2 != null) {
                if (roomType2 != RoomType.UNKNOWN) {
                    roomType = roomType2;
                }
                if (roomType != null) {
                    return roomType;
                }
            }
            return RoomType.LIVING_ROOM;
        }

        private Companion() {
        }
    }

    static {
        RoomType[] $values;
        $ENTRIES = C17221b.a($values);
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private RoomType(String str) {
        this.apiKey = str;
    }

    public static C17220a<RoomType> getEntries() {
        return $ENTRIES;
    }

    public final String getApiKey() {
        return this.apiKey;
    }
}
