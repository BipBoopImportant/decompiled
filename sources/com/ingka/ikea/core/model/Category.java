package com.ingka.ikea.core.model;

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

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u001fB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b$\u0010\u0018¨\u0006("}, d2 = {"Lcom/ingka/ikea/core/model/Category;", "", "", "categoryId", "Lcom/ingka/ikea/core/model/Image;", "image", "title", "prioritiser", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/core/model/Category;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "c", "d", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Category {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f94902a;

    /* renamed from: b  reason: collision with root package name */
    private final Image f94903b;

    /* renamed from: c  reason: collision with root package name */
    private final String f94904c;

    /* renamed from: d  reason: collision with root package name */
    private final String f94905d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/Category$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/Category;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Category> serializer() {
            return Category$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Category(int i10, String str, Image image, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, Category$$serializer.INSTANCE.getDescriptor());
        }
        this.f94902a = str;
        this.f94903b = image;
        this.f94904c = str2;
        if ((i10 & 8) == 0) {
            this.f94905d = null;
        } else {
            this.f94905d = str3;
        }
    }

    public static final /* synthetic */ void e(Category category, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, category.f94902a);
        dVar.i(serialDescriptor, 1, Image$$serializer.INSTANCE, category.f94903b);
        dVar.y(serialDescriptor, 2, category.f94904c);
        if (dVar.z(serialDescriptor, 3) || category.f94905d != null) {
            dVar.B(serialDescriptor, 3, Y0.f144077a, category.f94905d);
        }
    }

    public final String a() {
        return this.f94902a;
    }

    public final Image b() {
        return this.f94903b;
    }

    public final String c() {
        return this.f94905d;
    }

    public final String d() {
        return this.f94904c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return C17542s.e(this.f94902a, category.f94902a) && C17542s.e(this.f94903b, category.f94903b) && C17542s.e(this.f94904c, category.f94904c) && C17542s.e(this.f94905d, category.f94905d);
    }

    public int hashCode() {
        int hashCode = ((((this.f94902a.hashCode() * 31) + this.f94903b.hashCode()) * 31) + this.f94904c.hashCode()) * 31;
        String str = this.f94905d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f94902a;
        Image image = this.f94903b;
        String str2 = this.f94904c;
        String str3 = this.f94905d;
        return "Category(categoryId=" + str + ", image=" + image + ", title=" + str2 + ", prioritiser=" + str3 + ")";
    }

    public Category(String str, Image image, String str2, String str3) {
        C17542s.j(str, "categoryId");
        C17542s.j(image, "image");
        C17542s.j(str2, "title");
        this.f94902a = str;
        this.f94903b = image;
        this.f94904c = str2;
        this.f94905d = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Category(String str, Image image, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, image, str2, (i10 & 8) != 0 ? null : str3);
    }
}
