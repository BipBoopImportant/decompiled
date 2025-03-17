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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0015R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010!\u0012\u0004\b#\u0010 \u001a\u0004\b\u001c\u0010\"¨\u0006&"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationMeasurementsRemote;", "", "", "seen0", "", "title", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductMeasurementRemote;", "product", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductMeasurementRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationMeasurementsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getTitle$annotations", "()V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductMeasurementRemote;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductMeasurementRemote;", "getProduct$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CombinationMeasurementsRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f119989a;

    /* renamed from: b  reason: collision with root package name */
    private final CombinationProductMeasurementRemote f119990b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationMeasurementsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationMeasurementsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CombinationMeasurementsRemote> serializer() {
            return CombinationMeasurementsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CombinationMeasurementsRemote(int i10, String str, CombinationProductMeasurementRemote combinationProductMeasurementRemote, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, CombinationMeasurementsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119989a = str;
        this.f119990b = combinationProductMeasurementRemote;
    }

    public static final /* synthetic */ void c(CombinationMeasurementsRemote combinationMeasurementsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, combinationMeasurementsRemote.f119989a);
        dVar.i(serialDescriptor, 1, CombinationProductMeasurementRemote$$serializer.INSTANCE, combinationMeasurementsRemote.f119990b);
    }

    public final CombinationProductMeasurementRemote a() {
        return this.f119990b;
    }

    public final String b() {
        return this.f119989a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinationMeasurementsRemote)) {
            return false;
        }
        CombinationMeasurementsRemote combinationMeasurementsRemote = (CombinationMeasurementsRemote) obj;
        return C17542s.e(this.f119989a, combinationMeasurementsRemote.f119989a) && C17542s.e(this.f119990b, combinationMeasurementsRemote.f119990b);
    }

    public int hashCode() {
        return (this.f119989a.hashCode() * 31) + this.f119990b.hashCode();
    }

    public String toString() {
        String str = this.f119989a;
        CombinationProductMeasurementRemote combinationProductMeasurementRemote = this.f119990b;
        return "CombinationMeasurementsRemote(title=" + str + ", product=" + combinationProductMeasurementRemote + ")";
    }
}
