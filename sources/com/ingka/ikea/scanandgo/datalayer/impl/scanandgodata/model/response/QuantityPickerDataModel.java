package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\b\u0018\u0000 +2\u00020\u0001:\u0002,\u001eB/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\"\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010$\u0012\u0004\b(\u0010\"\u001a\u0004\b#\u0010&R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010$\u0012\u0004\b*\u0010\"\u001a\u0004\b)\u0010&¨\u0006-"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "", "", "enabled", "", "min", "max", "selected", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getEnabled$annotations", "()V", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "getMin$annotations", "getMax$annotations", "d", "getSelected$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuantityPickerDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f120053a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f120054b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f120055c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f120056d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<QuantityPickerDataModel> serializer() {
            return QuantityPickerDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ QuantityPickerDataModel(int i10, Boolean bool, Integer num, Integer num2, Integer num3, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, QuantityPickerDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120053a = bool;
        this.f120054b = num;
        this.f120055c = num2;
        this.f120056d = num3;
    }

    public static final /* synthetic */ void e(QuantityPickerDataModel quantityPickerDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, C17457i.f144111a, quantityPickerDataModel.f120053a);
        X x10 = X.f144073a;
        dVar.B(serialDescriptor, 1, x10, quantityPickerDataModel.f120054b);
        dVar.B(serialDescriptor, 2, x10, quantityPickerDataModel.f120055c);
        dVar.B(serialDescriptor, 3, x10, quantityPickerDataModel.f120056d);
    }

    public final Boolean a() {
        return this.f120053a;
    }

    public final Integer b() {
        return this.f120055c;
    }

    public final Integer c() {
        return this.f120054b;
    }

    public final Integer d() {
        return this.f120056d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuantityPickerDataModel)) {
            return false;
        }
        QuantityPickerDataModel quantityPickerDataModel = (QuantityPickerDataModel) obj;
        return C17542s.e(this.f120053a, quantityPickerDataModel.f120053a) && C17542s.e(this.f120054b, quantityPickerDataModel.f120054b) && C17542s.e(this.f120055c, quantityPickerDataModel.f120055c) && C17542s.e(this.f120056d, quantityPickerDataModel.f120056d);
    }

    public int hashCode() {
        Boolean bool = this.f120053a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f120054b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f120055c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f120056d;
        if (num3 != null) {
            i10 = num3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        Boolean bool = this.f120053a;
        Integer num = this.f120054b;
        Integer num2 = this.f120055c;
        Integer num3 = this.f120056d;
        return "QuantityPickerDataModel(enabled=" + bool + ", min=" + num + ", max=" + num2 + ", selected=" + num3 + ")";
    }

    public QuantityPickerDataModel(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.f120053a = bool;
        this.f120054b = num;
        this.f120055c = num2;
        this.f120056d = num3;
    }
}
