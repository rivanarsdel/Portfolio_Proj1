package services;

import models.TrForm;

import java.util.List;

public interface TrFormService {

    TrForm addTrForm(TrForm trfObj);
    TrForm getTrForm(TrForm trfObj);
    List<TrForm> getAllTrForms();
    TrForm updateTrForm(TrForm trfObj);
    TrForm deleteTrForm(TrForm trfObj);

}
