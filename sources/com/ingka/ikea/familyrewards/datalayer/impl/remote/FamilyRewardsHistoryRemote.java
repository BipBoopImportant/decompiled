package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import Qq.o;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+\u0015B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsHistoryRemote;", "Lpp/b;", "LQq/o;", "", "seen0", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/HistoryRemote;", "history", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/BalanceRemote;", "balance", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/familyrewards/datalayer/impl/remote/HistoryRemote;Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/BalanceRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsHistoryRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LQq/o;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/HistoryRemote;", "getHistory", "()Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/HistoryRemote;", "getHistory$annotations", "()V", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/BalanceRemote;", "getBalance", "()Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/BalanceRemote;", "getBalance$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FamilyRewardsHistoryRemote implements C11768b<o> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final HistoryRemote f95835a;

    /* renamed from: b  reason: collision with root package name */
    private final BalanceRemote f95836b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsHistoryRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsHistoryRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FamilyRewardsHistoryRemote> serializer() {
            return FamilyRewardsHistoryRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FamilyRewardsHistoryRemote(int i10, HistoryRemote historyRemote, BalanceRemote balanceRemote, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, FamilyRewardsHistoryRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95835a = historyRemote;
        this.f95836b = balanceRemote;
    }

    public static final /* synthetic */ void b(FamilyRewardsHistoryRemote familyRewardsHistoryRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, HistoryRemote$$serializer.INSTANCE, familyRewardsHistoryRemote.f95835a);
        dVar.i(serialDescriptor, 1, BalanceRemote$$serializer.INSTANCE, familyRewardsHistoryRemote.f95836b);
    }

    public o a() {
        Qq.p b10 = this.f95835a.b();
        if (b10 != null) {
            Qq.a a10 = this.f95836b.a();
            if (a10 != null) {
                return new o(b10, a10);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyRewardsHistoryRemote)) {
            return false;
        }
        FamilyRewardsHistoryRemote familyRewardsHistoryRemote = (FamilyRewardsHistoryRemote) obj;
        return C17542s.e(this.f95835a, familyRewardsHistoryRemote.f95835a) && C17542s.e(this.f95836b, familyRewardsHistoryRemote.f95836b);
    }

    public int hashCode() {
        return (this.f95835a.hashCode() * 31) + this.f95836b.hashCode();
    }

    public String toString() {
        HistoryRemote historyRemote = this.f95835a;
        BalanceRemote balanceRemote = this.f95836b;
        return "FamilyRewardsHistoryRemote(history=" + historyRemote + ", balance=" + balanceRemote + ")";
    }
}
