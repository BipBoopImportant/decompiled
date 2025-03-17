package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010'R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/sugarcube/decorate_engine/CombinableSocketSet;", "", "", "name", "", "Lcom/sugarcube/decorate_engine/CombinableSocket;", "sockets", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/CombinableSocketSet;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/sugarcube/decorate_engine/CombinableSocketSet;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "Ljava/util/List;", "getSockets", "setSockets", "(Ljava/util/List;)V", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CombinableSocketSet {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {null, new C17451f(CombinableSocket$$serializer.INSTANCE)};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private String name;
    private List<CombinableSocket> sockets;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/CombinableSocketSet$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/CombinableSocketSet;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CombinableSocketSet> serializer() {
            return CombinableSocketSet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CombinableSocketSet() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CombinableSocketSet copy$default(CombinableSocketSet combinableSocketSet, String str, List<CombinableSocket> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = combinableSocketSet.name;
        }
        if ((i10 & 2) != 0) {
            list = combinableSocketSet.sockets;
        }
        return combinableSocketSet.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(CombinableSocketSet combinableSocketSet, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar.z(serialDescriptor, 0) || !C17542s.e(combinableSocketSet.name, "UNNAMED")) {
            dVar.y(serialDescriptor, 0, combinableSocketSet.name);
        }
        if (dVar.z(serialDescriptor, 1) || !C17542s.e(combinableSocketSet.sockets, C16877v.n())) {
            dVar.i(serialDescriptor, 1, kSerializerArr[1], combinableSocketSet.sockets);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final List<CombinableSocket> component2() {
        return this.sockets;
    }

    public final CombinableSocketSet copy(String str, List<CombinableSocket> list) {
        C17542s.j(str, "name");
        C17542s.j(list, "sockets");
        return new CombinableSocketSet(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinableSocketSet)) {
            return false;
        }
        CombinableSocketSet combinableSocketSet = (CombinableSocketSet) obj;
        return C17542s.e(this.name, combinableSocketSet.name) && C17542s.e(this.sockets, combinableSocketSet.sockets);
    }

    public final String getName() {
        return this.name;
    }

    public final List<CombinableSocket> getSockets() {
        return this.sockets;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.sockets.hashCode();
    }

    public final void setName(String str) {
        C17542s.j(str, "<set-?>");
        this.name = str;
    }

    public final void setSockets(List<CombinableSocket> list) {
        C17542s.j(list, "<set-?>");
        this.sockets = list;
    }

    public String toString() {
        String str = this.name;
        List<CombinableSocket> list = this.sockets;
        return "CombinableSocketSet(name=" + str + ", sockets=" + list + ")";
    }

    @C16814e
    public /* synthetic */ CombinableSocketSet(int i10, String str, List list, T0 t02) {
        this.name = (i10 & 1) == 0 ? "UNNAMED" : str;
        if ((i10 & 2) == 0) {
            this.sockets = C16877v.n();
        } else {
            this.sockets = list;
        }
    }

    public CombinableSocketSet(String str, List<CombinableSocket> list) {
        C17542s.j(str, "name");
        C17542s.j(list, "sockets");
        this.name = str;
        this.sockets = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CombinableSocketSet(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "UNNAMED" : str, (i10 & 2) != 0 ? C16877v.n() : list);
    }
}
