package com.ingka.ikea.app.stockinfo.network;

import com.ingka.ikea.app.stockinfo.local.Location;
import com.ingka.ikea.app.stockinfo.local.Status;
import com.ingka.ikea.app.stockinfo.local.StockModel;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b \b\b\u0018\u0000 B2\u00020\u0001:\u0002C'Bg\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010 R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010 R \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010(\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R \u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010+\u001a\u0004\b:\u0010;R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010+\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/StockModelRemote;", "", "", "seen0", "", "storeId", "itemNo", "itemType", "productLocation", "Lcom/ingka/ikea/app/stockinfo/network/c;", "salePoint", "Lcom/ingka/ikea/app/stockinfo/network/StatusRemote;", "statusRemote", "", "Lcom/ingka/ikea/app/stockinfo/network/LocationRemote;", "locationRemote", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/stockinfo/network/c;Lcom/ingka/ikea/app/stockinfo/network/StatusRemote;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/stockinfo/network/StockModelRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/app/stockinfo/local/StockModel;", "b", "()Lcom/ingka/ikea/app/stockinfo/local/StockModel;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStoreId", "getStoreId$annotations", "()V", "getItemNo", "getItemNo$annotations", "getItemType", "getItemType$annotations", "d", "getProductLocation", "getProductLocation$annotations", "e", "Lcom/ingka/ikea/app/stockinfo/network/c;", "getSalePoint", "()Lcom/ingka/ikea/app/stockinfo/network/c;", "getSalePoint$annotations", "f", "Lcom/ingka/ikea/app/stockinfo/network/StatusRemote;", "getStatusRemote", "()Lcom/ingka/ikea/app/stockinfo/network/StatusRemote;", "getStatusRemote$annotations", "g", "Ljava/util/List;", "getLocationRemote", "()Ljava/util/List;", "getLocationRemote$annotations", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StockModelRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f92618h = {0, 0, 0, 0, c.Companion.serializer(), 0, new C17451f(LocationRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f92619a;

    /* renamed from: b  reason: collision with root package name */
    private final String f92620b;

    /* renamed from: c  reason: collision with root package name */
    private final String f92621c;

    /* renamed from: d  reason: collision with root package name */
    private final String f92622d;

    /* renamed from: e  reason: collision with root package name */
    private final c f92623e;

    /* renamed from: f  reason: collision with root package name */
    private final StatusRemote f92624f;

    /* renamed from: g  reason: collision with root package name */
    private final List<LocationRemote> f92625g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/StockModelRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/StockModelRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StockModelRemote> serializer() {
            return StockModelRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StockModelRemote(int i10, String str, String str2, String str3, String str4, c cVar, StatusRemote statusRemote, List list, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, StockModelRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92619a = str;
        this.f92620b = str2;
        this.f92621c = str3;
        this.f92622d = str4;
        this.f92623e = cVar;
        this.f92624f = statusRemote;
        this.f92625g = list;
    }

    public static final /* synthetic */ void c(StockModelRemote stockModelRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f92618h;
        dVar.y(serialDescriptor, 0, stockModelRemote.f92619a);
        dVar.y(serialDescriptor, 1, stockModelRemote.f92620b);
        dVar.y(serialDescriptor, 2, stockModelRemote.f92621c);
        dVar.B(serialDescriptor, 3, Y0.f144077a, stockModelRemote.f92622d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], stockModelRemote.f92623e);
        dVar.i(serialDescriptor, 5, StatusRemote$$serializer.INSTANCE, stockModelRemote.f92624f);
        dVar.i(serialDescriptor, 6, kSerializerArr[6], stockModelRemote.f92625g);
    }

    public final StockModel b() {
        Status b10 = this.f92624f.b();
        if (b10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (LocationRemote b11 : this.f92625g) {
            Location b12 = b11.b();
            if (b12 != null) {
                arrayList.add(b12);
            }
        }
        return new StockModel(this.f92619a, this.f92620b, this.f92621c, this.f92622d, this.f92623e, b10, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockModelRemote)) {
            return false;
        }
        StockModelRemote stockModelRemote = (StockModelRemote) obj;
        return C17542s.e(this.f92619a, stockModelRemote.f92619a) && C17542s.e(this.f92620b, stockModelRemote.f92620b) && C17542s.e(this.f92621c, stockModelRemote.f92621c) && C17542s.e(this.f92622d, stockModelRemote.f92622d) && this.f92623e == stockModelRemote.f92623e && C17542s.e(this.f92624f, stockModelRemote.f92624f) && C17542s.e(this.f92625g, stockModelRemote.f92625g);
    }

    public int hashCode() {
        int hashCode = ((((this.f92619a.hashCode() * 31) + this.f92620b.hashCode()) * 31) + this.f92621c.hashCode()) * 31;
        String str = this.f92622d;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.f92623e;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return ((((hashCode2 + i10) * 31) + this.f92624f.hashCode()) * 31) + this.f92625g.hashCode();
    }

    public String toString() {
        String str = this.f92619a;
        String str2 = this.f92620b;
        String str3 = this.f92621c;
        String str4 = this.f92622d;
        c cVar = this.f92623e;
        StatusRemote statusRemote = this.f92624f;
        List<LocationRemote> list = this.f92625g;
        return "StockModelRemote(storeId=" + str + ", itemNo=" + str2 + ", itemType=" + str3 + ", productLocation=" + str4 + ", salePoint=" + cVar + ", statusRemote=" + statusRemote + ", locationRemote=" + list + ")";
    }
}
