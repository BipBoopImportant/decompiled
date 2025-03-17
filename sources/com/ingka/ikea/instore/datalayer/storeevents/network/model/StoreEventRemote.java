package com.ingka.ikea.instore.datalayer.storeevents.network.model;

import GJ.C15768k;
import XH.t;
import YH.C16877v;
import com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.C17458i0;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import jt.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lt.c;
import lt.d;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\b\b\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007NOPQRS+Bq\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010,\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010/\u001a\u0004\b5\u00106R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010,\u0012\u0004\b9\u0010/\u001a\u0004\b8\u0010#R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010/\u001a\u0004\b<\u0010=R(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u0010/\u001a\u0004\bA\u0010BR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010D\u0012\u0004\bG\u0010/\u001a\u0004\bE\u0010FR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010/\u001a\u0004\bJ\u0010K¨\u0006T"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote;", "Lpp/b;", "Ljt/b;", "", "seen0", "", "id", "eventImagePath", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Price;", "price", "loyaltyEvent", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Details;", "details", "", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot;", "timeSlots", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings;", "registrationSettings", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote;", "location", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Price;Ljava/lang/String;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Details;Ljava/util/List;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "d", "()Ljt/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "b", "getEventImagePath", "getEventImagePath$annotations", "c", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Price;", "getPrice", "()Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Price;", "getPrice$annotations", "getLoyaltyEvent", "getLoyaltyEvent$annotations", "e", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Details;", "getDetails", "()Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Details;", "getDetails$annotations", "f", "Ljava/util/List;", "getTimeSlots", "()Ljava/util/List;", "getTimeSlots$annotations", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings;", "getRegistrationSettings", "()Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings;", "getRegistrationSettings$annotations", "h", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote;", "getLocation", "()Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote;", "getLocation$annotations", "Companion", "Price", "LocationRemote", "Details", "TimeSlot", "RegistrationSettings", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoreEventRemote implements C11768b<b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f96176i = {null, null, null, null, null, new C17451f(StoreEventRemote$TimeSlot$$serializer.INSTANCE), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f96177a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96178b;

    /* renamed from: c  reason: collision with root package name */
    private final Price f96179c;

    /* renamed from: d  reason: collision with root package name */
    private final String f96180d;

    /* renamed from: e  reason: collision with root package name */
    private final Details f96181e;

    /* renamed from: f  reason: collision with root package name */
    private final List<TimeSlot> f96182f;

    /* renamed from: g  reason: collision with root package name */
    private final RegistrationSettings f96183g;

    /* renamed from: h  reason: collision with root package name */
    private final LocationRemote f96184h;

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*\u0015B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010 \u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Details;", "Lpp/b;", "Ljt/b$a;", "", "seen0", "", "name", "introduction", "description", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Details;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Ljt/b$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getIntroduction", "getIntroduction$annotations", "c", "getDescription", "getDescription$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Details implements C11768b<b.a> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96185a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96186b;

        /* renamed from: c  reason: collision with root package name */
        private final String f96187c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Details$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Details;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Details> serializer() {
                return StoreEventRemote$Details$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Details(int i10, String str, String str2, String str3, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, StoreEventRemote$Details$$serializer.INSTANCE.getDescriptor());
            }
            this.f96185a = str;
            this.f96186b = str2;
            this.f96187c = str3;
        }

        public static final /* synthetic */ void b(Details details, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, details.f96185a);
            dVar.B(serialDescriptor, 1, y02, details.f96186b);
            dVar.B(serialDescriptor, 2, y02, details.f96187c);
        }

        public b.a a() {
            String str = this.f96185a;
            if (str != null) {
                String str2 = this.f96186b;
                if (str2 != null) {
                    String str3 = this.f96187c;
                    if (str3 != null) {
                        return new b.a(str, str2, str3);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Details)) {
                return false;
            }
            Details details = (Details) obj;
            return C17542s.e(this.f96185a, details.f96185a) && C17542s.e(this.f96186b, details.f96186b) && C17542s.e(this.f96187c, details.f96187c);
        }

        public int hashCode() {
            String str = this.f96185a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f96186b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f96187c;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f96185a;
            String str2 = this.f96186b;
            String str3 = this.f96187c;
            return "Details(name=" + str + ", introduction=" + str2 + ", description=" + str3 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000  2\u00020\u0001:\u0003!\"\u001bB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u001d¨\u0006#"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote;", "", "", "seen0", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote$StoreRemote;", "store", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote$StoreRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote$StoreRemote;", "()Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote$StoreRemote;", "getStore$annotations", "()V", "Companion", "StoreRemote", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocationRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final StoreRemote f96188a;

        @p
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001aB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote$StoreRemote;", "", "", "seen0", "", "storeName", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote$StoreRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStoreName$annotations", "()V", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class StoreRemote {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f96189a;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote$StoreRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote$StoreRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<StoreRemote> serializer() {
                    return StoreEventRemote$LocationRemote$StoreRemote$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ StoreRemote(int i10, String str, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, StoreEventRemote$LocationRemote$StoreRemote$$serializer.INSTANCE.getDescriptor());
                }
                this.f96189a = str;
            }

            public final String a() {
                return this.f96189a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StoreRemote) && C17542s.e(this.f96189a, ((StoreRemote) obj).f96189a);
            }

            public int hashCode() {
                String str = this.f96189a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.f96189a;
                return "StoreRemote(storeName=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$LocationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<LocationRemote> serializer() {
                return StoreEventRemote$LocationRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ LocationRemote(int i10, StoreRemote storeRemote, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, StoreEventRemote$LocationRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96188a = storeRemote;
        }

        public final StoreRemote a() {
            return this.f96188a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationRemote) && C17542s.e(this.f96188a, ((LocationRemote) obj).f96188a);
        }

        public int hashCode() {
            StoreRemote storeRemote = this.f96188a;
            if (storeRemote == null) {
                return 0;
            }
            return storeRemote.hashCode();
        }

        public String toString() {
            StoreRemote storeRemote = this.f96188a;
            return "LocationRemote(store=" + storeRemote + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 $2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002%\u0013B%\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Price;", "Lpp/b;", "Ljt/b$c;", "", "seen0", "", "amount", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Price;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Ljt/b$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getAmount", "()Ljava/lang/Double;", "getAmount$annotations", "()V", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Price implements C11768b<b.c> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Double f96190a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Price$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$Price;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Price> serializer() {
                return StoreEventRemote$Price$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Price(int i10, Double d10, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, StoreEventRemote$Price$$serializer.INSTANCE.getDescriptor());
            }
            this.f96190a = d10;
        }

        public b.c a() {
            Double d10 = this.f96190a;
            if (d10 == null) {
                return null;
            }
            if (d10.doubleValue() <= 0.0d) {
                d10 = null;
            }
            if (d10 != null) {
                return new b.c(d10.doubleValue());
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Price) && C17542s.e(this.f96190a, ((Price) obj).f96190a);
        }

        public int hashCode() {
            Double d10 = this.f96190a;
            if (d10 == null) {
                return 0;
            }
            return d10.hashCode();
        }

        public String toString() {
            Double d10 = this.f96190a;
            return "Price(amount=" + d10 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\b\u0018\u0000 ?2\u00020\u0001:\u0003@A$Bq\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010%\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00106\u0012\u0004\b9\u0010)\u001a\u0004\b7\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010:\u0012\u0004\b<\u0010)\u001a\u0004\b1\u0010;R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010:\u0012\u0004\b=\u0010)\u001a\u0004\b-\u0010;R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010%\u0012\u0004\b>\u0010)\u001a\u0004\b*\u0010'¨\u0006B"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings;", "", "", "seen0", "", "waitingListEnabled", "registrationRequired", "", "registrationStarts", "", "registrationCloseTime", "", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings$Reminder;", "reminders", "participantsPerRegistration", "childrenPerRegistration", "childrenIncludedInCount", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "j", "(Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "getWaitingListEnabled$annotations", "()V", "b", "f", "getRegistrationRequired$annotations", "c", "Ljava/lang/String;", "g", "getRegistrationStarts$annotations", "d", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "getRegistrationCloseTime$annotations", "Ljava/util/List;", "h", "()Ljava/util/List;", "getReminders$annotations", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getParticipantsPerRegistration$annotations", "getChildrenPerRegistration$annotations", "getChildrenIncludedInCount$annotations", "Companion", "Reminder", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RegistrationSettings {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public static final KSerializer<Object>[] f96191i = {null, null, null, null, new C17451f(StoreEventRemote$RegistrationSettings$Reminder$$serializer.INSTANCE), null, null, null};

        /* renamed from: a  reason: collision with root package name */
        private final Boolean f96192a;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f96193b;

        /* renamed from: c  reason: collision with root package name */
        private final String f96194c;

        /* renamed from: d  reason: collision with root package name */
        private final Long f96195d;

        /* renamed from: e  reason: collision with root package name */
        private final List<Reminder> f96196e;

        /* renamed from: f  reason: collision with root package name */
        private final Integer f96197f;

        /* renamed from: g  reason: collision with root package name */
        private final Integer f96198g;

        /* renamed from: h  reason: collision with root package name */
        private final Boolean f96199h;

        @p
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001aB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings$Reminder;", "", "", "seen0", "", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings$Reminder;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType$annotations", "()V", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Reminder {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f96200a;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings$Reminder$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings$Reminder;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<Reminder> serializer() {
                    return StoreEventRemote$RegistrationSettings$Reminder$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Reminder(int i10, String str, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, StoreEventRemote$RegistrationSettings$Reminder$$serializer.INSTANCE.getDescriptor());
                }
                this.f96200a = str;
            }

            public final String a() {
                return this.f96200a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Reminder) && C17542s.e(this.f96200a, ((Reminder) obj).f96200a);
            }

            public int hashCode() {
                return this.f96200a.hashCode();
            }

            public String toString() {
                String str = this.f96200a;
                return "Reminder(type=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$RegistrationSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<RegistrationSettings> serializer() {
                return StoreEventRemote$RegistrationSettings$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ RegistrationSettings(int i10, Boolean bool, Boolean bool2, String str, Long l10, List list, Integer num, Integer num2, Boolean bool3, T0 t02) {
            if (255 != (i10 & 255)) {
                E0.b(i10, 255, StoreEventRemote$RegistrationSettings$$serializer.INSTANCE.getDescriptor());
            }
            this.f96192a = bool;
            this.f96193b = bool2;
            this.f96194c = str;
            this.f96195d = l10;
            this.f96196e = list;
            this.f96197f = num;
            this.f96198g = num2;
            this.f96199h = bool3;
        }

        public static final /* synthetic */ void j(RegistrationSettings registrationSettings, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f96191i;
            C17457i iVar = C17457i.f144111a;
            dVar.B(serialDescriptor, 0, iVar, registrationSettings.f96192a);
            dVar.B(serialDescriptor, 1, iVar, registrationSettings.f96193b);
            dVar.B(serialDescriptor, 2, Y0.f144077a, registrationSettings.f96194c);
            dVar.B(serialDescriptor, 3, C17458i0.f144113a, registrationSettings.f96195d);
            dVar.i(serialDescriptor, 4, kSerializerArr[4], registrationSettings.f96196e);
            X x10 = X.f144073a;
            dVar.B(serialDescriptor, 5, x10, registrationSettings.f96197f);
            dVar.B(serialDescriptor, 6, x10, registrationSettings.f96198g);
            dVar.B(serialDescriptor, 7, iVar, registrationSettings.f96199h);
        }

        public final Boolean b() {
            return this.f96199h;
        }

        public final Integer c() {
            return this.f96198g;
        }

        public final Integer d() {
            return this.f96197f;
        }

        public final Long e() {
            return this.f96195d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationSettings)) {
                return false;
            }
            RegistrationSettings registrationSettings = (RegistrationSettings) obj;
            return C17542s.e(this.f96192a, registrationSettings.f96192a) && C17542s.e(this.f96193b, registrationSettings.f96193b) && C17542s.e(this.f96194c, registrationSettings.f96194c) && C17542s.e(this.f96195d, registrationSettings.f96195d) && C17542s.e(this.f96196e, registrationSettings.f96196e) && C17542s.e(this.f96197f, registrationSettings.f96197f) && C17542s.e(this.f96198g, registrationSettings.f96198g) && C17542s.e(this.f96199h, registrationSettings.f96199h);
        }

        public final Boolean f() {
            return this.f96193b;
        }

        public final String g() {
            return this.f96194c;
        }

        public final List<Reminder> h() {
            return this.f96196e;
        }

        public int hashCode() {
            Boolean bool = this.f96192a;
            int i10 = 0;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.f96193b;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.f96194c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l10 = this.f96195d;
            int hashCode4 = (((hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31) + this.f96196e.hashCode()) * 31;
            Integer num = this.f96197f;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f96198g;
            int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool3 = this.f96199h;
            if (bool3 != null) {
                i10 = bool3.hashCode();
            }
            return hashCode6 + i10;
        }

        public final Boolean i() {
            return this.f96192a;
        }

        public String toString() {
            Boolean bool = this.f96192a;
            Boolean bool2 = this.f96193b;
            String str = this.f96194c;
            Long l10 = this.f96195d;
            List<Reminder> list = this.f96196e;
            Integer num = this.f96197f;
            Integer num2 = this.f96198g;
            Boolean bool3 = this.f96199h;
            return "RegistrationSettings(waitingListEnabled=" + bool + ", registrationRequired=" + bool2 + ", registrationStarts=" + str + ", registrationCloseTime=" + l10 + ", reminders=" + list + ", participantsPerRegistration=" + num + ", childrenPerRegistration=" + num2 + ", childrenIncludedInCount=" + bool3 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\b\b\u0018\u0000 K2\u00020\u0001:\u0003LM\u0019Bk\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010*R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u00100\u0012\u0004\b5\u00103\u001a\u0004\b4\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u00100\u0012\u0004\b7\u00103\u001a\u0004\b6\u0010*R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u00108\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010:R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u00108\u0012\u0004\b=\u00103\u001a\u0004\b<\u0010:R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u00103\u001a\u0004\b@\u0010AR\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u00100\u0012\u0004\bE\u00103\u001a\u0004\bD\u0010*R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u00103\u001a\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot;", "", "", "seen0", "", "id", "startDate", "endDate", "currentRegistrationCount", "currentWaitingListCount", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot$RegistrationSettings;", "registrationSettings", "visibilityState", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "registration", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot$RegistrationSettings;Ljava/lang/String;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;LjK/T0;)V", "", "isWaitingListEnabledForEvent", "Ljt/b$f$a;", "b", "(Z)Ljt/b$f$a;", "maxWaitingListCount", "a", "(IIZ)Z", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "isRegistrationRequiredForEvent", "Ljt/b$f;", "d", "(ZZ)Ljt/b$f;", "c", "(ZZ)Ljt/b$f$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getStartDate", "getStartDate$annotations", "getEndDate", "getEndDate$annotations", "Ljava/lang/Integer;", "getCurrentRegistrationCount", "()Ljava/lang/Integer;", "getCurrentRegistrationCount$annotations", "getCurrentWaitingListCount", "getCurrentWaitingListCount$annotations", "f", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot$RegistrationSettings;", "getRegistrationSettings", "()Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot$RegistrationSettings;", "getRegistrationSettings$annotations", "g", "getVisibilityState", "getVisibilityState$annotations", "h", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "getRegistration", "()Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "getRegistration$annotations", "Companion", "RegistrationSettings", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TimeSlot {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96201a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96202b;

        /* renamed from: c  reason: collision with root package name */
        private final String f96203c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f96204d;

        /* renamed from: e  reason: collision with root package name */
        private final Integer f96205e;

        /* renamed from: f  reason: collision with root package name */
        private final RegistrationSettings f96206f;

        /* renamed from: g  reason: collision with root package name */
        private final String f96207g;

        /* renamed from: h  reason: collision with root package name */
        private final RegistrationRemote f96208h;

        @p
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 \"2\u00020\u0001:\u0002#\u001bB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u001d¨\u0006$"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot$RegistrationSettings;", "", "", "seen0", "maxRegistrationCount", "maxWaitingListCount", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot$RegistrationSettings;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getMaxRegistrationCount$annotations", "()V", "b", "getMaxWaitingListCount$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RegistrationSettings {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final Integer f96209a;

            /* renamed from: b  reason: collision with root package name */
            private final Integer f96210b;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot$RegistrationSettings$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot$RegistrationSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<RegistrationSettings> serializer() {
                    return StoreEventRemote$TimeSlot$RegistrationSettings$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ RegistrationSettings(int i10, Integer num, Integer num2, T0 t02) {
                if (3 != (i10 & 3)) {
                    E0.b(i10, 3, StoreEventRemote$TimeSlot$RegistrationSettings$$serializer.INSTANCE.getDescriptor());
                }
                this.f96209a = num;
                this.f96210b = num2;
            }

            public static final /* synthetic */ void c(RegistrationSettings registrationSettings, C17395d dVar, SerialDescriptor serialDescriptor) {
                X x10 = X.f144073a;
                dVar.B(serialDescriptor, 0, x10, registrationSettings.f96209a);
                dVar.B(serialDescriptor, 1, x10, registrationSettings.f96210b);
            }

            public final Integer a() {
                return this.f96209a;
            }

            public final Integer b() {
                return this.f96210b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RegistrationSettings)) {
                    return false;
                }
                RegistrationSettings registrationSettings = (RegistrationSettings) obj;
                return C17542s.e(this.f96209a, registrationSettings.f96209a) && C17542s.e(this.f96210b, registrationSettings.f96210b);
            }

            public int hashCode() {
                Integer num = this.f96209a;
                int i10 = 0;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f96210b;
                if (num2 != null) {
                    i10 = num2.hashCode();
                }
                return hashCode + i10;
            }

            public String toString() {
                Integer num = this.f96209a;
                Integer num2 = this.f96210b;
                return "RegistrationSettings(maxRegistrationCount=" + num + ", maxWaitingListCount=" + num2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<TimeSlot> serializer() {
                return StoreEventRemote$TimeSlot$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f96211a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$d[] r0 = com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote.d.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$d r1 = com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote.d.Registered     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$d r1 = com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote.d.WaitingList     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$d r1 = com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote.d.Cancelled     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f96211a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.TimeSlot.b.<clinit>():void");
            }
        }

        public /* synthetic */ TimeSlot(int i10, String str, String str2, String str3, Integer num, Integer num2, RegistrationSettings registrationSettings, String str4, RegistrationRemote registrationRemote, T0 t02) {
            if (255 != (i10 & 255)) {
                E0.b(i10, 255, StoreEventRemote$TimeSlot$$serializer.INSTANCE.getDescriptor());
            }
            this.f96201a = str;
            this.f96202b = str2;
            this.f96203c = str3;
            this.f96204d = num;
            this.f96205e = num2;
            this.f96206f = registrationSettings;
            this.f96207g = str4;
            this.f96208h = registrationRemote;
        }

        private final boolean a(int i10, int i11, boolean z10) {
            return z10 && i10 < i11;
        }

        private final b.f.a b(boolean z10) {
            Integer b10;
            Integer a10;
            Integer num = this.f96204d;
            int i10 = 0;
            int intValue = num != null ? num.intValue() : 0;
            RegistrationSettings registrationSettings = this.f96206f;
            int intValue2 = (registrationSettings == null || (a10 = registrationSettings.a()) == null) ? 0 : a10.intValue();
            Integer num2 = this.f96205e;
            int intValue3 = num2 != null ? num2.intValue() : 0;
            RegistrationSettings registrationSettings2 = this.f96206f;
            if (!(registrationSettings2 == null || (b10 = registrationSettings2.b()) == null)) {
                i10 = b10.intValue();
            }
            return intValue2 == 0 ? new b.f.a.C2236f(b.f.a.C2236f.C2237a.C2239b.f98753a) : intValue < intValue2 ? new b.f.a.C2236f(new b.f.a.C2236f.C2237a.C2238a(intValue2 - intValue)) : a(intValue3, i10, z10) ? b.f.a.g.f98754a : b.f.a.C2235b.f98747a;
        }

        public static final /* synthetic */ void e(TimeSlot timeSlot, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, timeSlot.f96201a);
            dVar.B(serialDescriptor, 1, y02, timeSlot.f96202b);
            dVar.B(serialDescriptor, 2, y02, timeSlot.f96203c);
            X x10 = X.f144073a;
            dVar.B(serialDescriptor, 3, x10, timeSlot.f96204d);
            dVar.B(serialDescriptor, 4, x10, timeSlot.f96205e);
            dVar.B(serialDescriptor, 5, StoreEventRemote$TimeSlot$RegistrationSettings$$serializer.INSTANCE, timeSlot.f96206f);
            dVar.B(serialDescriptor, 6, y02, timeSlot.f96207g);
            dVar.B(serialDescriptor, 7, RegistrationRemote$$serializer.INSTANCE, timeSlot.f96208h);
        }

        public final b.f.a c(boolean z10, boolean z11) {
            RegistrationRemote registrationRemote = this.f96208h;
            RegistrationRemote.d b10 = a.b(registrationRemote != null ? registrationRemote.b() : null);
            if (!z10) {
                return b.f.a.c.f98748a;
            }
            if (b10 == null) {
                return b(z11);
            }
            int i10 = b.f96211a[b10.ordinal()];
            if (i10 == 1) {
                return b.f.a.e.f98750a;
            }
            if (i10 == 2) {
                return b.f.a.d.f98749a;
            }
            if (i10 == 3) {
                return b(z11);
            }
            throw new t();
        }

        public final b.f d(boolean z10, boolean z11) {
            b.g d10 = a.d(this.f96207g);
            if (d10 == null) {
                return null;
            }
            String str = this.f96201a;
            if (str != null) {
                LocalDateTime parse = LocalDateTime.parse(this.f96202b);
                C17542s.i(parse, "parse(...)");
                LocalDateTime parse2 = LocalDateTime.parse(this.f96203c);
                C17542s.i(parse2, "parse(...)");
                LocalDateTime parse3 = LocalDateTime.parse(this.f96202b);
                C17542s.i(parse3, "parse(...)");
                return new b.f(str, parse, parse2, c(z10, z11), d10, parse3);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeSlot)) {
                return false;
            }
            TimeSlot timeSlot = (TimeSlot) obj;
            return C17542s.e(this.f96201a, timeSlot.f96201a) && C17542s.e(this.f96202b, timeSlot.f96202b) && C17542s.e(this.f96203c, timeSlot.f96203c) && C17542s.e(this.f96204d, timeSlot.f96204d) && C17542s.e(this.f96205e, timeSlot.f96205e) && C17542s.e(this.f96206f, timeSlot.f96206f) && C17542s.e(this.f96207g, timeSlot.f96207g) && C17542s.e(this.f96208h, timeSlot.f96208h);
        }

        public int hashCode() {
            String str = this.f96201a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f96202b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f96203c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.f96204d;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f96205e;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            RegistrationSettings registrationSettings = this.f96206f;
            int hashCode6 = (hashCode5 + (registrationSettings == null ? 0 : registrationSettings.hashCode())) * 31;
            String str4 = this.f96207g;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            RegistrationRemote registrationRemote = this.f96208h;
            if (registrationRemote != null) {
                i10 = registrationRemote.hashCode();
            }
            return hashCode7 + i10;
        }

        public String toString() {
            String str = this.f96201a;
            String str2 = this.f96202b;
            String str3 = this.f96203c;
            Integer num = this.f96204d;
            Integer num2 = this.f96205e;
            RegistrationSettings registrationSettings = this.f96206f;
            String str4 = this.f96207g;
            RegistrationRemote registrationRemote = this.f96208h;
            return "TimeSlot(id=" + str + ", startDate=" + str2 + ", endDate=" + str3 + ", currentRegistrationCount=" + num + ", currentWaitingListCount=" + num2 + ", registrationSettings=" + registrationSettings + ", visibilityState=" + str4 + ", registration=" + registrationRemote + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StoreEventRemote> serializer() {
            return StoreEventRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StoreEventRemote(int i10, String str, String str2, Price price, String str3, Details details, List list, RegistrationSettings registrationSettings, LocationRemote locationRemote, T0 t02) {
        if (255 != (i10 & 255)) {
            E0.b(i10, 255, StoreEventRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96177a = str;
        this.f96178b = str2;
        this.f96179c = price;
        this.f96180d = str3;
        this.f96181e = details;
        this.f96182f = list;
        this.f96183g = registrationSettings;
        this.f96184h = locationRemote;
    }

    /* access modifiers changed from: private */
    public static final b.f e(b.d dVar, TimeSlot timeSlot) {
        C17542s.j(timeSlot, "it");
        return timeSlot.d(dVar.d(), dVar.g());
    }

    /* access modifiers changed from: private */
    public static final b.f f(N n10, b.f fVar) {
        C17542s.j(fVar, "timeSlot");
        LocalDateTime minusSeconds = fVar.f().minusSeconds(n10.f144347a);
        C17542s.i(minusSeconds, "minusSeconds(...)");
        return b.f.b(fVar, (String) null, (LocalDateTime) null, (LocalDateTime) null, (b.f.a) null, (b.g) null, minusSeconds, 31, (Object) null);
    }

    public static final /* synthetic */ void g(StoreEventRemote storeEventRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f96176i;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, storeEventRemote.f96177a);
        dVar.B(serialDescriptor, 1, y02, storeEventRemote.f96178b);
        dVar.B(serialDescriptor, 2, StoreEventRemote$Price$$serializer.INSTANCE, storeEventRemote.f96179c);
        dVar.B(serialDescriptor, 3, y02, storeEventRemote.f96180d);
        dVar.B(serialDescriptor, 4, StoreEventRemote$Details$$serializer.INSTANCE, storeEventRemote.f96181e);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], storeEventRemote.f96182f);
        dVar.B(serialDescriptor, 6, StoreEventRemote$RegistrationSettings$$serializer.INSTANCE, storeEventRemote.f96183g);
        dVar.B(serialDescriptor, 7, StoreEventRemote$LocationRemote$$serializer.INSTANCE, storeEventRemote.f96184h);
    }

    public b d() {
        LocationRemote.StoreRemote a10;
        N n10 = new N();
        RegistrationSettings registrationSettings = this.f96183g;
        if (registrationSettings != null) {
            Long e10 = registrationSettings.e();
            n10.f144347a = e10 != null ? e10.longValue() : 0;
            Boolean i10 = registrationSettings.i();
            boolean z10 = false;
            boolean booleanValue = i10 != null ? i10.booleanValue() : false;
            Boolean f10 = registrationSettings.f();
            boolean booleanValue2 = f10 != null ? f10.booleanValue() : false;
            String g10 = registrationSettings.g();
            b.a aVar = null;
            LocalDateTime parse = g10 != null ? LocalDateTime.parse(g10) : null;
            ArrayList arrayList = new ArrayList();
            for (RegistrationSettings.Reminder a11 : registrationSettings.h()) {
                b.e c10 = a.c(a11.a());
                if (c10 != null) {
                    arrayList.add(c10);
                }
            }
            Integer d10 = registrationSettings.d();
            int intValue = d10 != null ? d10.intValue() : 0;
            Integer c11 = registrationSettings.c();
            int intValue2 = c11 != null ? c11.intValue() : 0;
            Boolean b10 = registrationSettings.b();
            if (b10 != null) {
                z10 = b10.booleanValue();
            }
            b.d dVar = new b.d(booleanValue, booleanValue2, parse, arrayList, intValue, intValue2, z10);
            List<TimeSlot> list = this.f96182f;
            if (list == null) {
                list = C16877v.n();
            }
            List a02 = C15768k.a0(C15768k.S(C15768k.T(C16877v.h0(list), new c(dVar)), new d(n10)));
            String str = this.f96177a;
            if (str != null) {
                LocationRemote locationRemote = this.f96184h;
                String a12 = (locationRemote == null || (a10 = locationRemote.a()) == null) ? null : a10.a();
                if (a12 != null) {
                    String str2 = this.f96178b;
                    Price price = this.f96179c;
                    b.c a13 = price != null ? price.a() : null;
                    b.C2233b a14 = a.a(this.f96180d);
                    Details details = this.f96181e;
                    if (details != null) {
                        aVar = details.a();
                    }
                    b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        return new b(str, a12, str2, a13, a14, aVar2, a02, dVar);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreEventRemote)) {
            return false;
        }
        StoreEventRemote storeEventRemote = (StoreEventRemote) obj;
        return C17542s.e(this.f96177a, storeEventRemote.f96177a) && C17542s.e(this.f96178b, storeEventRemote.f96178b) && C17542s.e(this.f96179c, storeEventRemote.f96179c) && C17542s.e(this.f96180d, storeEventRemote.f96180d) && C17542s.e(this.f96181e, storeEventRemote.f96181e) && C17542s.e(this.f96182f, storeEventRemote.f96182f) && C17542s.e(this.f96183g, storeEventRemote.f96183g) && C17542s.e(this.f96184h, storeEventRemote.f96184h);
    }

    public int hashCode() {
        String str = this.f96177a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f96178b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Price price = this.f96179c;
        int hashCode3 = (hashCode2 + (price == null ? 0 : price.hashCode())) * 31;
        String str3 = this.f96180d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Details details = this.f96181e;
        int hashCode5 = (hashCode4 + (details == null ? 0 : details.hashCode())) * 31;
        List<TimeSlot> list = this.f96182f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        RegistrationSettings registrationSettings = this.f96183g;
        int hashCode7 = (hashCode6 + (registrationSettings == null ? 0 : registrationSettings.hashCode())) * 31;
        LocationRemote locationRemote = this.f96184h;
        if (locationRemote != null) {
            i10 = locationRemote.hashCode();
        }
        return hashCode7 + i10;
    }

    public String toString() {
        String str = this.f96177a;
        String str2 = this.f96178b;
        Price price = this.f96179c;
        String str3 = this.f96180d;
        Details details = this.f96181e;
        List<TimeSlot> list = this.f96182f;
        RegistrationSettings registrationSettings = this.f96183g;
        LocationRemote locationRemote = this.f96184h;
        return "StoreEventRemote(id=" + str + ", eventImagePath=" + str2 + ", price=" + price + ", loyaltyEvent=" + str3 + ", details=" + details + ", timeSlots=" + list + ", registrationSettings=" + registrationSettings + ", location=" + locationRemote + ")";
    }
}
