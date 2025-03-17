package com.ingka.ikea.store.datalayer.impl.network.model;

import EB.C12829a;
import EB.C12831c;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0001\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004ABC!Bw\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010)\u0012\u0004\b/\u0010&\u001a\u0004\b.\u0010+R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010\"\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010$R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010&\u001a\u0004\b5\u00106R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u00104\u0012\u0004\b:\u0010&\u001a\u0004\b9\u00106R \u0010\u0012\u001a\u00020\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010&\u001a\u0004\b=\u0010>¨\u0006D"}, d2 = {"Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote;", "Lpp/b;", "LEB/c;", "", "seen0", "", "title", "storeAddress", "", "latitude", "longitude", "storeId", "", "Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreSettingRemote;", "storeSettings", "Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$ChildStoreRemote;", "childStores", "Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$BuClassificationRemote;", "buClassification", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$BuClassificationRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LEB/c;", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "()V", "getStoreAddress", "getStoreAddress$annotations", "Ljava/lang/Double;", "getLatitude", "()Ljava/lang/Double;", "getLatitude$annotations", "d", "getLongitude", "getLongitude$annotations", "e", "getStoreId", "getStoreId$annotations", "f", "Ljava/util/List;", "getStoreSettings", "()Ljava/util/List;", "getStoreSettings$annotations", "g", "getChildStores", "getChildStores$annotations", "h", "Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$BuClassificationRemote;", "getBuClassification", "()Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$BuClassificationRemote;", "getBuClassification$annotations", "Companion", "ChildStoreRemote", "BuClassificationRemote", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoreRemote implements C11768b<C12831c> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f120387i = {null, null, null, null, null, new C17451f(StoreSettingRemote$$serializer.INSTANCE), new C17451f(StoreRemote$ChildStoreRemote$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final String f120388a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120389b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f120390c;

    /* renamed from: d  reason: collision with root package name */
    private final Double f120391d;

    /* renamed from: e  reason: collision with root package name */
    private final String f120392e;

    /* renamed from: f  reason: collision with root package name */
    private final List<StoreSettingRemote> f120393f;

    /* renamed from: g  reason: collision with root package name */
    private final List<ChildStoreRemote> f120394g;

    /* renamed from: h  reason: collision with root package name */
    private final BuClassificationRemote f120395h;

    @p
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u0014B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$BuClassificationRemote;", "Lpp/b;", "LEB/a;", "", "seen0", "", "code", "name", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$BuClassificationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LEB/a;", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "getCode$annotations", "()V", "getName", "getName$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BuClassificationRemote implements C11768b<C12829a> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f120396a;

        /* renamed from: b  reason: collision with root package name */
        private final String f120397b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$BuClassificationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$BuClassificationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<BuClassificationRemote> serializer() {
                return StoreRemote$BuClassificationRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BuClassificationRemote(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, StoreRemote$BuClassificationRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f120396a = str;
            this.f120397b = str2;
        }

        public static final /* synthetic */ void b(BuClassificationRemote buClassificationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, buClassificationRemote.f120396a);
            dVar.B(serialDescriptor, 1, y02, buClassificationRemote.f120397b);
        }

        public C12829a a() {
            return C12829a.Companion.a(this.f120396a);
        }
    }

    @p
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0001\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-\u0018BM\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001a\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\u001e\u001a\u0004\b#\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010\"\u0012\u0004\b(\u0010\u001e\u001a\u0004\b'\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001a\u0012\u0004\b+\u0010\u001e\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$ChildStoreRemote;", "Lpp/b;", "LEB/c$a;", "", "seen0", "", "title", "storeAddress", "", "latitude", "longitude", "storeId", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$ChildStoreRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LEB/c$a;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "()V", "getStoreAddress", "getStoreAddress$annotations", "c", "Ljava/lang/Double;", "getLatitude", "()Ljava/lang/Double;", "getLatitude$annotations", "d", "getLongitude", "getLongitude$annotations", "e", "getStoreId", "getStoreId$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChildStoreRemote implements C11768b<C12831c.a> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f120398a;

        /* renamed from: b  reason: collision with root package name */
        private final String f120399b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f120400c;

        /* renamed from: d  reason: collision with root package name */
        private final Double f120401d;

        /* renamed from: e  reason: collision with root package name */
        private final String f120402e;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$ChildStoreRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$ChildStoreRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ChildStoreRemote> serializer() {
                return StoreRemote$ChildStoreRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ChildStoreRemote(int i10, String str, String str2, Double d10, Double d11, String str3, T0 t02) {
            if (31 != (i10 & 31)) {
                E0.b(i10, 31, StoreRemote$ChildStoreRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f120398a = str;
            this.f120399b = str2;
            this.f120400c = d10;
            this.f120401d = d11;
            this.f120402e = str3;
        }

        public static final /* synthetic */ void b(ChildStoreRemote childStoreRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, childStoreRemote.f120398a);
            dVar.B(serialDescriptor, 1, y02, childStoreRemote.f120399b);
            C17438C c10 = C17438C.f144010a;
            dVar.B(serialDescriptor, 2, c10, childStoreRemote.f120400c);
            dVar.B(serialDescriptor, 3, c10, childStoreRemote.f120401d);
            dVar.B(serialDescriptor, 4, y02, childStoreRemote.f120402e);
        }

        public C12831c.a a() {
            String str = this.f120398a;
            if (str != null) {
                String str2 = this.f120399b;
                if (str2 != null) {
                    Double d10 = this.f120400c;
                    if (d10 != null) {
                        double doubleValue = d10.doubleValue();
                        Double d11 = this.f120401d;
                        if (d11 != null) {
                            double doubleValue2 = d11.doubleValue();
                            String str3 = this.f120402e;
                            if (str3 != null) {
                                return new C12831c.a(str3, str, str2, doubleValue, doubleValue2);
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/datalayer/impl/network/model/StoreRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StoreRemote> serializer() {
            return StoreRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StoreRemote(int i10, String str, String str2, Double d10, Double d11, String str3, List list, List list2, BuClassificationRemote buClassificationRemote, T0 t02) {
        if (255 != (i10 & 255)) {
            E0.b(i10, 255, StoreRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120388a = str;
        this.f120389b = str2;
        this.f120390c = d10;
        this.f120391d = d11;
        this.f120392e = str3;
        this.f120393f = list;
        this.f120394g = list2;
        this.f120395h = buClassificationRemote;
    }

    public static final /* synthetic */ void c(StoreRemote storeRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120387i;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, storeRemote.f120388a);
        dVar.B(serialDescriptor, 1, y02, storeRemote.f120389b);
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 2, c10, storeRemote.f120390c);
        dVar.B(serialDescriptor, 3, c10, storeRemote.f120391d);
        dVar.B(serialDescriptor, 4, y02, storeRemote.f120392e);
        dVar.i(serialDescriptor, 5, kSerializerArr[5], storeRemote.f120393f);
        dVar.i(serialDescriptor, 6, kSerializerArr[6], storeRemote.f120394g);
        dVar.i(serialDescriptor, 7, StoreRemote$BuClassificationRemote$$serializer.INSTANCE, storeRemote.f120395h);
    }

    public C12831c b() {
        String str = this.f120388a;
        if (str != null) {
            String str2 = this.f120389b;
            if (str2 != null) {
                Double d10 = this.f120390c;
                if (d10 != null) {
                    double doubleValue = d10.doubleValue();
                    Double d11 = this.f120391d;
                    if (d11 != null) {
                        double doubleValue2 = d11.doubleValue();
                        String str3 = this.f120392e;
                        if (str3 != null) {
                            Iterable<StoreSettingRemote> iterable = this.f120393f;
                            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                            for (StoreSettingRemote a10 : iterable) {
                                arrayList.add(a10.a());
                            }
                            Iterable<ChildStoreRemote> iterable2 = this.f120394g;
                            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
                            for (ChildStoreRemote a11 : iterable2) {
                                arrayList2.add(a11.a());
                            }
                            return new C12831c(str3, str, str2, doubleValue, doubleValue2, arrayList, arrayList2, this.f120395h.a());
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
