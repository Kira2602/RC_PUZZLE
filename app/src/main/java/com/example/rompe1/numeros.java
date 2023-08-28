package com.example.rompe1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class numeros extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, btiniciar, breiniciar;
    String[] base = new String[]{"1","2","3","4","5","6","7","8","X"};

    private TextView tvtime;
    private ImageView ivimg;
    //Variables para el tiempo
    private Handler mHandler = new Handler();
    private long mStartTime;
    private long mTimePaused;
    private boolean mIsRunning = false;
    private static final int REQUEST_CODE_SELECT_IMAGE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
        //Instanciamos
        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);
        b3 = findViewById(R.id.bt3);
        b4 = findViewById(R.id.bt4);
        b5 = findViewById(R.id.bt5);
        b6 = findViewById(R.id.bt6);
        b7 = findViewById(R.id.bt7);
        b8 = findViewById(R.id.bt8);
        b9 = findViewById(R.id.btx);
        breiniciar = findViewById(R.id.btrestart);
        btiniciar =findViewById(R.id.btIniciar);


        Button[] btns = new Button[]{b1,b2,b3,b4,b5,b6,b7,b8,b9};
        ArrayList<Drawable> fondos = new ArrayList<>();

        tvtime = findViewById(R.id.tvTiempo);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("0")) {
                    cambio(b1, b2);
                } else if (b4.getText().toString().equals("0")) {
                    cambio(b1, b4);
                }
                reanudarTime();
                if (isGameWon()) {
                    //pausaTime();
                    alertaAceptar();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("0")) {
                    cambio(b2, b1);
                } else if (b3.getText().toString().equals("0")) {
                    cambio(b2, b3);
                } else if (b5.getText().toString().equals("0")) {
                    cambio(b2, b5);
                }
                reanudarTime();
                if (isGameWon()) {
                    //pausaTime();
                    alertaAceptar();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("0")) {
                    cambio(b3, b2);
                } else if (b6.getText().toString().equals("0")) {
                    cambio(b3, b6);
                }
                reanudarTime();
                if (isGameWon()) {
                    //pausaTime();
                    alertaAceptar();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("0")) {
                    cambio(b4, b1);
                } else if (b5.getText().toString().equals("0")) {
                    cambio(b4, b5);
                } else if (b7.getText().toString().equals("0")) {
                    cambio(b4, b7);
                }
                reanudarTime();
                if (isGameWon()) {
                    //pausaTime();
                    alertaAceptar();
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("0")) {
                    cambio(b5, b2);
                } else if (b4.getText().toString().equals("0")) {
                    cambio(b5, b4);
                } else if (b6.getText().toString().equals("0")) {
                    cambio(b5, b6);
                } else if (b8.getText().toString().equals("0")) {
                    cambio(b5, b8);
                }
                reanudarTime();
                if (isGameWon()) {
                    // pausaTime();
                    alertaAceptar();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("0")) {
                    cambio(b6, b3);
                } else if (b5.getText().toString().equals("0")) {
                    cambio(b6, b5);
                } else if (b9.getText().toString().equals("0")) {
                    cambio(b6, b9);
                }
                reanudarTime();
                if (isGameWon()) {
                    //pausaTime();
                    alertaAceptar();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("0")) {
                    cambio(b7, b4);
                } else if (b8.getText().toString().equals("0")) {
                    cambio(b7, b8);
                }
                reanudarTime();
                if (isGameWon()) {
                    //pausaTime();
                    alertaAceptar();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("0")) {
                    cambio(b8, b5);
                } else if (b7.getText().toString().equals("0")) {
                    cambio(b8, b7);
                } else if (b9.getText().toString().equals("0")) {
                    cambio(b8, b9);
                }
                reanudarTime();
                if (isGameWon()) {
                    //pausaTime();
                    alertaAceptar();
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("0")) {
                    cambio(b9, b6);
                } else if (b8.getText().toString().equals("0")) {
                    cambio(b9, b8);
                }
                reanudarTime();
                if (isGameWon()) {
                    //pausaTime();
                    alertaAceptar();
                }
            }
        });

        breiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ordenar(btns,base);
                aleatorio(btns,fondos);
                reiniciarTime();
                comenzarTime();
            }
        });

        btiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aleatorio(btns,fondos);
                comenzarTime();

            }
        });

       /* btimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fondos.clear();
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, 1);
            }
        });*/
    }

    public void ordenar(Button[] btns, String[] base){
        for(int i=0;i< btns.length;i++){
            btns[i].setText(base[i]);
        }
    }

    public void aleatorio(Button[] btns, ArrayList<Drawable> fondos){
        fondos.clear();
        ordenar(btns,base);
        llenarBack(btns,fondos);
        ArrayList<String> random = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","0"));
        Collections.shuffle(random);
        int aux=0;

        while(!isSolvable(intvec(random))){
            Collections.shuffle(random);
        }

        for(int i=0; i<btns.length;i++){
            if(random.get(i).equals("0")){
                btns[i].setBackground(fondos.get(fondos.size()-1));
            }else{
                aux = Integer.parseInt(random.get(i));
                btns[i].setBackground(fondos.get(aux-1));
            }
            btns[i].setText(random.get(i));
        }
    }

    public int[] intvec(ArrayList<String> random){
        int puzzle[] = new int[random.size()-1];
        for(int i=0;i<random.size()-1;i++){
            puzzle[i] = Integer.parseInt(random.get(i));
        }

        return puzzle;
    }

    private static boolean isSolvable(int[] puzzle) {
        int inversions = 0;
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = i + 1; j < puzzle.length; j++) {
                if (puzzle[i] > puzzle[j] && puzzle[i] != 0 && puzzle[j] != 0) {
                    inversions++;
                }
            }
        }
        return inversions % 2 == 0;
    }

    public void llenarBack(Button[] btns, ArrayList<Drawable> fondos){
        for(int i=0;i<btns.length;i++){
            fondos.add(i,btns[i].getBackground());
        }
    }

    public void cambio(Button button1, Button button2) {
        Drawable bgtmp = button1.getBackground();
        String msgtmp = button1.getText().toString();
        button1.setBackground(button2.getBackground());
        button1.setText(button2.getText());
        button2.setBackground(bgtmp);
        button2.setText(msgtmp);
    }

    public void comenzarTime() {
        if (!mIsRunning) {
            mStartTime = System.currentTimeMillis();
            mHandler.postDelayed(timerRunnable, 0);
            mIsRunning = true;
        }else{
            return;
        }
    }

    /*public void pausaTime() {
        if (mIsRunning) {
            mHandler.removeCallbacks(timerRunnable);
            mTimePaused = System.currentTimeMillis() - mStartTime;
            mIsRunning = false;
        }
    }*/

    public void reanudarTime() {
        if (!mIsRunning) {
            mStartTime = System.currentTimeMillis() - mTimePaused;
            mHandler.postDelayed(timerRunnable, 0);
            mIsRunning = true;
        }else{
            return;
        }
    }

    public void reiniciarTime() {
        mHandler.removeCallbacks(timerRunnable);
        tvtime.setText("00:00");
        mIsRunning = false;
    }

    private boolean isGameWon() {
        Button[] btns = new Button[]{b1, b2, b3, b4, b5, b6, b7, b8, b9};
        for (int i = 0; i < btns.length; i++) {
            if (!btns[i].getText().toString().equals(base[i])) {
                return false;
            }
        }
        return true;
    }

    private Runnable timerRunnable = new Runnable() {
        @Override
        public void run() {
            long currentTime = System.currentTimeMillis() - mStartTime;
            int seconds = (int) (currentTime / 1000);
            int minutes = seconds / 60;
            seconds = seconds % 60;

            tvtime.setText(String.format("%02d:%02d", minutes, seconds));
            mHandler.postDelayed(this, 0);
        }
    };


   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            recortarImg(selectedImage);
        }
    }*/

    public void recortarImg() {
        try {
            //Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedImage);
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.descarga);
            // Convierte el Bitmap a Drawable y guárdalo en un archivo drawable
            Drawable drawable = new BitmapDrawable(getResources(), bitmap);
            ivimg.setImageDrawable(drawable);

            int numberOfPieces = 9;
            int rows = 3;
            int cols = 3;

            int pieceWidth = drawable.getMinimumWidth() / cols;
            int pieceHeight = drawable.getMinimumHeight() / rows;
            int currentIndex = 0;

            Bitmap[] pieces = new Bitmap[numberOfPieces];
            Button[] btns = new Button[]{b1, b2, b3, b4, b5, b6, b7, b8, b9};

            for (int x = 0; x < rows; x++) {
                for (int y = 0; y < cols; y++) {
                    pieces[currentIndex] = Bitmap.createBitmap(bitmap, y * pieceWidth, x * pieceHeight, pieceWidth, pieceHeight);
                    currentIndex++;
                }
            }

            asignarBtn(pieces, btns);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void asignarBtn(Bitmap[] pieces, Button[] btns){
        for (int i=0; i<(pieces.length-1); i++){
            Drawable pieza = new BitmapDrawable(getResources(), pieces[i]);
            btns[i].setBackground(pieza);
        }
    }


    //Para poner una alerta
    void alertaAceptar(){
        AlertDialog.Builder ale1 = new AlertDialog.Builder(this);
        View view = LayoutInflater.from(this).inflate(R.layout.layout_alert, null);
        Button btacept = view.findViewById(R.id.btnAceptar);
        ale1.setView(view);
        ale1.setCancelable(false);

        // Create the AlertDialog object
        AlertDialog dialog = ale1.create();

        btacept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss(); // Dismiss the AlertDialog when the button is clicked
            }
        });

        dialog.show(); // muestra la alerta
    }


}