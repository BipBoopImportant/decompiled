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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\b\u0018\u0000 '2\u00020\u0001:\u0002(\u001dB7\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableHomeDeliveryFulfilmentRemoteModel;", "", "", "seen1", "", "available", "", "Lcom/ingka/ikea/app/caasremote/models/DeliveryTypeAndMethodsRemoteModel;", "deliveryTypes", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IZLjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/NullableHomeDeliveryFulfilmentRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getAvailable", "()Z", "getAvailable$annotations", "()V", "Ljava/util/List;", "getDeliveryTypes", "()Ljava/util/List;", "getDeliveryTypes$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableHomeDeliveryFulfilmentRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f71297c = {null, new C17451f(DeliveryTypeAndMethodsRemoteModel$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f71298a;

    /* renamed from: b  reason: collision with root package name */
    private final List<DeliveryTypeAndMethodsRemoteModel> f71299b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableHomeDeliveryFulfilmentRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableHomeDeliveryFulfilmentRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableHomeDeliveryFulfilmentRemoteModel> serializer() {
            return NullableHomeDeliveryFulfilmentRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableHomeDeliveryFulfilmentRemoteModel(int i10, boolean z10, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, NullableHomeDeliveryFulfilmentRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71298a = z10;
        this.f71299b = list;
    }

    public static final /* synthetic */ void b(NullableHomeDeliveryFulfilmentRemoteModel nullableHomeDeliveryFulfilmentRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71297c;
        dVar.x(serialDescriptor, 0, nullableHomeDeliveryFulfilmentRemoteModel.f71298a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], nullableHomeDeliveryFulfilmentRemoteModel.f71299b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableHomeDeliveryFulfilmentRemoteModel)) {
            return false;
        }
        NullableHomeDeliveryFulfilmentRemoteModel nullableHomeDeliveryFulfilmentRemoteModel = (NullableHomeDeliveryFulfilmentRemoteModel) obj;
        return this.f71298a == nullableHomeDeliveryFulfilmentRemoteModel.f71298a && C17542s.e(this.f71299b, nullableHomeDeliveryFulfilmentRemoteModel.f71299b);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f71298a) * 31;
        List<DeliveryTypeAndMethodsRemoteModel> list = this.f71299b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        boolean z10 = this.f71298a;
        List<DeliveryTypeAndMethodsRemoteModel> list = this.f71299b;
        return "NullableHomeDeliveryFulfilmentRemoteModel(available=" + z10 + ", deliveryTypes=" + list + ")";
    }
}
