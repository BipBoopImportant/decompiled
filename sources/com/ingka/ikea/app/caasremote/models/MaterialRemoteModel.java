package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u001dB9\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/MaterialRemoteModel;", "", "", "seen1", "", "Lcom/ingka/ikea/app/caasremote/models/MaterialPartRemoteModel;", "parts", "", "productType", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/app/caasremote/models/MaterialRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getParts$annotations", "()V", "Ljava/lang/String;", "c", "getProductType$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MaterialRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f71213c = {new C17451f(MaterialPartRemoteModel$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final List<MaterialPartRemoteModel> f71214a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71215b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/MaterialRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/MaterialRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MaterialRemoteModel> serializer() {
            return MaterialRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ MaterialRemoteModel(int i10, List list, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, MaterialRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71214a = list;
        this.f71215b = str;
    }

    public static final /* synthetic */ void d(MaterialRemoteModel materialRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, f71213c[0], materialRemoteModel.f71214a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, materialRemoteModel.f71215b);
    }

    public final List<MaterialPartRemoteModel> b() {
        return this.f71214a;
    }

    public final String c() {
        return this.f71215b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaterialRemoteModel)) {
            return false;
        }
        MaterialRemoteModel materialRemoteModel = (MaterialRemoteModel) obj;
        return C17542s.e(this.f71214a, materialRemoteModel.f71214a) && C17542s.e(this.f71215b, materialRemoteModel.f71215b);
    }

    public int hashCode() {
        List<MaterialPartRemoteModel> list = this.f71214a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f71215b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        List<MaterialPartRemoteModel> list = this.f71214a;
        String str = this.f71215b;
        return "MaterialRemoteModel(parts=" + list + ", productType=" + str + ")";
    }
}
