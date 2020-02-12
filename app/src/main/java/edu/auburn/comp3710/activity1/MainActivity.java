package edu.auburn.comp3710.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtKm, txtMi, txtKg, txtLbs, txtL, txtG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtKm = findViewById(R.id.txtKm);
        txtMi = findViewById(R.id.txtMi);
        txtKg = findViewById(R.id.txtKg);
        txtLbs = findViewById(R.id.txtLbs);
        txtL = findViewById(R.id.txtL);
        txtG = findViewById(R.id.txtG);


        txtF.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strF = s.toString();
                        Log.i("UnitConverter", "Value in txtF = " + strF);

                        if (!txtF.isFocused())
                            return;
                        if (strF.length() == 0)
                            return;


                        try {
                            double valF = Double.parseDouble(strF);
                            double valC = (valF - 32.0)*5/9;
                            String strC = Double.toString(valC);
                            Log.i("UnitConverter", "Value in txtC = " + strC);

                            MainActivity.this.txtC.setText(strC);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );


        txtC.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strC = s.toString();
                        Log.i("UnitConverter", "Value in txtC = " + strC);

                        if (!txtC.isFocused())
                            return;
                        if (strC.length() == 0)
                            return;

                        try {
                            double valC = Double.parseDouble(strC);
                            double valF = valC*9/5 + 32;
                            String strF = Double.toString(valF);
                            Log.i("UnitConverter", "Value in txtF = " + strF);

                            MainActivity.this.txtF.setText(strF);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );


        txtKm.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strKm = s.toString();
                        Log.i("UnitConverter", "Value in txtKm = " + strKm);

                        if (!txtKm.isFocused())
                            return;
                        if (strKm.length() == 0)
                            return;


                        try {
                            double valKm = Double.parseDouble(strKm);
                            double valMi = (valKm/1.6093);
                            String strMi = Double.toString(valMi);
                            Log.i("UnitConverter", "Value in txtM = " + strMi);

                            MainActivity.this.txtMi.setText(strMi);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );


        txtMi.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strMi = s.toString();
                        Log.i("UnitConverter", "Value in txtMi = " + strMi);

                        if (!txtMi.isFocused())
                            return;
                        if (strMi.length() == 0)
                            return;


                        try {
                            double valMi = Double.parseDouble(strMi);
                            double valKm = (valMi * 1.62137);
                            String strKm = Double.toString(valKm);
                            Log.i("UnitConverter", "Value in txtKm = " + strKm);

                            MainActivity.this.txtKm.setText(strKm);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );


        txtKg.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strKg = s.toString();
                        Log.i("UnitConverter", "Value in txtKg = " + strKg);

                        if (!txtKg.isFocused())
                            return;
                        if (strKg.length() == 0)
                            return;


                        try {
                            double valKg = Double.parseDouble(strKg);
                            double valLbs = (valKg * 2.2046226218);
                            String strLbs = Double.toString(valLbs);
                            Log.i("UnitConverter", "Value in txtLbs = " + strLbs);

                            MainActivity.this.txtLbs.setText(strLbs);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );


        txtLbs.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strLbs = s.toString();
                        Log.i("UnitConverter", "Value in txtLbs = " + strLbs);

                        if (!txtLbs.isFocused())
                            return;
                        if (strLbs.length() == 0)
                            return;


                        try {
                            double valLbs = Double.parseDouble(strLbs);
                            double valKg = (valLbs/2.2046226218);
                            String strKg = Double.toString(valKg);
                            Log.i("UnitConverter", "Value in txtKg = " + strKg);

                            MainActivity.this.txtKg.setText(strKg);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );


        txtL.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strL = s.toString();
                        Log.i("UnitConverter", "Value in txtL = " + strL);

                        if (!txtL.isFocused())
                            return;
                        if (strL.length() == 0)
                            return;


                        try {
                            double valL = Double.parseDouble(strL);
                            double valG = (valL/3.785);
                            String strG = Double.toString(valG);
                            Log.i("UnitConverter", "Value in txtG = " + strG);

                            MainActivity.this.txtG.setText(strG);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );


        txtG.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strG = s.toString();
                        Log.i("UnitConverter", "Value in txtG = " + strG);

                        if (!txtG.isFocused())
                            return;
                        if (strG.length() == 0)
                            return;


                        try {
                            double valG = Double.parseDouble(strG);
                            double valL = (valG * 3.785);
                            String strL = Double.toString(valL);
                            Log.i("UnitConverter", "Value in txtL = " + strL);

                            MainActivity.this.txtL.setText(strL);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

    }
}
