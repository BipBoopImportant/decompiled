package com.ingka.ikea.appconfig.model;

import YH.C16877v;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.J;
import jK.T0;
import jK.Y0;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\b\u0018\u0000 I2\u00020\u0001:\u0004+1JKBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011Bi\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000b¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u00100\u001a\u0004\b3\u00104R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00102\u0012\u0004\b8\u00100\u001a\u0004\b7\u00104R \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u00102\u0012\u0004\b;\u00100\u001a\u0004\b:\u00104R \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u00102\u0012\u0004\b=\u00100\u001a\u0004\b<\u00104R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010>\u0012\u0004\bA\u00100\u001a\u0004\b?\u0010@R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010B\u0012\u0004\bC\u00100\u001a\u0004\b9\u0010#R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bG\u00100\u001a\u0004\b6\u0010FR\u0014\u0010H\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010#¨\u0006L"}, d2 = {"Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$b;", "type", "", "isAutoCompleteEnabled", "isStreetNumberEnabled", "isLocationServiceEnabled", "isStateRequired", "Lcom/ingka/ikea/appconfig/model/ZipInValidation;", "zipInValidation", "", "googleSourceZipCodeKey", "", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$AmbiguousArea;", "ambiguousAreas", "<init>", "(Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$b;ZZZZLcom/ingka/ikea/appconfig/model/ZipInValidation;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$b;ZZZZLcom/ingka/ikea/appconfig/model/ZipInValidation;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "o", "(Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/regex/Pattern;", "g", "()Ljava/util/regex/Pattern;", "e", "()Ljava/lang/String;", "f", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$b;", "i", "()Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$b;", "getType$annotations", "()V", "b", "Z", "k", "()Z", "isAutoCompleteEnabled$annotations", "c", "n", "isStreetNumberEnabled$annotations", "d", "l", "isLocationServiceEnabled$annotations", "m", "isStateRequired$annotations", "Lcom/ingka/ikea/appconfig/model/ZipInValidation;", "j", "()Lcom/ingka/ikea/appconfig/model/ZipInValidation;", "getZipInValidation$annotations", "Ljava/lang/String;", "getGoogleSourceZipCodeKey$annotations", "h", "Ljava/util/List;", "()Ljava/util/List;", "getAmbiguousAreas$annotations", "postalCodeRegex", "Companion", "AmbiguousArea", "$serializer", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PostalCodePickerConfig {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f93003i = {J.b("com.ingka.ikea.appconfig.model.PostalCodePickerConfig.PostalCodePickerType", b.values()), null, null, null, null, null, null, new C17451f(PostalCodePickerConfig$AmbiguousArea$$serializer.INSTANCE)};
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final PostalCodePickerConfig f93004j = new PostalCodePickerConfig(b.MANUAL, false, false, false, false, (ZipInValidation) null, (String) null, (List) null, 192, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final b f93005a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f93006b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f93007c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f93008d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f93009e;

    /* renamed from: f  reason: collision with root package name */
    private final ZipInValidation f93010f;

    /* renamed from: g  reason: collision with root package name */
    private final String f93011g;

    /* renamed from: h  reason: collision with root package name */
    private final List<AmbiguousArea> f93012h;

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\b\u0018\u0000 *2\u00020\u0001:\u0002+\u001eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001f\u0012\u0004\b%\u0010\"\u001a\u0004\b\u001e\u0010\u0018R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010\"\u001a\u0004\b&\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$AmbiguousArea;", "", "", "infoText", "areaText", "areaCode", "", "isContinueEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$AmbiguousArea;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getInfoText$annotations", "()V", "b", "getAreaText$annotations", "getAreaCode$annotations", "d", "Z", "()Z", "isContinueEnabled$annotations", "Companion", "$serializer", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AmbiguousArea {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93013a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93014b;

        /* renamed from: c  reason: collision with root package name */
        private final String f93015c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f93016d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$AmbiguousArea$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$AmbiguousArea;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<AmbiguousArea> serializer() {
                return PostalCodePickerConfig$AmbiguousArea$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ AmbiguousArea(int i10, String str, String str2, String str3, boolean z10, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, PostalCodePickerConfig$AmbiguousArea$$serializer.INSTANCE.getDescriptor());
            }
            this.f93013a = str;
            this.f93014b = str2;
            this.f93015c = str3;
            this.f93016d = z10;
        }

        public static final /* synthetic */ void e(AmbiguousArea ambiguousArea, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, ambiguousArea.f93013a);
            dVar.y(serialDescriptor, 1, ambiguousArea.f93014b);
            dVar.B(serialDescriptor, 2, Y0.f144077a, ambiguousArea.f93015c);
            dVar.x(serialDescriptor, 3, ambiguousArea.f93016d);
        }

        public final String a() {
            return this.f93015c;
        }

        public final String b() {
            return this.f93014b;
        }

        public final String c() {
            return this.f93013a;
        }

        public final boolean d() {
            return this.f93016d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmbiguousArea)) {
                return false;
            }
            AmbiguousArea ambiguousArea = (AmbiguousArea) obj;
            return C17542s.e(this.f93013a, ambiguousArea.f93013a) && C17542s.e(this.f93014b, ambiguousArea.f93014b) && C17542s.e(this.f93015c, ambiguousArea.f93015c) && this.f93016d == ambiguousArea.f93016d;
        }

        public int hashCode() {
            int hashCode = ((this.f93013a.hashCode() * 31) + this.f93014b.hashCode()) * 31;
            String str = this.f93015c;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f93016d);
        }

        public String toString() {
            String str = this.f93013a;
            String str2 = this.f93014b;
            String str3 = this.f93015c;
            boolean z10 = this.f93016d;
            return "AmbiguousArea(infoText=" + str + ", areaText=" + str2 + ", areaCode=" + str3 + ", isContinueEnabled=" + z10 + ")";
        }

        public AmbiguousArea(String str, String str2, String str3, boolean z10) {
            C17542s.j(str, "infoText");
            C17542s.j(str2, "areaText");
            this.f93013a = str;
            this.f93014b = str2;
            this.f93015c = str3;
            this.f93016d = z10;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "DEFAULT_CONFIG", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "a", "()Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "", "MATCH_ANYTHING_REGEX", "Ljava/lang/String;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PostalCodePickerConfig a() {
            return PostalCodePickerConfig.f93004j;
        }

        public final KSerializer<PostalCodePickerConfig> serializer() {
            return PostalCodePickerConfig$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "MANUAL", "ADDRESS_LOOKUP", "NATIVE_GOOGLE", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        MANUAL("Manual"),
        ADDRESS_LOOKUP("AddressLookup"),
        NATIVE_GOOGLE("NativeGoogle");
        
        public static final a Companion = null;
        private final String rawValue;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$b;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String str) {
                T t10;
                Iterator<T> it = b.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((b) t10).j(), str)) {
                        break;
                    }
                }
                b bVar = (b) t10;
                return bVar == null ? b.MANUAL : bVar;
            }

            private a() {
            }
        }

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }

        private b(String str) {
            this.rawValue = str;
        }

        public static C17220a<b> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.rawValue;
        }
    }

    public /* synthetic */ PostalCodePickerConfig(int i10, b bVar, boolean z10, boolean z11, boolean z12, boolean z13, ZipInValidation zipInValidation, String str, List list, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, PostalCodePickerConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.f93005a = bVar;
        this.f93006b = z10;
        this.f93007c = z11;
        this.f93008d = z12;
        this.f93009e = z13;
        this.f93010f = zipInValidation;
        if ((i10 & 64) == 0) {
            this.f93011g = null;
        } else {
            this.f93011g = str;
        }
        if ((i10 & 128) == 0) {
            this.f93012h = C16877v.n();
        } else {
            this.f93012h = list;
        }
    }

    private final String h() {
        ZipInValidation zipInValidation = this.f93010f;
        String d10 = zipInValidation != null ? zipInValidation.d() : null;
        return (d10 == null || d10.length() == 0) ? ".*" : d10;
    }

    public static final /* synthetic */ void o(PostalCodePickerConfig postalCodePickerConfig, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93003i;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], postalCodePickerConfig.f93005a);
        dVar.x(serialDescriptor, 1, postalCodePickerConfig.f93006b);
        dVar.x(serialDescriptor, 2, postalCodePickerConfig.f93007c);
        dVar.x(serialDescriptor, 3, postalCodePickerConfig.f93008d);
        dVar.x(serialDescriptor, 4, postalCodePickerConfig.f93009e);
        dVar.B(serialDescriptor, 5, ZipInValidation$$serializer.INSTANCE, postalCodePickerConfig.f93010f);
        if (dVar.z(serialDescriptor, 6) || postalCodePickerConfig.f93011g != null) {
            dVar.B(serialDescriptor, 6, Y0.f144077a, postalCodePickerConfig.f93011g);
        }
        if (dVar.z(serialDescriptor, 7) || !C17542s.e(postalCodePickerConfig.f93012h, C16877v.n())) {
            dVar.i(serialDescriptor, 7, kSerializerArr[7], postalCodePickerConfig.f93012h);
        }
    }

    public final List<AmbiguousArea> c() {
        return this.f93012h;
    }

    public final String d() {
        return this.f93011g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e() {
        /*
            r1 = this;
            com.ingka.ikea.appconfig.model.ZipInValidation r0 = r1.f93010f
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.b()
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r0 = ""
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.appconfig.model.PostalCodePickerConfig.e():java.lang.String");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostalCodePickerConfig)) {
            return false;
        }
        PostalCodePickerConfig postalCodePickerConfig = (PostalCodePickerConfig) obj;
        return this.f93005a == postalCodePickerConfig.f93005a && this.f93006b == postalCodePickerConfig.f93006b && this.f93007c == postalCodePickerConfig.f93007c && this.f93008d == postalCodePickerConfig.f93008d && this.f93009e == postalCodePickerConfig.f93009e && C17542s.e(this.f93010f, postalCodePickerConfig.f93010f) && C17542s.e(this.f93011g, postalCodePickerConfig.f93011g) && C17542s.e(this.f93012h, postalCodePickerConfig.f93012h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f() {
        /*
            r1 = this;
            com.ingka.ikea.appconfig.model.ZipInValidation r0 = r1.f93010f
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.c()
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r0 = ""
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.appconfig.model.PostalCodePickerConfig.f():java.lang.String");
    }

    public final Pattern g() {
        Pattern compile = Pattern.compile(h());
        C17542s.i(compile, "compile(...)");
        return compile;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f93005a.hashCode() * 31) + Boolean.hashCode(this.f93006b)) * 31) + Boolean.hashCode(this.f93007c)) * 31) + Boolean.hashCode(this.f93008d)) * 31) + Boolean.hashCode(this.f93009e)) * 31;
        ZipInValidation zipInValidation = this.f93010f;
        int i10 = 0;
        int hashCode2 = (hashCode + (zipInValidation == null ? 0 : zipInValidation.hashCode())) * 31;
        String str = this.f93011g;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.f93012h.hashCode();
    }

    public final b i() {
        return this.f93005a;
    }

    public final ZipInValidation j() {
        return this.f93010f;
    }

    public final boolean k() {
        return this.f93006b;
    }

    public final boolean l() {
        return this.f93008d;
    }

    public final boolean m() {
        return this.f93009e;
    }

    public final boolean n() {
        return this.f93007c;
    }

    public String toString() {
        b bVar = this.f93005a;
        boolean z10 = this.f93006b;
        boolean z11 = this.f93007c;
        boolean z12 = this.f93008d;
        boolean z13 = this.f93009e;
        ZipInValidation zipInValidation = this.f93010f;
        String str = this.f93011g;
        List<AmbiguousArea> list = this.f93012h;
        return "PostalCodePickerConfig(type=" + bVar + ", isAutoCompleteEnabled=" + z10 + ", isStreetNumberEnabled=" + z11 + ", isLocationServiceEnabled=" + z12 + ", isStateRequired=" + z13 + ", zipInValidation=" + zipInValidation + ", googleSourceZipCodeKey=" + str + ", ambiguousAreas=" + list + ")";
    }

    public PostalCodePickerConfig(b bVar, boolean z10, boolean z11, boolean z12, boolean z13, ZipInValidation zipInValidation, String str, List<AmbiguousArea> list) {
        C17542s.j(bVar, "type");
        C17542s.j(list, "ambiguousAreas");
        this.f93005a = bVar;
        this.f93006b = z10;
        this.f93007c = z11;
        this.f93008d = z12;
        this.f93009e = z13;
        this.f93010f = zipInValidation;
        this.f93011g = str;
        this.f93012h = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PostalCodePickerConfig(com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b r12, boolean r13, boolean r14, boolean r15, boolean r16, com.ingka.ikea.appconfig.model.ZipInValidation r17, java.lang.String r18, java.util.List r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r9 = r1
            goto L_0x000b
        L_0x0009:
            r9 = r18
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0015
            java.util.List r0 = YH.C16877v.n()
            r10 = r0
            goto L_0x0017
        L_0x0015:
            r10 = r19
        L_0x0017:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.appconfig.model.PostalCodePickerConfig.<init>(com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b, boolean, boolean, boolean, boolean, com.ingka.ikea.appconfig.model.ZipInValidation, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
