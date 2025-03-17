package com.ingka.ikea.store.impl.data.remotemodel;

import GB.C12917b;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002.\"B?\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001aR(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreOpeningHoursRemote;", "Lpp/b;", "LGB/b;", "", "seen0", "", "storeId", "date", "", "Lcom/ingka/ikea/store/impl/data/remotemodel/OpeningHourDetailsRemoteV6;", "storeOpeningHours", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/store/impl/data/remotemodel/StoreOpeningHoursRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LGB/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStoreId", "getStoreId$annotations", "()V", "getDate", "getDate$annotations", "Ljava/util/List;", "getStoreOpeningHours", "()Ljava/util/List;", "getStoreOpeningHours$annotations", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoreOpeningHoursRemote implements C11768b<C12917b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f120489d = {null, null, new C17451f(OpeningHourDetailsRemoteV6$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f120490a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120491b;

    /* renamed from: c  reason: collision with root package name */
    private final List<OpeningHourDetailsRemoteV6> f120492c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreOpeningHoursRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreOpeningHoursRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StoreOpeningHoursRemote> serializer() {
            return StoreOpeningHoursRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StoreOpeningHoursRemote(int i10, String str, String str2, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, StoreOpeningHoursRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120490a = str;
        this.f120491b = str2;
        this.f120492c = list;
    }

    public static final /* synthetic */ void c(StoreOpeningHoursRemote storeOpeningHoursRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120489d;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, storeOpeningHoursRemote.f120490a);
        dVar.B(serialDescriptor, 1, y02, storeOpeningHoursRemote.f120491b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], storeOpeningHoursRemote.f120492c);
    }

    public C12917b b() {
        List list;
        String str = this.f120490a;
        if (str != null) {
            String str2 = this.f120491b;
            if (str2 != null) {
                LocalDate parse = LocalDate.parse(str2);
                C17542s.i(parse, "parse(...)");
                List<OpeningHourDetailsRemoteV6> list2 = this.f120492c;
                if (list2 != null) {
                    Iterable<OpeningHourDetailsRemoteV6> iterable = list2;
                    list = new ArrayList(C16877v.y(iterable, 10));
                    for (OpeningHourDetailsRemoteV6 a10 : iterable) {
                        list.add(a10.a());
                    }
                } else {
                    list = C16877v.n();
                }
                return new C12917b(str, parse, list);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreOpeningHoursRemote)) {
            return false;
        }
        StoreOpeningHoursRemote storeOpeningHoursRemote = (StoreOpeningHoursRemote) obj;
        return C17542s.e(this.f120490a, storeOpeningHoursRemote.f120490a) && C17542s.e(this.f120491b, storeOpeningHoursRemote.f120491b) && C17542s.e(this.f120492c, storeOpeningHoursRemote.f120492c);
    }

    public int hashCode() {
        String str = this.f120490a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120491b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<OpeningHourDetailsRemoteV6> list = this.f120492c;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f120490a;
        String str2 = this.f120491b;
        List<OpeningHourDetailsRemoteV6> list = this.f120492c;
        return "StoreOpeningHoursRemote(storeId=" + str + ", date=" + str2 + ", storeOpeningHours=" + list + ")";
    }
}
