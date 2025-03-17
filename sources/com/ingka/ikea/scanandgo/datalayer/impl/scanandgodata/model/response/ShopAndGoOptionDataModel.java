package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

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

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 )2\u00020\u0001:\u0002*\u001eB?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0017R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010&\u0012\u0004\b(\u0010\"\u001a\u0004\b#\u0010'¨\u0006+"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoOptionDataModel;", "", "", "seen0", "", "text", "type", "", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoOptionValueDataModel;", "optionValues", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoOptionDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getText$annotations", "()V", "b", "d", "getType$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getOptionValues$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShopAndGoOptionDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f120103d = {null, null, new C17451f(ShopAndGoOptionValueDataModel$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f120104a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120105b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ShopAndGoOptionValueDataModel> f120106c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoOptionDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ShopAndGoOptionDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ShopAndGoOptionDataModel> serializer() {
            return ShopAndGoOptionDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShopAndGoOptionDataModel(int i10, String str, String str2, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ShopAndGoOptionDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120104a = str;
        this.f120105b = str2;
        this.f120106c = list;
    }

    public static final /* synthetic */ void e(ShopAndGoOptionDataModel shopAndGoOptionDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120103d;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, shopAndGoOptionDataModel.f120104a);
        dVar.B(serialDescriptor, 1, y02, shopAndGoOptionDataModel.f120105b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], shopAndGoOptionDataModel.f120106c);
    }

    public final List<ShopAndGoOptionValueDataModel> b() {
        return this.f120106c;
    }

    public final String c() {
        return this.f120104a;
    }

    public final String d() {
        return this.f120105b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopAndGoOptionDataModel)) {
            return false;
        }
        ShopAndGoOptionDataModel shopAndGoOptionDataModel = (ShopAndGoOptionDataModel) obj;
        return C17542s.e(this.f120104a, shopAndGoOptionDataModel.f120104a) && C17542s.e(this.f120105b, shopAndGoOptionDataModel.f120105b) && C17542s.e(this.f120106c, shopAndGoOptionDataModel.f120106c);
    }

    public int hashCode() {
        String str = this.f120104a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120105b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ShopAndGoOptionValueDataModel> list = this.f120106c;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f120104a;
        String str2 = this.f120105b;
        List<ShopAndGoOptionValueDataModel> list = this.f120106c;
        return "ShopAndGoOptionDataModel(text=" + str + ", type=" + str2 + ", optionValues=" + list + ")";
    }
}
