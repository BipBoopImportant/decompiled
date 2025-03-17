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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-\u001eBC\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&R \u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010#\u001a\u0004\b*\u0010\u0018¨\u0006."}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ChildItemAvailabilityRemoteModel;", "", "", "seen1", "", "available", "", "Lcom/ingka/ikea/app/caasremote/models/ChildItemDeliveryMethodRemoteModel;", "deliveryMethods", "", "itemNo", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IZLjava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/ChildItemAvailabilityRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getAvailable", "()Z", "getAvailable$annotations", "()V", "Ljava/util/List;", "getDeliveryMethods", "()Ljava/util/List;", "getDeliveryMethods$annotations", "c", "Ljava/lang/String;", "getItemNo", "getItemNo$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChildItemAvailabilityRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f71101d = {null, new C17451f(ChildItemDeliveryMethodRemoteModel$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f71102a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ChildItemDeliveryMethodRemoteModel> f71103b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71104c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ChildItemAvailabilityRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/ChildItemAvailabilityRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChildItemAvailabilityRemoteModel> serializer() {
            return ChildItemAvailabilityRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ ChildItemAvailabilityRemoteModel(int i10, boolean z10, List list, String str, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ChildItemAvailabilityRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71102a = z10;
        this.f71103b = list;
        this.f71104c = str;
    }

    public static final /* synthetic */ void b(ChildItemAvailabilityRemoteModel childItemAvailabilityRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71101d;
        dVar.x(serialDescriptor, 0, childItemAvailabilityRemoteModel.f71102a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], childItemAvailabilityRemoteModel.f71103b);
        dVar.y(serialDescriptor, 2, childItemAvailabilityRemoteModel.f71104c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildItemAvailabilityRemoteModel)) {
            return false;
        }
        ChildItemAvailabilityRemoteModel childItemAvailabilityRemoteModel = (ChildItemAvailabilityRemoteModel) obj;
        return this.f71102a == childItemAvailabilityRemoteModel.f71102a && C17542s.e(this.f71103b, childItemAvailabilityRemoteModel.f71103b) && C17542s.e(this.f71104c, childItemAvailabilityRemoteModel.f71104c);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f71102a) * 31;
        List<ChildItemDeliveryMethodRemoteModel> list = this.f71103b;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f71104c.hashCode();
    }

    public String toString() {
        boolean z10 = this.f71102a;
        List<ChildItemDeliveryMethodRemoteModel> list = this.f71103b;
        String str = this.f71104c;
        return "ChildItemAvailabilityRemoteModel(available=" + z10 + ", deliveryMethods=" + list + ", itemNo=" + str + ")";
    }
}
