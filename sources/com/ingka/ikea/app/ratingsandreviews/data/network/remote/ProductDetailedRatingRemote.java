package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import Mi.C10771f;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 +2\u00020\u0001:\u0002,\u0016B7\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&R \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010 \u0012\u0004\b*\u0010#\u001a\u0004\b)\u0010\u0019¨\u0006-"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ProductDetailedRatingRemote;", "", "", "seen0", "", "displayValue", "", "value", "label", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;FLjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ProductDetailedRatingRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LMi/f;", "a", "()LMi/f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayValue", "getDisplayValue$annotations", "()V", "F", "getValue", "()F", "getValue$annotations", "c", "getLabel", "getLabel$annotations", "Companion", "$serializer", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductDetailedRatingRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f91051a;

    /* renamed from: b  reason: collision with root package name */
    private final float f91052b;

    /* renamed from: c  reason: collision with root package name */
    private final String f91053c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ProductDetailedRatingRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ProductDetailedRatingRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductDetailedRatingRemote> serializer() {
            return ProductDetailedRatingRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductDetailedRatingRemote(int i10, String str, float f10, String str2, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ProductDetailedRatingRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f91051a = str;
        this.f91052b = f10;
        this.f91053c = str2;
    }

    public static final /* synthetic */ void b(ProductDetailedRatingRemote productDetailedRatingRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, productDetailedRatingRemote.f91051a);
        dVar.s(serialDescriptor, 1, productDetailedRatingRemote.f91052b);
        dVar.y(serialDescriptor, 2, productDetailedRatingRemote.f91053c);
    }

    public final C10771f a() {
        return new C10771f(this.f91051a, this.f91052b, this.f91053c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailedRatingRemote)) {
            return false;
        }
        ProductDetailedRatingRemote productDetailedRatingRemote = (ProductDetailedRatingRemote) obj;
        return C17542s.e(this.f91051a, productDetailedRatingRemote.f91051a) && Float.compare(this.f91052b, productDetailedRatingRemote.f91052b) == 0 && C17542s.e(this.f91053c, productDetailedRatingRemote.f91053c);
    }

    public int hashCode() {
        return (((this.f91051a.hashCode() * 31) + Float.hashCode(this.f91052b)) * 31) + this.f91053c.hashCode();
    }

    public String toString() {
        String str = this.f91051a;
        float f10 = this.f91052b;
        String str2 = this.f91053c;
        return "ProductDetailedRatingRemote(displayValue=" + str + ", value=" + f10 + ", label=" + str2 + ")";
    }
}
