package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import Qq.b;
import YH.C16877v;
import fK.p;
import gK.C17294a;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+!B7\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0019R*\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/DateRemote;", "Lpp/b;", "LQq/b;", "", "seen0", "", "date", "", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/EventRemote;", "events", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/DateRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LQq/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDate", "getDate$annotations", "()V", "Ljava/util/List;", "getEvents", "()Ljava/util/List;", "getEvents$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DateRemote implements C11768b<b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f95793c = {null, new C17451f(C17294a.u(EventRemote$$serializer.INSTANCE))};

    /* renamed from: a  reason: collision with root package name */
    private final String f95794a;

    /* renamed from: b  reason: collision with root package name */
    private final List<EventRemote> f95795b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/DateRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/DateRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<DateRemote> serializer() {
            return DateRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DateRemote(int i10, String str, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, DateRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95794a = str;
        this.f95795b = list;
    }

    public static final /* synthetic */ void c(DateRemote dateRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95793c;
        dVar.B(serialDescriptor, 0, Y0.f144077a, dateRemote.f95794a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], dateRemote.f95795b);
    }

    public b b() {
        String str = this.f95794a;
        if (str != null) {
            List<EventRemote> list = this.f95795b;
            if (list != null) {
                Iterable<EventRemote> iterable = list;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (EventRemote eventRemote : iterable) {
                    if (eventRemote != null) {
                        arrayList.add(eventRemote.a());
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                return new b(str, arrayList);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Date is required");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateRemote)) {
            return false;
        }
        DateRemote dateRemote = (DateRemote) obj;
        return C17542s.e(this.f95794a, dateRemote.f95794a) && C17542s.e(this.f95795b, dateRemote.f95795b);
    }

    public int hashCode() {
        String str = this.f95794a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<EventRemote> list = this.f95795b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f95794a;
        List<EventRemote> list = this.f95795b;
        return "DateRemote(date=" + str + ", events=" + list + ")";
    }
}
