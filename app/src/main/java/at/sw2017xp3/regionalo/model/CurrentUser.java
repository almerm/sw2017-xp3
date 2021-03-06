package at.sw2017xp3.regionalo.model;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

import at.sw2017xp3.regionalo.util.HttpUtils;
import at.sw2017xp3.regionalo.util.Installation;
import at.sw2017xp3.regionalo.util.JsonObjectMapper;

/**
 * Created by Kevin on 03.05.2017.
 */

public class CurrentUser {
    private static String current_user_id_;

    public static void Init(Context context) {
        current_user_id_ = Installation.id(context);
    }

    public static String getId() {
        return current_user_id_;
    }
}
