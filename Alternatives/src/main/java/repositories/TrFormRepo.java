package repositories;

import models.TrForm;

import java.util.List;

public interface TrFormRepo {

    TrForm addTrForm(TrForm trfObj);
    TrForm getTrForm(TrForm trfObj);
    List<TrForm> getAllTrForms();
    TrForm updateTrForm(TrForm trfObj);
    TrForm deleteTrForm(TrForm trfObj);

}
