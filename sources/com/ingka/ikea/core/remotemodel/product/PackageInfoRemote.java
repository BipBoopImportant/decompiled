package com.ingka.ikea.core.remotemodel.product;

import com.ingka.ikea.core.model.product.PackageInfoData;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 .2\u00020\u0001:\u0002/\u0017B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001aR \u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote;", "", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/product/ImageUrlRemote;", "image", "", "dimension", "Lcom/ingka/ikea/core/remotemodel/product/PackageDetailsRemote;", "packageDetails", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/product/ImageUrlRemote;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/product/PackageDetailsRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/PackageInfoData;", "a", "()Lcom/ingka/ikea/core/model/product/PackageInfoData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/core/remotemodel/product/ImageUrlRemote;", "getImage", "()Lcom/ingka/ikea/core/remotemodel/product/ImageUrlRemote;", "getImage$annotations", "()V", "Ljava/lang/String;", "getDimension", "getDimension$annotations", "c", "Lcom/ingka/ikea/core/remotemodel/product/PackageDetailsRemote;", "getPackageDetails", "()Lcom/ingka/ikea/core/remotemodel/product/PackageDetailsRemote;", "getPackageDetails$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackageInfoRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ImageUrlRemote f95332a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95333b;

    /* renamed from: c  reason: collision with root package name */
    private final PackageDetailsRemote f95334c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PackageInfoRemote> serializer() {
            return PackageInfoRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PackageInfoRemote(int i10, ImageUrlRemote imageUrlRemote, String str, PackageDetailsRemote packageDetailsRemote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, PackageInfoRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95332a = imageUrlRemote;
        this.f95333b = str;
        this.f95334c = packageDetailsRemote;
    }

    public static final /* synthetic */ void b(PackageInfoRemote packageInfoRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, ImageUrlRemote$$serializer.INSTANCE, packageInfoRemote.f95332a);
        dVar.y(serialDescriptor, 1, packageInfoRemote.f95333b);
        dVar.i(serialDescriptor, 2, PackageDetailsRemote$$serializer.INSTANCE, packageInfoRemote.f95334c);
    }

    public final PackageInfoData a() {
        return new PackageInfoData(this.f95332a.a(), this.f95333b, this.f95334c.b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageInfoRemote)) {
            return false;
        }
        PackageInfoRemote packageInfoRemote = (PackageInfoRemote) obj;
        return C17542s.e(this.f95332a, packageInfoRemote.f95332a) && C17542s.e(this.f95333b, packageInfoRemote.f95333b) && C17542s.e(this.f95334c, packageInfoRemote.f95334c);
    }

    public int hashCode() {
        return (((this.f95332a.hashCode() * 31) + this.f95333b.hashCode()) * 31) + this.f95334c.hashCode();
    }

    public String toString() {
        ImageUrlRemote imageUrlRemote = this.f95332a;
        String str = this.f95333b;
        PackageDetailsRemote packageDetailsRemote = this.f95334c;
        return "PackageInfoRemote(image=" + imageUrlRemote + ", dimension=" + str + ", packageDetails=" + packageDetailsRemote + ")";
    }
}
