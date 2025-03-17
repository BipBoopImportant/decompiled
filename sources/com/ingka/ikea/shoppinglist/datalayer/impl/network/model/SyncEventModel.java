package com.ingka.ikea.shoppinglist.datalayer.impl.network.model;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.io.Serializable;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 +2\u00020\u0001:\u0002 ,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0018R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010$\u001a\u0004\b'\u0010(R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010!\u0012\u0004\b*\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006-"}, d2 = {"Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;", "Ljava/io/Serializable;", "", "shoppingListId", "", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/ShoppingBagRequestItem;", "items", "event", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "getShoppingListId$annotations", "()V", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "getItems$annotations", "getEvent$annotations", "Companion", "$serializer", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SyncEventModel implements Serializable {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f120297d = {null, new C17451f(ShoppingBagRequestItem$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final String f120298a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ShoppingBagRequestItem> f120299b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120300c;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "EVENT_ADD", "Ljava/lang/String;", "EVENT_REMOVE", "EVENT_UPDATE", "EVENT_CLEAR", "EVENT_SYNC", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SyncEventModel> serializer() {
            return SyncEventModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public /* synthetic */ SyncEventModel(int i10, String str, List list, String str2, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, SyncEventModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120298a = str;
        this.f120299b = list;
        this.f120300c = str2;
        if (str.length() == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Event: " + str2 + ", provided without any list id");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str3 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str4 == null) {
                    String name = SyncEventModel.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str4;
                bVar.a(eVar, str5, false, illegalArgumentException, str3);
                str4 = str5;
            }
        }
    }

    public static final /* synthetic */ void e(SyncEventModel syncEventModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120297d;
        dVar.y(serialDescriptor, 0, syncEventModel.f120298a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], syncEventModel.f120299b);
        dVar.y(serialDescriptor, 2, syncEventModel.f120300c);
    }

    public final String b() {
        return this.f120300c;
    }

    public final List<ShoppingBagRequestItem> c() {
        return this.f120299b;
    }

    public final String d() {
        return this.f120298a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncEventModel)) {
            return false;
        }
        SyncEventModel syncEventModel = (SyncEventModel) obj;
        return C17542s.e(this.f120298a, syncEventModel.f120298a) && C17542s.e(this.f120299b, syncEventModel.f120299b) && C17542s.e(this.f120300c, syncEventModel.f120300c);
    }

    public int hashCode() {
        int hashCode = this.f120298a.hashCode() * 31;
        List<ShoppingBagRequestItem> list = this.f120299b;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f120300c.hashCode();
    }

    public String toString() {
        String str = this.f120298a;
        List<ShoppingBagRequestItem> list = this.f120299b;
        String str2 = this.f120300c;
        return "SyncEventModel(shoppingListId=" + str + ", items=" + list + ", event=" + str2 + ")";
    }

    public SyncEventModel(String str, List<ShoppingBagRequestItem> list, String str2) {
        C17542s.j(str, "shoppingListId");
        C17542s.j(str2, "event");
        this.f120298a = str;
        this.f120299b = list;
        this.f120300c = str2;
        if (str.length() == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Event: " + str2 + ", provided without any list id");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str3 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = SyncEventModel.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, illegalArgumentException, str5);
                str3 = str5;
                str4 = str6;
            }
        }
    }
}
