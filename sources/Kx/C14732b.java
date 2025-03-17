package kx;

import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote;
import ix.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkx/b;", "Lpp/c;", "Lix/c$b;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Images;", "<init>", "()V", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "remote", "Lcom/ingka/ikea/core/model/Image;", "b", "(Lcom/ingka/ikea/core/remotemodel/ImageRemote;)Lcom/ingka/ikea/core/model/Image;", "c", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Images;)Lix/c$b;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kx.b  reason: case insensitive filesystem */
public final class C14732b implements C11769c<c.b, PrepaidCardRemote.Images> {
    private final Image b(ImageRemote imageRemote) {
        String b10 = imageRemote.b();
        if (b10 != null) {
            String a10 = imageRemote.a();
            if (a10 == null) {
                a10 = "";
            }
            return new Image(b10, a10);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* renamed from: c */
    public c.b a(PrepaidCardRemote.Images images) {
        C17542s.j(images, "remote");
        return new c.b(b(images.b()), b(images.a()));
    }
}
