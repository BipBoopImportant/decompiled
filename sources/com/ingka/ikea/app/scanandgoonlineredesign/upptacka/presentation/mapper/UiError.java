package com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper;

import Oo.b;
import androidx.annotation.Keep;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uK.C18146a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError;", "", "", "icon", "title", "description", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", "type", "<init>", "(IIILcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", "Type", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UiError {

    /* renamed from: a  reason: collision with root package name */
    private final int f92279a;

    /* renamed from: b  reason: collision with root package name */
    private final int f92280b;

    /* renamed from: c  reason: collision with root package name */
    private final int f92281c;

    /* renamed from: d  reason: collision with root package name */
    private final Type f92282d;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ADD_TO_BAG", "GENERIC", "WRONG_STORE", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Type {
        ADD_TO_BAG("add_to_bag"),
        GENERIC("generic"),
        WRONG_STORE("wrong_store");
        
        private final String value;

        static {
            Type[] $values;
            $ENTRIES = C17221b.a($values);
        }

        private Type(String str) {
            this.value = str;
        }

        public static C17220a<Type> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public UiError() {
        this(0, 0, 0, (Type) null, 15, (DefaultConstructorMarker) null);
    }

    public final int a() {
        return this.f92281c;
    }

    public final int b() {
        return this.f92279a;
    }

    public final int c() {
        return this.f92280b;
    }

    public final Type d() {
        return this.f92282d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiError)) {
            return false;
        }
        UiError uiError = (UiError) obj;
        return this.f92279a == uiError.f92279a && this.f92280b == uiError.f92280b && this.f92281c == uiError.f92281c && this.f92282d == uiError.f92282d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f92279a) * 31) + Integer.hashCode(this.f92280b)) * 31) + Integer.hashCode(this.f92281c)) * 31) + this.f92282d.hashCode();
    }

    public String toString() {
        int i10 = this.f92279a;
        int i11 = this.f92280b;
        int i12 = this.f92281c;
        Type type = this.f92282d;
        return "UiError(icon=" + i10 + ", title=" + i11 + ", description=" + i12 + ", type=" + type + ")";
    }

    public UiError(int i10, int i11, int i12, Type type) {
        C17542s.j(type, "type");
        this.f92279a = i10;
        this.f92280b = i11;
        this.f92281c = i12;
        this.f92282d = type;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UiError(int i10, int i11, int i12, Type type, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C18146a.f148220R5 : i10, (i13 & 2) != 0 ? b.f84843y3 : i11, (i13 & 4) != 0 ? b.f84853z3 : i12, (i13 & 8) != 0 ? Type.GENERIC : type);
    }
}
