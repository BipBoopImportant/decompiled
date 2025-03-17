package com.ingka.ikea.reassurance.impl.network;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import cy.C14325a;
import cy.C14326b;
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
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 &2\u00020\u0001:\u0002' B5\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0004¢\u0006\f\n\u0004\b\u0016\u0010$\u0012\u0004\b%\u0010#¨\u0006("}, d2 = {"Lcom/ingka/ikea/reassurance/impl/network/ReassuranceContentModel;", "", "", "seen0", "", "type", "", "Lcom/ingka/ikea/reassurance/impl/network/ReassuranceContentItemModel;", "content", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/reassurance/impl/network/ReassuranceContentModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcy/a;", "b", "()Lcy/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType$annotations", "()V", "Ljava/util/List;", "getContent$annotations", "Companion", "$serializer", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReassuranceContentModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f119664c = 8;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f119665d = {null, new C17451f(ReassuranceContentItemModel$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f119666a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ReassuranceContentItemModel> f119667b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/reassurance/impl/network/ReassuranceContentModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/reassurance/impl/network/ReassuranceContentModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ReassuranceContentModel> serializer() {
            return ReassuranceContentModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ReassuranceContentModel(int i10, String str, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ReassuranceContentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f119666a = str;
        this.f119667b = list;
    }

    public static final /* synthetic */ void c(ReassuranceContentModel reassuranceContentModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119665d;
        dVar.B(serialDescriptor, 0, Y0.f144077a, reassuranceContentModel.f119666a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], reassuranceContentModel.f119667b);
    }

    public final C14325a b() {
        char c10;
        String str;
        String str2 = this.f119666a;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        Class<ReassuranceContentModel> cls = ReassuranceContentModel.class;
        if (str2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Reassurance content type is null");
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
        List<ReassuranceContentItemModel> list = this.f119667b;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ReassuranceContentItemModel a11 : list) {
                C14326b a12 = a11.a();
                if (a12 != null) {
                    arrayList2.add(a12);
                }
            }
            return new C14325a(this.f119666a, arrayList2);
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Reassurance content content is null");
        e eVar2 = e.ERROR;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next2 : d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList3.add(next2);
            }
        }
        String str8 = null;
        String str9 = null;
        for (C11819b bVar2 : arrayList3) {
            if (str8 == null) {
                String a13 = C11818a.a((String) null, illegalArgumentException2);
                if (a13 == null) {
                    break;
                }
                str8 = C11820c.a(a13);
            }
            if (str9 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                c10 = '$';
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str7) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                c10 = '$';
            }
            char c11 = c10;
            bVar2.a(eVar2, str9, false, illegalArgumentException2, str8);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReassuranceContentModel)) {
            return false;
        }
        ReassuranceContentModel reassuranceContentModel = (ReassuranceContentModel) obj;
        return C17542s.e(this.f119666a, reassuranceContentModel.f119666a) && C17542s.e(this.f119667b, reassuranceContentModel.f119667b);
    }

    public int hashCode() {
        String str = this.f119666a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ReassuranceContentItemModel> list = this.f119667b;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f119666a;
        List<ReassuranceContentItemModel> list = this.f119667b;
        return "ReassuranceContentModel(type=" + str + ", content=" + list + ")";
    }
}
