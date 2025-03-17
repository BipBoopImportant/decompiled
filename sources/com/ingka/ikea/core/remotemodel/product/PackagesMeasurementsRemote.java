package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import com.ingka.ikea.core.model.product.PackagesMeasurements;
import com.ingka.ikea.core.remotemodel.InformationRemote;
import com.ingka.ikea.core.remotemodel.InformationRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-\"B5\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\t\u001a\u00020\b8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PackagesMeasurementsRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/PackagesMeasurements;", "", "seen0", "", "Lcom/ingka/ikea/core/remotemodel/InformationRemote;", "values", "Lcom/ingka/ikea/core/remotemodel/product/PackagesQuantityRemote;", "quantity", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lcom/ingka/ikea/core/remotemodel/product/PackagesQuantityRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/PackagesMeasurementsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lcom/ingka/ikea/core/model/product/PackagesMeasurements;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getValues$remote_model_release", "()Ljava/util/List;", "getValues$remote_model_release$annotations", "()V", "Lcom/ingka/ikea/core/remotemodel/product/PackagesQuantityRemote;", "getQuantity$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/PackagesQuantityRemote;", "getQuantity$remote_model_release$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackagesMeasurementsRemote implements C11768b<PackagesMeasurements> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f95337c = {new C17451f(InformationRemote$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final List<InformationRemote> f95338a;

    /* renamed from: b  reason: collision with root package name */
    private final PackagesQuantityRemote f95339b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PackagesMeasurementsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/PackagesMeasurementsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PackagesMeasurementsRemote> serializer() {
            return PackagesMeasurementsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PackagesMeasurementsRemote(int i10, List list, PackagesQuantityRemote packagesQuantityRemote, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, PackagesMeasurementsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95338a = list;
        this.f95339b = packagesQuantityRemote;
    }

    public static final /* synthetic */ void c(PackagesMeasurementsRemote packagesMeasurementsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f95337c[0], packagesMeasurementsRemote.f95338a);
        dVar.i(serialDescriptor, 1, PackagesQuantityRemote$$serializer.INSTANCE, packagesMeasurementsRemote.f95339b);
    }

    public PackagesMeasurements b() {
        Iterable<InformationRemote> iterable = this.f95338a;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (InformationRemote a10 : iterable) {
            arrayList.add(a10.a());
        }
        return new PackagesMeasurements(arrayList, this.f95339b.a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackagesMeasurementsRemote)) {
            return false;
        }
        PackagesMeasurementsRemote packagesMeasurementsRemote = (PackagesMeasurementsRemote) obj;
        return C17542s.e(this.f95338a, packagesMeasurementsRemote.f95338a) && C17542s.e(this.f95339b, packagesMeasurementsRemote.f95339b);
    }

    public int hashCode() {
        return (this.f95338a.hashCode() * 31) + this.f95339b.hashCode();
    }

    public String toString() {
        List<InformationRemote> list = this.f95338a;
        PackagesQuantityRemote packagesQuantityRemote = this.f95339b;
        return "PackagesMeasurementsRemote(values=" + list + ", quantity=" + packagesQuantityRemote + ")";
    }
}
