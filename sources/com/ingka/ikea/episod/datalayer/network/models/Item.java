package com.ingka.ikea.episod.datalayer.network.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.T0;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u0012B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/Item;", "", "", "itemNo", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/episod/datalayer/network/models/Item;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getItemNo", "()Ljava/lang/String;", "getItemNo$annotations", "()V", "b", "Ljava/lang/Integer;", "getQuantity", "()Ljava/lang/Integer;", "getQuantity$annotations", "Companion", "$serializer", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Item {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95777a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f95778b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/Item$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/episod/datalayer/network/models/Item;", "serializer", "()Lkotlinx/serialization/KSerializer;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Item> serializer() {
            return Item$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public Item() {
        this((String) null, (Integer) null, 3, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void a(Item item, C17395d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.z(serialDescriptor, 0) || item.f95777a != null) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, item.f95777a);
        }
        if (dVar.z(serialDescriptor, 1) || item.f95778b != null) {
            dVar.B(serialDescriptor, 1, X.f144073a, item.f95778b);
        }
    }

    @C16814e
    public /* synthetic */ Item(int i10, String str, Integer num, T0 t02) {
        if ((i10 & 1) == 0) {
            this.f95777a = null;
        } else {
            this.f95777a = str;
        }
        if ((i10 & 2) == 0) {
            this.f95778b = null;
        } else {
            this.f95778b = num;
        }
    }

    public Item(String str, Integer num) {
        this.f95777a = str;
        this.f95778b = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Item(String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num);
    }
}
