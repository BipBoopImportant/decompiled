package com.ingka.ikea.reassurance.impl.network;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import cy.C14326b;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u0015B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b\"\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u0012\u0004\b$\u0010!¨\u0006'"}, d2 = {"Lcom/ingka/ikea/reassurance/impl/network/ReassuranceContentItemModel;", "", "", "seen0", "", "type", "value", "link", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/reassurance/impl/network/ReassuranceContentItemModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcy/b;", "a", "()Lcy/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType$annotations", "()V", "getValue$annotations", "c", "getLink$annotations", "Companion", "$serializer", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReassuranceContentItemModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f119660a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119661b;

    /* renamed from: c  reason: collision with root package name */
    private final String f119662c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/reassurance/impl/network/ReassuranceContentItemModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/reassurance/impl/network/ReassuranceContentItemModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ReassuranceContentItemModel> serializer() {
            return ReassuranceContentItemModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ReassuranceContentItemModel(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ReassuranceContentItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f119660a = str;
        this.f119661b = str2;
        this.f119662c = str3;
    }

    public static final /* synthetic */ void b(ReassuranceContentItemModel reassuranceContentItemModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, reassuranceContentItemModel.f119660a);
        dVar.B(serialDescriptor, 1, y02, reassuranceContentItemModel.f119661b);
        dVar.B(serialDescriptor, 2, y02, reassuranceContentItemModel.f119662c);
    }

    public final C14326b a() {
        String str;
        char c10;
        String str2;
        String str3 = this.f119660a;
        String str4 = DslKt.INDICATOR_BACKGROUND;
        String str5 = DslKt.INDICATOR_MAIN;
        Class<ReassuranceContentItemModel> cls = ReassuranceContentItemModel.class;
        if (str3 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Reassurance content item type is null");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar : arrayList) {
                if (str6 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str6 = C11820c.a(a10);
                }
                if (str7 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str2 = str4;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str5 : str2) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str2 = str4;
                }
                String str8 = str7;
                bVar.a(eVar, str8, false, illegalArgumentException, str6);
                str7 = str8;
                eVar = eVar;
                str4 = str2;
            }
            return null;
        }
        String str9 = str4;
        if (this.f119661b != null) {
            return new C14326b(this.f119660a, this.f119661b, this.f119662c);
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Reassurance content item value is null");
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
                str = str5;
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str9) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                str = str5;
                c10 = '$';
            }
            char c11 = c10;
            bVar2.a(eVar2, str11, false, illegalArgumentException2, str10);
            str5 = str;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReassuranceContentItemModel)) {
            return false;
        }
        ReassuranceContentItemModel reassuranceContentItemModel = (ReassuranceContentItemModel) obj;
        return C17542s.e(this.f119660a, reassuranceContentItemModel.f119660a) && C17542s.e(this.f119661b, reassuranceContentItemModel.f119661b) && C17542s.e(this.f119662c, reassuranceContentItemModel.f119662c);
    }

    public int hashCode() {
        String str = this.f119660a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f119661b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f119662c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f119660a;
        String str2 = this.f119661b;
        String str3 = this.f119662c;
        return "ReassuranceContentItemModel(type=" + str + ", value=" + str2 + ", link=" + str3 + ")";
    }
}
