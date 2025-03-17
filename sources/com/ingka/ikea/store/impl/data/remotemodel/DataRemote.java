package com.ingka.ikea.store.impl.data.remotemodel;

import GB.e;
import HJ.C15854t;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.time.DayOfWeek;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00028\u0018BW\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010#\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010#\u0012\u0004\b0\u0010'\u001a\u0004\b/\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010#\u0012\u0004\b3\u0010'\u001a\u0004\b2\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010#\u0012\u0004\b6\u0010'\u001a\u0004\b5\u0010%¨\u00069"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/DataRemote;", "Lpp/b;", "LGB/e$a;", "", "seen0", "index", "", "dayText", "accuracy", "hour", "live", "trend", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/store/impl/data/remotemodel/DataRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LGB/e$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getIndex", "()Ljava/lang/Integer;", "getIndex$annotations", "()V", "Ljava/lang/String;", "getDayText", "getDayText$annotations", "c", "getAccuracy", "getAccuracy$annotations", "d", "getHour", "getHour$annotations", "e", "getLive", "getLive$annotations", "f", "getTrend", "getTrend$annotations", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataRemote implements C11768b<e.a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Integer f120410a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120411b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f120412c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f120413d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f120414e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f120415f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/DataRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/DataRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<DataRemote> serializer() {
            return DataRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ C17220a<DayOfWeek> f120416a = C17221b.a(DayOfWeek.values());
    }

    public /* synthetic */ DataRemote(int i10, Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, DataRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120410a = num;
        this.f120411b = str;
        this.f120412c = num2;
        this.f120413d = num3;
        this.f120414e = num4;
        this.f120415f = num5;
    }

    public static final /* synthetic */ void b(DataRemote dataRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        X x10 = X.f144073a;
        dVar.B(serialDescriptor, 0, x10, dataRemote.f120410a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, dataRemote.f120411b);
        dVar.B(serialDescriptor, 2, x10, dataRemote.f120412c);
        dVar.B(serialDescriptor, 3, x10, dataRemote.f120413d);
        dVar.B(serialDescriptor, 4, x10, dataRemote.f120414e);
        dVar.B(serialDescriptor, 5, x10, dataRemote.f120415f);
    }

    public e.a a() {
        T t10 = null;
        if (this.f120411b != null) {
            Iterator<T> it = b.f120416a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C15854t.W(((DayOfWeek) next).name(), this.f120411b, false, 2, (Object) null)) {
                    t10 = next;
                    break;
                }
            }
            t10 = (DayOfWeek) t10;
        }
        T t11 = t10;
        if (t11 != null) {
            Integer num = this.f120413d;
            if (num != null) {
                int intValue = num.intValue();
                Integer num2 = this.f120412c;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    Integer num3 = this.f120414e;
                    if (num3 != null) {
                        int intValue3 = num3.intValue();
                        Integer num4 = this.f120415f;
                        if (num4 != null) {
                            return new e.a(t11, intValue, intValue2, intValue3, num4.intValue());
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        String str = this.f120411b;
        throw new IllegalArgumentException(("Could not parse dayText: " + str).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataRemote)) {
            return false;
        }
        DataRemote dataRemote = (DataRemote) obj;
        return C17542s.e(this.f120410a, dataRemote.f120410a) && C17542s.e(this.f120411b, dataRemote.f120411b) && C17542s.e(this.f120412c, dataRemote.f120412c) && C17542s.e(this.f120413d, dataRemote.f120413d) && C17542s.e(this.f120414e, dataRemote.f120414e) && C17542s.e(this.f120415f, dataRemote.f120415f);
    }

    public int hashCode() {
        Integer num = this.f120410a;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f120411b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f120412c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f120413d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f120414e;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f120415f;
        if (num5 != null) {
            i10 = num5.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        Integer num = this.f120410a;
        String str = this.f120411b;
        Integer num2 = this.f120412c;
        Integer num3 = this.f120413d;
        Integer num4 = this.f120414e;
        Integer num5 = this.f120415f;
        return "DataRemote(index=" + num + ", dayText=" + str + ", accuracy=" + num2 + ", hour=" + num3 + ", live=" + num4 + ", trend=" + num5 + ")";
    }
}
