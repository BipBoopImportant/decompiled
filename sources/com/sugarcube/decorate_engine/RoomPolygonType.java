package com.sugarcube.decorate_engine;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fK.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000f\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/decorate_engine/RoomPolygonType;", "", "stringValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStringValue", "()Ljava/lang/String;", "None", "Ceiling", "Door", "Floor", "Opening", "StackingSurface", "Wall", "Window", "$serializer", "Companion", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum RoomPolygonType {
    None(""),
    Ceiling("ceiling"),
    Door("door"),
    Floor(PlaceTypes.FLOOR),
    Opening("opening"),
    StackingSurface("stackable"),
    Wall("wall"),
    Window("window");
    
    /* access modifiers changed from: private */
    public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
    public static final Companion Companion = null;
    private final String stringValue;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/RoomPolygonType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) RoomPolygonType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RoomPolygonType> serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
    }

    private RoomPolygonType(String str) {
        this.stringValue = str;
    }

    public final String getStringValue() {
        return this.stringValue;
    }
}
