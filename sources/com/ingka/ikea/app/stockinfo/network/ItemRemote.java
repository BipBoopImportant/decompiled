package com.ingka.ikea.app.stockinfo.network;

import com.ingka.ikea.app.stockinfo.local.Item;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001c\b\b\u0018\u0000 ;2\u00020\u0001:\u0002<\u001aBa\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001dR \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010$\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001dR \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010$\u0012\u0004\b/\u0010'\u001a\u0004\b.\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010$\u0012\u0004\b2\u0010'\u001a\u0004\b1\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010$\u0012\u0004\b5\u0010'\u001a\u0004\b4\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010'\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/ItemRemote;", "", "", "seen0", "", "title", "description", "articleNo", "productId", "productType", "itemLocation", "Lcom/ingka/ikea/app/stockinfo/network/ShelfOrRackRemote;", "shelfOrRackRemote", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/stockinfo/network/ShelfOrRackRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/stockinfo/network/ItemRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/app/stockinfo/local/Item;", "a", "()Lcom/ingka/ikea/app/stockinfo/local/Item;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "c", "getArticleNo", "getArticleNo$annotations", "d", "getProductId", "getProductId$annotations", "e", "getProductType", "getProductType$annotations", "f", "getItemLocation", "getItemLocation$annotations", "g", "Lcom/ingka/ikea/app/stockinfo/network/ShelfOrRackRemote;", "getShelfOrRackRemote", "()Lcom/ingka/ikea/app/stockinfo/network/ShelfOrRackRemote;", "getShelfOrRackRemote$annotations", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ItemRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f92600a;

    /* renamed from: b  reason: collision with root package name */
    private final String f92601b;

    /* renamed from: c  reason: collision with root package name */
    private final String f92602c;

    /* renamed from: d  reason: collision with root package name */
    private final String f92603d;

    /* renamed from: e  reason: collision with root package name */
    private final String f92604e;

    /* renamed from: f  reason: collision with root package name */
    private final String f92605f;

    /* renamed from: g  reason: collision with root package name */
    private final ShelfOrRackRemote f92606g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/ItemRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/ItemRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ItemRemote> serializer() {
            return ItemRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ItemRemote(int i10, String str, String str2, String str3, String str4, String str5, String str6, ShelfOrRackRemote shelfOrRackRemote, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, ItemRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92600a = str;
        this.f92601b = str2;
        this.f92602c = str3;
        this.f92603d = str4;
        this.f92604e = str5;
        this.f92605f = str6;
        if ((i10 & 64) == 0) {
            this.f92606g = null;
        } else {
            this.f92606g = shelfOrRackRemote;
        }
    }

    public static final /* synthetic */ void b(ItemRemote itemRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, itemRemote.f92600a);
        dVar.y(serialDescriptor, 1, itemRemote.f92601b);
        dVar.y(serialDescriptor, 2, itemRemote.f92602c);
        dVar.y(serialDescriptor, 3, itemRemote.f92603d);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 4, y02, itemRemote.f92604e);
        dVar.B(serialDescriptor, 5, y02, itemRemote.f92605f);
        if (dVar.z(serialDescriptor, 6) || itemRemote.f92606g != null) {
            dVar.B(serialDescriptor, 6, ShelfOrRackRemote$$serializer.INSTANCE, itemRemote.f92606g);
        }
    }

    public final Item a() {
        String str = this.f92603d;
        String str2 = this.f92600a;
        String str3 = this.f92601b;
        String str4 = this.f92602c;
        String str5 = this.f92604e;
        String str6 = this.f92605f;
        ShelfOrRackRemote shelfOrRackRemote = this.f92606g;
        return new Item(str, str2, str3, str4, str5, str6, shelfOrRackRemote != null ? shelfOrRackRemote.a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemRemote)) {
            return false;
        }
        ItemRemote itemRemote = (ItemRemote) obj;
        return C17542s.e(this.f92600a, itemRemote.f92600a) && C17542s.e(this.f92601b, itemRemote.f92601b) && C17542s.e(this.f92602c, itemRemote.f92602c) && C17542s.e(this.f92603d, itemRemote.f92603d) && C17542s.e(this.f92604e, itemRemote.f92604e) && C17542s.e(this.f92605f, itemRemote.f92605f) && C17542s.e(this.f92606g, itemRemote.f92606g);
    }

    public int hashCode() {
        int hashCode = ((((((this.f92600a.hashCode() * 31) + this.f92601b.hashCode()) * 31) + this.f92602c.hashCode()) * 31) + this.f92603d.hashCode()) * 31;
        String str = this.f92604e;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92605f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShelfOrRackRemote shelfOrRackRemote = this.f92606g;
        if (shelfOrRackRemote != null) {
            i10 = shelfOrRackRemote.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f92600a;
        String str2 = this.f92601b;
        String str3 = this.f92602c;
        String str4 = this.f92603d;
        String str5 = this.f92604e;
        String str6 = this.f92605f;
        ShelfOrRackRemote shelfOrRackRemote = this.f92606g;
        return "ItemRemote(title=" + str + ", description=" + str2 + ", articleNo=" + str3 + ", productId=" + str4 + ", productType=" + str5 + ", itemLocation=" + str6 + ", shelfOrRackRemote=" + shelfOrRackRemote + ")";
    }
}
