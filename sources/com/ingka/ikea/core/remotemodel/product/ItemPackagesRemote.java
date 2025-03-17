package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import com.ingka.ikea.core.model.product.ItemPackages;
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
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00026$BS\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0006\u001a\u00020\u00058\u0000X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001cR \u0010\u0007\u001a\u00020\u00058\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001cR \u0010\b\u001a\u00020\u00058\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\u0012\n\u0004\b-\u0010%\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u001cR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ItemPackagesRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/ItemPackages;", "", "seen0", "", "description", "itemNo", "name", "warning", "", "Lcom/ingka/ikea/core/remotemodel/product/PackagesMeasurementsRemote;", "packageMeasurements", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/ItemPackagesRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lcom/ingka/ikea/core/model/product/ItemPackages;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDescription$remote_model_release", "getDescription$remote_model_release$annotations", "()V", "getItemNo$remote_model_release", "getItemNo$remote_model_release$annotations", "getName$remote_model_release", "getName$remote_model_release$annotations", "d", "getWarning$remote_model_release", "getWarning$remote_model_release$annotations", "e", "Ljava/util/List;", "getPackageMeasurements$remote_model_release", "()Ljava/util/List;", "getPackageMeasurements$remote_model_release$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ItemPackagesRemote implements C11768b<ItemPackages> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f95293f = {null, null, null, null, new C17451f(PackagesMeasurementsRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95294a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95295b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95296c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95297d;

    /* renamed from: e  reason: collision with root package name */
    private final List<PackagesMeasurementsRemote> f95298e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ItemPackagesRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/ItemPackagesRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ItemPackagesRemote> serializer() {
            return ItemPackagesRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ItemPackagesRemote(int i10, String str, String str2, String str3, String str4, List list, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, ItemPackagesRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95294a = str;
        this.f95295b = str2;
        this.f95296c = str3;
        this.f95297d = str4;
        this.f95298e = list;
    }

    public static final /* synthetic */ void c(ItemPackagesRemote itemPackagesRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95293f;
        dVar.y(serialDescriptor, 0, itemPackagesRemote.f95294a);
        dVar.y(serialDescriptor, 1, itemPackagesRemote.f95295b);
        dVar.y(serialDescriptor, 2, itemPackagesRemote.f95296c);
        dVar.B(serialDescriptor, 3, Y0.f144077a, itemPackagesRemote.f95297d);
        dVar.i(serialDescriptor, 4, kSerializerArr[4], itemPackagesRemote.f95298e);
    }

    public ItemPackages b() {
        String str = this.f95294a;
        String str2 = this.f95295b;
        String str3 = this.f95296c;
        String str4 = this.f95297d;
        Iterable<PackagesMeasurementsRemote> iterable = this.f95298e;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (PackagesMeasurementsRemote b10 : iterable) {
            arrayList.add(b10.b());
        }
        return new ItemPackages(str, str2, str3, str4, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemPackagesRemote)) {
            return false;
        }
        ItemPackagesRemote itemPackagesRemote = (ItemPackagesRemote) obj;
        return C17542s.e(this.f95294a, itemPackagesRemote.f95294a) && C17542s.e(this.f95295b, itemPackagesRemote.f95295b) && C17542s.e(this.f95296c, itemPackagesRemote.f95296c) && C17542s.e(this.f95297d, itemPackagesRemote.f95297d) && C17542s.e(this.f95298e, itemPackagesRemote.f95298e);
    }

    public int hashCode() {
        int hashCode = ((((this.f95294a.hashCode() * 31) + this.f95295b.hashCode()) * 31) + this.f95296c.hashCode()) * 31;
        String str = this.f95297d;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95298e.hashCode();
    }

    public String toString() {
        String str = this.f95294a;
        String str2 = this.f95295b;
        String str3 = this.f95296c;
        String str4 = this.f95297d;
        List<PackagesMeasurementsRemote> list = this.f95298e;
        return "ItemPackagesRemote(description=" + str + ", itemNo=" + str2 + ", name=" + str3 + ", warning=" + str4 + ", packageMeasurements=" + list + ")";
    }
}
