package com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote;

import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
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
import vn.C12196a;

@p
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0001\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-\u0018BM\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001a\u0012\u0004\b%\u0010\u001e\u001a\u0004\b$\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001a\u0012\u0004\b(\u0010\u001e\u001a\u0004\b'\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001a\u0012\u0004\b+\u0010\u001e\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteV6;", "Lpp/b;", "Lvn/a;", "", "seen0", "", "id", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "title", "body", "description", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lvn/a;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "c", "getTitle", "getTitle$annotations", "d", "getBody", "getBody$annotations", "e", "getDescription", "getDescription$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CategoryRemoteV6 implements C11768b<C12196a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f93385a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageRemote f93386b;

    /* renamed from: c  reason: collision with root package name */
    private final String f93387c;

    /* renamed from: d  reason: collision with root package name */
    private final String f93388d;

    /* renamed from: e  reason: collision with root package name */
    private final String f93389e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/CategoryRemoteV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CategoryRemoteV6> serializer() {
            return CategoryRemoteV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CategoryRemoteV6(int i10, String str, ImageRemote imageRemote, String str2, String str3, String str4, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, CategoryRemoteV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f93385a = str;
        this.f93386b = imageRemote;
        this.f93387c = str2;
        this.f93388d = str3;
        this.f93389e = str4;
    }

    public static final /* synthetic */ void b(CategoryRemoteV6 categoryRemoteV6, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, categoryRemoteV6.f93385a);
        dVar.B(serialDescriptor, 1, ImageRemote$$serializer.INSTANCE, categoryRemoteV6.f93386b);
        dVar.B(serialDescriptor, 2, y02, categoryRemoteV6.f93387c);
        dVar.B(serialDescriptor, 3, y02, categoryRemoteV6.f93388d);
        dVar.B(serialDescriptor, 4, y02, categoryRemoteV6.f93389e);
    }

    public C12196a a() {
        String str = this.f93385a;
        if (str != null) {
            ImageRemote imageRemote = this.f93386b;
            if (imageRemote != null) {
                Image c10 = imageRemote.c();
                String str2 = this.f93387c;
                if (str2 != null) {
                    return new C12196a(str, c10, str2, this.f93388d, this.f93389e);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
