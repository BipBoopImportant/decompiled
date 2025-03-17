package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import HJ.C15854t;
import Hx.b;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.X;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b!\b\b\u0018\u0000 @2\u00020\u0001:\u0003A\u001bBBa\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010%\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010%\u0012\u0004\b5\u0010(\u001a\u0004\b4\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010(\u001a\u0004\b8\u00109R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010(\u001a\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote;", "", "", "seen0", "", "itemNumber", "itemType", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote$Image;", "image", "name", "description", "quantity", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;", "totalPrice", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote$Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LHx/b;", "a", "()LHx/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemNumber", "getItemNumber$annotations", "()V", "getItemType", "getItemType$annotations", "c", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote$Image;", "getImage", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote$Image;", "getImage$annotations", "d", "getName", "getName$annotations", "e", "getDescription", "getDescription$annotations", "f", "Ljava/lang/Integer;", "getQuantity", "()Ljava/lang/Integer;", "getQuantity$annotations", "g", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;", "getTotalPrice", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;", "getTotalPrice$annotations", "Companion", "Image", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PurchaseArticleRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f119532a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119533b;

    /* renamed from: c  reason: collision with root package name */
    private final Image f119534c;

    /* renamed from: d  reason: collision with root package name */
    private final String f119535d;

    /* renamed from: e  reason: collision with root package name */
    private final String f119536e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f119537f;

    /* renamed from: g  reason: collision with root package name */
    private final MoneyRemote f119538g;

    @p
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001aB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote$Image;", "", "", "seen0", "", "thumbnailUrl", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote$Image;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getThumbnailUrl$annotations", "()V", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Image {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f119541a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote$Image$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote$Image;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Image> serializer() {
                return PurchaseArticleRemote$Image$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Image(int i10, String str, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, PurchaseArticleRemote$Image$$serializer.INSTANCE.getDescriptor());
            }
            this.f119541a = str;
        }

        public final String a() {
            return this.f119541a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Image) && C17542s.e(this.f119541a, ((Image) obj).f119541a);
        }

        public int hashCode() {
            String str = this.f119541a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f119541a;
            return "Image(thumbnailUrl=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseArticleRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "ART", "Ljava/lang/String;", "SPR", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PurchaseArticleRemote> serializer() {
            return PurchaseArticleRemote$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public /* synthetic */ PurchaseArticleRemote(int i10, String str, String str2, Image image, String str3, String str4, Integer num, MoneyRemote moneyRemote, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, PurchaseArticleRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119532a = str;
        this.f119533b = str2;
        this.f119534c = image;
        this.f119535d = str3;
        this.f119536e = str4;
        this.f119537f = num;
        this.f119538g = moneyRemote;
    }

    public static final /* synthetic */ void b(PurchaseArticleRemote purchaseArticleRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, purchaseArticleRemote.f119532a);
        dVar.B(serialDescriptor, 1, y02, purchaseArticleRemote.f119533b);
        dVar.B(serialDescriptor, 2, PurchaseArticleRemote$Image$$serializer.INSTANCE, purchaseArticleRemote.f119534c);
        dVar.B(serialDescriptor, 3, y02, purchaseArticleRemote.f119535d);
        dVar.B(serialDescriptor, 4, y02, purchaseArticleRemote.f119536e);
        dVar.B(serialDescriptor, 5, X.f144073a, purchaseArticleRemote.f119537f);
        dVar.B(serialDescriptor, 6, MoneyRemote$$serializer.INSTANCE, purchaseArticleRemote.f119538g);
    }

    public final b a() {
        String str;
        String str2;
        int i10;
        Iterator it;
        Class<PurchaseArticleRemote> cls;
        String str3;
        String str4;
        String str5 = this.f119532a;
        if (str5 == null || C15854t.v0(str5)) {
            throw new IllegalArgumentException("Missing item number");
        }
        String str6 = this.f119533b;
        String str7 = (!C17542s.e(str6, "ART") && C17542s.e(str6, "SPR")) ? "SPR" : "ART";
        Image image = this.f119534c;
        String str8 = null;
        String a10 = image != null ? image.a() : null;
        String str9 = this.f119535d;
        String str10 = DslKt.INDICATOR_BACKGROUND;
        String str11 = DslKt.INDICATOR_MAIN;
        Class<PurchaseArticleRemote> cls2 = PurchaseArticleRemote.class;
        if (str9 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing name");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str12 = null;
            String str13 = null;
            for (C11819b bVar : arrayList) {
                if (str12 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 == null) {
                        break;
                    }
                    str12 = C11820c.a(a11);
                }
                if (str13 == null) {
                    String name = cls2.getName();
                    C17542s.g(name);
                    str3 = str10;
                    str4 = str11;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str13 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str4 : str3) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str3 = str10;
                    str4 = str11;
                }
                e eVar2 = eVar;
                bVar.a(eVar2, str13, false, illegalArgumentException, str12);
                eVar = eVar2;
                str10 = str3;
                str11 = str4;
            }
            str2 = str10;
            str = str11;
            str9 = "";
        } else {
            str2 = str10;
            str = str11;
        }
        Integer num = this.f119537f;
        if (num != null) {
            i10 = num.intValue();
        } else {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Missing quantity");
            e eVar3 = e.ERROR;
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar3, false)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            String str14 = null;
            String str15 = null;
            while (it2.hasNext()) {
                C11819b bVar2 = (C11819b) it2.next();
                if (str14 == null) {
                    String a12 = C11818a.a(str8, illegalArgumentException2);
                    if (a12 == null) {
                        break;
                    }
                    str14 = C11820c.a(a12);
                }
                if (str15 == null) {
                    String name2 = cls2.getName();
                    C17542s.g(name2);
                    it = it2;
                    cls = cls2;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', str8, 2, str8), '.', str8, 2, str8);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str15 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    it = it2;
                    cls = cls2;
                }
                String str16 = str15;
                bVar2.a(eVar3, str16, false, illegalArgumentException2, str14);
                str15 = str16;
                it2 = it;
                cls2 = cls;
                str8 = null;
            }
            i10 = 1;
        }
        String str17 = this.f119532a;
        String str18 = this.f119536e;
        MoneyRemote moneyRemote = this.f119538g;
        return new b(str17, str7, str9, str18, i10, a10, moneyRemote != null ? moneyRemote.b() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseArticleRemote)) {
            return false;
        }
        PurchaseArticleRemote purchaseArticleRemote = (PurchaseArticleRemote) obj;
        return C17542s.e(this.f119532a, purchaseArticleRemote.f119532a) && C17542s.e(this.f119533b, purchaseArticleRemote.f119533b) && C17542s.e(this.f119534c, purchaseArticleRemote.f119534c) && C17542s.e(this.f119535d, purchaseArticleRemote.f119535d) && C17542s.e(this.f119536e, purchaseArticleRemote.f119536e) && C17542s.e(this.f119537f, purchaseArticleRemote.f119537f) && C17542s.e(this.f119538g, purchaseArticleRemote.f119538g);
    }

    public int hashCode() {
        String str = this.f119532a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f119533b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.f119534c;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.f119535d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f119536e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f119537f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        MoneyRemote moneyRemote = this.f119538g;
        if (moneyRemote != null) {
            i10 = moneyRemote.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        String str = this.f119532a;
        String str2 = this.f119533b;
        Image image = this.f119534c;
        String str3 = this.f119535d;
        String str4 = this.f119536e;
        Integer num = this.f119537f;
        MoneyRemote moneyRemote = this.f119538g;
        return "PurchaseArticleRemote(itemNumber=" + str + ", itemType=" + str2 + ", image=" + image + ", name=" + str3 + ", description=" + str4 + ", quantity=" + num + ", totalPrice=" + moneyRemote + ")";
    }
}
