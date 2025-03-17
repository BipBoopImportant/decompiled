package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import com.ingka.ikea.core.model.product.CustomerMaterial;
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

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 )2\u00020\u0001:\u0002* B5\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0019R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/CustomerMaterialRemote;", "", "", "seen0", "", "materialType", "", "Lcom/ingka/ikea/core/remotemodel/product/MaterialInformationRemote;", "materialInformationRemote", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/CustomerMaterialRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/CustomerMaterial;", "b", "()Lcom/ingka/ikea/core/model/product/CustomerMaterial;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMaterialType$remote_model_release", "getMaterialType$remote_model_release$annotations", "()V", "Ljava/util/List;", "getMaterialInformationRemote$remote_model_release", "()Ljava/util/List;", "getMaterialInformationRemote$remote_model_release$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomerMaterialRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f95264c = {null, new C17451f(MaterialInformationRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95265a;

    /* renamed from: b  reason: collision with root package name */
    private final List<MaterialInformationRemote> f95266b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/CustomerMaterialRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/CustomerMaterialRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CustomerMaterialRemote> serializer() {
            return CustomerMaterialRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CustomerMaterialRemote(int i10, String str, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, CustomerMaterialRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95265a = str;
        this.f95266b = list;
    }

    public static final /* synthetic */ void c(CustomerMaterialRemote customerMaterialRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95264c;
        dVar.B(serialDescriptor, 0, Y0.f144077a, customerMaterialRemote.f95265a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], customerMaterialRemote.f95266b);
    }

    public final CustomerMaterial b() {
        String str = this.f95265a;
        List<MaterialInformationRemote> list = this.f95266b;
        if (list != null) {
            Iterable<MaterialInformationRemote> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (MaterialInformationRemote a10 : iterable) {
                arrayList.add(a10.a());
            }
            return new CustomerMaterial(str, arrayList);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerMaterialRemote)) {
            return false;
        }
        CustomerMaterialRemote customerMaterialRemote = (CustomerMaterialRemote) obj;
        return C17542s.e(this.f95265a, customerMaterialRemote.f95265a) && C17542s.e(this.f95266b, customerMaterialRemote.f95266b);
    }

    public int hashCode() {
        String str = this.f95265a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<MaterialInformationRemote> list = this.f95266b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f95265a;
        List<MaterialInformationRemote> list = this.f95266b;
        return "CustomerMaterialRemote(materialType=" + str + ", materialInformationRemote=" + list + ")";
    }
}
