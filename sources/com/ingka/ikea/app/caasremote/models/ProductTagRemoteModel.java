package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u001dB?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010#\u0012\u0004\b'\u0010\"\u001a\u0004\b&\u0010\u0016¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ProductTagRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/j;", "name", "", "validFrom", "validTo", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/j;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/app/caasremote/models/ProductTagRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/j;", "b", "()Lcom/ingka/ikea/app/caasremote/models/j;", "getName$annotations", "()V", "Ljava/lang/String;", "c", "getValidFrom$annotations", "d", "getValidTo$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ProductTagRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f71496d = {new C17250c(P.b(j.class), j.Companion.serializer(), new KSerializer[0]), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final j f71497a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71498b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71499c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ProductTagRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/ProductTagRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductTagRemoteModel> serializer() {
            return ProductTagRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ ProductTagRemoteModel(int i10, j jVar, String str, String str2, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ProductTagRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71497a = jVar;
        this.f71498b = str;
        this.f71499c = str2;
    }

    public static final /* synthetic */ void e(ProductTagRemoteModel productTagRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f71496d[0], productTagRemoteModel.f71497a);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 1, y02, productTagRemoteModel.f71498b);
        dVar.B(serialDescriptor, 2, y02, productTagRemoteModel.f71499c);
    }

    public final j b() {
        return this.f71497a;
    }

    public final String c() {
        return this.f71498b;
    }

    public final String d() {
        return this.f71499c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTagRemoteModel)) {
            return false;
        }
        ProductTagRemoteModel productTagRemoteModel = (ProductTagRemoteModel) obj;
        return this.f71497a == productTagRemoteModel.f71497a && C17542s.e(this.f71498b, productTagRemoteModel.f71498b) && C17542s.e(this.f71499c, productTagRemoteModel.f71499c);
    }

    public int hashCode() {
        int hashCode = this.f71497a.hashCode() * 31;
        String str = this.f71498b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71499c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        j jVar = this.f71497a;
        String str = this.f71498b;
        String str2 = this.f71499c;
        return "ProductTagRemoteModel(name=" + jVar + ", validFrom=" + str + ", validTo=" + str2 + ")";
    }
}
