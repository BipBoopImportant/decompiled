package com.ingka.ikea.killswitch.model;

import HJ.C15854t;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17458i0;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 42\u00020\u0001:\u0003$5 BI\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010%\u0012\u0004\b*\u0010#\u001a\u0004\b)\u0010\u0019R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010#\u001a\u0004\b$\u0010-R\u0011\u00100\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b+\u0010/R\u0011\u00103\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b(\u00102¨\u00066"}, d2 = {"Lcom/ingka/ikea/killswitch/model/ConfigAlert;", "", "", "seen0", "", "lastUpdatedTimeRemote", "", "title", "message", "", "Lcom/ingka/ikea/killswitch/model/ButtonDetails;", "buttonDetails", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/killswitch/model/ConfigAlert;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "getLastUpdatedTimeRemote$annotations", "()V", "b", "Ljava/lang/String;", "f", "getTitle$annotations", "c", "e", "getMessage$annotations", "d", "Ljava/util/List;", "()Ljava/util/List;", "getButtonDetails$annotations", "()J", "lastUpdatedTime", "Lcom/ingka/ikea/killswitch/model/ConfigAlert$b;", "()Lcom/ingka/ikea/killswitch/model/ConfigAlert$b;", "configAlertType", "Companion", "$serializer", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfigAlert {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f96398e = {null, null, null, new C17451f(ButtonDetails$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final Long f96399a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96400b;

    /* renamed from: c  reason: collision with root package name */
    private final String f96401c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ButtonDetails> f96402d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/killswitch/model/ConfigAlert$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/killswitch/model/ConfigAlert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ConfigAlert> serializer() {
            return ConfigAlert$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/killswitch/model/ConfigAlert$b;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "PROMOTE_LOGIN", "GENERIC", "APP_STORE", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        PROMOTE_LOGIN,
        GENERIC,
        APP_STORE;
        
        public static final a Companion = null;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/killswitch/model/ConfigAlert$b$a;", "", "<init>", "()V", "", "link", "Lcom/ingka/ikea/killswitch/model/ConfigAlert$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/killswitch/model/ConfigAlert$b;", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String str) {
                return str == null ? b.GENERIC : C15854t.H("internal://profile", str, true) ? b.PROMOTE_LOGIN : C15854t.W(str, "market://details?id=", false, 2, (Object) null) ? b.APP_STORE : b.GENERIC;
            }

            private a() {
            }
        }

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ ConfigAlert(int i10, Long l10, String str, String str2, List list, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, ConfigAlert$$serializer.INSTANCE.getDescriptor());
        }
        this.f96399a = l10;
        this.f96400b = str;
        this.f96401c = str2;
        this.f96402d = list;
    }

    public static final /* synthetic */ void g(ConfigAlert configAlert, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f96398e;
        dVar.B(serialDescriptor, 0, C17458i0.f144113a, configAlert.f96399a);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 1, y02, configAlert.f96400b);
        dVar.B(serialDescriptor, 2, y02, configAlert.f96401c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], configAlert.f96402d);
    }

    public final List<ButtonDetails> b() {
        return this.f96402d;
    }

    public final b c() {
        List<ButtonDetails> list = this.f96402d;
        b bVar = b.GENERIC;
        return (list == null || list.size() != 2) ? bVar : b.Companion.a(list.get(0).b());
    }

    public final long d() {
        Long l10 = this.f96399a;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0;
    }

    public final String e() {
        return this.f96401c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigAlert)) {
            return false;
        }
        ConfigAlert configAlert = (ConfigAlert) obj;
        return C17542s.e(this.f96399a, configAlert.f96399a) && C17542s.e(this.f96400b, configAlert.f96400b) && C17542s.e(this.f96401c, configAlert.f96401c) && C17542s.e(this.f96402d, configAlert.f96402d);
    }

    public final String f() {
        return this.f96400b;
    }

    public int hashCode() {
        Long l10 = this.f96399a;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.f96400b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f96401c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ButtonDetails> list = this.f96402d;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        Long l10 = this.f96399a;
        String str = this.f96400b;
        String str2 = this.f96401c;
        List<ButtonDetails> list = this.f96402d;
        return "ConfigAlert(lastUpdatedTimeRemote=" + l10 + ", title=" + str + ", message=" + str2 + ", buttonDetails=" + list + ")";
    }
}
