package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import com.ingka.ikea.core.remotemodel.product.MoreInfoRemote;
import com.ingka.ikea.core.remotemodel.product.MoreInfoRemote$$serializer;
import com.ingka.ikea.core.remotemodel.product.PackageInfoRemote;
import com.ingka.ikea.core.remotemodel.product.PackageInfoRemote$$serializer;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-\u001fB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010)\u0012\u0004\b+\u0010$\u001a\u0004\b\u001f\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductDetailsRemote;", "", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;", "moreInfo", "Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote;", "packageInfo", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationMeasurementsRemote;", "measurements", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationMeasurementsRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductDetailsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;", "b", "()Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;", "getMoreInfo$annotations", "()V", "Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote;", "c", "()Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote;", "getPackageInfo$annotations", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationMeasurementsRemote;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationMeasurementsRemote;", "getMeasurements$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CombinationProductDetailsRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final MoreInfoRemote f119997a;

    /* renamed from: b  reason: collision with root package name */
    private final PackageInfoRemote f119998b;

    /* renamed from: c  reason: collision with root package name */
    private final CombinationMeasurementsRemote f119999c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductDetailsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductDetailsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CombinationProductDetailsRemote> serializer() {
            return CombinationProductDetailsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CombinationProductDetailsRemote(int i10, MoreInfoRemote moreInfoRemote, PackageInfoRemote packageInfoRemote, CombinationMeasurementsRemote combinationMeasurementsRemote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, CombinationProductDetailsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119997a = moreInfoRemote;
        this.f119998b = packageInfoRemote;
        this.f119999c = combinationMeasurementsRemote;
    }

    public static final /* synthetic */ void d(CombinationProductDetailsRemote combinationProductDetailsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, MoreInfoRemote$$serializer.INSTANCE, combinationProductDetailsRemote.f119997a);
        dVar.i(serialDescriptor, 1, PackageInfoRemote$$serializer.INSTANCE, combinationProductDetailsRemote.f119998b);
        dVar.i(serialDescriptor, 2, CombinationMeasurementsRemote$$serializer.INSTANCE, combinationProductDetailsRemote.f119999c);
    }

    public final CombinationMeasurementsRemote a() {
        return this.f119999c;
    }

    public final MoreInfoRemote b() {
        return this.f119997a;
    }

    public final PackageInfoRemote c() {
        return this.f119998b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinationProductDetailsRemote)) {
            return false;
        }
        CombinationProductDetailsRemote combinationProductDetailsRemote = (CombinationProductDetailsRemote) obj;
        return C17542s.e(this.f119997a, combinationProductDetailsRemote.f119997a) && C17542s.e(this.f119998b, combinationProductDetailsRemote.f119998b) && C17542s.e(this.f119999c, combinationProductDetailsRemote.f119999c);
    }

    public int hashCode() {
        return (((this.f119997a.hashCode() * 31) + this.f119998b.hashCode()) * 31) + this.f119999c.hashCode();
    }

    public String toString() {
        MoreInfoRemote moreInfoRemote = this.f119997a;
        PackageInfoRemote packageInfoRemote = this.f119998b;
        CombinationMeasurementsRemote combinationMeasurementsRemote = this.f119999c;
        return "CombinationProductDetailsRemote(moreInfo=" + moreInfoRemote + ", packageInfo=" + packageInfoRemote + ", measurements=" + combinationMeasurementsRemote + ")";
    }
}
