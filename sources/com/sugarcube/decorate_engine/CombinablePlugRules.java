package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.X;
import fK.p;
import iK.C17395d;
import jK.C17446c0;
import jK.T0;
import jK.Y0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 *2\u00020\u0001:\u0002+*B;\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¢\u0006\u0004\b\u0007\u0010\bBS\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018JD\u0010\u001a\u001a\u00020\u00002\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00042\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R2\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010'R2\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010'¨\u0006,"}, d2 = {"Lcom/sugarcube/decorate_engine/CombinablePlugRules;", "", "", "", "Lcom/sugarcube/decorate_engine/CombinableSocketId;", "socketType", "parentHasMetadata", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/CombinablePlugRules;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "component2", "copy", "(Ljava/util/Map;Ljava/util/Map;)Lcom/sugarcube/decorate_engine/CombinablePlugRules;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getSocketType", "setSocketType", "(Ljava/util/Map;)V", "getParentHasMetadata", "setParentHasMetadata", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CombinablePlugRules {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private Map<String, String> parentHasMetadata;
    private Map<String, String> socketType;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/CombinablePlugRules$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/CombinablePlugRules;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CombinablePlugRules> serializer() {
            return CombinablePlugRules$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Y0 y02 = Y0.f144077a;
        $childSerializers = new KSerializer[]{new C17446c0(y02, y02), new C17446c0(y02, y02)};
    }

    public CombinablePlugRules() {
        this((Map) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CombinablePlugRules copy$default(CombinablePlugRules combinablePlugRules, Map<String, String> map, Map<String, String> map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = combinablePlugRules.socketType;
        }
        if ((i10 & 2) != 0) {
            map2 = combinablePlugRules.parentHasMetadata;
        }
        return combinablePlugRules.copy(map, map2);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(CombinablePlugRules combinablePlugRules, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar.z(serialDescriptor, 0) || !C17542s.e(combinablePlugRules.socketType, X.j())) {
            dVar.i(serialDescriptor, 0, kSerializerArr[0], combinablePlugRules.socketType);
        }
        if (dVar.z(serialDescriptor, 1) || !C17542s.e(combinablePlugRules.parentHasMetadata, X.j())) {
            dVar.i(serialDescriptor, 1, kSerializerArr[1], combinablePlugRules.parentHasMetadata);
        }
    }

    public final Map<String, String> component1() {
        return this.socketType;
    }

    public final Map<String, String> component2() {
        return this.parentHasMetadata;
    }

    public final CombinablePlugRules copy(Map<String, String> map, Map<String, String> map2) {
        C17542s.j(map, "socketType");
        C17542s.j(map2, "parentHasMetadata");
        return new CombinablePlugRules(map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinablePlugRules)) {
            return false;
        }
        CombinablePlugRules combinablePlugRules = (CombinablePlugRules) obj;
        return C17542s.e(this.socketType, combinablePlugRules.socketType) && C17542s.e(this.parentHasMetadata, combinablePlugRules.parentHasMetadata);
    }

    public final Map<String, String> getParentHasMetadata() {
        return this.parentHasMetadata;
    }

    public final Map<String, String> getSocketType() {
        return this.socketType;
    }

    public int hashCode() {
        return (this.socketType.hashCode() * 31) + this.parentHasMetadata.hashCode();
    }

    public final void setParentHasMetadata(Map<String, String> map) {
        C17542s.j(map, "<set-?>");
        this.parentHasMetadata = map;
    }

    public final void setSocketType(Map<String, String> map) {
        C17542s.j(map, "<set-?>");
        this.socketType = map;
    }

    public String toString() {
        Map<String, String> map = this.socketType;
        Map<String, String> map2 = this.parentHasMetadata;
        return "CombinablePlugRules(socketType=" + map + ", parentHasMetadata=" + map2 + ")";
    }

    @C16814e
    public /* synthetic */ CombinablePlugRules(int i10, Map<String, String> map, Map map2, T0 t02) {
        this.socketType = (i10 & 1) == 0 ? X.j() : map;
        if ((i10 & 2) == 0) {
            this.parentHasMetadata = X.j();
        } else {
            this.parentHasMetadata = map2;
        }
    }

    public CombinablePlugRules(Map<String, String> map, Map<String, String> map2) {
        C17542s.j(map, "socketType");
        C17542s.j(map2, "parentHasMetadata");
        this.socketType = map;
        this.parentHasMetadata = map2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CombinablePlugRules(Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? X.j() : map, (i10 & 2) != 0 ? X.j() : map2);
    }
}
