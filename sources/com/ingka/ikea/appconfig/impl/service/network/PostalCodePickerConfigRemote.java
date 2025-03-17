package com.ingka.ikea.appconfig.impl.service.network;

import HJ.C15854t;
import XH.C16807N;
import YH.C16877v;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.appconfig.model.ZipInValidation;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
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

@p
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\b\u0018\u0000 B2\u00020\u0001:\u0005CDEF(Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b\u0007\u0010.R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010-\u0012\u0004\b0\u0010,\u001a\u0004\b\b\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010-\u0012\u0004\b2\u0010,\u001a\u0004\b\t\u0010.R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010-\u0012\u0004\b4\u0010,\u001a\u0004\b\n\u0010.R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010,\u001a\u0004\b7\u00108R(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010,\u001a\u0004\b<\u0010=R(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010;\u0012\u0004\bA\u0010,\u001a\u0004\b@\u0010=¨\u0006G"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote;", "", "", "seen0", "", "type", "", "isAutoCompleteEnabled", "isStreetNumberEnabled", "isLocationServiceEnabled", "isStateRequired", "Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$ZipInValidationRemote;", "zipInValidation", "", "Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$AmbiguousAreaRemote;", "ambiguousAreaRemote", "Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$Data;", "data", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$ZipInValidationRemote;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "b", "()Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isAutoCompleteEnabled$annotations", "isStreetNumberEnabled$annotations", "d", "isLocationServiceEnabled$annotations", "e", "isStateRequired$annotations", "f", "Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$ZipInValidationRemote;", "getZipInValidation", "()Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$ZipInValidationRemote;", "getZipInValidation$annotations", "g", "Ljava/util/List;", "getAmbiguousAreaRemote", "()Ljava/util/List;", "getAmbiguousAreaRemote$annotations", "h", "getData", "getData$annotations", "Companion", "ZipInValidationRemote", "AmbiguousAreaRemote", "Data", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PostalCodePickerConfigRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f92954i = {null, null, null, null, null, null, new C17451f(PostalCodePickerConfigRemote$AmbiguousAreaRemote$$serializer.INSTANCE), new C17451f(PostalCodePickerConfigRemote$Data$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f92955a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f92956b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f92957c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f92958d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f92959e;

    /* renamed from: f  reason: collision with root package name */
    private final ZipInValidationRemote f92960f;

    /* renamed from: g  reason: collision with root package name */
    private final List<AmbiguousAreaRemote> f92961g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Data> f92962h;

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u0000 .2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002/\u0017BC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010!\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010$\u001a\u0004\b\n\u0010,¨\u00060"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$AmbiguousAreaRemote;", "Lpp/b;", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$AmbiguousArea;", "", "seen0", "", "infoText", "areaText", "areaCode", "", "isContinueEnabled", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$AmbiguousAreaRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig$AmbiguousArea;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInfoText", "getInfoText$annotations", "()V", "getAreaText", "getAreaText$annotations", "c", "getAreaCode", "getAreaCode$annotations", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isContinueEnabled$annotations", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AmbiguousAreaRemote implements C11768b<PostalCodePickerConfig.AmbiguousArea> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f92963a;

        /* renamed from: b  reason: collision with root package name */
        private final String f92964b;

        /* renamed from: c  reason: collision with root package name */
        private final String f92965c;

        /* renamed from: d  reason: collision with root package name */
        private final Boolean f92966d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$AmbiguousAreaRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$AmbiguousAreaRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<AmbiguousAreaRemote> serializer() {
                return PostalCodePickerConfigRemote$AmbiguousAreaRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ AmbiguousAreaRemote(int i10, String str, String str2, String str3, Boolean bool, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, PostalCodePickerConfigRemote$AmbiguousAreaRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f92963a = str;
            this.f92964b = str2;
            this.f92965c = str3;
            this.f92966d = bool;
        }

        public static final /* synthetic */ void b(AmbiguousAreaRemote ambiguousAreaRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, ambiguousAreaRemote.f92963a);
            dVar.B(serialDescriptor, 1, y02, ambiguousAreaRemote.f92964b);
            dVar.B(serialDescriptor, 2, y02, ambiguousAreaRemote.f92965c);
            dVar.B(serialDescriptor, 3, C17457i.f144111a, ambiguousAreaRemote.f92966d);
        }

        public PostalCodePickerConfig.AmbiguousArea a() {
            String str = this.f92963a;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (!C15854t.v0(str)) {
                String str2 = this.f92964b;
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                } else if (!C15854t.v0(str2)) {
                    String str3 = this.f92965c;
                    if (str3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    } else if (!C15854t.v0(str3)) {
                        C16807N n10 = C16807N.f139792a;
                        Boolean bool = this.f92966d;
                        return new PostalCodePickerConfig.AmbiguousArea(str, str2, str3, bool != null ? bool.booleanValue() : true);
                    } else {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmbiguousAreaRemote)) {
                return false;
            }
            AmbiguousAreaRemote ambiguousAreaRemote = (AmbiguousAreaRemote) obj;
            return C17542s.e(this.f92963a, ambiguousAreaRemote.f92963a) && C17542s.e(this.f92964b, ambiguousAreaRemote.f92964b) && C17542s.e(this.f92965c, ambiguousAreaRemote.f92965c) && C17542s.e(this.f92966d, ambiguousAreaRemote.f92966d);
        }

        public int hashCode() {
            String str = this.f92963a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f92964b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f92965c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.f92966d;
            if (bool != null) {
                i10 = bool.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            String str = this.f92963a;
            String str2 = this.f92964b;
            String str3 = this.f92965c;
            Boolean bool = this.f92966d;
            return "AmbiguousAreaRemote(infoText=" + str + ", areaText=" + str2 + ", areaCode=" + str3 + ", isContinueEnabled=" + bool + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 !2\u00020\u0001:\u0002\u001b\"B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$Data;", "", "", "seen0", "", "key", "value", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$Data;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey$annotations", "()V", "b", "getValue$annotations", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f92967a;

        /* renamed from: b  reason: collision with root package name */
        private final String f92968b;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$Data$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$Data;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "GOOGLE_SOURCE_ZIP_CODE_KEY", "Ljava/lang/String;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Data> serializer() {
                return PostalCodePickerConfigRemote$Data$$serializer.INSTANCE;
            }

            private a() {
            }
        }

        public /* synthetic */ Data(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PostalCodePickerConfigRemote$Data$$serializer.INSTANCE.getDescriptor());
            }
            this.f92967a = str;
            this.f92968b = str2;
        }

        public static final /* synthetic */ void c(Data data, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, data.f92967a);
            dVar.B(serialDescriptor, 1, y02, data.f92968b);
        }

        public final String a() {
            return this.f92967a;
        }

        public final String b() {
            return this.f92968b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return C17542s.e(this.f92967a, data.f92967a) && C17542s.e(this.f92968b, data.f92968b);
        }

        public int hashCode() {
            String str = this.f92967a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f92968b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f92967a;
            String str2 = this.f92968b;
            return "Data(key=" + str + ", value=" + str2 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-\u0016BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010 \u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010 \u0012\u0004\b+\u0010#\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$ZipInValidationRemote;", "", "", "seen0", "", "hint", "validation", "keyboardType", "cursorFocus", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$ZipInValidationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/appconfig/model/ZipInValidation;", "a", "()Lcom/ingka/ikea/appconfig/model/ZipInValidation;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHint", "getHint$annotations", "()V", "getValidation", "getValidation$annotations", "c", "getKeyboardType", "getKeyboardType$annotations", "d", "getCursorFocus", "getCursorFocus$annotations", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZipInValidationRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f92969a;

        /* renamed from: b  reason: collision with root package name */
        private final String f92970b;

        /* renamed from: c  reason: collision with root package name */
        private final String f92971c;

        /* renamed from: d  reason: collision with root package name */
        private final String f92972d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$ZipInValidationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$ZipInValidationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ZipInValidationRemote> serializer() {
                return PostalCodePickerConfigRemote$ZipInValidationRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ZipInValidationRemote(int i10, String str, String str2, String str3, String str4, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, PostalCodePickerConfigRemote$ZipInValidationRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f92969a = str;
            this.f92970b = str2;
            this.f92971c = str3;
            this.f92972d = str4;
        }

        public static final /* synthetic */ void b(ZipInValidationRemote zipInValidationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, zipInValidationRemote.f92969a);
            dVar.B(serialDescriptor, 1, y02, zipInValidationRemote.f92970b);
            dVar.B(serialDescriptor, 2, y02, zipInValidationRemote.f92971c);
            dVar.B(serialDescriptor, 3, y02, zipInValidationRemote.f92972d);
        }

        public final ZipInValidation a() {
            if (this.f92969a != null && this.f92970b != null && this.f92971c != null) {
                return new ZipInValidation(this.f92969a, this.f92970b, this.f92971c, this.f92972d);
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing required values: " + this);
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
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = ZipInValidationRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar.a(eVar, str3, false, illegalArgumentException, str);
                str2 = str3;
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZipInValidationRemote)) {
                return false;
            }
            ZipInValidationRemote zipInValidationRemote = (ZipInValidationRemote) obj;
            return C17542s.e(this.f92969a, zipInValidationRemote.f92969a) && C17542s.e(this.f92970b, zipInValidationRemote.f92970b) && C17542s.e(this.f92971c, zipInValidationRemote.f92971c) && C17542s.e(this.f92972d, zipInValidationRemote.f92972d);
        }

        public int hashCode() {
            String str = this.f92969a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f92970b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f92971c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f92972d;
            if (str4 != null) {
                i10 = str4.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            String str = this.f92969a;
            String str2 = this.f92970b;
            String str3 = this.f92971c;
            String str4 = this.f92972d;
            return "ZipInValidationRemote(hint=" + str + ", validation=" + str2 + ", keyboardType=" + str3 + ", cursorFocus=" + str4 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/PostalCodePickerConfigRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PostalCodePickerConfigRemote> serializer() {
            return PostalCodePickerConfigRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PostalCodePickerConfigRemote(int i10, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ZipInValidationRemote zipInValidationRemote, List list, List list2, T0 t02) {
        if (255 != (i10 & 255)) {
            E0.b(i10, 255, PostalCodePickerConfigRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92955a = str;
        this.f92956b = bool;
        this.f92957c = bool2;
        this.f92958d = bool3;
        this.f92959e = bool4;
        this.f92960f = zipInValidationRemote;
        this.f92961g = list;
        this.f92962h = list2;
    }

    public static final /* synthetic */ void c(PostalCodePickerConfigRemote postalCodePickerConfigRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f92954i;
        dVar.B(serialDescriptor, 0, Y0.f144077a, postalCodePickerConfigRemote.f92955a);
        C17457i iVar = C17457i.f144111a;
        dVar.B(serialDescriptor, 1, iVar, postalCodePickerConfigRemote.f92956b);
        dVar.B(serialDescriptor, 2, iVar, postalCodePickerConfigRemote.f92957c);
        dVar.B(serialDescriptor, 3, iVar, postalCodePickerConfigRemote.f92958d);
        dVar.B(serialDescriptor, 4, iVar, postalCodePickerConfigRemote.f92959e);
        dVar.B(serialDescriptor, 5, PostalCodePickerConfigRemote$ZipInValidationRemote$$serializer.INSTANCE, postalCodePickerConfigRemote.f92960f);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], postalCodePickerConfigRemote.f92961g);
        dVar.B(serialDescriptor, 7, kSerializerArr[7], postalCodePickerConfigRemote.f92962h);
    }

    public final PostalCodePickerConfig b() {
        ArrayList arrayList;
        String str;
        Object obj;
        PostalCodePickerConfig.b a10 = PostalCodePickerConfig.b.Companion.a(this.f92955a);
        if (C17542s.e(this.f92959e, Boolean.TRUE) && a10 != PostalCodePickerConfig.b.MANUAL) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Illegal combination of isStateRequired and " + a10);
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
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 == null) {
                        break;
                    }
                    str2 = C11820c.a(a11);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = PostalCodePickerConfigRemote.class.getName();
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
        }
        Boolean bool = this.f92956b;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = this.f92957c;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = this.f92958d;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = this.f92959e;
        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        ZipInValidationRemote zipInValidationRemote = this.f92960f;
        ZipInValidation a12 = zipInValidationRemote != null ? zipInValidationRemote.a() : null;
        List<AmbiguousAreaRemote> list = this.f92961g;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (AmbiguousAreaRemote a13 : list) {
                PostalCodePickerConfig.AmbiguousArea a14 = a13.a();
                if (a14 != null) {
                    arrayList3.add(a14);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = C16877v.n();
        }
        List<Data> list2 = this.f92962h;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((Data) obj).a(), "googleSourceZipCodeKey")) {
                    break;
                }
            }
            Data data = (Data) obj;
            if (data != null) {
                str = data.b();
                return new PostalCodePickerConfig(a10, booleanValue, booleanValue2, booleanValue3, booleanValue4, a12, str, arrayList);
            }
        }
        str = null;
        return new PostalCodePickerConfig(a10, booleanValue, booleanValue2, booleanValue3, booleanValue4, a12, str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostalCodePickerConfigRemote)) {
            return false;
        }
        PostalCodePickerConfigRemote postalCodePickerConfigRemote = (PostalCodePickerConfigRemote) obj;
        return C17542s.e(this.f92955a, postalCodePickerConfigRemote.f92955a) && C17542s.e(this.f92956b, postalCodePickerConfigRemote.f92956b) && C17542s.e(this.f92957c, postalCodePickerConfigRemote.f92957c) && C17542s.e(this.f92958d, postalCodePickerConfigRemote.f92958d) && C17542s.e(this.f92959e, postalCodePickerConfigRemote.f92959e) && C17542s.e(this.f92960f, postalCodePickerConfigRemote.f92960f) && C17542s.e(this.f92961g, postalCodePickerConfigRemote.f92961g) && C17542s.e(this.f92962h, postalCodePickerConfigRemote.f92962h);
    }

    public int hashCode() {
        String str = this.f92955a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f92956b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f92957c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f92958d;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f92959e;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        ZipInValidationRemote zipInValidationRemote = this.f92960f;
        int hashCode6 = (hashCode5 + (zipInValidationRemote == null ? 0 : zipInValidationRemote.hashCode())) * 31;
        List<AmbiguousAreaRemote> list = this.f92961g;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<Data> list2 = this.f92962h;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode7 + i10;
    }

    public String toString() {
        String str = this.f92955a;
        Boolean bool = this.f92956b;
        Boolean bool2 = this.f92957c;
        Boolean bool3 = this.f92958d;
        Boolean bool4 = this.f92959e;
        ZipInValidationRemote zipInValidationRemote = this.f92960f;
        List<AmbiguousAreaRemote> list = this.f92961g;
        List<Data> list2 = this.f92962h;
        return "PostalCodePickerConfigRemote(type=" + str + ", isAutoCompleteEnabled=" + bool + ", isStreetNumberEnabled=" + bool2 + ", isLocationServiceEnabled=" + bool3 + ", isStateRequired=" + bool4 + ", zipInValidation=" + zipInValidationRemote + ", ambiguousAreaRemote=" + list + ", data=" + list2 + ")";
    }
}
