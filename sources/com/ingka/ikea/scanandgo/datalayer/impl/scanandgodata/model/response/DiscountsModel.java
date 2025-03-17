package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u001eB5\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/DiscountsModel;", "", "", "seen0", "", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/IndividualDiscountsModel;", "individualDiscountsModel", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/Price;", "totalDiscountsModel", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/Price;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/DiscountsModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getIndividualDiscountsModel$annotations", "()V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/Price;", "c", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/Price;", "getTotalDiscountsModel$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiscountsModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f120011c = {new C17451f(IndividualDiscountsModel$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final List<IndividualDiscountsModel> f120012a;

    /* renamed from: b  reason: collision with root package name */
    private final Price f120013b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/DiscountsModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/DiscountsModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<DiscountsModel> serializer() {
            return DiscountsModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DiscountsModel(int i10, List list, Price price, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, DiscountsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120012a = list;
        this.f120013b = price;
    }

    public static final /* synthetic */ void d(DiscountsModel discountsModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, f120011c[0], discountsModel.f120012a);
        dVar.B(serialDescriptor, 1, Price$$serializer.INSTANCE, discountsModel.f120013b);
    }

    public final List<IndividualDiscountsModel> b() {
        return this.f120012a;
    }

    public final Price c() {
        return this.f120013b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountsModel)) {
            return false;
        }
        DiscountsModel discountsModel = (DiscountsModel) obj;
        return C17542s.e(this.f120012a, discountsModel.f120012a) && C17542s.e(this.f120013b, discountsModel.f120013b);
    }

    public int hashCode() {
        List<IndividualDiscountsModel> list = this.f120012a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Price price = this.f120013b;
        if (price != null) {
            i10 = price.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        List<IndividualDiscountsModel> list = this.f120012a;
        Price price = this.f120013b;
        return "DiscountsModel(individualDiscountsModel=" + list + ", totalDiscountsModel=" + price + ")";
    }
}
