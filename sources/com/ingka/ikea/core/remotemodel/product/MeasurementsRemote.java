package com.ingka.ikea.core.remotemodel.product;

import com.ingka.ikea.core.model.product.Measurements;
import com.ingka.ikea.core.model.product.ProductMeasurements;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00020\u0017B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0006\u001a\u00020\u00058\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010%\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/MeasurementsRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/Measurements;", "", "seen0", "", "title", "Lcom/ingka/ikea/core/remotemodel/product/ProductMeasurementsRemote;", "productMeasurements", "Lcom/ingka/ikea/core/remotemodel/product/PackagingRemote;", "packaging", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/core/remotemodel/product/ProductMeasurementsRemote;Lcom/ingka/ikea/core/remotemodel/product/PackagingRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/product/MeasurementsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lcom/ingka/ikea/core/model/product/Measurements;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle$remote_model_release", "getTitle$remote_model_release$annotations", "()V", "Lcom/ingka/ikea/core/remotemodel/product/ProductMeasurementsRemote;", "getProductMeasurements$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/ProductMeasurementsRemote;", "getProductMeasurements$remote_model_release$annotations", "c", "Lcom/ingka/ikea/core/remotemodel/product/PackagingRemote;", "getPackaging$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/PackagingRemote;", "getPackaging$remote_model_release$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MeasurementsRemote implements C11768b<Measurements> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95301a;

    /* renamed from: b  reason: collision with root package name */
    private final ProductMeasurementsRemote f95302b;

    /* renamed from: c  reason: collision with root package name */
    private final PackagingRemote f95303c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/MeasurementsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/MeasurementsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MeasurementsRemote> serializer() {
            return MeasurementsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MeasurementsRemote(int i10, String str, ProductMeasurementsRemote productMeasurementsRemote, PackagingRemote packagingRemote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, MeasurementsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95301a = str;
        this.f95302b = productMeasurementsRemote;
        this.f95303c = packagingRemote;
    }

    public static final /* synthetic */ void b(MeasurementsRemote measurementsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, measurementsRemote.f95301a);
        dVar.i(serialDescriptor, 1, ProductMeasurementsRemote$$serializer.INSTANCE, measurementsRemote.f95302b);
        dVar.B(serialDescriptor, 2, PackagingRemote$$serializer.INSTANCE, measurementsRemote.f95303c);
    }

    public Measurements a() {
        String str = this.f95301a;
        ProductMeasurements b10 = this.f95302b.b();
        PackagingRemote packagingRemote = this.f95303c;
        return new Measurements(str, b10, packagingRemote != null ? packagingRemote.b() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeasurementsRemote)) {
            return false;
        }
        MeasurementsRemote measurementsRemote = (MeasurementsRemote) obj;
        return C17542s.e(this.f95301a, measurementsRemote.f95301a) && C17542s.e(this.f95302b, measurementsRemote.f95302b) && C17542s.e(this.f95303c, measurementsRemote.f95303c);
    }

    public int hashCode() {
        int hashCode = ((this.f95301a.hashCode() * 31) + this.f95302b.hashCode()) * 31;
        PackagingRemote packagingRemote = this.f95303c;
        return hashCode + (packagingRemote == null ? 0 : packagingRemote.hashCode());
    }

    public String toString() {
        String str = this.f95301a;
        ProductMeasurementsRemote productMeasurementsRemote = this.f95302b;
        PackagingRemote packagingRemote = this.f95303c;
        return "MeasurementsRemote(title=" + str + ", productMeasurements=" + productMeasurementsRemote + ", packaging=" + packagingRemote + ")";
    }
}
