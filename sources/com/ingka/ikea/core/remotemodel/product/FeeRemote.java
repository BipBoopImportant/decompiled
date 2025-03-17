package com.ingka.ikea.core.remotemodel.product;

import XH.t;
import androidx.annotation.Keep;
import com.ingka.ikea.core.model.product.Fee;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003'(\u0019BM\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u0019\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001a\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b\u001f\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001a\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001a\u0012\u0004\b%\u0010\u001e\u001a\u0004\b!\u0010\u001c¨\u0006)"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/FeeRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/Fee;", "", "seen0", "", "type", "amount", "shortDescription", "withoutFee", "total", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/remotemodel/product/FeeRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "f", "()Lcom/ingka/ikea/core/model/product/Fee;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getType$annotations", "()V", "b", "getAmount$annotations", "c", "getShortDescription$annotations", "e", "getWithoutFee$annotations", "getTotal$annotations", "Companion", "FeeTypeEnum", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FeeRemote implements C11768b<Fee> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95275a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95276b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95277c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95278d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95279e;

    @Keep
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/FeeRemote$FeeTypeEnum;", "", "", "feeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getFeeType", "()Ljava/lang/String;", "Companion", "a", "WEEE", "ECO", "NONE", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum FeeTypeEnum {
        WEEE("WEEE"),
        ECO("ECO"),
        NONE("");
        
        public static final a Companion = null;
        private final String feeType;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/FeeRemote$FeeTypeEnum$a;", "", "<init>", "()V", "", "remote", "Lcom/ingka/ikea/core/model/product/Fee$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/core/model/product/Fee$b;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.core.remotemodel.product.FeeRemote$FeeTypeEnum$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C2121a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f95280a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                static {
                    /*
                        com.ingka.ikea.core.remotemodel.product.FeeRemote$FeeTypeEnum[] r0 = com.ingka.ikea.core.remotemodel.product.FeeRemote.FeeTypeEnum.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        com.ingka.ikea.core.remotemodel.product.FeeRemote$FeeTypeEnum r1 = com.ingka.ikea.core.remotemodel.product.FeeRemote.FeeTypeEnum.WEEE     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        com.ingka.ikea.core.remotemodel.product.FeeRemote$FeeTypeEnum r1 = com.ingka.ikea.core.remotemodel.product.FeeRemote.FeeTypeEnum.ECO     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        com.ingka.ikea.core.remotemodel.product.FeeRemote$FeeTypeEnum r1 = com.ingka.ikea.core.remotemodel.product.FeeRemote.FeeTypeEnum.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        f95280a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.product.FeeRemote.FeeTypeEnum.a.C2121a.<clinit>():void");
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Fee.b a(String str) {
                T t10;
                Iterator<T> it = FeeTypeEnum.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((FeeTypeEnum) t10).getFeeType(), str)) {
                        break;
                    }
                }
                FeeTypeEnum feeTypeEnum = (FeeTypeEnum) t10;
                if (feeTypeEnum == null) {
                    feeTypeEnum = FeeTypeEnum.NONE;
                }
                int i10 = C2121a.f95280a[feeTypeEnum.ordinal()];
                if (i10 == 1) {
                    return Fee.b.WEEE;
                }
                if (i10 == 2) {
                    return Fee.b.ECO;
                }
                if (i10 == 3) {
                    return Fee.b.NONE;
                }
                throw new t();
            }

            private a() {
            }
        }

        static {
            FeeTypeEnum[] $values;
            $ENTRIES = C17221b.a($values);
            Companion = new a((DefaultConstructorMarker) null);
        }

        private FeeTypeEnum(String str) {
            this.feeType = str;
        }

        public static C17220a<FeeTypeEnum> getEntries() {
            return $ENTRIES;
        }

        public final String getFeeType() {
            return this.feeType;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/FeeRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/FeeRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FeeRemote> serializer() {
            return FeeRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FeeRemote(int i10, String str, String str2, String str3, String str4, String str5, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, FeeRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95275a = str;
        this.f95276b = str2;
        this.f95277c = str3;
        this.f95278d = str4;
        this.f95279e = str5;
    }

    public static final /* synthetic */ void g(FeeRemote feeRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, feeRemote.f95275a);
        dVar.B(serialDescriptor, 1, y02, feeRemote.f95276b);
        dVar.B(serialDescriptor, 2, y02, feeRemote.f95277c);
        dVar.B(serialDescriptor, 3, y02, feeRemote.f95278d);
        dVar.B(serialDescriptor, 4, y02, feeRemote.f95279e);
    }

    public final String a() {
        return this.f95276b;
    }

    public final String b() {
        return this.f95277c;
    }

    public final String c() {
        return this.f95279e;
    }

    public final String d() {
        return this.f95275a;
    }

    public final String e() {
        return this.f95278d;
    }

    public Fee f() {
        Fee.b a10 = FeeTypeEnum.Companion.a(this.f95275a);
        String str = this.f95276b;
        String str2 = this.f95277c;
        if (str2 != null) {
            return new Fee(a10, str, str2, this.f95278d, this.f95279e);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
