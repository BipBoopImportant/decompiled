package com.ingka.ikea.room.impl.data.remote;

import HJ.C15854t;
import KJ.C15985a;
import XH.v;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
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
import py.d;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import sy.c;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002(!B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R$\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078\u0002X\u0004¢\u0006\f\n\u0004\b\u0016\u0010%\u0012\u0004\b&\u0010$¨\u0006)"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/RoomRemote;", "Lpp/b;", "Lsy/c;", "", "seen0", "", "title", "", "Lpy/d;", "slots", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/room/impl/data/remote/RoomRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lsy/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle$annotations", "()V", "Ljava/util/List;", "getSlots$annotations", "Companion", "$serializer", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoomRemote implements C11768b<c> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f119755c = 8;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f119756d = {null, new C17451f(a.f119768c)};

    /* renamed from: a  reason: collision with root package name */
    private final String f119757a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d<?>> f119758b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/RoomRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/room/impl/data/remote/RoomRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<RoomRemote> serializer() {
            return RoomRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RoomRemote(int i10, String str, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, RoomRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119757a = str;
        this.f119758b = list;
    }

    public static final /* synthetic */ void c(RoomRemote roomRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119756d;
        dVar.B(serialDescriptor, 0, Y0.f144077a, roomRemote.f119757a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], roomRemote.f119758b);
    }

    public c b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : this.f119758b) {
            if (((d) next) instanceof UnsupportedSlotRemote) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        v vVar = new v(arrayList, arrayList2);
        List list = (List) vVar.a();
        List list2 = (List) vVar.b();
        if (!list.isEmpty()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported slots, " + list);
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar, false)) {
                    arrayList3.add(next2);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList3) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = RoomRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
        }
        String str5 = this.f119757a;
        Iterable<d> iterable = list2;
        ArrayList arrayList4 = new ArrayList(C16877v.y(iterable, 10));
        for (d local : iterable) {
            arrayList4.add((sy.d) local.toLocal());
        }
        return new c(str5, C15985a.h(arrayList4));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomRemote)) {
            return false;
        }
        RoomRemote roomRemote = (RoomRemote) obj;
        return C17542s.e(this.f119757a, roomRemote.f119757a) && C17542s.e(this.f119758b, roomRemote.f119758b);
    }

    public int hashCode() {
        String str = this.f119757a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f119758b.hashCode();
    }

    public String toString() {
        String str = this.f119757a;
        List<d<?>> list = this.f119758b;
        return "RoomRemote(title=" + str + ", slots=" + list + ")";
    }
}
