package com.ingka.ikea.dynamicfields.datalayer;

import android.os.Parcel;
import android.os.Parcelable;
import fK.p;
import iK.C17395d;
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
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b1\b\b\u0018\u0000 a2\u00020\u0001:\u0002b6B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013¢\u0006\u0004\b\u0019\u0010\u001aBÁ\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020%2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001b¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u001b¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b1\u0010.J\u001a\u00104\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u00100R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u00107\u0012\u0004\b=\u0010:\u001a\u0004\b<\u00100R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u00107\u0012\u0004\b@\u0010:\u001a\u0004\b?\u00100R \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bA\u00107\u0012\u0004\bC\u0010:\u001a\u0004\bB\u00100R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bD\u00107\u0012\u0004\bF\u0010:\u001a\u0004\bE\u00100R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bG\u00107\u0012\u0004\bI\u0010:\u001a\u0004\bH\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bH\u00107\u0012\u0004\bJ\u0010:\u001a\u0004\bD\u00100R \u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010K\u0012\u0004\bN\u0010:\u001a\u0004\bL\u0010MR \u0010\f\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u00107\u0012\u0004\bO\u0010:\u001a\u0004\bA\u00100R \u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\bB\u0010P\u0012\u0004\bR\u0010:\u001a\u0004\bG\u0010QR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010S\u0012\u0004\bV\u0010:\u001a\u0004\bT\u0010UR \u0010\u0012\u001a\u00020\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010W\u0012\u0004\bY\u0010:\u001a\u0004\b;\u0010XR&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\bT\u0010Z\u0012\u0004\b\\\u0010:\u001a\u0004\b>\u0010[R&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b]\u0010Z\u0012\u0004\b^\u0010:\u001a\u0004\b]\u0010[R&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b_\u0010Z\u0012\u0004\b`\u0010:\u001a\u0004\b_\u0010[¨\u0006c"}, d2 = {"Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "Landroid/os/Parcelable;", "", "key", "targetKey", "title", "text", "textAsCollapsed", "inputValue", "inputDisplay", "", "isMandatory", "errorText", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "inputType", "Lcom/ingka/ikea/dynamicfields/datalayer/c;", "uiType", "Lcom/ingka/ikea/dynamicfields/datalayer/a;", "accountType", "", "Lcom/ingka/ikea/dynamicfields/datalayer/KeyValue;", "data", "validation", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "visibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/ingka/ikea/dynamicfields/datalayer/b;Lcom/ingka/ikea/dynamicfields/datalayer/c;Lcom/ingka/ikea/dynamicfields/datalayer/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/ingka/ikea/dynamicfields/datalayer/b;Lcom/ingka/ikea/dynamicfields/datalayer/c;Lcom/ingka/ikea/dynamicfields/datalayer/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "q", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "getKey$annotations", "()V", "b", "i", "getTargetKey$annotations", "c", "l", "getTitle$annotations", "d", "j", "getText$annotations", "e", "k", "getTextAsCollapsed$annotations", "f", "g", "getInputValue$annotations", "getInputDisplay$annotations", "Z", "p", "()Z", "isMandatory$annotations", "getErrorText$annotations", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "()Lcom/ingka/ikea/dynamicfields/datalayer/b;", "getInputType$annotations", "Lcom/ingka/ikea/dynamicfields/datalayer/c;", "m", "()Lcom/ingka/ikea/dynamicfields/datalayer/c;", "getUiType$annotations", "Lcom/ingka/ikea/dynamicfields/datalayer/a;", "()Lcom/ingka/ikea/dynamicfields/datalayer/a;", "getAccountType$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getData$annotations", "n", "getValidation$annotations", "o", "getVisibility$annotations", "Companion", "$serializer", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FieldAttributes implements Parcelable {
    public static final Parcelable.Creator<FieldAttributes> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final KSerializer<Object>[] f95666p;

    /* renamed from: a  reason: collision with root package name */
    private final String f95667a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95668b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95669c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95670d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95671e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95672f;

    /* renamed from: g  reason: collision with root package name */
    private final String f95673g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f95674h;

    /* renamed from: i  reason: collision with root package name */
    private final String f95675i;

    /* renamed from: j  reason: collision with root package name */
    private final b f95676j;

    /* renamed from: k  reason: collision with root package name */
    private final c f95677k;

    /* renamed from: l  reason: collision with root package name */
    private final a f95678l;

    /* renamed from: m  reason: collision with root package name */
    private final List<KeyValue> f95679m;

    /* renamed from: n  reason: collision with root package name */
    private final List<KeyValue> f95680n;

    /* renamed from: o  reason: collision with root package name */
    private final List<Conditions> f95681o;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FieldAttributes> serializer() {
            return FieldAttributes$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FieldAttributes> {
        /* renamed from: a */
        public final FieldAttributes createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C17542s.j(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            String readString8 = parcel.readString();
            b valueOf = b.valueOf(parcel.readString());
            c valueOf2 = c.valueOf(parcel.readString());
            a valueOf3 = a.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (i10 != readInt) {
                arrayList.add(KeyValue.CREATOR.createFromParcel(parcel2));
                i10++;
                readInt = readInt;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            ArrayList arrayList3 = arrayList;
            int i11 = 0;
            while (i11 != readInt2) {
                arrayList2.add(KeyValue.CREATOR.createFromParcel(parcel2));
                i11++;
                readInt2 = readInt2;
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt3);
            ArrayList arrayList5 = arrayList2;
            int i12 = 0;
            while (i12 != readInt3) {
                arrayList4.add(Conditions.CREATOR.createFromParcel(parcel2));
                i12++;
                readInt3 = readInt3;
            }
            return new FieldAttributes(readString, readString2, readString3, readString4, readString5, readString6, readString7, z10, readString8, valueOf, valueOf2, valueOf3, arrayList3, arrayList5, arrayList4);
        }

        /* renamed from: b */
        public final FieldAttributes[] newArray(int i10) {
            return new FieldAttributes[i10];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlinx.serialization.KSerializer<java.lang.Object>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            com.ingka.ikea.dynamicfields.datalayer.FieldAttributes$a r0 = new com.ingka.ikea.dynamicfields.datalayer.FieldAttributes$a
            r1 = 0
            r0.<init>(r1)
            Companion = r0
            com.ingka.ikea.dynamicfields.datalayer.FieldAttributes$b r0 = new com.ingka.ikea.dynamicfields.datalayer.FieldAttributes$b
            r0.<init>()
            CREATOR = r0
            com.ingka.ikea.dynamicfields.datalayer.b$a r0 = com.ingka.ikea.dynamicfields.datalayer.b.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            com.ingka.ikea.dynamicfields.datalayer.c$a r2 = com.ingka.ikea.dynamicfields.datalayer.c.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            com.ingka.ikea.dynamicfields.datalayer.a$a r3 = com.ingka.ikea.dynamicfields.datalayer.a.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
            jK.f r4 = new jK.f
            com.ingka.ikea.dynamicfields.datalayer.KeyValue$$serializer r5 = com.ingka.ikea.dynamicfields.datalayer.KeyValue$$serializer.INSTANCE
            r4.<init>(r5)
            jK.f r6 = new jK.f
            r6.<init>(r5)
            jK.f r5 = new jK.f
            com.ingka.ikea.dynamicfields.datalayer.Conditions$$serializer r7 = com.ingka.ikea.dynamicfields.datalayer.Conditions$$serializer.INSTANCE
            r5.<init>(r7)
            r7 = 15
            kotlinx.serialization.KSerializer[] r7 = new kotlinx.serialization.KSerializer[r7]
            r8 = 0
            r7[r8] = r1
            r8 = 1
            r7[r8] = r1
            r8 = 2
            r7[r8] = r1
            r8 = 3
            r7[r8] = r1
            r8 = 4
            r7[r8] = r1
            r8 = 5
            r7[r8] = r1
            r8 = 6
            r7[r8] = r1
            r8 = 7
            r7[r8] = r1
            r8 = 8
            r7[r8] = r1
            r1 = 9
            r7[r1] = r0
            r0 = 10
            r7[r0] = r2
            r0 = 11
            r7[r0] = r3
            r0 = 12
            r7[r0] = r4
            r0 = 13
            r7[r0] = r6
            r0 = 14
            r7[r0] = r5
            f95666p = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.dynamicfields.datalayer.FieldAttributes.<clinit>():void");
    }

    public /* synthetic */ FieldAttributes(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, String str8, b bVar, c cVar, a aVar, List list, List list2, List list3, T0 t02) {
        if (32767 != (i10 & 32767)) {
            E0.b(i10, 32767, FieldAttributes$$serializer.INSTANCE.getDescriptor());
        }
        this.f95667a = str;
        this.f95668b = str2;
        this.f95669c = str3;
        this.f95670d = str4;
        this.f95671e = str5;
        this.f95672f = str6;
        this.f95673g = str7;
        this.f95674h = z10;
        this.f95675i = str8;
        this.f95676j = bVar;
        this.f95677k = cVar;
        this.f95678l = aVar;
        this.f95679m = list;
        this.f95680n = list2;
        this.f95681o = list3;
    }

    public static final /* synthetic */ void q(FieldAttributes fieldAttributes, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95666p;
        dVar.y(serialDescriptor, 0, fieldAttributes.f95667a);
        dVar.y(serialDescriptor, 1, fieldAttributes.f95668b);
        dVar.y(serialDescriptor, 2, fieldAttributes.f95669c);
        dVar.y(serialDescriptor, 3, fieldAttributes.f95670d);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 4, y02, fieldAttributes.f95671e);
        dVar.B(serialDescriptor, 5, y02, fieldAttributes.f95672f);
        dVar.B(serialDescriptor, 6, y02, fieldAttributes.f95673g);
        dVar.x(serialDescriptor, 7, fieldAttributes.f95674h);
        dVar.y(serialDescriptor, 8, fieldAttributes.f95675i);
        dVar.i(serialDescriptor, 9, kSerializerArr[9], fieldAttributes.f95676j);
        dVar.i(serialDescriptor, 10, kSerializerArr[10], fieldAttributes.f95677k);
        dVar.i(serialDescriptor, 11, kSerializerArr[11], fieldAttributes.f95678l);
        dVar.i(serialDescriptor, 12, kSerializerArr[12], fieldAttributes.f95679m);
        dVar.i(serialDescriptor, 13, kSerializerArr[13], fieldAttributes.f95680n);
        dVar.i(serialDescriptor, 14, kSerializerArr[14], fieldAttributes.f95681o);
    }

    public final a b() {
        return this.f95678l;
    }

    public final List<KeyValue> c() {
        return this.f95679m;
    }

    public final String d() {
        return this.f95675i;
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f95673g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldAttributes)) {
            return false;
        }
        FieldAttributes fieldAttributes = (FieldAttributes) obj;
        return C17542s.e(this.f95667a, fieldAttributes.f95667a) && C17542s.e(this.f95668b, fieldAttributes.f95668b) && C17542s.e(this.f95669c, fieldAttributes.f95669c) && C17542s.e(this.f95670d, fieldAttributes.f95670d) && C17542s.e(this.f95671e, fieldAttributes.f95671e) && C17542s.e(this.f95672f, fieldAttributes.f95672f) && C17542s.e(this.f95673g, fieldAttributes.f95673g) && this.f95674h == fieldAttributes.f95674h && C17542s.e(this.f95675i, fieldAttributes.f95675i) && this.f95676j == fieldAttributes.f95676j && this.f95677k == fieldAttributes.f95677k && this.f95678l == fieldAttributes.f95678l && C17542s.e(this.f95679m, fieldAttributes.f95679m) && C17542s.e(this.f95680n, fieldAttributes.f95680n) && C17542s.e(this.f95681o, fieldAttributes.f95681o);
    }

    public final b f() {
        return this.f95676j;
    }

    public final String g() {
        return this.f95672f;
    }

    public final String h() {
        return this.f95667a;
    }

    public int hashCode() {
        int hashCode = ((((((this.f95667a.hashCode() * 31) + this.f95668b.hashCode()) * 31) + this.f95669c.hashCode()) * 31) + this.f95670d.hashCode()) * 31;
        String str = this.f95671e;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95672f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95673g;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((((((((((((((hashCode3 + i10) * 31) + Boolean.hashCode(this.f95674h)) * 31) + this.f95675i.hashCode()) * 31) + this.f95676j.hashCode()) * 31) + this.f95677k.hashCode()) * 31) + this.f95678l.hashCode()) * 31) + this.f95679m.hashCode()) * 31) + this.f95680n.hashCode()) * 31) + this.f95681o.hashCode();
    }

    public final String i() {
        return this.f95668b;
    }

    public final String j() {
        return this.f95670d;
    }

    public final String k() {
        return this.f95671e;
    }

    public final String l() {
        return this.f95669c;
    }

    public final c m() {
        return this.f95677k;
    }

    public final List<KeyValue> n() {
        return this.f95680n;
    }

    public final List<Conditions> o() {
        return this.f95681o;
    }

    public final boolean p() {
        return this.f95674h;
    }

    public String toString() {
        String str = this.f95667a;
        String str2 = this.f95668b;
        String str3 = this.f95669c;
        String str4 = this.f95670d;
        String str5 = this.f95671e;
        String str6 = this.f95672f;
        String str7 = this.f95673g;
        boolean z10 = this.f95674h;
        String str8 = this.f95675i;
        b bVar = this.f95676j;
        c cVar = this.f95677k;
        a aVar = this.f95678l;
        List<KeyValue> list = this.f95679m;
        List<KeyValue> list2 = this.f95680n;
        List<Conditions> list3 = this.f95681o;
        return "FieldAttributes(key=" + str + ", targetKey=" + str2 + ", title=" + str3 + ", text=" + str4 + ", textAsCollapsed=" + str5 + ", inputValue=" + str6 + ", inputDisplay=" + str7 + ", isMandatory=" + z10 + ", errorText=" + str8 + ", inputType=" + bVar + ", uiType=" + cVar + ", accountType=" + aVar + ", data=" + list + ", validation=" + list2 + ", visibility=" + list3 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f95667a);
        parcel.writeString(this.f95668b);
        parcel.writeString(this.f95669c);
        parcel.writeString(this.f95670d);
        parcel.writeString(this.f95671e);
        parcel.writeString(this.f95672f);
        parcel.writeString(this.f95673g);
        parcel.writeInt(this.f95674h ? 1 : 0);
        parcel.writeString(this.f95675i);
        parcel.writeString(this.f95676j.name());
        parcel.writeString(this.f95677k.name());
        parcel.writeString(this.f95678l.name());
        List<KeyValue> list = this.f95679m;
        parcel.writeInt(list.size());
        for (KeyValue writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        List<KeyValue> list2 = this.f95680n;
        parcel.writeInt(list2.size());
        for (KeyValue writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i10);
        }
        List<Conditions> list3 = this.f95681o;
        parcel.writeInt(list3.size());
        for (Conditions writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, i10);
        }
    }

    public FieldAttributes(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, String str8, b bVar, c cVar, a aVar, List<KeyValue> list, List<KeyValue> list2, List<Conditions> list3) {
        String str9 = str3;
        String str10 = str4;
        String str11 = str8;
        b bVar2 = bVar;
        c cVar2 = cVar;
        a aVar2 = aVar;
        List<KeyValue> list4 = list;
        List<KeyValue> list5 = list2;
        List<Conditions> list6 = list3;
        C17542s.j(str, "key");
        C17542s.j(str2, "targetKey");
        C17542s.j(str9, "title");
        C17542s.j(str10, "text");
        C17542s.j(str11, "errorText");
        C17542s.j(bVar2, "inputType");
        C17542s.j(cVar2, "uiType");
        C17542s.j(aVar2, "accountType");
        C17542s.j(list4, "data");
        C17542s.j(list5, "validation");
        C17542s.j(list6, "visibility");
        this.f95667a = str;
        this.f95668b = str2;
        this.f95669c = str9;
        this.f95670d = str10;
        this.f95671e = str5;
        this.f95672f = str6;
        this.f95673g = str7;
        this.f95674h = z10;
        this.f95675i = str11;
        this.f95676j = bVar2;
        this.f95677k = cVar2;
        this.f95678l = aVar2;
        this.f95679m = list4;
        this.f95680n = list5;
        this.f95681o = list6;
    }
}
