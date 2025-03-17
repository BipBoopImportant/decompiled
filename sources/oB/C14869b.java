package oB;

import android.net.Uri;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"LoB/b;", "LoB/a;", "LkK/c;", "json", "<init>", "(LkK/c;)V", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "operation", "", "a", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;)Ljava/lang/String;", "c", "(Ljava/lang/String;)Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "LkK/c;", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oB.b  reason: case insensitive filesystem */
public final class C14869b implements C14868a {

    /* renamed from: a  reason: collision with root package name */
    private final C17514c f129972a;

    public C14869b(C17514c cVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f129972a = cVar;
    }

    public String a(ListPickerNavigation.Operation operation) {
        C17542s.j(operation, "operation");
        C17514c cVar = this.f129972a;
        cVar.a();
        String encode = Uri.encode(cVar.b(ListPickerNavigation.Operation.Companion.serializer(), operation));
        C17542s.i(encode, "encode(...)");
        return encode;
    }

    public ListPickerNavigation.Operation c(String str) {
        C17542s.j(str, "operation");
        C17514c cVar = this.f129972a;
        String decode = Uri.decode(str);
        C17542s.i(decode, "decode(...)");
        cVar.a();
        return (ListPickerNavigation.Operation) cVar.c(ListPickerNavigation.Operation.Companion.serializer(), decode);
    }
}
