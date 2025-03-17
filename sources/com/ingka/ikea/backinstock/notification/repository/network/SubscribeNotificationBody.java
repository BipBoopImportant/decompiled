package com.ingka.ikea.backinstock.notification.repository.network;

import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b-\b\b\u0018\u0000 J2\u00020\u0001:\bKLMNOPQ(BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u0010-\u001a\u0004\b4\u00105R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010:R \u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010-\u001a\u0004\b>\u0010?R \u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010-\u001a\u0004\bC\u0010DR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bI\u0010-\u001a\u0004\bH\u0010!¨\u0006R"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody;", "", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;", "cashCarry", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;", "homeDelivery", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Contact;", "contact", "", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$ItemKey;", "itemKeys", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Locale;", "locale", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent;", "consent", "", "token", "<init>", "(Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Contact;Ljava/util/List;Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Locale;Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Contact;Ljava/util/List;Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Locale;Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;", "getCashCarry", "()Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;", "getCashCarry$annotations", "()V", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;", "getHomeDelivery", "()Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;", "getHomeDelivery$annotations", "c", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Contact;", "getContact", "()Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Contact;", "getContact$annotations", "d", "Ljava/util/List;", "getItemKeys", "()Ljava/util/List;", "getItemKeys$annotations", "e", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Locale;", "getLocale", "()Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Locale;", "getLocale$annotations", "f", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent;", "getConsent", "()Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent;", "getConsent$annotations", "g", "Ljava/lang/String;", "getToken", "getToken$annotations", "Companion", "CashCarry", "HomeDelivery", "Contact", "ItemKey", "Locale", "Consent", "$serializer", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SubscribeNotificationBody {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f93098h = 8;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f93099i = {null, null, null, new C17451f(SubscribeNotificationBody$ItemKey$$serializer.INSTANCE), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final CashCarry f93100a;

    /* renamed from: b  reason: collision with root package name */
    private final HomeDelivery f93101b;

    /* renamed from: c  reason: collision with root package name */
    private final Contact f93102c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ItemKey> f93103d;

    /* renamed from: e  reason: collision with root package name */
    private final Locale f93104e;

    /* renamed from: f  reason: collision with root package name */
    private final Consent f93105f;

    /* renamed from: g  reason: collision with root package name */
    private final String f93106g;

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;", "", "", "classUnitCode", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClassUnitCode", "getClassUnitCode$annotations", "()V", "Companion", "$serializer", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CashCarry {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93114a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$CashCarry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<CashCarry> serializer() {
                return SubscribeNotificationBody$CashCarry$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CashCarry(int i10, String str, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, SubscribeNotificationBody$CashCarry$$serializer.INSTANCE.getDescriptor());
            }
            this.f93114a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CashCarry) && C17542s.e(this.f93114a, ((CashCarry) obj).f93114a);
        }

        public int hashCode() {
            return this.f93114a.hashCode();
        }

        public String toString() {
            String str = this.f93114a;
            return "CashCarry(classUnitCode=" + str + ")";
        }

        public CashCarry(String str) {
            C17542s.j(str, "classUnitCode");
            this.f93114a = str;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001c\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u001e¨\u0006&"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent;", "", "", "notification", "marketing", "<init>", "(ZZ)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(IZZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getNotification", "()Z", "getNotification$annotations", "()V", "b", "getMarketing", "getMarketing$annotations", "Companion", "$serializer", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Consent {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f93115a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f93116b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Consent> serializer() {
                return SubscribeNotificationBody$Consent$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Consent(int i10, boolean z10, boolean z11, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, SubscribeNotificationBody$Consent$$serializer.INSTANCE.getDescriptor());
            }
            this.f93115a = z10;
            this.f93116b = z11;
        }

        public static final /* synthetic */ void a(Consent consent, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.x(serialDescriptor, 0, consent.f93115a);
            dVar.x(serialDescriptor, 1, consent.f93116b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Consent)) {
                return false;
            }
            Consent consent = (Consent) obj;
            return this.f93115a == consent.f93115a && this.f93116b == consent.f93116b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f93115a) * 31) + Boolean.hashCode(this.f93116b);
        }

        public String toString() {
            boolean z10 = this.f93115a;
            boolean z11 = this.f93116b;
            return "Consent(notification=" + z10 + ", marketing=" + z11 + ")";
        }

        public Consent(boolean z10, boolean z11) {
            this.f93115a = z10;
            this.f93116b = z11;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Contact;", "", "", "type", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Contact;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "b", "getValue", "getValue$annotations", "Companion", "$serializer", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Contact {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93117a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93118b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Contact$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Contact;", "serializer", "()Lkotlinx/serialization/KSerializer;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Contact> serializer() {
                return SubscribeNotificationBody$Contact$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Contact(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, SubscribeNotificationBody$Contact$$serializer.INSTANCE.getDescriptor());
            }
            this.f93117a = str;
            this.f93118b = str2;
        }

        public static final /* synthetic */ void a(Contact contact, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, contact.f93117a);
            dVar.y(serialDescriptor, 1, contact.f93118b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Contact)) {
                return false;
            }
            Contact contact = (Contact) obj;
            return C17542s.e(this.f93117a, contact.f93117a) && C17542s.e(this.f93118b, contact.f93118b);
        }

        public int hashCode() {
            return (this.f93117a.hashCode() * 31) + this.f93118b.hashCode();
        }

        public String toString() {
            String str = this.f93117a;
            String str2 = this.f93118b;
            return "Contact(type=" + str + ", value=" + str2 + ")";
        }

        public Contact(String str, String str2) {
            C17542s.j(str, "type");
            C17542s.j(str2, "value");
            this.f93117a = str;
            this.f93118b = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;", "", "", "zipCode", "areaCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getZipCode", "getZipCode$annotations", "()V", "b", "getAreaCode", "getAreaCode$annotations", "Companion", "$serializer", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HomeDelivery {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93119a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93120b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$HomeDelivery;", "serializer", "()Lkotlinx/serialization/KSerializer;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<HomeDelivery> serializer() {
                return SubscribeNotificationBody$HomeDelivery$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ HomeDelivery(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, SubscribeNotificationBody$HomeDelivery$$serializer.INSTANCE.getDescriptor());
            }
            this.f93119a = str;
            this.f93120b = str2;
        }

        public static final /* synthetic */ void a(HomeDelivery homeDelivery, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, homeDelivery.f93119a);
            dVar.B(serialDescriptor, 1, Y0.f144077a, homeDelivery.f93120b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomeDelivery)) {
                return false;
            }
            HomeDelivery homeDelivery = (HomeDelivery) obj;
            return C17542s.e(this.f93119a, homeDelivery.f93119a) && C17542s.e(this.f93120b, homeDelivery.f93120b);
        }

        public int hashCode() {
            int hashCode = this.f93119a.hashCode() * 31;
            String str = this.f93120b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f93119a;
            String str2 = this.f93120b;
            return "HomeDelivery(zipCode=" + str + ", areaCode=" + str2 + ")";
        }

        public HomeDelivery(String str, String str2) {
            C17542s.j(str, "zipCode");
            this.f93119a = str;
            this.f93120b = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$ItemKey;", "", "", "itemNo", "itemType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$ItemKey;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemNo", "getItemNo$annotations", "()V", "b", "getItemType", "getItemType$annotations", "Companion", "$serializer", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ItemKey {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93121a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93122b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$ItemKey$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$ItemKey;", "serializer", "()Lkotlinx/serialization/KSerializer;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ItemKey> serializer() {
                return SubscribeNotificationBody$ItemKey$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ItemKey(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, SubscribeNotificationBody$ItemKey$$serializer.INSTANCE.getDescriptor());
            }
            this.f93121a = str;
            this.f93122b = str2;
        }

        public static final /* synthetic */ void a(ItemKey itemKey, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, itemKey.f93121a);
            dVar.y(serialDescriptor, 1, itemKey.f93122b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemKey)) {
                return false;
            }
            ItemKey itemKey = (ItemKey) obj;
            return C17542s.e(this.f93121a, itemKey.f93121a) && C17542s.e(this.f93122b, itemKey.f93122b);
        }

        public int hashCode() {
            return (this.f93121a.hashCode() * 31) + this.f93122b.hashCode();
        }

        public String toString() {
            String str = this.f93121a;
            String str2 = this.f93122b;
            return "ItemKey(itemNo=" + str + ", itemType=" + str2 + ")";
        }

        public ItemKey(String str, String str2) {
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "itemType");
            this.f93121a = str;
            this.f93122b = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Locale;", "", "", "countryCode", "languageCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Locale;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountryCode", "getCountryCode$annotations", "()V", "b", "getLanguageCode", "getLanguageCode$annotations", "Companion", "$serializer", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Locale {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93123a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93124b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Locale$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Locale;", "serializer", "()Lkotlinx/serialization/KSerializer;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Locale> serializer() {
                return SubscribeNotificationBody$Locale$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Locale(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, SubscribeNotificationBody$Locale$$serializer.INSTANCE.getDescriptor());
            }
            this.f93123a = str;
            this.f93124b = str2;
        }

        public static final /* synthetic */ void a(Locale locale, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, locale.f93123a);
            dVar.y(serialDescriptor, 1, locale.f93124b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Locale)) {
                return false;
            }
            Locale locale = (Locale) obj;
            return C17542s.e(this.f93123a, locale.f93123a) && C17542s.e(this.f93124b, locale.f93124b);
        }

        public int hashCode() {
            return (this.f93123a.hashCode() * 31) + this.f93124b.hashCode();
        }

        public String toString() {
            String str = this.f93123a;
            String str2 = this.f93124b;
            return "Locale(countryCode=" + str + ", languageCode=" + str2 + ")";
        }

        public Locale(String str, String str2) {
            C17542s.j(str, "countryCode");
            C17542s.j(str2, "languageCode");
            this.f93123a = str;
            this.f93124b = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<SubscribeNotificationBody> serializer() {
            return SubscribeNotificationBody$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SubscribeNotificationBody(int i10, CashCarry cashCarry, HomeDelivery homeDelivery, Contact contact, List list, Locale locale, Consent consent, String str, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, SubscribeNotificationBody$$serializer.INSTANCE.getDescriptor());
        }
        this.f93100a = cashCarry;
        this.f93101b = homeDelivery;
        this.f93102c = contact;
        this.f93103d = list;
        this.f93104e = locale;
        this.f93105f = consent;
        this.f93106g = str;
    }

    public static final /* synthetic */ void b(SubscribeNotificationBody subscribeNotificationBody, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93099i;
        dVar.B(serialDescriptor, 0, SubscribeNotificationBody$CashCarry$$serializer.INSTANCE, subscribeNotificationBody.f93100a);
        dVar.B(serialDescriptor, 1, SubscribeNotificationBody$HomeDelivery$$serializer.INSTANCE, subscribeNotificationBody.f93101b);
        dVar.B(serialDescriptor, 2, SubscribeNotificationBody$Contact$$serializer.INSTANCE, subscribeNotificationBody.f93102c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], subscribeNotificationBody.f93103d);
        dVar.i(serialDescriptor, 4, SubscribeNotificationBody$Locale$$serializer.INSTANCE, subscribeNotificationBody.f93104e);
        dVar.i(serialDescriptor, 5, SubscribeNotificationBody$Consent$$serializer.INSTANCE, subscribeNotificationBody.f93105f);
        dVar.y(serialDescriptor, 6, subscribeNotificationBody.f93106g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeNotificationBody)) {
            return false;
        }
        SubscribeNotificationBody subscribeNotificationBody = (SubscribeNotificationBody) obj;
        return C17542s.e(this.f93100a, subscribeNotificationBody.f93100a) && C17542s.e(this.f93101b, subscribeNotificationBody.f93101b) && C17542s.e(this.f93102c, subscribeNotificationBody.f93102c) && C17542s.e(this.f93103d, subscribeNotificationBody.f93103d) && C17542s.e(this.f93104e, subscribeNotificationBody.f93104e) && C17542s.e(this.f93105f, subscribeNotificationBody.f93105f) && C17542s.e(this.f93106g, subscribeNotificationBody.f93106g);
    }

    public int hashCode() {
        CashCarry cashCarry = this.f93100a;
        int i10 = 0;
        int hashCode = (cashCarry == null ? 0 : cashCarry.hashCode()) * 31;
        HomeDelivery homeDelivery = this.f93101b;
        int hashCode2 = (hashCode + (homeDelivery == null ? 0 : homeDelivery.hashCode())) * 31;
        Contact contact = this.f93102c;
        if (contact != null) {
            i10 = contact.hashCode();
        }
        return ((((((((hashCode2 + i10) * 31) + this.f93103d.hashCode()) * 31) + this.f93104e.hashCode()) * 31) + this.f93105f.hashCode()) * 31) + this.f93106g.hashCode();
    }

    public String toString() {
        CashCarry cashCarry = this.f93100a;
        HomeDelivery homeDelivery = this.f93101b;
        Contact contact = this.f93102c;
        List<ItemKey> list = this.f93103d;
        Locale locale = this.f93104e;
        Consent consent = this.f93105f;
        String str = this.f93106g;
        return "SubscribeNotificationBody(cashCarry=" + cashCarry + ", homeDelivery=" + homeDelivery + ", contact=" + contact + ", itemKeys=" + list + ", locale=" + locale + ", consent=" + consent + ", token=" + str + ")";
    }

    public SubscribeNotificationBody(CashCarry cashCarry, HomeDelivery homeDelivery, Contact contact, List<ItemKey> list, Locale locale, Consent consent, String str) {
        C17542s.j(list, "itemKeys");
        C17542s.j(locale, "locale");
        C17542s.j(consent, "consent");
        C17542s.j(str, "token");
        this.f93100a = cashCarry;
        this.f93101b = homeDelivery;
        this.f93102c = contact;
        this.f93103d = list;
        this.f93104e = locale;
        this.f93105f = consent;
        this.f93106g = str;
    }
}
