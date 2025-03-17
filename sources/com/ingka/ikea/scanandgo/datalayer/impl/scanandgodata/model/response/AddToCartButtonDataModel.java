package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u001cB7\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u0016R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010#\u0012\u0004\b%\u0010 \u001a\u0004\b\u001c\u0010$¨\u0006("}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AddToCartButtonDataModel;", "", "", "seen0", "", "regularText", "familyText", "", "enabled", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AddToCartButtonDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRegularText", "getRegularText$annotations", "()V", "b", "getFamilyText$annotations", "Z", "()Z", "getEnabled$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddToCartButtonDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f119943a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119944b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f119945c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AddToCartButtonDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/AddToCartButtonDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<AddToCartButtonDataModel> serializer() {
            return AddToCartButtonDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AddToCartButtonDataModel(int i10, String str, String str2, boolean z10, T0 t02) {
        if (4 != (i10 & 4)) {
            E0.b(i10, 4, AddToCartButtonDataModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f119943a = null;
        } else {
            this.f119943a = str;
        }
        if ((i10 & 2) == 0) {
            this.f119944b = null;
        } else {
            this.f119944b = str2;
        }
        this.f119945c = z10;
    }

    public static final /* synthetic */ void c(AddToCartButtonDataModel addToCartButtonDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.z(serialDescriptor, 0) || addToCartButtonDataModel.f119943a != null) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, addToCartButtonDataModel.f119943a);
        }
        if (dVar.z(serialDescriptor, 1) || addToCartButtonDataModel.f119944b != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, addToCartButtonDataModel.f119944b);
        }
        dVar.x(serialDescriptor, 2, addToCartButtonDataModel.f119945c);
    }

    public final boolean a() {
        return this.f119945c;
    }

    public final String b() {
        return this.f119944b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCartButtonDataModel)) {
            return false;
        }
        AddToCartButtonDataModel addToCartButtonDataModel = (AddToCartButtonDataModel) obj;
        return C17542s.e(this.f119943a, addToCartButtonDataModel.f119943a) && C17542s.e(this.f119944b, addToCartButtonDataModel.f119944b) && this.f119945c == addToCartButtonDataModel.f119945c;
    }

    public int hashCode() {
        String str = this.f119943a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f119944b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode + i10) * 31) + Boolean.hashCode(this.f119945c);
    }

    public String toString() {
        String str = this.f119943a;
        String str2 = this.f119944b;
        boolean z10 = this.f119945c;
        return "AddToCartButtonDataModel(regularText=" + str + ", familyText=" + str2 + ", enabled=" + z10 + ")";
    }
}
