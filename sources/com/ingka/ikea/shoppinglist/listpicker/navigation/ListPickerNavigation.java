package com.ingka.ikea.shoppinglist.listpicker.navigation;

import Ae.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.analytics.Interaction$Component;
import fK.C17261n;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.J;
import jK.T0;
import jK.Y0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sB.C15035a;
import uI.C18055d;
import x4.C8951o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u000b\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "", "Lx4/o;", "navController", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "operation", "", "requestKey", "LXH/N;", "a", "(Lx4/o;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;Ljava/lang/String;)V", "Operation", "b", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ListPickerNavigation {

    @p
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0004\u0007\b\t\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "a", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "analytics", "Companion", "AddOrRemove", "AddAll", "Analytics", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddAll;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddOrRemove;", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Operation {
        public static final a Companion = a.f120375a;

        @p
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 *2\u00020\u0001:\u0003+, B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010%\u001a\u0004\b \u0010(¨\u0006-"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddAll;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddAll$ProductData;", "products", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "analytics", "<init>", "(Ljava/util/List;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddAll;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "getProducts$annotations", "()V", "b", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "getAnalytics$annotations", "Companion", "ProductData", "$serializer", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AddAll implements Operation {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: c  reason: collision with root package name */
            public static final int f120362c = 8;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public static final KSerializer<Object>[] f120363d = {new C17451f(ListPickerNavigation$Operation$AddAll$ProductData$$serializer.INSTANCE), null};

            /* renamed from: a  reason: collision with root package name */
            private final List<ProductData> f120364a;

            /* renamed from: b  reason: collision with root package name */
            private final Analytics f120365b;

            @p
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001cB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b \u0010\u0017¨\u0006%"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddAll$ProductData;", "", "", "itemNo", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddAll$ProductData;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getItemNo$annotations", "()V", "b", "I", "getQuantity$annotations", "Companion", "$serializer", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ProductData {
                public static final a Companion = new a((DefaultConstructorMarker) null);

                /* renamed from: a  reason: collision with root package name */
                private final String f120366a;

                /* renamed from: b  reason: collision with root package name */
                private final int f120367b;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddAll$ProductData$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddAll$ProductData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a {
                    private a() {
                    }

                    public final KSerializer<ProductData> serializer() {
                        return ListPickerNavigation$Operation$AddAll$ProductData$$serializer.INSTANCE;
                    }

                    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ ProductData(int i10, String str, int i11, T0 t02) {
                    if (1 != (i10 & 1)) {
                        E0.b(i10, 1, ListPickerNavigation$Operation$AddAll$ProductData$$serializer.INSTANCE.getDescriptor());
                    }
                    this.f120366a = str;
                    if ((i10 & 2) == 0) {
                        this.f120367b = 1;
                    } else {
                        this.f120367b = i11;
                    }
                }

                public static final /* synthetic */ void c(ProductData productData, C17395d dVar, SerialDescriptor serialDescriptor) {
                    dVar.y(serialDescriptor, 0, productData.f120366a);
                    if (dVar.z(serialDescriptor, 1) || productData.f120367b != 1) {
                        dVar.w(serialDescriptor, 1, productData.f120367b);
                    }
                }

                public final String a() {
                    return this.f120366a;
                }

                public final int b() {
                    return this.f120367b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ProductData)) {
                        return false;
                    }
                    ProductData productData = (ProductData) obj;
                    return C17542s.e(this.f120366a, productData.f120366a) && this.f120367b == productData.f120367b;
                }

                public int hashCode() {
                    return (this.f120366a.hashCode() * 31) + Integer.hashCode(this.f120367b);
                }

                public String toString() {
                    String str = this.f120366a;
                    int i10 = this.f120367b;
                    return "ProductData(itemNo=" + str + ", quantity=" + i10 + ")";
                }

                public ProductData(String str, int i10) {
                    C17542s.j(str, "itemNo");
                    this.f120366a = str;
                    this.f120367b = i10;
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddAll$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddAll;", "serializer", "()Lkotlinx/serialization/KSerializer;", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<AddAll> serializer() {
                    return ListPickerNavigation$Operation$AddAll$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ AddAll(int i10, List list, Analytics analytics, T0 t02) {
                if (3 != (i10 & 3)) {
                    E0.b(i10, 3, ListPickerNavigation$Operation$AddAll$$serializer.INSTANCE.getDescriptor());
                }
                this.f120364a = list;
                this.f120365b = analytics;
            }

            public static final /* synthetic */ void d(AddAll addAll, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.i(serialDescriptor, 0, f120363d[0], addAll.f120364a);
                dVar.i(serialDescriptor, 1, ListPickerNavigation$Operation$Analytics$$serializer.INSTANCE, addAll.a());
            }

            public Analytics a() {
                return this.f120365b;
            }

            public final List<ProductData> c() {
                return this.f120364a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddAll)) {
                    return false;
                }
                AddAll addAll = (AddAll) obj;
                return C17542s.e(this.f120364a, addAll.f120364a) && C17542s.e(this.f120365b, addAll.f120365b);
            }

            public int hashCode() {
                return (this.f120364a.hashCode() * 31) + this.f120365b.hashCode();
            }

            public String toString() {
                List<ProductData> list = this.f120364a;
                Analytics analytics = this.f120365b;
                return "AddAll(products=" + list + ", analytics=" + analytics + ")";
            }

            public AddAll(List<ProductData> list, Analytics analytics) {
                C17542s.j(list, "products");
                C17542s.j(analytics, "analytics");
                this.f120364a = list;
                this.f120365b = analytics;
            }
        }

        @p
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 -2\u00020\u0001:\u0002. B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010'\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\u0012\n\u0004\b(\u0010*\u0012\u0004\b,\u0010$\u001a\u0004\b \u0010+¨\u0006/"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddOrRemove;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "", "productName", "itemNo", "", "quantity", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "analytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddOrRemove;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getProductName$annotations", "()V", "b", "getItemNo$annotations", "I", "d", "getQuantity$annotations", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "getAnalytics$annotations", "Companion", "$serializer", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AddOrRemove implements Operation {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f120368a;

            /* renamed from: b  reason: collision with root package name */
            private final String f120369b;

            /* renamed from: c  reason: collision with root package name */
            private final int f120370c;

            /* renamed from: d  reason: collision with root package name */
            private final Analytics f120371d;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddOrRemove$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddOrRemove;", "serializer", "()Lkotlinx/serialization/KSerializer;", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<AddOrRemove> serializer() {
                    return ListPickerNavigation$Operation$AddOrRemove$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ AddOrRemove(int i10, String str, String str2, int i11, Analytics analytics, T0 t02) {
                if (11 != (i10 & 11)) {
                    E0.b(i10, 11, ListPickerNavigation$Operation$AddOrRemove$$serializer.INSTANCE.getDescriptor());
                }
                this.f120368a = str;
                this.f120369b = str2;
                if ((i10 & 4) == 0) {
                    this.f120370c = 1;
                } else {
                    this.f120370c = i11;
                }
                this.f120371d = analytics;
            }

            public static final /* synthetic */ void e(AddOrRemove addOrRemove, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.B(serialDescriptor, 0, Y0.f144077a, addOrRemove.f120368a);
                dVar.y(serialDescriptor, 1, addOrRemove.f120369b);
                if (dVar.z(serialDescriptor, 2) || addOrRemove.f120370c != 1) {
                    dVar.w(serialDescriptor, 2, addOrRemove.f120370c);
                }
                dVar.i(serialDescriptor, 3, ListPickerNavigation$Operation$Analytics$$serializer.INSTANCE, addOrRemove.a());
            }

            public Analytics a() {
                return this.f120371d;
            }

            public final String b() {
                return this.f120369b;
            }

            public final String c() {
                return this.f120368a;
            }

            public final int d() {
                return this.f120370c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddOrRemove)) {
                    return false;
                }
                AddOrRemove addOrRemove = (AddOrRemove) obj;
                return C17542s.e(this.f120368a, addOrRemove.f120368a) && C17542s.e(this.f120369b, addOrRemove.f120369b) && this.f120370c == addOrRemove.f120370c && C17542s.e(this.f120371d, addOrRemove.f120371d);
            }

            public int hashCode() {
                String str = this.f120368a;
                return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f120369b.hashCode()) * 31) + Integer.hashCode(this.f120370c)) * 31) + this.f120371d.hashCode();
            }

            public String toString() {
                String str = this.f120368a;
                String str2 = this.f120369b;
                int i10 = this.f120370c;
                Analytics analytics = this.f120371d;
                return "AddOrRemove(productName=" + str + ", itemNo=" + str2 + ", quantity=" + i10 + ", analytics=" + analytics + ")";
            }

            public AddOrRemove(String str, String str2, int i10, Analytics analytics) {
                C17542s.j(str2, "itemNo");
                C17542s.j(analytics, "analytics");
                this.f120368a = str;
                this.f120369b = str2;
                this.f120370c = i10;
                this.f120371d = analytics;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AddOrRemove(String str, String str2, int i10, Analytics analytics, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i11 & 4) != 0 ? 1 : i10, analytics);
            }
        }

        @p
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010#\u001a\u0004\b$\u0010&¨\u0006*"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "LAe/k;", "actionType", "<init>", "(Lcom/ingka/ikea/analytics/Interaction$Component;LAe/k;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/analytics/Interaction$Component;LAe/k;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/analytics/Interaction$Component;", "c", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "getComponent$annotations", "()V", "b", "LAe/k;", "()LAe/k;", "getActionType$annotations", "Companion", "$serializer", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Analytics {
            public static final a Companion = new a((DefaultConstructorMarker) null);
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public static final KSerializer<Object>[] f120372c = {J.b("com.ingka.ikea.analytics.Interaction.Component", Interaction$Component.values()), J.b("com.ingka.ikea.analytics.Interaction.ActionType", k.values())};

            /* renamed from: a  reason: collision with root package name */
            private final Interaction$Component f120373a;

            /* renamed from: b  reason: collision with root package name */
            private final k f120374b;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "serializer", "()Lkotlinx/serialization/KSerializer;", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<Analytics> serializer() {
                    return ListPickerNavigation$Operation$Analytics$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Analytics(int i10, Interaction$Component interaction$Component, k kVar, T0 t02) {
                if (3 != (i10 & 3)) {
                    E0.b(i10, 3, ListPickerNavigation$Operation$Analytics$$serializer.INSTANCE.getDescriptor());
                }
                this.f120373a = interaction$Component;
                this.f120374b = kVar;
            }

            public static final /* synthetic */ void d(Analytics analytics, C17395d dVar, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = f120372c;
                dVar.i(serialDescriptor, 0, kSerializerArr[0], analytics.f120373a);
                dVar.i(serialDescriptor, 1, kSerializerArr[1], analytics.f120374b);
            }

            public final k b() {
                return this.f120374b;
            }

            public final Interaction$Component c() {
                return this.f120373a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Analytics)) {
                    return false;
                }
                Analytics analytics = (Analytics) obj;
                return this.f120373a == analytics.f120373a && this.f120374b == analytics.f120374b;
            }

            public int hashCode() {
                return (this.f120373a.hashCode() * 31) + this.f120374b.hashCode();
            }

            public String toString() {
                Interaction$Component interaction$Component = this.f120373a;
                k kVar = this.f120374b;
                return "Analytics(component=" + interaction$Component + ", actionType=" + kVar + ")";
            }

            public Analytics(Interaction$Component interaction$Component, k kVar) {
                C17542s.j(interaction$Component, "component");
                C17542s.j(kVar, "actionType");
                this.f120373a = interaction$Component;
                this.f120374b = kVar;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f120375a = new a();

            private a() {
            }

            public final KSerializer<Operation> serializer() {
                return new C17261n("com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation.Operation", P.b(Operation.class), new C18055d[]{P.b(AddAll.class), P.b(AddOrRemove.class)}, new KSerializer[]{ListPickerNavigation$Operation$AddAll$$serializer.INSTANCE, ListPickerNavigation$Operation$AddOrRemove$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        Analytics a();
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(ListPickerNavigation listPickerNavigation, C8951o oVar, Operation operation, String str, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str = "ChooseListBottomSheet.RequestKey";
                }
                listPickerNavigation.a(oVar, operation, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openChooseListBottomSheet");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0004\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "d", "c", "b", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b$a;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b$d;", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b implements Parcelable {

        /* renamed from: a  reason: collision with root package name */
        public static final C3004b f120376a = new C3004b((DefaultConstructorMarker) null);

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b$a;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;", "Landroid/os/Parcelable;", "", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b$c;", "products", "<init>", "(Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C3003a();

            /* renamed from: b  reason: collision with root package name */
            private final List<c> f120377b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation$b$a$a  reason: collision with other inner class name */
            public static final class C3003a implements Parcelable.Creator<a> {
                /* renamed from: a */
                public final a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        arrayList.add(c.CREATOR.createFromParcel(parcel));
                    }
                    return new a(arrayList);
                }

                /* renamed from: b */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(List<c> list) {
                super((DefaultConstructorMarker) null);
                C17542s.j(list, "products");
                this.f120377b = list;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f120377b, ((a) obj).f120377b);
            }

            public int hashCode() {
                return this.f120377b.hashCode();
            }

            public String toString() {
                List<c> list = this.f120377b;
                return "Aborted(products=" + list + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                List<c> list = this.f120377b;
                parcel.writeInt(list.size());
                for (c writeToParcel : list) {
                    writeToParcel.writeToParcel(parcel, i10);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b$b;", "", "<init>", "()V", "", "REQUEST_KEY", "Ljava/lang/String;", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation$b$b  reason: collision with other inner class name */
        public static final class C3004b {
            public /* synthetic */ C3004b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C3004b() {
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b$c;", "Landroid/os/Parcelable;", "", "itemNo", "productName", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements Parcelable {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            private final String f120378a;

            /* renamed from: b  reason: collision with root package name */
            private final String f120379b;

            /* renamed from: c  reason: collision with root package name */
            private final int f120380c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<c> {
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new c(parcel.readString(), parcel.readString(), parcel.readInt());
                }

                /* renamed from: b */
                public final c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            public c(String str, String str2, int i10) {
                C17542s.j(str, "itemNo");
                this.f120378a = str;
                this.f120379b = str2;
                this.f120380c = i10;
            }

            public final String a() {
                return this.f120378a;
            }

            public final String b() {
                return this.f120379b;
            }

            public final int c() {
                return this.f120380c;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f120378a, cVar.f120378a) && C17542s.e(this.f120379b, cVar.f120379b) && this.f120380c == cVar.f120380c;
            }

            public int hashCode() {
                int hashCode = this.f120378a.hashCode() * 31;
                String str = this.f120379b;
                return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f120380c);
            }

            public String toString() {
                String str = this.f120378a;
                String str2 = this.f120379b;
                int i10 = this.f120380c;
                return "ProductDetails(itemNo=" + str + ", productName=" + str2 + ", quantity=" + i10 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f120378a);
                parcel.writeString(this.f120379b);
                parcel.writeInt(this.f120380c);
            }
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b\"\u0010\u0017¨\u0006("}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b$d;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;", "Landroid/os/Parcelable;", "", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b$c;", "products", "LsB/a$a;", "actionType", "", "listId", "listName", "<init>", "(Ljava/util/List;LsB/a$a;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "LsB/a$a;", "a", "()LsB/a$a;", "Ljava/lang/String;", "e", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends b implements Parcelable {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: b  reason: collision with root package name */
            private final List<c> f120381b;

            /* renamed from: c  reason: collision with root package name */
            private final C15035a.C3239a f120382c;

            /* renamed from: d  reason: collision with root package name */
            private final String f120383d;

            /* renamed from: e  reason: collision with root package name */
            private final String f120384e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<d> {
                /* renamed from: a */
                public final d createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        arrayList.add(c.CREATOR.createFromParcel(parcel));
                    }
                    return new d(arrayList, C15035a.C3239a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                }

                /* renamed from: b */
                public final d[] newArray(int i10) {
                    return new d[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(List<c> list, C15035a.C3239a aVar, String str, String str2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(list, "products");
                C17542s.j(aVar, "actionType");
                C17542s.j(str, "listId");
                C17542s.j(str2, "listName");
                this.f120381b = list;
                this.f120382c = aVar;
                this.f120383d = str;
                this.f120384e = str2;
            }

            public final C15035a.C3239a a() {
                return this.f120382c;
            }

            public final String b() {
                return this.f120383d;
            }

            public final String c() {
                return this.f120384e;
            }

            public List<c> d() {
                return this.f120381b;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return C17542s.e(this.f120381b, dVar.f120381b) && this.f120382c == dVar.f120382c && C17542s.e(this.f120383d, dVar.f120383d) && C17542s.e(this.f120384e, dVar.f120384e);
            }

            public int hashCode() {
                return (((((this.f120381b.hashCode() * 31) + this.f120382c.hashCode()) * 31) + this.f120383d.hashCode()) * 31) + this.f120384e.hashCode();
            }

            public String toString() {
                List<c> list = this.f120381b;
                C15035a.C3239a aVar = this.f120382c;
                String str = this.f120383d;
                String str2 = this.f120384e;
                return "Success(products=" + list + ", actionType=" + aVar + ", listId=" + str + ", listName=" + str2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                List<c> list = this.f120381b;
                parcel.writeInt(list.size());
                for (c writeToParcel : list) {
                    writeToParcel.writeToParcel(parcel, i10);
                }
                parcel.writeString(this.f120382c.name());
                parcel.writeString(this.f120383d);
                parcel.writeString(this.f120384e);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    void a(C8951o oVar, Operation operation, String str);
}
