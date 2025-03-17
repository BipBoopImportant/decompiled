package rz;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.product.Badge;
import com.ingka.ikea.core.model.product.DeliveryCalculationDisclaimer;
import com.ingka.ikea.core.model.product.Disclaimer;
import com.ingka.ikea.core.model.product.Highlight;
import com.ingka.ikea.core.model.product.TechnicalCompliance;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import op.C11691b;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b@\b\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0011\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0011¢\u0006\u0004\b\"\u0010#J\u001d\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020&¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020&HÖ\u0001¢\u0006\u0004\b/\u0010,J\u001a\u00102\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010.R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010.R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010.R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\b4\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b;\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b@\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b>\u0010A\u001a\u0004\b7\u0010BR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bC\u0010A\u001a\u0004\bD\u0010BR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b<\u0010GR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u00105\u001a\u0004\bI\u0010.R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\b[\u0010MR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001f\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b`\u0010K\u001a\u0004\ba\u0010MR\u0019\u0010 \u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bf\u0010K\u001a\u0004\bg\u0010MR\u001f\u0010l\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0012\n\u0004\bh\u00105\u0012\u0004\bj\u0010k\u001a\u0004\bi\u0010.R\u001f\u0010o\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0012\n\u0004\bm\u00105\u0012\u0004\bn\u0010k\u001a\u0004\b9\u0010.¨\u0006p"}, d2 = {"Lrz/w;", "Landroid/os/Parcelable;", "", "itemNo", "itemType", "title", "description", "energyLabel", "", "isOnlineSellable", "availabilityDisclaimer", "Lcom/ingka/ikea/core/model/Image;", "image", "contextualImage", "Lcom/ingka/ikea/core/model/product/a;", "pricePackage", "colorInfo", "", "Lcom/ingka/ikea/core/model/product/DeliveryCalculationDisclaimer;", "deliveryCalculationDisclaimers", "Lcom/ingka/ikea/core/model/Link;", "externalProductInfoLink", "Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "technicalCompliance", "Lcom/ingka/ikea/core/model/product/Badge;", "productBadge", "Lop/b;", "availability", "Lcom/ingka/ikea/core/model/product/Highlight;", "productHighlight", "Lcom/ingka/ikea/core/model/product/Disclaimer;", "priceDescriptions", "energyClassDisclaimer", "productDisclaimers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/product/a;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/core/model/Link;Lcom/ingka/ikea/core/model/product/TechnicalCompliance;Lcom/ingka/ikea/core/model/product/Badge;Ljava/util/List;Lcom/ingka/ikea/core/model/product/Highlight;Ljava/util/List;Lcom/ingka/ikea/core/model/product/Disclaimer;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "e", "c", "g", "getEnergyLabel", "f", "Z", "h", "()Z", "getAvailabilityDisclaimer", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "i", "getContextualImage", "j", "Lcom/ingka/ikea/core/model/product/a;", "()Lcom/ingka/ikea/core/model/product/a;", "k", "getColorInfo", "l", "Ljava/util/List;", "getDeliveryCalculationDisclaimers", "()Ljava/util/List;", "m", "Lcom/ingka/ikea/core/model/Link;", "getExternalProductInfoLink", "()Lcom/ingka/ikea/core/model/Link;", "n", "Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "getTechnicalCompliance", "()Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "o", "Lcom/ingka/ikea/core/model/product/Badge;", "getProductBadge", "()Lcom/ingka/ikea/core/model/product/Badge;", "p", "getAvailability", "q", "Lcom/ingka/ikea/core/model/product/Highlight;", "getProductHighlight", "()Lcom/ingka/ikea/core/model/product/Highlight;", "r", "getPriceDescriptions", "s", "Lcom/ingka/ikea/core/model/product/Disclaimer;", "getEnergyClassDisclaimer", "()Lcom/ingka/ikea/core/model/product/Disclaimer;", "t", "getProductDisclaimers", "u", "getLastChanceLabel", "getLastChanceLabel$annotations", "()V", "lastChanceLabel", "v", "getImageUrl$annotations", "imageUrl", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.w  reason: case insensitive filesystem */
public final class C15029w implements Parcelable {
    public static final Parcelable.Creator<C15029w> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f130900a;

    /* renamed from: b  reason: collision with root package name */
    private final String f130901b;

    /* renamed from: c  reason: collision with root package name */
    private final String f130902c;

    /* renamed from: d  reason: collision with root package name */
    private final String f130903d;

    /* renamed from: e  reason: collision with root package name */
    private final String f130904e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f130905f;

    /* renamed from: g  reason: collision with root package name */
    private final String f130906g;

    /* renamed from: h  reason: collision with root package name */
    private final Image f130907h;

    /* renamed from: i  reason: collision with root package name */
    private final Image f130908i;

    /* renamed from: j  reason: collision with root package name */
    private final com.ingka.ikea.core.model.product.a f130909j;

    /* renamed from: k  reason: collision with root package name */
    private final String f130910k;

    /* renamed from: l  reason: collision with root package name */
    private final List<DeliveryCalculationDisclaimer> f130911l;

    /* renamed from: m  reason: collision with root package name */
    private final Link f130912m;

    /* renamed from: n  reason: collision with root package name */
    private final TechnicalCompliance f130913n;

    /* renamed from: o  reason: collision with root package name */
    private final Badge f130914o;

    /* renamed from: p  reason: collision with root package name */
    private final List<C11691b> f130915p;

    /* renamed from: q  reason: collision with root package name */
    private final Highlight f130916q;

    /* renamed from: r  reason: collision with root package name */
    private final List<Disclaimer> f130917r;

    /* renamed from: s  reason: collision with root package name */
    private final Disclaimer f130918s;

    /* renamed from: t  reason: collision with root package name */
    private final List<Disclaimer> f130919t;

    /* renamed from: u  reason: collision with root package name */
    private final String f130920u;

    /* renamed from: v  reason: collision with root package name */
    private final String f130921v;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.w$a */
    public static final class a implements Parcelable.Creator<C15029w> {
        /* renamed from: a */
        public final C15029w createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Link link;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Parcel parcel2 = parcel;
            C17542s.j(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            String readString6 = parcel.readString();
            Class<C15029w> cls = C15029w.class;
            Image image = (Image) parcel2.readParcelable(cls.getClassLoader());
            Image image2 = (Image) parcel2.readParcelable(cls.getClassLoader());
            com.ingka.ikea.core.model.product.a aVar = (com.ingka.ikea.core.model.product.a) parcel2.readValue(cls.getClassLoader());
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    arrayList6.add(parcel2.readParcelable(cls.getClassLoader()));
                    i10++;
                    readInt = readInt;
                }
                arrayList = arrayList6;
            }
            Link link2 = (Link) parcel2.readParcelable(cls.getClassLoader());
            TechnicalCompliance technicalCompliance = (TechnicalCompliance) parcel2.readParcelable(cls.getClassLoader());
            Badge badge = (Badge) parcel2.readParcelable(cls.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList;
                link = link2;
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                link = link2;
                ArrayList arrayList7 = new ArrayList(readInt2);
                arrayList3 = arrayList;
                int i11 = 0;
                while (i11 != readInt2) {
                    arrayList7.add(parcel2.readParcelable(cls.getClassLoader()));
                    i11++;
                    readInt2 = readInt2;
                }
                arrayList2 = arrayList7;
            }
            Highlight highlight = (Highlight) parcel2.readParcelable(cls.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt3);
                int i12 = 0;
                while (i12 != readInt3) {
                    arrayList8.add(parcel2.readParcelable(cls.getClassLoader()));
                    i12++;
                    readInt3 = readInt3;
                }
                arrayList4 = arrayList8;
            }
            Disclaimer disclaimer = (Disclaimer) parcel2.readParcelable(cls.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt4);
                int i13 = 0;
                while (i13 != readInt4) {
                    arrayList9.add(parcel2.readParcelable(cls.getClassLoader()));
                    i13++;
                    readInt4 = readInt4;
                }
                arrayList5 = arrayList9;
            }
            return new C15029w(readString, readString2, readString3, readString4, readString5, z10, readString6, image, image2, aVar, readString7, arrayList3, link, technicalCompliance, badge, arrayList2, highlight, arrayList4, disclaimer, arrayList5);
        }

        /* renamed from: b */
        public final C15029w[] newArray(int i10) {
            return new C15029w[i10];
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15029w(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, java.lang.String r14, com.ingka.ikea.core.model.Image r15, com.ingka.ikea.core.model.Image r16, com.ingka.ikea.core.model.product.a r17, java.lang.String r18, java.util.List<com.ingka.ikea.core.model.product.DeliveryCalculationDisclaimer> r19, com.ingka.ikea.core.model.Link r20, com.ingka.ikea.core.model.product.TechnicalCompliance r21, com.ingka.ikea.core.model.product.Badge r22, java.util.List<op.C11691b> r23, com.ingka.ikea.core.model.product.Highlight r24, java.util.List<com.ingka.ikea.core.model.product.Disclaimer> r25, com.ingka.ikea.core.model.product.Disclaimer r26, java.util.List<com.ingka.ikea.core.model.product.Disclaimer> r27) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r17
            r5 = r27
            java.lang.String r6 = "itemNo"
            kotlin.jvm.internal.C17542s.j(r8, r6)
            java.lang.String r6 = "itemType"
            kotlin.jvm.internal.C17542s.j(r9, r6)
            java.lang.String r6 = "title"
            kotlin.jvm.internal.C17542s.j(r10, r6)
            java.lang.String r6 = "pricePackage"
            kotlin.jvm.internal.C17542s.j(r4, r6)
            r7.<init>()
            r0.f130900a = r1
            r0.f130901b = r2
            r0.f130902c = r3
            r1 = r11
            r0.f130903d = r1
            r1 = r12
            r0.f130904e = r1
            r1 = r13
            r0.f130905f = r1
            r1 = r14
            r0.f130906g = r1
            r1 = r15
            r0.f130907h = r1
            r1 = r16
            r0.f130908i = r1
            r0.f130909j = r4
            r1 = r18
            r0.f130910k = r1
            r1 = r19
            r0.f130911l = r1
            r1 = r20
            r0.f130912m = r1
            r1 = r21
            r0.f130913n = r1
            r1 = r22
            r0.f130914o = r1
            r1 = r23
            r0.f130915p = r1
            r1 = r24
            r0.f130916q = r1
            r1 = r25
            r0.f130917r = r1
            r1 = r26
            r0.f130918s = r1
            r0.f130919t = r5
            r1 = 0
            if (r5 == 0) goto L_0x008a
            r2 = r5
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x006a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0080
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.ingka.ikea.core.model.product.Disclaimer r4 = (com.ingka.ikea.core.model.product.Disclaimer) r4
            com.ingka.ikea.core.model.product.DisclaimerType r4 = r4.e()
            com.ingka.ikea.core.model.product.DisclaimerType r5 = com.ingka.ikea.core.model.product.DisclaimerType.LAST_CHANCE
            if (r4 != r5) goto L_0x006a
            goto L_0x0081
        L_0x0080:
            r3 = r1
        L_0x0081:
            com.ingka.ikea.core.model.product.Disclaimer r3 = (com.ingka.ikea.core.model.product.Disclaimer) r3
            if (r3 == 0) goto L_0x008a
            java.lang.String r2 = r3.d()
            goto L_0x008b
        L_0x008a:
            r2 = r1
        L_0x008b:
            r0.f130920u = r2
            com.ingka.ikea.core.model.Image r2 = r0.f130907h
            if (r2 == 0) goto L_0x0095
            java.lang.String r1 = r2.getUrl()
        L_0x0095:
            r0.f130921v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rz.C15029w.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.ingka.ikea.core.model.Image, com.ingka.ikea.core.model.Image, com.ingka.ikea.core.model.product.a, java.lang.String, java.util.List, com.ingka.ikea.core.model.Link, com.ingka.ikea.core.model.product.TechnicalCompliance, com.ingka.ikea.core.model.product.Badge, java.util.List, com.ingka.ikea.core.model.product.Highlight, java.util.List, com.ingka.ikea.core.model.product.Disclaimer, java.util.List):void");
    }

    public final String a() {
        return this.f130903d;
    }

    public final Image b() {
        return this.f130907h;
    }

    public final String c() {
        return this.f130921v;
    }

    public final String d() {
        return this.f130900a;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f130901b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15029w)) {
            return false;
        }
        C15029w wVar = (C15029w) obj;
        return C17542s.e(this.f130900a, wVar.f130900a) && C17542s.e(this.f130901b, wVar.f130901b) && C17542s.e(this.f130902c, wVar.f130902c) && C17542s.e(this.f130903d, wVar.f130903d) && C17542s.e(this.f130904e, wVar.f130904e) && this.f130905f == wVar.f130905f && C17542s.e(this.f130906g, wVar.f130906g) && C17542s.e(this.f130907h, wVar.f130907h) && C17542s.e(this.f130908i, wVar.f130908i) && C17542s.e(this.f130909j, wVar.f130909j) && C17542s.e(this.f130910k, wVar.f130910k) && C17542s.e(this.f130911l, wVar.f130911l) && C17542s.e(this.f130912m, wVar.f130912m) && C17542s.e(this.f130913n, wVar.f130913n) && C17542s.e(this.f130914o, wVar.f130914o) && C17542s.e(this.f130915p, wVar.f130915p) && C17542s.e(this.f130916q, wVar.f130916q) && C17542s.e(this.f130917r, wVar.f130917r) && C17542s.e(this.f130918s, wVar.f130918s) && C17542s.e(this.f130919t, wVar.f130919t);
    }

    public final com.ingka.ikea.core.model.product.a f() {
        return this.f130909j;
    }

    public final String g() {
        return this.f130902c;
    }

    public final boolean h() {
        return this.f130905f;
    }

    public int hashCode() {
        int hashCode = ((((this.f130900a.hashCode() * 31) + this.f130901b.hashCode()) * 31) + this.f130902c.hashCode()) * 31;
        String str = this.f130903d;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f130904e;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f130905f)) * 31;
        String str3 = this.f130906g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image = this.f130907h;
        int hashCode5 = (hashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f130908i;
        int hashCode6 = (((hashCode5 + (image2 == null ? 0 : image2.hashCode())) * 31) + this.f130909j.hashCode()) * 31;
        String str4 = this.f130910k;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<DeliveryCalculationDisclaimer> list = this.f130911l;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Link link = this.f130912m;
        int hashCode9 = (hashCode8 + (link == null ? 0 : link.hashCode())) * 31;
        TechnicalCompliance technicalCompliance = this.f130913n;
        int hashCode10 = (hashCode9 + (technicalCompliance == null ? 0 : technicalCompliance.hashCode())) * 31;
        Badge badge = this.f130914o;
        int hashCode11 = (hashCode10 + (badge == null ? 0 : badge.hashCode())) * 31;
        List<C11691b> list2 = this.f130915p;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Highlight highlight = this.f130916q;
        int hashCode13 = (hashCode12 + (highlight == null ? 0 : highlight.hashCode())) * 31;
        List<Disclaimer> list3 = this.f130917r;
        int hashCode14 = (hashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Disclaimer disclaimer = this.f130918s;
        int hashCode15 = (hashCode14 + (disclaimer == null ? 0 : disclaimer.hashCode())) * 31;
        List<Disclaimer> list4 = this.f130919t;
        if (list4 != null) {
            i10 = list4.hashCode();
        }
        return hashCode15 + i10;
    }

    public String toString() {
        String str = this.f130900a;
        String str2 = this.f130901b;
        String str3 = this.f130902c;
        String str4 = this.f130903d;
        String str5 = this.f130904e;
        boolean z10 = this.f130905f;
        String str6 = this.f130906g;
        Image image = this.f130907h;
        Image image2 = this.f130908i;
        com.ingka.ikea.core.model.product.a aVar = this.f130909j;
        String str7 = this.f130910k;
        List<DeliveryCalculationDisclaimer> list = this.f130911l;
        Link link = this.f130912m;
        TechnicalCompliance technicalCompliance = this.f130913n;
        Badge badge = this.f130914o;
        List<C11691b> list2 = this.f130915p;
        Highlight highlight = this.f130916q;
        List<Disclaimer> list3 = this.f130917r;
        Disclaimer disclaimer = this.f130918s;
        List<Disclaimer> list4 = this.f130919t;
        return "ProductLite(itemNo=" + str + ", itemType=" + str2 + ", title=" + str3 + ", description=" + str4 + ", energyLabel=" + str5 + ", isOnlineSellable=" + z10 + ", availabilityDisclaimer=" + str6 + ", image=" + image + ", contextualImage=" + image2 + ", pricePackage=" + aVar + ", colorInfo=" + str7 + ", deliveryCalculationDisclaimers=" + list + ", externalProductInfoLink=" + link + ", technicalCompliance=" + technicalCompliance + ", productBadge=" + badge + ", availability=" + list2 + ", productHighlight=" + highlight + ", priceDescriptions=" + list3 + ", energyClassDisclaimer=" + disclaimer + ", productDisclaimers=" + list4 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f130900a);
        parcel.writeString(this.f130901b);
        parcel.writeString(this.f130902c);
        parcel.writeString(this.f130903d);
        parcel.writeString(this.f130904e);
        parcel.writeInt(this.f130905f ? 1 : 0);
        parcel.writeString(this.f130906g);
        parcel.writeParcelable(this.f130907h, i10);
        parcel.writeParcelable(this.f130908i, i10);
        parcel.writeValue(this.f130909j);
        parcel.writeString(this.f130910k);
        List<DeliveryCalculationDisclaimer> list = this.f130911l;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (DeliveryCalculationDisclaimer writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i10);
            }
        }
        parcel.writeParcelable(this.f130912m, i10);
        parcel.writeParcelable(this.f130913n, i10);
        parcel.writeParcelable(this.f130914o, i10);
        List<C11691b> list2 = this.f130915p;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (C11691b writeParcelable2 : list2) {
                parcel.writeParcelable(writeParcelable2, i10);
            }
        }
        parcel.writeParcelable(this.f130916q, i10);
        List<Disclaimer> list3 = this.f130917r;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (Disclaimer writeParcelable3 : list3) {
                parcel.writeParcelable(writeParcelable3, i10);
            }
        }
        parcel.writeParcelable(this.f130918s, i10);
        List<Disclaimer> list4 = this.f130919t;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list4.size());
        for (Disclaimer writeParcelable4 : list4) {
            parcel.writeParcelable(writeParcelable4, i10);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C15029w(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, java.lang.String r31, com.ingka.ikea.core.model.Image r32, com.ingka.ikea.core.model.Image r33, com.ingka.ikea.core.model.product.a r34, java.lang.String r35, java.util.List r36, com.ingka.ikea.core.model.Link r37, com.ingka.ikea.core.model.product.TechnicalCompliance r38, com.ingka.ikea.core.model.product.Badge r39, java.util.List r40, com.ingka.ikea.core.model.product.Highlight r41, java.util.List r42, com.ingka.ikea.core.model.product.Disclaimer r43, java.util.List r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
        /*
            r24 = this;
            r0 = r45
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r12 = r2
            goto L_0x000b
        L_0x0009:
            r12 = r33
        L_0x000b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0012
            r16 = r2
            goto L_0x0014
        L_0x0012:
            r16 = r37
        L_0x0014:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x001b
            r17 = r2
            goto L_0x001d
        L_0x001b:
            r17 = r38
        L_0x001d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0024
            r18 = r2
            goto L_0x0026
        L_0x0024:
            r18 = r39
        L_0x0026:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002f
            r19 = r2
            goto L_0x0031
        L_0x002f:
            r19 = r40
        L_0x0031:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0039
            r20 = r2
            goto L_0x003b
        L_0x0039:
            r20 = r41
        L_0x003b:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0043
            r21 = r2
            goto L_0x0045
        L_0x0043:
            r21 = r42
        L_0x0045:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004d
            r22 = r2
            goto L_0x004f
        L_0x004d:
            r22 = r43
        L_0x004f:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0057
            r23 = r2
            goto L_0x0059
        L_0x0057:
            r23 = r44
        L_0x0059:
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r13 = r34
            r14 = r35
            r15 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rz.C15029w.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.ingka.ikea.core.model.Image, com.ingka.ikea.core.model.Image, com.ingka.ikea.core.model.product.a, java.lang.String, java.util.List, com.ingka.ikea.core.model.Link, com.ingka.ikea.core.model.product.TechnicalCompliance, com.ingka.ikea.core.model.product.Badge, java.util.List, com.ingka.ikea.core.model.product.Highlight, java.util.List, com.ingka.ikea.core.model.product.Disclaimer, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
