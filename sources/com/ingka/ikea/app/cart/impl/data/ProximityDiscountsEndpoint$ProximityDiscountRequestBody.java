package com.ingka.ikea.app.cart.impl.data;

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
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 '2\u00020\u0001:\u0003()\u001eB5\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"com/ingka/ikea/app/cart/impl/data/ProximityDiscountsEndpoint$ProximityDiscountRequestBody", "", "", "seen0", "", "zipCode", "", "Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsEndpoint$ProximityDiscountRequestBody$Item;", "items", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsEndpoint$ProximityDiscountRequestBody;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsEndpoint$ProximityDiscountRequestBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getZipCode", "getZipCode$annotations", "()V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "Companion", "Item", "$serializer", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProximityDiscountsEndpoint$ProximityDiscountRequestBody {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f71812c = 8;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f71813d = {null, new C17451f(ProximityDiscountsEndpoint$ProximityDiscountRequestBody$Item$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f71814a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Item> f71815b;

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 '2\u00020\u0001:\u0002(\u0012B7\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010\u001f\u001a\u0004\b%\u0010\u0017¨\u0006)"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsEndpoint$ProximityDiscountRequestBody$Item;", "", "", "seen0", "", "itemNo", "itemType", "quantity", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsEndpoint$ProximityDiscountRequestBody$Item;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemNo", "getItemNo$annotations", "()V", "b", "getItemType", "getItemType$annotations", "c", "I", "getQuantity", "getQuantity$annotations", "Companion", "$serializer", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f71816a;

        /* renamed from: b  reason: collision with root package name */
        private final String f71817b;

        /* renamed from: c  reason: collision with root package name */
        private final int f71818c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsEndpoint$ProximityDiscountRequestBody$Item$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsEndpoint$ProximityDiscountRequestBody$Item;", "serializer", "()Lkotlinx/serialization/KSerializer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Item> serializer() {
                return ProximityDiscountsEndpoint$ProximityDiscountRequestBody$Item$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Item(int i10, String str, String str2, int i11, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, ProximityDiscountsEndpoint$ProximityDiscountRequestBody$Item$$serializer.INSTANCE.getDescriptor());
            }
            this.f71816a = str;
            this.f71817b = str2;
            this.f71818c = i11;
        }

        public static final /* synthetic */ void a(Item item, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, item.f71816a);
            dVar.y(serialDescriptor, 1, item.f71817b);
            dVar.w(serialDescriptor, 2, item.f71818c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return C17542s.e(this.f71816a, item.f71816a) && C17542s.e(this.f71817b, item.f71817b) && this.f71818c == item.f71818c;
        }

        public int hashCode() {
            return (((this.f71816a.hashCode() * 31) + this.f71817b.hashCode()) * 31) + Integer.hashCode(this.f71818c);
        }

        public String toString() {
            String str = this.f71816a;
            String str2 = this.f71817b;
            int i10 = this.f71818c;
            return "Item(itemNo=" + str + ", itemType=" + str2 + ", quantity=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsEndpoint$ProximityDiscountRequestBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsEndpoint$ProximityDiscountRequestBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProximityDiscountsEndpoint$ProximityDiscountRequestBody> serializer() {
            return ProximityDiscountsEndpoint$ProximityDiscountRequestBody$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProximityDiscountsEndpoint$ProximityDiscountRequestBody(int i10, String str, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ProximityDiscountsEndpoint$ProximityDiscountRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.f71814a = str;
        this.f71815b = list;
    }

    public static final /* synthetic */ void b(ProximityDiscountsEndpoint$ProximityDiscountRequestBody proximityDiscountsEndpoint$ProximityDiscountRequestBody, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71813d;
        dVar.y(serialDescriptor, 0, proximityDiscountsEndpoint$ProximityDiscountRequestBody.f71814a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], proximityDiscountsEndpoint$ProximityDiscountRequestBody.f71815b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProximityDiscountsEndpoint$ProximityDiscountRequestBody)) {
            return false;
        }
        ProximityDiscountsEndpoint$ProximityDiscountRequestBody proximityDiscountsEndpoint$ProximityDiscountRequestBody = (ProximityDiscountsEndpoint$ProximityDiscountRequestBody) obj;
        return C17542s.e(this.f71814a, proximityDiscountsEndpoint$ProximityDiscountRequestBody.f71814a) && C17542s.e(this.f71815b, proximityDiscountsEndpoint$ProximityDiscountRequestBody.f71815b);
    }

    public int hashCode() {
        return (this.f71814a.hashCode() * 31) + this.f71815b.hashCode();
    }

    public String toString() {
        String str = this.f71814a;
        List<Item> list = this.f71815b;
        return "ProximityDiscountRequestBody(zipCode=" + str + ", items=" + list + ")";
    }
}
