package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u001cB1\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010!\u001a\u0004\b\"\u0010$¨\u0006("}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;", "", "", "seen1", "", "familyLoyalty", "Lcom/ingka/ikea/app/caasremote/models/b;", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IZLcom/ingka/ikea/app/caasremote/models/b;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getFamilyLoyalty", "()Z", "getFamilyLoyalty$annotations", "()V", "b", "Lcom/ingka/ikea/app/caasremote/models/b;", "()Lcom/ingka/ikea/app/caasremote/models/b;", "getType$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CustomerContextRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f71129c = {null, new C17250c(P.b(b.class), b.Companion.serializer(), new KSerializer[0])};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f71130a;

    /* renamed from: b  reason: collision with root package name */
    private final b f71131b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/CustomerContextRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CustomerContextRemoteModel> serializer() {
            return CustomerContextRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ CustomerContextRemoteModel(int i10, boolean z10, b bVar, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, CustomerContextRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71130a = z10;
        this.f71131b = bVar;
    }

    public static final /* synthetic */ void c(CustomerContextRemoteModel customerContextRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71129c;
        dVar.x(serialDescriptor, 0, customerContextRemoteModel.f71130a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], customerContextRemoteModel.f71131b);
    }

    public final b b() {
        return this.f71131b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerContextRemoteModel)) {
            return false;
        }
        CustomerContextRemoteModel customerContextRemoteModel = (CustomerContextRemoteModel) obj;
        return this.f71130a == customerContextRemoteModel.f71130a && this.f71131b == customerContextRemoteModel.f71131b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f71130a) * 31) + this.f71131b.hashCode();
    }

    public String toString() {
        boolean z10 = this.f71130a;
        b bVar = this.f71131b;
        return "CustomerContextRemoteModel(familyLoyalty=" + z10 + ", type=" + bVar + ")";
    }
}
