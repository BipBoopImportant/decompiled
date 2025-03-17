package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u0011B3\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001c\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u001e¨\u0006&"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/NullableBasicPricePropertiesRemoteModel;", "subtotal", "unitPrice", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/NullableBasicPricePropertiesRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableBasicPricePropertiesRemoteModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/app/caasremote/models/NullableBasicPricePropertiesRemoteModel;", "getSubtotal", "()Lcom/ingka/ikea/app/caasremote/models/NullableBasicPricePropertiesRemoteModel;", "getSubtotal$annotations", "()V", "b", "getUnitPrice", "getUnitPrice$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableItemResponseInstallationServicePriceRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final NullableBasicPricePropertiesRemoteModel f71347a;

    /* renamed from: b  reason: collision with root package name */
    private final NullableBasicPricePropertiesRemoteModel f71348b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServicePriceRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableItemResponseInstallationServicePriceRemoteModel> serializer() {
            return NullableItemResponseInstallationServicePriceRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableItemResponseInstallationServicePriceRemoteModel(int i10, NullableBasicPricePropertiesRemoteModel nullableBasicPricePropertiesRemoteModel, NullableBasicPricePropertiesRemoteModel nullableBasicPricePropertiesRemoteModel2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, NullableItemResponseInstallationServicePriceRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71347a = nullableBasicPricePropertiesRemoteModel;
        this.f71348b = nullableBasicPricePropertiesRemoteModel2;
    }

    public static final /* synthetic */ void a(NullableItemResponseInstallationServicePriceRemoteModel nullableItemResponseInstallationServicePriceRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        NullableBasicPricePropertiesRemoteModel$$serializer nullableBasicPricePropertiesRemoteModel$$serializer = NullableBasicPricePropertiesRemoteModel$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 0, nullableBasicPricePropertiesRemoteModel$$serializer, nullableItemResponseInstallationServicePriceRemoteModel.f71347a);
        dVar.B(serialDescriptor, 1, nullableBasicPricePropertiesRemoteModel$$serializer, nullableItemResponseInstallationServicePriceRemoteModel.f71348b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableItemResponseInstallationServicePriceRemoteModel)) {
            return false;
        }
        NullableItemResponseInstallationServicePriceRemoteModel nullableItemResponseInstallationServicePriceRemoteModel = (NullableItemResponseInstallationServicePriceRemoteModel) obj;
        return C17542s.e(this.f71347a, nullableItemResponseInstallationServicePriceRemoteModel.f71347a) && C17542s.e(this.f71348b, nullableItemResponseInstallationServicePriceRemoteModel.f71348b);
    }

    public int hashCode() {
        NullableBasicPricePropertiesRemoteModel nullableBasicPricePropertiesRemoteModel = this.f71347a;
        int i10 = 0;
        int hashCode = (nullableBasicPricePropertiesRemoteModel == null ? 0 : nullableBasicPricePropertiesRemoteModel.hashCode()) * 31;
        NullableBasicPricePropertiesRemoteModel nullableBasicPricePropertiesRemoteModel2 = this.f71348b;
        if (nullableBasicPricePropertiesRemoteModel2 != null) {
            i10 = nullableBasicPricePropertiesRemoteModel2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        NullableBasicPricePropertiesRemoteModel nullableBasicPricePropertiesRemoteModel = this.f71347a;
        NullableBasicPricePropertiesRemoteModel nullableBasicPricePropertiesRemoteModel2 = this.f71348b;
        return "NullableItemResponseInstallationServicePriceRemoteModel(subtotal=" + nullableBasicPricePropertiesRemoteModel + ", unitPrice=" + nullableBasicPricePropertiesRemoteModel2 + ")";
    }
}
