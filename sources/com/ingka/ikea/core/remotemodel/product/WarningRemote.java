package com.ingka.ikea.core.remotemodel.product;

import HJ.C15854t;
import com.ingka.ikea.core.model.product.Warning;
import com.ingka.ikea.core.model.product.WarningImageType;
import com.ingka.ikea.core.model.product.WarningMoreInfo;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 /2\u00020\u0001:\u00020\u0017BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b'\u0010!\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/WarningRemote;", "", "", "seen0", "", "imageType", "boldText", "text", "Lcom/ingka/ikea/core/remotemodel/product/WarningMoreInfoRemote;", "moreInfo", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/product/WarningMoreInfoRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/product/WarningRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/Warning;", "a", "()Lcom/ingka/ikea/core/model/product/Warning;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageType$remote_model_release", "getImageType$remote_model_release$annotations", "()V", "getBoldText$remote_model_release", "getBoldText$remote_model_release$annotations", "c", "getText$remote_model_release", "getText$remote_model_release$annotations", "d", "Lcom/ingka/ikea/core/remotemodel/product/WarningMoreInfoRemote;", "getMoreInfo$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/WarningMoreInfoRemote;", "getMoreInfo$remote_model_release$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WarningRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95447a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95448b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95449c;

    /* renamed from: d  reason: collision with root package name */
    private final WarningMoreInfoRemote f95450d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/WarningRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/WarningRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<WarningRemote> serializer() {
            return WarningRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WarningRemote(int i10, String str, String str2, String str3, WarningMoreInfoRemote warningMoreInfoRemote, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, WarningRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95447a = str;
        this.f95448b = str2;
        this.f95449c = str3;
        this.f95450d = warningMoreInfoRemote;
    }

    public static final /* synthetic */ void b(WarningRemote warningRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, warningRemote.f95447a);
        dVar.B(serialDescriptor, 1, y02, warningRemote.f95448b);
        dVar.B(serialDescriptor, 2, y02, warningRemote.f95449c);
        dVar.B(serialDescriptor, 3, WarningMoreInfoRemote$$serializer.INSTANCE, warningRemote.f95450d);
    }

    public final Warning a() {
        char c10;
        String str;
        String str2 = this.f95447a;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        Class<WarningRemote> cls = WarningRemote.class;
        WarningMoreInfo warningMoreInfo = null;
        if (str2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No imageType received");
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
        try {
            WarningImageType valueOf = WarningImageType.valueOf(str2);
            String str8 = this.f95449c;
            if (str8 != null) {
                String str9 = this.f95448b;
                WarningMoreInfoRemote warningMoreInfoRemote = this.f95450d;
                if (warningMoreInfoRemote != null) {
                    warningMoreInfo = warningMoreInfoRemote.a();
                }
                return new Warning(valueOf, str8, str9, warningMoreInfo);
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (IllegalArgumentException unused) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Invalid imageType: " + str2);
            e eVar2 = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str10 = null;
            String str11 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str10 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException2);
                    if (a11 == null) {
                        break;
                    }
                    str10 = C11820c.a(a11);
                }
                if (str11 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    c10 = '$';
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str7) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    c10 = '$';
                }
                char c11 = c10;
                bVar2.a(eVar2, str11, false, illegalArgumentException2, str10);
            }
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningRemote)) {
            return false;
        }
        WarningRemote warningRemote = (WarningRemote) obj;
        return C17542s.e(this.f95447a, warningRemote.f95447a) && C17542s.e(this.f95448b, warningRemote.f95448b) && C17542s.e(this.f95449c, warningRemote.f95449c) && C17542s.e(this.f95450d, warningRemote.f95450d);
    }

    public int hashCode() {
        String str = this.f95447a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95448b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95449c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WarningMoreInfoRemote warningMoreInfoRemote = this.f95450d;
        if (warningMoreInfoRemote != null) {
            i10 = warningMoreInfoRemote.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f95447a;
        String str2 = this.f95448b;
        String str3 = this.f95449c;
        WarningMoreInfoRemote warningMoreInfoRemote = this.f95450d;
        return "WarningRemote(imageType=" + str + ", boldText=" + str2 + ", text=" + str3 + ", moreInfo=" + warningMoreInfoRemote + ")";
    }
}
