package dev.riv.trms.models_dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmpMessageDTO {

    private int empMessageId;
    private String empEmailSender;
    private String empEmailReceiver;
    private String messageContent;
}
