package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u001dB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b\u001d\u0010$¨\u0006("}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/BuyingDecisionSectionDataModel;", "", "", "seen0", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "quantityPicker", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AddToCartButtonDataModel;", "addToCartButton", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AddToCartButtonDataModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/BuyingDecisionSectionDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "b", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "getQuantityPicker$annotations", "()V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AddToCartButtonDataModel;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AddToCartButtonDataModel;", "getAddToCartButton$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BuyingDecisionSectionDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final QuantityPickerDataModel f119957a;

    /* renamed from: b  reason: collision with root package name */
    private final AddToCartButtonDataModel f119958b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/BuyingDecisionSectionDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/BuyingDecisionSectionDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<BuyingDecisionSectionDataModel> serializer() {
            return BuyingDecisionSectionDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BuyingDecisionSectionDataModel(int i10, QuantityPickerDataModel quantityPickerDataModel, AddToCartButtonDataModel addToCartButtonDataModel, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, BuyingDecisionSectionDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f119957a = quantityPickerDataModel;
        this.f119958b = addToCartButtonDataModel;
    }

    public static final /* synthetic */ void c(BuyingDecisionSectionDataModel buyingDecisionSectionDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, QuantityPickerDataModel$$serializer.INSTANCE, buyingDecisionSectionDataModel.f119957a);
        dVar.B(serialDescriptor, 1, AddToCartButtonDataModel$$serializer.INSTANCE, buyingDecisionSectionDataModel.f119958b);
    }

    public final AddToCartButtonDataModel a() {
        return this.f119958b;
    }

    public final QuantityPickerDataModel b() {
        return this.f119957a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyingDecisionSectionDataModel)) {
            return false;
        }
        BuyingDecisionSectionDataModel buyingDecisionSectionDataModel = (BuyingDecisionSectionDataModel) obj;
        return C17542s.e(this.f119957a, buyingDecisionSectionDataModel.f119957a) && C17542s.e(this.f119958b, buyingDecisionSectionDataModel.f119958b);
    }

    public int hashCode() {
        QuantityPickerDataModel quantityPickerDataModel = this.f119957a;
        int i10 = 0;
        int hashCode = (quantityPickerDataModel == null ? 0 : quantityPickerDataModel.hashCode()) * 31;
        AddToCartButtonDataModel addToCartButtonDataModel = this.f119958b;
        if (addToCartButtonDataModel != null) {
            i10 = addToCartButtonDataModel.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        QuantityPickerDataModel quantityPickerDataModel = this.f119957a;
        AddToCartButtonDataModel addToCartButtonDataModel = this.f119958b;
        return "BuyingDecisionSectionDataModel(quantityPicker=" + quantityPickerDataModel + ", addToCartButton=" + addToCartButtonDataModel + ")";
    }
}
