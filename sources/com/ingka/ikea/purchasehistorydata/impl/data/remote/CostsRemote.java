package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import Hx.c;
import androidx.annotation.Keep;
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
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 <2\u00020\u0001:\u0002=>BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJX\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010\u001d¨\u0006?"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CostsRemote;", "", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;", "total", "sub", "service", "discount", "delivery", "tax", "<init>", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$purchasehistorydata_implementation_release", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CostsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "LHx/c$a;", "convertToLocal", "()LHx/c$a;", "component1", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;)Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CostsRemote;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;", "getTotal", "getTotal$annotations", "()V", "getSub", "getSub$annotations", "getService", "getService$annotations", "getDiscount", "getDiscount$annotations", "getDelivery", "getDelivery$annotations", "getTax", "getTax$annotations", "Companion", "$serializer", "a", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CostsRemote {
    public static final int $stable = 0;
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final MoneyRemote delivery;
    private final MoneyRemote discount;
    private final MoneyRemote service;
    private final MoneyRemote sub;
    private final MoneyRemote tax;
    private final MoneyRemote total;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CostsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CostsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CostsRemote> serializer() {
            return CostsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CostsRemote(int i10, MoneyRemote moneyRemote, MoneyRemote moneyRemote2, MoneyRemote moneyRemote3, MoneyRemote moneyRemote4, MoneyRemote moneyRemote5, MoneyRemote moneyRemote6, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, CostsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.total = moneyRemote;
        this.sub = moneyRemote2;
        this.service = moneyRemote3;
        this.discount = moneyRemote4;
        this.delivery = moneyRemote5;
        this.tax = moneyRemote6;
    }

    public static /* synthetic */ CostsRemote copy$default(CostsRemote costsRemote, MoneyRemote moneyRemote, MoneyRemote moneyRemote2, MoneyRemote moneyRemote3, MoneyRemote moneyRemote4, MoneyRemote moneyRemote5, MoneyRemote moneyRemote6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            moneyRemote = costsRemote.total;
        }
        if ((i10 & 2) != 0) {
            moneyRemote2 = costsRemote.sub;
        }
        MoneyRemote moneyRemote7 = moneyRemote2;
        if ((i10 & 4) != 0) {
            moneyRemote3 = costsRemote.service;
        }
        MoneyRemote moneyRemote8 = moneyRemote3;
        if ((i10 & 8) != 0) {
            moneyRemote4 = costsRemote.discount;
        }
        MoneyRemote moneyRemote9 = moneyRemote4;
        if ((i10 & 16) != 0) {
            moneyRemote5 = costsRemote.delivery;
        }
        MoneyRemote moneyRemote10 = moneyRemote5;
        if ((i10 & 32) != 0) {
            moneyRemote6 = costsRemote.tax;
        }
        return costsRemote.copy(moneyRemote, moneyRemote7, moneyRemote8, moneyRemote9, moneyRemote10, moneyRemote6);
    }

    public static /* synthetic */ void getDelivery$annotations() {
    }

    public static /* synthetic */ void getDiscount$annotations() {
    }

    public static /* synthetic */ void getService$annotations() {
    }

    public static /* synthetic */ void getSub$annotations() {
    }

    public static /* synthetic */ void getTax$annotations() {
    }

    public static /* synthetic */ void getTotal$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchasehistorydata_implementation_release(CostsRemote costsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        MoneyRemote$$serializer moneyRemote$$serializer = MoneyRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 0, moneyRemote$$serializer, costsRemote.total);
        dVar.B(serialDescriptor, 1, moneyRemote$$serializer, costsRemote.sub);
        dVar.B(serialDescriptor, 2, moneyRemote$$serializer, costsRemote.service);
        dVar.B(serialDescriptor, 3, moneyRemote$$serializer, costsRemote.discount);
        dVar.B(serialDescriptor, 4, moneyRemote$$serializer, costsRemote.delivery);
        dVar.B(serialDescriptor, 5, moneyRemote$$serializer, costsRemote.tax);
    }

    public final MoneyRemote component1() {
        return this.total;
    }

    public final MoneyRemote component2() {
        return this.sub;
    }

    public final MoneyRemote component3() {
        return this.service;
    }

    public final MoneyRemote component4() {
        return this.discount;
    }

    public final MoneyRemote component5() {
        return this.delivery;
    }

    public final MoneyRemote component6() {
        return this.tax;
    }

    public final c.a convertToLocal() {
        MoneyRemote moneyRemote = this.total;
        Double b10 = moneyRemote != null ? moneyRemote.b() : null;
        MoneyRemote moneyRemote2 = this.sub;
        Double b11 = moneyRemote2 != null ? moneyRemote2.b() : null;
        MoneyRemote moneyRemote3 = this.service;
        Double b12 = moneyRemote3 != null ? moneyRemote3.b() : null;
        MoneyRemote moneyRemote4 = this.discount;
        Double b13 = moneyRemote4 != null ? moneyRemote4.b() : null;
        MoneyRemote moneyRemote5 = this.delivery;
        Double b14 = moneyRemote5 != null ? moneyRemote5.b() : null;
        MoneyRemote moneyRemote6 = this.tax;
        return new c.a(b10, b11, b12, b13, b14, moneyRemote6 != null ? moneyRemote6.b() : null);
    }

    public final CostsRemote copy(MoneyRemote moneyRemote, MoneyRemote moneyRemote2, MoneyRemote moneyRemote3, MoneyRemote moneyRemote4, MoneyRemote moneyRemote5, MoneyRemote moneyRemote6) {
        return new CostsRemote(moneyRemote, moneyRemote2, moneyRemote3, moneyRemote4, moneyRemote5, moneyRemote6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CostsRemote)) {
            return false;
        }
        CostsRemote costsRemote = (CostsRemote) obj;
        return C17542s.e(this.total, costsRemote.total) && C17542s.e(this.sub, costsRemote.sub) && C17542s.e(this.service, costsRemote.service) && C17542s.e(this.discount, costsRemote.discount) && C17542s.e(this.delivery, costsRemote.delivery) && C17542s.e(this.tax, costsRemote.tax);
    }

    public final MoneyRemote getDelivery() {
        return this.delivery;
    }

    public final MoneyRemote getDiscount() {
        return this.discount;
    }

    public final MoneyRemote getService() {
        return this.service;
    }

    public final MoneyRemote getSub() {
        return this.sub;
    }

    public final MoneyRemote getTax() {
        return this.tax;
    }

    public final MoneyRemote getTotal() {
        return this.total;
    }

    public int hashCode() {
        MoneyRemote moneyRemote = this.total;
        int i10 = 0;
        int hashCode = (moneyRemote == null ? 0 : moneyRemote.hashCode()) * 31;
        MoneyRemote moneyRemote2 = this.sub;
        int hashCode2 = (hashCode + (moneyRemote2 == null ? 0 : moneyRemote2.hashCode())) * 31;
        MoneyRemote moneyRemote3 = this.service;
        int hashCode3 = (hashCode2 + (moneyRemote3 == null ? 0 : moneyRemote3.hashCode())) * 31;
        MoneyRemote moneyRemote4 = this.discount;
        int hashCode4 = (hashCode3 + (moneyRemote4 == null ? 0 : moneyRemote4.hashCode())) * 31;
        MoneyRemote moneyRemote5 = this.delivery;
        int hashCode5 = (hashCode4 + (moneyRemote5 == null ? 0 : moneyRemote5.hashCode())) * 31;
        MoneyRemote moneyRemote6 = this.tax;
        if (moneyRemote6 != null) {
            i10 = moneyRemote6.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        MoneyRemote moneyRemote = this.total;
        MoneyRemote moneyRemote2 = this.sub;
        MoneyRemote moneyRemote3 = this.service;
        MoneyRemote moneyRemote4 = this.discount;
        MoneyRemote moneyRemote5 = this.delivery;
        MoneyRemote moneyRemote6 = this.tax;
        return "CostsRemote(total=" + moneyRemote + ", sub=" + moneyRemote2 + ", service=" + moneyRemote3 + ", discount=" + moneyRemote4 + ", delivery=" + moneyRemote5 + ", tax=" + moneyRemote6 + ")";
    }

    public CostsRemote(MoneyRemote moneyRemote, MoneyRemote moneyRemote2, MoneyRemote moneyRemote3, MoneyRemote moneyRemote4, MoneyRemote moneyRemote5, MoneyRemote moneyRemote6) {
        this.total = moneyRemote;
        this.sub = moneyRemote2;
        this.service = moneyRemote3;
        this.discount = moneyRemote4;
        this.delivery = moneyRemote5;
        this.tax = moneyRemote6;
    }
}
