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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\b\b\u0018\u0000 Y2\u00020\u0001:\u0002Z.B±\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\r\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"HÁ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010(R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00103\u0012\u0004\b6\u00102\u001a\u0004\b4\u00105R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u00107\u0012\u0004\b:\u00102\u001a\u0004\b8\u00109R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010;\u0012\u0004\b>\u00102\u001a\u0004\b<\u0010=R \u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010?\u0012\u0004\bB\u00102\u001a\u0004\b@\u0010AR \u0010\u000f\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u0010?\u0012\u0004\bD\u00102\u001a\u0004\bC\u0010AR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u0010E\u0012\u0004\bH\u00102\u001a\u0004\bF\u0010GR&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u0010;\u0012\u0004\bJ\u00102\u001a\u0004\bI\u0010=R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\u0012\n\u0004\bI\u0010K\u0012\u0004\bN\u00102\u001a\u0004\bL\u0010MR \u0010\u0017\u001a\u00020\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\bL\u0010O\u0012\u0004\bR\u00102\u001a\u0004\bP\u0010QR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\u0012\n\u0004\bP\u0010S\u0012\u0004\bV\u00102\u001a\u0004\bT\u0010UR \u0010\u001a\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bT\u0010/\u0012\u0004\bX\u00102\u001a\u0004\bW\u0010(¨\u0006["}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel;", "", "", "seen1", "", "cartId", "Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;", "customer", "Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;", "deliveryPrices", "", "Lcom/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel;", "discountCodes", "", "employeeDiscountConsent", "empty", "Lcom/ingka/ikea/app/caasremote/models/NullableCartFulfilmentResponseRemoteModel;", "fulfilment", "Lcom/ingka/ikea/app/caasremote/models/GroupResponseRemoteModel;", "groups", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;", "price", "", "quantity", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseServicesRemoteModel;", "services", "updatedAt", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;Ljava/util/List;ZZLcom/ingka/ikea/app/caasremote/models/NullableCartFulfilmentResponseRemoteModel;Ljava/util/List;Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;FLcom/ingka/ikea/app/caasremote/models/NullableCartResponseServicesRemoteModel;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "n", "(Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getCartId$annotations", "()V", "Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;", "c", "()Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;", "getCustomer$annotations", "Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;", "d", "()Lcom/ingka/ikea/app/caasremote/models/NullableMapRemoteModel;", "getDeliveryPrices$annotations", "Ljava/util/List;", "e", "()Ljava/util/List;", "getDiscountCodes$annotations", "Z", "f", "()Z", "getEmployeeDiscountConsent$annotations", "g", "getEmpty$annotations", "Lcom/ingka/ikea/app/caasremote/models/NullableCartFulfilmentResponseRemoteModel;", "h", "()Lcom/ingka/ikea/app/caasremote/models/NullableCartFulfilmentResponseRemoteModel;", "getFulfilment$annotations", "i", "getGroups$annotations", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;", "j", "()Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;", "getPrice$annotations", "F", "k", "()F", "getQuantity$annotations", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseServicesRemoteModel;", "l", "()Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseServicesRemoteModel;", "getServices$annotations", "m", "getUpdatedAt$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableCartResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final KSerializer<Object>[] f71259m = {null, null, null, new C17451f(DiscountCodeRemoteModel$$serializer.INSTANCE), null, null, null, new C17451f(GroupResponseRemoteModel$$serializer.INSTANCE), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f71260a;

    /* renamed from: b  reason: collision with root package name */
    private final CustomerContextRemoteModel f71261b;

    /* renamed from: c  reason: collision with root package name */
    private final NullableMapRemoteModel f71262c;

    /* renamed from: d  reason: collision with root package name */
    private final List<DiscountCodeRemoteModel> f71263d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f71264e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f71265f;

    /* renamed from: g  reason: collision with root package name */
    private final NullableCartFulfilmentResponseRemoteModel f71266g;

    /* renamed from: h  reason: collision with root package name */
    private final List<GroupResponseRemoteModel> f71267h;

    /* renamed from: i  reason: collision with root package name */
    private final NullableCartResponsePriceRemoteModel f71268i;

    /* renamed from: j  reason: collision with root package name */
    private final float f71269j;

    /* renamed from: k  reason: collision with root package name */
    private final NullableCartResponseServicesRemoteModel f71270k;

    /* renamed from: l  reason: collision with root package name */
    private final String f71271l;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableCartResponseRemoteModel> serializer() {
            return NullableCartResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableCartResponseRemoteModel(int i10, String str, CustomerContextRemoteModel customerContextRemoteModel, NullableMapRemoteModel nullableMapRemoteModel, List list, boolean z10, boolean z11, NullableCartFulfilmentResponseRemoteModel nullableCartFulfilmentResponseRemoteModel, List list2, NullableCartResponsePriceRemoteModel nullableCartResponsePriceRemoteModel, float f10, NullableCartResponseServicesRemoteModel nullableCartResponseServicesRemoteModel, String str2, T0 t02) {
        if (4095 != (i10 & 4095)) {
            E0.b(i10, 4095, NullableCartResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71260a = str;
        this.f71261b = customerContextRemoteModel;
        this.f71262c = nullableMapRemoteModel;
        this.f71263d = list;
        this.f71264e = z10;
        this.f71265f = z11;
        this.f71266g = nullableCartFulfilmentResponseRemoteModel;
        this.f71267h = list2;
        this.f71268i = nullableCartResponsePriceRemoteModel;
        this.f71269j = f10;
        this.f71270k = nullableCartResponseServicesRemoteModel;
        this.f71271l = str2;
    }

    public static final /* synthetic */ void n(NullableCartResponseRemoteModel nullableCartResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71259m;
        dVar.y(serialDescriptor, 0, nullableCartResponseRemoteModel.f71260a);
        dVar.i(serialDescriptor, 1, CustomerContextRemoteModel$$serializer.INSTANCE, nullableCartResponseRemoteModel.f71261b);
        dVar.B(serialDescriptor, 2, NullableMapRemoteModel$$serializer.INSTANCE, nullableCartResponseRemoteModel.f71262c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], nullableCartResponseRemoteModel.f71263d);
        dVar.x(serialDescriptor, 4, nullableCartResponseRemoteModel.f71264e);
        dVar.x(serialDescriptor, 5, nullableCartResponseRemoteModel.f71265f);
        dVar.B(serialDescriptor, 6, NullableCartFulfilmentResponseRemoteModel$$serializer.INSTANCE, nullableCartResponseRemoteModel.f71266g);
        dVar.i(serialDescriptor, 7, kSerializerArr[7], nullableCartResponseRemoteModel.f71267h);
        dVar.B(serialDescriptor, 8, NullableCartResponsePriceRemoteModel$$serializer.INSTANCE, nullableCartResponseRemoteModel.f71268i);
        dVar.s(serialDescriptor, 9, nullableCartResponseRemoteModel.f71269j);
        dVar.B(serialDescriptor, 10, NullableCartResponseServicesRemoteModel$$serializer.INSTANCE, nullableCartResponseRemoteModel.f71270k);
        dVar.y(serialDescriptor, 11, nullableCartResponseRemoteModel.f71271l);
    }

    public final String b() {
        return this.f71260a;
    }

    public final CustomerContextRemoteModel c() {
        return this.f71261b;
    }

    public final NullableMapRemoteModel d() {
        return this.f71262c;
    }

    public final List<DiscountCodeRemoteModel> e() {
        return this.f71263d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableCartResponseRemoteModel)) {
            return false;
        }
        NullableCartResponseRemoteModel nullableCartResponseRemoteModel = (NullableCartResponseRemoteModel) obj;
        return C17542s.e(this.f71260a, nullableCartResponseRemoteModel.f71260a) && C17542s.e(this.f71261b, nullableCartResponseRemoteModel.f71261b) && C17542s.e(this.f71262c, nullableCartResponseRemoteModel.f71262c) && C17542s.e(this.f71263d, nullableCartResponseRemoteModel.f71263d) && this.f71264e == nullableCartResponseRemoteModel.f71264e && this.f71265f == nullableCartResponseRemoteModel.f71265f && C17542s.e(this.f71266g, nullableCartResponseRemoteModel.f71266g) && C17542s.e(this.f71267h, nullableCartResponseRemoteModel.f71267h) && C17542s.e(this.f71268i, nullableCartResponseRemoteModel.f71268i) && Float.compare(this.f71269j, nullableCartResponseRemoteModel.f71269j) == 0 && C17542s.e(this.f71270k, nullableCartResponseRemoteModel.f71270k) && C17542s.e(this.f71271l, nullableCartResponseRemoteModel.f71271l);
    }

    public final boolean f() {
        return this.f71264e;
    }

    public final boolean g() {
        return this.f71265f;
    }

    public final NullableCartFulfilmentResponseRemoteModel h() {
        return this.f71266g;
    }

    public int hashCode() {
        int hashCode = ((this.f71260a.hashCode() * 31) + this.f71261b.hashCode()) * 31;
        NullableMapRemoteModel nullableMapRemoteModel = this.f71262c;
        int i10 = 0;
        int hashCode2 = (((((((hashCode + (nullableMapRemoteModel == null ? 0 : nullableMapRemoteModel.hashCode())) * 31) + this.f71263d.hashCode()) * 31) + Boolean.hashCode(this.f71264e)) * 31) + Boolean.hashCode(this.f71265f)) * 31;
        NullableCartFulfilmentResponseRemoteModel nullableCartFulfilmentResponseRemoteModel = this.f71266g;
        int hashCode3 = (((hashCode2 + (nullableCartFulfilmentResponseRemoteModel == null ? 0 : nullableCartFulfilmentResponseRemoteModel.hashCode())) * 31) + this.f71267h.hashCode()) * 31;
        NullableCartResponsePriceRemoteModel nullableCartResponsePriceRemoteModel = this.f71268i;
        int hashCode4 = (((hashCode3 + (nullableCartResponsePriceRemoteModel == null ? 0 : nullableCartResponsePriceRemoteModel.hashCode())) * 31) + Float.hashCode(this.f71269j)) * 31;
        NullableCartResponseServicesRemoteModel nullableCartResponseServicesRemoteModel = this.f71270k;
        if (nullableCartResponseServicesRemoteModel != null) {
            i10 = nullableCartResponseServicesRemoteModel.hashCode();
        }
        return ((hashCode4 + i10) * 31) + this.f71271l.hashCode();
    }

    public final List<GroupResponseRemoteModel> i() {
        return this.f71267h;
    }

    public final NullableCartResponsePriceRemoteModel j() {
        return this.f71268i;
    }

    public final float k() {
        return this.f71269j;
    }

    public final NullableCartResponseServicesRemoteModel l() {
        return this.f71270k;
    }

    public final String m() {
        return this.f71271l;
    }

    public String toString() {
        String str = this.f71260a;
        CustomerContextRemoteModel customerContextRemoteModel = this.f71261b;
        NullableMapRemoteModel nullableMapRemoteModel = this.f71262c;
        List<DiscountCodeRemoteModel> list = this.f71263d;
        boolean z10 = this.f71264e;
        boolean z11 = this.f71265f;
        NullableCartFulfilmentResponseRemoteModel nullableCartFulfilmentResponseRemoteModel = this.f71266g;
        List<GroupResponseRemoteModel> list2 = this.f71267h;
        NullableCartResponsePriceRemoteModel nullableCartResponsePriceRemoteModel = this.f71268i;
        float f10 = this.f71269j;
        NullableCartResponseServicesRemoteModel nullableCartResponseServicesRemoteModel = this.f71270k;
        String str2 = this.f71271l;
        return "NullableCartResponseRemoteModel(cartId=" + str + ", customer=" + customerContextRemoteModel + ", deliveryPrices=" + nullableMapRemoteModel + ", discountCodes=" + list + ", employeeDiscountConsent=" + z10 + ", empty=" + z11 + ", fulfilment=" + nullableCartFulfilmentResponseRemoteModel + ", groups=" + list2 + ", price=" + nullableCartResponsePriceRemoteModel + ", quantity=" + f10 + ", services=" + nullableCartResponseServicesRemoteModel + ", updatedAt=" + str2 + ")";
    }
}
