package com.ingka.ikea.shoppinglist.datalayer.impl.network.model;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001dB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001e\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/ShoppingBagRequestItem;", "Ljava/io/Serializable;", "", "itemNo", "itemQty", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/ShoppingBagRequestItem;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getItemNo$annotations", "()V", "b", "getItemQty$annotations", "Companion", "$serializer", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShoppingBagRequestItem implements Serializable {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120295a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120296b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/ShoppingBagRequestItem$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/ShoppingBagRequestItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ShoppingBagRequestItem> serializer() {
            return ShoppingBagRequestItem$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShoppingBagRequestItem(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ShoppingBagRequestItem$$serializer.INSTANCE.getDescriptor());
        }
        this.f120295a = str;
        this.f120296b = str2;
    }

    public static final /* synthetic */ void c(ShoppingBagRequestItem shoppingBagRequestItem, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, Y0.f144077a, shoppingBagRequestItem.f120295a);
        dVar.y(serialDescriptor, 1, shoppingBagRequestItem.f120296b);
    }

    public final String a() {
        return this.f120295a;
    }

    public final String b() {
        return this.f120296b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingBagRequestItem)) {
            return false;
        }
        ShoppingBagRequestItem shoppingBagRequestItem = (ShoppingBagRequestItem) obj;
        return C17542s.e(this.f120295a, shoppingBagRequestItem.f120295a) && C17542s.e(this.f120296b, shoppingBagRequestItem.f120296b);
    }

    public int hashCode() {
        String str = this.f120295a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f120296b.hashCode();
    }

    public String toString() {
        String str = this.f120295a;
        String str2 = this.f120296b;
        return "ShoppingBagRequestItem(itemNo=" + str + ", itemQty=" + str2 + ")";
    }

    public ShoppingBagRequestItem(String str, String str2) {
        C17542s.j(str2, "itemQty");
        this.f120295a = str;
        this.f120296b = str2;
    }
}
