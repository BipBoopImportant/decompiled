package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000  2\u00020\u0001:\u0002!\u0010B'\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÁ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataMergedItemRemoteModel;", "mergedItem", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataMergedItemRemoteModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataMergedItemRemoteModel;", "getMergedItem", "()Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataMergedItemRemoteModel;", "getMergedItem$annotations", "()V", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableItemResponseMetadataRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final NullableItemResponseMetadataMergedItemRemoteModel f71355a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableItemResponseMetadataRemoteModel> serializer() {
            return NullableItemResponseMetadataRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableItemResponseMetadataRemoteModel(int i10, NullableItemResponseMetadataMergedItemRemoteModel nullableItemResponseMetadataMergedItemRemoteModel, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, NullableItemResponseMetadataRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71355a = nullableItemResponseMetadataMergedItemRemoteModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NullableItemResponseMetadataRemoteModel) && C17542s.e(this.f71355a, ((NullableItemResponseMetadataRemoteModel) obj).f71355a);
    }

    public int hashCode() {
        NullableItemResponseMetadataMergedItemRemoteModel nullableItemResponseMetadataMergedItemRemoteModel = this.f71355a;
        if (nullableItemResponseMetadataMergedItemRemoteModel == null) {
            return 0;
        }
        return nullableItemResponseMetadataMergedItemRemoteModel.hashCode();
    }

    public String toString() {
        NullableItemResponseMetadataMergedItemRemoteModel nullableItemResponseMetadataMergedItemRemoteModel = this.f71355a;
        return "NullableItemResponseMetadataRemoteModel(mergedItem=" + nullableItemResponseMetadataMergedItemRemoteModel + ")";
    }
}
