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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-\u0014B=\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010\"\u001a\u0004\b%\u0010\u0017R \u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010\"\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ChildItemResponseRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/ItemInfoResponseRemoteModel;", "info", "", "itemNo", "", "quantity", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/ItemInfoResponseRemoteModel;Ljava/lang/String;FLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/caasremote/models/ChildItemResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/app/caasremote/models/ItemInfoResponseRemoteModel;", "getInfo", "()Lcom/ingka/ikea/app/caasremote/models/ItemInfoResponseRemoteModel;", "getInfo$annotations", "()V", "b", "Ljava/lang/String;", "getItemNo", "getItemNo$annotations", "c", "F", "getQuantity", "()F", "getQuantity$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChildItemResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ItemInfoResponseRemoteModel f71107a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71108b;

    /* renamed from: c  reason: collision with root package name */
    private final float f71109c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ChildItemResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/ChildItemResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChildItemResponseRemoteModel> serializer() {
            return ChildItemResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ ChildItemResponseRemoteModel(int i10, ItemInfoResponseRemoteModel itemInfoResponseRemoteModel, String str, float f10, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ChildItemResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71107a = itemInfoResponseRemoteModel;
        this.f71108b = str;
        this.f71109c = f10;
    }

    public static final /* synthetic */ void a(ChildItemResponseRemoteModel childItemResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, ItemInfoResponseRemoteModel$$serializer.INSTANCE, childItemResponseRemoteModel.f71107a);
        dVar.y(serialDescriptor, 1, childItemResponseRemoteModel.f71108b);
        dVar.s(serialDescriptor, 2, childItemResponseRemoteModel.f71109c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildItemResponseRemoteModel)) {
            return false;
        }
        ChildItemResponseRemoteModel childItemResponseRemoteModel = (ChildItemResponseRemoteModel) obj;
        return C17542s.e(this.f71107a, childItemResponseRemoteModel.f71107a) && C17542s.e(this.f71108b, childItemResponseRemoteModel.f71108b) && Float.compare(this.f71109c, childItemResponseRemoteModel.f71109c) == 0;
    }

    public int hashCode() {
        return (((this.f71107a.hashCode() * 31) + this.f71108b.hashCode()) * 31) + Float.hashCode(this.f71109c);
    }

    public String toString() {
        ItemInfoResponseRemoteModel itemInfoResponseRemoteModel = this.f71107a;
        String str = this.f71108b;
        float f10 = this.f71109c;
        return "ChildItemResponseRemoteModel(info=" + itemInfoResponseRemoteModel + ", itemNo=" + str + ", quantity=" + f10 + ")";
    }
}
