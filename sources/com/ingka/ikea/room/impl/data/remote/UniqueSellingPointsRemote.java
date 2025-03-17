package com.ingka.ikea.room.impl.data.remote;

import KJ.C15985a;
import YH.C16877v;
import com.ingka.ikea.core.remotemodel.KeyBenefitRemote;
import com.ingka.ikea.core.remotemodel.KeyBenefitRemote$$serializer;
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
import py.d;
import sy.e;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)!B5\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0019R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0004¢\u0006\f\n\u0004\b#\u0010&\u0012\u0004\b'\u0010%¨\u0006*"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/UniqueSellingPointsRemote;", "Lpy/d;", "Lsy/e;", "", "seen0", "", "id", "", "Lcom/ingka/ikea/core/remotemodel/KeyBenefitRemote;", "uniqueSellingPoints", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/room/impl/data/remote/UniqueSellingPointsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()Lsy/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getId$annotations", "()V", "Ljava/util/List;", "getUniqueSellingPoints$annotations", "Companion", "$serializer", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UniqueSellingPointsRemote implements d<e> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f119760c = 8;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f119761d = {null, new C17451f(KeyBenefitRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f119762a;

    /* renamed from: b  reason: collision with root package name */
    private final List<KeyBenefitRemote> f119763b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/UniqueSellingPointsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/room/impl/data/remote/UniqueSellingPointsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<UniqueSellingPointsRemote> serializer() {
            return UniqueSellingPointsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UniqueSellingPointsRemote(int i10, String str, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, UniqueSellingPointsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119762a = str;
        this.f119763b = list;
    }

    public static final /* synthetic */ void d(UniqueSellingPointsRemote uniqueSellingPointsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119761d;
        dVar.y(serialDescriptor, 0, uniqueSellingPointsRemote.b());
        dVar.i(serialDescriptor, 1, kSerializerArr[1], uniqueSellingPointsRemote.f119763b);
    }

    public String b() {
        return this.f119762a;
    }

    /* renamed from: c */
    public e toLocal() {
        String b10 = b();
        Iterable<KeyBenefitRemote> iterable = this.f119763b;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (KeyBenefitRemote a10 : iterable) {
            arrayList.add(a10.a());
        }
        return new e(b10, C15985a.h(arrayList));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniqueSellingPointsRemote)) {
            return false;
        }
        UniqueSellingPointsRemote uniqueSellingPointsRemote = (UniqueSellingPointsRemote) obj;
        return C17542s.e(this.f119762a, uniqueSellingPointsRemote.f119762a) && C17542s.e(this.f119763b, uniqueSellingPointsRemote.f119763b);
    }

    public int hashCode() {
        return (this.f119762a.hashCode() * 31) + this.f119763b.hashCode();
    }

    public String toString() {
        String str = this.f119762a;
        List<KeyBenefitRemote> list = this.f119763b;
        return "UniqueSellingPointsRemote(id=" + str + ", uniqueSellingPoints=" + list + ")";
    }
}
