package com.ingka.ikea.feature.inspire.datalayer.impl.v6.models;

import com.ingka.ikea.core.remotemodel.InspirationFeedItemRemote;
import com.ingka.ikea.core.remotemodel.InspirationFeedItemRemote$$serializer;
import com.ingka.ikea.core.remotemodel.product.ProductWithCoordinatesRemote;
import com.ingka.ikea.core.remotemodel.product.ProductWithCoordinatesRemote$$serializer;
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
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 22\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u00023!BI\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010\u001aR\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010,\u0012\u0004\b1\u0010&\u001a\u0004\b0\u0010\u001a¨\u00064"}, d2 = {"Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/DisplayWindowRemoteV6;", "Lpp/b;", "", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/InspirationFeedItemRemote;", "inspiration", "", "Lcom/ingka/ikea/core/remotemodel/product/ProductWithCoordinatesRemote;", "products", "", "title", "banner", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/InspirationFeedItemRemote;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/DisplayWindowRemoteV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/remotemodel/InspirationFeedItemRemote;", "getInspiration", "()Lcom/ingka/ikea/core/remotemodel/InspirationFeedItemRemote;", "getInspiration$annotations", "()V", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "getProducts$annotations", "c", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "d", "getBanner", "getBanner$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DisplayWindowRemoteV6 implements C11768b<Object> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f95954e = {null, new C17451f(ProductWithCoordinatesRemote$$serializer.INSTANCE), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final InspirationFeedItemRemote f95955a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ProductWithCoordinatesRemote> f95956b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95957c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95958d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/DisplayWindowRemoteV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/DisplayWindowRemoteV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<DisplayWindowRemoteV6> serializer() {
            return DisplayWindowRemoteV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DisplayWindowRemoteV6(int i10, InspirationFeedItemRemote inspirationFeedItemRemote, List list, String str, String str2, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, DisplayWindowRemoteV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f95955a = inspirationFeedItemRemote;
        this.f95956b = list;
        this.f95957c = str;
        this.f95958d = str2;
    }

    public static final /* synthetic */ void b(DisplayWindowRemoteV6 displayWindowRemoteV6, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95954e;
        dVar.B(serialDescriptor, 0, InspirationFeedItemRemote$$serializer.INSTANCE, displayWindowRemoteV6.f95955a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], displayWindowRemoteV6.f95956b);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 2, y02, displayWindowRemoteV6.f95957c);
        dVar.B(serialDescriptor, 3, y02, displayWindowRemoteV6.f95958d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayWindowRemoteV6)) {
            return false;
        }
        DisplayWindowRemoteV6 displayWindowRemoteV6 = (DisplayWindowRemoteV6) obj;
        return C17542s.e(this.f95955a, displayWindowRemoteV6.f95955a) && C17542s.e(this.f95956b, displayWindowRemoteV6.f95956b) && C17542s.e(this.f95957c, displayWindowRemoteV6.f95957c) && C17542s.e(this.f95958d, displayWindowRemoteV6.f95958d);
    }

    public int hashCode() {
        InspirationFeedItemRemote inspirationFeedItemRemote = this.f95955a;
        int i10 = 0;
        int hashCode = (inspirationFeedItemRemote == null ? 0 : inspirationFeedItemRemote.hashCode()) * 31;
        List<ProductWithCoordinatesRemote> list = this.f95956b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f95957c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95958d;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        InspirationFeedItemRemote inspirationFeedItemRemote = this.f95955a;
        List<ProductWithCoordinatesRemote> list = this.f95956b;
        String str = this.f95957c;
        String str2 = this.f95958d;
        return "DisplayWindowRemoteV6(inspiration=" + inspirationFeedItemRemote + ", products=" + list + ", title=" + str + ", banner=" + str2 + ")";
    }
}
