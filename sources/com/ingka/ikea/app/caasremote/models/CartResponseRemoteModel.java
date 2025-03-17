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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\b\b\u0018\u0000 ^2\u00020\u0001:\u0002_/B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aB±\u0001\b\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ(\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#HÁ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010)R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00104\u0012\u0004\b7\u00103\u001a\u0004\b5\u00106R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u00108\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010:R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b?\u00103\u001a\u0004\b<\u0010>R \u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bC\u00103\u001a\u0004\b@\u0010BR \u0010\r\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\bD\u0010A\u0012\u0004\bF\u00103\u001a\u0004\bE\u0010BR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u00103\u001a\u0004\bI\u0010JR&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010=\u0012\u0004\bL\u00103\u001a\u0004\bD\u0010>R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bP\u00103\u001a\u0004\bG\u0010OR \u0010\u0015\u001a\u00020\u00148\u0006X\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u00103\u001a\u0004\bS\u0010TR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u00103\u001a\u0004\bX\u0010YR \u0010\u0018\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b[\u00100\u0012\u0004\b]\u00103\u001a\u0004\b\\\u0010)¨\u0006`"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/CartResponseRemoteModel;", "", "", "cartId", "Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;", "customer", "Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;", "deliveryPrices", "", "Lcom/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel;", "discountCodes", "", "employeeDiscountConsent", "empty", "Lcom/ingka/ikea/app/caasremote/models/NullableCartFulfilmentResponseRemoteModel;", "fulfilment", "Lcom/ingka/ikea/app/caasremote/models/GroupResponseRemoteModel;", "groups", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;", "price", "", "quantity", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseServicesRemoteModel;", "services", "updatedAt", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;Ljava/util/List;ZZLcom/ingka/ikea/app/caasremote/models/NullableCartFulfilmentResponseRemoteModel;Ljava/util/List;Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;FLcom/ingka/ikea/app/caasremote/models/NullableCartResponseServicesRemoteModel;Ljava/lang/String;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;Ljava/util/List;ZZLcom/ingka/ikea/app/caasremote/models/NullableCartFulfilmentResponseRemoteModel;Ljava/util/List;Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;FLcom/ingka/ikea/app/caasremote/models/NullableCartResponseServicesRemoteModel;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "h", "(Lcom/ingka/ikea/app/caasremote/models/CartResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getCartId$annotations", "()V", "Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;", "c", "()Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;", "getCustomer$annotations", "Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;", "getDeliveryPrices", "()Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;", "getDeliveryPrices$annotations", "d", "Ljava/util/List;", "()Ljava/util/List;", "getDiscountCodes$annotations", "e", "Z", "()Z", "getEmployeeDiscountConsent$annotations", "f", "getEmpty", "getEmpty$annotations", "g", "Lcom/ingka/ikea/app/caasremote/models/NullableCartFulfilmentResponseRemoteModel;", "getFulfilment", "()Lcom/ingka/ikea/app/caasremote/models/NullableCartFulfilmentResponseRemoteModel;", "getFulfilment$annotations", "getGroups$annotations", "i", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;", "getPrice$annotations", "j", "F", "getQuantity", "()F", "getQuantity$annotations", "k", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseServicesRemoteModel;", "getServices", "()Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseServicesRemoteModel;", "getServices$annotations", "l", "getUpdatedAt", "getUpdatedAt$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CartResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final KSerializer<Object>[] f71078m = {null, null, null, new C17451f(DiscountCodeRemoteModel$$serializer.INSTANCE), null, null, null, new C17451f(GroupResponseRemoteModel$$serializer.INSTANCE), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f71079a;

    /* renamed from: b  reason: collision with root package name */
    private final CustomerContextRemoteModel f71080b;

    /* renamed from: c  reason: collision with root package name */
    private final NullableMapRemoteModel f71081c;

    /* renamed from: d  reason: collision with root package name */
    private final List<DiscountCodeRemoteModel> f71082d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f71083e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f71084f;

    /* renamed from: g  reason: collision with root package name */
    private final NullableCartFulfilmentResponseRemoteModel f71085g;

    /* renamed from: h  reason: collision with root package name */
    private final List<GroupResponseRemoteModel> f71086h;

    /* renamed from: i  reason: collision with root package name */
    private final NullableCartResponsePriceRemoteModel f71087i;

    /* renamed from: j  reason: collision with root package name */
    private final float f71088j;

    /* renamed from: k  reason: collision with root package name */
    private final NullableCartResponseServicesRemoteModel f71089k;

    /* renamed from: l  reason: collision with root package name */
    private final String f71090l;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/CartResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/CartResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CartResponseRemoteModel> serializer() {
            return CartResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ CartResponseRemoteModel(int i10, String str, CustomerContextRemoteModel customerContextRemoteModel, NullableMapRemoteModel nullableMapRemoteModel, List list, boolean z10, boolean z11, NullableCartFulfilmentResponseRemoteModel nullableCartFulfilmentResponseRemoteModel, List list2, NullableCartResponsePriceRemoteModel nullableCartResponsePriceRemoteModel, float f10, NullableCartResponseServicesRemoteModel nullableCartResponseServicesRemoteModel, String str2, T0 t02) {
        if (4095 != (i10 & 4095)) {
            E0.b(i10, 4095, CartResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71079a = str;
        this.f71080b = customerContextRemoteModel;
        this.f71081c = nullableMapRemoteModel;
        this.f71082d = list;
        this.f71083e = z10;
        this.f71084f = z11;
        this.f71085g = nullableCartFulfilmentResponseRemoteModel;
        this.f71086h = list2;
        this.f71087i = nullableCartResponsePriceRemoteModel;
        this.f71088j = f10;
        this.f71089k = nullableCartResponseServicesRemoteModel;
        this.f71090l = str2;
    }

    public static final /* synthetic */ void h(CartResponseRemoteModel cartResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71078m;
        dVar.y(serialDescriptor, 0, cartResponseRemoteModel.f71079a);
        dVar.i(serialDescriptor, 1, CustomerContextRemoteModel$$serializer.INSTANCE, cartResponseRemoteModel.f71080b);
        dVar.B(serialDescriptor, 2, NullableMapRemoteModel$$serializer.INSTANCE, cartResponseRemoteModel.f71081c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], cartResponseRemoteModel.f71082d);
        dVar.x(serialDescriptor, 4, cartResponseRemoteModel.f71083e);
        dVar.x(serialDescriptor, 5, cartResponseRemoteModel.f71084f);
        dVar.B(serialDescriptor, 6, NullableCartFulfilmentResponseRemoteModel$$serializer.INSTANCE, cartResponseRemoteModel.f71085g);
        dVar.i(serialDescriptor, 7, kSerializerArr[7], cartResponseRemoteModel.f71086h);
        dVar.B(serialDescriptor, 8, NullableCartResponsePriceRemoteModel$$serializer.INSTANCE, cartResponseRemoteModel.f71087i);
        dVar.s(serialDescriptor, 9, cartResponseRemoteModel.f71088j);
        dVar.B(serialDescriptor, 10, NullableCartResponseServicesRemoteModel$$serializer.INSTANCE, cartResponseRemoteModel.f71089k);
        dVar.y(serialDescriptor, 11, cartResponseRemoteModel.f71090l);
    }

    public final String b() {
        return this.f71079a;
    }

    public final CustomerContextRemoteModel c() {
        return this.f71080b;
    }

    public final List<DiscountCodeRemoteModel> d() {
        return this.f71082d;
    }

    public final boolean e() {
        return this.f71083e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartResponseRemoteModel)) {
            return false;
        }
        CartResponseRemoteModel cartResponseRemoteModel = (CartResponseRemoteModel) obj;
        return C17542s.e(this.f71079a, cartResponseRemoteModel.f71079a) && C17542s.e(this.f71080b, cartResponseRemoteModel.f71080b) && C17542s.e(this.f71081c, cartResponseRemoteModel.f71081c) && C17542s.e(this.f71082d, cartResponseRemoteModel.f71082d) && this.f71083e == cartResponseRemoteModel.f71083e && this.f71084f == cartResponseRemoteModel.f71084f && C17542s.e(this.f71085g, cartResponseRemoteModel.f71085g) && C17542s.e(this.f71086h, cartResponseRemoteModel.f71086h) && C17542s.e(this.f71087i, cartResponseRemoteModel.f71087i) && Float.compare(this.f71088j, cartResponseRemoteModel.f71088j) == 0 && C17542s.e(this.f71089k, cartResponseRemoteModel.f71089k) && C17542s.e(this.f71090l, cartResponseRemoteModel.f71090l);
    }

    public final List<GroupResponseRemoteModel> f() {
        return this.f71086h;
    }

    public final NullableCartResponsePriceRemoteModel g() {
        return this.f71087i;
    }

    public int hashCode() {
        int hashCode = ((this.f71079a.hashCode() * 31) + this.f71080b.hashCode()) * 31;
        NullableMapRemoteModel nullableMapRemoteModel = this.f71081c;
        int i10 = 0;
        int hashCode2 = (((((((hashCode + (nullableMapRemoteModel == null ? 0 : nullableMapRemoteModel.hashCode())) * 31) + this.f71082d.hashCode()) * 31) + Boolean.hashCode(this.f71083e)) * 31) + Boolean.hashCode(this.f71084f)) * 31;
        NullableCartFulfilmentResponseRemoteModel nullableCartFulfilmentResponseRemoteModel = this.f71085g;
        int hashCode3 = (((hashCode2 + (nullableCartFulfilmentResponseRemoteModel == null ? 0 : nullableCartFulfilmentResponseRemoteModel.hashCode())) * 31) + this.f71086h.hashCode()) * 31;
        NullableCartResponsePriceRemoteModel nullableCartResponsePriceRemoteModel = this.f71087i;
        int hashCode4 = (((hashCode3 + (nullableCartResponsePriceRemoteModel == null ? 0 : nullableCartResponsePriceRemoteModel.hashCode())) * 31) + Float.hashCode(this.f71088j)) * 31;
        NullableCartResponseServicesRemoteModel nullableCartResponseServicesRemoteModel = this.f71089k;
        if (nullableCartResponseServicesRemoteModel != null) {
            i10 = nullableCartResponseServicesRemoteModel.hashCode();
        }
        return ((hashCode4 + i10) * 31) + this.f71090l.hashCode();
    }

    public String toString() {
        String str = this.f71079a;
        CustomerContextRemoteModel customerContextRemoteModel = this.f71080b;
        NullableMapRemoteModel nullableMapRemoteModel = this.f71081c;
        List<DiscountCodeRemoteModel> list = this.f71082d;
        boolean z10 = this.f71083e;
        boolean z11 = this.f71084f;
        NullableCartFulfilmentResponseRemoteModel nullableCartFulfilmentResponseRemoteModel = this.f71085g;
        List<GroupResponseRemoteModel> list2 = this.f71086h;
        NullableCartResponsePriceRemoteModel nullableCartResponsePriceRemoteModel = this.f71087i;
        float f10 = this.f71088j;
        NullableCartResponseServicesRemoteModel nullableCartResponseServicesRemoteModel = this.f71089k;
        String str2 = this.f71090l;
        return "CartResponseRemoteModel(cartId=" + str + ", customer=" + customerContextRemoteModel + ", deliveryPrices=" + nullableMapRemoteModel + ", discountCodes=" + list + ", employeeDiscountConsent=" + z10 + ", empty=" + z11 + ", fulfilment=" + nullableCartFulfilmentResponseRemoteModel + ", groups=" + list2 + ", price=" + nullableCartResponsePriceRemoteModel + ", quantity=" + f10 + ", services=" + nullableCartResponseServicesRemoteModel + ", updatedAt=" + str2 + ")";
    }

    public CartResponseRemoteModel(String str, CustomerContextRemoteModel customerContextRemoteModel, NullableMapRemoteModel nullableMapRemoteModel, List<DiscountCodeRemoteModel> list, boolean z10, boolean z11, NullableCartFulfilmentResponseRemoteModel nullableCartFulfilmentResponseRemoteModel, List<GroupResponseRemoteModel> list2, NullableCartResponsePriceRemoteModel nullableCartResponsePriceRemoteModel, float f10, NullableCartResponseServicesRemoteModel nullableCartResponseServicesRemoteModel, String str2) {
        C17542s.j(str, "cartId");
        C17542s.j(customerContextRemoteModel, "customer");
        C17542s.j(list, "discountCodes");
        C17542s.j(list2, "groups");
        C17542s.j(str2, "updatedAt");
        this.f71079a = str;
        this.f71080b = customerContextRemoteModel;
        this.f71081c = nullableMapRemoteModel;
        this.f71082d = list;
        this.f71083e = z10;
        this.f71084f = z11;
        this.f71085g = nullableCartFulfilmentResponseRemoteModel;
        this.f71086h = list2;
        this.f71087i = nullableCartResponsePriceRemoteModel;
        this.f71088j = f10;
        this.f71089k = nullableCartResponseServicesRemoteModel;
        this.f71090l = str2;
    }
}
