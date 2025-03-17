package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import xa.C8971l;

public interface PlacesClient {
    @RecentlyNonNull
    C8971l<FetchPhotoResponse> fetchPhoto(@RecentlyNonNull FetchPhotoRequest fetchPhotoRequest);

    @RecentlyNonNull
    C8971l<FetchPlaceResponse> fetchPlace(@RecentlyNonNull FetchPlaceRequest fetchPlaceRequest);

    @RecentlyNonNull
    C8971l<FindAutocompletePredictionsResponse> findAutocompletePredictions(@RecentlyNonNull FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    @RecentlyNonNull
    C8971l<FindCurrentPlaceResponse> findCurrentPlace(@RecentlyNonNull FindCurrentPlaceRequest findCurrentPlaceRequest);

    @RecentlyNonNull
    C8971l<IsOpenResponse> isOpen(@RecentlyNonNull IsOpenRequest isOpenRequest);
}
