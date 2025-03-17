package com.ingka.ikea.room.impl.data.remote;

import KJ.C15985a;
import YH.C16877v;
import com.ingka.ikea.core.remotemodel.MediaRemote;
import com.ingka.ikea.core.remotemodel.MediaRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import py.d;
import sy.b;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003./\"B?\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001aR \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001aR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/ProductListingsRemote;", "Lpy/d;", "Lsy/b;", "", "seen0", "", "id", "title", "", "Lcom/ingka/ikea/room/impl/data/remote/ProductListingsRemote$ProductListing;", "content", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/room/impl/data/remote/ProductListingsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()Lsy/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "getContent$annotations", "Companion", "ProductListing", "$serializer", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductListingsRemote implements d<b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f119742d = 8;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f119743e = {null, null, new C17451f(ProductListingsRemote$ProductListing$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f119744a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119745b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ProductListing> f119746c;

    @p
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 .2\u00020\u0001:\u0002/\u001fBI\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010#\u001a\u0004\b&\u0010'R \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010 \u0012\u0004\b*\u0010#\u001a\u0004\b$\u0010\u0018R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010+\u0012\u0004\b-\u0010#\u001a\u0004\b)\u0010,¨\u00060"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/ProductListingsRemote$ProductListing;", "", "", "seen0", "", "title", "Lcom/ingka/ikea/core/remotemodel/MediaRemote;", "media", "body", "", "content", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/core/remotemodel/MediaRemote;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/room/impl/data/remote/ProductListingsRemote$ProductListing;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "getTitle$annotations", "()V", "b", "Lcom/ingka/ikea/core/remotemodel/MediaRemote;", "d", "()Lcom/ingka/ikea/core/remotemodel/MediaRemote;", "getMedia$annotations", "c", "getBody$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getContent$annotations", "Companion", "$serializer", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductListing {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        public static final int f119749e = 8;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final KSerializer<Object>[] f119750f = {null, null, null, new C17451f(Y0.f144077a)};

        /* renamed from: a  reason: collision with root package name */
        private final String f119751a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaRemote f119752b;

        /* renamed from: c  reason: collision with root package name */
        private final String f119753c;

        /* renamed from: d  reason: collision with root package name */
        private final List<String> f119754d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/ProductListingsRemote$ProductListing$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/room/impl/data/remote/ProductListingsRemote$ProductListing;", "serializer", "()Lkotlinx/serialization/KSerializer;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ProductListing> serializer() {
                return ProductListingsRemote$ProductListing$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ProductListing(int i10, String str, MediaRemote mediaRemote, String str2, List list, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, ProductListingsRemote$ProductListing$$serializer.INSTANCE.getDescriptor());
            }
            this.f119751a = str;
            this.f119752b = mediaRemote;
            this.f119753c = str2;
            this.f119754d = list;
        }

        public static final /* synthetic */ void f(ProductListing productListing, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f119750f;
            dVar.y(serialDescriptor, 0, productListing.f119751a);
            dVar.B(serialDescriptor, 1, MediaRemote$$serializer.INSTANCE, productListing.f119752b);
            dVar.y(serialDescriptor, 2, productListing.f119753c);
            dVar.i(serialDescriptor, 3, kSerializerArr[3], productListing.f119754d);
        }

        public final String b() {
            return this.f119753c;
        }

        public final List<String> c() {
            return this.f119754d;
        }

        public final MediaRemote d() {
            return this.f119752b;
        }

        public final String e() {
            return this.f119751a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductListing)) {
                return false;
            }
            ProductListing productListing = (ProductListing) obj;
            return C17542s.e(this.f119751a, productListing.f119751a) && C17542s.e(this.f119752b, productListing.f119752b) && C17542s.e(this.f119753c, productListing.f119753c) && C17542s.e(this.f119754d, productListing.f119754d);
        }

        public int hashCode() {
            int hashCode = this.f119751a.hashCode() * 31;
            MediaRemote mediaRemote = this.f119752b;
            return ((((hashCode + (mediaRemote == null ? 0 : mediaRemote.hashCode())) * 31) + this.f119753c.hashCode()) * 31) + this.f119754d.hashCode();
        }

        public String toString() {
            String str = this.f119751a;
            MediaRemote mediaRemote = this.f119752b;
            String str2 = this.f119753c;
            List<String> list = this.f119754d;
            return "ProductListing(title=" + str + ", media=" + mediaRemote + ", body=" + str2 + ", content=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/ProductListingsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/room/impl/data/remote/ProductListingsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductListingsRemote> serializer() {
            return ProductListingsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductListingsRemote(int i10, String str, String str2, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ProductListingsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119744a = str;
        this.f119745b = str2;
        this.f119746c = list;
    }

    public static final /* synthetic */ void d(ProductListingsRemote productListingsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119743e;
        dVar.y(serialDescriptor, 0, productListingsRemote.b());
        dVar.y(serialDescriptor, 1, productListingsRemote.f119745b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], productListingsRemote.f119746c);
    }

    public String b() {
        return this.f119744a;
    }

    /* renamed from: c */
    public b toLocal() {
        String b10 = b();
        String str = this.f119745b;
        Iterable<ProductListing> iterable = this.f119746c;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ProductListing productListing : iterable) {
            String e10 = productListing.e();
            MediaRemote d10 = productListing.d();
            arrayList.add(new b.a(e10, d10 != null ? d10.a() : null, productListing.b(), C15985a.h(C16877v.m0(productListing.c()))));
        }
        return new b(b10, str, C15985a.h(arrayList));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListingsRemote)) {
            return false;
        }
        ProductListingsRemote productListingsRemote = (ProductListingsRemote) obj;
        return C17542s.e(this.f119744a, productListingsRemote.f119744a) && C17542s.e(this.f119745b, productListingsRemote.f119745b) && C17542s.e(this.f119746c, productListingsRemote.f119746c);
    }

    public int hashCode() {
        return (((this.f119744a.hashCode() * 31) + this.f119745b.hashCode()) * 31) + this.f119746c.hashCode();
    }

    public String toString() {
        String str = this.f119744a;
        String str2 = this.f119745b;
        List<ProductListing> list = this.f119746c;
        return "ProductListingsRemote(id=" + str + ", title=" + str2 + ", content=" + list + ")";
    }
}
