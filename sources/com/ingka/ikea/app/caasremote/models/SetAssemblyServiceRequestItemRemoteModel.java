package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0011B1\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0016R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010\u0014¨\u0006%"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/SetAssemblyServiceRequestItemRemoteModel;", "", "", "seen1", "assemblyServiceQuantity", "", "itemNo", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/caasremote/models/SetAssemblyServiceRequestItemRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAssemblyServiceQuantity", "getAssemblyServiceQuantity$annotations", "()V", "b", "Ljava/lang/String;", "getItemNo", "getItemNo$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SetAssemblyServiceRequestItemRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f71513a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71514b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/SetAssemblyServiceRequestItemRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/SetAssemblyServiceRequestItemRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SetAssemblyServiceRequestItemRemoteModel> serializer() {
            return SetAssemblyServiceRequestItemRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ SetAssemblyServiceRequestItemRemoteModel(int i10, int i11, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, SetAssemblyServiceRequestItemRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71513a = i11;
        this.f71514b = str;
    }

    public static final /* synthetic */ void a(SetAssemblyServiceRequestItemRemoteModel setAssemblyServiceRequestItemRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, setAssemblyServiceRequestItemRemoteModel.f71513a);
        dVar.y(serialDescriptor, 1, setAssemblyServiceRequestItemRemoteModel.f71514b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetAssemblyServiceRequestItemRemoteModel)) {
            return false;
        }
        SetAssemblyServiceRequestItemRemoteModel setAssemblyServiceRequestItemRemoteModel = (SetAssemblyServiceRequestItemRemoteModel) obj;
        return this.f71513a == setAssemblyServiceRequestItemRemoteModel.f71513a && C17542s.e(this.f71514b, setAssemblyServiceRequestItemRemoteModel.f71514b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f71513a) * 31) + this.f71514b.hashCode();
    }

    public String toString() {
        int i10 = this.f71513a;
        String str = this.f71514b;
        return "SetAssemblyServiceRequestItemRemoteModel(assemblyServiceQuantity=" + i10 + ", itemNo=" + str + ")";
    }
}
