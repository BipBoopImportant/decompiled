package com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote;

import YH.C16877v;
import com.ingka.ikea.core.model.KeyBenefits;
import com.ingka.ikea.core.remotemodel.CampaignsRemote;
import com.ingka.ikea.core.remotemodel.CampaignsRemote$$serializer;
import com.ingka.ikea.core.remotemodel.KeyBenefitsRemote;
import com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer;
import com.ingka.ikea.core.remotemodel.TopSuggestionsRemote;
import com.ingka.ikea.core.remotemodel.TopSuggestionsRemote$$serializer;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
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
import kp.l;
import pp.C11768b;
import un.b;
import vn.C12196a;
import vn.d;
import vn.e;
import vn.f;

@p
@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\bJ\b\b\u0018\u0000 |2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002}8BÍ\u0001\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J'\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u00109\u0012\u0004\b?\u0010=\u001a\u0004\b>\u0010;R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010@\u0012\u0004\bC\u0010=\u001a\u0004\bA\u0010BR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010=\u001a\u0004\bF\u0010GR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u0010=\u001a\u0004\bK\u0010LR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010=\u001a\u0004\bP\u0010QR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u0010=\u001a\u0004\bU\u0010VR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\u0012\n\u0004\bX\u0010Y\u0012\u0004\b\\\u0010=\u001a\u0004\bZ\u0010[R(\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b]\u00109\u0012\u0004\b_\u0010=\u001a\u0004\b^\u0010;R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bd\u0010=\u001a\u0004\bb\u0010cR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0004¢\u0006\u0012\n\u0004\be\u0010f\u0012\u0004\bi\u0010=\u001a\u0004\bg\u0010hR\"\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\u0012\n\u0004\bj\u0010a\u0012\u0004\bl\u0010=\u001a\u0004\bk\u0010cR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\u0012\n\u0004\bm\u0010a\u0012\u0004\bo\u0010=\u001a\u0004\bn\u0010cR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\u0012\n\u0004\bp\u0010Y\u0012\u0004\br\u0010=\u001a\u0004\bq\u0010[R\"\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0004¢\u0006\u0012\n\u0004\bs\u0010t\u0012\u0004\bw\u0010=\u001a\u0004\bu\u0010vR\"\u0010!\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\bx\u0010y\u0012\u0004\b{\u0010=\u001a\u0004\bz\u00101¨\u0006~"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/PlpDetailResponseV6;", "Lpp/b;", "Lun/b;", "", "seen0", "", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "productList", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6;", "facetsList", "", "showAvailabilityBanner", "Lcom/ingka/ikea/core/remotemodel/KeyBenefitsRemote;", "keyBenefitsList", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6;", "metaInfo", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6;", "header", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteListV6;", "subCategories", "Lcom/ingka/ikea/core/remotemodel/TopSuggestionsRemote;", "suggestions", "", "didYouMean", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/SearchInspireFeedRemote;", "inspireFeed", "Lcom/ingka/ikea/core/remotemodel/CampaignsRemote;", "campaigns", "inspirations", "vugc", "relatedSearches", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteV6;", "mostLovedCategory", "token", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/ingka/ikea/core/remotemodel/KeyBenefitsRemote;Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6;Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6;Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteListV6;Lcom/ingka/ikea/core/remotemodel/TopSuggestionsRemote;Ljava/util/List;Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/SearchInspireFeedRemote;Lcom/ingka/ikea/core/remotemodel/CampaignsRemote;Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/SearchInspireFeedRemote;Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/SearchInspireFeedRemote;Lcom/ingka/ikea/core/remotemodel/TopSuggestionsRemote;Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteV6;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/PlpDetailResponseV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lun/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getProductList", "()Ljava/util/List;", "getProductList$annotations", "()V", "getFacetsList", "getFacetsList$annotations", "Ljava/lang/Boolean;", "getShowAvailabilityBanner", "()Ljava/lang/Boolean;", "getShowAvailabilityBanner$annotations", "d", "Lcom/ingka/ikea/core/remotemodel/KeyBenefitsRemote;", "getKeyBenefitsList", "()Lcom/ingka/ikea/core/remotemodel/KeyBenefitsRemote;", "getKeyBenefitsList$annotations", "e", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6;", "getMetaInfo", "()Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/MetaInfoRemoteV6;", "getMetaInfo$annotations", "f", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6;", "getHeader", "()Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6;", "getHeader$annotations", "g", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteListV6;", "getSubCategories", "()Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteListV6;", "getSubCategories$annotations", "h", "Lcom/ingka/ikea/core/remotemodel/TopSuggestionsRemote;", "getSuggestions", "()Lcom/ingka/ikea/core/remotemodel/TopSuggestionsRemote;", "getSuggestions$annotations", "i", "getDidYouMean", "getDidYouMean$annotations", "j", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/SearchInspireFeedRemote;", "getInspireFeed", "()Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/SearchInspireFeedRemote;", "getInspireFeed$annotations", "k", "Lcom/ingka/ikea/core/remotemodel/CampaignsRemote;", "getCampaigns", "()Lcom/ingka/ikea/core/remotemodel/CampaignsRemote;", "getCampaigns$annotations", "l", "getInspirations", "getInspirations$annotations", "m", "getVugc", "getVugc$annotations", "n", "getRelatedSearches", "getRelatedSearches$annotations", "o", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteV6;", "getMostLovedCategory", "()Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteV6;", "getMostLovedCategory$annotations", "p", "Ljava/lang/String;", "getToken", "getToken$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlpDetailResponseV6 implements C11768b<b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final KSerializer<Object>[] f93432q = {new C17451f(ProductLiteRemote$$serializer.INSTANCE), new C17451f(FacetsRemoteV6$$serializer.INSTANCE), null, null, null, null, null, null, new C17451f(Y0.f144077a), null, null, null, null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<ProductLiteRemote> f93433a;

    /* renamed from: b  reason: collision with root package name */
    private final List<FacetsRemoteV6> f93434b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f93435c;

    /* renamed from: d  reason: collision with root package name */
    private final KeyBenefitsRemote f93436d;

    /* renamed from: e  reason: collision with root package name */
    private final MetaInfoRemoteV6 f93437e;

    /* renamed from: f  reason: collision with root package name */
    private final HeaderRemoteV6 f93438f;

    /* renamed from: g  reason: collision with root package name */
    private final CategoryRemoteListV6 f93439g;

    /* renamed from: h  reason: collision with root package name */
    private final TopSuggestionsRemote f93440h;

    /* renamed from: i  reason: collision with root package name */
    private final List<String> f93441i;

    /* renamed from: j  reason: collision with root package name */
    private final SearchInspireFeedRemote f93442j;

    /* renamed from: k  reason: collision with root package name */
    private final CampaignsRemote f93443k;

    /* renamed from: l  reason: collision with root package name */
    private final SearchInspireFeedRemote f93444l;

    /* renamed from: m  reason: collision with root package name */
    private final SearchInspireFeedRemote f93445m;

    /* renamed from: n  reason: collision with root package name */
    private final TopSuggestionsRemote f93446n;

    /* renamed from: o  reason: collision with root package name */
    private final CategoryRemoteV6 f93447o;

    /* renamed from: p  reason: collision with root package name */
    private final String f93448p;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/PlpDetailResponseV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/PlpDetailResponseV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PlpDetailResponseV6> serializer() {
            return PlpDetailResponseV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PlpDetailResponseV6(int i10, List list, List list2, Boolean bool, KeyBenefitsRemote keyBenefitsRemote, MetaInfoRemoteV6 metaInfoRemoteV6, HeaderRemoteV6 headerRemoteV6, CategoryRemoteListV6 categoryRemoteListV6, TopSuggestionsRemote topSuggestionsRemote, List list3, SearchInspireFeedRemote searchInspireFeedRemote, CampaignsRemote campaignsRemote, SearchInspireFeedRemote searchInspireFeedRemote2, SearchInspireFeedRemote searchInspireFeedRemote3, TopSuggestionsRemote topSuggestionsRemote2, CategoryRemoteV6 categoryRemoteV6, String str, T0 t02) {
        if (65535 != (i10 & 65535)) {
            E0.b(i10, 65535, PlpDetailResponseV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f93433a = list;
        this.f93434b = list2;
        this.f93435c = bool;
        this.f93436d = keyBenefitsRemote;
        this.f93437e = metaInfoRemoteV6;
        this.f93438f = headerRemoteV6;
        this.f93439g = categoryRemoteListV6;
        this.f93440h = topSuggestionsRemote;
        this.f93441i = list3;
        this.f93442j = searchInspireFeedRemote;
        this.f93443k = campaignsRemote;
        this.f93444l = searchInspireFeedRemote2;
        this.f93445m = searchInspireFeedRemote3;
        this.f93446n = topSuggestionsRemote2;
        this.f93447o = categoryRemoteV6;
        this.f93448p = str;
    }

    public static final /* synthetic */ void c(PlpDetailResponseV6 plpDetailResponseV6, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93432q;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], plpDetailResponseV6.f93433a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], plpDetailResponseV6.f93434b);
        dVar.B(serialDescriptor, 2, C17457i.f144111a, plpDetailResponseV6.f93435c);
        dVar.B(serialDescriptor, 3, KeyBenefitsRemote$$serializer.INSTANCE, plpDetailResponseV6.f93436d);
        dVar.B(serialDescriptor, 4, MetaInfoRemoteV6$$serializer.INSTANCE, plpDetailResponseV6.f93437e);
        dVar.B(serialDescriptor, 5, HeaderRemoteV6$$serializer.INSTANCE, plpDetailResponseV6.f93438f);
        dVar.B(serialDescriptor, 6, CategoryRemoteListV6$$serializer.INSTANCE, plpDetailResponseV6.f93439g);
        TopSuggestionsRemote$$serializer topSuggestionsRemote$$serializer = TopSuggestionsRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 7, topSuggestionsRemote$$serializer, plpDetailResponseV6.f93440h);
        dVar.B(serialDescriptor, 8, kSerializerArr[8], plpDetailResponseV6.f93441i);
        SearchInspireFeedRemote$$serializer searchInspireFeedRemote$$serializer = SearchInspireFeedRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 9, searchInspireFeedRemote$$serializer, plpDetailResponseV6.f93442j);
        dVar.B(serialDescriptor, 10, CampaignsRemote$$serializer.INSTANCE, plpDetailResponseV6.f93443k);
        dVar.B(serialDescriptor, 11, searchInspireFeedRemote$$serializer, plpDetailResponseV6.f93444l);
        dVar.B(serialDescriptor, 12, searchInspireFeedRemote$$serializer, plpDetailResponseV6.f93445m);
        dVar.B(serialDescriptor, 13, topSuggestionsRemote$$serializer, plpDetailResponseV6.f93446n);
        dVar.B(serialDescriptor, 14, CategoryRemoteV6$$serializer.INSTANCE, plpDetailResponseV6.f93447o);
        dVar.B(serialDescriptor, 15, Y0.f144077a, plpDetailResponseV6.f93448p);
    }

    public b b() {
        List list;
        Iterable<ProductLiteRemote> iterable = this.f93433a;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ProductLiteRemote s10 : iterable) {
            arrayList.add(s10.s());
        }
        List<FacetsRemoteV6> list2 = this.f93434b;
        if (list2 != null) {
            Iterable<FacetsRemoteV6> iterable2 = list2;
            list = new ArrayList(C16877v.y(iterable2, 10));
            for (FacetsRemoteV6 b10 : iterable2) {
                list.add(b10.b());
            }
        } else {
            list = C16877v.n();
        }
        boolean e10 = C17542s.e(this.f93435c, Boolean.TRUE);
        KeyBenefitsRemote keyBenefitsRemote = this.f93436d;
        KeyBenefits b11 = keyBenefitsRemote != null ? keyBenefitsRemote.b() : null;
        MetaInfoRemoteV6 metaInfoRemoteV6 = this.f93437e;
        f b12 = metaInfoRemoteV6 != null ? metaInfoRemoteV6.b() : null;
        HeaderRemoteV6 headerRemoteV6 = this.f93438f;
        d a10 = headerRemoteV6 != null ? headerRemoteV6.a() : null;
        CategoryRemoteListV6 categoryRemoteListV6 = this.f93439g;
        List<C12196a> b13 = categoryRemoteListV6 != null ? categoryRemoteListV6.b() : null;
        TopSuggestionsRemote topSuggestionsRemote = this.f93440h;
        l b14 = topSuggestionsRemote != null ? topSuggestionsRemote.b() : null;
        List<String> list3 = this.f93441i;
        SearchInspireFeedRemote searchInspireFeedRemote = this.f93442j;
        e b15 = searchInspireFeedRemote != null ? searchInspireFeedRemote.b() : null;
        CampaignsRemote campaignsRemote = this.f93443k;
        return new b(arrayList, list, e10, b11, b12, a10, b13, b14, list3, b15, campaignsRemote != null ? campaignsRemote.b() : null, this.f93448p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlpDetailResponseV6)) {
            return false;
        }
        PlpDetailResponseV6 plpDetailResponseV6 = (PlpDetailResponseV6) obj;
        return C17542s.e(this.f93433a, plpDetailResponseV6.f93433a) && C17542s.e(this.f93434b, plpDetailResponseV6.f93434b) && C17542s.e(this.f93435c, plpDetailResponseV6.f93435c) && C17542s.e(this.f93436d, plpDetailResponseV6.f93436d) && C17542s.e(this.f93437e, plpDetailResponseV6.f93437e) && C17542s.e(this.f93438f, plpDetailResponseV6.f93438f) && C17542s.e(this.f93439g, plpDetailResponseV6.f93439g) && C17542s.e(this.f93440h, plpDetailResponseV6.f93440h) && C17542s.e(this.f93441i, plpDetailResponseV6.f93441i) && C17542s.e(this.f93442j, plpDetailResponseV6.f93442j) && C17542s.e(this.f93443k, plpDetailResponseV6.f93443k) && C17542s.e(this.f93444l, plpDetailResponseV6.f93444l) && C17542s.e(this.f93445m, plpDetailResponseV6.f93445m) && C17542s.e(this.f93446n, plpDetailResponseV6.f93446n) && C17542s.e(this.f93447o, plpDetailResponseV6.f93447o) && C17542s.e(this.f93448p, plpDetailResponseV6.f93448p);
    }

    public int hashCode() {
        int hashCode = this.f93433a.hashCode() * 31;
        List<FacetsRemoteV6> list = this.f93434b;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f93435c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        KeyBenefitsRemote keyBenefitsRemote = this.f93436d;
        int hashCode4 = (hashCode3 + (keyBenefitsRemote == null ? 0 : keyBenefitsRemote.hashCode())) * 31;
        MetaInfoRemoteV6 metaInfoRemoteV6 = this.f93437e;
        int hashCode5 = (hashCode4 + (metaInfoRemoteV6 == null ? 0 : metaInfoRemoteV6.hashCode())) * 31;
        HeaderRemoteV6 headerRemoteV6 = this.f93438f;
        int hashCode6 = (hashCode5 + (headerRemoteV6 == null ? 0 : headerRemoteV6.hashCode())) * 31;
        CategoryRemoteListV6 categoryRemoteListV6 = this.f93439g;
        int hashCode7 = (hashCode6 + (categoryRemoteListV6 == null ? 0 : categoryRemoteListV6.hashCode())) * 31;
        TopSuggestionsRemote topSuggestionsRemote = this.f93440h;
        int hashCode8 = (hashCode7 + (topSuggestionsRemote == null ? 0 : topSuggestionsRemote.hashCode())) * 31;
        List<String> list2 = this.f93441i;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SearchInspireFeedRemote searchInspireFeedRemote = this.f93442j;
        int hashCode10 = (hashCode9 + (searchInspireFeedRemote == null ? 0 : searchInspireFeedRemote.hashCode())) * 31;
        CampaignsRemote campaignsRemote = this.f93443k;
        int hashCode11 = (hashCode10 + (campaignsRemote == null ? 0 : campaignsRemote.hashCode())) * 31;
        SearchInspireFeedRemote searchInspireFeedRemote2 = this.f93444l;
        int hashCode12 = (hashCode11 + (searchInspireFeedRemote2 == null ? 0 : searchInspireFeedRemote2.hashCode())) * 31;
        SearchInspireFeedRemote searchInspireFeedRemote3 = this.f93445m;
        int hashCode13 = (hashCode12 + (searchInspireFeedRemote3 == null ? 0 : searchInspireFeedRemote3.hashCode())) * 31;
        TopSuggestionsRemote topSuggestionsRemote2 = this.f93446n;
        int hashCode14 = (hashCode13 + (topSuggestionsRemote2 == null ? 0 : topSuggestionsRemote2.hashCode())) * 31;
        CategoryRemoteV6 categoryRemoteV6 = this.f93447o;
        int hashCode15 = (hashCode14 + (categoryRemoteV6 == null ? 0 : categoryRemoteV6.hashCode())) * 31;
        String str = this.f93448p;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode15 + i10;
    }

    public String toString() {
        List<ProductLiteRemote> list = this.f93433a;
        List<FacetsRemoteV6> list2 = this.f93434b;
        Boolean bool = this.f93435c;
        KeyBenefitsRemote keyBenefitsRemote = this.f93436d;
        MetaInfoRemoteV6 metaInfoRemoteV6 = this.f93437e;
        HeaderRemoteV6 headerRemoteV6 = this.f93438f;
        CategoryRemoteListV6 categoryRemoteListV6 = this.f93439g;
        TopSuggestionsRemote topSuggestionsRemote = this.f93440h;
        List<String> list3 = this.f93441i;
        SearchInspireFeedRemote searchInspireFeedRemote = this.f93442j;
        CampaignsRemote campaignsRemote = this.f93443k;
        SearchInspireFeedRemote searchInspireFeedRemote2 = this.f93444l;
        SearchInspireFeedRemote searchInspireFeedRemote3 = this.f93445m;
        TopSuggestionsRemote topSuggestionsRemote2 = this.f93446n;
        CategoryRemoteV6 categoryRemoteV6 = this.f93447o;
        String str = this.f93448p;
        return "PlpDetailResponseV6(productList=" + list + ", facetsList=" + list2 + ", showAvailabilityBanner=" + bool + ", keyBenefitsList=" + keyBenefitsRemote + ", metaInfo=" + metaInfoRemoteV6 + ", header=" + headerRemoteV6 + ", subCategories=" + categoryRemoteListV6 + ", suggestions=" + topSuggestionsRemote + ", didYouMean=" + list3 + ", inspireFeed=" + searchInspireFeedRemote + ", campaigns=" + campaignsRemote + ", inspirations=" + searchInspireFeedRemote2 + ", vugc=" + searchInspireFeedRemote3 + ", relatedSearches=" + topSuggestionsRemote2 + ", mostLovedCategory=" + categoryRemoteV6 + ", token=" + str + ")";
    }
}
