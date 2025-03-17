package com.ingka.ikea.mcomsettings.impl.network;

import HJ.C15854t;
import com.ingka.ikea.mcomsettings.impl.EmployeeDiscountConfig;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\b\u0018\u0000 /2\u00020\u0001:\u0004012\u0017B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010%\u001a\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote;", "", "", "seen0", "", "enabled", "Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$CardRemote;", "card", "Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$ReadMoreRemote;", "readMore", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$CardRemote;Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$ReadMoreRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig;", "a", "()Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "getEnabled$annotations", "()V", "Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$CardRemote;", "getCard", "()Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$CardRemote;", "getCard$annotations", "c", "Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$ReadMoreRemote;", "getReadMore", "()Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$ReadMoreRemote;", "getReadMore$annotations", "Companion", "CardRemote", "ReadMoreRemote", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmployeeDiscountRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f96690a;

    /* renamed from: b  reason: collision with root package name */
    private final CardRemote f96691b;

    /* renamed from: c  reason: collision with root package name */
    private final ReadMoreRemote f96692c;

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"\u001bB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u0012\u0004\b \u0010\u001f\u001a\u0004\b\u001b\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$CardRemote;", "", "", "seen0", "", "title", "description", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$CardRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getTitle$annotations", "()V", "getDescription$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96693a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96694b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$CardRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$CardRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<CardRemote> serializer() {
                return EmployeeDiscountRemote$CardRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CardRemote(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, EmployeeDiscountRemote$CardRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96693a = str;
            this.f96694b = str2;
        }

        public static final /* synthetic */ void c(CardRemote cardRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, cardRemote.f96693a);
            dVar.B(serialDescriptor, 1, y02, cardRemote.f96694b);
        }

        public final String a() {
            return this.f96694b;
        }

        public final String b() {
            return this.f96693a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardRemote)) {
                return false;
            }
            CardRemote cardRemote = (CardRemote) obj;
            return C17542s.e(this.f96693a, cardRemote.f96693a) && C17542s.e(this.f96694b, cardRemote.f96694b);
        }

        public int hashCode() {
            String str = this.f96693a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f96694b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f96693a;
            String str2 = this.f96694b;
            return "CardRemote(title=" + str + ", description=" + str2 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001d\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b#\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$ReadMoreRemote;", "", "", "seen0", "", "imageUrl", "title", "terms", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$ReadMoreRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getImageUrl$annotations", "()V", "b", "c", "getTitle$annotations", "getTerms$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReadMoreRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96695a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96696b;

        /* renamed from: c  reason: collision with root package name */
        private final String f96697c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$ReadMoreRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$ReadMoreRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ReadMoreRemote> serializer() {
                return EmployeeDiscountRemote$ReadMoreRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ReadMoreRemote(int i10, String str, String str2, String str3, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, EmployeeDiscountRemote$ReadMoreRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96695a = str;
            this.f96696b = str2;
            this.f96697c = str3;
        }

        public static final /* synthetic */ void d(ReadMoreRemote readMoreRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, readMoreRemote.f96695a);
            dVar.B(serialDescriptor, 1, y02, readMoreRemote.f96696b);
            dVar.B(serialDescriptor, 2, y02, readMoreRemote.f96697c);
        }

        public final String a() {
            return this.f96695a;
        }

        public final String b() {
            return this.f96697c;
        }

        public final String c() {
            return this.f96696b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReadMoreRemote)) {
                return false;
            }
            ReadMoreRemote readMoreRemote = (ReadMoreRemote) obj;
            return C17542s.e(this.f96695a, readMoreRemote.f96695a) && C17542s.e(this.f96696b, readMoreRemote.f96696b) && C17542s.e(this.f96697c, readMoreRemote.f96697c);
        }

        public int hashCode() {
            String str = this.f96695a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f96696b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f96697c;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f96695a;
            String str2 = this.f96696b;
            String str3 = this.f96697c;
            return "ReadMoreRemote(imageUrl=" + str + ", title=" + str2 + ", terms=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<EmployeeDiscountRemote> serializer() {
            return EmployeeDiscountRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EmployeeDiscountRemote(int i10, Boolean bool, CardRemote cardRemote, ReadMoreRemote readMoreRemote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, EmployeeDiscountRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96690a = bool;
        this.f96691b = cardRemote;
        this.f96692c = readMoreRemote;
    }

    public static final /* synthetic */ void b(EmployeeDiscountRemote employeeDiscountRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, C17457i.f144111a, employeeDiscountRemote.f96690a);
        dVar.B(serialDescriptor, 1, EmployeeDiscountRemote$CardRemote$$serializer.INSTANCE, employeeDiscountRemote.f96691b);
        dVar.B(serialDescriptor, 2, EmployeeDiscountRemote$ReadMoreRemote$$serializer.INSTANCE, employeeDiscountRemote.f96692c);
    }

    public final EmployeeDiscountConfig a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Class<EmployeeDiscountRemote> cls;
        String str7;
        String str8;
        String str9;
        String str10;
        CardRemote cardRemote = this.f96691b;
        String str11 = "";
        if (cardRemote == null || (str = cardRemote.b()) == null) {
            str = str11;
        }
        CardRemote cardRemote2 = this.f96691b;
        if (cardRemote2 == null || (str2 = cardRemote2.a()) == null) {
            str2 = str11;
        }
        int length = str.length();
        String str12 = DslKt.INDICATOR_BACKGROUND;
        String str13 = DslKt.INDICATOR_MAIN;
        Class<EmployeeDiscountRemote> cls2 = EmployeeDiscountRemote.class;
        if (length == 0 || str2.length() == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("title or description is null or empty");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str14 = null;
            String str15 = null;
            for (C11819b bVar : arrayList) {
                if (str14 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str14 = C11820c.a(a10);
                }
                if (str15 == null) {
                    String name = cls2.getName();
                    C17542s.g(name);
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str15 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str8 : str9) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                }
                bVar.a(eVar, str15, false, illegalArgumentException, str14);
                str11 = str10;
                str12 = str9;
                str13 = str8;
            }
        }
        String str16 = str11;
        String str17 = str12;
        String str18 = str13;
        ReadMoreRemote readMoreRemote = this.f96692c;
        if (readMoreRemote == null || (str3 = readMoreRemote.a()) == null) {
            str3 = str16;
        }
        ReadMoreRemote readMoreRemote2 = this.f96692c;
        if (readMoreRemote2 == null || (str4 = readMoreRemote2.c()) == null) {
            str4 = str16;
        }
        ReadMoreRemote readMoreRemote3 = this.f96692c;
        if (readMoreRemote3 == null || (str5 = readMoreRemote3.b()) == null) {
            str5 = str16;
        }
        if (str3.length() == 0 || str4.length() == 0 || str5.length() == 0) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("read more image, title or terms is null or empty");
            e eVar2 = e.ERROR;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = d.f102012a.a().iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                Iterator it2 = it;
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
                it = it2;
            }
            Iterator it3 = arrayList2.iterator();
            String str19 = null;
            String str20 = null;
            while (it3.hasNext()) {
                C11819b bVar2 = (C11819b) it3.next();
                Iterator it4 = it3;
                if (str19 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException2);
                    if (a11 == null) {
                        break;
                    }
                    str19 = C11820c.a(a11);
                }
                if (str20 == null) {
                    String name2 = cls2.getName();
                    C17542s.g(name2);
                    str6 = str3;
                    cls = cls2;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str18 : str17) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    str6 = str3;
                    cls = cls2;
                    str7 = str20;
                }
                bVar2.a(eVar2, str7, false, illegalArgumentException2, str19);
                str20 = str7;
                it3 = it4;
                cls2 = cls;
                str3 = str6;
            }
        }
        String str21 = str3;
        Boolean bool = this.f96690a;
        return new EmployeeDiscountConfig(bool != null ? bool.booleanValue() : false, new EmployeeDiscountConfig.Card(str, str2), new EmployeeDiscountConfig.ReadMore(str21, str4, str5));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmployeeDiscountRemote)) {
            return false;
        }
        EmployeeDiscountRemote employeeDiscountRemote = (EmployeeDiscountRemote) obj;
        return C17542s.e(this.f96690a, employeeDiscountRemote.f96690a) && C17542s.e(this.f96691b, employeeDiscountRemote.f96691b) && C17542s.e(this.f96692c, employeeDiscountRemote.f96692c);
    }

    public int hashCode() {
        Boolean bool = this.f96690a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        CardRemote cardRemote = this.f96691b;
        int hashCode2 = (hashCode + (cardRemote == null ? 0 : cardRemote.hashCode())) * 31;
        ReadMoreRemote readMoreRemote = this.f96692c;
        if (readMoreRemote != null) {
            i10 = readMoreRemote.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        Boolean bool = this.f96690a;
        CardRemote cardRemote = this.f96691b;
        ReadMoreRemote readMoreRemote = this.f96692c;
        return "EmployeeDiscountRemote(enabled=" + bool + ", card=" + cardRemote + ", readMore=" + readMoreRemote + ")";
    }
}
