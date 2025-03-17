package com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nn.C11659e;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00022\u0017BM\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001aR \u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010\"\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u001aR \u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010\"\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010\u001aR \u0010\n\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010\"\u0012\u0004\b0\u0010%\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/ProductInfoRemote;", "Lpp/b;", "Lnn/e;", "", "seen0", "", "title", "imageUrl", "itemNo", "itemType", "description", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/ProductInfoRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lnn/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getImageUrl", "getImageUrl$annotations", "c", "getItemNo", "getItemNo$annotations", "d", "getItemType", "getItemType$annotations", "e", "getDescription", "getDescription$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductInfoRemote implements C11768b<C11659e> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f93360a;

    /* renamed from: b  reason: collision with root package name */
    private final String f93361b;

    /* renamed from: c  reason: collision with root package name */
    private final String f93362c;

    /* renamed from: d  reason: collision with root package name */
    private final String f93363d;

    /* renamed from: e  reason: collision with root package name */
    private final String f93364e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/ProductInfoRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/ProductInfoRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductInfoRemote> serializer() {
            return ProductInfoRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductInfoRemote(int i10, String str, String str2, String str3, String str4, String str5, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, ProductInfoRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f93360a = str;
        this.f93361b = str2;
        this.f93362c = str3;
        this.f93363d = str4;
        this.f93364e = str5;
    }

    public static final /* synthetic */ void b(ProductInfoRemote productInfoRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, productInfoRemote.f93360a);
        dVar.y(serialDescriptor, 1, productInfoRemote.f93361b);
        dVar.y(serialDescriptor, 2, productInfoRemote.f93362c);
        dVar.y(serialDescriptor, 3, productInfoRemote.f93363d);
        dVar.y(serialDescriptor, 4, productInfoRemote.f93364e);
    }

    public C11659e a() {
        return new C11659e(this.f93360a, this.f93361b, this.f93362c, this.f93363d, this.f93364e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInfoRemote)) {
            return false;
        }
        ProductInfoRemote productInfoRemote = (ProductInfoRemote) obj;
        return C17542s.e(this.f93360a, productInfoRemote.f93360a) && C17542s.e(this.f93361b, productInfoRemote.f93361b) && C17542s.e(this.f93362c, productInfoRemote.f93362c) && C17542s.e(this.f93363d, productInfoRemote.f93363d) && C17542s.e(this.f93364e, productInfoRemote.f93364e);
    }

    public int hashCode() {
        return (((((((this.f93360a.hashCode() * 31) + this.f93361b.hashCode()) * 31) + this.f93362c.hashCode()) * 31) + this.f93363d.hashCode()) * 31) + this.f93364e.hashCode();
    }

    public String toString() {
        String str = this.f93360a;
        String str2 = this.f93361b;
        String str3 = this.f93362c;
        String str4 = this.f93363d;
        String str5 = this.f93364e;
        return "ProductInfoRemote(title=" + str + ", imageUrl=" + str2 + ", itemNo=" + str3 + ", itemType=" + str4 + ", description=" + str5 + ")";
    }
}
