package com.ingka.ikea.core.remotemodel.product;

import HJ.C15854t;
import com.ingka.ikea.core.model.product.WarningImageType;
import com.ingka.ikea.core.model.product.WarningMoreInfo;
import com.ingka.ikea.core.model.product.WarningMoreInfoUrl;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 32\u00020\u0001:\u00024\u0018BM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b(\u0010\"\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b+\u0010\"\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010%\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/WarningMoreInfoRemote;", "", "", "seen0", "", "title", "imageType", "boldText", "text", "Lcom/ingka/ikea/core/remotemodel/product/MoreInfoUrlTextRemote;", "urlText", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/product/MoreInfoUrlTextRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/product/WarningMoreInfoRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "a", "()Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle$remote_model_release", "getTitle$remote_model_release$annotations", "()V", "getImageType$remote_model_release", "getImageType$remote_model_release$annotations", "c", "getBoldText$remote_model_release", "getBoldText$remote_model_release$annotations", "d", "getText$remote_model_release", "getText$remote_model_release$annotations", "e", "Lcom/ingka/ikea/core/remotemodel/product/MoreInfoUrlTextRemote;", "getUrlText$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/MoreInfoUrlTextRemote;", "getUrlText$remote_model_release$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WarningMoreInfoRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95442a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95443b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95444c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95445d;

    /* renamed from: e  reason: collision with root package name */
    private final MoreInfoUrlTextRemote f95446e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/WarningMoreInfoRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/WarningMoreInfoRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<WarningMoreInfoRemote> serializer() {
            return WarningMoreInfoRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WarningMoreInfoRemote(int i10, String str, String str2, String str3, String str4, MoreInfoUrlTextRemote moreInfoUrlTextRemote, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, WarningMoreInfoRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95442a = str;
        this.f95443b = str2;
        this.f95444c = str3;
        this.f95445d = str4;
        this.f95446e = moreInfoUrlTextRemote;
    }

    public static final /* synthetic */ void b(WarningMoreInfoRemote warningMoreInfoRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, warningMoreInfoRemote.f95442a);
        dVar.B(serialDescriptor, 1, y02, warningMoreInfoRemote.f95443b);
        dVar.B(serialDescriptor, 2, y02, warningMoreInfoRemote.f95444c);
        dVar.B(serialDescriptor, 3, y02, warningMoreInfoRemote.f95445d);
        dVar.B(serialDescriptor, 4, MoreInfoUrlTextRemote$$serializer.INSTANCE, warningMoreInfoRemote.f95446e);
    }

    public final WarningMoreInfo a() {
        char c10;
        String str;
        String str2 = this.f95442a;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        Class<WarningMoreInfoRemote> cls = WarningMoreInfoRemote.class;
        WarningMoreInfoUrl warningMoreInfoUrl = null;
        if (str2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No title received");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str4 = C11820c.a(a10);
                }
                if (str5 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str = str3;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str = str3;
                }
                String str6 = str5;
                bVar.a(eVar, str6, false, illegalArgumentException, str4);
                str5 = str6;
                eVar = eVar;
                str3 = str;
            }
            return null;
        }
        String str7 = str3;
        String str8 = this.f95443b;
        if (str8 == null) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("No imageType received");
            e eVar2 = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str9 = null;
            String str10 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str9 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException2);
                    if (a11 == null) {
                        break;
                    }
                    str9 = C11820c.a(a11);
                }
                if (str10 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str7) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str10, false, illegalArgumentException2, str9);
            }
            return null;
        }
        try {
            WarningImageType valueOf = WarningImageType.valueOf(str8);
            String str11 = this.f95445d;
            if (str11 == null) {
                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("No type received");
                e eVar3 = e.ERROR;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str12 = null;
                String str13 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str12 == null) {
                        String a12 = C11818a.a((String) null, illegalArgumentException3);
                        if (a12 == null) {
                            break;
                        }
                        str12 = C11820c.a(a12);
                    }
                    if (str13 == null) {
                        String name3 = cls.getName();
                        C17542s.g(name3);
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o14.length() != 0) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str13 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str7) + DslKt.INDICATOR_SEPARATOR + name3;
                    }
                    bVar3.a(eVar3, str13, false, illegalArgumentException3, str12);
                }
                return null;
            }
            String str14 = this.f95444c;
            MoreInfoUrlTextRemote moreInfoUrlTextRemote = this.f95446e;
            if (moreInfoUrlTextRemote != null) {
                warningMoreInfoUrl = moreInfoUrlTextRemote.a();
            }
            return new WarningMoreInfo(str2, valueOf, str11, str14, warningMoreInfoUrl);
        } catch (IllegalArgumentException unused) {
            IllegalArgumentException illegalArgumentException4 = new IllegalArgumentException("Invalid imageType: " + str8);
            e eVar4 = e.ERROR;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next4 : d.f102012a.a()) {
                if (((C11819b) next4).b(eVar4, false)) {
                    arrayList4.add(next4);
                }
            }
            String str15 = null;
            String str16 = null;
            for (C11819b bVar4 : arrayList4) {
                if (str15 == null) {
                    String a13 = C11818a.a((String) null, illegalArgumentException4);
                    if (a13 == null) {
                        break;
                    }
                    str15 = C11820c.a(a13);
                }
                if (str16 == null) {
                    String name4 = cls.getName();
                    C17542s.g(name4);
                    c10 = '$';
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    str16 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str7) + DslKt.INDICATOR_SEPARATOR + name4;
                } else {
                    c10 = '$';
                }
                char c11 = c10;
                bVar4.a(eVar4, str16, false, illegalArgumentException4, str15);
            }
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningMoreInfoRemote)) {
            return false;
        }
        WarningMoreInfoRemote warningMoreInfoRemote = (WarningMoreInfoRemote) obj;
        return C17542s.e(this.f95442a, warningMoreInfoRemote.f95442a) && C17542s.e(this.f95443b, warningMoreInfoRemote.f95443b) && C17542s.e(this.f95444c, warningMoreInfoRemote.f95444c) && C17542s.e(this.f95445d, warningMoreInfoRemote.f95445d) && C17542s.e(this.f95446e, warningMoreInfoRemote.f95446e);
    }

    public int hashCode() {
        String str = this.f95442a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95443b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95444c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95445d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MoreInfoUrlTextRemote moreInfoUrlTextRemote = this.f95446e;
        if (moreInfoUrlTextRemote != null) {
            i10 = moreInfoUrlTextRemote.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.f95442a;
        String str2 = this.f95443b;
        String str3 = this.f95444c;
        String str4 = this.f95445d;
        MoreInfoUrlTextRemote moreInfoUrlTextRemote = this.f95446e;
        return "WarningMoreInfoRemote(title=" + str + ", imageType=" + str2 + ", boldText=" + str3 + ", text=" + str4 + ", urlText=" + moreInfoUrlTextRemote + ")";
    }
}
