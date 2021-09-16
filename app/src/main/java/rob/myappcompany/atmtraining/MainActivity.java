package rob.myappcompany.atmtraining;
//android.useAndroidX=true
//android.enableJetifier=true

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    private Button auszahlung_Btn;
    private Button einzahlung_Btn;
    private Button kontoauszug_Btn;
    private Button kontostand_Btn;
    private Button press_Btn;

    AmountViewModel amountViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        auszahlung_Btn = findViewById(R.id.auszahlung_Btn);
        einzahlung_Btn = findViewById(R.id.einzahlung_Btn);
        kontoauszug_Btn = findViewById(R.id.kontoauszug_Btn);
        kontostand_Btn = findViewById(R.id.kontostand_Btn);
        press_Btn = findViewById(R.id.press_Btn);




        amountViewModel = ViewModelProviders.of(this).get(AmountViewModel.class);

        amountViewModel.getAmountNum().observe(this, new Observer<Double>() {
            @Override
            public void onChanged(Double aDouble) {
                textView.setText(amountViewModel.getAmountNum().getValue().toString());
            }
        });


        press_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                payout_fun();

            }
        });

    }

    private void payout_fun() {
        amountViewModel.payoutFun(100);

    }



}