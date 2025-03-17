package com.ingka.ikea.shoppableimage.impl.data.network;

import LA.C13173a;
import YH.C16877v;
import com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote;
import com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote$$serializer;
import com.ingka.ikea.core.remotemodel.product.ProductWithCoordinatesRemote;
import com.ingka.ikea.core.remotemodel.product.ProductWithCoordinatesRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17438C;
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
import kp.i;
import kp.j;
import mp.C11588a;
import mp.C11589b;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0001\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002D!B{\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R \u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\"\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$R \u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010\"\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010&\u001a\u0004\b0\u00101R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010&\u001a\u0004\b5\u00106R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010\"\u0012\u0004\b:\u0010&\u001a\u0004\b9\u0010$R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010\"\u0012\u0004\b=\u0010&\u001a\u0004\b<\u0010$R(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010&\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/ingka/ikea/shoppableimage/impl/data/network/ShoppableImageRemote;", "Lpp/b;", "LLA/a;", "", "seen0", "", "type", "url", "altText", "id", "Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote;", "source", "", "aspectRatio", "title", "description", "", "Lcom/ingka/ikea/core/remotemodel/product/ProductWithCoordinatesRemote;", "productsWithCoordinates", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/shoppableimage/impl/data/network/ShoppableImageRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LLA/a;", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", "getUrl", "getUrl$annotations", "getAltText", "getAltText$annotations", "d", "getId", "getId$annotations", "e", "Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote;", "getSource", "()Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote;", "getSource$annotations", "f", "Ljava/lang/Double;", "getAspectRatio", "()Ljava/lang/Double;", "getAspectRatio$annotations", "g", "getTitle", "getTitle$annotations", "h", "getDescription", "getDescription$annotations", "i", "Ljava/util/List;", "getProductsWithCoordinates", "()Ljava/util/List;", "getProductsWithCoordinates$annotations", "Companion", "$serializer", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShoppableImageRemote implements C11768b<C13173a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f120254j = 8;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer<Object>[] f120255k = {null, null, null, null, null, null, null, null, new C17451f(ProductWithCoordinatesRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f120256a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120257b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120258c;

    /* renamed from: d  reason: collision with root package name */
    private final String f120259d;

    /* renamed from: e  reason: collision with root package name */
    private final ReferenceImageSourceRemote f120260e;

    /* renamed from: f  reason: collision with root package name */
    private final Double f120261f;

    /* renamed from: g  reason: collision with root package name */
    private final String f120262g;

    /* renamed from: h  reason: collision with root package name */
    private final String f120263h;

    /* renamed from: i  reason: collision with root package name */
    private final List<ProductWithCoordinatesRemote> f120264i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shoppableimage/impl/data/network/ShoppableImageRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shoppableimage/impl/data/network/ShoppableImageRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ShoppableImageRemote> serializer() {
            return ShoppableImageRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShoppableImageRemote(int i10, String str, String str2, String str3, String str4, ReferenceImageSourceRemote referenceImageSourceRemote, Double d10, String str5, String str6, List list, T0 t02) {
        if (511 != (i10 & 511)) {
            E0.b(i10, 511, ShoppableImageRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120256a = str;
        this.f120257b = str2;
        this.f120258c = str3;
        this.f120259d = str4;
        this.f120260e = referenceImageSourceRemote;
        this.f120261f = d10;
        this.f120262g = str5;
        this.f120263h = str6;
        this.f120264i = list;
    }

    public static final /* synthetic */ void c(ShoppableImageRemote shoppableImageRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120255k;
        dVar.y(serialDescriptor, 0, shoppableImageRemote.f120256a);
        dVar.y(serialDescriptor, 1, shoppableImageRemote.f120257b);
        dVar.y(serialDescriptor, 2, shoppableImageRemote.f120258c);
        dVar.y(serialDescriptor, 3, shoppableImageRemote.f120259d);
        dVar.B(serialDescriptor, 4, ReferenceImageSourceRemote$$serializer.INSTANCE, shoppableImageRemote.f120260e);
        dVar.B(serialDescriptor, 5, C17438C.f144010a, shoppableImageRemote.f120261f);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 6, y02, shoppableImageRemote.f120262g);
        dVar.B(serialDescriptor, 7, y02, shoppableImageRemote.f120263h);
        dVar.B(serialDescriptor, 8, kSerializerArr[8], shoppableImageRemote.f120264i);
    }

    public C13173a b() {
        ArrayList arrayList;
        String str = this.f120256a;
        i.a aVar = C17542s.e(str, "UGC") ? i.a.USER_CONTENT : C17542s.e(str, "SHOPPABLE") ? i.a.SHOPPABLE : i.a.REGULAR;
        String str2 = this.f120257b;
        String str3 = this.f120258c;
        String str4 = this.f120259d;
        ReferenceImageSourceRemote referenceImageSourceRemote = this.f120260e;
        j a10 = referenceImageSourceRemote != null ? referenceImageSourceRemote.a() : null;
        Double d10 = this.f120261f;
        String str5 = this.f120262g;
        String str6 = this.f120263h;
        List<ProductWithCoordinatesRemote> list = this.f120264i;
        if (list != null) {
            Iterable<ProductWithCoordinatesRemote> iterable = list;
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
            for (ProductWithCoordinatesRemote a11 : iterable) {
                arrayList2.add(a11.a());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object next : arrayList2) {
                if (((C11589b) next).a() != null) {
                    arrayList3.add(next);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        return new C13173a(aVar, str2, str3, str4, a10, d10, str5, str6, arrayList, (String) null, (List<C11588a>) null);
    }
}
