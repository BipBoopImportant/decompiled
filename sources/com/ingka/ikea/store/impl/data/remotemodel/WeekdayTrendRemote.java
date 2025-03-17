package com.ingka.ikea.store.impl.data.remotemodel;

import GB.f;
import HJ.C15854t;
import YH.C16877v;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+!B5\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0019R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/WeekdayTrendRemote;", "Lpp/b;", "LGB/f$a;", "", "seen0", "", "dayText", "", "Lcom/ingka/ikea/store/impl/data/remotemodel/TrendRemote;", "trends", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/store/impl/data/remotemodel/WeekdayTrendRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LGB/f$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDayText", "getDayText$annotations", "()V", "Ljava/util/List;", "getTrends", "()Ljava/util/List;", "getTrends$annotations", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WeekdayTrendRemote implements C11768b<f.a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f120496c = {null, new C17451f(TrendRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f120497a;

    /* renamed from: b  reason: collision with root package name */
    private final List<TrendRemote> f120498b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/WeekdayTrendRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/WeekdayTrendRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<WeekdayTrendRemote> serializer() {
            return WeekdayTrendRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ C17220a<DayOfWeek> f120499a = C17221b.a(DayOfWeek.values());
    }

    public /* synthetic */ WeekdayTrendRemote(int i10, String str, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, WeekdayTrendRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120497a = str;
        this.f120498b = list;
    }

    public static final /* synthetic */ void c(WeekdayTrendRemote weekdayTrendRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120496c;
        dVar.B(serialDescriptor, 0, Y0.f144077a, weekdayTrendRemote.f120497a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], weekdayTrendRemote.f120498b);
    }

    public f.a b() {
        T t10 = null;
        if (this.f120497a != null) {
            Iterator<T> it = b.f120499a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C15854t.W(((DayOfWeek) next).name(), this.f120497a, false, 2, (Object) null)) {
                    t10 = next;
                    break;
                }
            }
            t10 = (DayOfWeek) t10;
        }
        if (t10 != null) {
            Iterable<TrendRemote> iterable = this.f120498b;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (TrendRemote a10 : iterable) {
                arrayList.add(a10.a());
            }
            return new f.a(t10, arrayList);
        }
        String str = this.f120497a;
        throw new IllegalArgumentException(("Could not parse dayText: " + str).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeekdayTrendRemote)) {
            return false;
        }
        WeekdayTrendRemote weekdayTrendRemote = (WeekdayTrendRemote) obj;
        return C17542s.e(this.f120497a, weekdayTrendRemote.f120497a) && C17542s.e(this.f120498b, weekdayTrendRemote.f120498b);
    }

    public int hashCode() {
        String str = this.f120497a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f120498b.hashCode();
    }

    public String toString() {
        String str = this.f120497a;
        List<TrendRemote> list = this.f120498b;
        return "WeekdayTrendRemote(dayText=" + str + ", trends=" + list + ")";
    }
}
