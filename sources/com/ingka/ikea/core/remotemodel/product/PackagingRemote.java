package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import com.ingka.ikea.core.model.product.Packaging;
import com.ingka.ikea.core.remotemodel.InformationRemote;
import com.ingka.ikea.core.remotemodel.InformationRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/#BE\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0006\u001a\u00020\u00058\u0000X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001bR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010(\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010*¨\u00060"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PackagingRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/Packaging;", "", "seen0", "", "title", "", "Lcom/ingka/ikea/core/remotemodel/product/ItemPackagesRemote;", "packages", "Lcom/ingka/ikea/core/remotemodel/InformationRemote;", "values", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/PackagingRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lcom/ingka/ikea/core/model/product/Packaging;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle$remote_model_release", "getTitle$remote_model_release$annotations", "()V", "Ljava/util/List;", "getPackages$remote_model_release", "()Ljava/util/List;", "getPackages$remote_model_release$annotations", "getValues$remote_model_release", "getValues$remote_model_release$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackagingRemote implements C11768b<Packaging> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f95342d = {null, new C17451f(ItemPackagesRemote$$serializer.INSTANCE), new C17451f(InformationRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95343a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ItemPackagesRemote> f95344b;

    /* renamed from: c  reason: collision with root package name */
    private final List<InformationRemote> f95345c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PackagingRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/PackagingRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PackagingRemote> serializer() {
            return PackagingRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PackagingRemote(int i10, String str, List list, List list2, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, PackagingRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95343a = str;
        this.f95344b = list;
        this.f95345c = list2;
    }

    public static final /* synthetic */ void c(PackagingRemote packagingRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95342d;
        dVar.y(serialDescriptor, 0, packagingRemote.f95343a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], packagingRemote.f95344b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], packagingRemote.f95345c);
    }

    public Packaging b() {
        String str = this.f95343a;
        Iterable<ItemPackagesRemote> iterable = this.f95344b;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ItemPackagesRemote b10 : iterable) {
            arrayList.add(b10.b());
        }
        Iterable<InformationRemote> iterable2 = this.f95345c;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
        for (InformationRemote a10 : iterable2) {
            arrayList2.add(a10.a());
        }
        return new Packaging(str, arrayList, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackagingRemote)) {
            return false;
        }
        PackagingRemote packagingRemote = (PackagingRemote) obj;
        return C17542s.e(this.f95343a, packagingRemote.f95343a) && C17542s.e(this.f95344b, packagingRemote.f95344b) && C17542s.e(this.f95345c, packagingRemote.f95345c);
    }

    public int hashCode() {
        return (((this.f95343a.hashCode() * 31) + this.f95344b.hashCode()) * 31) + this.f95345c.hashCode();
    }

    public String toString() {
        String str = this.f95343a;
        List<ItemPackagesRemote> list = this.f95344b;
        List<InformationRemote> list2 = this.f95345c;
        return "PackagingRemote(title=" + str + ", packages=" + list + ", values=" + list2 + ")";
    }
}
