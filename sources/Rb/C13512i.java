package RB;

import PB.g;
import XH.C16807N;
import com.ingka.ikea.store.datalayer.StorageType;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LRB/i;", "", "Lcom/ingka/ikea/store/datalayer/StorageType;", "storage", "LPB/g;", "storeItem", "LXH/N;", "a", "(Lcom/ingka/ikea/store/datalayer/StorageType;LPB/g;LdI/e;)Ljava/lang/Object;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RB.i  reason: case insensitive filesystem */
public interface C13512i {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LRB/i$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RB.i$a */
    public static final class a extends Exception {
    }

    Object a(StorageType storageType, g gVar, C17164e<? super C16807N> eVar);
}
