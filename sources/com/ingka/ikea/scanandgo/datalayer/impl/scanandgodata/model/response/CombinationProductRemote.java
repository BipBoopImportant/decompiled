package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u0000 :2\u00020\u0001:\u0002;$Bk\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001dR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010%\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001dR \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u001fR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010%\u0012\u0004\b5\u0010(\u001a\u0004\b)\u0010\u001dR \u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u00106\u0012\u0004\b8\u0010(\u001a\u0004\b0\u00107R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u00101\u0012\u0004\b9\u0010(\u001a\u0004\b,\u00103¨\u0006<"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;", "", "", "seen0", "", "id", "name", "qty", "", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "images", "basedOnSPR", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductDetailsRemote;", "details", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductChildItemRemote;", "childItems", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductDetailsRemote;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "i", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "getId$annotations", "()V", "b", "g", "getName$annotations", "c", "I", "h", "getQty$annotations", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "getImages$annotations", "getBasedOnSPR$annotations", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductDetailsRemote;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductDetailsRemote;", "getDetails$annotations", "getChildItems$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CombinationProductRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f120002h = {null, null, null, new C17451f(ImageRemote$$serializer.INSTANCE), null, null, new C17451f(CombinationProductChildItemRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f120003a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120004b;

    /* renamed from: c  reason: collision with root package name */
    private final int f120005c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ImageRemote> f120006d;

    /* renamed from: e  reason: collision with root package name */
    private final String f120007e;

    /* renamed from: f  reason: collision with root package name */
    private final CombinationProductDetailsRemote f120008f;

    /* renamed from: g  reason: collision with root package name */
    private final List<CombinationProductChildItemRemote> f120009g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CombinationProductRemote> serializer() {
            return CombinationProductRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CombinationProductRemote(int i10, String str, String str2, int i11, List list, String str3, CombinationProductDetailsRemote combinationProductDetailsRemote, List list2, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, CombinationProductRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120003a = str;
        this.f120004b = str2;
        this.f120005c = i11;
        this.f120006d = list;
        this.f120007e = str3;
        this.f120008f = combinationProductDetailsRemote;
        this.f120009g = list2;
    }

    public static final /* synthetic */ void i(CombinationProductRemote combinationProductRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120002h;
        dVar.y(serialDescriptor, 0, combinationProductRemote.f120003a);
        dVar.y(serialDescriptor, 1, combinationProductRemote.f120004b);
        dVar.w(serialDescriptor, 2, combinationProductRemote.f120005c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], combinationProductRemote.f120006d);
        dVar.B(serialDescriptor, 4, Y0.f144077a, combinationProductRemote.f120007e);
        dVar.i(serialDescriptor, 5, CombinationProductDetailsRemote$$serializer.INSTANCE, combinationProductRemote.f120008f);
        dVar.i(serialDescriptor, 6, kSerializerArr[6], combinationProductRemote.f120009g);
    }

    public final String b() {
        return this.f120007e;
    }

    public final List<CombinationProductChildItemRemote> c() {
        return this.f120009g;
    }

    public final CombinationProductDetailsRemote d() {
        return this.f120008f;
    }

    public final String e() {
        return this.f120003a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinationProductRemote)) {
            return false;
        }
        CombinationProductRemote combinationProductRemote = (CombinationProductRemote) obj;
        return C17542s.e(this.f120003a, combinationProductRemote.f120003a) && C17542s.e(this.f120004b, combinationProductRemote.f120004b) && this.f120005c == combinationProductRemote.f120005c && C17542s.e(this.f120006d, combinationProductRemote.f120006d) && C17542s.e(this.f120007e, combinationProductRemote.f120007e) && C17542s.e(this.f120008f, combinationProductRemote.f120008f) && C17542s.e(this.f120009g, combinationProductRemote.f120009g);
    }

    public final List<ImageRemote> f() {
        return this.f120006d;
    }

    public final String g() {
        return this.f120004b;
    }

    public final int h() {
        return this.f120005c;
    }

    public int hashCode() {
        int hashCode = ((((((this.f120003a.hashCode() * 31) + this.f120004b.hashCode()) * 31) + Integer.hashCode(this.f120005c)) * 31) + this.f120006d.hashCode()) * 31;
        String str = this.f120007e;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f120008f.hashCode()) * 31) + this.f120009g.hashCode();
    }

    public String toString() {
        String str = this.f120003a;
        String str2 = this.f120004b;
        int i10 = this.f120005c;
        List<ImageRemote> list = this.f120006d;
        String str3 = this.f120007e;
        CombinationProductDetailsRemote combinationProductDetailsRemote = this.f120008f;
        List<CombinationProductChildItemRemote> list2 = this.f120009g;
        return "CombinationProductRemote(id=" + str + ", name=" + str2 + ", qty=" + i10 + ", images=" + list + ", basedOnSPR=" + str3 + ", details=" + combinationProductDetailsRemote + ", childItems=" + list2 + ")";
    }
}
