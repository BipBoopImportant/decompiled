package com.ingka.ikea.app.cart.impl.data;

import HJ.C15854t;
import androidx.annotation.Keep;
import com.ingka.ikea.app.cart.impl.data.b;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 82\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u00059:;<=B+\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010!¨\u0006>"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote;", "Lpp/b;", "Lcom/ingka/ikea/app/cart/impl/data/b;", "", "Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$OpeningHoursRemote;", "openingHours", "Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$ContactRemote;", "contact", "Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$EstimatedWaitTimeRemote;", "estimatedWaitTime", "<init>", "(Ljava/util/List;Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$ContactRemote;Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$EstimatedWaitTimeRemote;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$ContactRemote;Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$EstimatedWaitTimeRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$cart_implementation_release", "(Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toLocal", "()Lcom/ingka/ikea/app/cart/impl/data/b;", "component1", "()Ljava/util/List;", "component2", "()Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$ContactRemote;", "component3", "()Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$EstimatedWaitTimeRemote;", "copy", "(Ljava/util/List;Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$ContactRemote;Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$EstimatedWaitTimeRemote;)Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOpeningHours", "getOpeningHours$annotations", "()V", "Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$ContactRemote;", "getContact", "getContact$annotations", "Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$EstimatedWaitTimeRemote;", "getEstimatedWaitTime", "getEstimatedWaitTime$annotations", "Companion", "OpeningHoursRemote", "ContactRemote", "EstimatedWaitTimeRemote", "$serializer", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteShoppingRemote implements C11768b<b> {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {new C17451f(RemoteShoppingRemote$OpeningHoursRemote$$serializer.INSTANCE), null, null};
    public static final int $stable = 8;
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final ContactRemote contact;
    private final EstimatedWaitTimeRemote estimatedWaitTime;
    private final List<OpeningHoursRemote> openingHours;

    @Keep
    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 +2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002,-B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J(\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006."}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$ContactRemote;", "Lpp/b;", "Lcom/ingka/ikea/app/cart/impl/data/b$a;", "", "number", "skipCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$cart_implementation_release", "(Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$ContactRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toLocal", "()Lcom/ingka/ikea/app/cart/impl/data/b$a;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$ContactRemote;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNumber", "getNumber$annotations", "()V", "getSkipCode", "getSkipCode$annotations", "Companion", "$serializer", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContactRemote implements C11768b<b.a> {
        public static final int $stable = 0;
        public static final a Companion = new a((DefaultConstructorMarker) null);
        private final String number;
        private final String skipCode;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$ContactRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$ContactRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ContactRemote> serializer() {
                return RemoteShoppingRemote$ContactRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ContactRemote(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, RemoteShoppingRemote$ContactRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.number = str;
            this.skipCode = str2;
        }

        public static /* synthetic */ ContactRemote copy$default(ContactRemote contactRemote, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = contactRemote.number;
            }
            if ((i10 & 2) != 0) {
                str2 = contactRemote.skipCode;
            }
            return contactRemote.copy(str, str2);
        }

        public static /* synthetic */ void getNumber$annotations() {
        }

        public static /* synthetic */ void getSkipCode$annotations() {
        }

        public static final /* synthetic */ void write$Self$cart_implementation_release(ContactRemote contactRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, contactRemote.number);
            dVar.B(serialDescriptor, 1, y02, contactRemote.skipCode);
        }

        public final String component1() {
            return this.number;
        }

        public final String component2() {
            return this.skipCode;
        }

        public final ContactRemote copy(String str, String str2) {
            return new ContactRemote(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactRemote)) {
                return false;
            }
            ContactRemote contactRemote = (ContactRemote) obj;
            return C17542s.e(this.number, contactRemote.number) && C17542s.e(this.skipCode, contactRemote.skipCode);
        }

        public final String getNumber() {
            return this.number;
        }

        public final String getSkipCode() {
            return this.skipCode;
        }

        public int hashCode() {
            String str = this.number;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.skipCode;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.number;
            String str2 = this.skipCode;
            return "ContactRemote(number=" + str + ", skipCode=" + str2 + ")";
        }

        public ContactRemote(String str, String str2) {
            this.number = str;
            this.skipCode = str2;
        }

        public b.a toLocal() {
            String str = this.number;
            if (str != null && !C15854t.v0(str)) {
                return new b.a(this.number, this.skipCode);
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid contact number: " + this);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = ContactRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
            return null;
        }
    }

    @Keep
    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 -2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002./B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001b¨\u00060"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$EstimatedWaitTimeRemote;", "Lpp/b;", "Lcom/ingka/ikea/app/cart/impl/data/b$b;", "", "waitingTimeMinutes", "", "status", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$cart_implementation_release", "(Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$EstimatedWaitTimeRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toLocal", "()Lcom/ingka/ikea/app/cart/impl/data/b$b;", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$EstimatedWaitTimeRemote;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getWaitingTimeMinutes", "getWaitingTimeMinutes$annotations", "()V", "Ljava/lang/String;", "getStatus", "getStatus$annotations", "Companion", "a", "$serializer", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EstimatedWaitTimeRemote implements C11768b<b.C1230b> {
        public static final int $stable = 0;
        private static final String CLOSED = "CLOSED";
        public static final a Companion = new a((DefaultConstructorMarker) null);
        private static final String OPEN = "OPEN";
        private final String status;
        private final Integer waitingTimeMinutes;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$EstimatedWaitTimeRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$EstimatedWaitTimeRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "OPEN", "Ljava/lang/String;", "CLOSED", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<EstimatedWaitTimeRemote> serializer() {
                return RemoteShoppingRemote$EstimatedWaitTimeRemote$$serializer.INSTANCE;
            }

            private a() {
            }
        }

        public /* synthetic */ EstimatedWaitTimeRemote(int i10, Integer num, String str, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, RemoteShoppingRemote$EstimatedWaitTimeRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.waitingTimeMinutes = num;
            this.status = str;
        }

        public static /* synthetic */ EstimatedWaitTimeRemote copy$default(EstimatedWaitTimeRemote estimatedWaitTimeRemote, Integer num, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = estimatedWaitTimeRemote.waitingTimeMinutes;
            }
            if ((i10 & 2) != 0) {
                str = estimatedWaitTimeRemote.status;
            }
            return estimatedWaitTimeRemote.copy(num, str);
        }

        public static /* synthetic */ void getStatus$annotations() {
        }

        public static /* synthetic */ void getWaitingTimeMinutes$annotations() {
        }

        public static final /* synthetic */ void write$Self$cart_implementation_release(EstimatedWaitTimeRemote estimatedWaitTimeRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, X.f144073a, estimatedWaitTimeRemote.waitingTimeMinutes);
            dVar.B(serialDescriptor, 1, Y0.f144077a, estimatedWaitTimeRemote.status);
        }

        public final Integer component1() {
            return this.waitingTimeMinutes;
        }

        public final String component2() {
            return this.status;
        }

        public final EstimatedWaitTimeRemote copy(Integer num, String str) {
            return new EstimatedWaitTimeRemote(num, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EstimatedWaitTimeRemote)) {
                return false;
            }
            EstimatedWaitTimeRemote estimatedWaitTimeRemote = (EstimatedWaitTimeRemote) obj;
            return C17542s.e(this.waitingTimeMinutes, estimatedWaitTimeRemote.waitingTimeMinutes) && C17542s.e(this.status, estimatedWaitTimeRemote.status);
        }

        public final String getStatus() {
            return this.status;
        }

        public final Integer getWaitingTimeMinutes() {
            return this.waitingTimeMinutes;
        }

        public int hashCode() {
            Integer num = this.waitingTimeMinutes;
            int i10 = 0;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.status;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Integer num = this.waitingTimeMinutes;
            String str = this.status;
            return "EstimatedWaitTimeRemote(waitingTimeMinutes=" + num + ", status=" + str + ")";
        }

        public EstimatedWaitTimeRemote(Integer num, String str) {
            this.waitingTimeMinutes = num;
            this.status = str;
        }

        public b.C1230b toLocal() {
            Boolean bool;
            String str = this.status;
            if (C17542s.e(str, OPEN)) {
                bool = Boolean.TRUE;
            } else {
                bool = C17542s.e(str, CLOSED) ? Boolean.FALSE : null;
            }
            if (this.waitingTimeMinutes != null && bool != null) {
                return new b.C1230b(this.waitingTimeMinutes.intValue(), bool.booleanValue());
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid waiting time: " + this);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = EstimatedWaitTimeRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
            return null;
        }
    }

    @Keep
    @p
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\b\b\u0018\u0000 02\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u000212B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b/\u0010+\u001a\u0004\b\u0007\u0010\u001e¨\u00063"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$OpeningHoursRemote;", "Lpp/b;", "Lcom/ingka/ikea/app/cart/impl/data/b$c;", "", "startTime", "endTime", "", "isWeekday", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$cart_implementation_release", "(Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$OpeningHoursRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toLocal", "()Lcom/ingka/ikea/app/cart/impl/data/b$c;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$OpeningHoursRemote;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartTime", "getStartTime$annotations", "()V", "getEndTime", "getEndTime$annotations", "Ljava/lang/Boolean;", "isWeekday$annotations", "Companion", "$serializer", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpeningHoursRemote implements C11768b<b.c> {
        public static final int $stable = 0;
        public static final a Companion = new a((DefaultConstructorMarker) null);
        private final String endTime;
        private final Boolean isWeekday;
        private final String startTime;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$OpeningHoursRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$OpeningHoursRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<OpeningHoursRemote> serializer() {
                return RemoteShoppingRemote$OpeningHoursRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ OpeningHoursRemote(int i10, String str, String str2, Boolean bool, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, RemoteShoppingRemote$OpeningHoursRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.startTime = str;
            this.endTime = str2;
            this.isWeekday = bool;
        }

        public static /* synthetic */ OpeningHoursRemote copy$default(OpeningHoursRemote openingHoursRemote, String str, String str2, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = openingHoursRemote.startTime;
            }
            if ((i10 & 2) != 0) {
                str2 = openingHoursRemote.endTime;
            }
            if ((i10 & 4) != 0) {
                bool = openingHoursRemote.isWeekday;
            }
            return openingHoursRemote.copy(str, str2, bool);
        }

        public static /* synthetic */ void getEndTime$annotations() {
        }

        public static /* synthetic */ void getStartTime$annotations() {
        }

        public static /* synthetic */ void isWeekday$annotations() {
        }

        public static final /* synthetic */ void write$Self$cart_implementation_release(OpeningHoursRemote openingHoursRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, openingHoursRemote.startTime);
            dVar.B(serialDescriptor, 1, y02, openingHoursRemote.endTime);
            dVar.B(serialDescriptor, 2, C17457i.f144111a, openingHoursRemote.isWeekday);
        }

        public final String component1() {
            return this.startTime;
        }

        public final String component2() {
            return this.endTime;
        }

        public final Boolean component3() {
            return this.isWeekday;
        }

        public final OpeningHoursRemote copy(String str, String str2, Boolean bool) {
            return new OpeningHoursRemote(str, str2, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpeningHoursRemote)) {
                return false;
            }
            OpeningHoursRemote openingHoursRemote = (OpeningHoursRemote) obj;
            return C17542s.e(this.startTime, openingHoursRemote.startTime) && C17542s.e(this.endTime, openingHoursRemote.endTime) && C17542s.e(this.isWeekday, openingHoursRemote.isWeekday);
        }

        public final String getEndTime() {
            return this.endTime;
        }

        public final String getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            String str = this.startTime;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.endTime;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isWeekday;
            if (bool != null) {
                i10 = bool.hashCode();
            }
            return hashCode2 + i10;
        }

        public final Boolean isWeekday() {
            return this.isWeekday;
        }

        public String toString() {
            String str = this.startTime;
            String str2 = this.endTime;
            Boolean bool = this.isWeekday;
            return "OpeningHoursRemote(startTime=" + str + ", endTime=" + str2 + ", isWeekday=" + bool + ")";
        }

        public OpeningHoursRemote(String str, String str2, Boolean bool) {
            this.startTime = str;
            this.endTime = str2;
            this.isWeekday = bool;
        }

        public b.c toLocal() {
            char c10;
            String str;
            String str2;
            String str3 = this.startTime;
            String str4 = DslKt.INDICATOR_BACKGROUND;
            Class<OpeningHoursRemote> cls = OpeningHoursRemote.class;
            if (str3 == null || C15854t.v0(str3) || (str = this.endTime) == null || C15854t.v0(str)) {
                String str5 = str4;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid opening hours: " + this);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar : arrayList) {
                    if (str6 == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str6 = C11820c.a(a10);
                    }
                    if (str7 == null) {
                        String name = cls.getName();
                        C17542s.g(name);
                        c10 = '$';
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str5) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        c10 = '$';
                    }
                    char c11 = c10;
                    bVar.a(eVar, str7, false, illegalArgumentException, str6);
                }
                return null;
            }
            Boolean bool = this.isWeekday;
            if (C17542s.e(bool, Boolean.TRUE)) {
                return new b.c.a(this.startTime, this.endTime);
            }
            if (C17542s.e(bool, Boolean.FALSE)) {
                return new b.c.C1231b(this.startTime, this.endTime);
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("isWeekday is null");
            e eVar2 = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str8 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException2);
                    if (a11 == null) {
                        return null;
                    }
                    str8 = C11820c.a(a11);
                }
                if (str9 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    str2 = str4;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    str2 = str4;
                }
                String str10 = str9;
                bVar2.a(eVar2, str10, false, illegalArgumentException2, str8);
                str9 = str10;
                eVar2 = eVar2;
                str4 = str2;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/cart/impl/data/RemoteShoppingRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<RemoteShoppingRemote> serializer() {
            return RemoteShoppingRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RemoteShoppingRemote(int i10, List list, ContactRemote contactRemote, EstimatedWaitTimeRemote estimatedWaitTimeRemote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, RemoteShoppingRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.openingHours = list;
        this.contact = contactRemote;
        this.estimatedWaitTime = estimatedWaitTimeRemote;
    }

    public static /* synthetic */ RemoteShoppingRemote copy$default(RemoteShoppingRemote remoteShoppingRemote, List<OpeningHoursRemote> list, ContactRemote contactRemote, EstimatedWaitTimeRemote estimatedWaitTimeRemote, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = remoteShoppingRemote.openingHours;
        }
        if ((i10 & 2) != 0) {
            contactRemote = remoteShoppingRemote.contact;
        }
        if ((i10 & 4) != 0) {
            estimatedWaitTimeRemote = remoteShoppingRemote.estimatedWaitTime;
        }
        return remoteShoppingRemote.copy(list, contactRemote, estimatedWaitTimeRemote);
    }

    public static /* synthetic */ void getContact$annotations() {
    }

    public static /* synthetic */ void getEstimatedWaitTime$annotations() {
    }

    public static /* synthetic */ void getOpeningHours$annotations() {
    }

    public static final /* synthetic */ void write$Self$cart_implementation_release(RemoteShoppingRemote remoteShoppingRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, $childSerializers[0], remoteShoppingRemote.openingHours);
        dVar.B(serialDescriptor, 1, RemoteShoppingRemote$ContactRemote$$serializer.INSTANCE, remoteShoppingRemote.contact);
        dVar.B(serialDescriptor, 2, RemoteShoppingRemote$EstimatedWaitTimeRemote$$serializer.INSTANCE, remoteShoppingRemote.estimatedWaitTime);
    }

    public final List<OpeningHoursRemote> component1() {
        return this.openingHours;
    }

    public final ContactRemote component2() {
        return this.contact;
    }

    public final EstimatedWaitTimeRemote component3() {
        return this.estimatedWaitTime;
    }

    public final RemoteShoppingRemote copy(List<OpeningHoursRemote> list, ContactRemote contactRemote, EstimatedWaitTimeRemote estimatedWaitTimeRemote) {
        return new RemoteShoppingRemote(list, contactRemote, estimatedWaitTimeRemote);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteShoppingRemote)) {
            return false;
        }
        RemoteShoppingRemote remoteShoppingRemote = (RemoteShoppingRemote) obj;
        return C17542s.e(this.openingHours, remoteShoppingRemote.openingHours) && C17542s.e(this.contact, remoteShoppingRemote.contact) && C17542s.e(this.estimatedWaitTime, remoteShoppingRemote.estimatedWaitTime);
    }

    public final ContactRemote getContact() {
        return this.contact;
    }

    public final EstimatedWaitTimeRemote getEstimatedWaitTime() {
        return this.estimatedWaitTime;
    }

    public final List<OpeningHoursRemote> getOpeningHours() {
        return this.openingHours;
    }

    public int hashCode() {
        List<OpeningHoursRemote> list = this.openingHours;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ContactRemote contactRemote = this.contact;
        int hashCode2 = (hashCode + (contactRemote == null ? 0 : contactRemote.hashCode())) * 31;
        EstimatedWaitTimeRemote estimatedWaitTimeRemote = this.estimatedWaitTime;
        if (estimatedWaitTimeRemote != null) {
            i10 = estimatedWaitTimeRemote.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        List<OpeningHoursRemote> list = this.openingHours;
        ContactRemote contactRemote = this.contact;
        EstimatedWaitTimeRemote estimatedWaitTimeRemote = this.estimatedWaitTime;
        return "RemoteShoppingRemote(openingHours=" + list + ", contact=" + contactRemote + ", estimatedWaitTime=" + estimatedWaitTimeRemote + ")";
    }

    public RemoteShoppingRemote(List<OpeningHoursRemote> list, ContactRemote contactRemote, EstimatedWaitTimeRemote estimatedWaitTimeRemote) {
        this.openingHours = list;
        this.contact = contactRemote;
        this.estimatedWaitTime = estimatedWaitTimeRemote;
    }

    public b toLocal() {
        ArrayList arrayList;
        List<OpeningHoursRemote> list = this.openingHours;
        if (list != null) {
            arrayList = new ArrayList();
            for (OpeningHoursRemote local : list) {
                b.c local2 = local.toLocal();
                if (local2 != null) {
                    arrayList.add(local2);
                }
            }
        } else {
            arrayList = null;
        }
        ContactRemote contactRemote = this.contact;
        b.a local3 = contactRemote != null ? contactRemote.toLocal() : null;
        EstimatedWaitTimeRemote estimatedWaitTimeRemote = this.estimatedWaitTime;
        b.C1230b local4 = estimatedWaitTimeRemote != null ? estimatedWaitTimeRemote.toLocal() : null;
        if (arrayList != null && !arrayList.isEmpty() && local3 != null && local4 != null) {
            return new b(arrayList, local3, local4);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid remote sales details: " + this);
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList2.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList2) {
            if (str == null) {
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = RemoteShoppingRemote.class.getName();
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
        return null;
    }
}
