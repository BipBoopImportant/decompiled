package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b(\b\b\u0018\u0000 D2\u00020\u0001:\u0002E&Bo\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÁ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u0010+\u001a\u0004\b,\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010+\u001a\u0004\b2\u00103R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b8\u0010+\u001a\u0004\b0\u00107R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010+\u001a\u0004\b;\u0010<R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010>\u0012\u0004\b@\u0010+\u001a\u0004\b5\u0010?R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010A\u0012\u0004\bC\u0010+\u001a\u0004\b9\u0010B¨\u0006F"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/NullableBasePricePropertiesRemoteModel;", "base", "Lcom/ingka/ikea/app/caasremote/models/CurrentUnitPricePropertiesRemoteModel;", "current", "", "isFamilyItem", "Lcom/ingka/ikea/app/caasremote/models/NullableLowestPreviousPriceRemoteModel;", "lowestPreviousPrice", "Lcom/ingka/ikea/app/caasremote/models/NullablePreviousSalesPriceRemoteModel;", "previousSalesPrice", "Lcom/ingka/ikea/app/caasremote/models/g;", "priceType", "Lcom/ingka/ikea/app/caasremote/models/NullableUpsellUnitPricePropertiesRemoteModel;", "upsell", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/NullableBasePricePropertiesRemoteModel;Lcom/ingka/ikea/app/caasremote/models/CurrentUnitPricePropertiesRemoteModel;Ljava/lang/Boolean;Lcom/ingka/ikea/app/caasremote/models/NullableLowestPreviousPriceRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullablePreviousSalesPriceRemoteModel;Lcom/ingka/ikea/app/caasremote/models/g;Lcom/ingka/ikea/app/caasremote/models/NullableUpsellUnitPricePropertiesRemoteModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/NullableBasePricePropertiesRemoteModel;", "getBase", "()Lcom/ingka/ikea/app/caasremote/models/NullableBasePricePropertiesRemoteModel;", "getBase$annotations", "()V", "b", "Lcom/ingka/ikea/app/caasremote/models/CurrentUnitPricePropertiesRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/CurrentUnitPricePropertiesRemoteModel;", "getCurrent$annotations", "c", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "isFamilyItem$annotations", "d", "Lcom/ingka/ikea/app/caasremote/models/NullableLowestPreviousPriceRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableLowestPreviousPriceRemoteModel;", "getLowestPreviousPrice$annotations", "e", "Lcom/ingka/ikea/app/caasremote/models/NullablePreviousSalesPriceRemoteModel;", "getPreviousSalesPrice", "()Lcom/ingka/ikea/app/caasremote/models/NullablePreviousSalesPriceRemoteModel;", "getPreviousSalesPrice$annotations", "Lcom/ingka/ikea/app/caasremote/models/g;", "()Lcom/ingka/ikea/app/caasremote/models/g;", "getPriceType$annotations", "Lcom/ingka/ikea/app/caasremote/models/NullableUpsellUnitPricePropertiesRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableUpsellUnitPricePropertiesRemoteModel;", "getUpsell$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ItemUnitPriceRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f71203h = {null, null, null, null, null, new C17250c(P.b(g.class), C17294a.u(g.Companion.serializer()), new KSerializer[0]), null};

    /* renamed from: a  reason: collision with root package name */
    private final NullableBasePricePropertiesRemoteModel f71204a;

    /* renamed from: b  reason: collision with root package name */
    private final CurrentUnitPricePropertiesRemoteModel f71205b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f71206c;

    /* renamed from: d  reason: collision with root package name */
    private final NullableLowestPreviousPriceRemoteModel f71207d;

    /* renamed from: e  reason: collision with root package name */
    private final NullablePreviousSalesPriceRemoteModel f71208e;

    /* renamed from: f  reason: collision with root package name */
    private final g f71209f;

    /* renamed from: g  reason: collision with root package name */
    private final NullableUpsellUnitPricePropertiesRemoteModel f71210g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ItemUnitPriceRemoteModel> serializer() {
            return ItemUnitPriceRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ ItemUnitPriceRemoteModel(int i10, NullableBasePricePropertiesRemoteModel nullableBasePricePropertiesRemoteModel, CurrentUnitPricePropertiesRemoteModel currentUnitPricePropertiesRemoteModel, Boolean bool, NullableLowestPreviousPriceRemoteModel nullableLowestPreviousPriceRemoteModel, NullablePreviousSalesPriceRemoteModel nullablePreviousSalesPriceRemoteModel, g gVar, NullableUpsellUnitPricePropertiesRemoteModel nullableUpsellUnitPricePropertiesRemoteModel, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, ItemUnitPriceRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71204a = nullableBasePricePropertiesRemoteModel;
        this.f71205b = currentUnitPricePropertiesRemoteModel;
        this.f71206c = bool;
        this.f71207d = nullableLowestPreviousPriceRemoteModel;
        this.f71208e = nullablePreviousSalesPriceRemoteModel;
        this.f71209f = gVar;
        this.f71210g = nullableUpsellUnitPricePropertiesRemoteModel;
    }

    public static final /* synthetic */ void g(ItemUnitPriceRemoteModel itemUnitPriceRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71203h;
        dVar.B(serialDescriptor, 0, NullableBasePricePropertiesRemoteModel$$serializer.INSTANCE, itemUnitPriceRemoteModel.f71204a);
        dVar.i(serialDescriptor, 1, CurrentUnitPricePropertiesRemoteModel$$serializer.INSTANCE, itemUnitPriceRemoteModel.f71205b);
        dVar.B(serialDescriptor, 2, C17457i.f144111a, itemUnitPriceRemoteModel.f71206c);
        dVar.B(serialDescriptor, 3, NullableLowestPreviousPriceRemoteModel$$serializer.INSTANCE, itemUnitPriceRemoteModel.f71207d);
        dVar.B(serialDescriptor, 4, NullablePreviousSalesPriceRemoteModel$$serializer.INSTANCE, itemUnitPriceRemoteModel.f71208e);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], itemUnitPriceRemoteModel.f71209f);
        dVar.B(serialDescriptor, 6, NullableUpsellUnitPricePropertiesRemoteModel$$serializer.INSTANCE, itemUnitPriceRemoteModel.f71210g);
    }

    public final CurrentUnitPricePropertiesRemoteModel b() {
        return this.f71205b;
    }

    public final NullableLowestPreviousPriceRemoteModel c() {
        return this.f71207d;
    }

    public final g d() {
        return this.f71209f;
    }

    public final NullableUpsellUnitPricePropertiesRemoteModel e() {
        return this.f71210g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemUnitPriceRemoteModel)) {
            return false;
        }
        ItemUnitPriceRemoteModel itemUnitPriceRemoteModel = (ItemUnitPriceRemoteModel) obj;
        return C17542s.e(this.f71204a, itemUnitPriceRemoteModel.f71204a) && C17542s.e(this.f71205b, itemUnitPriceRemoteModel.f71205b) && C17542s.e(this.f71206c, itemUnitPriceRemoteModel.f71206c) && C17542s.e(this.f71207d, itemUnitPriceRemoteModel.f71207d) && C17542s.e(this.f71208e, itemUnitPriceRemoteModel.f71208e) && this.f71209f == itemUnitPriceRemoteModel.f71209f && C17542s.e(this.f71210g, itemUnitPriceRemoteModel.f71210g);
    }

    public final Boolean f() {
        return this.f71206c;
    }

    public int hashCode() {
        NullableBasePricePropertiesRemoteModel nullableBasePricePropertiesRemoteModel = this.f71204a;
        int i10 = 0;
        int hashCode = (((nullableBasePricePropertiesRemoteModel == null ? 0 : nullableBasePricePropertiesRemoteModel.hashCode()) * 31) + this.f71205b.hashCode()) * 31;
        Boolean bool = this.f71206c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        NullableLowestPreviousPriceRemoteModel nullableLowestPreviousPriceRemoteModel = this.f71207d;
        int hashCode3 = (hashCode2 + (nullableLowestPreviousPriceRemoteModel == null ? 0 : nullableLowestPreviousPriceRemoteModel.hashCode())) * 31;
        NullablePreviousSalesPriceRemoteModel nullablePreviousSalesPriceRemoteModel = this.f71208e;
        int hashCode4 = (hashCode3 + (nullablePreviousSalesPriceRemoteModel == null ? 0 : nullablePreviousSalesPriceRemoteModel.hashCode())) * 31;
        g gVar = this.f71209f;
        int hashCode5 = (hashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        NullableUpsellUnitPricePropertiesRemoteModel nullableUpsellUnitPricePropertiesRemoteModel = this.f71210g;
        if (nullableUpsellUnitPricePropertiesRemoteModel != null) {
            i10 = nullableUpsellUnitPricePropertiesRemoteModel.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        NullableBasePricePropertiesRemoteModel nullableBasePricePropertiesRemoteModel = this.f71204a;
        CurrentUnitPricePropertiesRemoteModel currentUnitPricePropertiesRemoteModel = this.f71205b;
        Boolean bool = this.f71206c;
        NullableLowestPreviousPriceRemoteModel nullableLowestPreviousPriceRemoteModel = this.f71207d;
        NullablePreviousSalesPriceRemoteModel nullablePreviousSalesPriceRemoteModel = this.f71208e;
        g gVar = this.f71209f;
        NullableUpsellUnitPricePropertiesRemoteModel nullableUpsellUnitPricePropertiesRemoteModel = this.f71210g;
        return "ItemUnitPriceRemoteModel(base=" + nullableBasePricePropertiesRemoteModel + ", current=" + currentUnitPricePropertiesRemoteModel + ", isFamilyItem=" + bool + ", lowestPreviousPrice=" + nullableLowestPreviousPriceRemoteModel + ", previousSalesPrice=" + nullablePreviousSalesPriceRemoteModel + ", priceType=" + gVar + ", upsell=" + nullableUpsellUnitPricePropertiesRemoteModel + ")";
    }
}
