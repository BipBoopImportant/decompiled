package com.ingka.ikea.reassurance.impl.network;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import cy.d;
import cy.e;
import fK.p;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001fB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/ingka/ikea/reassurance/impl/network/ReassuranceModel;", "", "", "seen0", "", "Lcom/ingka/ikea/reassurance/impl/network/ReassurancePartModel;", "reassurance", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/reassurance/impl/network/ReassuranceModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcy/d;", "b", "()Lcy/d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getReassurance$annotations", "()V", "Companion", "$serializer", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReassuranceModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f119669b = 8;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f119670c = {new C17451f(ReassurancePartModel$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<ReassurancePartModel> f119671a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/reassurance/impl/network/ReassuranceModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/reassurance/impl/network/ReassuranceModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ReassuranceModel> serializer() {
            return ReassuranceModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ReassuranceModel(int i10, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, ReassuranceModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f119671a = list;
    }

    public final d b() {
        List<ReassurancePartModel> list = this.f119671a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (ReassurancePartModel b10 : list) {
                e b11 = b10.b();
                if (b11 != null) {
                    arrayList.add(b11);
                }
            }
            return new d(arrayList);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Reassurance is null");
        qv.e eVar = qv.e.ERROR;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList2.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList2) {
            if (str == null) {
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = ReassuranceModel.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalArgumentException, str3);
            str = str3;
            str2 = str4;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReassuranceModel) && C17542s.e(this.f119671a, ((ReassuranceModel) obj).f119671a);
    }

    public int hashCode() {
        List<ReassurancePartModel> list = this.f119671a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<ReassurancePartModel> list = this.f119671a;
        return "ReassuranceModel(reassurance=" + list + ")";
    }
}
