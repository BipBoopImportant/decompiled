package Re;

import XH.C16807N;
import XH.C16814e;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.maps.model.LatLngBounds;
import com.ingka.ikea.app.addresspicker.AddressPickerFragment;
import com.ingka.ikea.app.addresspicker.addresslookup.AddressLookupPickerDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import me.C10038a;
import nI.C17642l;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJG\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J]\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LRe/a;", "Lme/a;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lme/a$a;", "addressLookupConfig", "", "requestValue", "componentValue", "LXH/N;", "b", "(Landroidx/fragment/app/FragmentManager;Lme/a$a;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lme/a$d;", "addressSetListener", "a", "(Landroidx/fragment/app/FragmentManager;Lme/a$a;Ljava/lang/String;Ljava/lang/String;LnI/l;)V", "countryCode", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "currentAddress", "", "locationRestriction", "enableAddStreetNumber", "Lme/a$b;", "cursorSelection", "Lme/a$c;", "onSelectAddressListener", "c", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/lang/String;ZZLme/a$b;Lme/a$c;Ljava/lang/String;)V", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C10038a {
    @C16814e
    public void a(FragmentManager fragmentManager, C10038a.C1374a aVar, String str, String str2, C17642l<? super C10038a.d, C16807N> lVar) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(aVar, "addressLookupConfig");
        C17542s.j(str2, "componentValue");
        AddressLookupPickerDialog a10 = AddressLookupPickerDialog.f69979Y.a(aVar, str2, str);
        a10.a1(lVar);
        a10.show(fragmentManager, "postal_code_picker_dialog");
    }

    public void b(FragmentManager fragmentManager, C10038a.C1374a aVar, String str, String str2) {
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(aVar, "addressLookupConfig");
        C17542s.j(str2, "componentValue");
        AddressLookupPickerDialog.f69979Y.a(aVar, str2, str).show(fragmentManager, "postal_code_picker_dialog");
    }

    public void c(FragmentManager fragmentManager, String str, LatLngBounds latLngBounds, String str2, boolean z10, boolean z11, C10038a.b bVar, C10038a.c cVar, String str3) {
        FragmentManager fragmentManager2 = fragmentManager;
        C10038a.c cVar2 = cVar;
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(str, "countryCode");
        C17542s.j(cVar2, "onSelectAddressListener");
        String str4 = str3;
        C17542s.j(str4, "componentValue");
        AddressPickerFragment a10 = AddressPickerFragment.f69962U.a(str, latLngBounds, str2, z10, z11, bVar, str4);
        a10.R0(cVar2);
        a10.show(fragmentManager, "address_picker_fragment");
    }
}
