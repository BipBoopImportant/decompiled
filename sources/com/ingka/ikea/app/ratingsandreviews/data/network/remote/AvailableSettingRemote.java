package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import KJ.C15985a;
import Mi.C10766a;
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

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-!B?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001aR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010(\u0012\u0004\b+\u0010%\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/AvailableSettingRemote;", "", "", "seen0", "", "label", "key", "", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsFilterValueRemote;", "filterValues", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/AvailableSettingRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LMi/a;", "b", "()LMi/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "()V", "getKey", "getKey$annotations", "Ljava/util/List;", "getFilterValues", "()Ljava/util/List;", "getFilterValues$annotations", "Companion", "$serializer", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AvailableSettingRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f91041d = 8;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f91042e = {null, null, new C17451f(ReviewsFilterValueRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f91043a;

    /* renamed from: b  reason: collision with root package name */
    private final String f91044b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ReviewsFilterValueRemote> f91045c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/AvailableSettingRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/AvailableSettingRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<AvailableSettingRemote> serializer() {
            return AvailableSettingRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AvailableSettingRemote(int i10, String str, String str2, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, AvailableSettingRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f91043a = str;
        this.f91044b = str2;
        this.f91045c = list;
    }

    public static final /* synthetic */ void c(AvailableSettingRemote availableSettingRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f91042e;
        dVar.y(serialDescriptor, 0, availableSettingRemote.f91043a);
        dVar.y(serialDescriptor, 1, availableSettingRemote.f91044b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], availableSettingRemote.f91045c);
    }

    public final C10766a b() {
        String str = this.f91043a;
        String str2 = this.f91044b;
        Iterable<ReviewsFilterValueRemote> iterable = this.f91045c;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ReviewsFilterValueRemote a10 : iterable) {
            arrayList.add(a10.a());
        }
        return new C10766a(str, str2, C15985a.h(arrayList));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableSettingRemote)) {
            return false;
        }
        AvailableSettingRemote availableSettingRemote = (AvailableSettingRemote) obj;
        return C17542s.e(this.f91043a, availableSettingRemote.f91043a) && C17542s.e(this.f91044b, availableSettingRemote.f91044b) && C17542s.e(this.f91045c, availableSettingRemote.f91045c);
    }

    public int hashCode() {
        return (((this.f91043a.hashCode() * 31) + this.f91044b.hashCode()) * 31) + this.f91045c.hashCode();
    }

    public String toString() {
        String str = this.f91043a;
        String str2 = this.f91044b;
        List<ReviewsFilterValueRemote> list = this.f91045c;
        return "AvailableSettingRemote(label=" + str + ", key=" + str2 + ", filterValues=" + list + ")";
    }
}
