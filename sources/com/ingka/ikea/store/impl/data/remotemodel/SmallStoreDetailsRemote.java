package com.ingka.ikea.store.impl.data.remotemodel;

import GB.g;
import YH.C16877v;
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
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00026$BY\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u001cR&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010(\u001a\u0004\b/\u00100R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010.\u0012\u0004\b4\u0010(\u001a\u0004\b3\u00100¨\u00067"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/SmallStoreDetailsRemote;", "Lpp/b;", "LGB/g;", "", "seen0", "", "title", "description", "bannerImage", "", "Lcom/ingka/ikea/store/impl/data/remotemodel/InfoServiceItemRemote;", "availableInfoItems", "unavailableInfoItems", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/store/impl/data/remotemodel/SmallStoreDetailsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LGB/g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "getBannerImage", "getBannerImage$annotations", "d", "Ljava/util/List;", "getAvailableInfoItems", "()Ljava/util/List;", "getAvailableInfoItems$annotations", "e", "getUnavailableInfoItems", "getUnavailableInfoItems$annotations", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmallStoreDetailsRemote implements C11768b<g> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f120434f;

    /* renamed from: a  reason: collision with root package name */
    private final String f120435a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120436b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120437c;

    /* renamed from: d  reason: collision with root package name */
    private final List<InfoServiceItemRemote> f120438d;

    /* renamed from: e  reason: collision with root package name */
    private final List<InfoServiceItemRemote> f120439e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/SmallStoreDetailsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/SmallStoreDetailsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<SmallStoreDetailsRemote> serializer() {
            return SmallStoreDetailsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        InfoServiceItemRemote$$serializer infoServiceItemRemote$$serializer = InfoServiceItemRemote$$serializer.INSTANCE;
        f120434f = new KSerializer[]{null, null, null, new C17451f(infoServiceItemRemote$$serializer), new C17451f(infoServiceItemRemote$$serializer)};
    }

    public /* synthetic */ SmallStoreDetailsRemote(int i10, String str, String str2, String str3, List list, List list2, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, SmallStoreDetailsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120435a = str;
        this.f120436b = str2;
        this.f120437c = str3;
        this.f120438d = list;
        this.f120439e = list2;
    }

    public static final /* synthetic */ void c(SmallStoreDetailsRemote smallStoreDetailsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120434f;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, smallStoreDetailsRemote.f120435a);
        dVar.B(serialDescriptor, 1, y02, smallStoreDetailsRemote.f120436b);
        dVar.B(serialDescriptor, 2, y02, smallStoreDetailsRemote.f120437c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], smallStoreDetailsRemote.f120438d);
        dVar.i(serialDescriptor, 4, kSerializerArr[4], smallStoreDetailsRemote.f120439e);
    }

    public g b() {
        String str = this.f120435a;
        String str2 = this.f120436b;
        String str3 = this.f120437c;
        Iterable<InfoServiceItemRemote> iterable = this.f120438d;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (InfoServiceItemRemote a10 : iterable) {
            arrayList.add(a10.a());
        }
        Iterable<InfoServiceItemRemote> iterable2 = this.f120439e;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
        for (InfoServiceItemRemote a11 : iterable2) {
            arrayList2.add(a11.a());
        }
        return new g(str, str2, str3, arrayList, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallStoreDetailsRemote)) {
            return false;
        }
        SmallStoreDetailsRemote smallStoreDetailsRemote = (SmallStoreDetailsRemote) obj;
        return C17542s.e(this.f120435a, smallStoreDetailsRemote.f120435a) && C17542s.e(this.f120436b, smallStoreDetailsRemote.f120436b) && C17542s.e(this.f120437c, smallStoreDetailsRemote.f120437c) && C17542s.e(this.f120438d, smallStoreDetailsRemote.f120438d) && C17542s.e(this.f120439e, smallStoreDetailsRemote.f120439e);
    }

    public int hashCode() {
        String str = this.f120435a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120436b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120437c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((hashCode2 + i10) * 31) + this.f120438d.hashCode()) * 31) + this.f120439e.hashCode();
    }

    public String toString() {
        String str = this.f120435a;
        String str2 = this.f120436b;
        String str3 = this.f120437c;
        List<InfoServiceItemRemote> list = this.f120438d;
        List<InfoServiceItemRemote> list2 = this.f120439e;
        return "SmallStoreDetailsRemote(title=" + str + ", description=" + str2 + ", bannerImage=" + str3 + ", availableInfoItems=" + list + ", unavailableInfoItems=" + list2 + ")";
    }
}
