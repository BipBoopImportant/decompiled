package com.ingka.ikea.instore.impl.foodmobile.model;

import MD.C13204a;
import fK.p;
import iK.C17395d;
import jK.C17458i0;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/instore/impl/foodmobile/model/CookieDataToApp;", "", "", "orderId", "", "expireDuration", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "Remote", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CookieDataToApp {

    /* renamed from: a  reason: collision with root package name */
    private final String f96219a;

    /* renamed from: b  reason: collision with root package name */
    private final long f96220b;

    @p
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002* B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/ingka/ikea/instore/impl/foodmobile/model/CookieDataToApp$Remote;", "LMD/a;", "Lcom/ingka/ikea/instore/impl/foodmobile/model/CookieDataToApp;", "", "seen0", "", "orderId", "", "expireDuration", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Long;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/instore/impl/foodmobile/model/CookieDataToApp$Remote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lcom/ingka/ikea/instore/impl/foodmobile/model/CookieDataToApp;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOrderId", "getOrderId$annotations", "()V", "Ljava/lang/Long;", "getExpireDuration", "()Ljava/lang/Long;", "getExpireDuration$annotations", "Companion", "$serializer", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Remote implements C13204a<CookieDataToApp> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96222a;

        /* renamed from: b  reason: collision with root package name */
        private final Long f96223b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/impl/foodmobile/model/CookieDataToApp$Remote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/impl/foodmobile/model/CookieDataToApp$Remote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Remote> serializer() {
                return CookieDataToApp$Remote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Remote(int i10, String str, Long l10, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, CookieDataToApp$Remote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96222a = str;
            this.f96223b = l10;
        }

        public static final /* synthetic */ void c(Remote remote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, remote.f96222a);
            dVar.B(serialDescriptor, 1, C17458i0.f144113a, remote.f96223b);
        }

        /* renamed from: b */
        public CookieDataToApp a() {
            String str = this.f96222a;
            if (str != null) {
                Long l10 = this.f96223b;
                if (l10 != null) {
                    return new CookieDataToApp(str, l10.longValue());
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) obj;
            return C17542s.e(this.f96222a, remote.f96222a) && C17542s.e(this.f96223b, remote.f96223b);
        }

        public int hashCode() {
            String str = this.f96222a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l10 = this.f96223b;
            if (l10 != null) {
                i10 = l10.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f96222a;
            Long l10 = this.f96223b;
            return "Remote(orderId=" + str + ", expireDuration=" + l10 + ")";
        }
    }

    public CookieDataToApp(String str, long j10) {
        C17542s.j(str, "orderId");
        this.f96219a = str;
        this.f96220b = j10;
    }

    public final long a() {
        return this.f96220b;
    }

    public final String b() {
        return this.f96219a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CookieDataToApp)) {
            return false;
        }
        CookieDataToApp cookieDataToApp = (CookieDataToApp) obj;
        return C17542s.e(this.f96219a, cookieDataToApp.f96219a) && this.f96220b == cookieDataToApp.f96220b;
    }

    public int hashCode() {
        return (this.f96219a.hashCode() * 31) + Long.hashCode(this.f96220b);
    }

    public String toString() {
        String str = this.f96219a;
        long j10 = this.f96220b;
        return "CookieDataToApp(orderId=" + str + ", expireDuration=" + j10 + ")";
    }
}
