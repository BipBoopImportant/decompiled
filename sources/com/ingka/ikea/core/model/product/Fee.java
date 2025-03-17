package com.ingka.ikea.core.model.product;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11693d;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000 22\u00020\u0001:\u0003\u00163 B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0019R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010&\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010&\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010&\u0012\u0004\b1\u0010%\u001a\u0004\b0\u0010\u0019¨\u00064"}, d2 = {"Lcom/ingka/ikea/core/model/product/Fee;", "", "Lcom/ingka/ikea/core/model/product/Fee$b;", "type", "", "amount", "shortDescription", "withoutFee", "total", "<init>", "(Lcom/ingka/ikea/core/model/product/Fee$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/product/Fee$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/model/product/Fee;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/Fee$b;", "getType", "()Lcom/ingka/ikea/core/model/product/Fee$b;", "getType$annotations", "()V", "Ljava/lang/String;", "getAmount", "getAmount$annotations", "c", "getShortDescription", "getShortDescription$annotations", "d", "getWithoutFee", "getWithoutFee$annotations", "e", "getTotal", "getTotal$annotations", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Fee {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f94970f = {b.Companion.serializer(), 0, 0, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    private final b f94971a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94972b;

    /* renamed from: c  reason: collision with root package name */
    private final String f94973c;

    /* renamed from: d  reason: collision with root package name */
    private final String f94974d;

    /* renamed from: e  reason: collision with root package name */
    private final String f94975e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/Fee$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/Fee;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Fee> serializer() {
            return Fee$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @p
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/core/model/product/Fee$b;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "WEEE", "ECO", "NONE", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        WEEE,
        ECO,
        NONE;
        
        /* access modifiers changed from: private */
        public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
        public static final a Companion = null;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/Fee$b$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/Fee$b;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            private final /* synthetic */ KSerializer a() {
                return (KSerializer) b.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<b> serializer() {
                return a();
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            b[] b10;
            $ENTRIES = C17221b.a(b10);
            Companion = new a((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, new C11693d());
        }
    }

    public /* synthetic */ Fee(int i10, b bVar, String str, String str2, String str3, String str4, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, Fee$$serializer.INSTANCE.getDescriptor());
        }
        this.f94971a = bVar;
        this.f94972b = str;
        this.f94973c = str2;
        this.f94974d = str3;
        this.f94975e = str4;
    }

    public static final /* synthetic */ void b(Fee fee, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f94970f[0], fee.f94971a);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 1, y02, fee.f94972b);
        dVar.y(serialDescriptor, 2, fee.f94973c);
        dVar.B(serialDescriptor, 3, y02, fee.f94974d);
        dVar.B(serialDescriptor, 4, y02, fee.f94975e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fee)) {
            return false;
        }
        Fee fee = (Fee) obj;
        return this.f94971a == fee.f94971a && C17542s.e(this.f94972b, fee.f94972b) && C17542s.e(this.f94973c, fee.f94973c) && C17542s.e(this.f94974d, fee.f94974d) && C17542s.e(this.f94975e, fee.f94975e);
    }

    public int hashCode() {
        int hashCode = this.f94971a.hashCode() * 31;
        String str = this.f94972b;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f94973c.hashCode()) * 31;
        String str2 = this.f94974d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94975e;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        b bVar = this.f94971a;
        String str = this.f94972b;
        String str2 = this.f94973c;
        String str3 = this.f94974d;
        String str4 = this.f94975e;
        return "Fee(type=" + bVar + ", amount=" + str + ", shortDescription=" + str2 + ", withoutFee=" + str3 + ", total=" + str4 + ")";
    }

    public Fee(b bVar, String str, String str2, String str3, String str4) {
        C17542s.j(bVar, "type");
        C17542s.j(str2, "shortDescription");
        this.f94971a = bVar;
        this.f94972b = str;
        this.f94973c = str2;
        this.f94974d = str3;
        this.f94975e = str4;
    }
}
