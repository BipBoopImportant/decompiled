package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\"\u0012\u0004\b#\u0010!\u001a\u0004\b\u001c\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;", "", "", "seen0", "", "value", "", "formattedValue", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "getValue$annotations", "()V", "Ljava/lang/String;", "getFormattedValue$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MoneyRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Double f119518a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119519b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MoneyRemote> serializer() {
            return MoneyRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MoneyRemote(int i10, Double d10, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, MoneyRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119518a = d10;
        this.f119519b = str;
    }

    public static final /* synthetic */ void c(MoneyRemote moneyRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, C17438C.f144010a, moneyRemote.f119518a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, moneyRemote.f119519b);
    }

    public final String a() {
        return this.f119519b;
    }

    public final Double b() {
        return this.f119518a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyRemote)) {
            return false;
        }
        MoneyRemote moneyRemote = (MoneyRemote) obj;
        return C17542s.e(this.f119518a, moneyRemote.f119518a) && C17542s.e(this.f119519b, moneyRemote.f119519b);
    }

    public int hashCode() {
        Double d10 = this.f119518a;
        int i10 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        String str = this.f119519b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Double d10 = this.f119518a;
        String str = this.f119519b;
        return "MoneyRemote(value=" + d10 + ", formattedValue=" + str + ")";
    }
}
