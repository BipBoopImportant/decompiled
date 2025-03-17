package com.ingka.ikea.assemblyservice.impl.data.network.model;

import fK.p;
import iK.C17395d;
import jK.C17438C;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 (2\u00020\u0001:\u0005)*+,\u001eB5\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010#\u001a\u0004\b$\u0010&¨\u0006-"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote;", "", "", "seen0", "", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyDetailsItemRemote;", "items", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyConfigurationRemote;", "configuration", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyConfigurationRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "getItems$annotations", "()V", "b", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyConfigurationRemote;", "()Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyConfigurationRemote;", "getConfiguration$annotations", "Companion", "AssemblyDetailsItemRemote", "PriceRemote", "AssemblyConfigurationRemote", "$serializer", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssemblyServiceDetailsRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f93072c = {new C17451f(AssemblyServiceDetailsRemote$AssemblyDetailsItemRemote$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final List<AssemblyDetailsItemRemote> f93073a;

    /* renamed from: b  reason: collision with root package name */
    private final AssemblyConfigurationRemote f93074b;

    @p
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyConfigurationRemote;", "", "", "seen0", "", "basePrice", "", "basePriceType", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyConfigurationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getBasePrice$annotations", "()V", "b", "Ljava/lang/String;", "getBasePriceType$annotations", "Companion", "$serializer", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AssemblyConfigurationRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Double f93075a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93076b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyConfigurationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyConfigurationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<AssemblyConfigurationRemote> serializer() {
                return AssemblyServiceDetailsRemote$AssemblyConfigurationRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ AssemblyConfigurationRemote(int i10, Double d10, String str, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, AssemblyServiceDetailsRemote$AssemblyConfigurationRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f93075a = d10;
            this.f93076b = str;
        }

        public static final /* synthetic */ void c(AssemblyConfigurationRemote assemblyConfigurationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, C17438C.f144010a, assemblyConfigurationRemote.f93075a);
            dVar.B(serialDescriptor, 1, Y0.f144077a, assemblyConfigurationRemote.f93076b);
        }

        public final Double a() {
            return this.f93075a;
        }

        public final String b() {
            return this.f93076b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssemblyConfigurationRemote)) {
                return false;
            }
            AssemblyConfigurationRemote assemblyConfigurationRemote = (AssemblyConfigurationRemote) obj;
            return C17542s.e(this.f93075a, assemblyConfigurationRemote.f93075a) && C17542s.e(this.f93076b, assemblyConfigurationRemote.f93076b);
        }

        public int hashCode() {
            Double d10 = this.f93075a;
            int i10 = 0;
            int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            String str = this.f93076b;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Double d10 = this.f93075a;
            String str = this.f93076b;
            return "AssemblyConfigurationRemote(basePrice=" + d10 + ", basePriceType=" + str + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 '2\u00020\u0001:\u0002(\u001dB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u0016R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010 \u001a\u0004\b#\u0010$R \u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\"\u0012\u0004\b&\u0010 \u001a\u0004\b!\u0010$¨\u0006)"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyDetailsItemRemote;", "", "", "seen0", "", "itemNo", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$PriceRemote;", "unitPrice", "subTotalPrice", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$PriceRemote;Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$PriceRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyDetailsItemRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getItemNo$annotations", "()V", "b", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$PriceRemote;", "c", "()Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$PriceRemote;", "getUnitPrice$annotations", "getSubTotalPrice$annotations", "Companion", "$serializer", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AssemblyDetailsItemRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93077a;

        /* renamed from: b  reason: collision with root package name */
        private final PriceRemote f93078b;

        /* renamed from: c  reason: collision with root package name */
        private final PriceRemote f93079c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyDetailsItemRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$AssemblyDetailsItemRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<AssemblyDetailsItemRemote> serializer() {
                return AssemblyServiceDetailsRemote$AssemblyDetailsItemRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ AssemblyDetailsItemRemote(int i10, String str, PriceRemote priceRemote, PriceRemote priceRemote2, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, AssemblyServiceDetailsRemote$AssemblyDetailsItemRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f93077a = str;
            this.f93078b = priceRemote;
            this.f93079c = priceRemote2;
        }

        public static final /* synthetic */ void d(AssemblyDetailsItemRemote assemblyDetailsItemRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, assemblyDetailsItemRemote.f93077a);
            AssemblyServiceDetailsRemote$PriceRemote$$serializer assemblyServiceDetailsRemote$PriceRemote$$serializer = AssemblyServiceDetailsRemote$PriceRemote$$serializer.INSTANCE;
            dVar.i(serialDescriptor, 1, assemblyServiceDetailsRemote$PriceRemote$$serializer, assemblyDetailsItemRemote.f93078b);
            dVar.i(serialDescriptor, 2, assemblyServiceDetailsRemote$PriceRemote$$serializer, assemblyDetailsItemRemote.f93079c);
        }

        public final String a() {
            return this.f93077a;
        }

        public final PriceRemote b() {
            return this.f93079c;
        }

        public final PriceRemote c() {
            return this.f93078b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssemblyDetailsItemRemote)) {
                return false;
            }
            AssemblyDetailsItemRemote assemblyDetailsItemRemote = (AssemblyDetailsItemRemote) obj;
            return C17542s.e(this.f93077a, assemblyDetailsItemRemote.f93077a) && C17542s.e(this.f93078b, assemblyDetailsItemRemote.f93078b) && C17542s.e(this.f93079c, assemblyDetailsItemRemote.f93079c);
        }

        public int hashCode() {
            return (((this.f93077a.hashCode() * 31) + this.f93078b.hashCode()) * 31) + this.f93079c.hashCode();
        }

        public String toString() {
            String str = this.f93077a;
            PriceRemote priceRemote = this.f93078b;
            PriceRemote priceRemote2 = this.f93079c;
            return "AssemblyDetailsItemRemote(itemNo=" + str + ", unitPrice=" + priceRemote + ", subTotalPrice=" + priceRemote2 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001cB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u0012\u0004\b\"\u0010!\u001a\u0004\b\u001c\u0010\u001f¨\u0006%"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$PriceRemote;", "", "", "seen0", "", "inclTax", "exclTax", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$PriceRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "getInclTax$annotations", "()V", "getExclTax$annotations", "Companion", "$serializer", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PriceRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Double f93080a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f93081b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$PriceRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$PriceRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<PriceRemote> serializer() {
                return AssemblyServiceDetailsRemote$PriceRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PriceRemote(int i10, Double d10, Double d11, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, AssemblyServiceDetailsRemote$PriceRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f93080a = d10;
            this.f93081b = d11;
        }

        public static final /* synthetic */ void c(PriceRemote priceRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            C17438C c10 = C17438C.f144010a;
            dVar.B(serialDescriptor, 0, c10, priceRemote.f93080a);
            dVar.B(serialDescriptor, 1, c10, priceRemote.f93081b);
        }

        public final Double a() {
            return this.f93081b;
        }

        public final Double b() {
            return this.f93080a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceRemote)) {
                return false;
            }
            PriceRemote priceRemote = (PriceRemote) obj;
            return C17542s.e(this.f93080a, priceRemote.f93080a) && C17542s.e(this.f93081b, priceRemote.f93081b);
        }

        public int hashCode() {
            Double d10 = this.f93080a;
            int i10 = 0;
            int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            Double d11 = this.f93081b;
            if (d11 != null) {
                i10 = d11.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Double d10 = this.f93080a;
            Double d11 = this.f93081b;
            return "PriceRemote(inclTax=" + d10 + ", exclTax=" + d11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/assemblyservice/impl/data/network/model/AssemblyServiceDetailsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "assemblyservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<AssemblyServiceDetailsRemote> serializer() {
            return AssemblyServiceDetailsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AssemblyServiceDetailsRemote(int i10, List list, AssemblyConfigurationRemote assemblyConfigurationRemote, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, AssemblyServiceDetailsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f93073a = list;
        this.f93074b = assemblyConfigurationRemote;
    }

    public static final /* synthetic */ void d(AssemblyServiceDetailsRemote assemblyServiceDetailsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f93072c[0], assemblyServiceDetailsRemote.f93073a);
        dVar.B(serialDescriptor, 1, AssemblyServiceDetailsRemote$AssemblyConfigurationRemote$$serializer.INSTANCE, assemblyServiceDetailsRemote.f93074b);
    }

    public final AssemblyConfigurationRemote b() {
        return this.f93074b;
    }

    public final List<AssemblyDetailsItemRemote> c() {
        return this.f93073a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssemblyServiceDetailsRemote)) {
            return false;
        }
        AssemblyServiceDetailsRemote assemblyServiceDetailsRemote = (AssemblyServiceDetailsRemote) obj;
        return C17542s.e(this.f93073a, assemblyServiceDetailsRemote.f93073a) && C17542s.e(this.f93074b, assemblyServiceDetailsRemote.f93074b);
    }

    public int hashCode() {
        int hashCode = this.f93073a.hashCode() * 31;
        AssemblyConfigurationRemote assemblyConfigurationRemote = this.f93074b;
        return hashCode + (assemblyConfigurationRemote == null ? 0 : assemblyConfigurationRemote.hashCode());
    }

    public String toString() {
        List<AssemblyDetailsItemRemote> list = this.f93073a;
        AssemblyConfigurationRemote assemblyConfigurationRemote = this.f93074b;
        return "AssemblyServiceDetailsRemote(items=" + list + ", configuration=" + assemblyConfigurationRemote + ")";
    }
}
