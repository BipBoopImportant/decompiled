package com.ingka.ikea.store.impl.data.remotemodel;

import GB.f;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+\u0014B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010 \u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\"¨\u0006,"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/TrendRemote;", "Lpp/b;", "LGB/f$a$a;", "", "seen0", "hour", "value", "accuracy", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/store/impl/data/remotemodel/TrendRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LGB/f$a$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getHour", "()Ljava/lang/Integer;", "getHour$annotations", "()V", "getValue", "getValue$annotations", "c", "getAccuracy", "getAccuracy$annotations", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TrendRemote implements C11768b<f.a.C2643a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Integer f120493a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f120494b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f120495c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/TrendRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/TrendRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<TrendRemote> serializer() {
            return TrendRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TrendRemote(int i10, Integer num, Integer num2, Integer num3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, TrendRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120493a = num;
        this.f120494b = num2;
        this.f120495c = num3;
    }

    public static final /* synthetic */ void b(TrendRemote trendRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        X x10 = X.f144073a;
        dVar.B(serialDescriptor, 0, x10, trendRemote.f120493a);
        dVar.B(serialDescriptor, 1, x10, trendRemote.f120494b);
        dVar.B(serialDescriptor, 2, x10, trendRemote.f120495c);
    }

    public f.a.C2643a a() {
        Integer num = this.f120493a;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = this.f120494b;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                Integer num3 = this.f120495c;
                if (num3 != null) {
                    return new f.a.C2643a(intValue, intValue2, num3.intValue());
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendRemote)) {
            return false;
        }
        TrendRemote trendRemote = (TrendRemote) obj;
        return C17542s.e(this.f120493a, trendRemote.f120493a) && C17542s.e(this.f120494b, trendRemote.f120494b) && C17542s.e(this.f120495c, trendRemote.f120495c);
    }

    public int hashCode() {
        Integer num = this.f120493a;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f120494b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f120495c;
        if (num3 != null) {
            i10 = num3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        Integer num = this.f120493a;
        Integer num2 = this.f120494b;
        Integer num3 = this.f120495c;
        return "TrendRemote(hour=" + num + ", value=" + num2 + ", accuracy=" + num3 + ")";
    }
}
