package io.toyproject.bookjeokclone.book.api;

import io.toyproject.bookjeokclone.book.model.dto.AladinApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface AladinApi {

    @GET("/ttb/api/ItemSearch.aspx")
    Call<AladinApiResponse> search(@QueryMap Map<String, String> options);

}
