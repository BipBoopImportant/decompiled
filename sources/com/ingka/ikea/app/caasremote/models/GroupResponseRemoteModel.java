package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 62\u00020\u0001:\u00027\"Ba\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001bR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010#\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010%R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010'\u001a\u0004\b/\u00100R \u0010\r\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b5\u0010'\u001a\u0004\b4\u0010\u001d¨\u00068"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/GroupResponseRemoteModel;", "", "", "seen1", "", "Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel;", "items", "", "name", "Lcom/ingka/ikea/app/caasremote/models/PlanResponseRemoteModel;", "plans", "Lcom/ingka/ikea/app/caasremote/models/NullableGroupResponsePriceRemoteModel;", "price", "quantity", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/app/caasremote/models/NullableGroupResponsePriceRemoteModel;ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/caasremote/models/GroupResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getItems$annotations", "()V", "Ljava/lang/String;", "getName", "getName$annotations", "getPlans", "getPlans$annotations", "d", "Lcom/ingka/ikea/app/caasremote/models/NullableGroupResponsePriceRemoteModel;", "getPrice", "()Lcom/ingka/ikea/app/caasremote/models/NullableGroupResponsePriceRemoteModel;", "getPrice$annotations", "e", "I", "getQuantity", "getQuantity$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GroupResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f71145f = {new C17451f(ItemResponseRemoteModel$$serializer.INSTANCE), null, new C17451f(PlanResponseRemoteModel$$serializer.INSTANCE), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<ItemResponseRemoteModel> f71146a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71147b;

    /* renamed from: c  reason: collision with root package name */
    private final List<PlanResponseRemoteModel> f71148c;

    /* renamed from: d  reason: collision with root package name */
    private final NullableGroupResponsePriceRemoteModel f71149d;

    /* renamed from: e  reason: collision with root package name */
    private final int f71150e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/GroupResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/GroupResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupResponseRemoteModel> serializer() {
            return GroupResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ GroupResponseRemoteModel(int i10, List list, String str, List list2, NullableGroupResponsePriceRemoteModel nullableGroupResponsePriceRemoteModel, int i11, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, GroupResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71146a = list;
        this.f71147b = str;
        this.f71148c = list2;
        this.f71149d = nullableGroupResponsePriceRemoteModel;
        this.f71150e = i11;
    }

    public static final /* synthetic */ void c(GroupResponseRemoteModel groupResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71145f;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], groupResponseRemoteModel.f71146a);
        dVar.y(serialDescriptor, 1, groupResponseRemoteModel.f71147b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], groupResponseRemoteModel.f71148c);
        dVar.B(serialDescriptor, 3, NullableGroupResponsePriceRemoteModel$$serializer.INSTANCE, groupResponseRemoteModel.f71149d);
        dVar.w(serialDescriptor, 4, groupResponseRemoteModel.f71150e);
    }

    public final List<ItemResponseRemoteModel> b() {
        return this.f71146a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupResponseRemoteModel)) {
            return false;
        }
        GroupResponseRemoteModel groupResponseRemoteModel = (GroupResponseRemoteModel) obj;
        return C17542s.e(this.f71146a, groupResponseRemoteModel.f71146a) && C17542s.e(this.f71147b, groupResponseRemoteModel.f71147b) && C17542s.e(this.f71148c, groupResponseRemoteModel.f71148c) && C17542s.e(this.f71149d, groupResponseRemoteModel.f71149d) && this.f71150e == groupResponseRemoteModel.f71150e;
    }

    public int hashCode() {
        int hashCode = ((((this.f71146a.hashCode() * 31) + this.f71147b.hashCode()) * 31) + this.f71148c.hashCode()) * 31;
        NullableGroupResponsePriceRemoteModel nullableGroupResponsePriceRemoteModel = this.f71149d;
        return ((hashCode + (nullableGroupResponsePriceRemoteModel == null ? 0 : nullableGroupResponsePriceRemoteModel.hashCode())) * 31) + Integer.hashCode(this.f71150e);
    }

    public String toString() {
        List<ItemResponseRemoteModel> list = this.f71146a;
        String str = this.f71147b;
        List<PlanResponseRemoteModel> list2 = this.f71148c;
        NullableGroupResponsePriceRemoteModel nullableGroupResponsePriceRemoteModel = this.f71149d;
        int i10 = this.f71150e;
        return "GroupResponseRemoteModel(items=" + list + ", name=" + str + ", plans=" + list2 + ", price=" + nullableGroupResponsePriceRemoteModel + ", quantity=" + i10 + ")";
    }
}
