package com.ingka.ikea.checkout.impl.delivery.bottomsheets;

import Do.m;
import HJ.C15854t;
import Nn.C10813p;
import Nn.Q;
import Nn.u;
import android.os.Parcel;
import android.os.Parcelable;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "c", "a", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f$a;", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f$b;", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f$c;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f implements Parcelable {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f$a;", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f;", "", "nextDeliveryId", "", "nextDeliveryIndex", "deliveryServiceId", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends f {
        public static final Parcelable.Creator<a> CREATOR = new C2103a();

        /* renamed from: d  reason: collision with root package name */
        public static final int f94536d = 8;

        /* renamed from: a  reason: collision with root package name */
        private final String f94537a;

        /* renamed from: b  reason: collision with root package name */
        private final int f94538b;

        /* renamed from: c  reason: collision with root package name */
        private final String f94539c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.checkout.impl.delivery.bottomsheets.f$a$a  reason: collision with other inner class name */
        public static final class C2103a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt(), parcel.readString());
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, int i10, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "nextDeliveryId");
            C17542s.j(str2, "deliveryServiceId");
            this.f94537a = str;
            this.f94538b = i10;
            this.f94539c = str2;
        }

        public final String a() {
            return this.f94539c;
        }

        public final String b() {
            return this.f94537a;
        }

        public final int c() {
            return this.f94538b;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f94537a, aVar.f94537a) && this.f94538b == aVar.f94538b && C17542s.e(this.f94539c, aVar.f94539c);
        }

        public int hashCode() {
            return (((this.f94537a.hashCode() * 31) + Integer.hashCode(this.f94538b)) * 31) + this.f94539c.hashCode();
        }

        public String toString() {
            String str = this.f94537a;
            int i10 = this.f94538b;
            String str2 = this.f94539c;
            return "PickupPointsInNextDeliverySelected(nextDeliveryId=" + str + ", nextDeliveryIndex=" + i10 + ", deliveryServiceId=" + str2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f94537a);
            parcel.writeInt(this.f94538b);
            parcel.writeString(this.f94539c);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f$b;", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public static final b f94540a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final int f94541b = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return b.f94540a;
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b \u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b(\u0010.¨\u0006/"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f$c;", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f;", "", "isSelectable", "", "LNn/Q;", "unavailableItems", "LDo/m$c;", "preselectPickupId", "LNn/p;", "deliveryServiceType", "LNn/u;", "serviceType", "<init>", "(ZLjava/util/List;LDo/m$c;LNn/p;LNn/u;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "LDo/m$c;", "()LDo/m$c;", "LNn/p;", "()LNn/p;", "LNn/u;", "()LNn/u;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public static final int f94542f = 8;

        /* renamed from: a  reason: collision with root package name */
        private final boolean f94543a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Q> f94544b;

        /* renamed from: c  reason: collision with root package name */
        private final m.c f94545c;

        /* renamed from: d  reason: collision with root package name */
        private final C10813p f94546d;

        /* renamed from: e  reason: collision with root package name */
        private final u f94547e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                boolean z10 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(parcel.readParcelable(c.class.getClassLoader()));
                }
                return new c(z10, arrayList, m.c.CREATOR.createFromParcel(parcel), C10813p.valueOf(parcel.readString()), u.valueOf(parcel.readString()));
            }

            /* renamed from: b */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(boolean z10, List<Q> list, m.c cVar, C10813p pVar, u uVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "unavailableItems");
            C17542s.j(cVar, "preselectPickupId");
            C17542s.j(pVar, "deliveryServiceType");
            C17542s.j(uVar, "serviceType");
            this.f94543a = z10;
            this.f94544b = list;
            this.f94545c = cVar;
            this.f94546d = pVar;
            this.f94547e = uVar;
            if (list.isEmpty()) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("List must not be empty");
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 != null) {
                            str = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    if (str2 == null) {
                        String name = c.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, illegalArgumentException, str);
                }
            }
        }

        public final C10813p a() {
            return this.f94546d;
        }

        public final m.c b() {
            return this.f94545c;
        }

        public final u c() {
            return this.f94547e;
        }

        public final List<Q> d() {
            return this.f94544b;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f94543a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f94543a == cVar.f94543a && C17542s.e(this.f94544b, cVar.f94544b) && C17542s.e(this.f94545c, cVar.f94545c) && this.f94546d == cVar.f94546d && this.f94547e == cVar.f94547e;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.f94543a) * 31) + this.f94544b.hashCode()) * 31) + this.f94545c.hashCode()) * 31) + this.f94546d.hashCode()) * 31) + this.f94547e.hashCode();
        }

        public String toString() {
            boolean z10 = this.f94543a;
            List<Q> list = this.f94544b;
            m.c cVar = this.f94545c;
            C10813p pVar = this.f94546d;
            u uVar = this.f94547e;
            return "UnavailableItemsPickupPointSelected(isSelectable=" + z10 + ", unavailableItems=" + list + ", preselectPickupId=" + cVar + ", deliveryServiceType=" + pVar + ", serviceType=" + uVar + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f94543a ? 1 : 0);
            List<Q> list = this.f94544b;
            parcel.writeInt(list.size());
            for (Q writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i10);
            }
            this.f94545c.writeToParcel(parcel, i10);
            parcel.writeString(this.f94546d.name());
            parcel.writeString(this.f94547e.name());
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private f() {
    }
}
