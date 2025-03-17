package com.ingka.ikea.shareprovider.impl.network;

import FA.C12859a;
import HJ.C15854t;
import androidx.annotation.Keep;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.X;
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
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 02\u00020\u0001:\u000212B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001d¨\u00063"}, d2 = {"Lcom/ingka/ikea/shareprovider/impl/network/SharedItemModel;", "", "", "itemNumber", "itemType", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$shareprovider_implementation_release", "(Lcom/ingka/ikea/shareprovider/impl/network/SharedItemModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "LFA/a$a;", "convertToLocal", "()LFA/a$a;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ingka/ikea/shareprovider/impl/network/SharedItemModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemNumber", "getItemNumber$annotations", "()V", "getItemType", "getItemType$annotations", "Ljava/lang/Integer;", "getQuantity", "getQuantity$annotations", "Companion", "$serializer", "a", "shareprovider-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SharedItemModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final String itemNumber;
    private final String itemType;
    private final Integer quantity;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shareprovider/impl/network/SharedItemModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shareprovider/impl/network/SharedItemModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "shareprovider-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<SharedItemModel> serializer() {
            return SharedItemModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SharedItemModel(int i10, String str, String str2, Integer num, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, SharedItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.itemNumber = str;
        this.itemType = str2;
        this.quantity = num;
    }

    public static /* synthetic */ SharedItemModel copy$default(SharedItemModel sharedItemModel, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sharedItemModel.itemNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = sharedItemModel.itemType;
        }
        if ((i10 & 4) != 0) {
            num = sharedItemModel.quantity;
        }
        return sharedItemModel.copy(str, str2, num);
    }

    public static /* synthetic */ void getItemNumber$annotations() {
    }

    public static /* synthetic */ void getItemType$annotations() {
    }

    public static /* synthetic */ void getQuantity$annotations() {
    }

    public static final /* synthetic */ void write$Self$shareprovider_implementation_release(SharedItemModel sharedItemModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, sharedItemModel.itemNumber);
        dVar.B(serialDescriptor, 1, y02, sharedItemModel.itemType);
        dVar.B(serialDescriptor, 2, X.f144073a, sharedItemModel.quantity);
    }

    public final String component1() {
        return this.itemNumber;
    }

    public final String component2() {
        return this.itemType;
    }

    public final Integer component3() {
        return this.quantity;
    }

    public final C12859a.C2618a convertToLocal() {
        String str;
        String str2 = this.itemNumber;
        int i10 = 1;
        if (str2 == null || str2.length() == 0 || (str = this.itemType) == null || str.length() == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid shared item: " + this);
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
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = SharedItemModel.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, illegalArgumentException, str5);
                str3 = str5;
                str4 = str6;
            }
            return null;
        }
        String str7 = this.itemNumber;
        String str8 = this.itemType;
        Integer num = this.quantity;
        if (num != null) {
            i10 = num.intValue();
        }
        return new C12859a.C2618a(str7, str8, i10);
    }

    public final SharedItemModel copy(String str, String str2, Integer num) {
        return new SharedItemModel(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedItemModel)) {
            return false;
        }
        SharedItemModel sharedItemModel = (SharedItemModel) obj;
        return C17542s.e(this.itemNumber, sharedItemModel.itemNumber) && C17542s.e(this.itemType, sharedItemModel.itemType) && C17542s.e(this.quantity, sharedItemModel.quantity);
    }

    public final String getItemNumber() {
        return this.itemNumber;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        String str = this.itemNumber;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.itemNumber;
        String str2 = this.itemType;
        Integer num = this.quantity;
        return "SharedItemModel(itemNumber=" + str + ", itemType=" + str2 + ", quantity=" + num + ")";
    }

    public SharedItemModel(String str, String str2, Integer num) {
        this.itemNumber = str;
        this.itemType = str2;
        this.quantity = num;
    }
}
