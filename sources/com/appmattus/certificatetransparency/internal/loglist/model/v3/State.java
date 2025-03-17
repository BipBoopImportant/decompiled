package com.appmattus.certificatetransparency.internal.loglist.model.v3;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import f7.C7860c;
import fK.C17261n;
import fK.p;
import g7.C7893b;
import iK.C17395d;
import jK.E0;
import jK.T0;
import java.lang.annotation.Annotation;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import uI.C18055d;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00152\u00020\u0001:\u0007\u0016\u0017\u0018\u0019\u001a\u001b\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0001\u0006\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "", "<init>", "()V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/time/Instant;", "getTimestamp", "()Ljava/time/Instant;", "timestamp", "Companion", "Pending", "Qualified", "Usable", "ReadOnly", "Retired", "Rejected", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Pending;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Qualified;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$ReadOnly;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Rejected;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Retired;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Usable;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class State {
    /* access modifiers changed from: private */
    public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, new C7893b());
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) State.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<State> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @p
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Pending;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/time/Instant;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$certificatetransparency", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Pending;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/Instant;", "copy", "(Ljava/time/Instant;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Pending;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/Instant;", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Pending extends State {
        /* access modifiers changed from: private */
        public static final KSerializer<Object>[] $childSerializers = {new C7860c()};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final Instant timestamp;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Pending$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Pending;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<Pending> serializer() {
                return State$Pending$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Pending(int i10, Instant instant, T0 t02) {
            super(i10, t02);
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, State$Pending$$serializer.INSTANCE.getDescriptor());
            }
            this.timestamp = instant;
        }

        public static /* synthetic */ Pending copy$default(Pending pending, Instant instant, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                instant = pending.timestamp;
            }
            return pending.copy(instant);
        }

        @p(with = C7860c.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$certificatetransparency(Pending pending, C17395d dVar, SerialDescriptor serialDescriptor) {
            State.write$Self(pending, dVar, serialDescriptor);
            dVar.i(serialDescriptor, 0, $childSerializers[0], pending.getTimestamp());
        }

        public final Instant component1() {
            return this.timestamp;
        }

        public final Pending copy(Instant instant) {
            C17542s.j(instant, "timestamp");
            return new Pending(instant);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Pending) && C17542s.e(this.timestamp, ((Pending) obj).timestamp);
        }

        public Instant getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Pending(timestamp=" + this.timestamp + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Pending(Instant instant) {
            super((DefaultConstructorMarker) null);
            C17542s.j(instant, "timestamp");
            this.timestamp = instant;
        }
    }

    @p
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Qualified;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/time/Instant;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$certificatetransparency", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Qualified;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/Instant;", "copy", "(Ljava/time/Instant;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Qualified;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/Instant;", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Qualified extends State {
        /* access modifiers changed from: private */
        public static final KSerializer<Object>[] $childSerializers = {new C7860c()};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final Instant timestamp;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Qualified$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Qualified;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<Qualified> serializer() {
                return State$Qualified$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Qualified(int i10, Instant instant, T0 t02) {
            super(i10, t02);
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, State$Qualified$$serializer.INSTANCE.getDescriptor());
            }
            this.timestamp = instant;
        }

        public static /* synthetic */ Qualified copy$default(Qualified qualified, Instant instant, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                instant = qualified.timestamp;
            }
            return qualified.copy(instant);
        }

        @p(with = C7860c.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$certificatetransparency(Qualified qualified, C17395d dVar, SerialDescriptor serialDescriptor) {
            State.write$Self(qualified, dVar, serialDescriptor);
            dVar.i(serialDescriptor, 0, $childSerializers[0], qualified.getTimestamp());
        }

        public final Instant component1() {
            return this.timestamp;
        }

        public final Qualified copy(Instant instant) {
            C17542s.j(instant, "timestamp");
            return new Qualified(instant);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Qualified) && C17542s.e(this.timestamp, ((Qualified) obj).timestamp);
        }

        public Instant getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Qualified(timestamp=" + this.timestamp + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Qualified(Instant instant) {
            super((DefaultConstructorMarker) null);
            C17542s.j(instant, "timestamp");
            this.timestamp = instant;
        }
    }

    @p
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u0019¨\u0006/"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$ReadOnly;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "Ljava/time/Instant;", "timestamp", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/FinalTreeHead;", "finalTreeHead", "<init>", "(Ljava/time/Instant;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/FinalTreeHead;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/time/Instant;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/FinalTreeHead;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$certificatetransparency", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$ReadOnly;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/Instant;", "component2", "()Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/FinalTreeHead;", "copy", "(Ljava/time/Instant;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/FinalTreeHead;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$ReadOnly;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/Instant;", "getTimestamp", "getTimestamp$annotations", "()V", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/FinalTreeHead;", "getFinalTreeHead", "getFinalTreeHead$annotations", "Companion", "$serializer", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReadOnly extends State {
        /* access modifiers changed from: private */
        public static final KSerializer<Object>[] $childSerializers = {new C7860c(), null};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final FinalTreeHead finalTreeHead;
        private final Instant timestamp;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$ReadOnly$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$ReadOnly;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<ReadOnly> serializer() {
                return State$ReadOnly$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ReadOnly(int i10, Instant instant, FinalTreeHead finalTreeHead2, T0 t02) {
            super(i10, t02);
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, State$ReadOnly$$serializer.INSTANCE.getDescriptor());
            }
            this.timestamp = instant;
            this.finalTreeHead = finalTreeHead2;
        }

        public static /* synthetic */ ReadOnly copy$default(ReadOnly readOnly, Instant instant, FinalTreeHead finalTreeHead2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                instant = readOnly.timestamp;
            }
            if ((i10 & 2) != 0) {
                finalTreeHead2 = readOnly.finalTreeHead;
            }
            return readOnly.copy(instant, finalTreeHead2);
        }

        public static /* synthetic */ void getFinalTreeHead$annotations() {
        }

        @p(with = C7860c.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$certificatetransparency(ReadOnly readOnly, C17395d dVar, SerialDescriptor serialDescriptor) {
            State.write$Self(readOnly, dVar, serialDescriptor);
            dVar.i(serialDescriptor, 0, $childSerializers[0], readOnly.getTimestamp());
            dVar.i(serialDescriptor, 1, FinalTreeHead$$serializer.INSTANCE, readOnly.finalTreeHead);
        }

        public final Instant component1() {
            return this.timestamp;
        }

        public final FinalTreeHead component2() {
            return this.finalTreeHead;
        }

        public final ReadOnly copy(Instant instant, FinalTreeHead finalTreeHead2) {
            C17542s.j(instant, "timestamp");
            C17542s.j(finalTreeHead2, "finalTreeHead");
            return new ReadOnly(instant, finalTreeHead2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReadOnly)) {
                return false;
            }
            ReadOnly readOnly = (ReadOnly) obj;
            return C17542s.e(this.timestamp, readOnly.timestamp) && C17542s.e(this.finalTreeHead, readOnly.finalTreeHead);
        }

        public final FinalTreeHead getFinalTreeHead() {
            return this.finalTreeHead;
        }

        public Instant getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return (this.timestamp.hashCode() * 31) + this.finalTreeHead.hashCode();
        }

        public String toString() {
            return "ReadOnly(timestamp=" + this.timestamp + ", finalTreeHead=" + this.finalTreeHead + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ReadOnly(Instant instant, FinalTreeHead finalTreeHead2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(instant, "timestamp");
            C17542s.j(finalTreeHead2, "finalTreeHead");
            this.timestamp = instant;
            this.finalTreeHead = finalTreeHead2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Rejected;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/time/Instant;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$certificatetransparency", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Rejected;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/Instant;", "copy", "(Ljava/time/Instant;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Rejected;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/Instant;", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Rejected extends State {
        /* access modifiers changed from: private */
        public static final KSerializer<Object>[] $childSerializers = {new C7860c()};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final Instant timestamp;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Rejected$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Rejected;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<Rejected> serializer() {
                return State$Rejected$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Rejected(int i10, Instant instant, T0 t02) {
            super(i10, t02);
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, State$Rejected$$serializer.INSTANCE.getDescriptor());
            }
            this.timestamp = instant;
        }

        public static /* synthetic */ Rejected copy$default(Rejected rejected, Instant instant, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                instant = rejected.timestamp;
            }
            return rejected.copy(instant);
        }

        @p(with = C7860c.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$certificatetransparency(Rejected rejected, C17395d dVar, SerialDescriptor serialDescriptor) {
            State.write$Self(rejected, dVar, serialDescriptor);
            dVar.i(serialDescriptor, 0, $childSerializers[0], rejected.getTimestamp());
        }

        public final Instant component1() {
            return this.timestamp;
        }

        public final Rejected copy(Instant instant) {
            C17542s.j(instant, "timestamp");
            return new Rejected(instant);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rejected) && C17542s.e(this.timestamp, ((Rejected) obj).timestamp);
        }

        public Instant getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Rejected(timestamp=" + this.timestamp + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Rejected(Instant instant) {
            super((DefaultConstructorMarker) null);
            C17542s.j(instant, "timestamp");
            this.timestamp = instant;
        }
    }

    @p
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Retired;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/time/Instant;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$certificatetransparency", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Retired;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/Instant;", "copy", "(Ljava/time/Instant;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Retired;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/Instant;", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Retired extends State {
        /* access modifiers changed from: private */
        public static final KSerializer<Object>[] $childSerializers = {new C7860c()};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final Instant timestamp;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Retired$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Retired;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<Retired> serializer() {
                return State$Retired$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Retired(int i10, Instant instant, T0 t02) {
            super(i10, t02);
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, State$Retired$$serializer.INSTANCE.getDescriptor());
            }
            this.timestamp = instant;
        }

        public static /* synthetic */ Retired copy$default(Retired retired, Instant instant, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                instant = retired.timestamp;
            }
            return retired.copy(instant);
        }

        @p(with = C7860c.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$certificatetransparency(Retired retired, C17395d dVar, SerialDescriptor serialDescriptor) {
            State.write$Self(retired, dVar, serialDescriptor);
            dVar.i(serialDescriptor, 0, $childSerializers[0], retired.getTimestamp());
        }

        public final Instant component1() {
            return this.timestamp;
        }

        public final Retired copy(Instant instant) {
            C17542s.j(instant, "timestamp");
            return new Retired(instant);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Retired) && C17542s.e(this.timestamp, ((Retired) obj).timestamp);
        }

        public Instant getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Retired(timestamp=" + this.timestamp + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Retired(Instant instant) {
            super((DefaultConstructorMarker) null);
            C17542s.j(instant, "timestamp");
            this.timestamp = instant;
        }
    }

    @p
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Usable;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "Ljava/time/Instant;", "timestamp", "<init>", "(Ljava/time/Instant;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/time/Instant;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$certificatetransparency", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Usable;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/Instant;", "copy", "(Ljava/time/Instant;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Usable;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/Instant;", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Usable extends State {
        /* access modifiers changed from: private */
        public static final KSerializer<Object>[] $childSerializers = {new C7860c()};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final Instant timestamp;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Usable$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State$Usable;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<Usable> serializer() {
                return State$Usable$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Usable(int i10, Instant instant, T0 t02) {
            super(i10, t02);
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, State$Usable$$serializer.INSTANCE.getDescriptor());
            }
            this.timestamp = instant;
        }

        public static /* synthetic */ Usable copy$default(Usable usable, Instant instant, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                instant = usable.timestamp;
            }
            return usable.copy(instant);
        }

        @p(with = C7860c.class)
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public static final /* synthetic */ void write$Self$certificatetransparency(Usable usable, C17395d dVar, SerialDescriptor serialDescriptor) {
            State.write$Self(usable, dVar, serialDescriptor);
            dVar.i(serialDescriptor, 0, $childSerializers[0], usable.getTimestamp());
        }

        public final Instant component1() {
            return this.timestamp;
        }

        public final Usable copy(Instant instant) {
            C17542s.j(instant, "timestamp");
            return new Usable(instant);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Usable) && C17542s.e(this.timestamp, ((Usable) obj).timestamp);
        }

        public Instant getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Usable(timestamp=" + this.timestamp + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Usable(Instant instant) {
            super((DefaultConstructorMarker) null);
            C17542s.j(instant, "timestamp");
            this.timestamp = instant;
        }
    }

    public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        C18055d b10 = P.b(State.class);
        C18055d[] dVarArr = {P.b(Pending.class), P.b(Qualified.class), P.b(ReadOnly.class), P.b(Rejected.class), P.b(Retired.class), P.b(Usable.class)};
        return new C17261n("com.appmattus.certificatetransparency.internal.loglist.model.v3.State", b10, dVarArr, new KSerializer[]{State$Pending$$serializer.INSTANCE, State$Qualified$$serializer.INSTANCE, State$ReadOnly$$serializer.INSTANCE, State$Rejected$$serializer.INSTANCE, State$Retired$$serializer.INSTANCE, State$Usable$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(State state, C17395d dVar, SerialDescriptor serialDescriptor) {
    }

    public abstract Instant getTimestamp();

    private State() {
    }

    public /* synthetic */ State(int i10, T0 t02) {
    }
}
