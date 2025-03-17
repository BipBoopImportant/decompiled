package com.ingka.ikea.instore.datalayer.foodmobile.network.model;

import HJ.C15854t;
import XH.t;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004&\u0017'\rB%\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u0012\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote;", "Lpp/b;", "Ldt/b;", "", "seen0", "Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$DetailsRemote;", "details", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$DetailsRemote;LjK/T0;)V", "Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$b;", "", "a", "(Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$b;)Z", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Ldt/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$DetailsRemote;", "getDetails$annotations", "()V", "Companion", "DetailsRemote", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FoodMobileDetailsRemote implements C11768b<dt.b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final DetailsRemote f96154a;

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0012&\u0014B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$DetailsRemote;", "Lpp/b;", "Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$DetailsRemote$b;", "", "seen0", "", "url", "status", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$DetailsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$DetailsRemote$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getUrl$annotations", "()V", "getStatus", "getStatus$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DetailsRemote implements C11768b<b> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f96155a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96156b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$DetailsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$DetailsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<DetailsRemote> serializer() {
                return FoodMobileDetailsRemote$DetailsRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$DetailsRemote$b;", "", "", "url", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            private final String f96157a;

            /* renamed from: b  reason: collision with root package name */
            private final String f96158b;

            public b(String str, String str2) {
                this.f96157a = str;
                this.f96158b = str2;
            }

            public final String a() {
                return this.f96158b;
            }

            public final String b() {
                return this.f96157a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f96157a, bVar.f96157a) && C17542s.e(this.f96158b, bVar.f96158b);
            }

            public int hashCode() {
                String str = this.f96157a;
                int i10 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f96158b;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return hashCode + i10;
            }

            public String toString() {
                String str = this.f96157a;
                String str2 = this.f96158b;
                return "Details(url=" + str + ", status=" + str2 + ")";
            }
        }

        public /* synthetic */ DetailsRemote(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, FoodMobileDetailsRemote$DetailsRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96155a = str;
            this.f96156b = str2;
        }

        public static final /* synthetic */ void b(DetailsRemote detailsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, detailsRemote.f96155a);
            dVar.B(serialDescriptor, 1, y02, detailsRemote.f96156b);
        }

        public b a() {
            String str;
            if (b.Companion.a(this.f96156b) == b.UNSUPPORTED || ((str = this.f96155a) != null && str.length() != 0)) {
                return new b(this.f96155a, this.f96156b);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailsRemote)) {
                return false;
            }
            DetailsRemote detailsRemote = (DetailsRemote) obj;
            return C17542s.e(this.f96155a, detailsRemote.f96155a) && C17542s.e(this.f96156b, detailsRemote.f96156b);
        }

        public int hashCode() {
            String str = this.f96155a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f96156b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f96155a;
            String str2 = this.f96156b;
            return "DetailsRemote(url=" + str + ", status=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FoodMobileDetailsRemote> serializer() {
            return FoodMobileDetailsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "OPEN", "CLOSED", "UNSUPPORTED", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        OPEN("open"),
        CLOSED("closed"),
        UNSUPPORTED("unsupported");
        
        public static final a Companion = null;
        private final String value;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$b$a;", "", "<init>", "()V", "", "value", "Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/instore/datalayer/foodmobile/network/model/FoodMobileDetailsRemote$b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String str) {
                T t10;
                String str2;
                Iterator<T> it = b.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    String j10 = ((b) t10).j();
                    if (str != null) {
                        Locale locale = Locale.US;
                        C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                        str2 = str.toLowerCase(locale);
                        C17542s.i(str2, "toLowerCase(...)");
                    } else {
                        str2 = null;
                    }
                    if (C17542s.e(j10, str2)) {
                        break;
                    }
                }
                b bVar = (b) t10;
                if (bVar != null) {
                    return bVar;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown status received from value " + str);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    }
                    String str5 = str3;
                    if (str4 == null) {
                        String name = a.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str6 = str4;
                    bVar2.a(eVar, str6, false, illegalArgumentException, str5);
                    str3 = str5;
                    str4 = str6;
                }
                return b.UNSUPPORTED;
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
            this.value = str;
        }

        public static C17220a<b> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f96159a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.ingka.ikea.instore.datalayer.foodmobile.network.model.FoodMobileDetailsRemote$b[] r0 = com.ingka.ikea.instore.datalayer.foodmobile.network.model.FoodMobileDetailsRemote.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.instore.datalayer.foodmobile.network.model.FoodMobileDetailsRemote$b r1 = com.ingka.ikea.instore.datalayer.foodmobile.network.model.FoodMobileDetailsRemote.b.OPEN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.instore.datalayer.foodmobile.network.model.FoodMobileDetailsRemote$b r1 = com.ingka.ikea.instore.datalayer.foodmobile.network.model.FoodMobileDetailsRemote.b.CLOSED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.instore.datalayer.foodmobile.network.model.FoodMobileDetailsRemote$b r1 = com.ingka.ikea.instore.datalayer.foodmobile.network.model.FoodMobileDetailsRemote.b.UNSUPPORTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f96159a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.datalayer.foodmobile.network.model.FoodMobileDetailsRemote.c.<clinit>():void");
        }
    }

    public /* synthetic */ FoodMobileDetailsRemote(int i10, DetailsRemote detailsRemote, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, FoodMobileDetailsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96154a = detailsRemote;
    }

    private final boolean a(b bVar) {
        int i10 = c.f96159a[bVar.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2 || i10 == 3) {
            return false;
        }
        throw new t();
    }

    public dt.b b() {
        DetailsRemote.b a10 = this.f96154a.a();
        if (a10 != null) {
            b a11 = b.Companion.a(a10.a());
            return new dt.b(a10.b(), a(a11), a11 != b.UNSUPPORTED);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FoodMobileDetailsRemote) && C17542s.e(this.f96154a, ((FoodMobileDetailsRemote) obj).f96154a);
    }

    public int hashCode() {
        return this.f96154a.hashCode();
    }

    public String toString() {
        DetailsRemote detailsRemote = this.f96154a;
        return "FoodMobileDetailsRemote(details=" + detailsRemote + ")";
    }
}
