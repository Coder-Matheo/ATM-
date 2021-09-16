package rob.myappcompany.atmtraining;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class AmountViewModel extends ViewModel {

    private MutableLiveData<Double> amountNum;
    private MutableLiveData<Double> payoutNum;
    private MutableLiveData<Double> depositNum;

    private ArrayList<transationStruc> getNum = new ArrayList<transationStruc>();
    MutableLiveData<List<transationStruc>> getList = new MutableLiveData<>();



    public MutableLiveData<Double> getAmountNum() {
        getNum.set(1,new transationStruc(11,"asdf"));
        getList.postValue(getNum);

        Log.i("TAG", getList.getValue().get(0).getMessage());
        if (amountNum == null){
            amountNum = new MutableLiveData<>();
            amountNum.setValue((double) 1000);

        }

        return amountNum;
    }



    public MutableLiveData<Double> payoutFun(double moneyPayout){

        payoutNum = new MutableLiveData<>();
        payoutNum.setValue((double) amountNum.getValue());

        if (amountNum.getValue() == null){
            amountNum = new MutableLiveData<>();
            amountNum.setValue(0.0);
        }
        if(moneyPayout > amountNum.getValue() ){
            Log.i("TAG", "You haven't enough Money, your Account have "+ amountNum.getValue());
            return payoutNum;
        }else {
            amountNum.setValue((double) (amountNum.getValue() - moneyPayout));
        }
        return payoutNum;
    }


    public MutableLiveData<Double> deposit_fun(double moneyDeposit){
        depositNum = new MutableLiveData<>();
        payoutNum.setValue((double) amountNum.getValue());

        if (amountNum.getValue() == null){
            amountNum = new MutableLiveData<>();
            amountNum.setValue(0.0);
        }
        if(moneyDeposit > amountNum.getValue() ){
            Log.i("TAG", "You haven't enough Money, your Account have "+ amountNum.getValue());
            return payoutNum;
        }else {
            amountNum.setValue((double) (amountNum.getValue() - moneyDeposit));
        }
        return payoutNum;
    }










}
