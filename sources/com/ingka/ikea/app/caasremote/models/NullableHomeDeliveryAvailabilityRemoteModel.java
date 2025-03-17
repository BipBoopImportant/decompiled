package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\b\u0018\u0000 62\u00020\u0001:\u00027!B[\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010\u001bR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u00103\u0012\u0004\b5\u0010&\u001a\u0004\b/\u00104¨\u00068"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableHomeDeliveryAvailabilityRemoteModel;", "", "", "seen1", "", "availableForHomeDelivery", "", "availableQuantity", "", "Lcom/ingka/ikea/app/caasremote/models/ChildItemAvailabilityRemoteModel;", "childItems", "", "deliveryType", "limitedDeliveryMethod", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IZLjava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/app/caasremote/models/NullableHomeDeliveryAvailabilityRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "getAvailableForHomeDelivery$annotations", "()V", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "getAvailableQuantity$annotations", "Ljava/util/List;", "getChildItems", "()Ljava/util/List;", "getChildItems$annotations", "d", "Ljava/lang/String;", "getDeliveryType", "getDeliveryType$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getLimitedDeliveryMethod$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableHomeDeliveryAvailabilityRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f71291f = {null, null, new C17451f(ChildItemAvailabilityRemoteModel$$serializer.INSTANCE), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f71292a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f71293b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ChildItemAvailabilityRemoteModel> f71294c;

    /* renamed from: d  reason: collision with root package name */
    private final String f71295d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f71296e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableHomeDeliveryAvailabilityRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableHomeDeliveryAvailabilityRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableHomeDeliveryAvailabilityRemoteModel> serializer() {
            return NullableHomeDeliveryAvailabilityRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableHomeDeliveryAvailabilityRemoteModel(int i10, boolean z10, Double d10, List list, String str, Boolean bool, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, NullableHomeDeliveryAvailabilityRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71292a = z10;
        this.f71293b = d10;
        this.f71294c = list;
        this.f71295d = str;
        this.f71296e = bool;
    }

    public static final /* synthetic */ void e(NullableHomeDeliveryAvailabilityRemoteModel nullableHomeDeliveryAvailabilityRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71291f;
        dVar.x(serialDescriptor, 0, nullableHomeDeliveryAvailabilityRemoteModel.f71292a);
        dVar.B(serialDescriptor, 1, C17438C.f144010a, nullableHomeDeliveryAvailabilityRemoteModel.f71293b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], nullableHomeDeliveryAvailabilityRemoteModel.f71294c);
        dVar.B(serialDescriptor, 3, Y0.f144077a, nullableHomeDeliveryAvailabilityRemoteModel.f71295d);
        dVar.B(serialDescriptor, 4, C17457i.f144111a, nullableHomeDeliveryAvailabilityRemoteModel.f71296e);
    }

    public final boolean b() {
        return this.f71292a;
    }

    public final Double c() {
        return this.f71293b;
    }

    public final Boolean d() {
        return this.f71296e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableHomeDeliveryAvailabilityRemoteModel)) {
            return false;
        }
        NullableHomeDeliveryAvailabilityRemoteModel nullableHomeDeliveryAvailabilityRemoteModel = (NullableHomeDeliveryAvailabilityRemoteModel) obj;
        return this.f71292a == nullableHomeDeliveryAvailabilityRemoteModel.f71292a && C17542s.e(this.f71293b, nullableHomeDeliveryAvailabilityRemoteModel.f71293b) && C17542s.e(this.f71294c, nullableHomeDeliveryAvailabilityRemoteModel.f71294c) && C17542s.e(this.f71295d, nullableHomeDeliveryAvailabilityRemoteModel.f71295d) && C17542s.e(this.f71296e, nullableHomeDeliveryAvailabilityRemoteModel.f71296e);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f71292a) * 31;
        Double d10 = this.f71293b;
        int i10 = 0;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        List<ChildItemAvailabilityRemoteModel> list = this.f71294c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f71295d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f71296e;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        boolean z10 = this.f71292a;
        Double d10 = this.f71293b;
        List<ChildItemAvailabilityRemoteModel> list = this.f71294c;
        String str = this.f71295d;
        Boolean bool = this.f71296e;
        return "NullableHomeDeliveryAvailabilityRemoteModel(availableForHomeDelivery=" + z10 + ", availableQuantity=" + d10 + ", childItems=" + list + ", deliveryType=" + str + ", limitedDeliveryMethod=" + bool + ")";
    }
}
