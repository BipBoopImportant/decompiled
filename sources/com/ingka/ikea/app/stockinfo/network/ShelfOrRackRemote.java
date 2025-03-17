package com.ingka.ikea.app.stockinfo.network;

import com.ingka.ikea.app.stockinfo.local.ShelfOrRack;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u0014B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017¨\u0006&"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/ShelfOrRackRemote;", "", "", "seen0", "", "aisle", "bin", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/stockinfo/network/ShelfOrRackRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/app/stockinfo/local/ShelfOrRack;", "a", "()Lcom/ingka/ikea/app/stockinfo/local/ShelfOrRack;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAisle", "getAisle$annotations", "()V", "getBin", "getBin$annotations", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShelfOrRackRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f92610a;

    /* renamed from: b  reason: collision with root package name */
    private final String f92611b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/ShelfOrRackRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/ShelfOrRackRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ShelfOrRackRemote> serializer() {
            return ShelfOrRackRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShelfOrRackRemote(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ShelfOrRackRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92610a = str;
        this.f92611b = str2;
    }

    public static final /* synthetic */ void b(ShelfOrRackRemote shelfOrRackRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, shelfOrRackRemote.f92610a);
        dVar.y(serialDescriptor, 1, shelfOrRackRemote.f92611b);
    }

    public final ShelfOrRack a() {
        return new ShelfOrRack(this.f92610a, this.f92611b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShelfOrRackRemote)) {
            return false;
        }
        ShelfOrRackRemote shelfOrRackRemote = (ShelfOrRackRemote) obj;
        return C17542s.e(this.f92610a, shelfOrRackRemote.f92610a) && C17542s.e(this.f92611b, shelfOrRackRemote.f92611b);
    }

    public int hashCode() {
        return (this.f92610a.hashCode() * 31) + this.f92611b.hashCode();
    }

    public String toString() {
        String str = this.f92610a;
        String str2 = this.f92611b;
        return "ShelfOrRackRemote(aisle=" + str + ", bin=" + str2 + ")";
    }
}
