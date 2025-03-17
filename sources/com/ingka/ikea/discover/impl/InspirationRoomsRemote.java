package com.ingka.ikea.discover.impl;

import KJ.C15985a;
import YH.C16877v;
import aq.C11079a;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00022#BI\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u001bR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010'\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/ingka/ikea/discover/impl/InspirationRoomsRemote;", "Lcom/ingka/ikea/discover/impl/a;", "Laq/a$c;", "", "seen0", "", "purpose", "title", "actionTitle", "", "Lcom/ingka/ikea/discover/impl/InspirationRemote;", "inspirations", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/discover/impl/InspirationRoomsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Laq/a$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPurpose", "getPurpose$annotations", "()V", "getTitle", "getTitle$annotations", "getActionTitle", "getActionTitle$annotations", "d", "Ljava/util/List;", "getInspirations", "()Ljava/util/List;", "getInspirations$annotations", "Companion", "$serializer", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class InspirationRoomsRemote implements a<C11079a.c> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f95530e = {null, null, null, new C17451f(InspirationRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95531a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95532b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95533c;

    /* renamed from: d  reason: collision with root package name */
    private final List<InspirationRemote> f95534d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/discover/impl/InspirationRoomsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/discover/impl/InspirationRoomsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InspirationRoomsRemote> serializer() {
            return InspirationRoomsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InspirationRoomsRemote(int i10, String str, String str2, String str3, List list, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, InspirationRoomsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95531a = str;
        this.f95532b = str2;
        this.f95533c = str3;
        this.f95534d = list;
    }

    public static final /* synthetic */ void c(InspirationRoomsRemote inspirationRoomsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95530e;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, inspirationRoomsRemote.f95531a);
        dVar.B(serialDescriptor, 1, y02, inspirationRoomsRemote.f95532b);
        dVar.B(serialDescriptor, 2, y02, inspirationRoomsRemote.f95533c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], inspirationRoomsRemote.f95534d);
    }

    /* renamed from: b */
    public C11079a.c toLocal() {
        String str = this.f95531a;
        if (str != null) {
            String str2 = this.f95532b;
            if (str2 != null) {
                String str3 = this.f95533c;
                if (str3 != null) {
                    List<InspirationRemote> list = this.f95534d;
                    if (list != null) {
                        Iterable<InspirationRemote> iterable = list;
                        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                        for (InspirationRemote a10 : iterable) {
                            arrayList.add(a10.a());
                        }
                        return new C11079a.c(str, str2, str3, C15985a.h(arrayList));
                    }
                    throw new IllegalArgumentException("Required value was null.");
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
        if (!(obj instanceof InspirationRoomsRemote)) {
            return false;
        }
        InspirationRoomsRemote inspirationRoomsRemote = (InspirationRoomsRemote) obj;
        return C17542s.e(this.f95531a, inspirationRoomsRemote.f95531a) && C17542s.e(this.f95532b, inspirationRoomsRemote.f95532b) && C17542s.e(this.f95533c, inspirationRoomsRemote.f95533c) && C17542s.e(this.f95534d, inspirationRoomsRemote.f95534d);
    }

    public int hashCode() {
        String str = this.f95531a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95532b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95533c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<InspirationRemote> list = this.f95534d;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f95531a;
        String str2 = this.f95532b;
        String str3 = this.f95533c;
        List<InspirationRemote> list = this.f95534d;
        return "InspirationRoomsRemote(purpose=" + str + ", title=" + str2 + ", actionTitle=" + str3 + ", inspirations=" + list + ")";
    }
}
