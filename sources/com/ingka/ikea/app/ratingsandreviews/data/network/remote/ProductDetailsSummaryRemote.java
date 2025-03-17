package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import Mi.C10769d;
import Mi.C10772g;
import YH.C16877v;
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

@p
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 42\u00020\u0001:\u00025&BO\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0004¢\u0006\f\n\u0004\b\u001b\u0010*\u0012\u0004\b+\u0010)R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0004¢\u0006\f\n\u0004\b\u0018\u0010,\u0012\u0004\b-\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010)¨\u00066"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ProductDetailsSummaryRemote;", "", "", "seen0", "", "avgRating", "totalNbrOfRatings", "", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ProductDetailedRatingRemote;", "detailedRatings", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/LegalInfoRemote;", "ratingLegalInfo", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/VerifiedPurchaseRemote;", "verifiedPurchase", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IFILjava/util/List;Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/LegalInfoRemote;Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/VerifiedPurchaseRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ProductDetailsSummaryRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LMi/g;", "b", "()LMi/g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getAvgRating$annotations", "()V", "I", "getTotalNbrOfRatings$annotations", "Ljava/util/List;", "getDetailedRatings$annotations", "d", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/LegalInfoRemote;", "getRatingLegalInfo$annotations", "e", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/VerifiedPurchaseRemote;", "getVerifiedPurchase$annotations", "Companion", "$serializer", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductDetailsSummaryRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f91055f = 8;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer<Object>[] f91056g = {null, null, new C17451f(ProductDetailedRatingRemote$$serializer.INSTANCE), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final float f91057a;

    /* renamed from: b  reason: collision with root package name */
    private final int f91058b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ProductDetailedRatingRemote> f91059c;

    /* renamed from: d  reason: collision with root package name */
    private final LegalInfoRemote f91060d;

    /* renamed from: e  reason: collision with root package name */
    private final VerifiedPurchaseRemote f91061e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ProductDetailsSummaryRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ProductDetailsSummaryRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductDetailsSummaryRemote> serializer() {
            return ProductDetailsSummaryRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductDetailsSummaryRemote(int i10, float f10, int i11, List list, LegalInfoRemote legalInfoRemote, VerifiedPurchaseRemote verifiedPurchaseRemote, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, ProductDetailsSummaryRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f91057a = f10;
        this.f91058b = i11;
        this.f91059c = list;
        this.f91060d = legalInfoRemote;
        this.f91061e = verifiedPurchaseRemote;
    }

    public static final /* synthetic */ void c(ProductDetailsSummaryRemote productDetailsSummaryRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f91056g;
        dVar.s(serialDescriptor, 0, productDetailsSummaryRemote.f91057a);
        dVar.w(serialDescriptor, 1, productDetailsSummaryRemote.f91058b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], productDetailsSummaryRemote.f91059c);
        dVar.B(serialDescriptor, 3, LegalInfoRemote$$serializer.INSTANCE, productDetailsSummaryRemote.f91060d);
        dVar.B(serialDescriptor, 4, VerifiedPurchaseRemote$$serializer.INSTANCE, productDetailsSummaryRemote.f91061e);
    }

    public final C10772g b() {
        float f10 = this.f91057a;
        int i10 = this.f91058b;
        Iterable<ProductDetailedRatingRemote> iterable = this.f91059c;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ProductDetailedRatingRemote a10 : iterable) {
            arrayList.add(a10.a());
        }
        LegalInfoRemote legalInfoRemote = this.f91060d;
        C10769d a11 = legalInfoRemote != null ? legalInfoRemote.a() : null;
        VerifiedPurchaseRemote verifiedPurchaseRemote = this.f91061e;
        return new C10772g(f10, i10, arrayList, a11, verifiedPurchaseRemote != null ? verifiedPurchaseRemote.a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsSummaryRemote)) {
            return false;
        }
        ProductDetailsSummaryRemote productDetailsSummaryRemote = (ProductDetailsSummaryRemote) obj;
        return Float.compare(this.f91057a, productDetailsSummaryRemote.f91057a) == 0 && this.f91058b == productDetailsSummaryRemote.f91058b && C17542s.e(this.f91059c, productDetailsSummaryRemote.f91059c) && C17542s.e(this.f91060d, productDetailsSummaryRemote.f91060d) && C17542s.e(this.f91061e, productDetailsSummaryRemote.f91061e);
    }

    public int hashCode() {
        int hashCode = ((((Float.hashCode(this.f91057a) * 31) + Integer.hashCode(this.f91058b)) * 31) + this.f91059c.hashCode()) * 31;
        LegalInfoRemote legalInfoRemote = this.f91060d;
        int i10 = 0;
        int hashCode2 = (hashCode + (legalInfoRemote == null ? 0 : legalInfoRemote.hashCode())) * 31;
        VerifiedPurchaseRemote verifiedPurchaseRemote = this.f91061e;
        if (verifiedPurchaseRemote != null) {
            i10 = verifiedPurchaseRemote.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        float f10 = this.f91057a;
        int i10 = this.f91058b;
        List<ProductDetailedRatingRemote> list = this.f91059c;
        LegalInfoRemote legalInfoRemote = this.f91060d;
        VerifiedPurchaseRemote verifiedPurchaseRemote = this.f91061e;
        return "ProductDetailsSummaryRemote(avgRating=" + f10 + ", totalNbrOfRatings=" + i10 + ", detailedRatings=" + list + ", ratingLegalInfo=" + legalInfoRemote + ", verifiedPurchase=" + verifiedPurchaseRemote + ")";
    }
}
