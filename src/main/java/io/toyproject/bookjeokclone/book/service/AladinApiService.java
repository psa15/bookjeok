package io.toyproject.bookjeokclone.book.service;

import io.toyproject.bookjeokclone.book.api.AladinApi;
import io.toyproject.bookjeokclone.book.model.dto.AladinApiRequest;
import io.toyproject.bookjeokclone.book.model.dto.AladinApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class AladinApiService {

    private final AladinApi aladinApi;

    public AladinApiResponse searchBook(AladinApiRequest request) throws IOException{
        Map<String, String> options = new HashMap<>();
        options.put("TTBKey", "ttbduwjstk10931727001");
        options.put("Output", request.getOutput());
        options.put("Version", request.getVersion());
        options.put("Query", request.getQuery());
        Call<AladinApiResponse> call = aladinApi.search(options);

        Response<AladinApiResponse> response = call.execute();
        if (!response.isSuccessful()) {
            log.debug("error =====> {}", response.errorBody());
        }
        log.debug(" 성공? body: {},", response.body());

        return response.body();
    }
    public AladinApiResponse search() throws IOException {
        String output = "js";
        String Version = "20131101";
        Map<String, String> options = new HashMap<>();
        options.put("TTBKey", "ttbduwjstk10931727001");
        options.put("Output", output);
        options.put("Version", Version);
        options.put("Query", "종이학");
        Call<AladinApiResponse> call = aladinApi.search(options);

        Response<AladinApiResponse> response = call.execute();
        if (!response.isSuccessful()) {
            log.debug("error =====> {}", response.errorBody());
        }
        log.debug(" 성공? body: {},", response.body());
        System.out.println(" 성공? body: {},"+ response.body());

        return response.body();
    }
}
