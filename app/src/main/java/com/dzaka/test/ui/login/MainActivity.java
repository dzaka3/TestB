package com.dzaka.test.ui.login;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.dzaka.test.R;
import com.dzaka.test.data.model.UserAccountRequestDto;
import com.dzaka.test.utils.Api;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.JsonObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
//    @BindView(R.id.toolbar)
//    Toolbar toolbar;
//    @BindView(R.id.username)
//    EditText username;
//    @BindView(R.id.password)
//    EditText password;
//    @BindView(R.id.login)
//    Button login;
//    @BindView(R.id.loading)
//    ProgressBar loading;
//    @BindView(R.id.fab)
//    FloatingActionButton fab;
//    private UserAccountRequestDto userAccountRequestDto;
//    private final String TAG = "LoginAct";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//        postRegister();
//    }
//
//    private void postRegister() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://18.141.178.15:8080/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        JsonObject jsonObject = new JsonObject();
//        jsonObject.addProperty("email", userAccountRequestDto.email);
//        jsonObject.addProperty("password", userAccountRequestDto.password);
//        jsonObject.addProperty("username", userAccountRequestDto.username);
//
//        Api service = retrofit.create(Api.class);
//        Call<UserAccountRequestDto> call = service.postRegister(jsonObject);
//        //calling the api
//        call.enqueue(new Callback<UserAccountRequestDto>() {
//            @Override
//            public void onResponse(Call<UserAccountRequestDto> call, Response<UserAccountRequestDto> response) {
//                if (response.isSuccessful()) {
//                    Log.d(TAG, "onResponse() returned: " + response.body().toString());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<UserAccountRequestDto> call, Throwable t) {
//
//            }
//        });
//    }

}
