package io.toyproject.bookjeokclone.book.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.toyproject.bookjeokclone.book.api.AladinApi;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

@Configuration
@Slf4j
public class AladinConfig {

    private static final HttpLoggingInterceptor loggingInterceptor
            = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    private final Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    @Bean
    public AladinApi aladinApi() {

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(2, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build();

        return new Retrofit.Builder()
                .baseUrl("http://www.aladin.co.kr")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build()
                .create(AladinApi.class);
    }

}
