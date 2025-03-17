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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u001dB3\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010!\u001a\u0004\b\"\u0010$¨\u0006("}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemResponsePriceRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/ItemSubtotalResponseRemoteModel;", "subtotal", "Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;", "unitPrice", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/ItemSubtotalResponseRemoteModel;Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/caasremote/models/NullableItemResponsePriceRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/ItemSubtotalResponseRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/ItemSubtotalResponseRemoteModel;", "getSubtotal$annotations", "()V", "b", "Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;", "getUnitPrice$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableItemResponsePriceRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ItemSubtotalResponseRemoteModel f71356a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemUnitPriceRemoteModel f71357b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemResponsePriceRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponsePriceRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableItemResponsePriceRemoteModel> serializer() {
            return NullableItemResponsePriceRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableItemResponsePriceRemoteModel(int i10, ItemSubtotalResponseRemoteModel itemSubtotalResponseRemoteModel, ItemUnitPriceRemoteModel itemUnitPriceRemoteModel, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, NullableItemResponsePriceRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71356a = itemSubtotalResponseRemoteModel;
        this.f71357b = itemUnitPriceRemoteModel;
    }

    public static final /* synthetic */ void c(NullableItemResponsePriceRemoteModel nullableItemResponsePriceRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, ItemSubtotalResponseRemoteModel$$serializer.INSTANCE, nullableItemResponsePriceRemoteModel.f71356a);
        dVar.i(serialDescriptor, 1, ItemUnitPriceRemoteModel$$serializer.INSTANCE, nullableItemResponsePriceRemoteModel.f71357b);
    }

    public final ItemSubtotalResponseRemoteModel a() {
        return this.f71356a;
    }

    public final ItemUnitPriceRemoteModel b() {
        return this.f71357b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableItemResponsePriceRemoteModel)) {
            return false;
        }
        NullableItemResponsePriceRemoteModel nullableItemResponsePriceRemoteModel = (NullableItemResponsePriceRemoteModel) obj;
        return C17542s.e(this.f71356a, nullableItemResponsePriceRemoteModel.f71356a) && C17542s.e(this.f71357b, nullableItemResponsePriceRemoteModel.f71357b);
    }

    public int hashCode() {
        return (this.f71356a.hashCode() * 31) + this.f71357b.hashCode();
    }

    public String toString() {
        ItemSubtotalResponseRemoteModel itemSubtotalResponseRemoteModel = this.f71356a;
        ItemUnitPriceRemoteModel itemUnitPriceRemoteModel = this.f71357b;
        return "NullableItemResponsePriceRemoteModel(subtotal=" + itemSubtotalResponseRemoteModel + ", unitPrice=" + itemUnitPriceRemoteModel + ")";
    }
}
