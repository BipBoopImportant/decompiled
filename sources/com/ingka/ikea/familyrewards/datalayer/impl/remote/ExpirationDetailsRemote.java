package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import Qq.d;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00023#BG\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001bR \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001bR \u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010*\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001dR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010'\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpirationDetailsRemote;", "Lpp/b;", "LQq/d;", "", "seen0", "", "title", "description", "amount", "", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpiringKeyRemote;", "expiringKeys", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpirationDetailsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LQq/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "I", "getAmount", "getAmount$annotations", "d", "Ljava/util/List;", "getExpiringKeys", "()Ljava/util/List;", "getExpiringKeys$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpirationDetailsRemote implements C11768b<d> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f95801e = {null, null, null, new C17451f(ExpiringKeyRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95802a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95803b;

    /* renamed from: c  reason: collision with root package name */
    private final int f95804c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ExpiringKeyRemote> f95805d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpirationDetailsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ExpirationDetailsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ExpirationDetailsRemote> serializer() {
            return ExpirationDetailsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ExpirationDetailsRemote(int i10, String str, String str2, int i11, List list, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, ExpirationDetailsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95802a = str;
        this.f95803b = str2;
        this.f95804c = i11;
        this.f95805d = list;
    }

    public static final /* synthetic */ void c(ExpirationDetailsRemote expirationDetailsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95801e;
        dVar.y(serialDescriptor, 0, expirationDetailsRemote.f95802a);
        dVar.y(serialDescriptor, 1, expirationDetailsRemote.f95803b);
        dVar.w(serialDescriptor, 2, expirationDetailsRemote.f95804c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], expirationDetailsRemote.f95805d);
    }

    public d b() {
        String str = this.f95802a;
        String str2 = this.f95803b;
        int i10 = this.f95804c;
        List<ExpiringKeyRemote> list = this.f95805d;
        if (list == null) {
            list = C16877v.n();
        }
        Iterable<ExpiringKeyRemote> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ExpiringKeyRemote a10 : iterable) {
            arrayList.add(a10.a());
        }
        return new d(str, str2, i10, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpirationDetailsRemote)) {
            return false;
        }
        ExpirationDetailsRemote expirationDetailsRemote = (ExpirationDetailsRemote) obj;
        return C17542s.e(this.f95802a, expirationDetailsRemote.f95802a) && C17542s.e(this.f95803b, expirationDetailsRemote.f95803b) && this.f95804c == expirationDetailsRemote.f95804c && C17542s.e(this.f95805d, expirationDetailsRemote.f95805d);
    }

    public int hashCode() {
        int hashCode = ((((this.f95802a.hashCode() * 31) + this.f95803b.hashCode()) * 31) + Integer.hashCode(this.f95804c)) * 31;
        List<ExpiringKeyRemote> list = this.f95805d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.f95802a;
        String str2 = this.f95803b;
        int i10 = this.f95804c;
        List<ExpiringKeyRemote> list = this.f95805d;
        return "ExpirationDetailsRemote(title=" + str + ", description=" + str2 + ", amount=" + i10 + ", expiringKeys=" + list + ")";
    }
}
