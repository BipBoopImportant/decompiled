package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-\u001fB?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010#\u001a\u0004\b$\u0010&R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010#\u001a\u0004\b(\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote;", "", "", "seen0", "", "title", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardBalanceRemote;", "balance", "", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;", "rewards", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardBalanceRemote;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "b", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardBalanceRemote;", "()Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardBalanceRemote;", "getBalance$annotations", "c", "Ljava/util/List;", "()Ljava/util/List;", "getRewards$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FamilyCustomerRewardRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f95810d = {null, null, new C17451f(RewardRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95811a;

    /* renamed from: b  reason: collision with root package name */
    private final FamilyCustomerRewardBalanceRemote f95812b;

    /* renamed from: c  reason: collision with root package name */
    private final List<RewardRemote> f95813c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FamilyCustomerRewardRemote> serializer() {
            return FamilyCustomerRewardRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FamilyCustomerRewardRemote(int i10, String str, FamilyCustomerRewardBalanceRemote familyCustomerRewardBalanceRemote, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, FamilyCustomerRewardRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95811a = str;
        this.f95812b = familyCustomerRewardBalanceRemote;
        this.f95813c = list;
    }

    public static final /* synthetic */ void d(FamilyCustomerRewardRemote familyCustomerRewardRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95810d;
        dVar.B(serialDescriptor, 0, Y0.f144077a, familyCustomerRewardRemote.f95811a);
        dVar.B(serialDescriptor, 1, FamilyCustomerRewardBalanceRemote$$serializer.INSTANCE, familyCustomerRewardRemote.f95812b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], familyCustomerRewardRemote.f95813c);
    }

    public final FamilyCustomerRewardBalanceRemote b() {
        return this.f95812b;
    }

    public final List<RewardRemote> c() {
        return this.f95813c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyCustomerRewardRemote)) {
            return false;
        }
        FamilyCustomerRewardRemote familyCustomerRewardRemote = (FamilyCustomerRewardRemote) obj;
        return C17542s.e(this.f95811a, familyCustomerRewardRemote.f95811a) && C17542s.e(this.f95812b, familyCustomerRewardRemote.f95812b) && C17542s.e(this.f95813c, familyCustomerRewardRemote.f95813c);
    }

    public int hashCode() {
        String str = this.f95811a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FamilyCustomerRewardBalanceRemote familyCustomerRewardBalanceRemote = this.f95812b;
        int hashCode2 = (hashCode + (familyCustomerRewardBalanceRemote == null ? 0 : familyCustomerRewardBalanceRemote.hashCode())) * 31;
        List<RewardRemote> list = this.f95813c;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f95811a;
        FamilyCustomerRewardBalanceRemote familyCustomerRewardBalanceRemote = this.f95812b;
        List<RewardRemote> list = this.f95813c;
        return "FamilyCustomerRewardRemote(title=" + str + ", balance=" + familyCustomerRewardBalanceRemote + ", rewards=" + list + ")";
    }
}
