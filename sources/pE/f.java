package Pe;

import HJ.C15854t;
import Oe.l;
import Pe.d;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.x;
import XH.y;
import YH.C16877v;
import android.text.style.CharacterStyle;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17170k;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import xa.C8966g;
import xa.C8967h;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"LPe/f;", "LPe/d;", "LPe/a;", "googlePlacesClientProvider", "LIe/a;", "analytics", "<init>", "(LPe/a;LIe/a;)V", "", "componentValue", "LXH/N;", "a", "(Ljava/lang/String;)V", "text", "", "locationRestriction", "Lcom/google/android/libraries/places/api/model/RectangularBounds;", "bounds", "countryCode", "", "LPe/d$a;", "c", "(Ljava/lang/String;ZLcom/google/android/libraries/places/api/model/RectangularBounds;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LOe/a;", "addressAndPlaceId", "LOe/l;", "b", "(LOe/a;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LPe/a;", "LIe/a;", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "LXH/o;", "f", "()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "sessionToken", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "e", "()Lcom/google/android/libraries/places/api/net/PlacesClient;", "client", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final a f62748a;

    /* renamed from: b  reason: collision with root package name */
    private final Ie.a f62749b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f62750c = C16825p.b(new e());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements C17642l<FetchPlaceResponse, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f62751a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17164e<l> f62752b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Oe.a f62753c;

        a(f fVar, C17164e<? super l> eVar, Oe.a aVar) {
            this.f62751a = fVar;
            this.f62752b = eVar;
            this.f62753c = aVar;
        }

        public final void a(FetchPlaceResponse fetchPlaceResponse) {
            f fVar = this.f62751a;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Place fetched successfully", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            C17164e<l> eVar2 = this.f62752b;
            x.a aVar = x.f139812b;
            eVar2.resumeWith(x.b(new l(this.f62753c.a(), fetchPlaceResponse.getPlace())));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FetchPlaceResponse) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements C8966g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f62754a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17164e<l> f62755b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Oe.a f62756c;

        b(f fVar, C17164e<? super l> eVar, Oe.a aVar) {
            this.f62754a = fVar;
            this.f62755b = eVar;
            this.f62756c = aVar;
        }

        public final void c(Exception exc) {
            C17542s.j(exc, "exception");
            f fVar = this.f62754a;
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Fetch place from id failed with exception: " + exc.getMessage(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            C17164e<l> eVar2 = this.f62755b;
            x.a aVar = x.f139812b;
            eVar2.resumeWith(x.b(new l(this.f62756c.a(), (Place) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements C17642l<FindAutocompletePredictionsResponse, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17164e<List<d.a>> f62757a;

        c(C17164e<? super List<d.a>> eVar) {
            this.f62757a = eVar;
        }

        public final void a(FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
            List<AutocompletePrediction> autocompletePredictions = findAutocompletePredictionsResponse.getAutocompletePredictions();
            C17542s.i(autocompletePredictions, "getAutocompletePredictions(...)");
            Iterable<AutocompletePrediction> iterable = autocompletePredictions;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (AutocompletePrediction autocompletePrediction : iterable) {
                String spannableString = autocompletePrediction.getPrimaryText((CharacterStyle) null).toString();
                C17542s.i(spannableString, "toString(...)");
                String spannableString2 = autocompletePrediction.getSecondaryText((CharacterStyle) null).toString();
                C17542s.i(spannableString2, "toString(...)");
                String placeId = autocompletePrediction.getPlaceId();
                C17542s.i(placeId, "getPlaceId(...)");
                arrayList.add(new d.a(spannableString, spannableString2, placeId));
            }
            this.f62757a.resumeWith(x.b(arrayList));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FindAutocompletePredictionsResponse) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements C8966g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f62758a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17164e<List<d.a>> f62759b;

        d(f fVar, C17164e<? super List<d.a>> eVar) {
            this.f62758a = fVar;
            this.f62759b = eVar;
        }

        public final void c(Exception exc) {
            C17542s.j(exc, "exception");
            f fVar = this.f62758a;
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Unable to fetch autocomplete predictions", exc);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, exc, str3);
                str = str3;
                str2 = str4;
            }
            C17164e<List<d.a>> eVar2 = this.f62759b;
            x.a aVar = x.f139812b;
            eVar2.resumeWith(x.b(y.a(exc)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements C8967h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f62760a;

        e(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f62760a = lVar;
        }

        public final /* synthetic */ void a(Object obj) {
            this.f62760a.invoke(obj);
        }
    }

    public f(a aVar, Ie.a aVar2) {
        C17542s.j(aVar, "googlePlacesClientProvider");
        C17542s.j(aVar2, "analytics");
        this.f62748a = aVar;
        this.f62749b = aVar2;
    }

    private final PlacesClient e() {
        return this.f62748a.b();
    }

    private final AutocompleteSessionToken f() {
        Object value = this.f62750c.getValue();
        C17542s.i(value, "getValue(...)");
        return (AutocompleteSessionToken) value;
    }

    /* access modifiers changed from: private */
    public static final AutocompleteSessionToken g() {
        return AutocompleteSessionToken.newInstance();
    }

    public void a(String str) {
        C17542s.j(str, "componentValue");
        this.f62748a.a(str);
    }

    public Object b(Oe.a aVar, String str, C17164e<? super l> eVar) {
        FetchPlaceRequest build = FetchPlaceRequest.builder(aVar.b(), C16877v.q(Place.Field.NAME, Place.Field.ADDRESS_COMPONENTS)).setSessionToken(f()).build();
        C17170k kVar = new C17170k(C17187b.c(eVar));
        this.f62749b.b(str);
        e().fetchPlace(build).g(new e(new a(this, kVar, aVar))).e(new b(this, kVar, aVar));
        Object a10 = kVar.a();
        if (a10 == C17187b.f()) {
            h.c(eVar);
        }
        return a10;
    }

    public Object c(String str, boolean z10, RectangularBounds rectangularBounds, String str2, String str3, C17164e<? super List<d.a>> eVar) {
        boolean z11 = z10;
        RectangularBounds rectangularBounds2 = rectangularBounds;
        qv.e eVar2 = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str4 = null;
        String str5 = null;
        while (true) {
            if (!it.hasNext()) {
                String str6 = str2;
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str4 == null) {
                String a10 = C11818a.a("Fetching autocomplete predictions for countryCode: " + str2 + ", locationRestriction: " + z11, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str4 = C11820c.a(a10);
            } else {
                String str7 = str2;
            }
            String str8 = str4;
            if (str5 == null) {
                String name = f.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str9 = str5;
            bVar.a(eVar2, str9, false, (Throwable) null, str8);
            str4 = str8;
            str5 = str9;
        }
        if (C15854t.v0(str)) {
            return C16877v.n();
        }
        FindAutocompletePredictionsRequest.Builder query = FindAutocompletePredictionsRequest.builder().setCountries(str2).setTypesFilter(C16877v.e(PlaceTypes.ADDRESS)).setSessionToken(f()).setQuery(str);
        if (z11) {
            query.setLocationRestriction(rectangularBounds2);
        } else {
            query.setLocationBias(rectangularBounds2);
        }
        C17170k kVar = new C17170k(C17187b.c(eVar));
        this.f62749b.c(str3);
        e().findAutocompletePredictions(query.build()).g(new e(new c(kVar))).e(new d(this, kVar));
        Object a11 = kVar.a();
        if (a11 == C17187b.f()) {
            h.c(eVar);
        }
        return a11;
    }
}
