package com.ingka.ikea.datalayer.impl;

import Mp.e;
import YH.C16877v;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#\u0018B5\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/SurpriseOffersRemote;", "Lpp/b;", "LMp/e;", "", "seen0", "", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "products", "Lcom/ingka/ikea/datalayer/impl/FilterRemote;", "filter", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lcom/ingka/ikea/datalayer/impl/FilterRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/datalayer/impl/SurpriseOffersRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LMp/e;", "a", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "getProducts$annotations", "()V", "Lcom/ingka/ikea/datalayer/impl/FilterRemote;", "getFilter", "()Lcom/ingka/ikea/datalayer/impl/FilterRemote;", "getFilter$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SurpriseOffersRemote implements C11768b<e> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f95489c = {new C17451f(ProductLiteRemote$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final List<ProductLiteRemote> f95490a;

    /* renamed from: b  reason: collision with root package name */
    private final FilterRemote f95491b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/SurpriseOffersRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/datalayer/impl/SurpriseOffersRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<SurpriseOffersRemote> serializer() {
            return SurpriseOffersRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SurpriseOffersRemote(int i10, List list, FilterRemote filterRemote, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, SurpriseOffersRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95490a = list;
        this.f95491b = filterRemote;
    }

    public static final /* synthetic */ void c(SurpriseOffersRemote surpriseOffersRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f95489c[0], surpriseOffersRemote.f95490a);
        dVar.i(serialDescriptor, 1, FilterRemote$$serializer.INSTANCE, surpriseOffersRemote.f95491b);
    }

    public e b() {
        Iterable<ProductLiteRemote> iterable = this.f95490a;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ProductLiteRemote s10 : iterable) {
            arrayList.add(s10.s());
        }
        return new e(arrayList, this.f95491b.b());
    }
}
