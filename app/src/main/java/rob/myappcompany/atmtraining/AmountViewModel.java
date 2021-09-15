package rob.myappcompany.atmtraining;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AmountViewModel extends ViewModel {

    private MutableLiveData<Integer> amountNum;

    public MutableLiveData<Integer> getAmountNum() {
        if (amountNum == null){
            amountNum = new MutableLiveData<>();
            amountNum.setValue(1000);
        }

        return amountNum;
    }





}
