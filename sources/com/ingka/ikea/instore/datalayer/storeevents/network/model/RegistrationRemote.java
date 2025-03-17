package com.ingka.ikea.instore.datalayer.storeevents.network.model;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lt.C11566a;
import lt.C11567b;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b \b\b\u0018\u0000 ?2\u00020\u0001:\u0005/*\u001a@$BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010%\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010'R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010-\u0012\u0004\b.\u0010)\u001a\u0004\b*\u0010\u001dR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010)\u001a\u0004\b1\u00102R \u0010\n\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010-\u0012\u0004\b6\u0010)\u001a\u0004\b5\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010-\u0012\u0004\b9\u0010)\u001a\u0004\b8\u0010\u001dR \u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010)\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "", "", "adultCount", "childCount", "", "state", "", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$b;", "contactMethods", "creationTime", "pageLang", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$c;", "customerType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$c;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$c;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getAdultCount", "()Ljava/lang/Integer;", "getAdultCount$annotations", "()V", "b", "getChildCount", "getChildCount$annotations", "Ljava/lang/String;", "getState$annotations", "d", "Ljava/util/List;", "getContactMethods", "()Ljava/util/List;", "getContactMethods$annotations", "e", "getCreationTime", "getCreationTime$annotations", "f", "getPageLang", "getPageLang$annotations", "g", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$c;", "getCustomerType", "()Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$c;", "getCustomerType$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegistrationRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f96166h = {0, 0, 0, new C17451f(b.Companion.serializer()), 0, 0, c.Companion.serializer()};

    /* renamed from: a  reason: collision with root package name */
    private final Integer f96167a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f96168b;

    /* renamed from: c  reason: collision with root package name */
    private final String f96169c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b> f96170d;

    /* renamed from: e  reason: collision with root package name */
    private final String f96171e;

    /* renamed from: f  reason: collision with root package name */
    private final String f96172f;

    /* renamed from: g  reason: collision with root package name */
    private final c f96173g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<RegistrationRemote> serializer() {
            return RegistrationRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @p
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$b;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "Sms", "Email", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        Sms,
        Email;
        
        /* access modifiers changed from: private */
        public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
        public static final a Companion = null;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$b$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$b;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            private final /* synthetic */ KSerializer a() {
                return (KSerializer) b.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<b> serializer() {
                return a();
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            b[] b10;
            $ENTRIES = C17221b.a(b10);
            Companion = new a((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, new C11566a());
        }
    }

    @p
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$c;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "Individual", "Business", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        Individual,
        Business;
        
        /* access modifiers changed from: private */
        public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
        public static final a Companion = null;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$c$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$c;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            private final /* synthetic */ KSerializer a() {
                return (KSerializer) c.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<c> serializer() {
                return a();
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            c[] b10;
            $ENTRIES = C17221b.a(b10);
            Companion = new a((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, new C11567b());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote$d;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Registered", "Cancelled", "WaitingList", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        Registered("REGISTERED"),
        Cancelled("CANCELLED"),
        WaitingList("WAITING_LIST");
        
        private final String rawValue;

        static {
            d[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private d(String str) {
            this.rawValue = str;
        }

        public final String b() {
            return this.rawValue;
        }
    }

    public /* synthetic */ RegistrationRemote(int i10, Integer num, Integer num2, String str, List list, String str2, String str3, c cVar, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, RegistrationRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96167a = num;
        this.f96168b = num2;
        this.f96169c = str;
        this.f96170d = list;
        this.f96171e = str2;
        this.f96172f = str3;
        this.f96173g = cVar;
    }

    public static final /* synthetic */ void c(RegistrationRemote registrationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f96166h;
        X x10 = X.f144073a;
        dVar.B(serialDescriptor, 0, x10, registrationRemote.f96167a);
        dVar.B(serialDescriptor, 1, x10, registrationRemote.f96168b);
        dVar.y(serialDescriptor, 2, registrationRemote.f96169c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], registrationRemote.f96170d);
        dVar.y(serialDescriptor, 4, registrationRemote.f96171e);
        dVar.B(serialDescriptor, 5, Y0.f144077a, registrationRemote.f96172f);
        dVar.i(serialDescriptor, 6, kSerializerArr[6], registrationRemote.f96173g);
    }

    public final String b() {
        return this.f96169c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegistrationRemote)) {
            return false;
        }
        RegistrationRemote registrationRemote = (RegistrationRemote) obj;
        return C17542s.e(this.f96167a, registrationRemote.f96167a) && C17542s.e(this.f96168b, registrationRemote.f96168b) && C17542s.e(this.f96169c, registrationRemote.f96169c) && C17542s.e(this.f96170d, registrationRemote.f96170d) && C17542s.e(this.f96171e, registrationRemote.f96171e) && C17542s.e(this.f96172f, registrationRemote.f96172f) && this.f96173g == registrationRemote.f96173g;
    }

    public int hashCode() {
        Integer num = this.f96167a;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f96168b;
        int hashCode2 = (((((((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.f96169c.hashCode()) * 31) + this.f96170d.hashCode()) * 31) + this.f96171e.hashCode()) * 31;
        String str = this.f96172f;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.f96173g.hashCode();
    }

    public String toString() {
        Integer num = this.f96167a;
        Integer num2 = this.f96168b;
        String str = this.f96169c;
        List<b> list = this.f96170d;
        String str2 = this.f96171e;
        String str3 = this.f96172f;
        c cVar = this.f96173g;
        return "RegistrationRemote(adultCount=" + num + ", childCount=" + num2 + ", state=" + str + ", contactMethods=" + list + ", creationTime=" + str2 + ", pageLang=" + str3 + ", customerType=" + cVar + ")";
    }

    public RegistrationRemote(Integer num, Integer num2, String str, List<? extends b> list, String str2, String str3, c cVar) {
        C17542s.j(str, "state");
        C17542s.j(list, "contactMethods");
        C17542s.j(str2, "creationTime");
        C17542s.j(cVar, "customerType");
        this.f96167a = num;
        this.f96168b = num2;
        this.f96169c = str;
        this.f96170d = list;
        this.f96171e = str2;
        this.f96172f = str3;
        this.f96173g = cVar;
    }
}
