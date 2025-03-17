package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.M;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\b\u0018\u0000 N2\u00020\u0001:\u0002O(B\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÁ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\"R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010-\u001a\u0004\b8\u00109R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010-\u001a\u0004\b=\u0010>R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010-\u001a\u0004\bB\u0010CR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bH\u0010-\u001a\u0004\b\u0012\u0010GR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bI\u0010F\u0012\u0004\bJ\u0010-\u001a\u0004\b\u0013\u0010GR(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\bK\u00107\u0012\u0004\bM\u0010-\u001a\u0004\bL\u00109¨\u0006P"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/CartSummaryProximityRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityAdditionalPurchaseRemoteModel;", "additionalPurchase", "Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountRemoteModel;", "discount", "", "discountId", "", "Lcom/ingka/ikea/app/caasremote/models/CartProximityDiscountNameRemoteModel;", "discountName", "", "discountQualification", "Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountValidityRemoteModel;", "discountValidity", "", "isOrderDiscount", "isServiceDiscount", "itemLineReferences", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/NullableCartProximityAdditionalPurchaseRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountRemoteModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Float;Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountValidityRemoteModel;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/CartSummaryProximityRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityAdditionalPurchaseRemoteModel;", "getAdditionalPurchase", "()Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityAdditionalPurchaseRemoteModel;", "getAdditionalPurchase$annotations", "()V", "Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountRemoteModel;", "getDiscount", "()Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountRemoteModel;", "getDiscount$annotations", "c", "Ljava/lang/String;", "getDiscountId", "getDiscountId$annotations", "d", "Ljava/util/List;", "getDiscountName", "()Ljava/util/List;", "getDiscountName$annotations", "e", "Ljava/lang/Float;", "getDiscountQualification", "()Ljava/lang/Float;", "getDiscountQualification$annotations", "f", "Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountValidityRemoteModel;", "getDiscountValidity", "()Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountValidityRemoteModel;", "getDiscountValidity$annotations", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isOrderDiscount$annotations", "h", "isServiceDiscount$annotations", "i", "getItemLineReferences", "getItemLineReferences$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CartSummaryProximityRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final KSerializer<Object>[] f71091j = {null, null, null, new C17451f(CartProximityDiscountNameRemoteModel$$serializer.INSTANCE), null, null, null, null, new C17451f(Y0.f144077a)};

    /* renamed from: a  reason: collision with root package name */
    private final NullableCartProximityAdditionalPurchaseRemoteModel f71092a;

    /* renamed from: b  reason: collision with root package name */
    private final NullableCartProximityDiscountRemoteModel f71093b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71094c;

    /* renamed from: d  reason: collision with root package name */
    private final List<CartProximityDiscountNameRemoteModel> f71095d;

    /* renamed from: e  reason: collision with root package name */
    private final Float f71096e;

    /* renamed from: f  reason: collision with root package name */
    private final NullableCartProximityDiscountValidityRemoteModel f71097f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f71098g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f71099h;

    /* renamed from: i  reason: collision with root package name */
    private final List<String> f71100i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/CartSummaryProximityRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/CartSummaryProximityRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CartSummaryProximityRemoteModel> serializer() {
            return CartSummaryProximityRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ CartSummaryProximityRemoteModel(int i10, NullableCartProximityAdditionalPurchaseRemoteModel nullableCartProximityAdditionalPurchaseRemoteModel, NullableCartProximityDiscountRemoteModel nullableCartProximityDiscountRemoteModel, String str, List list, Float f10, NullableCartProximityDiscountValidityRemoteModel nullableCartProximityDiscountValidityRemoteModel, Boolean bool, Boolean bool2, List list2, T0 t02) {
        if (511 != (i10 & 511)) {
            E0.b(i10, 511, CartSummaryProximityRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71092a = nullableCartProximityAdditionalPurchaseRemoteModel;
        this.f71093b = nullableCartProximityDiscountRemoteModel;
        this.f71094c = str;
        this.f71095d = list;
        this.f71096e = f10;
        this.f71097f = nullableCartProximityDiscountValidityRemoteModel;
        this.f71098g = bool;
        this.f71099h = bool2;
        this.f71100i = list2;
    }

    public static final /* synthetic */ void b(CartSummaryProximityRemoteModel cartSummaryProximityRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71091j;
        dVar.B(serialDescriptor, 0, NullableCartProximityAdditionalPurchaseRemoteModel$$serializer.INSTANCE, cartSummaryProximityRemoteModel.f71092a);
        dVar.B(serialDescriptor, 1, NullableCartProximityDiscountRemoteModel$$serializer.INSTANCE, cartSummaryProximityRemoteModel.f71093b);
        dVar.B(serialDescriptor, 2, Y0.f144077a, cartSummaryProximityRemoteModel.f71094c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], cartSummaryProximityRemoteModel.f71095d);
        dVar.B(serialDescriptor, 4, M.f144051a, cartSummaryProximityRemoteModel.f71096e);
        dVar.B(serialDescriptor, 5, NullableCartProximityDiscountValidityRemoteModel$$serializer.INSTANCE, cartSummaryProximityRemoteModel.f71097f);
        C17457i iVar = C17457i.f144111a;
        dVar.B(serialDescriptor, 6, iVar, cartSummaryProximityRemoteModel.f71098g);
        dVar.B(serialDescriptor, 7, iVar, cartSummaryProximityRemoteModel.f71099h);
        dVar.B(serialDescriptor, 8, kSerializerArr[8], cartSummaryProximityRemoteModel.f71100i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartSummaryProximityRemoteModel)) {
            return false;
        }
        CartSummaryProximityRemoteModel cartSummaryProximityRemoteModel = (CartSummaryProximityRemoteModel) obj;
        return C17542s.e(this.f71092a, cartSummaryProximityRemoteModel.f71092a) && C17542s.e(this.f71093b, cartSummaryProximityRemoteModel.f71093b) && C17542s.e(this.f71094c, cartSummaryProximityRemoteModel.f71094c) && C17542s.e(this.f71095d, cartSummaryProximityRemoteModel.f71095d) && C17542s.e(this.f71096e, cartSummaryProximityRemoteModel.f71096e) && C17542s.e(this.f71097f, cartSummaryProximityRemoteModel.f71097f) && C17542s.e(this.f71098g, cartSummaryProximityRemoteModel.f71098g) && C17542s.e(this.f71099h, cartSummaryProximityRemoteModel.f71099h) && C17542s.e(this.f71100i, cartSummaryProximityRemoteModel.f71100i);
    }

    public int hashCode() {
        NullableCartProximityAdditionalPurchaseRemoteModel nullableCartProximityAdditionalPurchaseRemoteModel = this.f71092a;
        int i10 = 0;
        int hashCode = (nullableCartProximityAdditionalPurchaseRemoteModel == null ? 0 : nullableCartProximityAdditionalPurchaseRemoteModel.hashCode()) * 31;
        NullableCartProximityDiscountRemoteModel nullableCartProximityDiscountRemoteModel = this.f71093b;
        int hashCode2 = (hashCode + (nullableCartProximityDiscountRemoteModel == null ? 0 : nullableCartProximityDiscountRemoteModel.hashCode())) * 31;
        String str = this.f71094c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<CartProximityDiscountNameRemoteModel> list = this.f71095d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Float f10 = this.f71096e;
        int hashCode5 = (hashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31;
        NullableCartProximityDiscountValidityRemoteModel nullableCartProximityDiscountValidityRemoteModel = this.f71097f;
        int hashCode6 = (hashCode5 + (nullableCartProximityDiscountValidityRemoteModel == null ? 0 : nullableCartProximityDiscountValidityRemoteModel.hashCode())) * 31;
        Boolean bool = this.f71098g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f71099h;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list2 = this.f71100i;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        NullableCartProximityAdditionalPurchaseRemoteModel nullableCartProximityAdditionalPurchaseRemoteModel = this.f71092a;
        NullableCartProximityDiscountRemoteModel nullableCartProximityDiscountRemoteModel = this.f71093b;
        String str = this.f71094c;
        List<CartProximityDiscountNameRemoteModel> list = this.f71095d;
        Float f10 = this.f71096e;
        NullableCartProximityDiscountValidityRemoteModel nullableCartProximityDiscountValidityRemoteModel = this.f71097f;
        Boolean bool = this.f71098g;
        Boolean bool2 = this.f71099h;
        List<String> list2 = this.f71100i;
        return "CartSummaryProximityRemoteModel(additionalPurchase=" + nullableCartProximityAdditionalPurchaseRemoteModel + ", discount=" + nullableCartProximityDiscountRemoteModel + ", discountId=" + str + ", discountName=" + list + ", discountQualification=" + f10 + ", discountValidity=" + nullableCartProximityDiscountValidityRemoteModel + ", isOrderDiscount=" + bool + ", isServiceDiscount=" + bool2 + ", itemLineReferences=" + list2 + ")";
    }
}
