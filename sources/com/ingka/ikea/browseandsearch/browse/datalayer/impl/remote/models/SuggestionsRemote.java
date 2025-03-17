package com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models;

import YH.C16877v;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.remotemodel.LinkRemote;
import com.ingka.ikea.core.remotemodel.LinkRemote$$serializer;
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
import nn.C11662h;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\b\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002;'B{\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010(\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010*R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010(\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010*R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010(\u0012\u0004\b3\u0010,\u001a\u0004\b2\u0010*R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010(\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010*R(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010(\u0012\u0004\b9\u0010,\u001a\u0004\b8\u0010*¨\u0006<"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/SuggestionsRemote;", "Lpp/b;", "Lnn/h;", "", "seen0", "", "", "autocomplete", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/ProductCategoryRemote;", "productCategories", "rooms", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/ProductInfoRemote;", "products", "bottomAutocomplete", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "links", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/SuggestionsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lnn/h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAutocomplete", "()Ljava/util/List;", "getAutocomplete$annotations", "()V", "getProductCategories", "getProductCategories$annotations", "getRooms", "getRooms$annotations", "d", "getProducts", "getProducts$annotations", "e", "getBottomAutocomplete", "getBottomAutocomplete$annotations", "f", "getLinks", "getLinks$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SuggestionsRemote implements C11768b<C11662h> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer<Object>[] f93365g;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f93366a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ProductCategoryRemote> f93367b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ProductCategoryRemote> f93368c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ProductInfoRemote> f93369d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f93370e;

    /* renamed from: f  reason: collision with root package name */
    private final List<LinkRemote> f93371f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/SuggestionsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/SuggestionsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<SuggestionsRemote> serializer() {
            return SuggestionsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Y0 y02 = Y0.f144077a;
        C17451f fVar = new C17451f(y02);
        ProductCategoryRemote$$serializer productCategoryRemote$$serializer = ProductCategoryRemote$$serializer.INSTANCE;
        f93365g = new KSerializer[]{fVar, new C17451f(productCategoryRemote$$serializer), new C17451f(productCategoryRemote$$serializer), new C17451f(ProductInfoRemote$$serializer.INSTANCE), new C17451f(y02), new C17451f(LinkRemote$$serializer.INSTANCE)};
    }

    public /* synthetic */ SuggestionsRemote(int i10, List list, List list2, List list3, List list4, List list5, List list6, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, SuggestionsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f93366a = list;
        this.f93367b = list2;
        this.f93368c = list3;
        this.f93369d = list4;
        this.f93370e = list5;
        this.f93371f = list6;
    }

    public static final /* synthetic */ void c(SuggestionsRemote suggestionsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93365g;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], suggestionsRemote.f93366a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], suggestionsRemote.f93367b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], suggestionsRemote.f93368c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], suggestionsRemote.f93369d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], suggestionsRemote.f93370e);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], suggestionsRemote.f93371f);
    }

    public C11662h b() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<String> list = this.f93366a;
        List<ProductCategoryRemote> list2 = this.f93367b;
        ArrayList arrayList4 = null;
        if (list2 != null) {
            Iterable<ProductCategoryRemote> iterable = list2;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (ProductCategoryRemote a10 : iterable) {
                arrayList.add(a10.a());
            }
        } else {
            arrayList = null;
        }
        List<ProductCategoryRemote> list3 = this.f93368c;
        if (list3 != null) {
            Iterable<ProductCategoryRemote> iterable2 = list3;
            arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
            for (ProductCategoryRemote a11 : iterable2) {
                arrayList2.add(a11.a());
            }
        } else {
            arrayList2 = null;
        }
        List<ProductInfoRemote> list4 = this.f93369d;
        if (list4 != null) {
            Iterable<ProductInfoRemote> iterable3 = list4;
            arrayList4 = new ArrayList(C16877v.y(iterable3, 10));
            for (ProductInfoRemote a12 : iterable3) {
                arrayList4.add(a12.a());
            }
        }
        ArrayList arrayList5 = arrayList4;
        List<String> list5 = this.f93370e;
        if (list5 == null) {
            list5 = C16877v.n();
        }
        List<String> list6 = list5;
        List<LinkRemote> list7 = this.f93371f;
        if (list7 != null) {
            ArrayList arrayList6 = new ArrayList();
            for (LinkRemote b10 : list7) {
                Link b11 = b10.b();
                if (b11 != null) {
                    arrayList6.add(b11);
                }
            }
            arrayList3 = arrayList6;
        } else {
            arrayList3 = C16877v.n();
        }
        return new C11662h(list, arrayList, arrayList2, arrayList5, list6, arrayList3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestionsRemote)) {
            return false;
        }
        SuggestionsRemote suggestionsRemote = (SuggestionsRemote) obj;
        return C17542s.e(this.f93366a, suggestionsRemote.f93366a) && C17542s.e(this.f93367b, suggestionsRemote.f93367b) && C17542s.e(this.f93368c, suggestionsRemote.f93368c) && C17542s.e(this.f93369d, suggestionsRemote.f93369d) && C17542s.e(this.f93370e, suggestionsRemote.f93370e) && C17542s.e(this.f93371f, suggestionsRemote.f93371f);
    }

    public int hashCode() {
        int hashCode = this.f93366a.hashCode() * 31;
        List<ProductCategoryRemote> list = this.f93367b;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ProductCategoryRemote> list2 = this.f93368c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ProductInfoRemote> list3 = this.f93369d;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.f93370e;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<LinkRemote> list5 = this.f93371f;
        if (list5 != null) {
            i10 = list5.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        List<String> list = this.f93366a;
        List<ProductCategoryRemote> list2 = this.f93367b;
        List<ProductCategoryRemote> list3 = this.f93368c;
        List<ProductInfoRemote> list4 = this.f93369d;
        List<String> list5 = this.f93370e;
        List<LinkRemote> list6 = this.f93371f;
        return "SuggestionsRemote(autocomplete=" + list + ", productCategories=" + list2 + ", rooms=" + list3 + ", products=" + list4 + ", bottomAutocomplete=" + list5 + ", links=" + list6 + ")";
    }
}
