package com.ingka.ikea.core.remotemodel;

import com.ingka.ikea.core.model.Category;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)\u0017BC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 R \u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u0012\u0004\b$\u0010\u001d\u001a\u0004\b#\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0019\u0012\u0004\b'\u0010\u001d\u001a\u0004\b&\u0010\u001b¨\u0006*"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/CategoryRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/Category;", "", "seen0", "", "categoryId", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "title", "prioritiser", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/CategoryRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lcom/ingka/ikea/core/model/Category;", "Ljava/lang/String;", "getCategoryId", "()Ljava/lang/String;", "getCategoryId$annotations", "()V", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "c", "getTitle", "getTitle$annotations", "d", "getPrioritiser", "getPrioritiser$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CategoryRemote implements C11768b<Category> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95186a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageRemote f95187b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95188c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95189d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/CategoryRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/CategoryRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CategoryRemote> serializer() {
            return CategoryRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CategoryRemote(int i10, String str, ImageRemote imageRemote, String str2, String str3, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, CategoryRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95186a = str;
        this.f95187b = imageRemote;
        this.f95188c = str2;
        this.f95189d = str3;
    }

    public static final /* synthetic */ void b(CategoryRemote categoryRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, categoryRemote.f95186a);
        dVar.i(serialDescriptor, 1, ImageRemote$$serializer.INSTANCE, categoryRemote.f95187b);
        dVar.y(serialDescriptor, 2, categoryRemote.f95188c);
        dVar.B(serialDescriptor, 3, Y0.f144077a, categoryRemote.f95189d);
    }

    public Category a() {
        return new Category(this.f95186a, this.f95187b.c(), this.f95188c, this.f95189d);
    }
}
