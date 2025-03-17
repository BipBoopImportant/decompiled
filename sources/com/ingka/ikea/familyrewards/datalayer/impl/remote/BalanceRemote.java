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
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00023\u0017BC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010%\u001a\u0004\b*\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010%\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/BalanceRemote;", "Lpp/b;", "LQq/a;", "", "seen0", "", "title", "expiration", "amount", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpirationDetailsRemote;", "expirationDetails", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpirationDetailsRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/BalanceRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LQq/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getExpiration", "getExpiration$annotations", "c", "Ljava/lang/Integer;", "getAmount", "()Ljava/lang/Integer;", "getAmount$annotations", "d", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpirationDetailsRemote;", "getExpirationDetails", "()Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpirationDetailsRemote;", "getExpirationDetails$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BalanceRemote implements C11768b<Qq.a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95779a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95780b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f95781c;

    /* renamed from: d  reason: collision with root package name */
    private final ExpirationDetailsRemote f95782d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/BalanceRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/BalanceRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<BalanceRemote> serializer() {
            return BalanceRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BalanceRemote(int i10, String str, String str2, Integer num, ExpirationDetailsRemote expirationDetailsRemote, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, BalanceRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95779a = str;
        this.f95780b = str2;
        this.f95781c = num;
        this.f95782d = expirationDetailsRemote;
    }

    public static final /* synthetic */ void b(BalanceRemote balanceRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, balanceRemote.f95779a);
        dVar.B(serialDescriptor, 1, y02, balanceRemote.f95780b);
        dVar.B(serialDescriptor, 2, X.f144073a, balanceRemote.f95781c);
        dVar.B(serialDescriptor, 3, ExpirationDetailsRemote$$serializer.INSTANCE, balanceRemote.f95782d);
    }

    public Qq.a a() {
        String str = this.f95779a;
        if (str != null) {
            String str2 = this.f95780b;
            if (str2 != null) {
                Integer num = this.f95781c;
                if (num != null) {
                    int intValue = num.intValue();
                    ExpirationDetailsRemote expirationDetailsRemote = this.f95782d;
                    return new Qq.a(str, str2, intValue, expirationDetailsRemote != null ? expirationDetailsRemote.b() : null);
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
        if (!(obj instanceof BalanceRemote)) {
            return false;
        }
        BalanceRemote balanceRemote = (BalanceRemote) obj;
        return C17542s.e(this.f95779a, balanceRemote.f95779a) && C17542s.e(this.f95780b, balanceRemote.f95780b) && C17542s.e(this.f95781c, balanceRemote.f95781c) && C17542s.e(this.f95782d, balanceRemote.f95782d);
    }

    public int hashCode() {
        String str = this.f95779a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95780b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f95781c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ExpirationDetailsRemote expirationDetailsRemote = this.f95782d;
        if (expirationDetailsRemote != null) {
            i10 = expirationDetailsRemote.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f95779a;
        String str2 = this.f95780b;
        Integer num = this.f95781c;
        ExpirationDetailsRemote expirationDetailsRemote = this.f95782d;
        return "BalanceRemote(title=" + str + ", expiration=" + str2 + ", amount=" + num + ", expirationDetails=" + expirationDetailsRemote + ")";
    }
}
