package com.ingka.ikea.instore.wayfinding.impl.navigation;

import fK.p;
import iK.C17395d;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 !2\u00020\u0001:\u0002\u001c\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0015¨\u0006#"}, d2 = {"com/ingka/ikea/instore/wayfinding/impl/navigation/WayfindingRoutes$KompassMap", "", "", "productId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "Lcom/ingka/ikea/instore/wayfinding/impl/navigation/WayfindingRoutes$KompassMap;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/instore/wayfinding/impl/navigation/WayfindingRoutes$KompassMap;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getProductId$annotations", "()V", "Companion", "$serializer", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WayfindingRoutes$KompassMap {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f96367b = "ikea://navigation/wayfinding/map";

    /* renamed from: a  reason: collision with root package name */
    private final String f96368a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0006XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/impl/navigation/WayfindingRoutes$KompassMap$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/wayfinding/impl/navigation/WayfindingRoutes$KompassMap;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "deeplinkBasePath", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return WayfindingRoutes$KompassMap.f96367b;
        }

        public final KSerializer<WayfindingRoutes$KompassMap> serializer() {
            return WayfindingRoutes$KompassMap$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public WayfindingRoutes$KompassMap() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void c(WayfindingRoutes$KompassMap wayfindingRoutes$KompassMap, C17395d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.z(serialDescriptor, 0) || wayfindingRoutes$KompassMap.f96368a != null) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, wayfindingRoutes$KompassMap.f96368a);
        }
    }

    public final String b() {
        return this.f96368a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WayfindingRoutes$KompassMap) && C17542s.e(this.f96368a, ((WayfindingRoutes$KompassMap) obj).f96368a);
    }

    public int hashCode() {
        String str = this.f96368a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f96368a;
        return "KompassMap(productId=" + str + ")";
    }

    public /* synthetic */ WayfindingRoutes$KompassMap(int i10, String str, T0 t02) {
        if ((i10 & 1) == 0) {
            this.f96368a = null;
        } else {
            this.f96368a = str;
        }
    }

    public WayfindingRoutes$KompassMap(String str) {
        this.f96368a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WayfindingRoutes$KompassMap(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
