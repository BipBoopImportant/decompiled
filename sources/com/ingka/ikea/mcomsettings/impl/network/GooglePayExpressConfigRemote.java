package com.ingka.ikea.mcomsettings.impl.network;

import HJ.C15854t;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import tv.C11996a;
import tv.C11997b;

@p
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\b\b\u0018\u0000 @2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0006ABCDE2B\u0001\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020&2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b2\u00103\u0012\u0004\b4\u00105R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b'\u00103\u0012\u0004\b6\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\f\n\u0004\b)\u00107\u0012\u0004\b8\u00105R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\f\n\u0004\b\u0018\u00107\u0012\u0004\b9\u00105R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\u001b\u00103\u0012\u0004\b:\u00105R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\f\n\u0004\b$\u0010;\u0012\u0004\b<\u00105R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\"\u00103\u0012\u0004\b=\u00105R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b>\u00103\u0012\u0004\b?\u00105¨\u0006F"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote;", "Lpp/b;", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "", "seen0", "", "", "cardAuthMethods", "cardNetworks", "termsAndConditions", "privacyPolicy", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredTaxFieldRemote;", "requiredTaxFields", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$FiscalCodeFieldRemote;", "fiscalCodeField", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredRecipientFieldRemote;", "requiredRecipientFields", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$CountryOfOriginRemote;", "countriesOfOrigin", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$FiscalCodeFieldRemote;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "Ltv/a;", "d", "()Ljava/util/List;", "Ltv/b;", "e", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "f", "()Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "", "b", "()Z", "c", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getCardAuthMethods$annotations", "()V", "getCardNetworks$annotations", "Ljava/lang/String;", "getTermsAndConditions$annotations", "getPrivacyPolicy$annotations", "getRequiredTaxFields$annotations", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$FiscalCodeFieldRemote;", "getFiscalCodeField$annotations", "getRequiredRecipientFields$annotations", "h", "getCountriesOfOrigin$annotations", "Companion", "RequiredTaxFieldRemote", "RequiredRecipientFieldRemote", "FiscalCodeFieldRemote", "CountryOfOriginRemote", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GooglePayExpressConfigRemote implements C11768b<MComConfig.GooglePayExpressConfig> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f96698i;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f96699a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f96700b;

    /* renamed from: c  reason: collision with root package name */
    private final String f96701c;

    /* renamed from: d  reason: collision with root package name */
    private final String f96702d;

    /* renamed from: e  reason: collision with root package name */
    private final List<RequiredTaxFieldRemote> f96703e;

    /* renamed from: f  reason: collision with root package name */
    private final FiscalCodeFieldRemote f96704f;

    /* renamed from: g  reason: collision with root package name */
    private final List<RequiredRecipientFieldRemote> f96705g;

    /* renamed from: h  reason: collision with root package name */
    private final List<CountryOfOriginRemote> f96706h;

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u0014B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$CountryOfOriginRemote;", "", "", "seen0", "", "displayText", "value", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$CountryOfOriginRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$CountryOfOrigin;", "a", "()Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$CountryOfOrigin;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayText", "getDisplayText$annotations", "()V", "b", "getValue", "getValue$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CountryOfOriginRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96707a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96708b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$CountryOfOriginRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$CountryOfOriginRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<CountryOfOriginRemote> serializer() {
                return GooglePayExpressConfigRemote$CountryOfOriginRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CountryOfOriginRemote(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, GooglePayExpressConfigRemote$CountryOfOriginRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96707a = str;
            this.f96708b = str2;
        }

        private static final Void b(CountryOfOriginRemote countryOfOriginRemote, String str) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
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
                    String name = countryOfOriginRemote.getClass().getName();
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

        public static final /* synthetic */ void c(CountryOfOriginRemote countryOfOriginRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, countryOfOriginRemote.f96707a);
            dVar.B(serialDescriptor, 1, y02, countryOfOriginRemote.f96708b);
        }

        public final MComConfig.GooglePayExpressConfig.CountryOfOrigin a() {
            String str = this.f96707a;
            if (str == null || str.length() == 0) {
                return (MComConfig.GooglePayExpressConfig.CountryOfOrigin) b(this, "Missing display text for country");
            }
            String str2 = this.f96708b;
            return (str2 == null || str2.length() == 0) ? (MComConfig.GooglePayExpressConfig.CountryOfOrigin) b(this, "Missing value (code) for country") : new MComConfig.GooglePayExpressConfig.CountryOfOrigin(this.f96707a, this.f96708b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CountryOfOriginRemote)) {
                return false;
            }
            CountryOfOriginRemote countryOfOriginRemote = (CountryOfOriginRemote) obj;
            return C17542s.e(this.f96707a, countryOfOriginRemote.f96707a) && C17542s.e(this.f96708b, countryOfOriginRemote.f96708b);
        }

        public int hashCode() {
            String str = this.f96707a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f96708b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f96707a;
            String str2 = this.f96708b;
            return "CountryOfOriginRemote(displayText=" + str + ", value=" + str2 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u0015B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b'\u0010\"\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$FiscalCodeFieldRemote;", "", "", "seen0", "", "displayText", "regex", "errorMessage", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$FiscalCodeFieldRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$FiscalCodeField;", "a", "()Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$FiscalCodeField;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayText", "getDisplayText$annotations", "()V", "b", "getRegex", "getRegex$annotations", "getErrorMessage", "getErrorMessage$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FiscalCodeFieldRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96709a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96710b;

        /* renamed from: c  reason: collision with root package name */
        private final String f96711c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$FiscalCodeFieldRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$FiscalCodeFieldRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<FiscalCodeFieldRemote> serializer() {
                return GooglePayExpressConfigRemote$FiscalCodeFieldRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FiscalCodeFieldRemote(int i10, String str, String str2, String str3, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, GooglePayExpressConfigRemote$FiscalCodeFieldRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96709a = str;
            this.f96710b = str2;
            this.f96711c = str3;
        }

        private static final Void b(FiscalCodeFieldRemote fiscalCodeFieldRemote, String str) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str + ": " + fiscalCodeFieldRemote);
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
                    String name = fiscalCodeFieldRemote.getClass().getName();
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

        public static final /* synthetic */ void c(FiscalCodeFieldRemote fiscalCodeFieldRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, fiscalCodeFieldRemote.f96709a);
            dVar.B(serialDescriptor, 1, y02, fiscalCodeFieldRemote.f96710b);
            dVar.B(serialDescriptor, 2, y02, fiscalCodeFieldRemote.f96711c);
        }

        public final MComConfig.GooglePayExpressConfig.FiscalCodeField a() {
            String str = this.f96709a;
            if (str == null || str.length() == 0) {
                return (MComConfig.GooglePayExpressConfig.FiscalCodeField) b(this, "Missing display text for fiscal code field");
            }
            String str2 = this.f96710b;
            if (str2 == null || str2.length() == 0) {
                return (MComConfig.GooglePayExpressConfig.FiscalCodeField) b(this, "Missing validation regex for fiscal code field");
            }
            String str3 = this.f96711c;
            return (str3 == null || str3.length() == 0) ? (MComConfig.GooglePayExpressConfig.FiscalCodeField) b(this, "Missing error text for fiscal code field") : new MComConfig.GooglePayExpressConfig.FiscalCodeField(this.f96709a, this.f96710b, this.f96711c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FiscalCodeFieldRemote)) {
                return false;
            }
            FiscalCodeFieldRemote fiscalCodeFieldRemote = (FiscalCodeFieldRemote) obj;
            return C17542s.e(this.f96709a, fiscalCodeFieldRemote.f96709a) && C17542s.e(this.f96710b, fiscalCodeFieldRemote.f96710b) && C17542s.e(this.f96711c, fiscalCodeFieldRemote.f96711c);
        }

        public int hashCode() {
            String str = this.f96709a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f96710b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f96711c;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f96709a;
            String str2 = this.f96710b;
            String str3 = this.f96711c;
            return "FiscalCodeFieldRemote(displayText=" + str + ", regex=" + str2 + ", errorMessage=" + str3 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u0000 .2\u00020\u0001:\u0002/\u0017BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010 \u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010 \u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredRecipientFieldRemote;", "", "", "seen0", "", "displayText", "regex", "recipientCodeType", "", "requiresInput", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredRecipientFieldRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredRecipientField;", "a", "()Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredRecipientField;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayText", "getDisplayText$annotations", "()V", "b", "getRegex", "getRegex$annotations", "getRecipientCodeType", "getRecipientCodeType$annotations", "d", "Ljava/lang/Boolean;", "getRequiresInput", "()Ljava/lang/Boolean;", "getRequiresInput$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequiredRecipientFieldRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96712a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96713b;

        /* renamed from: c  reason: collision with root package name */
        private final String f96714c;

        /* renamed from: d  reason: collision with root package name */
        private final Boolean f96715d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredRecipientFieldRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredRecipientFieldRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<RequiredRecipientFieldRemote> serializer() {
                return GooglePayExpressConfigRemote$RequiredRecipientFieldRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ RequiredRecipientFieldRemote(int i10, String str, String str2, String str3, Boolean bool, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, GooglePayExpressConfigRemote$RequiredRecipientFieldRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96712a = str;
            this.f96713b = str2;
            this.f96714c = str3;
            this.f96715d = bool;
        }

        private static final Void b(RequiredRecipientFieldRemote requiredRecipientFieldRemote, String str) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str + ": " + requiredRecipientFieldRemote);
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
                    String name = requiredRecipientFieldRemote.getClass().getName();
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

        public static final /* synthetic */ void c(RequiredRecipientFieldRemote requiredRecipientFieldRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, requiredRecipientFieldRemote.f96712a);
            dVar.B(serialDescriptor, 1, y02, requiredRecipientFieldRemote.f96713b);
            dVar.B(serialDescriptor, 2, y02, requiredRecipientFieldRemote.f96714c);
            dVar.B(serialDescriptor, 3, C17457i.f144111a, requiredRecipientFieldRemote.f96715d);
        }

        public final MComConfig.GooglePayExpressConfig.RequiredRecipientField a() {
            String str = this.f96712a;
            if (str == null || str.length() == 0) {
                return (MComConfig.GooglePayExpressConfig.RequiredRecipientField) b(this, "Missing display text for recipient/ID field");
            }
            String str2 = this.f96713b;
            if (str2 == null || str2.length() == 0) {
                return (MComConfig.GooglePayExpressConfig.RequiredRecipientField) b(this, "Missing validation regex for recipient/ID field");
            }
            String str3 = this.f96714c;
            return (str3 == null || str3.length() == 0) ? (MComConfig.GooglePayExpressConfig.RequiredRecipientField) b(this, "Missing type for recipient/ID field") : this.f96715d == null ? (MComConfig.GooglePayExpressConfig.RequiredRecipientField) b(this, "Missing required flag for recipient/ID field") : new MComConfig.GooglePayExpressConfig.RequiredRecipientField(this.f96712a, this.f96713b, this.f96714c, this.f96715d.booleanValue());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequiredRecipientFieldRemote)) {
                return false;
            }
            RequiredRecipientFieldRemote requiredRecipientFieldRemote = (RequiredRecipientFieldRemote) obj;
            return C17542s.e(this.f96712a, requiredRecipientFieldRemote.f96712a) && C17542s.e(this.f96713b, requiredRecipientFieldRemote.f96713b) && C17542s.e(this.f96714c, requiredRecipientFieldRemote.f96714c) && C17542s.e(this.f96715d, requiredRecipientFieldRemote.f96715d);
        }

        public int hashCode() {
            String str = this.f96712a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f96713b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f96714c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.f96715d;
            if (bool != null) {
                i10 = bool.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            String str = this.f96712a;
            String str2 = this.f96713b;
            String str3 = this.f96714c;
            Boolean bool = this.f96715d;
            return "RequiredRecipientFieldRemote(displayText=" + str + ", regex=" + str2 + ", recipientCodeType=" + str3 + ", requiresInput=" + bool + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u0000 12\u00020\u0001:\u00022!BM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010%\u001a\u0004\b!\u0010*R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010)\u0012\u0004\b0\u0010%\u001a\u0004\b/\u0010*¨\u00063"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredTaxFieldRemote;", "", "", "seen0", "", "displayText", "regex", "", "showCountryOfOrigin", "taxCodeType", "requiresInput", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredTaxFieldRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredTaxField;", "b", "()Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredTaxField;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDisplayText", "getDisplayText$annotations", "()V", "getRegex", "getRegex$annotations", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getShowCountryOfOrigin$annotations", "getTaxCodeType", "getTaxCodeType$annotations", "e", "getRequiresInput", "getRequiresInput$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequiredTaxFieldRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96716a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96717b;

        /* renamed from: c  reason: collision with root package name */
        private final Boolean f96718c;

        /* renamed from: d  reason: collision with root package name */
        private final String f96719d;

        /* renamed from: e  reason: collision with root package name */
        private final Boolean f96720e;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredTaxFieldRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredTaxFieldRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<RequiredTaxFieldRemote> serializer() {
                return GooglePayExpressConfigRemote$RequiredTaxFieldRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ RequiredTaxFieldRemote(int i10, String str, String str2, Boolean bool, String str3, Boolean bool2, T0 t02) {
            if (31 != (i10 & 31)) {
                E0.b(i10, 31, GooglePayExpressConfigRemote$RequiredTaxFieldRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96716a = str;
            this.f96717b = str2;
            this.f96718c = bool;
            this.f96719d = str3;
            this.f96720e = bool2;
        }

        private static final Void c(RequiredTaxFieldRemote requiredTaxFieldRemote, String str) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str + ": " + requiredTaxFieldRemote);
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
                    String name = requiredTaxFieldRemote.getClass().getName();
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

        public static final /* synthetic */ void d(RequiredTaxFieldRemote requiredTaxFieldRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, requiredTaxFieldRemote.f96716a);
            dVar.B(serialDescriptor, 1, y02, requiredTaxFieldRemote.f96717b);
            C17457i iVar = C17457i.f144111a;
            dVar.B(serialDescriptor, 2, iVar, requiredTaxFieldRemote.f96718c);
            dVar.B(serialDescriptor, 3, y02, requiredTaxFieldRemote.f96719d);
            dVar.B(serialDescriptor, 4, iVar, requiredTaxFieldRemote.f96720e);
        }

        public final Boolean a() {
            return this.f96718c;
        }

        public final MComConfig.GooglePayExpressConfig.RequiredTaxField b() {
            String str = this.f96716a;
            if (str == null || str.length() == 0) {
                return (MComConfig.GooglePayExpressConfig.RequiredTaxField) c(this, "Missing display text for ID field");
            }
            String str2 = this.f96717b;
            if (str2 == null || str2.length() == 0) {
                return (MComConfig.GooglePayExpressConfig.RequiredTaxField) c(this, "Missing validation regex for ID field");
            }
            if (this.f96718c == null) {
                return (MComConfig.GooglePayExpressConfig.RequiredTaxField) c(this, "Missing country flag for ID field");
            }
            String str3 = this.f96719d;
            return (str3 == null || str3.length() == 0) ? (MComConfig.GooglePayExpressConfig.RequiredTaxField) c(this, "Missing type for ID field") : this.f96720e == null ? (MComConfig.GooglePayExpressConfig.RequiredTaxField) c(this, "Missing required flag for ID field") : new MComConfig.GooglePayExpressConfig.RequiredTaxField(this.f96716a, this.f96717b, this.f96718c.booleanValue(), this.f96719d, this.f96720e.booleanValue());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequiredTaxFieldRemote)) {
                return false;
            }
            RequiredTaxFieldRemote requiredTaxFieldRemote = (RequiredTaxFieldRemote) obj;
            return C17542s.e(this.f96716a, requiredTaxFieldRemote.f96716a) && C17542s.e(this.f96717b, requiredTaxFieldRemote.f96717b) && C17542s.e(this.f96718c, requiredTaxFieldRemote.f96718c) && C17542s.e(this.f96719d, requiredTaxFieldRemote.f96719d) && C17542s.e(this.f96720e, requiredTaxFieldRemote.f96720e);
        }

        public int hashCode() {
            String str = this.f96716a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f96717b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f96718c;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.f96719d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool2 = this.f96720e;
            if (bool2 != null) {
                i10 = bool2.hashCode();
            }
            return hashCode4 + i10;
        }

        public String toString() {
            String str = this.f96716a;
            String str2 = this.f96717b;
            Boolean bool = this.f96718c;
            String str3 = this.f96719d;
            Boolean bool2 = this.f96720e;
            return "RequiredTaxFieldRemote(displayText=" + str + ", regex=" + str2 + ", showCountryOfOrigin=" + bool + ", taxCodeType=" + str3 + ", requiresInput=" + bool2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<GooglePayExpressConfigRemote> serializer() {
            return GooglePayExpressConfigRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Y0 y02 = Y0.f144077a;
        f96698i = new KSerializer[]{new C17451f(y02), new C17451f(y02), null, null, new C17451f(GooglePayExpressConfigRemote$RequiredTaxFieldRemote$$serializer.INSTANCE), null, new C17451f(GooglePayExpressConfigRemote$RequiredRecipientFieldRemote$$serializer.INSTANCE), new C17451f(GooglePayExpressConfigRemote$CountryOfOriginRemote$$serializer.INSTANCE)};
    }

    public /* synthetic */ GooglePayExpressConfigRemote(int i10, List list, List list2, String str, String str2, List list3, FiscalCodeFieldRemote fiscalCodeFieldRemote, List list4, List list5, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, GooglePayExpressConfigRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96699a = list;
        this.f96700b = list2;
        this.f96701c = str;
        this.f96702d = str2;
        if ((i10 & 16) == 0) {
            this.f96703e = null;
        } else {
            this.f96703e = list3;
        }
        if ((i10 & 32) == 0) {
            this.f96704f = null;
        } else {
            this.f96704f = fiscalCodeFieldRemote;
        }
        if ((i10 & 64) == 0) {
            this.f96705g = null;
        } else {
            this.f96705g = list4;
        }
        if ((i10 & 128) == 0) {
            this.f96706h = null;
        } else {
            this.f96706h = list5;
        }
    }

    private final List<C11996a> d() {
        C11996a aVar;
        List<String> list = this.f96699a;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (C17542s.e(str, "PAYMENT_METHOD_CARD")) {
                aVar = C11996a.PAN_ONLY;
            } else if (C17542s.e(str, "PAYMENT_METHOD_TOKENIZED_CARD")) {
                aVar = C11996a.CRYPTOGRAM_3DS;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid card auth method: " + str);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList2.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList2) {
                    if (str2 == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name = GooglePayExpressConfigRemote.class.getName();
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
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<tv.C11997b> e() {
        /*
            r15 = this;
            java.util.List<java.lang.String> r0 = r15.f96700b
            r1 = 0
            if (r0 == 0) goto L_0x0137
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0136
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.hashCode()
            switch(r4) {
                case -523338370: goto L_0x0065;
                case -477649710: goto L_0x0058;
                case 659166281: goto L_0x004b;
                case 922718783: goto L_0x003e;
                case 923340961: goto L_0x0031;
                case 1969436105: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x006d
        L_0x0024:
            java.lang.String r4 = "CARD_NETWORK_JCB"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x002d
            goto L_0x006d
        L_0x002d:
            tv.b r3 = tv.C11997b.JCB
            goto L_0x012f
        L_0x0031:
            java.lang.String r4 = "CARD_NETWORK_VISA"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x003a
            goto L_0x006d
        L_0x003a:
            tv.b r3 = tv.C11997b.VISA
            goto L_0x012f
        L_0x003e:
            java.lang.String r4 = "CARD_NETWORK_AMEX"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0047
            goto L_0x006d
        L_0x0047:
            tv.b r3 = tv.C11997b.AMEX
            goto L_0x012f
        L_0x004b:
            java.lang.String r4 = "CARD_NETWORK_DISCOVER"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            tv.b r3 = tv.C11997b.DISCOVER
            goto L_0x012f
        L_0x0058:
            java.lang.String r4 = "CARD_NETWORK_MASTERCARD"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0061
            goto L_0x006d
        L_0x0061:
            tv.b r3 = tv.C11997b.MASTERCARD
            goto L_0x012f
        L_0x0065:
            java.lang.String r4 = "CARD_NETWORK_INTERAC"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x012d
        L_0x006d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Invalid card network: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            qv.e r3 = qv.e.ERROR
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0096:
            boolean r7 = r5.hasNext()
            r11 = 0
            if (r7 == 0) goto L_0x00ae
            java.lang.Object r7 = r5.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            boolean r8 = r8.b(r3, r11)
            if (r8 == 0) goto L_0x0096
            r6.add(r7)
            goto L_0x0096
        L_0x00ae:
            java.util.Iterator r12 = r6.iterator()
            r5 = r1
            r6 = r5
        L_0x00b4:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x012b
            java.lang.Object r7 = r12.next()
            qv.b r7 = (qv.C11819b) r7
            if (r5 != 0) goto L_0x00ce
            java.lang.String r5 = qv.C11818a.a(r1, r4)
            if (r5 != 0) goto L_0x00ca
            goto L_0x012b
        L_0x00ca:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x00ce:
            r13 = r5
            if (r6 != 0) goto L_0x011e
            java.lang.Class<com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote> r5 = com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote.class
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 36
            r8 = 2
            java.lang.String r6 = HJ.C15854t.s1(r5, r6, r1, r8, r1)
            r9 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r9, r1, r8, r1)
            int r8 = r6.length()
            if (r8 != 0) goto L_0x00ee
            goto L_0x00f4
        L_0x00ee:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r6, r5)
        L_0x00f4:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = "main"
            r9 = 1
            boolean r6 = HJ.C15854t.b0(r6, r8, r9)
            if (r6 == 0) goto L_0x0108
            java.lang.String r6 = "m"
            goto L_0x010a
        L_0x0108:
            java.lang.String r6 = "b"
        L_0x010a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = "|"
            r8.append(r6)
            r8.append(r5)
            java.lang.String r6 = r8.toString()
        L_0x011e:
            r14 = r6
            r5 = r7
            r6 = r3
            r7 = r14
            r8 = r11
            r9 = r4
            r10 = r13
            r5.a(r6, r7, r8, r9, r10)
            r5 = r13
            r6 = r14
            goto L_0x00b4
        L_0x012b:
            r3 = r1
            goto L_0x012f
        L_0x012d:
            tv.b r3 = tv.C11997b.INTERAC
        L_0x012f:
            if (r3 == 0) goto L_0x0010
            r2.add(r3)
            goto L_0x0010
        L_0x0136:
            r1 = r2
        L_0x0137:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote.e():java.util.List");
    }

    public static final /* synthetic */ void g(GooglePayExpressConfigRemote googlePayExpressConfigRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f96698i;
        dVar.B(serialDescriptor, 0, kSerializerArr[0], googlePayExpressConfigRemote.f96699a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], googlePayExpressConfigRemote.f96700b);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 2, y02, googlePayExpressConfigRemote.f96701c);
        dVar.B(serialDescriptor, 3, y02, googlePayExpressConfigRemote.f96702d);
        if (dVar.z(serialDescriptor, 4) || googlePayExpressConfigRemote.f96703e != null) {
            dVar.B(serialDescriptor, 4, kSerializerArr[4], googlePayExpressConfigRemote.f96703e);
        }
        if (dVar.z(serialDescriptor, 5) || googlePayExpressConfigRemote.f96704f != null) {
            dVar.B(serialDescriptor, 5, GooglePayExpressConfigRemote$FiscalCodeFieldRemote$$serializer.INSTANCE, googlePayExpressConfigRemote.f96704f);
        }
        if (dVar.z(serialDescriptor, 6) || googlePayExpressConfigRemote.f96705g != null) {
            dVar.B(serialDescriptor, 6, kSerializerArr[6], googlePayExpressConfigRemote.f96705g);
        }
        if (dVar.z(serialDescriptor, 7) || googlePayExpressConfigRemote.f96706h != null) {
            dVar.B(serialDescriptor, 7, kSerializerArr[7], googlePayExpressConfigRemote.f96706h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r0 = r5.f96706h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r5 = this;
            java.util.List<com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote$RequiredTaxFieldRemote> r0 = r5.f96703e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0039
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0017
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0017
        L_0x0015:
            r0 = r1
            goto L_0x0034
        L_0x0017:
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0015
            java.lang.Object r3 = r0.next()
            com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote$RequiredTaxFieldRemote r3 = (com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote.RequiredTaxFieldRemote) r3
            java.lang.Boolean r3 = r3.a()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x001b
            r0 = r2
        L_0x0034:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r3)
            if (r0 == 0) goto L_0x004f
            java.util.List<com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote$CountryOfOriginRemote> r0 = r5.f96706h
            if (r0 == 0) goto L_0x0050
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x0050
        L_0x004f:
            r1 = r2
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote.b():boolean");
    }

    public final boolean c() {
        boolean z10 = this.f96704f != null;
        List<RequiredRecipientFieldRemote> list = this.f96705g;
        return z10 == (list != null && (list.isEmpty() ^ true));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayExpressConfigRemote)) {
            return false;
        }
        GooglePayExpressConfigRemote googlePayExpressConfigRemote = (GooglePayExpressConfigRemote) obj;
        return C17542s.e(this.f96699a, googlePayExpressConfigRemote.f96699a) && C17542s.e(this.f96700b, googlePayExpressConfigRemote.f96700b) && C17542s.e(this.f96701c, googlePayExpressConfigRemote.f96701c) && C17542s.e(this.f96702d, googlePayExpressConfigRemote.f96702d) && C17542s.e(this.f96703e, googlePayExpressConfigRemote.f96703e) && C17542s.e(this.f96704f, googlePayExpressConfigRemote.f96704f) && C17542s.e(this.f96705g, googlePayExpressConfigRemote.f96705g) && C17542s.e(this.f96706h, googlePayExpressConfigRemote.f96706h);
    }

    public MComConfig.GooglePayExpressConfig f() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        Iterator it2;
        Iterator it3;
        List<C11997b> e10 = e();
        List<C11996a> d10 = d();
        Collection collection = d10;
        Class<GooglePayExpressConfigRemote> cls = GooglePayExpressConfigRemote.class;
        if (collection == null || collection.isEmpty()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No valid cart auth methods: " + d10);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList4.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList4) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        return null;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, illegalArgumentException, str);
            }
            return null;
        }
        Collection collection2 = e10;
        if (collection2 == null || collection2.isEmpty()) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("No valid card networks: " + e10);
            e eVar2 = e.ERROR;
            ArrayList<C11819b> arrayList5 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList5.add(next2);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar2 : arrayList5) {
                if (str3 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException2);
                    if (a11 == null) {
                        return null;
                    }
                    str3 = C11820c.a(a11);
                }
                if (str4 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str4, false, illegalArgumentException2, str3);
            }
            return null;
        } else if (this.f96701c == null) {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Terms and conditions missing");
            e eVar3 = e.ERROR;
            ArrayList arrayList6 = new ArrayList();
            for (Object next3 : d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList6.add(next3);
                }
            }
            Iterator it4 = arrayList6.iterator();
            String str5 = null;
            String str6 = null;
            while (it4.hasNext()) {
                C11819b bVar3 = (C11819b) it4.next();
                if (str5 == null) {
                    String a12 = C11818a.a((String) null, illegalArgumentException3);
                    if (a12 == null) {
                        return null;
                    }
                    str5 = C11820c.a(a12);
                }
                if (str6 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    it3 = it4;
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                } else {
                    it3 = it4;
                }
                bVar3.a(eVar3, str6, false, illegalArgumentException3, str5);
                it4 = it3;
            }
            return null;
        } else if (!b()) {
            IllegalArgumentException illegalArgumentException4 = new IllegalArgumentException("Countries of origin missing when required");
            e eVar4 = e.ERROR;
            ArrayList arrayList7 = new ArrayList();
            for (Object next4 : d.f102012a.a()) {
                if (((C11819b) next4).b(eVar4, false)) {
                    arrayList7.add(next4);
                }
            }
            Iterator it5 = arrayList7.iterator();
            String str7 = null;
            String str8 = null;
            while (it5.hasNext()) {
                C11819b bVar4 = (C11819b) it5.next();
                if (str7 == null) {
                    String a13 = C11818a.a((String) null, illegalArgumentException4);
                    if (a13 == null) {
                        return null;
                    }
                    str7 = C11820c.a(a13);
                }
                if (str8 == null) {
                    String name4 = cls.getName();
                    C17542s.g(name4);
                    it2 = it5;
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name4;
                } else {
                    it2 = it5;
                }
                bVar4.a(eVar4, str8, false, illegalArgumentException4, str7);
                it5 = it2;
            }
            return null;
        } else if (!c()) {
            IllegalArgumentException illegalArgumentException5 = new IllegalArgumentException("Req. recipient or fiscal code field missing");
            e eVar5 = e.ERROR;
            ArrayList arrayList8 = new ArrayList();
            for (Object next5 : d.f102012a.a()) {
                if (((C11819b) next5).b(eVar5, false)) {
                    arrayList8.add(next5);
                }
            }
            Iterator it6 = arrayList8.iterator();
            String str9 = null;
            String str10 = null;
            while (it6.hasNext()) {
                C11819b bVar5 = (C11819b) it6.next();
                if (str9 == null) {
                    String a14 = C11818a.a((String) null, illegalArgumentException5);
                    if (a14 == null) {
                        return null;
                    }
                    str9 = C11820c.a(a14);
                }
                if (str10 == null) {
                    String name5 = cls.getName();
                    C17542s.g(name5);
                    it = it6;
                    String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o16.length() != 0) {
                        name5 = C15854t.P0(o16, "Kt");
                    }
                    str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name5;
                } else {
                    it = it6;
                }
                bVar5.a(eVar5, str10, false, illegalArgumentException5, str9);
                it6 = it;
            }
            return null;
        } else {
            String str11 = this.f96701c;
            String str12 = this.f96702d;
            List<RequiredTaxFieldRemote> list = this.f96703e;
            if (list != null) {
                arrayList = new ArrayList();
                for (RequiredTaxFieldRemote b10 : list) {
                    MComConfig.GooglePayExpressConfig.RequiredTaxField b11 = b10.b();
                    if (b11 != null) {
                        arrayList.add(b11);
                    }
                }
            } else {
                arrayList = null;
            }
            FiscalCodeFieldRemote fiscalCodeFieldRemote = this.f96704f;
            MComConfig.GooglePayExpressConfig.FiscalCodeField a15 = fiscalCodeFieldRemote != null ? fiscalCodeFieldRemote.a() : null;
            List<RequiredRecipientFieldRemote> list2 = this.f96705g;
            if (list2 != null) {
                arrayList2 = new ArrayList();
                for (RequiredRecipientFieldRemote a16 : list2) {
                    MComConfig.GooglePayExpressConfig.RequiredRecipientField a17 = a16.a();
                    if (a17 != null) {
                        arrayList2.add(a17);
                    }
                }
            } else {
                arrayList2 = null;
            }
            List<CountryOfOriginRemote> list3 = this.f96706h;
            if (list3 != null) {
                arrayList3 = new ArrayList();
                for (CountryOfOriginRemote a18 : list3) {
                    MComConfig.GooglePayExpressConfig.CountryOfOrigin a19 = a18.a();
                    if (a19 != null) {
                        arrayList3.add(a19);
                    }
                }
            } else {
                arrayList3 = null;
            }
            return new MComConfig.GooglePayExpressConfig(d10, e10, str11, str12, arrayList, a15, arrayList2, arrayList3);
        }
    }

    public int hashCode() {
        List<String> list = this.f96699a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f96700b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f96701c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f96702d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<RequiredTaxFieldRemote> list3 = this.f96703e;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        FiscalCodeFieldRemote fiscalCodeFieldRemote = this.f96704f;
        int hashCode6 = (hashCode5 + (fiscalCodeFieldRemote == null ? 0 : fiscalCodeFieldRemote.hashCode())) * 31;
        List<RequiredRecipientFieldRemote> list4 = this.f96705g;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<CountryOfOriginRemote> list5 = this.f96706h;
        if (list5 != null) {
            i10 = list5.hashCode();
        }
        return hashCode7 + i10;
    }

    public String toString() {
        List<String> list = this.f96699a;
        List<String> list2 = this.f96700b;
        String str = this.f96701c;
        String str2 = this.f96702d;
        List<RequiredTaxFieldRemote> list3 = this.f96703e;
        FiscalCodeFieldRemote fiscalCodeFieldRemote = this.f96704f;
        List<RequiredRecipientFieldRemote> list4 = this.f96705g;
        List<CountryOfOriginRemote> list5 = this.f96706h;
        return "GooglePayExpressConfigRemote(cardAuthMethods=" + list + ", cardNetworks=" + list2 + ", termsAndConditions=" + str + ", privacyPolicy=" + str2 + ", requiredTaxFields=" + list3 + ", fiscalCodeField=" + fiscalCodeFieldRemote + ", requiredRecipientFields=" + list4 + ", countriesOfOrigin=" + list5 + ")";
    }
}
