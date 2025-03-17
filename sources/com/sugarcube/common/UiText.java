package com.sugarcube.common;

import J1.j;
import OF.C13321a;
import OF.C13322b;
import U0.C4889m;
import U0.C4895p;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import YH.C16877v;
import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\f\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/common/UiText;", "", "<init>", "()V", "", "asString", "(LU0/m;I)Ljava/lang/String;", "Landroid/content/Context;", "context", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/content/res/Resources;", "resources", "(Landroid/content/res/Resources;)Ljava/lang/String;", "DynamicString", "StringResource", "PluralResource", "CompositeResource", "Lcom/sugarcube/common/UiText$CompositeResource;", "Lcom/sugarcube/common/UiText$DynamicString;", "Lcom/sugarcube/common/UiText$PluralResource;", "Lcom/sugarcube/common/UiText$StringResource;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class UiText {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/common/UiText$DynamicString;", "Lcom/sugarcube/common/UiText;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "component1", "copy", "equals", "", "other", "", "hashCode", "", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DynamicString extends UiText {
        public static final int $stable = 0;
        private final String value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DynamicString(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "value");
            this.value = str;
        }

        public static /* synthetic */ DynamicString copy$default(DynamicString dynamicString, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dynamicString.value;
            }
            return dynamicString.copy(str);
        }

        public final String component1() {
            return this.value;
        }

        public final DynamicString copy(String str) {
            C17542s.j(str, "value");
            return new DynamicString(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DynamicString) && C17542s.e(this.value, ((DynamicString) obj).value);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010R!\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070!8@X\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/sugarcube/common/UiText$PluralResource;", "Lcom/sugarcube/common/UiText;", "", "id", "Lcom/sugarcube/common/PluralCount;", "count", "", "", "args", "<init>", "(IILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()I", "component2-huvaY5M", "component2", "component3", "()Ljava/util/List;", "copy-qe8XlhI", "(IILjava/util/List;)Lcom/sugarcube/common/UiText$PluralResource;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getCount-huvaY5M", "Ljava/util/List;", "getArgs", "", "argsArray$delegate", "LXH/o;", "getArgsArray$common_release", "()[Ljava/lang/Object;", "argsArray", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PluralResource extends UiText {
        public static final int $stable = 0;
        private final List<Object> args;
        private final C16824o argsArray$delegate;
        private final int count;

        /* renamed from: id  reason: collision with root package name */
        private final int f126064id;

        public /* synthetic */ PluralResource(int i10, int i11, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, list);
        }

        /* access modifiers changed from: private */
        public static final Object[] argsArray_delegate$lambda$0(PluralResource pluralResource) {
            return pluralResource.args.toArray(new Object[0]);
        }

        /* renamed from: copy-qe8XlhI$default  reason: not valid java name */
        public static /* synthetic */ PluralResource m38copyqe8XlhI$default(PluralResource pluralResource, int i10, int i11, List<Object> list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = pluralResource.f126064id;
            }
            if ((i12 & 2) != 0) {
                i11 = pluralResource.count;
            }
            if ((i12 & 4) != 0) {
                list = pluralResource.args;
            }
            return pluralResource.m40copyqe8XlhI(i10, i11, list);
        }

        public final int component1() {
            return this.f126064id;
        }

        /* renamed from: component2-huvaY5M  reason: not valid java name */
        public final int m39component2huvaY5M() {
            return this.count;
        }

        public final List<Object> component3() {
            return this.args;
        }

        /* renamed from: copy-qe8XlhI  reason: not valid java name */
        public final PluralResource m40copyqe8XlhI(int i10, int i11, List<? extends Object> list) {
            C17542s.j(list, "args");
            return new PluralResource(i10, i11, list, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PluralResource)) {
                return false;
            }
            PluralResource pluralResource = (PluralResource) obj;
            return this.f126064id == pluralResource.f126064id && PluralCount.m34equalsimpl0(this.count, pluralResource.count) && C17542s.e(this.args, pluralResource.args);
        }

        public final List<Object> getArgs() {
            return this.args;
        }

        public final Object[] getArgsArray$common_release() {
            return (Object[]) this.argsArray$delegate.getValue();
        }

        /* renamed from: getCount-huvaY5M  reason: not valid java name */
        public final int m41getCounthuvaY5M() {
            return this.count;
        }

        public final int getId() {
            return this.f126064id;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f126064id) * 31) + PluralCount.m35hashCodeimpl(this.count)) * 31) + this.args.hashCode();
        }

        public String toString() {
            int i10 = this.f126064id;
            String r12 = PluralCount.m36toStringimpl(this.count);
            List<Object> list = this.args;
            return "PluralResource(id=" + i10 + ", count=" + r12 + ", args=" + list + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PluralResource(int i10, int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, (i12 & 4) != 0 ? C16877v.n() : list, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private PluralResource(int i10, int i11, List<? extends Object> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "args");
            this.f126064id = i10;
            this.count = i11;
            this.args = list;
            this.argsArray$delegate = C16825p.b(new C13321a(this));
        }
    }

    public /* synthetic */ UiText(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String asString(C4889m mVar, int i10) {
        String str;
        mVar.W(-364453525);
        if (C4895p.J()) {
            C4895p.S(-364453525, i10, -1, "com.sugarcube.common.UiText.asString (UiText.kt:72)");
        }
        if (this instanceof DynamicString) {
            mVar.W(-2067616638);
            mVar.P();
            str = ((DynamicString) this).getValue();
        } else if (this instanceof StringResource) {
            mVar.W(-2067615301);
            StringResource stringResource = (StringResource) this;
            int id2 = stringResource.getId();
            Object[] argsArray$common_release = stringResource.getArgsArray$common_release();
            str = j.c(id2, Arrays.copyOf(argsArray$common_release, argsArray$common_release.length), mVar, 0);
            mVar.P();
        } else if (this instanceof PluralResource) {
            mVar.W(-2067611130);
            PluralResource pluralResource = (PluralResource) this;
            int id3 = pluralResource.getId();
            int r22 = pluralResource.m41getCounthuvaY5M();
            Object[] argsArray$common_release2 = pluralResource.getArgsArray$common_release();
            str = j.a(id3, r22, Arrays.copyOf(argsArray$common_release2, argsArray$common_release2.length), mVar, 0);
            mVar.P();
        } else if (this instanceof CompositeResource) {
            mVar.W(-2067605541);
            CompositeResource compositeResource = (CompositeResource) this;
            int id4 = compositeResource.getId();
            Iterable<UiText> args = compositeResource.getArgs();
            ArrayList arrayList = new ArrayList(C16877v.y(args, 10));
            for (UiText asString : args) {
                arrayList.add(asString.asString(mVar, 0));
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            str = j.c(id4, Arrays.copyOf(strArr, strArr.length), mVar, 0);
            mVar.P();
        } else {
            mVar.W(-2067617590);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return str;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/common/UiText$CompositeResource;", "Lcom/sugarcube/common/UiText;", "id", "", "args", "", "<init>", "(ILjava/util/List;)V", "getId", "()I", "getArgs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CompositeResource extends UiText {
        public static final int $stable = 0;
        private final List<UiText> args;

        /* renamed from: id  reason: collision with root package name */
        private final int f126063id;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CompositeResource(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? C16877v.n() : list);
        }

        public static /* synthetic */ CompositeResource copy$default(CompositeResource compositeResource, int i10, List<UiText> list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = compositeResource.f126063id;
            }
            if ((i11 & 2) != 0) {
                list = compositeResource.args;
            }
            return compositeResource.copy(i10, list);
        }

        public final int component1() {
            return this.f126063id;
        }

        public final List<UiText> component2() {
            return this.args;
        }

        public final CompositeResource copy(int i10, List<? extends UiText> list) {
            C17542s.j(list, "args");
            return new CompositeResource(i10, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompositeResource)) {
                return false;
            }
            CompositeResource compositeResource = (CompositeResource) obj;
            return this.f126063id == compositeResource.f126063id && C17542s.e(this.args, compositeResource.args);
        }

        public final List<UiText> getArgs() {
            return this.args;
        }

        public final int getId() {
            return this.f126063id;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f126063id) * 31) + this.args.hashCode();
        }

        public String toString() {
            int i10 = this.f126063id;
            List<UiText> list = this.args;
            return "CompositeResource(id=" + i10 + ", args=" + list + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CompositeResource(int i10, List<? extends UiText> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "args");
            this.f126063id = i10;
            this.args = list;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\nJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\fR!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001b8@X\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/sugarcube/common/UiText$StringResource;", "Lcom/sugarcube/common/UiText;", "", "id", "", "", "args", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/sugarcube/common/UiText$StringResource;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/util/List;", "getArgs", "", "argsArray$delegate", "LXH/o;", "getArgsArray$common_release", "()[Ljava/lang/Object;", "argsArray", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StringResource extends UiText {
        public static final int $stable = 0;
        private final List<Object> args;
        private final C16824o argsArray$delegate;

        /* renamed from: id  reason: collision with root package name */
        private final int f126065id;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StringResource(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? C16877v.n() : list);
        }

        /* access modifiers changed from: private */
        public static final Object[] argsArray_delegate$lambda$0(StringResource stringResource) {
            return stringResource.args.toArray(new Object[0]);
        }

        public static /* synthetic */ StringResource copy$default(StringResource stringResource, int i10, List<Object> list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = stringResource.f126065id;
            }
            if ((i11 & 2) != 0) {
                list = stringResource.args;
            }
            return stringResource.copy(i10, list);
        }

        public final int component1() {
            return this.f126065id;
        }

        public final List<Object> component2() {
            return this.args;
        }

        public final StringResource copy(int i10, List<? extends Object> list) {
            C17542s.j(list, "args");
            return new StringResource(i10, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringResource)) {
                return false;
            }
            StringResource stringResource = (StringResource) obj;
            return this.f126065id == stringResource.f126065id && C17542s.e(this.args, stringResource.args);
        }

        public final List<Object> getArgs() {
            return this.args;
        }

        public final Object[] getArgsArray$common_release() {
            return (Object[]) this.argsArray$delegate.getValue();
        }

        public final int getId() {
            return this.f126065id;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f126065id) * 31) + this.args.hashCode();
        }

        public String toString() {
            int i10 = this.f126065id;
            List<Object> list = this.args;
            return "StringResource(id=" + i10 + ", args=" + list + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StringResource(int i10, List<? extends Object> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "args");
            this.f126065id = i10;
            this.args = list;
            this.argsArray$delegate = C16825p.b(new C13322b(this));
        }
    }

    private UiText() {
    }

    public final String asString(Context context) {
        C17542s.j(context, "context");
        Resources resources = context.getResources();
        C17542s.i(resources, "getResources(...)");
        return asString(resources);
    }

    public final String asString(Resources resources) {
        C17542s.j(resources, "resources");
        if (this instanceof DynamicString) {
            return ((DynamicString) this).getValue();
        }
        if (this instanceof StringResource) {
            StringResource stringResource = (StringResource) this;
            int id2 = stringResource.getId();
            Object[] argsArray$common_release = stringResource.getArgsArray$common_release();
            String string = resources.getString(id2, Arrays.copyOf(argsArray$common_release, argsArray$common_release.length));
            C17542s.i(string, "getString(...)");
            return string;
        } else if (this instanceof PluralResource) {
            PluralResource pluralResource = (PluralResource) this;
            int id3 = pluralResource.getId();
            int r22 = pluralResource.m41getCounthuvaY5M();
            Object[] argsArray$common_release2 = pluralResource.getArgsArray$common_release();
            String quantityString = resources.getQuantityString(id3, r22, Arrays.copyOf(argsArray$common_release2, argsArray$common_release2.length));
            C17542s.i(quantityString, "getQuantityString(...)");
            return quantityString;
        } else if (this instanceof CompositeResource) {
            CompositeResource compositeResource = (CompositeResource) this;
            int id4 = compositeResource.getId();
            Iterable<UiText> args = compositeResource.getArgs();
            ArrayList arrayList = new ArrayList(C16877v.y(args, 10));
            for (UiText asString : args) {
                arrayList.add(asString.asString(resources));
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String string2 = resources.getString(id4, Arrays.copyOf(strArr, strArr.length));
            C17542s.i(string2, "getString(...)");
            return string2;
        } else {
            throw new t();
        }
    }
}
