package ru.mirea.prokhorovad.yandexmaps;

import com.yandex.mapkit.MapKitFactory;

import android.app.Application;

public class App extends Application {
    private final String MAPKIT_API_KEY = "1997eec2-baa5-4b6a-a3b4-a9f8d6833259";
    @Override
    public void onCreate() {
        super.onCreate();
        // Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
