package com.ingka.ikea.datalayer.impl.v6;

import Mp.c;
import YH.C16877v;
import com.ingka.ikea.core.remotemodel.ProductCatPLRemote;
import com.ingka.ikea.core.remotemodel.ProductCatPLRemote$$serializer;
import com.ingka.ikea.core.remotemodel.ReferenceImageRemote;
import com.ingka.ikea.core.remotemodel.ReferenceImageRemote$$serializer;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer;
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
import kp.g;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\b\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002O,B\u0001\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010$R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010$R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u00100\u001a\u0004\b7\u00108R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010-\u0012\u0004\b<\u00100\u001a\u0004\b;\u0010$R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010-\u0012\u0004\b?\u00100\u001a\u0004\b>\u0010$R(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u00106\u0012\u0004\bB\u00100\u001a\u0004\bA\u00108R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u0010-\u0012\u0004\bE\u00100\u001a\u0004\bD\u0010$R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u00100\u001a\u0004\bH\u0010IR(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bK\u00106\u0012\u0004\bM\u00100\u001a\u0004\bL\u00108¨\u0006P"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/v6/SceneRemoteV6;", "Lpp/b;", "LMp/c;", "", "seen0", "", "id", "titlePH", "descriptionPH", "", "Lcom/ingka/ikea/core/remotemodel/ReferenceImageRemote;", "mediaPH", "titlePL", "descriptionPL", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "productsPL", "productsPLId", "Lcom/ingka/ikea/core/remotemodel/ProductCatPLRemote;", "productCatPL", "Lcom/ingka/ikea/datalayer/impl/v6/QuoteRemoteV6;", "quotes", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ProductCatPLRemote;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/datalayer/impl/v6/SceneRemoteV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LMp/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitlePH", "getTitlePH$annotations", "getDescriptionPH", "getDescriptionPH$annotations", "d", "Ljava/util/List;", "getMediaPH", "()Ljava/util/List;", "getMediaPH$annotations", "e", "getTitlePL", "getTitlePL$annotations", "f", "getDescriptionPL", "getDescriptionPL$annotations", "g", "getProductsPL", "getProductsPL$annotations", "h", "getProductsPLId", "getProductsPLId$annotations", "i", "Lcom/ingka/ikea/core/remotemodel/ProductCatPLRemote;", "getProductCatPL", "()Lcom/ingka/ikea/core/remotemodel/ProductCatPLRemote;", "getProductCatPL$annotations", "j", "getQuotes", "getQuotes$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SceneRemoteV6 implements C11768b<c> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer<Object>[] f95498k = {null, null, null, new C17451f(ReferenceImageRemote$$serializer.INSTANCE), null, null, new C17451f(ProductLiteRemote$$serializer.INSTANCE), null, null, new C17451f(QuoteRemoteV6$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95499a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95500b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95501c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ReferenceImageRemote> f95502d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95503e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95504f;

    /* renamed from: g  reason: collision with root package name */
    private final List<ProductLiteRemote> f95505g;

    /* renamed from: h  reason: collision with root package name */
    private final String f95506h;

    /* renamed from: i  reason: collision with root package name */
    private final ProductCatPLRemote f95507i;

    /* renamed from: j  reason: collision with root package name */
    private final List<QuoteRemoteV6> f95508j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/v6/SceneRemoteV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/datalayer/impl/v6/SceneRemoteV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<SceneRemoteV6> serializer() {
            return SceneRemoteV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SceneRemoteV6(int i10, String str, String str2, String str3, List list, String str4, String str5, List list2, String str6, ProductCatPLRemote productCatPLRemote, List list3, T0 t02) {
        if (1023 != (i10 & 1023)) {
            E0.b(i10, 1023, SceneRemoteV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f95499a = str;
        this.f95500b = str2;
        this.f95501c = str3;
        this.f95502d = list;
        this.f95503e = str4;
        this.f95504f = str5;
        this.f95505g = list2;
        this.f95506h = str6;
        this.f95507i = productCatPLRemote;
        this.f95508j = list3;
    }

    public static final /* synthetic */ void c(SceneRemoteV6 sceneRemoteV6, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95498k;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, sceneRemoteV6.f95499a);
        dVar.B(serialDescriptor, 1, y02, sceneRemoteV6.f95500b);
        dVar.B(serialDescriptor, 2, y02, sceneRemoteV6.f95501c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], sceneRemoteV6.f95502d);
        dVar.B(serialDescriptor, 4, y02, sceneRemoteV6.f95503e);
        dVar.B(serialDescriptor, 5, y02, sceneRemoteV6.f95504f);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], sceneRemoteV6.f95505g);
        dVar.B(serialDescriptor, 7, y02, sceneRemoteV6.f95506h);
        dVar.B(serialDescriptor, 8, ProductCatPLRemote$$serializer.INSTANCE, sceneRemoteV6.f95507i);
        dVar.B(serialDescriptor, 9, kSerializerArr[9], sceneRemoteV6.f95508j);
    }

    public c b() {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str = this.f95499a;
        if (str != null) {
            String str2 = this.f95500b;
            String str3 = this.f95501c;
            List<ReferenceImageRemote> list = this.f95502d;
            ArrayList arrayList3 = null;
            if (list != null) {
                Iterable<ReferenceImageRemote> iterable = list;
                arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (ReferenceImageRemote a10 : iterable) {
                    arrayList.add(a10.a());
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f95503e;
            String str5 = this.f95504f;
            List<ProductLiteRemote> list2 = this.f95505g;
            if (list2 != null) {
                Iterable<ProductLiteRemote> iterable2 = list2;
                arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
                for (ProductLiteRemote s10 : iterable2) {
                    arrayList2.add(s10.s());
                }
            } else {
                arrayList2 = null;
            }
            String str6 = this.f95506h;
            ProductCatPLRemote productCatPLRemote = this.f95507i;
            g a11 = productCatPLRemote != null ? productCatPLRemote.a() : null;
            List<QuoteRemoteV6> list3 = this.f95508j;
            if (list3 != null) {
                Iterable<QuoteRemoteV6> iterable3 = list3;
                arrayList3 = new ArrayList(C16877v.y(iterable3, 10));
                for (QuoteRemoteV6 a12 : iterable3) {
                    arrayList3.add(a12.a());
                }
            }
            return new c(str, str2, str3, arrayList, str4, str5, arrayList2, str6, a11, arrayList3);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SceneRemoteV6)) {
            return false;
        }
        SceneRemoteV6 sceneRemoteV6 = (SceneRemoteV6) obj;
        return C17542s.e(this.f95499a, sceneRemoteV6.f95499a) && C17542s.e(this.f95500b, sceneRemoteV6.f95500b) && C17542s.e(this.f95501c, sceneRemoteV6.f95501c) && C17542s.e(this.f95502d, sceneRemoteV6.f95502d) && C17542s.e(this.f95503e, sceneRemoteV6.f95503e) && C17542s.e(this.f95504f, sceneRemoteV6.f95504f) && C17542s.e(this.f95505g, sceneRemoteV6.f95505g) && C17542s.e(this.f95506h, sceneRemoteV6.f95506h) && C17542s.e(this.f95507i, sceneRemoteV6.f95507i) && C17542s.e(this.f95508j, sceneRemoteV6.f95508j);
    }

    public int hashCode() {
        String str = this.f95499a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95500b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95501c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ReferenceImageRemote> list = this.f95502d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f95503e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95504f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<ProductLiteRemote> list2 = this.f95505g;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.f95506h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ProductCatPLRemote productCatPLRemote = this.f95507i;
        int hashCode9 = (hashCode8 + (productCatPLRemote == null ? 0 : productCatPLRemote.hashCode())) * 31;
        List<QuoteRemoteV6> list3 = this.f95508j;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        String str = this.f95499a;
        String str2 = this.f95500b;
        String str3 = this.f95501c;
        List<ReferenceImageRemote> list = this.f95502d;
        String str4 = this.f95503e;
        String str5 = this.f95504f;
        List<ProductLiteRemote> list2 = this.f95505g;
        String str6 = this.f95506h;
        ProductCatPLRemote productCatPLRemote = this.f95507i;
        List<QuoteRemoteV6> list3 = this.f95508j;
        return "SceneRemoteV6(id=" + str + ", titlePH=" + str2 + ", descriptionPH=" + str3 + ", mediaPH=" + list + ", titlePL=" + str4 + ", descriptionPL=" + str5 + ", productsPL=" + list2 + ", productsPLId=" + str6 + ", productCatPL=" + productCatPLRemote + ", quotes=" + list3 + ")";
    }
}
