package com.ingka.ikea.room.impl.data.remote;

import kK.C17519h;
import kotlin.Metadata;
import kotlin.jvm.internal.P;
import py.d;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/a;", "LkK/h;", "Lpy/d;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "LfK/d;", "b", "(Lkotlinx/serialization/json/JsonElement;)LfK/d;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends C17519h<d<?>> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f119768c = new a();

    private a() {
        super(P.b(d.class));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r0 = kK.j.j(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fK.C17251d<py.d<?>> b(kotlinx.serialization.json.JsonElement r3) {
        /*
            r2 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            kotlinx.serialization.json.JsonObject r3 = kK.j.i(r3)
            java.lang.String r0 = "id"
            java.lang.Object r0 = r3.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            r1 = 0
            if (r0 == 0) goto L_0x001f
            kotlinx.serialization.json.JsonPrimitive r0 = kK.j.j(r0)
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r0.b()
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            if (r0 != 0) goto L_0x0029
            com.ingka.ikea.room.impl.data.remote.UnsupportedSlotRemote$a r3 = com.ingka.ikea.room.impl.data.remote.UnsupportedSlotRemote.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
            return r3
        L_0x0029:
            java.lang.String r0 = "type"
            java.lang.Object r3 = r3.get(r0)
            kotlinx.serialization.json.JsonElement r3 = (kotlinx.serialization.json.JsonElement) r3
            if (r3 == 0) goto L_0x003d
            kotlinx.serialization.json.JsonPrimitive r3 = kK.j.j(r3)
            if (r3 == 0) goto L_0x003d
            java.lang.String r1 = r3.b()
        L_0x003d:
            if (r1 == 0) goto L_0x0083
            int r3 = r1.hashCode()
            r0 = -2041194529(0xffffffff8655d7df, float:-4.0219445E-35)
            if (r3 == r0) goto L_0x0073
            r0 = 1266473852(0x4b7cdb7c, float:1.657126E7)
            if (r3 == r0) goto L_0x0063
            r0 = 1535397632(0x5b844f00, float:7.4483117E16)
            if (r3 == r0) goto L_0x0053
            goto L_0x0083
        L_0x0053:
            java.lang.String r3 = "UNIQUE_SELLING_POINTS"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005c
            goto L_0x0083
        L_0x005c:
            com.ingka.ikea.room.impl.data.remote.UniqueSellingPointsRemote$a r3 = com.ingka.ikea.room.impl.data.remote.UniqueSellingPointsRemote.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
            goto L_0x0089
        L_0x0063:
            java.lang.String r3 = "ASSISTANCE_CARDS"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x006c
            goto L_0x0083
        L_0x006c:
            com.ingka.ikea.room.impl.data.remote.AssistanceCardsRemote$a r3 = com.ingka.ikea.room.impl.data.remote.AssistanceCardsRemote.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
            goto L_0x0089
        L_0x0073:
            java.lang.String r3 = "PRODUCT_LISTINGS"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x007c
            goto L_0x0083
        L_0x007c:
            com.ingka.ikea.room.impl.data.remote.ProductListingsRemote$a r3 = com.ingka.ikea.room.impl.data.remote.ProductListingsRemote.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
            goto L_0x0089
        L_0x0083:
            com.ingka.ikea.room.impl.data.remote.UnsupportedSlotRemote$a r3 = com.ingka.ikea.room.impl.data.remote.UnsupportedSlotRemote.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
        L_0x0089:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.room.impl.data.remote.a.b(kotlinx.serialization.json.JsonElement):fK.d");
    }
}
