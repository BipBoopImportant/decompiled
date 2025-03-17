package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000 32\u00020\u0001:\u00024!BQ\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010\"\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010)\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u001cR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010,\u0012\u0004\b.\u0010%\u001a\u0004\b&\u0010-R \u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010%\u001a\u0004\b/\u00101¨\u00065"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductChildItemRemote;", "", "", "seen0", "", "itemNumber", "type", "qty", "", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "images", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "salesLocation", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductChildItemRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getItemNumber$annotations", "()V", "b", "f", "getType$annotations", "I", "d", "getQty$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getImages$annotations", "e", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "getSalesLocation$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CombinationProductChildItemRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f119991f = {null, null, null, new C17451f(ImageRemote$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final String f119992a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119993b;

    /* renamed from: c  reason: collision with root package name */
    private final int f119994c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ImageRemote> f119995d;

    /* renamed from: e  reason: collision with root package name */
    private final SalesLocationDataModel f119996e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductChildItemRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductChildItemRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CombinationProductChildItemRemote> serializer() {
            return CombinationProductChildItemRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CombinationProductChildItemRemote(int i10, String str, String str2, int i11, List list, SalesLocationDataModel salesLocationDataModel, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, CombinationProductChildItemRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119992a = str;
        this.f119993b = str2;
        this.f119994c = i11;
        this.f119995d = list;
        this.f119996e = salesLocationDataModel;
    }

    public static final /* synthetic */ void g(CombinationProductChildItemRemote combinationProductChildItemRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119991f;
        dVar.y(serialDescriptor, 0, combinationProductChildItemRemote.f119992a);
        dVar.y(serialDescriptor, 1, combinationProductChildItemRemote.f119993b);
        dVar.w(serialDescriptor, 2, combinationProductChildItemRemote.f119994c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], combinationProductChildItemRemote.f119995d);
        dVar.i(serialDescriptor, 4, SalesLocationDataModel$$serializer.INSTANCE, combinationProductChildItemRemote.f119996e);
    }

    public final List<ImageRemote> b() {
        return this.f119995d;
    }

    public final String c() {
        return this.f119992a;
    }

    public final int d() {
        return this.f119994c;
    }

    public final SalesLocationDataModel e() {
        return this.f119996e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinationProductChildItemRemote)) {
            return false;
        }
        CombinationProductChildItemRemote combinationProductChildItemRemote = (CombinationProductChildItemRemote) obj;
        return C17542s.e(this.f119992a, combinationProductChildItemRemote.f119992a) && C17542s.e(this.f119993b, combinationProductChildItemRemote.f119993b) && this.f119994c == combinationProductChildItemRemote.f119994c && C17542s.e(this.f119995d, combinationProductChildItemRemote.f119995d) && C17542s.e(this.f119996e, combinationProductChildItemRemote.f119996e);
    }

    public final String f() {
        return this.f119993b;
    }

    public int hashCode() {
        return (((((((this.f119992a.hashCode() * 31) + this.f119993b.hashCode()) * 31) + Integer.hashCode(this.f119994c)) * 31) + this.f119995d.hashCode()) * 31) + this.f119996e.hashCode();
    }

    public String toString() {
        String str = this.f119992a;
        String str2 = this.f119993b;
        int i10 = this.f119994c;
        List<ImageRemote> list = this.f119995d;
        SalesLocationDataModel salesLocationDataModel = this.f119996e;
        return "CombinationProductChildItemRemote(itemNumber=" + str + ", type=" + str2 + ", qty=" + i10 + ", images=" + list + ", salesLocation=" + salesLocationDataModel + ")";
    }
}
