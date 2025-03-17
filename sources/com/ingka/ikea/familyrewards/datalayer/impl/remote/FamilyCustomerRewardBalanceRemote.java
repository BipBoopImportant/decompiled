package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001bB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010 \u0012\u0004\b\"\u0010\u001f\u001a\u0004\b\u001b\u0010!¨\u0006%"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardBalanceRemote;", "", "", "seen0", "", "title", "keys", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardBalanceRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getKeys$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FamilyCustomerRewardBalanceRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95808a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f95809b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardBalanceRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardBalanceRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FamilyCustomerRewardBalanceRemote> serializer() {
            return FamilyCustomerRewardBalanceRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FamilyCustomerRewardBalanceRemote(int i10, String str, Integer num, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, FamilyCustomerRewardBalanceRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95808a = str;
        this.f95809b = num;
    }

    public static final /* synthetic */ void b(FamilyCustomerRewardBalanceRemote familyCustomerRewardBalanceRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, Y0.f144077a, familyCustomerRewardBalanceRemote.f95808a);
        dVar.B(serialDescriptor, 1, X.f144073a, familyCustomerRewardBalanceRemote.f95809b);
    }

    public final Integer a() {
        return this.f95809b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyCustomerRewardBalanceRemote)) {
            return false;
        }
        FamilyCustomerRewardBalanceRemote familyCustomerRewardBalanceRemote = (FamilyCustomerRewardBalanceRemote) obj;
        return C17542s.e(this.f95808a, familyCustomerRewardBalanceRemote.f95808a) && C17542s.e(this.f95809b, familyCustomerRewardBalanceRemote.f95809b);
    }

    public int hashCode() {
        String str = this.f95808a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f95809b;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f95808a;
        Integer num = this.f95809b;
        return "FamilyCustomerRewardBalanceRemote(title=" + str + ", keys=" + num + ")";
    }
}
