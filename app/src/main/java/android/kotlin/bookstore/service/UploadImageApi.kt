package android.kotlin.bookstore.service

import android.kotlin.bookstore.model.DefaultResponse
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Query

interface UploadImageApi {
    @Multipart
    @POST("uploadGambarApi.php")
    fun uploadGambar(
        @Part imagename: MultipartBody.Part,
        @Query("function") function: String
    ): Call<DefaultResponse>
}