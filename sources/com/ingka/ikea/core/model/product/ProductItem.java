package com.ingka.ikea.core.model.product;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16877v;
import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Image$$serializer;
import com.ingka.ikea.core.model.Link;
import fI.C17221b;
import fK.C17261n;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.E0;
import jK.J;
import jK.T0;
import jK.Y0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11694e;
import op.C11701l;
import op.C11703n;
import uI.C18055d;

@p
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b!\b\b\u0018\u0000 E2\u00020\u0001:\tFGHI5JKL0Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0015¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b+\u0010(J\u001a\u0010.\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b5\u0010;R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u0010=\u001a\u0004\b<\u0010>R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b4\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006¢\u0006\f\n\u0004\b7\u0010?\u001a\u0004\b3\u0010AR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b@\u0010B\u001a\u0004\bC\u0010D¨\u0006M"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem;", "Landroid/os/Parcelable;", "", "itemNo", "itemType", "Lcom/ingka/ikea/core/model/product/Badge;", "productBadge", "Lcom/ingka/ikea/core/model/Image;", "image", "contextualImage", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "info", "", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;", "productDisclaimers", "Lcom/ingka/ikea/core/model/product/ProductItem$Availability;", "availability", "", "isOnlineSellable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/Badge;Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;Ljava/util/List;Ljava/util/List;Z)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/Badge;Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;Ljava/util/List;Ljava/util/List;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "k", "(Lcom/ingka/ikea/core/model/product/ProductItem;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "g", "c", "Lcom/ingka/ikea/core/model/product/Badge;", "h", "()Lcom/ingka/ikea/core/model/product/Badge;", "d", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "e", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "()Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "Ljava/util/List;", "i", "()Ljava/util/List;", "Z", "j", "()Z", "Companion", "ProductInfo", "ProductItemHighlight", "Price", "Availability", "ProductDisclaimer", "EnergyClassDisclaimer", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductItem implements Parcelable {
    public static final Parcelable.Creator<ProductItem> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final KSerializer<Object>[] f95063j = {null, null, null, null, null, null, new C17451f(ProductItem$ProductDisclaimer$$serializer.INSTANCE), new C17451f(ProductItem$Availability$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final String f95064a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95065b;

    /* renamed from: c  reason: collision with root package name */
    private final Badge f95066c;

    /* renamed from: d  reason: collision with root package name */
    private final Image f95067d;

    /* renamed from: e  reason: collision with root package name */
    private final Image f95068e;

    /* renamed from: f  reason: collision with root package name */
    private final ProductInfo f95069f;

    /* renamed from: g  reason: collision with root package name */
    private final List<ProductDisclaimer> f95070g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Availability> f95071h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f95072i;

    @p
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 62\u00020\u0001:\u00027)B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b/\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00105¨\u00068"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Availability;", "Landroid/os/Parcelable;", "", "prefix", "Lop/n;", "status", "store", "suffix", "text", "Lcom/ingka/ikea/core/model/product/AvailabilityType;", "type", "<init>", "(Ljava/lang/String;Lop/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/AvailabilityType;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Lop/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/AvailabilityType;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/core/model/product/ProductItem$Availability;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPrefix", "b", "Lop/n;", "()Lop/n;", "c", "getStore", "d", "getSuffix", "f", "Lcom/ingka/ikea/core/model/product/AvailabilityType;", "()Lcom/ingka/ikea/core/model/product/AvailabilityType;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Availability implements Parcelable {
        public static final Parcelable.Creator<Availability> CREATOR = new b();
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final KSerializer<Object>[] f95073g = {null, J.b("com.ingka.ikea.core.model.product.StockStatus", C11703n.values()), null, null, null, J.b("com.ingka.ikea.core.model.product.AvailabilityType", AvailabilityType.values())};

        /* renamed from: a  reason: collision with root package name */
        private final String f95074a;

        /* renamed from: b  reason: collision with root package name */
        private final C11703n f95075b;

        /* renamed from: c  reason: collision with root package name */
        private final String f95076c;

        /* renamed from: d  reason: collision with root package name */
        private final String f95077d;

        /* renamed from: e  reason: collision with root package name */
        private final String f95078e;

        /* renamed from: f  reason: collision with root package name */
        private final AvailabilityType f95079f;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Availability$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$Availability;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Availability> serializer() {
                return ProductItem$Availability$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Availability> {
            /* renamed from: a */
            public final Availability createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new Availability(parcel.readString(), C11703n.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), AvailabilityType.valueOf(parcel.readString()));
            }

            /* renamed from: b */
            public final Availability[] newArray(int i10) {
                return new Availability[i10];
            }
        }

        public /* synthetic */ Availability(int i10, String str, C11703n nVar, String str2, String str3, String str4, AvailabilityType availabilityType, T0 t02) {
            if (63 != (i10 & 63)) {
                E0.b(i10, 63, ProductItem$Availability$$serializer.INSTANCE.getDescriptor());
            }
            this.f95074a = str;
            this.f95075b = nVar;
            this.f95076c = str2;
            this.f95077d = str3;
            this.f95078e = str4;
            this.f95079f = availabilityType;
        }

        public static final /* synthetic */ void e(Availability availability, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f95073g;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, availability.f95074a);
            dVar.i(serialDescriptor, 1, kSerializerArr[1], availability.f95075b);
            dVar.B(serialDescriptor, 2, y02, availability.f95076c);
            dVar.B(serialDescriptor, 3, y02, availability.f95077d);
            dVar.B(serialDescriptor, 4, y02, availability.f95078e);
            dVar.i(serialDescriptor, 5, kSerializerArr[5], availability.f95079f);
        }

        public final C11703n b() {
            return this.f95075b;
        }

        public final String c() {
            return this.f95078e;
        }

        public final AvailabilityType d() {
            return this.f95079f;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Availability)) {
                return false;
            }
            Availability availability = (Availability) obj;
            return C17542s.e(this.f95074a, availability.f95074a) && this.f95075b == availability.f95075b && C17542s.e(this.f95076c, availability.f95076c) && C17542s.e(this.f95077d, availability.f95077d) && C17542s.e(this.f95078e, availability.f95078e) && this.f95079f == availability.f95079f;
        }

        public int hashCode() {
            String str = this.f95074a;
            int i10 = 0;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f95075b.hashCode()) * 31;
            String str2 = this.f95076c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f95077d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f95078e;
            if (str4 != null) {
                i10 = str4.hashCode();
            }
            return ((hashCode3 + i10) * 31) + this.f95079f.hashCode();
        }

        public String toString() {
            String str = this.f95074a;
            C11703n nVar = this.f95075b;
            String str2 = this.f95076c;
            String str3 = this.f95077d;
            String str4 = this.f95078e;
            AvailabilityType availabilityType = this.f95079f;
            return "Availability(prefix=" + str + ", status=" + nVar + ", store=" + str2 + ", suffix=" + str3 + ", text=" + str4 + ", type=" + availabilityType + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f95074a);
            parcel.writeString(this.f95075b.name());
            parcel.writeString(this.f95076c);
            parcel.writeString(this.f95077d);
            parcel.writeString(this.f95078e);
            parcel.writeString(this.f95079f.name());
        }

        public Availability(String str, C11703n nVar, String str2, String str3, String str4, AvailabilityType availabilityType) {
            C17542s.j(nVar, "status");
            C17542s.j(availabilityType, "type");
            this.f95074a = str;
            this.f95075b = nVar;
            this.f95076c = str2;
            this.f95077d = str3;
            this.f95078e = str4;
            this.f95079f = availabilityType;
        }
    }

    @p
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 )2\u00020\u0001:\u0002*$B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010(¨\u0006+"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer;", "Lcom/ingka/ikea/core/model/product/ProductItem$c;", "", "text", "Lcom/ingka/ikea/core/model/Image;", "image", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/ingka/ikea/core/model/Image;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EnergyClassDisclaimer extends c {
        public static final Parcelable.Creator<EnergyClassDisclaimer> CREATOR = new b();
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f95080a;

        /* renamed from: b  reason: collision with root package name */
        private final Image f95081b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<EnergyClassDisclaimer> serializer() {
                return ProductItem$EnergyClassDisclaimer$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<EnergyClassDisclaimer> {
            /* renamed from: a */
            public final EnergyClassDisclaimer createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new EnergyClassDisclaimer(parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final EnergyClassDisclaimer[] newArray(int i10) {
                return new EnergyClassDisclaimer[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ EnergyClassDisclaimer(int i10, String str, Image image, T0 t02) {
            super((DefaultConstructorMarker) null);
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, ProductItem$EnergyClassDisclaimer$$serializer.INSTANCE.getDescriptor());
            }
            this.f95080a = str;
            if ((i10 & 2) == 0) {
                this.f95081b = null;
            } else {
                this.f95081b = image;
            }
        }

        public static final /* synthetic */ void c(EnergyClassDisclaimer energyClassDisclaimer, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, energyClassDisclaimer.b());
            if (dVar.z(serialDescriptor, 1) || energyClassDisclaimer.a() != null) {
                dVar.B(serialDescriptor, 1, Image$$serializer.INSTANCE, energyClassDisclaimer.a());
            }
        }

        public Image a() {
            return this.f95081b;
        }

        public String b() {
            return this.f95080a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnergyClassDisclaimer)) {
                return false;
            }
            EnergyClassDisclaimer energyClassDisclaimer = (EnergyClassDisclaimer) obj;
            return C17542s.e(this.f95080a, energyClassDisclaimer.f95080a) && C17542s.e(this.f95081b, energyClassDisclaimer.f95081b);
        }

        public int hashCode() {
            int hashCode = this.f95080a.hashCode() * 31;
            Image image = this.f95081b;
            return hashCode + (image == null ? 0 : image.hashCode());
        }

        public String toString() {
            String str = this.f95080a;
            Image image = this.f95081b;
            return "EnergyClassDisclaimer(text=" + str + ", image=" + image + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f95080a);
            Image image = this.f95081b;
            if (image == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            image.writeToParcel(parcel, i10);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EnergyClassDisclaimer(String str, Image image) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "text");
            this.f95080a = str;
            this.f95081b = image;
        }
    }

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0001\u0005\u001f !\"#¨\u0006$"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "e", "()Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "includingVat", "d", "excludingVat", "Companion", "RegularPrice", "FamilyPrice", "BtiPrice", "NewLowerPrice", "TimeRestrictedPrice", "PriceTag", "a", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$BtiPrice;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$FamilyPrice;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$NewLowerPrice;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$RegularPrice;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$TimeRestrictedPrice;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Price implements Parcelable {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final C16824o<KSerializer<Object>> f95082a = C16825p.a(s.PUBLICATION, new C11701l());

        @p
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006-"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$BtiPrice;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "includingVat", "excludingVat", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$BtiPrice;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "e", "()Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "c", "d", "Companion", "$serializer", "a", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BtiPrice extends Price {
            public static final Parcelable.Creator<BtiPrice> CREATOR = new b();
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: b  reason: collision with root package name */
            private final PriceTag f95083b;

            /* renamed from: c  reason: collision with root package name */
            private final PriceTag f95084c;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$BtiPrice$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$BtiPrice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<BtiPrice> serializer() {
                    return ProductItem$Price$BtiPrice$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<BtiPrice> {
                /* renamed from: a */
                public final BtiPrice createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    Parcelable.Creator<PriceTag> creator = PriceTag.CREATOR;
                    return new BtiPrice(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
                }

                /* renamed from: b */
                public final BtiPrice[] newArray(int i10) {
                    return new BtiPrice[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public /* synthetic */ BtiPrice(int i10, PriceTag priceTag, PriceTag priceTag2, T0 t02) {
                super(i10, t02);
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, ProductItem$Price$BtiPrice$$serializer.INSTANCE.getDescriptor());
                }
                this.f95083b = priceTag;
                if ((i10 & 2) == 0) {
                    this.f95084c = null;
                } else {
                    this.f95084c = priceTag2;
                }
            }

            public static final /* synthetic */ void g(BtiPrice btiPrice, C17395d dVar, SerialDescriptor serialDescriptor) {
                Price.f(btiPrice, dVar, serialDescriptor);
                ProductItem$Price$PriceTag$$serializer productItem$Price$PriceTag$$serializer = ProductItem$Price$PriceTag$$serializer.INSTANCE;
                dVar.i(serialDescriptor, 0, productItem$Price$PriceTag$$serializer, btiPrice.e());
                if (dVar.z(serialDescriptor, 1) || btiPrice.d() != null) {
                    dVar.B(serialDescriptor, 1, productItem$Price$PriceTag$$serializer, btiPrice.d());
                }
            }

            public PriceTag d() {
                return this.f95084c;
            }

            public final int describeContents() {
                return 0;
            }

            public PriceTag e() {
                return this.f95083b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BtiPrice)) {
                    return false;
                }
                BtiPrice btiPrice = (BtiPrice) obj;
                return C17542s.e(this.f95083b, btiPrice.f95083b) && C17542s.e(this.f95084c, btiPrice.f95084c);
            }

            public int hashCode() {
                int hashCode = this.f95083b.hashCode() * 31;
                PriceTag priceTag = this.f95084c;
                return hashCode + (priceTag == null ? 0 : priceTag.hashCode());
            }

            public String toString() {
                PriceTag priceTag = this.f95083b;
                PriceTag priceTag2 = this.f95084c;
                return "BtiPrice(includingVat=" + priceTag + ", excludingVat=" + priceTag2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                this.f95083b.writeToParcel(parcel, i10);
                PriceTag priceTag = this.f95084c;
                if (priceTag == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                priceTag.writeToParcel(parcel, i10);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public BtiPrice(PriceTag priceTag, PriceTag priceTag2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(priceTag, "includingVat");
                this.f95083b = priceTag;
                this.f95084c = priceTag2;
            }
        }

        @p
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006-"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$FamilyPrice;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "includingVat", "excludingVat", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$FamilyPrice;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "e", "()Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "c", "d", "Companion", "$serializer", "a", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FamilyPrice extends Price {
            public static final Parcelable.Creator<FamilyPrice> CREATOR = new b();
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: b  reason: collision with root package name */
            private final PriceTag f95085b;

            /* renamed from: c  reason: collision with root package name */
            private final PriceTag f95086c;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$FamilyPrice$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$FamilyPrice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<FamilyPrice> serializer() {
                    return ProductItem$Price$FamilyPrice$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<FamilyPrice> {
                /* renamed from: a */
                public final FamilyPrice createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    Parcelable.Creator<PriceTag> creator = PriceTag.CREATOR;
                    return new FamilyPrice(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
                }

                /* renamed from: b */
                public final FamilyPrice[] newArray(int i10) {
                    return new FamilyPrice[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public /* synthetic */ FamilyPrice(int i10, PriceTag priceTag, PriceTag priceTag2, T0 t02) {
                super(i10, t02);
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, ProductItem$Price$FamilyPrice$$serializer.INSTANCE.getDescriptor());
                }
                this.f95085b = priceTag;
                if ((i10 & 2) == 0) {
                    this.f95086c = null;
                } else {
                    this.f95086c = priceTag2;
                }
            }

            public static final /* synthetic */ void g(FamilyPrice familyPrice, C17395d dVar, SerialDescriptor serialDescriptor) {
                Price.f(familyPrice, dVar, serialDescriptor);
                ProductItem$Price$PriceTag$$serializer productItem$Price$PriceTag$$serializer = ProductItem$Price$PriceTag$$serializer.INSTANCE;
                dVar.i(serialDescriptor, 0, productItem$Price$PriceTag$$serializer, familyPrice.e());
                if (dVar.z(serialDescriptor, 1) || familyPrice.d() != null) {
                    dVar.B(serialDescriptor, 1, productItem$Price$PriceTag$$serializer, familyPrice.d());
                }
            }

            public PriceTag d() {
                return this.f95086c;
            }

            public final int describeContents() {
                return 0;
            }

            public PriceTag e() {
                return this.f95085b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FamilyPrice)) {
                    return false;
                }
                FamilyPrice familyPrice = (FamilyPrice) obj;
                return C17542s.e(this.f95085b, familyPrice.f95085b) && C17542s.e(this.f95086c, familyPrice.f95086c);
            }

            public int hashCode() {
                int hashCode = this.f95085b.hashCode() * 31;
                PriceTag priceTag = this.f95086c;
                return hashCode + (priceTag == null ? 0 : priceTag.hashCode());
            }

            public String toString() {
                PriceTag priceTag = this.f95085b;
                PriceTag priceTag2 = this.f95086c;
                return "FamilyPrice(includingVat=" + priceTag + ", excludingVat=" + priceTag2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                this.f95085b.writeToParcel(parcel, i10);
                PriceTag priceTag = this.f95086c;
                if (priceTag == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                priceTag.writeToParcel(parcel, i10);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public FamilyPrice(PriceTag priceTag, PriceTag priceTag2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(priceTag, "includingVat");
                this.f95085b = priceTag;
                this.f95086c = priceTag2;
            }
        }

        @p
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006-"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$NewLowerPrice;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "includingVat", "excludingVat", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$NewLowerPrice;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "e", "()Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "c", "d", "Companion", "$serializer", "a", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NewLowerPrice extends Price {
            public static final Parcelable.Creator<NewLowerPrice> CREATOR = new b();
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: b  reason: collision with root package name */
            private final PriceTag f95087b;

            /* renamed from: c  reason: collision with root package name */
            private final PriceTag f95088c;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$NewLowerPrice$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$NewLowerPrice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<NewLowerPrice> serializer() {
                    return ProductItem$Price$NewLowerPrice$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<NewLowerPrice> {
                /* renamed from: a */
                public final NewLowerPrice createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    Parcelable.Creator<PriceTag> creator = PriceTag.CREATOR;
                    return new NewLowerPrice(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
                }

                /* renamed from: b */
                public final NewLowerPrice[] newArray(int i10) {
                    return new NewLowerPrice[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public /* synthetic */ NewLowerPrice(int i10, PriceTag priceTag, PriceTag priceTag2, T0 t02) {
                super(i10, t02);
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, ProductItem$Price$NewLowerPrice$$serializer.INSTANCE.getDescriptor());
                }
                this.f95087b = priceTag;
                if ((i10 & 2) == 0) {
                    this.f95088c = null;
                } else {
                    this.f95088c = priceTag2;
                }
            }

            public static final /* synthetic */ void g(NewLowerPrice newLowerPrice, C17395d dVar, SerialDescriptor serialDescriptor) {
                Price.f(newLowerPrice, dVar, serialDescriptor);
                ProductItem$Price$PriceTag$$serializer productItem$Price$PriceTag$$serializer = ProductItem$Price$PriceTag$$serializer.INSTANCE;
                dVar.i(serialDescriptor, 0, productItem$Price$PriceTag$$serializer, newLowerPrice.e());
                if (dVar.z(serialDescriptor, 1) || newLowerPrice.d() != null) {
                    dVar.B(serialDescriptor, 1, productItem$Price$PriceTag$$serializer, newLowerPrice.d());
                }
            }

            public PriceTag d() {
                return this.f95088c;
            }

            public final int describeContents() {
                return 0;
            }

            public PriceTag e() {
                return this.f95087b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NewLowerPrice)) {
                    return false;
                }
                NewLowerPrice newLowerPrice = (NewLowerPrice) obj;
                return C17542s.e(this.f95087b, newLowerPrice.f95087b) && C17542s.e(this.f95088c, newLowerPrice.f95088c);
            }

            public int hashCode() {
                int hashCode = this.f95087b.hashCode() * 31;
                PriceTag priceTag = this.f95088c;
                return hashCode + (priceTag == null ? 0 : priceTag.hashCode());
            }

            public String toString() {
                PriceTag priceTag = this.f95087b;
                PriceTag priceTag2 = this.f95088c;
                return "NewLowerPrice(includingVat=" + priceTag + ", excludingVat=" + priceTag2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                this.f95087b.writeToParcel(parcel, i10);
                PriceTag priceTag = this.f95088c;
                if (priceTag == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                priceTag.writeToParcel(parcel, i10);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public NewLowerPrice(PriceTag priceTag, PriceTag priceTag2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(priceTag, "includingVat");
                this.f95087b = priceTag;
                this.f95088c = priceTag2;
            }
        }

        @p
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 42\u00020\u0001:\u000356(B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b,\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\b3\u0010!¨\u00067"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "Landroid/os/Parcelable;", "", "rawRegularPrice", "rawPrice", "", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "fees", "", "unit", "<init>", "(Ljava/lang/Double;DLjava/util/List;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/Double;DLjava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "b", "D", "c", "()D", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "e", "Companion", "Fee", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PriceTag implements Parcelable {
            public static final Parcelable.Creator<PriceTag> CREATOR = new b();
            public static final a Companion = new a((DefaultConstructorMarker) null);
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public static final KSerializer<Object>[] f95089e = {null, null, new C17451f(ProductItem$Price$PriceTag$Fee$$serializer.INSTANCE), null};

            /* renamed from: a  reason: collision with root package name */
            private final Double f95090a;

            /* renamed from: b  reason: collision with root package name */
            private final double f95091b;

            /* renamed from: c  reason: collision with root package name */
            private final List<Fee> f95092c;

            /* renamed from: d  reason: collision with root package name */
            private final String f95093d;

            @p
            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 02\u00020\u0001:\u0003-1'B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b-\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b.\u0010 ¨\u00062"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "Landroid/os/Parcelable;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee$c;", "type", "", "amount", "shortDescription", "withoutFee", "total", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee$c;", "e", "()Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee$c;", "b", "Ljava/lang/String;", "c", "d", "f", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Fee implements Parcelable {
                public static final Parcelable.Creator<Fee> CREATOR = new b();
                public static final a Companion = new a((DefaultConstructorMarker) null);
                /* access modifiers changed from: private */

                /* renamed from: f  reason: collision with root package name */
                public static final KSerializer<Object>[] f95094f = {J.b("com.ingka.ikea.core.model.product.ProductItem.Price.PriceTag.Fee.Type", c.values()), null, null, null, null};

                /* renamed from: a  reason: collision with root package name */
                private final c f95095a;

                /* renamed from: b  reason: collision with root package name */
                private final String f95096b;

                /* renamed from: c  reason: collision with root package name */
                private final String f95097c;

                /* renamed from: d  reason: collision with root package name */
                private final String f95098d;

                /* renamed from: e  reason: collision with root package name */
                private final String f95099e;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a {
                    private a() {
                    }

                    public final KSerializer<Fee> serializer() {
                        return ProductItem$Price$PriceTag$Fee$$serializer.INSTANCE;
                    }

                    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class b implements Parcelable.Creator<Fee> {
                    /* renamed from: a */
                    public final Fee createFromParcel(Parcel parcel) {
                        C17542s.j(parcel, "parcel");
                        return new Fee(c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    /* renamed from: b */
                    public final Fee[] newArray(int i10) {
                        return new Fee[i10];
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee$c;", "", "<init>", "(Ljava/lang/String;I)V", "WEEE", "ECO", "NONE", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public enum c {
                    WEEE,
                    ECO,
                    NONE;

                    static {
                        c[] a10;
                        $ENTRIES = C17221b.a(a10);
                    }
                }

                public /* synthetic */ Fee(int i10, c cVar, String str, String str2, String str3, String str4, T0 t02) {
                    if (31 != (i10 & 31)) {
                        E0.b(i10, 31, ProductItem$Price$PriceTag$Fee$$serializer.INSTANCE.getDescriptor());
                    }
                    this.f95095a = cVar;
                    this.f95096b = str;
                    this.f95097c = str2;
                    this.f95098d = str3;
                    this.f95099e = str4;
                }

                public static final /* synthetic */ void g(Fee fee, C17395d dVar, SerialDescriptor serialDescriptor) {
                    dVar.i(serialDescriptor, 0, f95094f[0], fee.f95095a);
                    dVar.y(serialDescriptor, 1, fee.f95096b);
                    dVar.y(serialDescriptor, 2, fee.f95097c);
                    dVar.y(serialDescriptor, 3, fee.f95098d);
                    dVar.y(serialDescriptor, 4, fee.f95099e);
                }

                public final String b() {
                    return this.f95096b;
                }

                public final String c() {
                    return this.f95097c;
                }

                public final String d() {
                    return this.f95099e;
                }

                public final int describeContents() {
                    return 0;
                }

                public final c e() {
                    return this.f95095a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Fee)) {
                        return false;
                    }
                    Fee fee = (Fee) obj;
                    return this.f95095a == fee.f95095a && C17542s.e(this.f95096b, fee.f95096b) && C17542s.e(this.f95097c, fee.f95097c) && C17542s.e(this.f95098d, fee.f95098d) && C17542s.e(this.f95099e, fee.f95099e);
                }

                public final String f() {
                    return this.f95098d;
                }

                public int hashCode() {
                    return (((((((this.f95095a.hashCode() * 31) + this.f95096b.hashCode()) * 31) + this.f95097c.hashCode()) * 31) + this.f95098d.hashCode()) * 31) + this.f95099e.hashCode();
                }

                public String toString() {
                    c cVar = this.f95095a;
                    String str = this.f95096b;
                    String str2 = this.f95097c;
                    String str3 = this.f95098d;
                    String str4 = this.f95099e;
                    return "Fee(type=" + cVar + ", amount=" + str + ", shortDescription=" + str2 + ", withoutFee=" + str3 + ", total=" + str4 + ")";
                }

                public final void writeToParcel(Parcel parcel, int i10) {
                    C17542s.j(parcel, "dest");
                    parcel.writeString(this.f95095a.name());
                    parcel.writeString(this.f95096b);
                    parcel.writeString(this.f95097c);
                    parcel.writeString(this.f95098d);
                    parcel.writeString(this.f95099e);
                }

                public Fee(c cVar, String str, String str2, String str3, String str4) {
                    C17542s.j(cVar, "type");
                    C17542s.j(str, "amount");
                    C17542s.j(str2, "shortDescription");
                    C17542s.j(str3, "withoutFee");
                    C17542s.j(str4, "total");
                    this.f95095a = cVar;
                    this.f95096b = str;
                    this.f95097c = str2;
                    this.f95098d = str3;
                    this.f95099e = str4;
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<PriceTag> serializer() {
                    return ProductItem$Price$PriceTag$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<PriceTag> {
                /* renamed from: a */
                public final PriceTag createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                    double readDouble = parcel.readDouble();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        arrayList.add(Fee.CREATOR.createFromParcel(parcel));
                    }
                    return new PriceTag(valueOf, readDouble, arrayList, parcel.readString());
                }

                /* renamed from: b */
                public final PriceTag[] newArray(int i10) {
                    return new PriceTag[i10];
                }
            }

            public /* synthetic */ PriceTag(int i10, Double d10, double d11, List list, String str, T0 t02) {
                if (15 != (i10 & 15)) {
                    E0.b(i10, 15, ProductItem$Price$PriceTag$$serializer.INSTANCE.getDescriptor());
                }
                this.f95090a = d10;
                this.f95091b = d11;
                this.f95092c = list;
                this.f95093d = str;
            }

            public static final /* synthetic */ void f(PriceTag priceTag, C17395d dVar, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = f95089e;
                dVar.B(serialDescriptor, 0, C17438C.f144010a, priceTag.f95090a);
                dVar.E(serialDescriptor, 1, priceTag.f95091b);
                dVar.i(serialDescriptor, 2, kSerializerArr[2], priceTag.f95092c);
                dVar.B(serialDescriptor, 3, Y0.f144077a, priceTag.f95093d);
            }

            public final List<Fee> b() {
                return this.f95092c;
            }

            public final double c() {
                return this.f95091b;
            }

            public final Double d() {
                return this.f95090a;
            }

            public final int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f95093d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PriceTag)) {
                    return false;
                }
                PriceTag priceTag = (PriceTag) obj;
                return C17542s.e(this.f95090a, priceTag.f95090a) && Double.compare(this.f95091b, priceTag.f95091b) == 0 && C17542s.e(this.f95092c, priceTag.f95092c) && C17542s.e(this.f95093d, priceTag.f95093d);
            }

            public int hashCode() {
                Double d10 = this.f95090a;
                int i10 = 0;
                int hashCode = (((((d10 == null ? 0 : d10.hashCode()) * 31) + Double.hashCode(this.f95091b)) * 31) + this.f95092c.hashCode()) * 31;
                String str = this.f95093d;
                if (str != null) {
                    i10 = str.hashCode();
                }
                return hashCode + i10;
            }

            public String toString() {
                Double d10 = this.f95090a;
                double d11 = this.f95091b;
                List<Fee> list = this.f95092c;
                String str = this.f95093d;
                return "PriceTag(rawRegularPrice=" + d10 + ", rawPrice=" + d11 + ", fees=" + list + ", unit=" + str + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                Double d10 = this.f95090a;
                if (d10 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeDouble(d10.doubleValue());
                }
                parcel.writeDouble(this.f95091b);
                List<Fee> list = this.f95092c;
                parcel.writeInt(list.size());
                for (Fee writeToParcel : list) {
                    writeToParcel.writeToParcel(parcel, i10);
                }
                parcel.writeString(this.f95093d);
            }

            public PriceTag(Double d10, double d11, List<Fee> list, String str) {
                C17542s.j(list, "fees");
                this.f95090a = d10;
                this.f95091b = d11;
                this.f95092c = list;
                this.f95093d = str;
            }
        }

        @p
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006-"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$RegularPrice;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "includingVat", "excludingVat", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$RegularPrice;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "e", "()Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "c", "d", "Companion", "$serializer", "a", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RegularPrice extends Price {
            public static final Parcelable.Creator<RegularPrice> CREATOR = new b();
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: b  reason: collision with root package name */
            private final PriceTag f95100b;

            /* renamed from: c  reason: collision with root package name */
            private final PriceTag f95101c;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$RegularPrice$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$RegularPrice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<RegularPrice> serializer() {
                    return ProductItem$Price$RegularPrice$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<RegularPrice> {
                /* renamed from: a */
                public final RegularPrice createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    Parcelable.Creator<PriceTag> creator = PriceTag.CREATOR;
                    return new RegularPrice(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
                }

                /* renamed from: b */
                public final RegularPrice[] newArray(int i10) {
                    return new RegularPrice[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public /* synthetic */ RegularPrice(int i10, PriceTag priceTag, PriceTag priceTag2, T0 t02) {
                super(i10, t02);
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, ProductItem$Price$RegularPrice$$serializer.INSTANCE.getDescriptor());
                }
                this.f95100b = priceTag;
                if ((i10 & 2) == 0) {
                    this.f95101c = null;
                } else {
                    this.f95101c = priceTag2;
                }
            }

            public static final /* synthetic */ void g(RegularPrice regularPrice, C17395d dVar, SerialDescriptor serialDescriptor) {
                Price.f(regularPrice, dVar, serialDescriptor);
                ProductItem$Price$PriceTag$$serializer productItem$Price$PriceTag$$serializer = ProductItem$Price$PriceTag$$serializer.INSTANCE;
                dVar.i(serialDescriptor, 0, productItem$Price$PriceTag$$serializer, regularPrice.e());
                if (dVar.z(serialDescriptor, 1) || regularPrice.d() != null) {
                    dVar.B(serialDescriptor, 1, productItem$Price$PriceTag$$serializer, regularPrice.d());
                }
            }

            public PriceTag d() {
                return this.f95101c;
            }

            public final int describeContents() {
                return 0;
            }

            public PriceTag e() {
                return this.f95100b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RegularPrice)) {
                    return false;
                }
                RegularPrice regularPrice = (RegularPrice) obj;
                return C17542s.e(this.f95100b, regularPrice.f95100b) && C17542s.e(this.f95101c, regularPrice.f95101c);
            }

            public int hashCode() {
                int hashCode = this.f95100b.hashCode() * 31;
                PriceTag priceTag = this.f95101c;
                return hashCode + (priceTag == null ? 0 : priceTag.hashCode());
            }

            public String toString() {
                PriceTag priceTag = this.f95100b;
                PriceTag priceTag2 = this.f95101c;
                return "RegularPrice(includingVat=" + priceTag + ", excludingVat=" + priceTag2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                this.f95100b.writeToParcel(parcel, i10);
                PriceTag priceTag = this.f95101c;
                if (priceTag == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                priceTag.writeToParcel(parcel, i10);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public RegularPrice(PriceTag priceTag, PriceTag priceTag2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(priceTag, "includingVat");
                this.f95100b = priceTag;
                this.f95101c = priceTag2;
            }
        }

        @p
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006-"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$TimeRestrictedPrice;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "includingVat", "excludingVat", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$TimeRestrictedPrice;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "e", "()Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag;", "c", "d", "Companion", "$serializer", "a", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TimeRestrictedPrice extends Price {
            public static final Parcelable.Creator<TimeRestrictedPrice> CREATOR = new b();
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: b  reason: collision with root package name */
            private final PriceTag f95102b;

            /* renamed from: c  reason: collision with root package name */
            private final PriceTag f95103c;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$TimeRestrictedPrice$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$TimeRestrictedPrice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<TimeRestrictedPrice> serializer() {
                    return ProductItem$Price$TimeRestrictedPrice$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<TimeRestrictedPrice> {
                /* renamed from: a */
                public final TimeRestrictedPrice createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    Parcelable.Creator<PriceTag> creator = PriceTag.CREATOR;
                    return new TimeRestrictedPrice(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
                }

                /* renamed from: b */
                public final TimeRestrictedPrice[] newArray(int i10) {
                    return new TimeRestrictedPrice[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public /* synthetic */ TimeRestrictedPrice(int i10, PriceTag priceTag, PriceTag priceTag2, T0 t02) {
                super(i10, t02);
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, ProductItem$Price$TimeRestrictedPrice$$serializer.INSTANCE.getDescriptor());
                }
                this.f95102b = priceTag;
                if ((i10 & 2) == 0) {
                    this.f95103c = null;
                } else {
                    this.f95103c = priceTag2;
                }
            }

            public static final /* synthetic */ void g(TimeRestrictedPrice timeRestrictedPrice, C17395d dVar, SerialDescriptor serialDescriptor) {
                Price.f(timeRestrictedPrice, dVar, serialDescriptor);
                ProductItem$Price$PriceTag$$serializer productItem$Price$PriceTag$$serializer = ProductItem$Price$PriceTag$$serializer.INSTANCE;
                dVar.i(serialDescriptor, 0, productItem$Price$PriceTag$$serializer, timeRestrictedPrice.e());
                if (dVar.z(serialDescriptor, 1) || timeRestrictedPrice.d() != null) {
                    dVar.B(serialDescriptor, 1, productItem$Price$PriceTag$$serializer, timeRestrictedPrice.d());
                }
            }

            public PriceTag d() {
                return this.f95103c;
            }

            public final int describeContents() {
                return 0;
            }

            public PriceTag e() {
                return this.f95102b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TimeRestrictedPrice)) {
                    return false;
                }
                TimeRestrictedPrice timeRestrictedPrice = (TimeRestrictedPrice) obj;
                return C17542s.e(this.f95102b, timeRestrictedPrice.f95102b) && C17542s.e(this.f95103c, timeRestrictedPrice.f95103c);
            }

            public int hashCode() {
                int hashCode = this.f95102b.hashCode() * 31;
                PriceTag priceTag = this.f95103c;
                return hashCode + (priceTag == null ? 0 : priceTag.hashCode());
            }

            public String toString() {
                PriceTag priceTag = this.f95102b;
                PriceTag priceTag2 = this.f95103c;
                return "TimeRestrictedPrice(includingVat=" + priceTag + ", excludingVat=" + priceTag2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                this.f95102b.writeToParcel(parcel, i10);
                PriceTag priceTag = this.f95103c;
                if (priceTag == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                priceTag.writeToParcel(parcel, i10);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public TimeRestrictedPrice(PriceTag priceTag, PriceTag priceTag2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(priceTag, "includingVat");
                this.f95102b = priceTag;
                this.f95103c = priceTag2;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$Price$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            private final /* synthetic */ KSerializer a() {
                return (KSerializer) Price.f95082a.getValue();
            }

            public final KSerializer<Price> serializer() {
                return a();
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Price(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return new C17261n("com.ingka.ikea.core.model.product.ProductItem.Price", P.b(Price.class), new C18055d[]{P.b(BtiPrice.class), P.b(FamilyPrice.class), P.b(NewLowerPrice.class), P.b(RegularPrice.class), P.b(TimeRestrictedPrice.class)}, new KSerializer[]{ProductItem$Price$BtiPrice$$serializer.INSTANCE, ProductItem$Price$FamilyPrice$$serializer.INSTANCE, ProductItem$Price$NewLowerPrice$$serializer.INSTANCE, ProductItem$Price$RegularPrice$$serializer.INSTANCE, ProductItem$Price$TimeRestrictedPrice$$serializer.INSTANCE}, new Annotation[0]);
        }

        public static final /* synthetic */ void f(Price price, C17395d dVar, SerialDescriptor serialDescriptor) {
        }

        public abstract PriceTag d();

        public abstract PriceTag e();

        private Price() {
        }

        public /* synthetic */ Price(int i10, T0 t02) {
        }
    }

    @p
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 42\u00020\u0001:\u0003.5(B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\b.\u00103¨\u00066"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;", "Lcom/ingka/ikea/core/model/product/ProductItem$c;", "", "text", "Lcom/ingka/ikea/core/model/Image;", "image", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer$c;", "type", "Lcom/ingka/ikea/core/model/Link;", "link", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer$c;Lcom/ingka/ikea/core/model/Link;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer$c;Lcom/ingka/ikea/core/model/Link;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "c", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer$c;", "e", "()Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer$c;", "Lcom/ingka/ikea/core/model/Link;", "()Lcom/ingka/ikea/core/model/Link;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductDisclaimer extends c {
        public static final Parcelable.Creator<ProductDisclaimer> CREATOR = new b();
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final KSerializer<Object>[] f95104e = {0, 0, J.b("com.ingka.ikea.core.model.product.ProductItem.ProductDisclaimer.ProductDisclaimerType", c.values()), Link.Companion.serializer()};

        /* renamed from: a  reason: collision with root package name */
        private final String f95105a;

        /* renamed from: b  reason: collision with root package name */
        private final Image f95106b;

        /* renamed from: c  reason: collision with root package name */
        private final c f95107c;

        /* renamed from: d  reason: collision with root package name */
        private final Link f95108d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ProductDisclaimer> serializer() {
                return ProductItem$ProductDisclaimer$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<ProductDisclaimer> {
            /* renamed from: a */
            public final ProductDisclaimer createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new ProductDisclaimer(parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), c.valueOf(parcel.readString()), (Link) parcel.readParcelable(ProductDisclaimer.class.getClassLoader()));
            }

            /* renamed from: b */
            public final ProductDisclaimer[] newArray(int i10) {
                return new ProductDisclaimer[i10];
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer$c;", "", "<init>", "(Ljava/lang/String;I)V", "ENERGY_SHEET_URL", "ENERGY_SHEET_DEEPLINK", "PRICE_DELIVERY", "LAST_CHANCE", "COLOR_INFO", "WARNING_CHOKING_HAZARD", "SDM_ADVERTISEMENT", "UNKNOWN", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum c {
            ENERGY_SHEET_URL,
            ENERGY_SHEET_DEEPLINK,
            PRICE_DELIVERY,
            LAST_CHANCE,
            COLOR_INFO,
            WARNING_CHOKING_HAZARD,
            SDM_ADVERTISEMENT,
            UNKNOWN;

            static {
                c[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ProductDisclaimer(int i10, String str, Image image, c cVar, Link link, T0 t02) {
            super((DefaultConstructorMarker) null);
            if (5 != (i10 & 5)) {
                E0.b(i10, 5, ProductItem$ProductDisclaimer$$serializer.INSTANCE.getDescriptor());
            }
            this.f95105a = str;
            if ((i10 & 2) == 0) {
                this.f95106b = null;
            } else {
                this.f95106b = image;
            }
            this.f95107c = cVar;
            if ((i10 & 8) == 0) {
                this.f95108d = null;
            } else {
                this.f95108d = link;
            }
        }

        public static final /* synthetic */ void f(ProductDisclaimer productDisclaimer, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f95104e;
            dVar.y(serialDescriptor, 0, productDisclaimer.d());
            if (dVar.z(serialDescriptor, 1) || productDisclaimer.b() != null) {
                dVar.B(serialDescriptor, 1, Image$$serializer.INSTANCE, productDisclaimer.b());
            }
            dVar.i(serialDescriptor, 2, kSerializerArr[2], productDisclaimer.f95107c);
            if (dVar.z(serialDescriptor, 3) || productDisclaimer.f95108d != null) {
                dVar.B(serialDescriptor, 3, kSerializerArr[3], productDisclaimer.f95108d);
            }
        }

        public Image b() {
            return this.f95106b;
        }

        public final Link c() {
            return this.f95108d;
        }

        public String d() {
            return this.f95105a;
        }

        public final int describeContents() {
            return 0;
        }

        public final c e() {
            return this.f95107c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductDisclaimer)) {
                return false;
            }
            ProductDisclaimer productDisclaimer = (ProductDisclaimer) obj;
            return C17542s.e(this.f95105a, productDisclaimer.f95105a) && C17542s.e(this.f95106b, productDisclaimer.f95106b) && this.f95107c == productDisclaimer.f95107c && C17542s.e(this.f95108d, productDisclaimer.f95108d);
        }

        public int hashCode() {
            int hashCode = this.f95105a.hashCode() * 31;
            Image image = this.f95106b;
            int i10 = 0;
            int hashCode2 = (((hashCode + (image == null ? 0 : image.hashCode())) * 31) + this.f95107c.hashCode()) * 31;
            Link link = this.f95108d;
            if (link != null) {
                i10 = link.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f95105a;
            Image image = this.f95106b;
            c cVar = this.f95107c;
            Link link = this.f95108d;
            return "ProductDisclaimer(text=" + str + ", image=" + image + ", type=" + cVar + ", link=" + link + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f95105a);
            Image image = this.f95106b;
            if (image == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                image.writeToParcel(parcel, i10);
            }
            parcel.writeString(this.f95107c.name());
            parcel.writeParcelable(this.f95108d, i10);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProductDisclaimer(String str, Image image, c cVar, Link link) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "text");
            C17542s.j(cVar, "type");
            this.f95105a = str;
            this.f95106b = image;
            this.f95107c = cVar;
            this.f95108d = link;
        }
    }

    @p
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 '2\u00020\u0001:\u0002(#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$ProductItemHighlight;", "Landroid/os/Parcelable;", "Lop/e;", "type", "<init>", "(Lop/e;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILop/e;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/model/product/ProductItem$ProductItemHighlight;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lop/e;", "b", "()Lop/e;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductItemHighlight implements Parcelable {
        public static final Parcelable.Creator<ProductItemHighlight> CREATOR = new b();
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final KSerializer<Object>[] f95118b = {J.b("com.ingka.ikea.core.model.product.HighlightType", C11694e.values())};

        /* renamed from: a  reason: collision with root package name */
        private final C11694e f95119a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$ProductItemHighlight$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductItemHighlight;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ProductItemHighlight> serializer() {
                return ProductItem$ProductItemHighlight$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<ProductItemHighlight> {
            /* renamed from: a */
            public final ProductItemHighlight createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new ProductItemHighlight(C11694e.valueOf(parcel.readString()));
            }

            /* renamed from: b */
            public final ProductItemHighlight[] newArray(int i10) {
                return new ProductItemHighlight[i10];
            }
        }

        public /* synthetic */ ProductItemHighlight(int i10, C11694e eVar, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, ProductItem$ProductItemHighlight$$serializer.INSTANCE.getDescriptor());
            }
            this.f95119a = eVar;
        }

        public final C11694e b() {
            return this.f95119a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductItemHighlight) && this.f95119a == ((ProductItemHighlight) obj).f95119a;
        }

        public int hashCode() {
            return this.f95119a.hashCode();
        }

        public String toString() {
            C11694e eVar = this.f95119a;
            return "ProductItemHighlight(type=" + eVar + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f95119a.name());
        }

        public ProductItemHighlight(C11694e eVar) {
            C17542s.j(eVar, "type");
            this.f95119a = eVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductItem> serializer() {
            return ProductItem$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ProductItem> {
        /* renamed from: a */
        public final ProductItem createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Image image = null;
            Badge createFromParcel = parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<Image> creator = Image.CREATOR;
            Image createFromParcel2 = creator.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                image = creator.createFromParcel(parcel);
            }
            Image image2 = image;
            ProductInfo createFromParcel3 = ProductInfo.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(ProductDisclaimer.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList2.add(Availability.CREATOR.createFromParcel(parcel));
            }
            return new ProductItem(readString, readString2, createFromParcel, createFromParcel2, image2, createFromParcel3, arrayList, arrayList2, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final ProductItem[] newArray(int i10) {
            return new ProductItem[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$c;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer;", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c implements Parcelable {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ ProductItem(int i10, String str, String str2, Badge badge, Image image, Image image2, ProductInfo productInfo, List list, List list2, boolean z10, T0 t02) {
        if (319 != (i10 & 319)) {
            E0.b(i10, 319, ProductItem$$serializer.INSTANCE.getDescriptor());
        }
        this.f95064a = str;
        this.f95065b = str2;
        this.f95066c = badge;
        this.f95067d = image;
        this.f95068e = image2;
        this.f95069f = productInfo;
        if ((i10 & 64) == 0) {
            this.f95070g = C16877v.n();
        } else {
            this.f95070g = list;
        }
        if ((i10 & 128) == 0) {
            this.f95071h = C16877v.n();
        } else {
            this.f95071h = list2;
        }
        this.f95072i = z10;
    }

    public static final /* synthetic */ void k(ProductItem productItem, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95063j;
        dVar.y(serialDescriptor, 0, productItem.f95064a);
        dVar.y(serialDescriptor, 1, productItem.f95065b);
        dVar.B(serialDescriptor, 2, Badge$$serializer.INSTANCE, productItem.f95066c);
        Image$$serializer image$$serializer = Image$$serializer.INSTANCE;
        dVar.i(serialDescriptor, 3, image$$serializer, productItem.f95067d);
        dVar.B(serialDescriptor, 4, image$$serializer, productItem.f95068e);
        dVar.i(serialDescriptor, 5, ProductItem$ProductInfo$$serializer.INSTANCE, productItem.f95069f);
        if (dVar.z(serialDescriptor, 6) || !C17542s.e(productItem.f95070g, C16877v.n())) {
            dVar.i(serialDescriptor, 6, kSerializerArr[6], productItem.f95070g);
        }
        if (dVar.z(serialDescriptor, 7) || !C17542s.e(productItem.f95071h, C16877v.n())) {
            dVar.i(serialDescriptor, 7, kSerializerArr[7], productItem.f95071h);
        }
        dVar.x(serialDescriptor, 8, productItem.f95072i);
    }

    public final List<Availability> b() {
        return this.f95071h;
    }

    public final Image c() {
        return this.f95068e;
    }

    public final Image d() {
        return this.f95067d;
    }

    public final int describeContents() {
        return 0;
    }

    public final ProductInfo e() {
        return this.f95069f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductItem)) {
            return false;
        }
        ProductItem productItem = (ProductItem) obj;
        return C17542s.e(this.f95064a, productItem.f95064a) && C17542s.e(this.f95065b, productItem.f95065b) && C17542s.e(this.f95066c, productItem.f95066c) && C17542s.e(this.f95067d, productItem.f95067d) && C17542s.e(this.f95068e, productItem.f95068e) && C17542s.e(this.f95069f, productItem.f95069f) && C17542s.e(this.f95070g, productItem.f95070g) && C17542s.e(this.f95071h, productItem.f95071h) && this.f95072i == productItem.f95072i;
    }

    public final String f() {
        return this.f95064a;
    }

    public final String g() {
        return this.f95065b;
    }

    public final Badge h() {
        return this.f95066c;
    }

    public int hashCode() {
        int hashCode = ((this.f95064a.hashCode() * 31) + this.f95065b.hashCode()) * 31;
        Badge badge = this.f95066c;
        int i10 = 0;
        int hashCode2 = (((hashCode + (badge == null ? 0 : badge.hashCode())) * 31) + this.f95067d.hashCode()) * 31;
        Image image = this.f95068e;
        if (image != null) {
            i10 = image.hashCode();
        }
        return ((((((((hashCode2 + i10) * 31) + this.f95069f.hashCode()) * 31) + this.f95070g.hashCode()) * 31) + this.f95071h.hashCode()) * 31) + Boolean.hashCode(this.f95072i);
    }

    public final List<ProductDisclaimer> i() {
        return this.f95070g;
    }

    public final boolean j() {
        return this.f95072i;
    }

    public String toString() {
        String str = this.f95064a;
        String str2 = this.f95065b;
        Badge badge = this.f95066c;
        Image image = this.f95067d;
        Image image2 = this.f95068e;
        ProductInfo productInfo = this.f95069f;
        List<ProductDisclaimer> list = this.f95070g;
        List<Availability> list2 = this.f95071h;
        boolean z10 = this.f95072i;
        return "ProductItem(itemNo=" + str + ", itemType=" + str2 + ", productBadge=" + badge + ", image=" + image + ", contextualImage=" + image2 + ", info=" + productInfo + ", productDisclaimers=" + list + ", availability=" + list2 + ", isOnlineSellable=" + z10 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f95064a);
        parcel.writeString(this.f95065b);
        Badge badge = this.f95066c;
        if (badge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badge.writeToParcel(parcel, i10);
        }
        this.f95067d.writeToParcel(parcel, i10);
        Image image = this.f95068e;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, i10);
        }
        this.f95069f.writeToParcel(parcel, i10);
        List<ProductDisclaimer> list = this.f95070g;
        parcel.writeInt(list.size());
        for (ProductDisclaimer writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        List<Availability> list2 = this.f95071h;
        parcel.writeInt(list2.size());
        for (Availability writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f95072i ? 1 : 0);
    }

    @p
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000 ?2\u00020\u0001:\u0002@-B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010$J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b4\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b3\u0010:\u001a\u0004\b6\u0010;R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b1\u0010&¨\u0006A"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "Landroid/os/Parcelable;", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductItemHighlight;", "highlight", "", "offerValidTo", "title", "description", "Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "price", "Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer;", "energyClassDisclaimer", "", "priceAddons", "availabilityDisclaimer", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductItem$ProductItemHighlight;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/ProductItem$Price;Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/product/ProductItem$ProductItemHighlight;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/ProductItem$Price;Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer;Ljava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "j", "(Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductItemHighlight;", "e", "()Lcom/ingka/ikea/core/model/product/ProductItem$ProductItemHighlight;", "b", "Ljava/lang/String;", "f", "c", "i", "d", "Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "g", "()Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer;", "()Lcom/ingka/ikea/core/model/product/ProductItem$EnergyClassDisclaimer;", "Ljava/util/List;", "h", "()Ljava/util/List;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductInfo implements Parcelable {
        public static final Parcelable.Creator<ProductInfo> CREATOR = new b();
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public static final KSerializer<Object>[] f95109i = {0, 0, 0, 0, Price.Companion.serializer(), 0, new C17451f(Y0.f144077a), 0};

        /* renamed from: a  reason: collision with root package name */
        private final ProductItemHighlight f95110a;

        /* renamed from: b  reason: collision with root package name */
        private final String f95111b;

        /* renamed from: c  reason: collision with root package name */
        private final String f95112c;

        /* renamed from: d  reason: collision with root package name */
        private final String f95113d;

        /* renamed from: e  reason: collision with root package name */
        private final Price f95114e;

        /* renamed from: f  reason: collision with root package name */
        private final EnergyClassDisclaimer f95115f;

        /* renamed from: g  reason: collision with root package name */
        private final List<String> f95116g;

        /* renamed from: h  reason: collision with root package name */
        private final String f95117h;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ProductInfo> serializer() {
                return ProductItem$ProductInfo$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<ProductInfo> {
            /* renamed from: a */
            public final ProductInfo createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                EnergyClassDisclaimer energyClassDisclaimer = null;
                ProductItemHighlight createFromParcel = parcel.readInt() == 0 ? null : ProductItemHighlight.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                Price price = (Price) parcel.readParcelable(ProductInfo.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    energyClassDisclaimer = EnergyClassDisclaimer.CREATOR.createFromParcel(parcel);
                }
                return new ProductInfo(createFromParcel, readString, readString2, readString3, price, energyClassDisclaimer, parcel.createStringArrayList(), parcel.readString());
            }

            /* renamed from: b */
            public final ProductInfo[] newArray(int i10) {
                return new ProductInfo[i10];
            }
        }

        public /* synthetic */ ProductInfo(int i10, ProductItemHighlight productItemHighlight, String str, String str2, String str3, Price price, EnergyClassDisclaimer energyClassDisclaimer, List list, String str4, T0 t02) {
            if (188 != (i10 & 188)) {
                E0.b(i10, 188, ProductItem$ProductInfo$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.f95110a = null;
            } else {
                this.f95110a = productItemHighlight;
            }
            if ((i10 & 2) == 0) {
                this.f95111b = null;
            } else {
                this.f95111b = str;
            }
            this.f95112c = str2;
            this.f95113d = str3;
            this.f95114e = price;
            this.f95115f = energyClassDisclaimer;
            if ((i10 & 64) == 0) {
                this.f95116g = C16877v.n();
            } else {
                this.f95116g = list;
            }
            this.f95117h = str4;
        }

        public static final /* synthetic */ void j(ProductInfo productInfo, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f95109i;
            if (dVar.z(serialDescriptor, 0) || productInfo.f95110a != null) {
                dVar.B(serialDescriptor, 0, ProductItem$ProductItemHighlight$$serializer.INSTANCE, productInfo.f95110a);
            }
            if (dVar.z(serialDescriptor, 1) || productInfo.f95111b != null) {
                dVar.B(serialDescriptor, 1, Y0.f144077a, productInfo.f95111b);
            }
            dVar.y(serialDescriptor, 2, productInfo.f95112c);
            dVar.y(serialDescriptor, 3, productInfo.f95113d);
            dVar.i(serialDescriptor, 4, kSerializerArr[4], productInfo.f95114e);
            dVar.B(serialDescriptor, 5, ProductItem$EnergyClassDisclaimer$$serializer.INSTANCE, productInfo.f95115f);
            if (dVar.z(serialDescriptor, 6) || !C17542s.e(productInfo.f95116g, C16877v.n())) {
                dVar.i(serialDescriptor, 6, kSerializerArr[6], productInfo.f95116g);
            }
            dVar.B(serialDescriptor, 7, Y0.f144077a, productInfo.f95117h);
        }

        public final String b() {
            return this.f95117h;
        }

        public final String c() {
            return this.f95113d;
        }

        public final EnergyClassDisclaimer d() {
            return this.f95115f;
        }

        public final int describeContents() {
            return 0;
        }

        public final ProductItemHighlight e() {
            return this.f95110a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductInfo)) {
                return false;
            }
            ProductInfo productInfo = (ProductInfo) obj;
            return C17542s.e(this.f95110a, productInfo.f95110a) && C17542s.e(this.f95111b, productInfo.f95111b) && C17542s.e(this.f95112c, productInfo.f95112c) && C17542s.e(this.f95113d, productInfo.f95113d) && C17542s.e(this.f95114e, productInfo.f95114e) && C17542s.e(this.f95115f, productInfo.f95115f) && C17542s.e(this.f95116g, productInfo.f95116g) && C17542s.e(this.f95117h, productInfo.f95117h);
        }

        public final String f() {
            return this.f95111b;
        }

        public final Price g() {
            return this.f95114e;
        }

        public final List<String> h() {
            return this.f95116g;
        }

        public int hashCode() {
            ProductItemHighlight productItemHighlight = this.f95110a;
            int i10 = 0;
            int hashCode = (productItemHighlight == null ? 0 : productItemHighlight.hashCode()) * 31;
            String str = this.f95111b;
            int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95112c.hashCode()) * 31) + this.f95113d.hashCode()) * 31) + this.f95114e.hashCode()) * 31;
            EnergyClassDisclaimer energyClassDisclaimer = this.f95115f;
            int hashCode3 = (((hashCode2 + (energyClassDisclaimer == null ? 0 : energyClassDisclaimer.hashCode())) * 31) + this.f95116g.hashCode()) * 31;
            String str2 = this.f95117h;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode3 + i10;
        }

        public final String i() {
            return this.f95112c;
        }

        public String toString() {
            ProductItemHighlight productItemHighlight = this.f95110a;
            String str = this.f95111b;
            String str2 = this.f95112c;
            String str3 = this.f95113d;
            Price price = this.f95114e;
            EnergyClassDisclaimer energyClassDisclaimer = this.f95115f;
            List<String> list = this.f95116g;
            String str4 = this.f95117h;
            return "ProductInfo(highlight=" + productItemHighlight + ", offerValidTo=" + str + ", title=" + str2 + ", description=" + str3 + ", price=" + price + ", energyClassDisclaimer=" + energyClassDisclaimer + ", priceAddons=" + list + ", availabilityDisclaimer=" + str4 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            ProductItemHighlight productItemHighlight = this.f95110a;
            if (productItemHighlight == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                productItemHighlight.writeToParcel(parcel, i10);
            }
            parcel.writeString(this.f95111b);
            parcel.writeString(this.f95112c);
            parcel.writeString(this.f95113d);
            parcel.writeParcelable(this.f95114e, i10);
            EnergyClassDisclaimer energyClassDisclaimer = this.f95115f;
            if (energyClassDisclaimer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                energyClassDisclaimer.writeToParcel(parcel, i10);
            }
            parcel.writeStringList(this.f95116g);
            parcel.writeString(this.f95117h);
        }

        public ProductInfo(ProductItemHighlight productItemHighlight, String str, String str2, String str3, Price price, EnergyClassDisclaimer energyClassDisclaimer, List<String> list, String str4) {
            C17542s.j(str2, "title");
            C17542s.j(str3, "description");
            C17542s.j(price, "price");
            C17542s.j(list, "priceAddons");
            this.f95110a = productItemHighlight;
            this.f95111b = str;
            this.f95112c = str2;
            this.f95113d = str3;
            this.f95114e = price;
            this.f95115f = energyClassDisclaimer;
            this.f95116g = list;
            this.f95117h = str4;
        }
    }

    public ProductItem(String str, String str2, Badge badge, Image image, Image image2, ProductInfo productInfo, List<ProductDisclaimer> list, List<Availability> list2, boolean z10) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemType");
        C17542s.j(image, "image");
        C17542s.j(productInfo, "info");
        C17542s.j(list, "productDisclaimers");
        C17542s.j(list2, "availability");
        this.f95064a = str;
        this.f95065b = str2;
        this.f95066c = badge;
        this.f95067d = image;
        this.f95068e = image2;
        this.f95069f = productInfo;
        this.f95070g = list;
        this.f95071h = list2;
        this.f95072i = z10;
    }
}
