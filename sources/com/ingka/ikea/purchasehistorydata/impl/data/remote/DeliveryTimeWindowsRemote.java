package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import HJ.C15854t;
import Hx.a;
import Hx.c;
import Hx.h;
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
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u0000 52\u00020\u0001:\u00026%BI\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010,\u0012\u0004\b/\u0010)\u001a\u0004\b-\u0010.R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010)\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryTimeWindowsRemote;", "", "", "seen0", "", "type", "deliveryNumber", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/BookedSlotRemote;", "bookedSlot", "", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/RescheduleTimeWindowRemote;", "slots", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/BookedSlotRemote;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryTimeWindowsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LJx/a;", "timeSlotMapper", "LHx/a;", "b", "(LJx/a;)LHx/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "getDeliveryNumber", "getDeliveryNumber$annotations", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/BookedSlotRemote;", "getBookedSlot", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/BookedSlotRemote;", "getBookedSlot$annotations", "d", "Ljava/util/List;", "getSlots", "()Ljava/util/List;", "getSlots$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeliveryTimeWindowsRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f119511e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f119512f = {null, null, null, new C17451f(RescheduleTimeWindowRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f119513a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119514b;

    /* renamed from: c  reason: collision with root package name */
    private final BookedSlotRemote f119515c;

    /* renamed from: d  reason: collision with root package name */
    private final List<RescheduleTimeWindowRemote> f119516d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryTimeWindowsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/DeliveryTimeWindowsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<DeliveryTimeWindowsRemote> serializer() {
            return DeliveryTimeWindowsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DeliveryTimeWindowsRemote(int i10, String str, String str2, BookedSlotRemote bookedSlotRemote, List list, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, DeliveryTimeWindowsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119513a = str;
        this.f119514b = str2;
        this.f119515c = bookedSlotRemote;
        this.f119516d = list;
    }

    public static final /* synthetic */ void c(DeliveryTimeWindowsRemote deliveryTimeWindowsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119512f;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, deliveryTimeWindowsRemote.f119513a);
        dVar.B(serialDescriptor, 1, y02, deliveryTimeWindowsRemote.f119514b);
        dVar.B(serialDescriptor, 2, BookedSlotRemote$$serializer.INSTANCE, deliveryTimeWindowsRemote.f119515c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], deliveryTimeWindowsRemote.f119516d);
    }

    public final Hx.a b(Jx.a aVar) {
        char c10;
        String str;
        Jx.a aVar2 = aVar;
        C17542s.j(aVar2, "timeSlotMapper");
        String str2 = this.f119514b;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        Class<DeliveryTimeWindowsRemote> cls = DeliveryTimeWindowsRemote.class;
        List list = null;
        if (str2 == null || str2.length() == 0) {
            String str4 = str3;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing delivery number");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str5 = C11820c.a(a10);
                }
                if (str6 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    c10 = '$';
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str4) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    c10 = '$';
                }
                char c11 = c10;
                bVar.a(eVar, str6, false, illegalArgumentException, str5);
            }
            return null;
        }
        BookedSlotRemote bookedSlotRemote = this.f119515c;
        h.a a11 = bookedSlotRemote != null ? bookedSlotRemote.a() : null;
        if (a11 == null) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("No valid bookedSlot: " + this.f119515c);
            e eVar2 = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str7 == null) {
                    String a12 = C11818a.a((String) null, illegalArgumentException2);
                    if (a12 == null) {
                        break;
                    }
                    str7 = C11820c.a(a12);
                }
                if (str8 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    str = str3;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    str = str3;
                }
                String str9 = str8;
                bVar2.a(eVar2, str9, false, illegalArgumentException2, str7);
                str8 = str9;
                str3 = str;
            }
            return null;
        }
        List<RescheduleTimeWindowRemote> list2 = this.f119516d;
        if (list2 != null) {
            list = new ArrayList();
            for (RescheduleTimeWindowRemote c12 : list2) {
                h c13 = aVar2.a(c12);
                if (c13 != null) {
                    list.add(c13);
                }
            }
        }
        c.C2661c.C2663c a13 = a.C2658a.Companion.a(this.f119513a);
        String str10 = this.f119514b;
        if (list == null) {
            list = C16877v.n();
        }
        return new Hx.a(a13, str10, a11, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryTimeWindowsRemote)) {
            return false;
        }
        DeliveryTimeWindowsRemote deliveryTimeWindowsRemote = (DeliveryTimeWindowsRemote) obj;
        return C17542s.e(this.f119513a, deliveryTimeWindowsRemote.f119513a) && C17542s.e(this.f119514b, deliveryTimeWindowsRemote.f119514b) && C17542s.e(this.f119515c, deliveryTimeWindowsRemote.f119515c) && C17542s.e(this.f119516d, deliveryTimeWindowsRemote.f119516d);
    }

    public int hashCode() {
        String str = this.f119513a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f119514b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BookedSlotRemote bookedSlotRemote = this.f119515c;
        int hashCode3 = (hashCode2 + (bookedSlotRemote == null ? 0 : bookedSlotRemote.hashCode())) * 31;
        List<RescheduleTimeWindowRemote> list = this.f119516d;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f119513a;
        String str2 = this.f119514b;
        BookedSlotRemote bookedSlotRemote = this.f119515c;
        List<RescheduleTimeWindowRemote> list = this.f119516d;
        return "DeliveryTimeWindowsRemote(type=" + str + ", deliveryNumber=" + str2 + ", bookedSlot=" + bookedSlotRemote + ", slots=" + list + ")";
    }
}
