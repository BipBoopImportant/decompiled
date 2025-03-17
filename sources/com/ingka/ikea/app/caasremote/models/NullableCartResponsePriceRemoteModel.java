package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001c\b\b\u0018\u0000 <2\u00020\u0001:\u0002=%Bu\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010)\u001a\u0004\b,\u0010-R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010)\u001a\u0004\b1\u00102R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u00100\u0012\u0004\b5\u0010)\u001a\u0004\b4\u00102R \u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b9\u0010)\u001a\u0004\b*\u00108R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u00100\u0012\u0004\b;\u0010)\u001a\u0004\b/\u00102¨\u0006>"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;", "", "", "seen1", "", "currency", "Lcom/ingka/ikea/app/caasremote/models/NullableFeesRemoteModel;", "fees", "", "Lcom/ingka/ikea/app/caasremote/models/CartSummaryProximityRemoteModel;", "proximityDiscounts", "Lcom/ingka/ikea/app/caasremote/models/TaxSummaryRemoteModel;", "taxSummaries", "Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;", "totalPrice", "Lcom/ingka/ikea/app/caasremote/models/SummaryOfCartTotalSavingsRemoteModel;", "totalSavingsSummary", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/app/caasremote/models/NullableFeesRemoteModel;Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCurrency", "getCurrency$annotations", "()V", "b", "Lcom/ingka/ikea/app/caasremote/models/NullableFeesRemoteModel;", "getFees", "()Lcom/ingka/ikea/app/caasremote/models/NullableFeesRemoteModel;", "getFees$annotations", "c", "Ljava/util/List;", "getProximityDiscounts", "()Ljava/util/List;", "getProximityDiscounts$annotations", "getTaxSummaries", "getTaxSummaries$annotations", "e", "Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;", "getTotalPrice$annotations", "f", "getTotalSavingsSummary$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableCartResponsePriceRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer<Object>[] f71252g = {null, null, new C17451f(CartSummaryProximityRemoteModel$$serializer.INSTANCE), new C17451f(TaxSummaryRemoteModel$$serializer.INSTANCE), null, new C17451f(SummaryOfCartTotalSavingsRemoteModel$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f71253a;

    /* renamed from: b  reason: collision with root package name */
    private final NullableFeesRemoteModel f71254b;

    /* renamed from: c  reason: collision with root package name */
    private final List<CartSummaryProximityRemoteModel> f71255c;

    /* renamed from: d  reason: collision with root package name */
    private final List<TaxSummaryRemoteModel> f71256d;

    /* renamed from: e  reason: collision with root package name */
    private final TotalPriceResponseRemoteModel f71257e;

    /* renamed from: f  reason: collision with root package name */
    private final List<SummaryOfCartTotalSavingsRemoteModel> f71258f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableCartResponsePriceRemoteModel> serializer() {
            return NullableCartResponsePriceRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableCartResponsePriceRemoteModel(int i10, String str, NullableFeesRemoteModel nullableFeesRemoteModel, List list, List list2, TotalPriceResponseRemoteModel totalPriceResponseRemoteModel, List list3, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, NullableCartResponsePriceRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71253a = str;
        this.f71254b = nullableFeesRemoteModel;
        this.f71255c = list;
        this.f71256d = list2;
        this.f71257e = totalPriceResponseRemoteModel;
        this.f71258f = list3;
    }

    public static final /* synthetic */ void d(NullableCartResponsePriceRemoteModel nullableCartResponsePriceRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71252g;
        dVar.y(serialDescriptor, 0, nullableCartResponsePriceRemoteModel.f71253a);
        dVar.B(serialDescriptor, 1, NullableFeesRemoteModel$$serializer.INSTANCE, nullableCartResponsePriceRemoteModel.f71254b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], nullableCartResponsePriceRemoteModel.f71255c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], nullableCartResponsePriceRemoteModel.f71256d);
        dVar.i(serialDescriptor, 4, TotalPriceResponseRemoteModel$$serializer.INSTANCE, nullableCartResponsePriceRemoteModel.f71257e);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], nullableCartResponsePriceRemoteModel.f71258f);
    }

    public final TotalPriceResponseRemoteModel b() {
        return this.f71257e;
    }

    public final List<SummaryOfCartTotalSavingsRemoteModel> c() {
        return this.f71258f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableCartResponsePriceRemoteModel)) {
            return false;
        }
        NullableCartResponsePriceRemoteModel nullableCartResponsePriceRemoteModel = (NullableCartResponsePriceRemoteModel) obj;
        return C17542s.e(this.f71253a, nullableCartResponsePriceRemoteModel.f71253a) && C17542s.e(this.f71254b, nullableCartResponsePriceRemoteModel.f71254b) && C17542s.e(this.f71255c, nullableCartResponsePriceRemoteModel.f71255c) && C17542s.e(this.f71256d, nullableCartResponsePriceRemoteModel.f71256d) && C17542s.e(this.f71257e, nullableCartResponsePriceRemoteModel.f71257e) && C17542s.e(this.f71258f, nullableCartResponsePriceRemoteModel.f71258f);
    }

    public int hashCode() {
        int hashCode = this.f71253a.hashCode() * 31;
        NullableFeesRemoteModel nullableFeesRemoteModel = this.f71254b;
        int i10 = 0;
        int hashCode2 = (hashCode + (nullableFeesRemoteModel == null ? 0 : nullableFeesRemoteModel.hashCode())) * 31;
        List<CartSummaryProximityRemoteModel> list = this.f71255c;
        int hashCode3 = (((((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.f71256d.hashCode()) * 31) + this.f71257e.hashCode()) * 31;
        List<SummaryOfCartTotalSavingsRemoteModel> list2 = this.f71258f;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f71253a;
        NullableFeesRemoteModel nullableFeesRemoteModel = this.f71254b;
        List<CartSummaryProximityRemoteModel> list = this.f71255c;
        List<TaxSummaryRemoteModel> list2 = this.f71256d;
        TotalPriceResponseRemoteModel totalPriceResponseRemoteModel = this.f71257e;
        List<SummaryOfCartTotalSavingsRemoteModel> list3 = this.f71258f;
        return "NullableCartResponsePriceRemoteModel(currency=" + str + ", fees=" + nullableFeesRemoteModel + ", proximityDiscounts=" + list + ", taxSummaries=" + list2 + ", totalPrice=" + totalPriceResponseRemoteModel + ", totalSavingsSummary=" + list3 + ")";
    }
}
