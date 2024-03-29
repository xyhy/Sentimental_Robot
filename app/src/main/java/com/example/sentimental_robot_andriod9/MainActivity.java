package com.example.sentimental_robot_andriod9;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.nuwarobotics.lib.visual.model.FaceData;
import com.nuwarobotics.lib.visual.model.Recognition;
import com.nuwarobotics.service.agent.NuwaRobotAPI;
import com.nuwarobotics.service.camera.common.Constants;
import com.nuwarobotics.service.camera.common.CsDebug;
import com.nuwarobotics.service.camera.sdk.CameraSDK;
import com.nuwarobotics.service.camera.sdk.OutputData;
import com.nuwarobotics.utils.Debug;

public class MainActivity extends AppCompatActivity {
    private NuwaRobotAPI mRobot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}