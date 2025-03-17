package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.M;
import jK.T0;
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u0000 .2\u00020\u0001:\u0002/\u0013BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001e\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001e\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010\"\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/KeyRangeRemote;", "", "", "seen0", "exclusiveMin", "max", "tokenValue", "", "tokenMultiplier", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/KeyRangeRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getExclusiveMin", "()Ljava/lang/Integer;", "getExclusiveMin$annotations", "()V", "b", "getMax", "getMax$annotations", "c", "getTokenValue", "getTokenValue$annotations", "d", "Ljava/lang/Float;", "getTokenMultiplier", "()Ljava/lang/Float;", "getTokenMultiplier$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyRangeRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Integer f95842a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f95843b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f95844c;

    /* renamed from: d  reason: collision with root package name */
    private final Float f95845d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/KeyRangeRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/KeyRangeRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<KeyRangeRemote> serializer() {
            return KeyRangeRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ KeyRangeRemote(int i10, Integer num, Integer num2, Integer num3, Float f10, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, KeyRangeRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95842a = num;
        this.f95843b = num2;
        this.f95844c = num3;
        this.f95845d = f10;
    }

    public static final /* synthetic */ void a(KeyRangeRemote keyRangeRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        X x10 = X.f144073a;
        dVar.B(serialDescriptor, 0, x10, keyRangeRemote.f95842a);
        dVar.B(serialDescriptor, 1, x10, keyRangeRemote.f95843b);
        dVar.B(serialDescriptor, 2, x10, keyRangeRemote.f95844c);
        dVar.B(serialDescriptor, 3, M.f144051a, keyRangeRemote.f95845d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyRangeRemote)) {
            return false;
        }
        KeyRangeRemote keyRangeRemote = (KeyRangeRemote) obj;
        return C17542s.e(this.f95842a, keyRangeRemote.f95842a) && C17542s.e(this.f95843b, keyRangeRemote.f95843b) && C17542s.e(this.f95844c, keyRangeRemote.f95844c) && C17542s.e(this.f95845d, keyRangeRemote.f95845d);
    }

    public int hashCode() {
        Integer num = this.f95842a;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f95843b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f95844c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f10 = this.f95845d;
        if (f10 != null) {
            i10 = f10.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        Integer num = this.f95842a;
        Integer num2 = this.f95843b;
        Integer num3 = this.f95844c;
        Float f10 = this.f95845d;
        return "KeyRangeRemote(exclusiveMin=" + num + ", max=" + num2 + ", tokenValue=" + num3 + ", tokenMultiplier=" + f10 + ")";
    }
}
