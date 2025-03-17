package com.ingka.ikea.appconfig.model;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0003%&\u001dB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u001f¨\u0006'"}, d2 = {"Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "", "Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;", "cardNumberValidation", "pinValidation", "<init>", "(Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;", "()Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;", "getCardNumberValidation$annotations", "()V", "b", "getPinValidation$annotations", "Companion", "FieldValidation", "$serializer", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GiftCardConfiguration {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final FieldValidation f92990a;

    /* renamed from: b  reason: collision with root package name */
    private final FieldValidation f92991b;

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u001eB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001f\u0012\u0004\b&\u0010\"\u001a\u0004\b%\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b'\u0010\"\u001a\u0004\b\u001e\u0010\u0017¨\u0006*"}, d2 = {"Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;", "", "", "name", "regex", "pinRequiredRegex", "luhnCheckRegex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getName$annotations", "()V", "d", "getRegex$annotations", "c", "getPinRequiredRegex$annotations", "getLuhnCheckRegex$annotations", "Companion", "$serializer", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FieldValidation {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f92992a;

        /* renamed from: b  reason: collision with root package name */
        private final String f92993b;

        /* renamed from: c  reason: collision with root package name */
        private final String f92994c;

        /* renamed from: d  reason: collision with root package name */
        private final String f92995d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$FieldValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<FieldValidation> serializer() {
                return GiftCardConfiguration$FieldValidation$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FieldValidation(int i10, String str, String str2, String str3, String str4, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, GiftCardConfiguration$FieldValidation$$serializer.INSTANCE.getDescriptor());
            }
            this.f92992a = str;
            this.f92993b = str2;
            this.f92994c = str3;
            this.f92995d = str4;
        }

        public static final /* synthetic */ void e(FieldValidation fieldValidation, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, fieldValidation.f92992a);
            dVar.y(serialDescriptor, 1, fieldValidation.f92993b);
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 2, y02, fieldValidation.f92994c);
            dVar.B(serialDescriptor, 3, y02, fieldValidation.f92995d);
        }

        public final String a() {
            return this.f92995d;
        }

        public final String b() {
            return this.f92992a;
        }

        public final String c() {
            return this.f92994c;
        }

        public final String d() {
            return this.f92993b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FieldValidation)) {
                return false;
            }
            FieldValidation fieldValidation = (FieldValidation) obj;
            return C17542s.e(this.f92992a, fieldValidation.f92992a) && C17542s.e(this.f92993b, fieldValidation.f92993b) && C17542s.e(this.f92994c, fieldValidation.f92994c) && C17542s.e(this.f92995d, fieldValidation.f92995d);
        }

        public int hashCode() {
            int hashCode = ((this.f92992a.hashCode() * 31) + this.f92993b.hashCode()) * 31;
            String str = this.f92994c;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f92995d;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f92992a;
            String str2 = this.f92993b;
            String str3 = this.f92994c;
            String str4 = this.f92995d;
            return "FieldValidation(name=" + str + ", regex=" + str2 + ", pinRequiredRegex=" + str3 + ", luhnCheckRegex=" + str4 + ")";
        }

        public FieldValidation(String str, String str2, String str3, String str4) {
            C17542s.j(str, "name");
            C17542s.j(str2, "regex");
            this.f92992a = str;
            this.f92993b = str2;
            this.f92994c = str3;
            this.f92995d = str4;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<GiftCardConfiguration> serializer() {
            return GiftCardConfiguration$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GiftCardConfiguration(int i10, FieldValidation fieldValidation, FieldValidation fieldValidation2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, GiftCardConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.f92990a = fieldValidation;
        this.f92991b = fieldValidation2;
    }

    public static final /* synthetic */ void c(GiftCardConfiguration giftCardConfiguration, C17395d dVar, SerialDescriptor serialDescriptor) {
        GiftCardConfiguration$FieldValidation$$serializer giftCardConfiguration$FieldValidation$$serializer = GiftCardConfiguration$FieldValidation$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 0, giftCardConfiguration$FieldValidation$$serializer, giftCardConfiguration.f92990a);
        dVar.B(serialDescriptor, 1, giftCardConfiguration$FieldValidation$$serializer, giftCardConfiguration.f92991b);
    }

    public final FieldValidation a() {
        return this.f92990a;
    }

    public final FieldValidation b() {
        return this.f92991b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardConfiguration)) {
            return false;
        }
        GiftCardConfiguration giftCardConfiguration = (GiftCardConfiguration) obj;
        return C17542s.e(this.f92990a, giftCardConfiguration.f92990a) && C17542s.e(this.f92991b, giftCardConfiguration.f92991b);
    }

    public int hashCode() {
        FieldValidation fieldValidation = this.f92990a;
        int i10 = 0;
        int hashCode = (fieldValidation == null ? 0 : fieldValidation.hashCode()) * 31;
        FieldValidation fieldValidation2 = this.f92991b;
        if (fieldValidation2 != null) {
            i10 = fieldValidation2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        FieldValidation fieldValidation = this.f92990a;
        FieldValidation fieldValidation2 = this.f92991b;
        return "GiftCardConfiguration(cardNumberValidation=" + fieldValidation + ", pinValidation=" + fieldValidation2 + ")";
    }

    public GiftCardConfiguration(FieldValidation fieldValidation, FieldValidation fieldValidation2) {
        this.f92990a = fieldValidation;
        this.f92991b = fieldValidation2;
    }
}
