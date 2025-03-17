package com.ingka.ikea.shareprovider.impl.network;

import FA.C12859a;
import YH.C16877v;
import androidx.annotation.Keep;
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

@p
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 .2\u00020\u0001:\u0002/0B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001d¨\u00061"}, d2 = {"Lcom/ingka/ikea/shareprovider/impl/network/SharedListModel;", "", "", "Lcom/ingka/ikea/shareprovider/impl/network/SharedItemModel;", "items", "", "listName", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$shareprovider_implementation_release", "(Lcom/ingka/ikea/shareprovider/impl/network/SharedListModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "LFA/a;", "convertToLocal", "()LFA/a;", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/ingka/ikea/shareprovider/impl/network/SharedListModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "getItems$annotations", "()V", "Ljava/lang/String;", "getListName", "getListName$annotations", "Companion", "$serializer", "a", "shareprovider-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SharedListModel {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {new C17451f(SharedItemModel$$serializer.INSTANCE), null};
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final List<SharedItemModel> items;
    private final String listName;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shareprovider/impl/network/SharedListModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shareprovider/impl/network/SharedListModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "shareprovider-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<SharedListModel> serializer() {
            return SharedListModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SharedListModel(int i10, List list, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, SharedListModel$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        this.listName = str;
    }

    public static /* synthetic */ SharedListModel copy$default(SharedListModel sharedListModel, List<SharedItemModel> list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = sharedListModel.items;
        }
        if ((i10 & 2) != 0) {
            str = sharedListModel.listName;
        }
        return sharedListModel.copy(list, str);
    }

    public static /* synthetic */ void getItems$annotations() {
    }

    public static /* synthetic */ void getListName$annotations() {
    }

    public static final /* synthetic */ void write$Self$shareprovider_implementation_release(SharedListModel sharedListModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, $childSerializers[0], sharedListModel.items);
        dVar.B(serialDescriptor, 1, Y0.f144077a, sharedListModel.listName);
    }

    public final List<SharedItemModel> component1() {
        return this.items;
    }

    public final String component2() {
        return this.listName;
    }

    public final C12859a convertToLocal() {
        List list;
        String str = this.listName;
        if (str == null) {
            str = "";
        }
        List<SharedItemModel> list2 = this.items;
        if (list2 != null) {
            list = new ArrayList();
            for (SharedItemModel convertToLocal : list2) {
                C12859a.C2618a convertToLocal2 = convertToLocal.convertToLocal();
                if (convertToLocal2 != null) {
                    list.add(convertToLocal2);
                }
            }
        } else {
            list = C16877v.n();
        }
        return new C12859a(str, list);
    }

    public final SharedListModel copy(List<SharedItemModel> list, String str) {
        return new SharedListModel(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedListModel)) {
            return false;
        }
        SharedListModel sharedListModel = (SharedListModel) obj;
        return C17542s.e(this.items, sharedListModel.items) && C17542s.e(this.listName, sharedListModel.listName);
    }

    public final List<SharedItemModel> getItems() {
        return this.items;
    }

    public final String getListName() {
        return this.listName;
    }

    public int hashCode() {
        List<SharedItemModel> list = this.items;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.listName;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        List<SharedItemModel> list = this.items;
        String str = this.listName;
        return "SharedListModel(items=" + list + ", listName=" + str + ")";
    }

    public SharedListModel(List<SharedItemModel> list, String str) {
        this.items = list;
        this.listName = str;
    }
}
