package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import YH.X;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17446c0;
import jK.C17451f;
import jK.T0;
import jK.Y0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u0000 =2\u00020\u0001:\u0002>=BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004j\u0002`\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBk\b\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004j\u0002`\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u00100R2\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004j\u0002`\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u00104R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u00105\u001a\u0004\b6\u0010!\"\u0004\b7\u00108R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u00105\u001a\u0004\b9\u0010!\"\u0004\b:\u00108R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b;\u0010\u001d\"\u0004\b<\u00100¨\u0006?"}, d2 = {"Lcom/sugarcube/decorate_engine/CombinableSocket;", "", "", "name", "", "Lcom/sugarcube/decorate_engine/CombinableSocketId;", "type", "", "", "pos", "rotQuat", "linkGroupName", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/CombinableSocket;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/sugarcube/decorate_engine/CombinableSocket;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "Ljava/util/Map;", "getType", "setType", "(Ljava/util/Map;)V", "Ljava/util/List;", "getPos", "setPos", "(Ljava/util/List;)V", "getRotQuat", "setRotQuat", "getLinkGroupName", "setLinkGroupName", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CombinableSocket {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private String linkGroupName;
    private String name;
    private List<Double> pos;
    private List<Double> rotQuat;
    private Map<String, String> type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/CombinableSocket$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/CombinableSocket;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CombinableSocket> serializer() {
            return CombinableSocket$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Y0 y02 = Y0.f144077a;
        C17446c0 c0Var = new C17446c0(y02, y02);
        C17438C c10 = C17438C.f144010a;
        $childSerializers = new KSerializer[]{null, c0Var, new C17451f(c10), new C17451f(c10), null};
    }

    public CombinableSocket() {
        this((String) null, (Map) null, (List) null, (List) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CombinableSocket copy$default(CombinableSocket combinableSocket, String str, Map<String, String> map, List<Double> list, List<Double> list2, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = combinableSocket.name;
        }
        if ((i10 & 2) != 0) {
            map = combinableSocket.type;
        }
        Map<String, String> map2 = map;
        if ((i10 & 4) != 0) {
            list = combinableSocket.pos;
        }
        List<Double> list3 = list;
        if ((i10 & 8) != 0) {
            list2 = combinableSocket.rotQuat;
        }
        List<Double> list4 = list2;
        if ((i10 & 16) != 0) {
            str2 = combinableSocket.linkGroupName;
        }
        return combinableSocket.copy(str, map2, list3, list4, str2);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(CombinableSocket combinableSocket, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar.z(serialDescriptor, 0) || !C17542s.e(combinableSocket.name, "UNNAMED")) {
            dVar.y(serialDescriptor, 0, combinableSocket.name);
        }
        if (dVar.z(serialDescriptor, 1) || !C17542s.e(combinableSocket.type, X.j())) {
            dVar.i(serialDescriptor, 1, kSerializerArr[1], combinableSocket.type);
        }
        if (dVar.z(serialDescriptor, 2) || !C17542s.e(combinableSocket.pos, C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)))) {
            dVar.i(serialDescriptor, 2, kSerializerArr[2], combinableSocket.pos);
        }
        if (dVar.z(serialDescriptor, 3) || !C17542s.e(combinableSocket.rotQuat, C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(1.0d)))) {
            dVar.i(serialDescriptor, 3, kSerializerArr[3], combinableSocket.rotQuat);
        }
        if (dVar.z(serialDescriptor, 4) || combinableSocket.linkGroupName != null) {
            dVar.B(serialDescriptor, 4, Y0.f144077a, combinableSocket.linkGroupName);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final Map<String, String> component2() {
        return this.type;
    }

    public final List<Double> component3() {
        return this.pos;
    }

    public final List<Double> component4() {
        return this.rotQuat;
    }

    public final String component5() {
        return this.linkGroupName;
    }

    public final CombinableSocket copy(String str, Map<String, String> map, List<Double> list, List<Double> list2, String str2) {
        C17542s.j(str, "name");
        C17542s.j(map, "type");
        C17542s.j(list, "pos");
        C17542s.j(list2, "rotQuat");
        return new CombinableSocket(str, map, list, list2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinableSocket)) {
            return false;
        }
        CombinableSocket combinableSocket = (CombinableSocket) obj;
        return C17542s.e(this.name, combinableSocket.name) && C17542s.e(this.type, combinableSocket.type) && C17542s.e(this.pos, combinableSocket.pos) && C17542s.e(this.rotQuat, combinableSocket.rotQuat) && C17542s.e(this.linkGroupName, combinableSocket.linkGroupName);
    }

    public final String getLinkGroupName() {
        return this.linkGroupName;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Double> getPos() {
        return this.pos;
    }

    public final List<Double> getRotQuat() {
        return this.rotQuat;
    }

    public final Map<String, String> getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.pos.hashCode()) * 31) + this.rotQuat.hashCode()) * 31;
        String str = this.linkGroupName;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setLinkGroupName(String str) {
        this.linkGroupName = str;
    }

    public final void setName(String str) {
        C17542s.j(str, "<set-?>");
        this.name = str;
    }

    public final void setPos(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.pos = list;
    }

    public final void setRotQuat(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.rotQuat = list;
    }

    public final void setType(Map<String, String> map) {
        C17542s.j(map, "<set-?>");
        this.type = map;
    }

    public String toString() {
        String str = this.name;
        Map<String, String> map = this.type;
        List<Double> list = this.pos;
        List<Double> list2 = this.rotQuat;
        String str2 = this.linkGroupName;
        return "CombinableSocket(name=" + str + ", type=" + map + ", pos=" + list + ", rotQuat=" + list2 + ", linkGroupName=" + str2 + ")";
    }

    @C16814e
    public /* synthetic */ CombinableSocket(int i10, String str, Map map, List list, List list2, String str2, T0 t02) {
        this.name = (i10 & 1) == 0 ? "UNNAMED" : str;
        if ((i10 & 2) == 0) {
            this.type = X.j();
        } else {
            this.type = map;
        }
        if ((i10 & 4) == 0) {
            this.pos = C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
        } else {
            this.pos = list;
        }
        if ((i10 & 8) == 0) {
            this.rotQuat = C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(1.0d));
        } else {
            this.rotQuat = list2;
        }
        if ((i10 & 16) == 0) {
            this.linkGroupName = null;
        } else {
            this.linkGroupName = str2;
        }
    }

    public CombinableSocket(String str, Map<String, String> map, List<Double> list, List<Double> list2, String str2) {
        C17542s.j(str, "name");
        C17542s.j(map, "type");
        C17542s.j(list, "pos");
        C17542s.j(list2, "rotQuat");
        this.name = str;
        this.type = map;
        this.pos = list;
        this.rotQuat = list2;
        this.linkGroupName = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CombinableSocket(java.lang.String r4, java.util.Map r5, java.util.List r6, java.util.List r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = "UNNAMED"
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000e
            java.util.Map r5 = YH.X.j()
        L_0x000e:
            r10 = r5
            r5 = r9 & 4
            r0 = 0
            if (r5 == 0) goto L_0x0029
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            java.lang.Double[] r5 = new java.lang.Double[]{r5, r6, r2}
            java.util.List r6 = YH.C16877v.q(r5)
        L_0x0029:
            r2 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0048
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Double[] r5 = new java.lang.Double[]{r5, r6, r7, r0}
            java.util.List r7 = YH.C16877v.q(r5)
        L_0x0048:
            r0 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x004e
            r8 = 0
        L_0x004e:
            r1 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r2
            r9 = r0
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.CombinableSocket.<init>(java.lang.String, java.util.Map, java.util.List, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
