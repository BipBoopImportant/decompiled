package dz;

import TJ.C16532g;
import XH.C16807N;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel;
import dI.C17164e;
import gz.c;
import gz.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0010\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u0006J \u0010\u001a\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH¦@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tH¦@¢\u0006\u0004\b \u0010\u0015J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b!\u0010\u0006J \u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u000eH¦@¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H&¢\u0006\u0004\b%\u0010\u0018J\u001a\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b&\u0010\u0006J\u0018\u0010'\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0013H¦@¢\u0006\u0004\b'\u0010(J\u001e\u0010*\u001a\u00020\t2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H¦@¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Ldz/a;", "", "", "barcode", "Lgz/e;", "j", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "item", "LXH/N;", "h", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;LdI/e;)Ljava/lang/Object;", "", "quantity", "", "collect", "g", "(Ljava/lang/String;IZLdI/e;)Ljava/lang/Object;", "", "Lgz/c;", "o", "(LdI/e;)Ljava/lang/Object;", "LTJ/g;", "n", "()LTJ/g;", "e", "m", "(Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "", "inclTax", "l", "(Ljava/lang/String;DLdI/e;)Ljava/lang/Object;", "f", "k", "collected", "c", "(Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "i", "b", "p", "(Lgz/c;LdI/e;)Ljava/lang/Object;", "barcodes", "d", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dz.a  reason: case insensitive filesystem */
public interface C14369a {
    Object b(String str, C17164e<? super c> eVar);

    Object c(String str, boolean z10, C17164e<? super C16807N> eVar);

    Object d(List<String> list, C17164e<? super C16807N> eVar);

    Object e(String str, C17164e<? super C16807N> eVar);

    Object f(C17164e<? super C16807N> eVar);

    Object g(String str, int i10, boolean z10, C17164e<? super C16807N> eVar);

    Object h(String str, ScanAndGoProductResponseDataModel scanAndGoProductResponseDataModel, C17164e<? super C16807N> eVar);

    C16532g<Integer> i();

    Object j(String str, C17164e<? super e> eVar);

    Object k(String str, C17164e<? super Integer> eVar);

    Object l(String str, double d10, C17164e<? super C16807N> eVar);

    Object m(String str, int i10, C17164e<? super C16807N> eVar);

    C16532g<List<c>> n();

    Object o(C17164e<? super List<c>> eVar);

    Object p(c cVar, C17164e<? super C16807N> eVar);
}
