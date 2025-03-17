package com.ingka.ikea.core.remotemodel.product;

import com.ingka.ikea.core.model.inspiration.Coordinates;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mp.C11589b;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+\u0015B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductWithCoordinatesRemote;", "Lpp/b;", "Lmp/b;", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/product/CoordinatesRemoteV6;", "coordinates", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "product", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/product/CoordinatesRemoteV6;Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/product/ProductWithCoordinatesRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lmp/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/core/remotemodel/product/CoordinatesRemoteV6;", "getCoordinates", "()Lcom/ingka/ikea/core/remotemodel/product/CoordinatesRemoteV6;", "getCoordinates$annotations", "()V", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "getProduct", "()Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "getProduct$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductWithCoordinatesRemote implements C11768b<C11589b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatesRemoteV6 f95424a;

    /* renamed from: b  reason: collision with root package name */
    private final ProductLiteRemote f95425b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductWithCoordinatesRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/ProductWithCoordinatesRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductWithCoordinatesRemote> serializer() {
            return ProductWithCoordinatesRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductWithCoordinatesRemote(int i10, CoordinatesRemoteV6 coordinatesRemoteV6, ProductLiteRemote productLiteRemote, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ProductWithCoordinatesRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95424a = coordinatesRemoteV6;
        this.f95425b = productLiteRemote;
    }

    public static final /* synthetic */ void b(ProductWithCoordinatesRemote productWithCoordinatesRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, CoordinatesRemoteV6$$serializer.INSTANCE, productWithCoordinatesRemote.f95424a);
        dVar.B(serialDescriptor, 1, ProductLiteRemote$$serializer.INSTANCE, productWithCoordinatesRemote.f95425b);
    }

    public C11589b a() {
        CoordinatesRemoteV6 coordinatesRemoteV6 = this.f95424a;
        Coordinates a10 = coordinatesRemoteV6 != null ? coordinatesRemoteV6.a() : null;
        ProductLiteRemote productLiteRemote = this.f95425b;
        if (productLiteRemote != null) {
            return new C11589b(a10, productLiteRemote.s());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductWithCoordinatesRemote)) {
            return false;
        }
        ProductWithCoordinatesRemote productWithCoordinatesRemote = (ProductWithCoordinatesRemote) obj;
        return C17542s.e(this.f95424a, productWithCoordinatesRemote.f95424a) && C17542s.e(this.f95425b, productWithCoordinatesRemote.f95425b);
    }

    public int hashCode() {
        CoordinatesRemoteV6 coordinatesRemoteV6 = this.f95424a;
        int i10 = 0;
        int hashCode = (coordinatesRemoteV6 == null ? 0 : coordinatesRemoteV6.hashCode()) * 31;
        ProductLiteRemote productLiteRemote = this.f95425b;
        if (productLiteRemote != null) {
            i10 = productLiteRemote.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        CoordinatesRemoteV6 coordinatesRemoteV6 = this.f95424a;
        ProductLiteRemote productLiteRemote = this.f95425b;
        return "ProductWithCoordinatesRemote(coordinates=" + coordinatesRemoteV6 + ", product=" + productLiteRemote + ")";
    }
}
