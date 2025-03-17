package com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model;

import HJ.C15854t;
import XH.t;
import YH.C16877v;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import yu.C12517b;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 \"2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0004#$%\u0013B%\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u0012\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote;", "Lpp/b;", "Lyu/b;", "", "seen0", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Locations;", "locations", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Locations;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lyu/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Locations;", "getLocations$annotations", "()V", "Companion", "Locations", "Location", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WayfindingProductLocationRemote implements C11768b<C12517b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Locations f96353a;

    @p
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\b\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005789:\u0019BC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010'\u001a\u0004\b.\u0010/R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010'\u001a\u0004\b3\u00104¨\u0006;"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location;", "Lpp/b;", "Lyu/b$a;", "", "seen0", "", "id", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division;", "division", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Floor;", "floor", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Department;", "department", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division;Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Floor;Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Department;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lyu/b$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division;", "getDivision", "()Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division;", "getDivision$annotations", "c", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Floor;", "getFloor", "()Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Floor;", "getFloor$annotations", "d", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Department;", "getDepartment", "()Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Department;", "getDepartment$annotations", "Companion", "Division", "Floor", "Department", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Location implements C11768b<C12517b.a> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96354a;

        /* renamed from: b  reason: collision with root package name */
        private final Division f96355b;

        /* renamed from: c  reason: collision with root package name */
        private final Floor f96356c;

        /* renamed from: d  reason: collision with root package name */
        private final Department f96357d;

        @p
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&\u0014B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Department;", "Lpp/b;", "Lyu/b$a$a;", "", "seen0", "", "id", "name", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Department;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lyu/b$a$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getName$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Department implements C11768b<C12517b.a.C2558a> {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f96358a;

            /* renamed from: b  reason: collision with root package name */
            private final String f96359b;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Department$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Department;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<Department> serializer() {
                    return WayfindingProductLocationRemote$Location$Department$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Department(int i10, String str, String str2, T0 t02) {
                if (3 != (i10 & 3)) {
                    E0.b(i10, 3, WayfindingProductLocationRemote$Location$Department$$serializer.INSTANCE.getDescriptor());
                }
                this.f96358a = str;
                this.f96359b = str2;
            }

            public static final /* synthetic */ void b(Department department, C17395d dVar, SerialDescriptor serialDescriptor) {
                Y0 y02 = Y0.f144077a;
                dVar.B(serialDescriptor, 0, y02, department.f96358a);
                dVar.B(serialDescriptor, 1, y02, department.f96359b);
            }

            public C12517b.a.C2558a a() {
                String str = this.f96358a;
                if (str != null) {
                    String str2 = this.f96359b;
                    if (str2 != null) {
                        return new C12517b.a.C2558a(str, str2);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Department)) {
                    return false;
                }
                Department department = (Department) obj;
                return C17542s.e(this.f96358a, department.f96358a) && C17542s.e(this.f96359b, department.f96359b);
            }

            public int hashCode() {
                String str = this.f96358a;
                int i10 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f96359b;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return hashCode + i10;
            }

            public String toString() {
                String str = this.f96358a;
                String str2 = this.f96359b;
                return "Department(id=" + str + ", name=" + str2 + ")";
            }
        }

        @p
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0017'\rB%\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001a¨\u0006("}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division;", "Lpp/b;", "Lyu/b$a$b;", "", "seen0", "", "id", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "rawValue", "Lyu/b$a$b$a;", "a", "(Ljava/lang/String;)Lyu/b$a$b$a;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lyu/b$a$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Division implements C11768b<C12517b.a.C2559b> {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f96360a;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<Division> serializer() {
                    return WayfindingProductLocationRemote$Location$Division$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "DIV_MARKETHALL", "DIV_SHOWROOM", "DIV_SELF_SERVE", "DIV_WAREHOUSE", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private enum b {
                DIV_MARKETHALL("DIV_MARKETHALL"),
                DIV_SHOWROOM("DIV_SHOWROOM"),
                DIV_SELF_SERVE("DIV_SELF_SERVE"),
                DIV_WAREHOUSE("DIV_WAREHOUSE");
                
                public static final a Companion = null;
                private final String rawValue;

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division$b$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Division$b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a {
                    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final b a(String str) {
                        T t10;
                        Iterator<T> it = b.b().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t10 = null;
                                break;
                            }
                            t10 = it.next();
                            if (C15854t.H(((b) t10).j(), str, true)) {
                                break;
                            }
                        }
                        b bVar = (b) t10;
                        if (bVar != null) {
                            return bVar;
                        }
                        throw new IllegalArgumentException("Unknown type: " + str);
                    }

                    private a() {
                    }
                }

                static {
                    b[] a10;
                    $ENTRIES = C17221b.a(a10);
                    Companion = new a((DefaultConstructorMarker) null);
                }

                private b(String str) {
                    this.rawValue = str;
                }

                public static C17220a<b> b() {
                    return $ENTRIES;
                }

                public final String j() {
                    return this.rawValue;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class c {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f96361a;

                /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                static {
                    /*
                        com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote$Location$Division$b[] r0 = com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote.Location.Division.b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote$Location$Division$b r1 = com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote.Location.Division.b.DIV_MARKETHALL     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote$Location$Division$b r1 = com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote.Location.Division.b.DIV_SELF_SERVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote$Location$Division$b r1 = com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote.Location.Division.b.DIV_SHOWROOM     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote$Location$Division$b r1 = com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote.Location.Division.b.DIV_WAREHOUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        f96361a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote.Location.Division.c.<clinit>():void");
                }
            }

            public /* synthetic */ Division(int i10, String str, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, WayfindingProductLocationRemote$Location$Division$$serializer.INSTANCE.getDescriptor());
                }
                this.f96360a = str;
            }

            private final C12517b.a.C2559b.C2560a a(String str) {
                int i10 = c.f96361a[b.Companion.a(str).ordinal()];
                if (i10 == 1) {
                    return C12517b.a.C2559b.C2560a.MARKETHALL;
                }
                if (i10 == 2) {
                    return C12517b.a.C2559b.C2560a.SELF_SERVE;
                }
                if (i10 == 3) {
                    return C12517b.a.C2559b.C2560a.SHOWROOM;
                }
                if (i10 == 4) {
                    return C12517b.a.C2559b.C2560a.FULL_SERVE;
                }
                throw new t();
            }

            public C12517b.a.C2559b b() {
                return new C12517b.a.C2559b(a(this.f96360a));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Division) && C17542s.e(this.f96360a, ((Division) obj).f96360a);
            }

            public int hashCode() {
                String str = this.f96360a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.f96360a;
                return "Division(id=" + str + ")";
            }
        }

        @p
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#\u0013B%\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0016¨\u0006$"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Floor;", "Lpp/b;", "Lyu/b$a$c;", "", "seen0", "", "name", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Floor;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lyu/b$a$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Floor implements C11768b<C12517b.a.c> {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f96362a;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Floor$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$Floor;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<Floor> serializer() {
                    return WayfindingProductLocationRemote$Location$Floor$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Floor(int i10, String str, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, WayfindingProductLocationRemote$Location$Floor$$serializer.INSTANCE.getDescriptor());
                }
                this.f96362a = str;
            }

            public C12517b.a.c a() {
                String str = this.f96362a;
                if (str != null) {
                    return new C12517b.a.c(str);
                }
                throw new IllegalArgumentException("Required value was null.");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Floor) && C17542s.e(this.f96362a, ((Floor) obj).f96362a);
            }

            public int hashCode() {
                String str = this.f96362a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.f96362a;
                return "Floor(name=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Location> serializer() {
                return WayfindingProductLocationRemote$Location$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Location(int i10, String str, Division division, Floor floor, Department department, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, WayfindingProductLocationRemote$Location$$serializer.INSTANCE.getDescriptor());
            }
            this.f96354a = str;
            this.f96355b = division;
            this.f96356c = floor;
            this.f96357d = department;
        }

        public static final /* synthetic */ void b(Location location, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, location.f96354a);
            dVar.B(serialDescriptor, 1, WayfindingProductLocationRemote$Location$Division$$serializer.INSTANCE, location.f96355b);
            dVar.B(serialDescriptor, 2, WayfindingProductLocationRemote$Location$Floor$$serializer.INSTANCE, location.f96356c);
            dVar.B(serialDescriptor, 3, WayfindingProductLocationRemote$Location$Department$$serializer.INSTANCE, location.f96357d);
        }

        public C12517b.a a() {
            String str = this.f96354a;
            if (str != null) {
                Floor floor = this.f96356c;
                if (floor != null) {
                    C12517b.a.c a10 = floor.a();
                    Department department = this.f96357d;
                    C12517b.a.C2558a a11 = department != null ? department.a() : null;
                    Division division = this.f96355b;
                    if (division != null) {
                        return new C12517b.a(str, a10, a11, division.b());
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return C17542s.e(this.f96354a, location.f96354a) && C17542s.e(this.f96355b, location.f96355b) && C17542s.e(this.f96356c, location.f96356c) && C17542s.e(this.f96357d, location.f96357d);
        }

        public int hashCode() {
            String str = this.f96354a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Division division = this.f96355b;
            int hashCode2 = (hashCode + (division == null ? 0 : division.hashCode())) * 31;
            Floor floor = this.f96356c;
            int hashCode3 = (hashCode2 + (floor == null ? 0 : floor.hashCode())) * 31;
            Department department = this.f96357d;
            if (department != null) {
                i10 = department.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            String str = this.f96354a;
            Division division = this.f96355b;
            Floor floor = this.f96356c;
            Department department = this.f96357d;
            return "Location(id=" + str + ", division=" + division + ", floor=" + floor + ", department=" + department + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u001dB;\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 ¨\u0006'"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Locations;", "", "", "seen0", "", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Location;", "salesLocations", "displayLocations", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Locations;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "getSalesLocations$annotations", "()V", "b", "getDisplayLocations$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Locations {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final KSerializer<Object>[] f96363c;

        /* renamed from: a  reason: collision with root package name */
        private final List<Location> f96364a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Location> f96365b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Locations$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$Locations;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Locations> serializer() {
                return WayfindingProductLocationRemote$Locations$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            WayfindingProductLocationRemote$Location$$serializer wayfindingProductLocationRemote$Location$$serializer = WayfindingProductLocationRemote$Location$$serializer.INSTANCE;
            f96363c = new KSerializer[]{new C17451f(wayfindingProductLocationRemote$Location$$serializer), new C17451f(wayfindingProductLocationRemote$Location$$serializer)};
        }

        public /* synthetic */ Locations(int i10, List list, List list2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, WayfindingProductLocationRemote$Locations$$serializer.INSTANCE.getDescriptor());
            }
            this.f96364a = list;
            this.f96365b = list2;
        }

        public static final /* synthetic */ void d(Locations locations, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f96363c;
            dVar.B(serialDescriptor, 0, kSerializerArr[0], locations.f96364a);
            dVar.B(serialDescriptor, 1, kSerializerArr[1], locations.f96365b);
        }

        public final List<Location> b() {
            return this.f96365b;
        }

        public final List<Location> c() {
            return this.f96364a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Locations)) {
                return false;
            }
            Locations locations = (Locations) obj;
            return C17542s.e(this.f96364a, locations.f96364a) && C17542s.e(this.f96365b, locations.f96365b);
        }

        public int hashCode() {
            List<Location> list = this.f96364a;
            int i10 = 0;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<Location> list2 = this.f96365b;
            if (list2 != null) {
                i10 = list2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            List<Location> list = this.f96364a;
            List<Location> list2 = this.f96365b;
            return "Locations(salesLocations=" + list + ", displayLocations=" + list2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/wayfinding/datalayer/impl/network/model/WayfindingProductLocationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<WayfindingProductLocationRemote> serializer() {
            return WayfindingProductLocationRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WayfindingProductLocationRemote(int i10, Locations locations, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, WayfindingProductLocationRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96353a = locations;
    }

    public C12517b a() {
        Locations locations = this.f96353a;
        List<Location> list = null;
        List<Location> c10 = locations != null ? locations.c() : null;
        if (c10 != null) {
            Iterable<Location> iterable = c10;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Location a10 : iterable) {
                arrayList.add(a10.a());
            }
            C12517b.a aVar = (C12517b.a) C16877v.w0(arrayList);
            Locations locations2 = this.f96353a;
            if (locations2 != null) {
                list = locations2.b();
            }
            if (list != null) {
                Iterable<Location> iterable2 = list;
                ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
                for (Location a11 : iterable2) {
                    arrayList2.add(a11.a());
                }
                return new C12517b(aVar, (C12517b.a) C16877v.y0(arrayList2));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WayfindingProductLocationRemote) && C17542s.e(this.f96353a, ((WayfindingProductLocationRemote) obj).f96353a);
    }

    public int hashCode() {
        Locations locations = this.f96353a;
        if (locations == null) {
            return 0;
        }
        return locations.hashCode();
    }

    public String toString() {
        Locations locations = this.f96353a;
        return "WayfindingProductLocationRemote(locations=" + locations + ")";
    }
}
