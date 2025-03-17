package com.ingka.ikea.prepaidcarddata.impl.data.model.remote;

import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001f\b\b\u0018\u0000 <2\u00020\u0001:\u0004=>?$Bu\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001dR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010%\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001dR \u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010%\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001dR \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010%\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010\u001dR \u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010%\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010%\u0012\u0004\b3\u0010(\u001a\u0004\b)\u0010\u001dR \u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010%\u0012\u0004\b5\u0010(\u001a\u0004\b4\u0010\u001dR \u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00106\u0012\u0004\b8\u0010(\u001a\u0004\b$\u00107R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u00109\u0012\u0004\b;\u0010(\u001a\u0004\b.\u0010:¨\u0006@"}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote;", "", "", "seen0", "", "id", "prepaidCardNumber", "redemptionCode", "qrData", "state", "expiry", "type", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Amount;", "amount", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Images;", "images", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Amount;Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Images;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "j", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getId$annotations", "()V", "b", "e", "getPrepaidCardNumber$annotations", "g", "getRedemptionCode$annotations", "d", "f", "getQrData$annotations", "h", "getState$annotations", "getExpiry$annotations", "i", "getType$annotations", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Amount;", "()Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Amount;", "getAmount$annotations", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Images;", "()Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Images;", "getImages$annotations", "Companion", "Amount", "Images", "$serializer", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PrepaidCardRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f119356a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119357b;

    /* renamed from: c  reason: collision with root package name */
    private final String f119358c;

    /* renamed from: d  reason: collision with root package name */
    private final String f119359d;

    /* renamed from: e  reason: collision with root package name */
    private final String f119360e;

    /* renamed from: f  reason: collision with root package name */
    private final String f119361f;

    /* renamed from: g  reason: collision with root package name */
    private final String f119362g;

    /* renamed from: h  reason: collision with root package name */
    private final Amount f119363h;

    /* renamed from: i  reason: collision with root package name */
    private final Images f119364i;

    @p
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001aB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Amount;", "", "", "seen0", "", "currentFormatted", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Amount;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCurrentFormatted$annotations", "()V", "Companion", "$serializer", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Amount {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f119365a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Amount$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Amount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Amount> serializer() {
                return PrepaidCardRemote$Amount$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Amount(int i10, String str, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, PrepaidCardRemote$Amount$$serializer.INSTANCE.getDescriptor());
            }
            this.f119365a = str;
        }

        public final String a() {
            return this.f119365a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Amount) && C17542s.e(this.f119365a, ((Amount) obj).f119365a);
        }

        public int hashCode() {
            return this.f119365a.hashCode();
        }

        public String toString() {
            String str = this.f119365a;
            return "Amount(currentFormatted=" + str + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001cB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u0012\u0004\b\"\u0010!\u001a\u0004\b\u001c\u0010\u001f¨\u0006%"}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Images;", "", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "portrait", "landscape", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/ImageRemote;Lcom/ingka/ikea/core/remotemodel/ImageRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Images;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "b", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getPortrait$annotations", "()V", "getLandscape$annotations", "Companion", "$serializer", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Images {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final ImageRemote f119366a;

        /* renamed from: b  reason: collision with root package name */
        private final ImageRemote f119367b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Images$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Images;", "serializer", "()Lkotlinx/serialization/KSerializer;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Images> serializer() {
                return PrepaidCardRemote$Images$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Images(int i10, ImageRemote imageRemote, ImageRemote imageRemote2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PrepaidCardRemote$Images$$serializer.INSTANCE.getDescriptor());
            }
            this.f119366a = imageRemote;
            this.f119367b = imageRemote2;
        }

        public static final /* synthetic */ void c(Images images, C17395d dVar, SerialDescriptor serialDescriptor) {
            ImageRemote$$serializer imageRemote$$serializer = ImageRemote$$serializer.INSTANCE;
            dVar.i(serialDescriptor, 0, imageRemote$$serializer, images.f119366a);
            dVar.i(serialDescriptor, 1, imageRemote$$serializer, images.f119367b);
        }

        public final ImageRemote a() {
            return this.f119367b;
        }

        public final ImageRemote b() {
            return this.f119366a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Images)) {
                return false;
            }
            Images images = (Images) obj;
            return C17542s.e(this.f119366a, images.f119366a) && C17542s.e(this.f119367b, images.f119367b);
        }

        public int hashCode() {
            return (this.f119366a.hashCode() * 31) + this.f119367b.hashCode();
        }

        public String toString() {
            ImageRemote imageRemote = this.f119366a;
            ImageRemote imageRemote2 = this.f119367b;
            return "Images(portrait=" + imageRemote + ", landscape=" + imageRemote2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PrepaidCardRemote> serializer() {
            return PrepaidCardRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PrepaidCardRemote(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, Amount amount, Images images, T0 t02) {
        if (511 != (i10 & 511)) {
            E0.b(i10, 511, PrepaidCardRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119356a = str;
        this.f119357b = str2;
        this.f119358c = str3;
        this.f119359d = str4;
        this.f119360e = str5;
        this.f119361f = str6;
        this.f119362g = str7;
        this.f119363h = amount;
        this.f119364i = images;
    }

    public static final /* synthetic */ void j(PrepaidCardRemote prepaidCardRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, prepaidCardRemote.f119356a);
        dVar.y(serialDescriptor, 1, prepaidCardRemote.f119357b);
        dVar.y(serialDescriptor, 2, prepaidCardRemote.f119358c);
        dVar.y(serialDescriptor, 3, prepaidCardRemote.f119359d);
        dVar.y(serialDescriptor, 4, prepaidCardRemote.f119360e);
        dVar.B(serialDescriptor, 5, Y0.f144077a, prepaidCardRemote.f119361f);
        dVar.y(serialDescriptor, 6, prepaidCardRemote.f119362g);
        dVar.i(serialDescriptor, 7, PrepaidCardRemote$Amount$$serializer.INSTANCE, prepaidCardRemote.f119363h);
        dVar.i(serialDescriptor, 8, PrepaidCardRemote$Images$$serializer.INSTANCE, prepaidCardRemote.f119364i);
    }

    public final Amount a() {
        return this.f119363h;
    }

    public final String b() {
        return this.f119361f;
    }

    public final String c() {
        return this.f119356a;
    }

    public final Images d() {
        return this.f119364i;
    }

    public final String e() {
        return this.f119357b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepaidCardRemote)) {
            return false;
        }
        PrepaidCardRemote prepaidCardRemote = (PrepaidCardRemote) obj;
        return C17542s.e(this.f119356a, prepaidCardRemote.f119356a) && C17542s.e(this.f119357b, prepaidCardRemote.f119357b) && C17542s.e(this.f119358c, prepaidCardRemote.f119358c) && C17542s.e(this.f119359d, prepaidCardRemote.f119359d) && C17542s.e(this.f119360e, prepaidCardRemote.f119360e) && C17542s.e(this.f119361f, prepaidCardRemote.f119361f) && C17542s.e(this.f119362g, prepaidCardRemote.f119362g) && C17542s.e(this.f119363h, prepaidCardRemote.f119363h) && C17542s.e(this.f119364i, prepaidCardRemote.f119364i);
    }

    public final String f() {
        return this.f119359d;
    }

    public final String g() {
        return this.f119358c;
    }

    public final String h() {
        return this.f119360e;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f119356a.hashCode() * 31) + this.f119357b.hashCode()) * 31) + this.f119358c.hashCode()) * 31) + this.f119359d.hashCode()) * 31) + this.f119360e.hashCode()) * 31;
        String str = this.f119361f;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f119362g.hashCode()) * 31) + this.f119363h.hashCode()) * 31) + this.f119364i.hashCode();
    }

    public final String i() {
        return this.f119362g;
    }

    public String toString() {
        String str = this.f119356a;
        String str2 = this.f119357b;
        String str3 = this.f119358c;
        String str4 = this.f119359d;
        String str5 = this.f119360e;
        String str6 = this.f119361f;
        String str7 = this.f119362g;
        Amount amount = this.f119363h;
        Images images = this.f119364i;
        return "PrepaidCardRemote(id=" + str + ", prepaidCardNumber=" + str2 + ", redemptionCode=" + str3 + ", qrData=" + str4 + ", state=" + str5 + ", expiry=" + str6 + ", type=" + str7 + ", amount=" + amount + ", images=" + images + ")";
    }
}
