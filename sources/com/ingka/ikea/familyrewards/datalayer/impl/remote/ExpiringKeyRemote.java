package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import Qq.f;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'\u0014B-\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0017¨\u0006("}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpiringKeyRemote;", "Lpp/b;", "LQq/f;", "", "seen0", "amount", "", "description", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpiringKeyRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LQq/f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAmount", "getAmount$annotations", "()V", "Ljava/lang/String;", "getDescription", "getDescription$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpiringKeyRemote implements C11768b<f> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f95806a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95807b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpiringKeyRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpiringKeyRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ExpiringKeyRemote> serializer() {
            return ExpiringKeyRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ExpiringKeyRemote(int i10, int i11, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ExpiringKeyRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95806a = i11;
        this.f95807b = str;
    }

    public static final /* synthetic */ void b(ExpiringKeyRemote expiringKeyRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, expiringKeyRemote.f95806a);
        dVar.y(serialDescriptor, 1, expiringKeyRemote.f95807b);
    }

    public f a() {
        return new f(this.f95806a, this.f95807b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpiringKeyRemote)) {
            return false;
        }
        ExpiringKeyRemote expiringKeyRemote = (ExpiringKeyRemote) obj;
        return this.f95806a == expiringKeyRemote.f95806a && C17542s.e(this.f95807b, expiringKeyRemote.f95807b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f95806a) * 31) + this.f95807b.hashCode();
    }

    public String toString() {
        int i10 = this.f95806a;
        String str = this.f95807b;
        return "ExpiringKeyRemote(amount=" + i10 + ", description=" + str + ")";
    }
}
