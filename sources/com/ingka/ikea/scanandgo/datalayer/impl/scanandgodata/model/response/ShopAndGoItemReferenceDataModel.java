package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001bB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010\u001e\u001a\u0004\b\u001f\u0010!¨\u0006%"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoItemReferenceDataModel;", "", "", "seen0", "", "barcode", "quantity", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoItemReferenceDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBarcode$annotations", "()V", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getQuantity$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShopAndGoItemReferenceDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120101a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f120102b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoItemReferenceDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoItemReferenceDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ShopAndGoItemReferenceDataModel> serializer() {
            return ShopAndGoItemReferenceDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShopAndGoItemReferenceDataModel(int i10, String str, Integer num, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ShopAndGoItemReferenceDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120101a = str;
        this.f120102b = num;
    }

    public static final /* synthetic */ void c(ShopAndGoItemReferenceDataModel shopAndGoItemReferenceDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, Y0.f144077a, shopAndGoItemReferenceDataModel.f120101a);
        dVar.B(serialDescriptor, 1, X.f144073a, shopAndGoItemReferenceDataModel.f120102b);
    }

    public final String a() {
        return this.f120101a;
    }

    public final Integer b() {
        return this.f120102b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopAndGoItemReferenceDataModel)) {
            return false;
        }
        ShopAndGoItemReferenceDataModel shopAndGoItemReferenceDataModel = (ShopAndGoItemReferenceDataModel) obj;
        return C17542s.e(this.f120101a, shopAndGoItemReferenceDataModel.f120101a) && C17542s.e(this.f120102b, shopAndGoItemReferenceDataModel.f120102b);
    }

    public int hashCode() {
        String str = this.f120101a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f120102b;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f120101a;
        Integer num = this.f120102b;
        return "ShopAndGoItemReferenceDataModel(barcode=" + str + ", quantity=" + num + ")";
    }
}
