package com.appmattus.certificatetransparency.internal.loglist.model.v3;

import f7.C7860c;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/PreviousOperator;", "", "Ljava/time/Instant;", "endDate", "", "name", "<init>", "(Ljava/time/Instant;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/time/Instant;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$certificatetransparency", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/PreviousOperator;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/Instant;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/time/Instant;Ljava/lang/String;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/PreviousOperator;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/Instant;", "getEndDate", "getEndDate$annotations", "()V", "Ljava/lang/String;", "getName", "getName$annotations", "Companion", "$serializer", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviousOperator {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {new C7860c(), null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Instant endDate;
    private final String name;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/PreviousOperator$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/PreviousOperator;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<PreviousOperator> serializer() {
            return PreviousOperator$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PreviousOperator(int i10, Instant instant, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, PreviousOperator$$serializer.INSTANCE.getDescriptor());
        }
        this.endDate = instant;
        this.name = str;
    }

    public static /* synthetic */ PreviousOperator copy$default(PreviousOperator previousOperator, Instant instant, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            instant = previousOperator.endDate;
        }
        if ((i10 & 2) != 0) {
            str = previousOperator.name;
        }
        return previousOperator.copy(instant, str);
    }

    @p(with = C7860c.class)
    public static /* synthetic */ void getEndDate$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static final /* synthetic */ void write$Self$certificatetransparency(PreviousOperator previousOperator, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, $childSerializers[0], previousOperator.endDate);
        dVar.y(serialDescriptor, 1, previousOperator.name);
    }

    public final Instant component1() {
        return this.endDate;
    }

    public final String component2() {
        return this.name;
    }

    public final PreviousOperator copy(Instant instant, String str) {
        C17542s.j(instant, "endDate");
        C17542s.j(str, "name");
        return new PreviousOperator(instant, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviousOperator)) {
            return false;
        }
        PreviousOperator previousOperator = (PreviousOperator) obj;
        return C17542s.e(this.endDate, previousOperator.endDate) && C17542s.e(this.name, previousOperator.name);
    }

    public final Instant getEndDate() {
        return this.endDate;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.endDate.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return "PreviousOperator(endDate=" + this.endDate + ", name=" + this.name + ')';
    }

    public PreviousOperator(Instant instant, String str) {
        C17542s.j(instant, "endDate");
        C17542s.j(str, "name");
        this.endDate = instant;
        this.name = str;
    }
}
