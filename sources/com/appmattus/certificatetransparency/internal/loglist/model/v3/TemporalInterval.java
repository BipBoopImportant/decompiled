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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006+"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/TemporalInterval;", "", "Ljava/time/Instant;", "startInclusive", "endExclusive", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/time/Instant;Ljava/time/Instant;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$certificatetransparency", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/TemporalInterval;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/Instant;", "component2", "copy", "(Ljava/time/Instant;Ljava/time/Instant;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/TemporalInterval;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/Instant;", "getStartInclusive", "getStartInclusive$annotations", "()V", "getEndExclusive", "getEndExclusive$annotations", "Companion", "$serializer", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TemporalInterval {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {new C7860c(), new C7860c()};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Instant endExclusive;
    private final Instant startInclusive;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/TemporalInterval$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/TemporalInterval;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<TemporalInterval> serializer() {
            return TemporalInterval$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TemporalInterval(int i10, Instant instant, Instant instant2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, TemporalInterval$$serializer.INSTANCE.getDescriptor());
        }
        this.startInclusive = instant;
        this.endExclusive = instant2;
    }

    public static /* synthetic */ TemporalInterval copy$default(TemporalInterval temporalInterval, Instant instant, Instant instant2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            instant = temporalInterval.startInclusive;
        }
        if ((i10 & 2) != 0) {
            instant2 = temporalInterval.endExclusive;
        }
        return temporalInterval.copy(instant, instant2);
    }

    @p(with = C7860c.class)
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    @p(with = C7860c.class)
    public static /* synthetic */ void getStartInclusive$annotations() {
    }

    public static final /* synthetic */ void write$Self$certificatetransparency(TemporalInterval temporalInterval, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], temporalInterval.startInclusive);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], temporalInterval.endExclusive);
    }

    public final Instant component1() {
        return this.startInclusive;
    }

    public final Instant component2() {
        return this.endExclusive;
    }

    public final TemporalInterval copy(Instant instant, Instant instant2) {
        C17542s.j(instant, "startInclusive");
        C17542s.j(instant2, "endExclusive");
        return new TemporalInterval(instant, instant2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemporalInterval)) {
            return false;
        }
        TemporalInterval temporalInterval = (TemporalInterval) obj;
        return C17542s.e(this.startInclusive, temporalInterval.startInclusive) && C17542s.e(this.endExclusive, temporalInterval.endExclusive);
    }

    public final Instant getEndExclusive() {
        return this.endExclusive;
    }

    public final Instant getStartInclusive() {
        return this.startInclusive;
    }

    public int hashCode() {
        return (this.startInclusive.hashCode() * 31) + this.endExclusive.hashCode();
    }

    public String toString() {
        return "TemporalInterval(startInclusive=" + this.startInclusive + ", endExclusive=" + this.endExclusive + ')';
    }

    public TemporalInterval(Instant instant, Instant instant2) {
        C17542s.j(instant, "startInclusive");
        C17542s.j(instant2, "endExclusive");
        this.startInclusive = instant;
        this.endExclusive = instant2;
    }
}
