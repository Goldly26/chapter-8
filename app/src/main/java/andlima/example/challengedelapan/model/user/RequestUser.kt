package andlima.example.challengedelapan.model.user

import com.google.gson.annotations.SerializedName

data class RequestUser(
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("avatar")
    val avatar: String
)
