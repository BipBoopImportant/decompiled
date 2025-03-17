package com.ingka.ikea.core.remotemodel.product;

import HJ.C15854t;
import YH.C16877v;
import com.ingka.ikea.core.model.product.PackageDimension;
import com.sugarcube.core.logger.DslKt;
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
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 82\u00020\u0001:\u00029$B]\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001dR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R \u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u001dR \u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010%\u0012\u0004\b1\u0010(\u001a\u0004\b0\u0010\u001dR \u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010%\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010\u001dR \u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010%\u0012\u0004\b7\u0010(\u001a\u0004\b6\u0010\u001d¨\u0006:"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PackageDimensionRemote;", "", "", "seen0", "", "text", "", "Lcom/ingka/ikea/core/remotemodel/product/PackageInformationRemote;", "information", "itemNo", "count", "productName", "productTypeName", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/PackageDimensionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/PackageDimension;", "b", "()Lcom/ingka/ikea/core/model/product/PackageDimension;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "Ljava/util/List;", "getInformation", "()Ljava/util/List;", "getInformation$annotations", "getItemNo", "getItemNo$annotations", "d", "getCount", "getCount$annotations", "e", "getProductName", "getProductName$annotations", "f", "getProductTypeName", "getProductTypeName$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackageDimensionRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer<Object>[] f95325g = {null, new C17451f(PackageInformationRemote$$serializer.INSTANCE), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f95326a;

    /* renamed from: b  reason: collision with root package name */
    private final List<PackageInformationRemote> f95327b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95328c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95329d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95330e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95331f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PackageDimensionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/PackageDimensionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PackageDimensionRemote> serializer() {
            return PackageDimensionRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PackageDimensionRemote(int i10, String str, List list, String str2, String str3, String str4, String str5, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, PackageDimensionRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95326a = str;
        this.f95327b = list;
        this.f95328c = str2;
        this.f95329d = str3;
        this.f95330e = str4;
        this.f95331f = str5;
    }

    public static final /* synthetic */ void c(PackageDimensionRemote packageDimensionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95325g;
        dVar.B(serialDescriptor, 0, Y0.f144077a, packageDimensionRemote.f95326a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], packageDimensionRemote.f95327b);
        dVar.y(serialDescriptor, 2, packageDimensionRemote.f95328c);
        dVar.y(serialDescriptor, 3, packageDimensionRemote.f95329d);
        dVar.y(serialDescriptor, 4, packageDimensionRemote.f95330e);
        dVar.y(serialDescriptor, 5, packageDimensionRemote.f95331f);
    }

    public final PackageDimension b() {
        String str = this.f95326a;
        ArrayList arrayList = null;
        if (str == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No text received");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList2.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList2) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = PackageDimensionRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
            return null;
        }
        List<PackageInformationRemote> list = this.f95327b;
        if (list != null) {
            Iterable<PackageInformationRemote> iterable = list;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (PackageInformationRemote a11 : iterable) {
                arrayList.add(a11.a());
            }
        }
        return new PackageDimension(str, arrayList, this.f95328c, this.f95329d, this.f95330e, this.f95331f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageDimensionRemote)) {
            return false;
        }
        PackageDimensionRemote packageDimensionRemote = (PackageDimensionRemote) obj;
        return C17542s.e(this.f95326a, packageDimensionRemote.f95326a) && C17542s.e(this.f95327b, packageDimensionRemote.f95327b) && C17542s.e(this.f95328c, packageDimensionRemote.f95328c) && C17542s.e(this.f95329d, packageDimensionRemote.f95329d) && C17542s.e(this.f95330e, packageDimensionRemote.f95330e) && C17542s.e(this.f95331f, packageDimensionRemote.f95331f);
    }

    public int hashCode() {
        String str = this.f95326a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PackageInformationRemote> list = this.f95327b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((((((((hashCode + i10) * 31) + this.f95328c.hashCode()) * 31) + this.f95329d.hashCode()) * 31) + this.f95330e.hashCode()) * 31) + this.f95331f.hashCode();
    }

    public String toString() {
        String str = this.f95326a;
        List<PackageInformationRemote> list = this.f95327b;
        String str2 = this.f95328c;
        String str3 = this.f95329d;
        String str4 = this.f95330e;
        String str5 = this.f95331f;
        return "PackageDimensionRemote(text=" + str + ", information=" + list + ", itemNo=" + str2 + ", count=" + str3 + ", productName=" + str4 + ", productTypeName=" + str5 + ")";
    }
}
